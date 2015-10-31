public class KoordinatGPS
{
  private Double lintang;
  private Double bujur;
  
  public KoordinatGPS(){
   this.bujur = new Double(0.0);
     this.lintang = new Double(0.0);
    }
  public KoordinatGPS(double bujur, double lintang){
      this.bujur=bujur;
      this.lintang=lintang;
    }
    
   public KoordinatGPS(Double bujur, Double lintang){
      this.bujur=bujur;
      this.lintang=lintang;
    }
    
   public Double lintang(){
    return lintang;}
    
   public Double bujur(){
    return bujur;}
}
