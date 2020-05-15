package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iyi();

    /* renamed from: a */
    final int f10765a;

    /* renamed from: b */
    public final AppDescription f10766b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.f10765a = i;
        sdo.m34959a(appDescription);
        this.f10766b = appDescription;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10765a);
        see.m35040a(parcel, 2, this.f10766b, i, false);
        see.m35062b(parcel, a);
    }
}
