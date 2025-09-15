package model;

public class Member {
    private int id;
    private String name;
    private int masaAktifBulan;

    public Member(int id, String name, int masaAktifBulan) {
        this.id = id;
        this.name = name.trim();
        this.masaAktifBulan = masaAktifBulan;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMasaAktifBulan() { return masaAktifBulan; }

    public void setName(String name) { this.name = name.trim(); }
    public void setMasaAktifBulan(int bulan) { this.masaAktifBulan = bulan; }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', masaAktif=" + masaAktifBulan + " bulan}";
    }
}
