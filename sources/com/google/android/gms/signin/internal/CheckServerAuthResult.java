package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqnz();

    /* renamed from: a */
    final int f107698a;

    /* renamed from: b */
    final boolean f107699b;

    /* renamed from: c */
    final List f107700c;

    public CheckServerAuthResult(int i, boolean z, List list) {
        this.f107698a = i;
        this.f107699b = z;
        this.f107700c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f107698a);
        see.m35051a(parcel, 2, this.f107699b);
        see.m35066c(parcel, 3, this.f107700c, false);
        see.m35062b(parcel, a);
    }
}
