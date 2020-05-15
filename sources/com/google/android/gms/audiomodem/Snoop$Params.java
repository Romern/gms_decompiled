package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Snoop$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new geg();

    /* renamed from: a */
    public final Encoding[] f9887a;

    /* renamed from: b */
    public final boolean f9888b;

    /* renamed from: c */
    public final boolean f9889c;

    /* renamed from: d */
    public final long f9890d;

    public Snoop$Params(Encoding[] encodingArr, boolean z, boolean z2, long j) {
        this.f9887a = encodingArr;
        this.f9888b = z;
        this.f9889c = z2;
        this.f9890d = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f9887a, i);
        see.m35051a(parcel, 3, this.f9888b);
        see.m35051a(parcel, 4, this.f9889c);
        see.m35036a(parcel, 5, this.f9890d);
        see.m35062b(parcel, a);
    }
}
