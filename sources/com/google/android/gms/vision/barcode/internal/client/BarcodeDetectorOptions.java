package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avyu();

    /* renamed from: a */
    public int f109683a;

    /* renamed from: b */
    public boolean f109684b;

    public BarcodeDetectorOptions() {
    }

    public BarcodeDetectorOptions(int i, boolean z) {
        this.f109683a = i;
        this.f109684b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109683a);
        see.m35051a(parcel, 3, this.f109684b);
        see.m35062b(parcel, a);
    }
}
