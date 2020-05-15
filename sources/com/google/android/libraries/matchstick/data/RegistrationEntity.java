package com.google.android.libraries.matchstick.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegistrationEntity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azdk();

    /* renamed from: a */
    public LocalEntityId f111077a;

    /* renamed from: b */
    public ArrayList f111078b;

    /* renamed from: c */
    private Bitmap f111079c;

    public RegistrationEntity() {
        this.f111079c = null;
        this.f111077a = null;
        this.f111078b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f111079c, 0);
        parcel.writeParcelable(this.f111077a, 0);
        parcel.writeList(this.f111078b);
    }

    public RegistrationEntity(Parcel parcel) {
        this.f111079c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f111077a = (LocalEntityId) parcel.readParcelable(LocalEntityId.class.getClassLoader());
        ArrayList readArrayList = parcel.readArrayList(LocalEntityId.class.getClassLoader());
        this.f111078b = new ArrayList(readArrayList.size());
        int size = readArrayList.size();
        for (int i = 0; i < size; i++) {
            this.f111078b.add((LocalEntityId) readArrayList.get(i));
        }
    }
}
