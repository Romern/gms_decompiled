package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationDependentEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdh();

    /* renamed from: a */
    private String f109966a;

    /* renamed from: b */
    private int f109967b;

    public OrchestrationDependentEvent(Parcel parcel) {
        super(parcel);
        this.f109966a = parcel.readString();
        this.f109967b = parcel.readInt();
    }

    /* renamed from: a */
    public static void m93822a(Context context, String str, String str2, int i) {
        awqc.m80662a(context, new OrchestrationDependentEvent(str, str2, i));
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        int i = this.f109967b;
        String str = this.f109966a;
        awqo.f94865g = i;
        awqo.f94866h = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f109966a);
        parcel.writeInt(this.f109967b);
    }

    public OrchestrationDependentEvent(String str, String str2, int i) {
        this.f110015m = str;
        this.f109966a = str2;
        this.f109967b = i;
    }
}
