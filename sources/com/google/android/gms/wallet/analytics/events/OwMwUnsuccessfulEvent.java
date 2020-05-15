package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwMwUnsuccessfulEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdr();

    /* renamed from: c */
    public final int f109995c;

    /* renamed from: d */
    public final int f109996d;

    /* renamed from: e */
    public final int f109997e;

    /* renamed from: f */
    public final String f109998f;

    /* renamed from: g */
    public final int f109999g;

    public OwMwUnsuccessfulEvent(int i, int i2, int i3, int i4, String str, String str2) {
        this.f110015m = str;
        this.f109995c = i;
        this.f109999g = i2;
        this.f109996d = i3;
        this.f109997e = i4;
        this.f109998f = str2;
    }

    /* renamed from: a */
    public static void m93836a(Context context, int i, int i2, int i3, int i4, String str, String str2) {
        awqc.m80662a(context, new OwMwUnsuccessfulEvent(i, i2, i3, i4, str, str2));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109995c);
        int i2 = this.f109999g;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f109996d);
            parcel.writeInt(this.f109997e);
            parcel.writeString(this.f109998f);
            return;
        }
        throw null;
    }

    public OwMwUnsuccessfulEvent(Parcel parcel) {
        super(parcel);
        this.f109995c = parcel.readInt();
        this.f109999g = awfu.m79872a(parcel.readInt());
        this.f109996d = parcel.readInt();
        this.f109997e = parcel.readInt();
        this.f109998f = parcel.readString();
    }
}
