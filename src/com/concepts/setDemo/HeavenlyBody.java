package com.concepts.setDemo;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
//    private final Set<HeavenlyBody> satellites = new HashMap<>();

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void getSatellites() {
//        return new HashSet<>(this.satellites);
        return ;
    }

    public boolean addMoon(HeavenlyBody moon){
//        return this.satellites.add(moon);
        return false;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
