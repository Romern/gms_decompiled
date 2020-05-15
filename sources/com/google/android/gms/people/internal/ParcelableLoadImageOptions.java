package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alzs();

    /* renamed from: a */
    public final int f81928a;

    /* renamed from: b */
    public final int f81929b;

    /* renamed from: c */
    public final boolean f81930c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.f81928a = i;
        this.f81929b = i2;
        this.f81930c = z;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("imageSize", Integer.valueOf(this.f81928a));
        a.mo25396a("avatarOptions", Integer.valueOf(this.f81929b));
        a.mo25396a("useLargePictureForCp2Images", Boolean.valueOf(this.f81930c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81928a);
        see.m35063b(parcel, 2, this.f81929b);
        see.m35051a(parcel, 3, this.f81930c);
        see.m35062b(parcel, a);
    }
}
