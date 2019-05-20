package four

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }

    void "test construction"() {
        given:
            Person p = new Person(firstName: "Dierk")

        expect:"validation fails on empty person"
            p.validate()
    }
}
