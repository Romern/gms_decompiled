package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrResultReceivedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awdd();

    /* renamed from: a */
    public final boolean f109954a;

    /* renamed from: b */
    public final boolean f109955b;

    /* renamed from: c */
    public final boolean f109956c;

    /* renamed from: d */
    public final int f109957d;

    public OcrResultReceivedEvent(int i, boolean z, boolean z2, boolean z3, String str) {
        this.f110015m = str;
        this.f109957d = i;
        this.f109954a = z;
        this.f109955b = z2;
        this.f109956c = z3;
    }

    /* renamed from: a */
    public static void m93816a(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        awqc.m80662a(context, new OcrResultReceivedEvent(i, z, z2, z3, str));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109957d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeByte(this.f109954a ? (byte) 1 : 0);
            parcel.writeByte(this.f109955b ? (byte) 1 : 0);
            parcel.writeByte(this.f109956c ? (byte) 1 : 0);
            return;
        }
        throw null;
    }

    public OcrResultReceivedEvent(Parcel parcel) {
        super(parcel);
        this.f109957d = awfu.m79872a(parcel.readInt());
        boolean z = true;
        this.f109954a = parcel.readByte() != 0;
        this.f109955b = parcel.readByte() != 0;
        this.f109956c = parcel.readByte() == 0 ? false : z;
    }
}
