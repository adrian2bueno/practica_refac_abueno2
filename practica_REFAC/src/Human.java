//REFACT5
class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;
    public String obtenirAdrecaCompleta() {

//REFACT6:  Inline Temp
//          Treure la variable result perquè es redundant
/*      StringBuilder result = new StringBuilder();
        return result
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString(); */

        return  country +
                ", " +
                city +
                ", " +
                street +
                ", " +
                house +
                " " +
                quarter;
    }
}
