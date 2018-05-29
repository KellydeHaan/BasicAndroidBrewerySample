//
//  AlamoFireService.swift
//  ios
//
//  Created by Kelly de Haan on 28/05/2018.
//  Copyright © 2018 Kevin Galligan. All rights reserved.
//

import Foundation
import RxSwift
import Alamofire
import RxAlamofire
import j2objclib

class AlamoFireService {

    func getBreweries() -> Observable<String> {

        return RxAlamofire.requestString(.get, "\(SHUrls.endpoint()!)\(SHUrls.brewery()!)").map({result in return result.1} )

    }

    func getBeers() -> Observable<String> {

        return RxAlamofire.requestString(.get, "\(SHUrls.endpoint()!)\(SHUrls.beer()!)").map({result in return result.1})
        

    }

}