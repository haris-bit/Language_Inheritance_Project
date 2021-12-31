public class Mayan extends Language {
    public Mayan(String name, int speakers) {
      super(name, speakers, "Central America","verb-object-subject");
    }
  
    @Override
    public void getInfo() {
      System.out.println(String.format("%s is spoken by %s people mainly in %s. The language follows the word order: %s\nFun fact: %s is an ergative language.", name, numSpeakers, regionsSpoken, wordOrder, name));
    }
  }