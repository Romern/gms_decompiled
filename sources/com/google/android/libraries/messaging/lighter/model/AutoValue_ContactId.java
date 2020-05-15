package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_ContactId extends C$AutoValue_ContactId {
    public static final Parcelable.Creator CREATOR = new bcrl();

    public AutoValue_ContactId(String str, String str2, ContactId.ContactType contactType, bmxv bmxv) {
        super(str, str2, contactType, bmxv);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((C$AutoValue_ContactId) this).f111334a);
        parcel.writeString(this.f111335b);
        parcel.writeParcelable(this.f111336c, i);
        parcel.writeSerializable(this.f111337d);
    }
}
