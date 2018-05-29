//
//  ViewController.swift
//  ios
//
//  Created by Kevin Galligan on 3/19/18.
//  Copyright © 2018 Kevin Galligan. All rights reserved.
//

import UIKit
import j2objclib
import RxSwift

class ViewController: UIViewController {

    let disposeBag = DisposeBag()

    let alamoFireService = AlamoFireService()

    let breweryDecoder = SHBreweryDecoder()!


    @IBOutlet weak var uuidOut: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()

        Single.zip(alamoFireService.getBreweries().asSingle(), alamoFireService.getBeers().asSingle(), resultSelector: { [weak self] (breweries, beers) -> JavaUtilList? in

            return self?.breweryDecoder.combineFromJson(with: breweries, with: beers)

        }).subscribe({ [weak self] (event) in

            switch event {
            case .success(let element):
                
                var result = ""
                
                if let object = element {
                    
                    for i in jint(0)...object.size() {
                        let brewery = object.getWith(i) as! SHBrewery
                        result = result + "\n" + brewery.description
                    }
                    
                }
                
                self?.uuidOut.text = result

            case .error(let error):

                debugPrint(error.localizedDescription)
                self?.uuidOut.text = error.localizedDescription
            
            }

        }).disposed(by: disposeBag)

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

}

