public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
  
    public Language(String langName, int speakers, String regions, String wdOrder) {
      this.name = langName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = wdOrder;
    }
  
    public void getInfo() {
      // System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder + ".");
      System.out.println(String.format("%s is spoken by %s people mainly in %s. The language follows the word order: %s.", name, numSpeakers, regionsSpoken, wordOrder));
    }
  
    public static void main(String[] args) {
      Language spanish = new Language("Spanish", 555000000, "Spain", "subject-verb-object");
      // spanish.getInfo();
      Mayan chontal = new Mayan("Chontal", 36810);
      // chontal.getInfo();
  
      SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 12222);
      SinoTibetan burmese = new SinoTibetan("Burmese", 99999);
  
      mandarin.getInfo();
      burmese.getInfo();
  
  
  
  
    }
  }