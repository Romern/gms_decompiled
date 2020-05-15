package com.google.android.libraries.photos.backup.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoBackupState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new beay();

    /* renamed from: a */
    public final String f111401a;

    /* renamed from: b */
    private final boolean f111402b;

    /* renamed from: c */
    private final boolean f111403c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", this.f111401a);
        bundle.putBoolean("original_size", this.f111402b);
        bundle.putBoolean("use_data", this.f111403c);
        parcel.writeBundle(bundle);
    }

    public AutoBackupState() {
        this.f111401a = null;
        this.f111402b = false;
        this.f111403c = false;
    }

    public AutoBackupState(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        this.f111401a = readBundle.getString("account_name");
        this.f111402b = readBundle.getBoolean("original_size");
        this.f111403c = readBundle.getBoolean("use_data");
    }
}
