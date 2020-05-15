package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationClosedEvent extends AnalyticsSessionStartEndEvent implements awqn, awea {
    public static final Parcelable.Creator CREATOR = new awdf();

    /* renamed from: c */
    private final int f109962c;

    /* renamed from: d */
    private final int f109963d;

    /* renamed from: e */
    private final int f109964e;

    public OrchestrationClosedEvent(int i, int i2, int i3, String str, String str2) {
        this.f110015m = str2;
        this.f109918a = str;
        this.f109963d = i;
        this.f109962c = i2;
        this.f109964e = i3;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        int i = this.f109963d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bphe bphe = (bphe) bxvd.f164949b;
        int i2 = i - 1;
        bphe bphe2 = bphe.f137630n;
        if (i != 0) {
            bphe.f137633b = i2;
            int i3 = bphe.f137632a | 1;
            bphe.f137632a = i3;
            int i4 = this.f109962c;
            int i5 = i3 | 2;
            bphe.f137632a = i5;
            bphe.f137634c = i4;
            int i6 = this.f109964e;
            int i7 = i6 - 1;
            if (i6 != 0) {
                bphe.f137641j = i7;
                bphe.f137632a = i5 | 64;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109963d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f109962c);
            int i4 = this.f109964e;
            int i5 = i4 - 1;
            if (i4 != 0) {
                parcel.writeInt(i5);
                return;
            }
            throw null;
        }
        throw null;
    }

    public OrchestrationClosedEvent(Parcel parcel) {
        super(parcel);
        this.f109963d = awfu.m79872a(parcel.readInt());
        this.f109962c = parcel.readInt();
        this.f109964e = bphx.m111944a(parcel.readInt());
    }
}
