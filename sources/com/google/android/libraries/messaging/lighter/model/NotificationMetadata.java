package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NotificationMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bctw();

    /* renamed from: a */
    public final HashMap f111373a;

    public NotificationMetadata(HashMap hashMap) {
        this.f111373a = hashMap;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NotificationMetadata)) {
            return false;
        }
        return this.f111373a.equals(((NotificationMetadata) obj).f111373a);
    }

    public final int hashCode() {
        return this.f111373a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f111373a);
    }
}
