package org.com.ramadan;

import android.os.Parcel;
import android.os.Parcelable;

public class Resep implements Parcelable {
private String nama_makanan;
private String deskripsi_makanan;
private String photo;
private String resep;

    public Resep() {

    }


    protected Resep(Parcel in) {
        nama_makanan = in.readString();
        deskripsi_makanan = in.readString();
        photo = in.readString();
        resep = in.readString();
    }

    public static final Creator<Resep> CREATOR = new Creator<Resep>() {
        @Override
        public Resep createFromParcel(Parcel in) {
            return new Resep(in);
        }

        @Override
        public Resep[] newArray(int size) {
            return new Resep[size];
        }
    };

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getDeskripsi_makanan() {
        return deskripsi_makanan;
    }

    public void setDeskripsi_makanan(String deskripsi_makanan) {
        this.deskripsi_makanan = deskripsi_makanan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama_makanan);
        dest.writeString(deskripsi_makanan);
        dest.writeString(photo);
        dest.writeString(resep);
    }
}
