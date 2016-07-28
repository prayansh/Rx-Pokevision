package com.prayansh.rx.pokevision.models;

/**
 * Created by Prayansh on 2016-07-25.
 */

import java.util.ArrayList;
import java.util.List;

public class PokeData {

    private String status;
    private String jobStatus;
    private List<Pokemon> pokemon = new ArrayList<>();


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public String toString() {
        return "PokeData{" +
                "status='" + status + '\'' +
                ", jobStatus='" + jobStatus + '\'' +
                ", pokemon=" + pokemon +
                '}';
    }

    public class Pokemon {

        private Integer id;
        private Integer expiration_time;
        private Integer pokemonId;
        private Double latitude;
        private Double longitude;
        private Boolean isAlive;

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The expiration_time
         */
        public Integer getExpiration_time() {
            return expiration_time;
        }

        /**
         * @param expiration_time The expiration_time
         */
        public void setExpiration_time(Integer expiration_time) {
            this.expiration_time = expiration_time;
        }

        /**
         * @return The pokemonId
         */
        public Integer getPokemonId() {
            return pokemonId;
        }

        /**
         * @param pokemonId The pokemonId
         */
        public void setPokemonId(Integer pokemonId) {
            this.pokemonId = pokemonId;
        }

        /**
         * @return The latitude
         */
        public Double getLatitude() {
            return latitude;
        }

        /**
         * @param latitude The latitude
         */
        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        /**
         * @return The longitude
         */
        public Double getLongitude() {
            return longitude;
        }

        /**
         * @param longitude The longitude
         */
        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        /**
         * @return The isAlive
         */
        public Boolean getIsAlive() {
            return isAlive;
        }

        /**
         * @param isAlive The is_alive
         */
        public void setIsAlive(Boolean isAlive) {
            this.isAlive = isAlive;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", expiration_time=" + expiration_time +
                    ", pokemonId=" + pokemonId +
                    ", latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", isAlive=" + isAlive +
                    '}';
        }
    }
}
