package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aflc();

    /* renamed from: a */
    public final long f80003a;

    /* renamed from: b */
    public final long f80004b;

    /* renamed from: c */
    public final long f80005c;

    public SyncStatus(long j, long j2, long j3) {
        this.f80003a = j;
        this.f80004b = j2;
        this.f80005c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncStatus syncStatus = (SyncStatus) obj;
            return sdg.m34949a(Long.valueOf(this.f80003a), Long.valueOf(syncStatus.f80003a)) && sdg.m34949a(Long.valueOf(this.f80004b), Long.valueOf(syncStatus.f80004b)) && sdg.m34949a(Long.valueOf(this.f80005c), Long.valueOf(syncStatus.f80005c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f80003a), Long.valueOf(this.f80004b), Long.valueOf(this.f80005c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f80003a);
        see.m35036a(parcel, 2, this.f80004b);
        see.m35036a(parcel, 3, this.f80005c);
        see.m35062b(parcel, a);
    }
}
