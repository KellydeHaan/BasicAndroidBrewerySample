//
//  ViewController.swift
//  iosTestOnly
//
//  Created by Kevin Galligan on 3/22/18.
//  Copyright © 2018 Kevin Galligan. All rights reserved.
//

import UIKit
import testj2objclib

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        CoTouchlabDopplTestingDopplJunitTestHelper.runResource(with: "j2objcTests.txt")
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

