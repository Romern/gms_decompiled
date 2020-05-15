package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aelz();

    /* renamed from: a */
    public final PlaceFilter f79490a;

    /* renamed from: b */
    public final long f79491b;

    /* renamed from: c */
    public final int f79492c;

    /* renamed from: d */
    public final long f79493d;

    /* renamed from: e */
    public final boolean f79494e;

    /* renamed from: f */
    public final boolean f79495f;

    public PlaceRequest(PlaceFilter placeFilter, long j, int i, long j2, boolean z, boolean z2) {
        this.f79490a = placeFilter;
        this.f79491b = j;
        this.f79492c = i;
        this.f79493d = j2;
        this.f79494e = z;
        this.f79495f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceRequest) {
            PlaceRequest placeRequest = (PlaceRequest) obj;
            return sdg.m34949a(this.f79490a, placeRequest.f79490a) && this.f79491b == placeRequest.f79491b && this.f79492c == placeRequest.f79492c && this.f79493d == placeRequest.f79493d && this.f79494e == placeRequest.f79494e && this.f79495f == placeRequest.f79495f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79490a, Long.valueOf(this.f79491b), Integer.valueOf(this.f79492c), Long.valueOf(this.f79493d), Boolean.valueOf(this.f79494e), Boolean.valueOf(this.f79495f)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("filter", this.f79490a);
        a.mo25396a("interval", Long.valueOf(this.f79491b));
        a.mo25396a("priority", Integer.valueOf(this.f79492c));
        a.mo25396a("expireAt", Long.valueOf(this.f79493d));
        a.mo25396a("receiveFailures", Boolean.valueOf(this.f79494e));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79490a, i, false);
        see.m35036a(parcel, 3, this.f79491b);
        see.m35063b(parcel, 4, this.f79492c);
        see.m35036a(parcel, 5, this.f79493d);
        see.m35051a(parcel, 6, this.f79494e);
        see.m35051a(parcel, 7, this.f79495f);
        see.m35062b(parcel, a);
    }
}
