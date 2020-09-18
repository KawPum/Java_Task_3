package ru.mirea.diro.ikbo1919;

public class Main {

    public static class Circle{
        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        private int radius;

        public Circle(){
            this.radius = 5;
        }

        public Circle(int new_radius){
            this.radius = new_radius;
        }

        @Override
        public String toString() {
            return "Radius of this circle equals " + this.radius;
        }
    }

    public static class Human{
        private Head head;
        private Leg leg;
        private Hand hand;

        public Head getHead() {
            return head;
        }

        public void setHead(Head head) {
            this.head = head;
        }

        public Leg getLeg() {
            return leg;
        }

        public void setLeg(Leg leg) {
            this.leg = leg;
        }

        public Hand getHand() {
            return hand;
        }

        public void setHand(Hand hand) {
            this.hand = hand;
        }

        public Human(){
            head = new Head();
            leg = new Leg();
            hand = new Hand();
        }

        @Override
        public String toString() {
            return this.head.toString() + "\n" + this.leg.toString() + "\n" + this.hand.toString();
        }
    }

    public static class Head{
        private String illnesses;
        private int circumference; //cm, окружность

        public String getIllnesses() {
            return illnesses;
        }

        public void setIllnesses(String illnesses) {
            this.illnesses = illnesses;
        }

        public int getCircumference() {
            return circumference;
        }

        public void setCircumference(int radius) {
            this.circumference = radius;
        }

        public Head(){
            this.illnesses = "none";
            this.circumference = 58;
        }

        public Head(String new_illnesses, int new_circumference){
            this.illnesses = new_illnesses;
            this.circumference = new_circumference;
        }

        @Override
        public String toString() {
            return "Head has following illnesses: " + illnesses + ". It has a circumference of " + circumference + "cm.";
        }
    }

    public static class Leg{
        private String illnesses;
        private int length; //cm

        public String getIllnesses() {
            return illnesses;
        }

        public void setIllnesses(String illnesses) {
            this.illnesses = illnesses;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public Leg(){
            this.illnesses = "none";
            this.length = 100;
        }

        public Leg(String new_illnesses, int new_length){
            this.illnesses = new_illnesses;
            this.length = new_length;
        }

        @Override
        public String toString() {
            return "Leg has following illnesses: " + illnesses + ". It has a length of " + length + "cm.";
        }
    }

    public static class Hand{
        private String illnesses;
        private int length; //cm

        public String getIllnesses() {
            return illnesses;
        }

        public void setIllnesses(String illnesses) {
            this.illnesses = illnesses;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public Hand(){
            this.illnesses = "none";
            this.length = 85;
        }

        public void Hand(String new_illnesses, int new_length){
            this.illnesses = new_illnesses;
            this.length = new_length;
        }

        @Override
        public String toString() {
            return "Hand has following illnesses: " + illnesses + ". It has a length of " + length + "cm.";
        }
    }

    public static void main(String[] args) {
	    Circle circle = new Circle(7);
	    System.out.println(circle);
	    Human Bob = new Human();
	    Bob.getLeg().setLength(115);
	    Bob.getHead().setCircumference(62);
	    Bob.getHand().setIllnesses("cancer");
	    System.out.println(Bob);
    }
}

