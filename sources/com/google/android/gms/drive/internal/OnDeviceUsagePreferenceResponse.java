package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnDeviceUsagePreferenceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new utz();

    /* renamed from: a */
    public final FileUploadPreferencesImpl f30874a;

    public OnDeviceUsagePreferenceResponse(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f30874a = fileUploadPreferencesImpl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30874a, i, false);
        see.m35062b(parcel, a);
    }
}
