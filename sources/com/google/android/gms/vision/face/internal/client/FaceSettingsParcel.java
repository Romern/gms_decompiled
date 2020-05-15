package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzf();

    /* renamed from: a */
    public int f109705a;

    /* renamed from: b */
    public int f109706b;

    /* renamed from: c */
    public int f109707c;

    /* renamed from: d */
    public boolean f109708d;

    /* renamed from: e */
    public boolean f109709e;

    /* renamed from: f */
    public float f109710f;

    public FaceSettingsParcel() {
    }

    public FaceSettingsParcel(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f109705a = i;
        this.f109706b = i2;
        this.f109707c = i3;
        this.f109708d = z;
        this.f109709e = z2;
        this.f109710f = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109705a);
        see.m35063b(parcel, 3, this.f109706b);
        see.m35063b(parcel, 4, this.f109707c);
        see.m35051a(parcel, 5, this.f109708d);
        see.m35051a(parcel, 6, this.f109709e);
        see.m35034a(parcel, 7, this.f109710f);
        see.m35062b(parcel, a);
    }
}
