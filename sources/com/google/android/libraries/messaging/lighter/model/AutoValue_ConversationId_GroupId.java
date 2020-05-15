package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_ConversationId_GroupId extends C$AutoValue_ConversationId_GroupId {
    public static final Parcelable.Creator CREATOR = new bcro();

    public AutoValue_ConversationId_GroupId(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111340a);
        parcel.writeString(this.f111341b);
    }
}
