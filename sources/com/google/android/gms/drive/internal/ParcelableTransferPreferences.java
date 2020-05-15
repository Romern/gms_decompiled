package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableTransferPreferences extends AbstractSafeParcelable implements txg {
    public static final Parcelable.Creator CREATOR = new uuo();

    /* renamed from: a */
    final int f30907a;

    /* renamed from: b */
    final int f30908b;

    /* renamed from: c */
    final boolean f30909c;

    public ParcelableTransferPreferences(int i, int i2, boolean z) {
        this.f30907a = i;
        this.f30908b = i2;
        this.f30909c = z;
    }

    /* renamed from: a */
    public final int mo18217a() {
        return this.f30907a;
    }

    /* renamed from: b */
    public final boolean mo18218b() {
        return this.f30909c;
    }

    /* renamed from: c */
    public final int mo18219c() {
        return this.f30908b;
    }

    public ParcelableTransferPreferences(txg txg) {
        this(txg.mo18217a(), txg.mo18219c(), txg.mo18218b());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30907a);
        see.m35063b(parcel, 3, this.f30908b);
        see.m35051a(parcel, 4, this.f30909c);
        see.m35062b(parcel, a);
    }
}
