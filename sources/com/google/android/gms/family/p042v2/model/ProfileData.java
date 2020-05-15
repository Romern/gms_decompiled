package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.ProfileData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProfileData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqu();

    /* renamed from: a */
    public String f31458a;

    /* renamed from: b */
    public String f31459b;

    /* renamed from: c */
    public String f31460c;

    /* renamed from: d */
    public String f31461d;

    /* renamed from: e */
    public String f31462e;

    /* renamed from: f */
    public BirthdayData f31463f;

    public ProfileData() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31458a);
        parcel.writeString(this.f31459b);
        parcel.writeString(this.f31460c);
        parcel.writeString(this.f31461d);
        parcel.writeString(this.f31462e);
        parcel.writeParcelable(this.f31463f, i);
    }

    public ProfileData(Parcel parcel) {
        this.f31458a = parcel.readString();
        this.f31459b = parcel.readString();
        this.f31460c = parcel.readString();
        this.f31461d = parcel.readString();
        this.f31462e = parcel.readString();
        this.f31463f = (BirthdayData) parcel.readParcelable(BirthdayData.class.getClassLoader());
    }
}
