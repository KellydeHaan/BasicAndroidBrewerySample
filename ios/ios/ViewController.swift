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
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

