package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Command implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR = new flf();

    /* renamed from: a */
    public String f9487a;

    /* renamed from: b */
    public String f9488b;

    /* renamed from: c */
    private String f9489c;

    @Deprecated
    public Command() {
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9487a);
        parcel.writeString(this.f9489c);
        parcel.writeString(this.f9488b);
    }

    @Deprecated
    public Command(Parcel parcel) {
        this.f9487a = parcel.readString();
        this.f9489c = parcel.readString();
        this.f9488b = parcel.readString();
    }
}
