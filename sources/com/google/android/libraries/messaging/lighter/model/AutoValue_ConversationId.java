package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_ConversationId extends C$AutoValue_ConversationId {
    public static final Parcelable.Creator CREATOR = new bcrn();

    public AutoValue_ConversationId(ContactId contactId, ConversationId.OneOfId oneOfId) {
        super(contactId, oneOfId);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f111338a, i);
        parcel.writeParcelable(this.f111339b, i);
    }
}
