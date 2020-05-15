package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avze();

    /* renamed from: a */
    public final int f109690a;

    /* renamed from: b */
    public final int f109691b;

    /* renamed from: c */
    public final float f109692c;

    /* renamed from: d */
    public final float f109693d;

    /* renamed from: e */
    public final float f109694e;

    /* renamed from: f */
    public final float f109695f;

    /* renamed from: g */
    public final float f109696g;

    /* renamed from: h */
    public final float f109697h;

    /* renamed from: i */
    public final float f109698i;

    /* renamed from: j */
    public final LandmarkParcel[] f109699j;

    /* renamed from: k */
    public final float f109700k;

    /* renamed from: l */
    public final float f109701l;

    /* renamed from: m */
    public final float f109702m;

    /* renamed from: n */
    public final ContourParcel[] f109703n;

    /* renamed from: o */
    public final float f109704o;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, ContourParcel[] contourParcelArr, float f11) {
        this.f109690a = i;
        this.f109691b = i2;
        this.f109692c = f;
        this.f109693d = f2;
        this.f109694e = f3;
        this.f109695f = f4;
        this.f109696g = f5;
        this.f109697h = f6;
        this.f109698i = f7;
        this.f109699j = landmarkParcelArr;
        this.f109700k = f8;
        this.f109701l = f9;
        this.f109702m = f10;
        this.f109703n = contourParcelArr;
        this.f109704o = f11;
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new ContourParcel[0], -1.0f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109690a);
        see.m35063b(parcel, 2, this.f109691b);
        see.m35034a(parcel, 3, this.f109692c);
        see.m35034a(parcel, 4, this.f109693d);
        see.m35034a(parcel, 5, this.f109694e);
        see.m35034a(parcel, 6, this.f109695f);
        see.m35034a(parcel, 7, this.f109696g);
        see.m35034a(parcel, 8, this.f109697h);
        see.m35057a(parcel, 9, this.f109699j, i);
        see.m35034a(parcel, 10, this.f109700k);
        see.m35034a(parcel, 11, this.f109701l);
        see.m35034a(parcel, 12, this.f109702m);
        see.m35057a(parcel, 13, this.f109703n, i);
        see.m35034a(parcel, 14, this.f109698i);
        see.m35034a(parcel, 15, this.f109704o);
        see.m35062b(parcel, a);
    }
}
