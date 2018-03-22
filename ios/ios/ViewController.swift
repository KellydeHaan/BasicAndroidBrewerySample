//
//  ViewController.swift
//  ios
//
//  Created by Kevin Galligan on 3/19/18.
//  Copyright © 2018 Kevin Galligan. All rights reserved.
//

import UIKit
import j2objclib

class ViewController: UIViewController {

    @IBOutlet weak var uuidOut: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        uuidOut.text = SHUUIDMaker.makeUUID()
        let dog = SHDog.init()!
        
        dog.setNameWith("Binky")
        dog.setAgeWith(9)
        dog.setLikesBelliesWithBoolean(true)
        
        let dogJson = SHDogFactory.fromDog(with: dog)
        print(dogJson)
        
        let dog2 = SHDogFactory.fromJson(with: dogJson)
        
        print(dog2.getName())
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

