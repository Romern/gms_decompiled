package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContourParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzd();

    /* renamed from: a */
    public final PointF[] f109688a;

    /* renamed from: b */
    public final int f109689b;

    public ContourParcel(PointF[] pointFArr, int i) {
        this.f109688a = pointFArr;
        this.f109689b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f109688a, i);
        see.m35063b(parcel, 3, this.f109689b);
        see.m35062b(parcel, a);
    }
}
