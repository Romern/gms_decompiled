package com.google.android.gms.wallet.service.p086ib;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultResponse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProcessBuyFlowResultResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awss();

    /* renamed from: a */
    public final int f110361a;

    /* renamed from: b */
    public final int f110362b;

    /* renamed from: c */
    public final Intent f110363c;

    /* renamed from: d */
    public final boolean f110364d;

    /* renamed from: e */
    public final int f110365e;

    public ProcessBuyFlowResultResponse(int i, int i2, int i3, Intent intent, boolean z) {
        this.f110361a = i;
        this.f110362b = i2;
        this.f110365e = i3;
        this.f110363c = intent;
        this.f110364d = z;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110361a);
        parcel.writeInt(this.f110362b);
        int i2 = this.f110365e;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeParcelable(this.f110363c, i);
            parcel.writeByte(this.f110364d ? (byte) 1 : 0);
            return;
        }
        throw null;
    }
}
