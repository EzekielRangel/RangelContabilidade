package Menu;

public class Address {

        private String roadName;
        private Integer houseNum;
        private String district;
        private String city;
        private String estate;

		public Address(){

        }

        //addres cronstuctor
        public Address(String roqdName, Integer houseNum, String bairro, String city, String estate){

        }

        public String getRoadName() { return roadName; }
        public void setRoadName(String roadName) { this.roadName = roadName; }

        public Integer getHouseNum() { return houseNum; }
        public void setHouseNum(Integer houseNum) { this.houseNum = houseNum; }

        public String getDistrict() { return district; }
        public void setDistrict(String bairro) { this.district = bairro; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        public String getEstate() { return estate; }
        public void setEstate(String estate) { this.estate = estate; }
}
