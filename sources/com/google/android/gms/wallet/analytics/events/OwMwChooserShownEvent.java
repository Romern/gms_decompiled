package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwMwChooserShownEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awdq();

    public OwMwChooserShownEvent(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public static void m93835a(Context context, String str) {
        awqc.m80662a(context, new OwMwChooserShownEvent(str));
    }

    public final int describeContents() {
        return 0;
    }

    public OwMwChooserShownEvent(String str) {
        this.f110015m = str;
    }
}
