package com.google.android.gms.ocr.credit.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NameResult extends GenericResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aksu();

    /* renamed from: a */
    public final String f81304a;

    /* renamed from: b */
    public final boolean f81305b;

    /* renamed from: f */
    public final int f81306f;

    /* renamed from: g */
    public DeviceAccountName f81307g;

    public NameResult(String str, String str2, boolean z, int i, double d) {
        super(str, d);
        this.f81304a = str2;
        this.f81305b = z;
        this.f81306f = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81303e);
        parcel.writeString(this.f81304a);
        parcel.writeInt(this.f81305b ? 1 : 0);
        parcel.writeInt(this.f81306f);
        parcel.writeDouble(mo44733d());
        parcel.writeParcelable(this.f81307g, i);
    }
}
