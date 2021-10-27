#Autor: Alejandro
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser     | strPassword   |
    | 16078823    | Choucair2021* |
    When he search for the course Guías Técnicas on the choucair academy platform
    Then he finds the course called resources Guías Técnicas - Analista Financial
