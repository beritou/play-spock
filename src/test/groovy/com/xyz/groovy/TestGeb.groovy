package com.xyz.groovy

import geb.spock.GebSpec

class TestGeb extends GebSpec {
//    def "go to local"() {
//        when:
//        go "http://localhost:8080"
//
//        then:
//        title == "title!"
//    }

    def "let's try this!"() {
        expect:
        Math.max(1, 2) == 2
    }

    def "and let's try this!"() {
        expect:
        Math.max(10, 20) == 20
    }
}

