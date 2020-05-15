package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NewWidgetActionEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awda();

    /* renamed from: a */
    final int f109948a;

    /* renamed from: b */
    final int f109949b;

    /* renamed from: c */
    final int f109950c;

    /* renamed from: d */
    final int f109951d;

    public NewWidgetActionEvent(Parcel parcel) {
        super(parcel);
        this.f109948a = parcel.readInt();
        this.f109950c = bpin.m111960a(parcel.readInt());
        this.f109951d = awfu.m79872a(parcel.readInt());
        this.f109949b = parcel.readInt();
    }

    /* renamed from: a */
    public static void m93813a(Context context, String str, int i) {
        m93814a(context, str, i, 2, 1, -1);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109948a);
        int i2 = this.f109950c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            int i4 = this.f109951d;
            int i5 = i4 - 1;
            if (i4 != 0) {
                parcel.writeInt(i5);
                parcel.writeInt(this.f109949b);
                return;
            }
            throw null;
        }
        throw null;
    }

    public NewWidgetActionEvent(String str, int i, int i2, int i3, int i4) {
        this.f110015m = str;
        this.f109948a = i;
        this.f109950c = i2;
        this.f109951d = i3;
        this.f109949b = i4;
    }

    /* renamed from: a */
    public static void m93814a(Context context, String str, int i, int i2, int i3, int i4) {
        awqc.m80662a(context, new NewWidgetActionEvent(str, i, i2, i3, i4));
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bpio.f137781f.mo74144da();
        int i = this.f109948a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpio bpio = (bpio) da.f164949b;
        int i2 = bpio.f137783a | 1;
        bpio.f137783a = i2;
        bpio.f137784b = i;
        int i3 = this.f109950c;
        int i4 = i3 - 1;
        if (i3 != 0) {
            bpio.f137785c = i4;
            int i5 = i2 | 2;
            bpio.f137783a = i5;
            int i6 = this.f109951d;
            int i7 = i6 - 1;
            if (i6 != 0) {
                bpio.f137786d = i7;
                int i8 = i5 | 4;
                bpio.f137783a = i8;
                int i9 = this.f109949b;
                bpio.f137783a = i8 | 8;
                bpio.f137787e = i9;
                awqo.f94864f.add((bpio) da.mo74062i());
                return;
            }
            throw null;
        }
        throw null;
    }
}
