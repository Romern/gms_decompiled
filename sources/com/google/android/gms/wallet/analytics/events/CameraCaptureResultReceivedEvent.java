package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CameraCaptureResultReceivedEvent extends WalletAnalyticsEvent implements awqh {
    public static final Parcelable.Creator CREATOR = new awcm();

    /* renamed from: a */
    public final long f109920a;

    /* renamed from: b */
    public final int f109921b;

    public CameraCaptureResultReceivedEvent(int i, long j, String str) {
        this.f110015m = str;
        this.f109921b = i;
        this.f109920a = j;
    }

    /* renamed from: a */
    public final void mo52464a(Context context, awqi awqi, bxvd bxvd) {
        long j = this.f109920a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpht bpht = (bpht) bxvd.f164949b;
        bpht bpht2 = bpht.f137702h;
        int i = bpht.f137704a | 4;
        bpht.f137704a = i;
        bpht.f137707d = j;
        int i2 = this.f109921b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bpht.f137708e = i3;
            bpht.f137704a = i | 8;
            return;
        }
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109921b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeLong(this.f109920a);
            return;
        }
        throw null;
    }

    public CameraCaptureResultReceivedEvent(Parcel parcel) {
        super(parcel);
        this.f109921b = awfu.m79872a(parcel.readInt());
        this.f109920a = parcel.readLong();
    }
}
