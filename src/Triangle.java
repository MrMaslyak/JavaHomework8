class Triangle {
    private  double slideA;
    private  double slideB;
    private  double slideC;

    public Triangle(double slideA, double slideB, double slideC) {
        this.slideA = slideA;
        this.slideB = slideB;
        this.slideC = slideC;
    }

    public void imageSlides(){
    System.out.println("Slide A"  + " " + slideA);
    System.out.println("Slide B"  + " " + slideB);
    System.out.println("Slide C"  + " " + slideC);
}
    public double sSlides(){
  return slideA * slideB * slideC;
    }
    public double sumSlides(){
        return slideA + slideB + slideC;
    }

}
