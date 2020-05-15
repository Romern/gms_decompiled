package com.google.android.gms.accountsettings.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ffx();

    /* renamed from: a */
    public final String f7810a;

    /* renamed from: b */
    public final int f7811b;

    /* renamed from: c */
    private final Bundle f7812c;

    public ButtonConfig(String str, int i) {
        this(str, i, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7810a);
        parcel.writeInt(this.f7811b);
        parcel.writeBundle(this.f7812c);
    }

    public ButtonConfig(String str, int i, Bundle bundle) {
        this.f7810a = str;
        this.f7811b = i;
        this.f7812c = bundle;
    }
}
