package com.google.android.gms.chromesync;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChromeSyncState extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qqh();

    /* renamed from: a */
    public final boolean f30010a;

    /* renamed from: b */
    public final int f30011b;

    /* renamed from: c */
    public final PendingIntent f30012c;

    /* renamed from: d */
    public final boolean f30013d;

    public ChromeSyncState(boolean z, int i, PendingIntent pendingIntent, boolean z2) {
        this.f30010a = z;
        this.f30011b = i;
        this.f30012c = pendingIntent;
        this.f30013d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f30010a);
        see.m35063b(parcel, 2, this.f30011b);
        see.m35040a(parcel, 3, this.f30012c, i, false);
        see.m35051a(parcel, 4, this.f30013d);
        see.m35062b(parcel, a);
    }
}
