package com.thoughtworks.sbe.concordion.sample.spec

import org.junit.runner.RunWith
import org.concordion.integration.junit4.ConcordionRunner
import com.thoughtworks.sbe.GreetingFor

@RunWith(classOf[ConcordionRunner])
class DemoScalaTest {

  def greetingFor(firstName: String) = {
    new GreetingFor().greetingFor(firstName);
  }

}
