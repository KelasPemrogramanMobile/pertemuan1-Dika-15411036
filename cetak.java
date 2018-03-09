public class cetak{

  public static void main(String[] args) {

    sapi obj = new sapi();

    obj.tampilsuara();
    obj.gerakanbinatang();
    obj.methodSuaraSapi();
    obj.methodcaragerak();

    kambing obj2 = new kambing();

    obj2.tampilsuara();
    obj2.gerakanbinatang();
    obj2.methodSuaraKambing();

    kucing obj3 = new kucing();

    obj3.tampilsuara();
    obj3.gerakanbinatang();
    obj3.methodSuaraKucing();
  }
}
