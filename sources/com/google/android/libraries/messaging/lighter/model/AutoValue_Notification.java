package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_Notification extends C$AutoValue_Notification {
    public static final Parcelable.Creator CREATOR = new bcrx();

    public AutoValue_Notification(String str, Long l, NotificationMetadata notificationMetadata, Notification.OneOfType oneOfType) {
        super(str, l, notificationMetadata, oneOfType);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111351a);
        parcel.writeLong(this.f111352b.longValue());
        parcel.writeParcelable(this.f111353c, i);
        parcel.writeParcelable(this.f111354d, i);
    }
}
