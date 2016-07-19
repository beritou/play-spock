package com.xyz.groovy

import geb.spock.GebSpec

class TestGeb extends GebSpec {

    def "add one plus one"() {
        expect:
        Math.addExact(1, 1) == 2
    }
}