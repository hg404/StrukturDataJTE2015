public class Gaya
{
  private Vector3D  titikAcuan;
  private Vector3D  arah;
  
  public Gaya( Vector3D  titikAcuan , Vector3D  arah){
      this.titikAcuan=titikAcuan;
       this.arah=arah;
    }
    public Vector3D getTitikAcuan(){
        return this.titikAcuan;
    }
     public Vector3D getArah(){
        return this.arah;
    }
}
