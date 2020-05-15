package com.google.android.gms.wallet.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericSelectorResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awon();

    /* renamed from: a */
    public static final GenericSelectorResult f110319a = m94087a().f94747a;

    /* renamed from: b */
    public UserAddress f110320b;

    /* renamed from: c */
    public long f110321c;

    /* renamed from: d */
    public boolean f110322d;

    /* renamed from: e */
    public bxtx f110323e;

    /* renamed from: f */
    public byte[] f110324f;

    private GenericSelectorResult() {
    }

    /* renamed from: a */
    public static awoo m94087a() {
        return new awoo(new GenericSelectorResult());
    }

    /* renamed from: b */
    public final boolean mo59966b() {
        return this.f110320b != null;
    }

    /* renamed from: c */
    public final boolean mo59967c() {
        return this.f110324f != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110320b, 0);
        parcel.writeLong(this.f110321c);
        parcel.writeByte(this.f110322d ? (byte) 1 : 0);
        bxtx bxtx = this.f110323e;
        if (bxtx != null) {
            parcel.writeByteArray(bxtx.mo73780k());
        } else {
            parcel.writeByteArray(null);
        }
        parcel.writeByteArray(this.f110324f);
    }

    public GenericSelectorResult(UserAddress userAddress, long j, boolean z, bxtx bxtx, byte[] bArr) {
        this.f110320b = userAddress;
        this.f110321c = j;
        this.f110322d = z;
        this.f110323e = bxtx;
        this.f110324f = bArr;
    }
}
