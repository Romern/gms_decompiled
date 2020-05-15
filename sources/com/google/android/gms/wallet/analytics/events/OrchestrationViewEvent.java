package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationViewEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdj();

    /* renamed from: a */
    private final int f109970a;

    /* renamed from: b */
    private final int f109971b;

    public OrchestrationViewEvent(Parcel parcel) {
        super(parcel);
        this.f109970a = parcel.readInt();
        int a = bpjy.m111999a(parcel.readInt());
        this.f109971b = a == 0 ? 1 : a;
    }

    /* renamed from: a */
    public static void m93825a(Context context, String str, bjes bjes) {
        m93826a(context, str, bjes, 2);
    }

    /* renamed from: b */
    public static void m93827b(Context context, String str, bjes bjes) {
        m93826a(context, str, bjes, 3);
    }

    /* renamed from: c */
    public static void m93828c(Context context, String str, bjes bjes) {
        m93826a(context, str, bjes, 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109970a);
        parcel.writeInt(this.f109971b);
    }

    public OrchestrationViewEvent(String str, int i, int i2) {
        this.f110015m = str;
        this.f109970a = i;
        this.f109971b = i2;
    }

    /* renamed from: a */
    public static void m93826a(Context context, String str, bjes bjes, int i) {
        if (bjes != null) {
            awqc.m80662a(context, new OrchestrationViewEvent(str, bjes.f122583a, i));
        }
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        int i = this.f109970a;
        int i2 = this.f109971b;
        bxvd da = bpjz.f137929d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpjz bpjz = (bpjz) da.f164949b;
        int i3 = bpjz.f137931a | 1;
        bpjz.f137931a = i3;
        bpjz.f137932b = i;
        bpjz.f137933c = i2;
        bpjz.f137931a = i3 | 2;
        awqo.f94861c.add((bpjz) da.mo74062i());
    }
}
