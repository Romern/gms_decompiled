package com.google.android.gms.auth.firstparty.dataservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PostSignInData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixy();

    /* renamed from: a */
    final int f10693a;

    /* renamed from: b */
    public final Intent f10694b;

    /* renamed from: c */
    public final PendingIntent f10695c;

    public PostSignInData(int i, Intent intent, PendingIntent pendingIntent) {
        this.f10693a = i;
        this.f10694b = intent;
        this.f10695c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10693a);
        see.m35040a(parcel, 2, this.f10694b, i, false);
        see.m35040a(parcel, 3, this.f10695c, i, false);
        see.m35062b(parcel, a);
    }
}
