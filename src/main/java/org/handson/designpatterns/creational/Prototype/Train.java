package org.handson.designpatterns.creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class Train implements Cloneable {

    private String source;
    private String destination;
    private List<Compartment> compartmentList;

    @Override
    public Object clone() throws CloneNotSupportedException {
        //Create a deep clone of compartment list.
        List<Compartment> compartmentListClone = new ArrayList<>();
        List<Object> compartmentListclone = this.compartmentList.stream().map(compartment -> {
            try {
                return compartment.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
        return new Train(this.source, this.destination, compartmentListClone);
    }



    @AllArgsConstructor
    protected class Compartment implements Cloneable {
        private int length;
        private int width;

        @Override
        public Object clone() throws CloneNotSupportedException {
            return new Compartment(this.length, this.width);
        }

        @Override
        public String toString() {
            return "Compartment{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }
    }
}
