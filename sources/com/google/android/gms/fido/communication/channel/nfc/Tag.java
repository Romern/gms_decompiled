package com.google.android.gms.fido.communication.channel.nfc;

import android.nfc.tech.IsoDep;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xld();

    /* renamed from: a */
    public final android.nfc.Tag f31681a;

    public Tag(android.nfc.Tag tag) {
        this.f31681a = tag;
    }

    /* renamed from: a */
    public static Tag m23434a(Object obj) {
        if (obj instanceof android.nfc.Tag) {
            return new Tag((android.nfc.Tag) obj);
        }
        throw new IllegalStateException(String.format("Parameter %s is not a tag!", obj.toString()));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f31681a.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final xkx mo18640a() {
        IsoDep isoDep = IsoDep.get(this.f31681a);
        if (isoDep != null) {
            return new xkx(isoDep);
        }
        return null;
    }
}
