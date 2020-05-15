package com.google.android.gms.wallet.p085pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;

/* renamed from: com.google.android.gms.wallet.pm.PmResult */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PmResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awoh();

    /* renamed from: a */
    public SecurePaymentsPayload f110308a;

    /* renamed from: b */
    public String f110309b;

    /* renamed from: c */
    public byte[] f110310c;

    /* renamed from: d */
    public String f110311d;

    /* renamed from: e */
    public bwel f110312e;

    static {
        m94081a();
    }

    private PmResult() {
    }

    /* renamed from: a */
    public static awoi m94081a() {
        return new awoi(new PmResult());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110309b);
        parcel.writeByteArray(this.f110310c);
        parcel.writeParcelable(this.f110308a, i);
        parcel.writeString(this.f110311d);
        bjvp.m104738a(this.f110312e, parcel);
    }

    public PmResult(Parcel parcel) {
        this.f110309b = parcel.readString();
        this.f110310c = parcel.createByteArray();
        this.f110308a = (SecurePaymentsPayload) parcel.readParcelable(getClass().getClassLoader());
        this.f110311d = parcel.readString();
        this.f110312e = (bwel) bjvp.m104731a(parcel, (bxxk) bwel.f159000b.mo74142c(7));
    }
}
