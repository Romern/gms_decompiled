package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwFullWalletRequestedEvent extends AnalyticsSessionStartEndEvent implements awea {
    public static final Parcelable.Creator CREATOR = new awdl();

    /* renamed from: c */
    public final BuyFlowConfig f109975c;

    /* renamed from: d */
    public final int f109976d;

    /* renamed from: e */
    public final int f109977e;

    /* renamed from: f */
    public final int f109978f;

    /* renamed from: g */
    public final int f109979g;

    /* renamed from: h */
    public final boolean f109980h;

    /* renamed from: i */
    public final long f109981i;

    /* renamed from: j */
    public final int f109982j;

    /* renamed from: k */
    public final String f109983k;

    /* renamed from: l */
    public final int f109984l;

    public OwFullWalletRequestedEvent(Parcel parcel) {
        super(parcel);
        this.f109975c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.f109984l = awfu.m79872a(parcel.readInt());
        this.f109976d = parcel.readInt();
        this.f109977e = parcel.readInt();
        this.f109978f = parcel.readInt();
        this.f109979g = parcel.readInt();
        this.f109980h = parcel.readByte() != 0;
        this.f109981i = parcel.readLong();
        this.f109982j = parcel.readInt();
        this.f109983k = parcel.readString();
    }

    /* renamed from: a */
    public static void m93832a(Context context, BuyFlowConfig buyFlowConfig, int i, int i2, int i3, int i4, long j, int i5, String str, String str2) {
        awqc.m80662a(context, new OwFullWalletRequestedEvent(buyFlowConfig, i, i2, i3, i4, j, i5, str, str2));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        awyc.m81487a(this.f109975c, parcel, i);
        int i2 = this.f109984l;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f109976d);
            parcel.writeInt(this.f109977e);
            parcel.writeInt(this.f109978f);
            parcel.writeInt(this.f109979g);
            parcel.writeByte(this.f109980h ? (byte) 1 : 0);
            parcel.writeLong(this.f109981i);
            parcel.writeInt(this.f109982j);
            parcel.writeString(this.f109983k);
            return;
        }
        throw null;
    }

    public OwFullWalletRequestedEvent(BuyFlowConfig buyFlowConfig, int i, int i2, int i3, int i4, long j, int i5, String str, String str2) {
        this.f109984l = i;
        this.f109976d = i2;
        this.f109977e = 1;
        this.f109978f = i3;
        this.f109979g = i4;
        this.f109980h = false;
        this.f109981i = j;
        this.f109982j = i5;
        this.f109918a = str;
        this.f110015m = awnm.m80359a();
        this.f109975c = buyFlowConfig;
        mo59779a(buyFlowConfig);
        this.f109983k = str2;
    }
}
