package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_MessageReceivedNotification extends C$AutoValue_MessageReceivedNotification {
    public static final Parcelable.Creator CREATOR = new bcru();

    public AutoValue_MessageReceivedNotification(ConversationId conversationId, String str, ContactId contactId, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(conversationId, str, contactId, str2, str3, str4, str5, str6, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f111342a, i);
        parcel.writeString(this.f111343b);
        parcel.writeParcelable(this.f111344c, i);
        parcel.writeString(this.f111345d);
        parcel.writeString(this.f111346e);
        parcel.writeString(this.f111347f);
        parcel.writeString(this.f111348g);
        parcel.writeString(this.f111349h);
        parcel.writeInt(this.f111350i ? 1 : 0);
    }
}
