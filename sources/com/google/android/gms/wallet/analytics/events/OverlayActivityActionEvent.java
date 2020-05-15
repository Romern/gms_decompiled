package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OverlayActivityActionEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdk();

    /* renamed from: a */
    int f109972a;

    /* renamed from: b */
    int f109973b;

    /* renamed from: c */
    int f109974c;

    public OverlayActivityActionEvent(Parcel parcel) {
        super(parcel);
        this.f109973b = 1;
        this.f109973b = bphx.m111944a(parcel.readInt());
        this.f109974c = awfu.m79872a(parcel.readInt());
        this.f109972a = parcel.readInt();
    }

    /* renamed from: a */
    public static void m93830a(Context context, String str, int i, int i2, int i3) {
        awqc.m80662a(context, new OverlayActivityActionEvent(str, i, i2, i3));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109973b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            int i4 = this.f109974c;
            int i5 = i4 - 1;
            if (i4 != 0) {
                parcel.writeInt(i5);
                parcel.writeInt(this.f109972a);
                return;
            }
            throw null;
        }
        throw null;
    }

    public OverlayActivityActionEvent(String str, int i, int i2, int i3) {
        this.f110015m = str;
        this.f109973b = i;
        this.f109974c = i2;
        this.f109972a = i3;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bpit.f137812e.mo74144da();
        int i = this.f109973b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpit bpit = (bpit) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bpit.f137816c = i2;
            int i3 = bpit.f137814a | 2;
            bpit.f137814a = i3;
            int i4 = this.f109974c;
            int i5 = i4 - 1;
            if (i4 != 0) {
                bpit.f137815b = i5;
                int i6 = i3 | 1;
                bpit.f137814a = i6;
                int i7 = this.f109972a;
                bpit.f137814a = i6 | 4;
                bpit.f137817d = i7;
                awqo.f94863e.add((bpit) da.mo74062i());
                return;
            }
            throw null;
        }
        throw null;
    }
}
