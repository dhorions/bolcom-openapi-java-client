package com.bol.openapi

import spock.lang.Specification

class QueryIncludeAttributesSpec extends Specification {

    def 'Can include attributes'() {
        given:
        def includeAttributes = QueryIncludeAttribute.builder().include()

        expect:
        includeAttributes.toString() == 'true'
    }

    def 'Can exclude attributes'() {
        given:
        def includeAttributes = QueryIncludeAttribute.builder().exclude()

        expect:
        includeAttributes.toString() == 'false'
    }
}
