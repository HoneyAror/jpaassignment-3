package com.example.associations.onetomany.entities;

import javax.persistence.Embeddable;

@Embeddable//this class not entity of its own but is embedded in other class
public class Address {

        private  String streetnumber;
        private String location;
        private  String state;

        public String getStreetnumber() {
            return streetnumber;
        }

        public void setStreetnumber(String streetnumber) {
            this.streetnumber = streetnumber;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getstate() {
            return state;
        }

        public void setstate(String state) {
            this.state = state;
        }
    }

