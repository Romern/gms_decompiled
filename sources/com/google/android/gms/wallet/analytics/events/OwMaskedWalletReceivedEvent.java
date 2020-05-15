package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwMaskedWalletReceivedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdn();

    /* renamed from: c */
    public final boolean f109989c;

    /* renamed from: d */
    public final int f109990d;

    /* renamed from: e */
    public final String f109991e;

    /* renamed from: f */
    public final int f109992f;

    public OwMaskedWalletReceivedEvent(int i, String str, String str2, int i2) {
        this.f110015m = str2;
        this.f109989c = false;
        this.f109990d = i;
        this.f109991e = str;
        this.f109992f = i2;
    }

    /* renamed from: a */
    public static void m93833a(Context context, int i, String str, String str2, int i2) {
        awqc.m80662a(context, new OwMaskedWalletReceivedEvent(i, str, str2, i2));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f109989c ? (byte) 1 : 0);
        parcel.writeInt(this.f109990d);
        parcel.writeString(this.f109991e);
        parcel.writeInt(this.f109992f);
    }

    public OwMaskedWalletReceivedEvent(Parcel parcel) {
        super(parcel);
        this.f109989c = parcel.readByte() != 0;
        this.f109990d = parcel.readInt();
        this.f109991e = parcel.readString();
        this.f109992f = parcel.readInt();
    }
}
