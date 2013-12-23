package com.thoughtworks.sbe

class GreetingFor {
  def greetingFor(firstName: String) = {
    String.format("Hello %s!", firstName)
  }
}
