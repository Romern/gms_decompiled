package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gvo();

    /* renamed from: a */
    final int f10100a;

    /* renamed from: b */
    public final boolean f10101b;

    /* renamed from: c */
    public final boolean f10102c;

    /* renamed from: d */
    public final int f10103d;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f10100a = i;
        this.f10101b = z;
        this.f10102c = z2;
        if (i < 2) {
            this.f10103d = !z3 ? 1 : 3;
        } else {
            this.f10103d = i2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        boolean z = true;
        see.m35051a(parcel, 1, this.f10101b);
        see.m35051a(parcel, 2, this.f10102c);
        if (this.f10103d != 3) {
            z = false;
        }
        see.m35051a(parcel, 3, z);
        see.m35063b(parcel, 4, this.f10103d);
        see.m35063b(parcel, 1000, this.f10100a);
        see.m35062b(parcel, a);
    }
}
