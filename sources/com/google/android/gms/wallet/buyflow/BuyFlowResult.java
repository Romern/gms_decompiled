package com.google.android.gms.wallet.buyflow;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyFlowResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awes();

    /* renamed from: a */
    public static final BuyFlowResult f110016a = m93847a().f94248a;

    /* renamed from: b */
    public String f110017b;

    /* renamed from: c */
    public String f110018c;

    /* renamed from: d */
    public byte[] f110019d;

    /* renamed from: e */
    public byte[] f110020e;

    /* renamed from: f */
    public int f110021f;

    /* renamed from: g */
    public byte[] f110022g;

    private BuyFlowResult() {
    }

    /* renamed from: a */
    public static awet m93847a() {
        return new awet(new BuyFlowResult());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110018c);
        parcel.writeString(this.f110017b);
        parcel.writeByteArray(this.f110019d);
        parcel.writeByteArray(this.f110020e);
        parcel.writeInt(this.f110021f);
        parcel.writeByteArray(this.f110022g);
    }

    public BuyFlowResult(Parcel parcel) {
        this.f110018c = parcel.readString();
        this.f110017b = parcel.readString();
        this.f110019d = parcel.createByteArray();
        this.f110020e = parcel.createByteArray();
        this.f110021f = parcel.readInt();
        this.f110022g = parcel.createByteArray();
    }
}
