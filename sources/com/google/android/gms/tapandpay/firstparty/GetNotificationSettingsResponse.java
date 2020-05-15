package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetNotificationSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnv();

    /* renamed from: a */
    public NotificationSettings f108378a;

    public GetNotificationSettingsResponse(NotificationSettings notificationSettings) {
        this.f108378a = notificationSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f108378a, i, false);
        see.m35062b(parcel, a);
    }
}
