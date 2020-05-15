package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzm();

    /* renamed from: a */
    public int f109715a;

    /* renamed from: b */
    public int f109716b;

    /* renamed from: c */
    public int f109717c;

    /* renamed from: d */
    public long f109718d;

    /* renamed from: e */
    public int f109719e;

    public FrameMetadataParcel() {
    }

    /* renamed from: a */
    public static FrameMetadataParcel m93781a(avxy avxy) {
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        avxx avxx = avxy.f94095a;
        frameMetadataParcel.f109715a = avxx.f94089a;
        frameMetadataParcel.f109716b = avxx.f94090b;
        frameMetadataParcel.f109719e = avxx.f94093e;
        frameMetadataParcel.f109717c = avxx.f94091c;
        frameMetadataParcel.f109718d = avxx.f94092d;
        return frameMetadataParcel;
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.f109715a = i;
        this.f109716b = i2;
        this.f109717c = i3;
        this.f109718d = j;
        this.f109719e = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109715a);
        see.m35063b(parcel, 3, this.f109716b);
        see.m35063b(parcel, 4, this.f109717c);
        see.m35036a(parcel, 5, this.f109718d);
        see.m35063b(parcel, 6, this.f109719e);
        see.m35062b(parcel, a);
    }
}
