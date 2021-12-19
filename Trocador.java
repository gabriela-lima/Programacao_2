class Trocador <T>
{
  T x, y;
  public T Primeira()
  {
    return x;
  }
  public T Segundo()
  {
    return y;
  }
  public void Troca()
  {
    T a = x;
    x = y;
    y = a;
  }
}
class Main {
  public static void main(String[] args) {
   Troca();
  }
}
