package com.google.android.gms.wallet.p082im;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.im.InstrumentManagerResult */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentManagerResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awmx();

    /* renamed from: a */
    public static final InstrumentManagerResult f110253a = m94021a().f94653a;

    /* renamed from: b */
    public String f110254b;

    /* renamed from: c */
    public long f110255c;

    /* renamed from: d */
    public byte[] f110256d;

    private InstrumentManagerResult() {
    }

    /* renamed from: a */
    public static awmy m94021a() {
        return new awmy(new InstrumentManagerResult());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110254b);
        parcel.writeLong(this.f110255c);
        parcel.writeByteArray(this.f110256d);
    }

    public InstrumentManagerResult(Parcel parcel) {
        this.f110254b = parcel.readString();
        this.f110255c = parcel.readLong();
        this.f110256d = parcel.createByteArray();
    }
}
