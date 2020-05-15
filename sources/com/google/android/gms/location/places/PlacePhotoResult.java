package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacePhotoResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aelw();

    /* renamed from: a */
    public final Status f79483a;

    /* renamed from: b */
    final BitmapTeleporter f79484b;

    /* renamed from: c */
    public final Bitmap f79485c;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.f79483a = status;
        this.f79484b = bitmapTeleporter;
        this.f79485c = bitmapTeleporter != null ? bitmapTeleporter.mo17759a() : null;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f79483a;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f79483a);
        a.mo25396a("bitmap", this.f79485c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79483a, i, false);
        see.m35040a(parcel, 2, this.f79484b, i, false);
        see.m35062b(parcel, a);
    }
}
