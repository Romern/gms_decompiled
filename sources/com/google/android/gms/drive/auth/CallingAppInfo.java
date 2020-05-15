package com.google.android.gms.drive.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallingAppInfo implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new uez();

    /* renamed from: a */
    public final String f30767a;

    /* renamed from: b */
    public final String f30768b;

    /* renamed from: c */
    public final int f30769c;

    public CallingAppInfo(String str, String str2, int i) {
        this.f30767a = str;
        this.f30768b = str2;
        this.f30769c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30767a);
        parcel.writeString(this.f30768b);
        parcel.writeInt(this.f30769c);
    }

    public CallingAppInfo(uey uey, int i) {
        this(uey.f47395b, uey.f47396c.f30764b, i);
    }
}
