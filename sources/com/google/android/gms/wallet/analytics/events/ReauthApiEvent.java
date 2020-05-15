package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReauthApiEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdw();

    /* renamed from: a */
    public long f110006a;

    /* renamed from: b */
    public int f110007b;

    /* renamed from: c */
    public int f110008c = 1;

    public ReauthApiEvent(Parcel parcel) {
        super(parcel);
        int a = bpjb.m111976a(parcel.readInt());
        this.f110008c = a;
        if (a == 0) {
            this.f110008c = 1;
        }
        this.f110006a = parcel.readLong();
        this.f110007b = parcel.readInt();
    }

    /* renamed from: a */
    public static int m93840a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 20 : 26;
        }
        return 25;
    }

    /* renamed from: b */
    public static int m93842b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f110008c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeLong(this.f110006a);
            parcel.writeInt(this.f110007b);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m93841a(Context context, int i, long j, int i2, String str) {
        ReauthApiEvent reauthApiEvent = new ReauthApiEvent(str);
        reauthApiEvent.f110008c = i;
        reauthApiEvent.f110006a = j;
        reauthApiEvent.f110007b = i2;
        awqc.m80662a(context, reauthApiEvent);
    }

    public ReauthApiEvent(String str) {
        this.f110015m = str;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bpjc.f137833e.mo74144da();
        int i = this.f110008c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpjc bpjc = (bpjc) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bpjc.f137836b = i2;
            int i3 = bpjc.f137835a | 1;
            bpjc.f137835a = i3;
            long j = this.f110006a;
            int i4 = i3 | 2;
            bpjc.f137835a = i4;
            bpjc.f137837c = j;
            int i5 = this.f110007b;
            bpjc.f137835a = i4 | 4;
            bpjc.f137838d = i5;
            awqo.f94860b.add((bpjc) da.mo74062i());
            return;
        }
        throw null;
    }
}
