package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetNotificationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyt();

    /* renamed from: a */
    public NotificationSettings f108554a;

    public SetNotificationSettingsRequest(NotificationSettings notificationSettings) {
        this.f108554a = notificationSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f108554a, i, false);
        see.m35062b(parcel, a);
    }
}
