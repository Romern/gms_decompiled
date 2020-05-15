package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahit();

    /* renamed from: a */
    public long f80476a;

    /* renamed from: b */
    public int f80477b;

    /* renamed from: c */
    public long f80478c;

    /* renamed from: d */
    public long f80479d;

    public PayloadTransferUpdate() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            return sdg.m34949a(Long.valueOf(this.f80476a), Long.valueOf(payloadTransferUpdate.f80476a)) && sdg.m34949a(Integer.valueOf(this.f80477b), Integer.valueOf(payloadTransferUpdate.f80477b)) && sdg.m34949a(Long.valueOf(this.f80478c), Long.valueOf(payloadTransferUpdate.f80478c)) && sdg.m34949a(Long.valueOf(this.f80479d), Long.valueOf(payloadTransferUpdate.f80479d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f80476a), Integer.valueOf(this.f80477b), Long.valueOf(this.f80478c), Long.valueOf(this.f80479d)});
    }

    public PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.f80476a = j;
        this.f80477b = i;
        this.f80478c = j2;
        this.f80479d = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f80476a);
        see.m35063b(parcel, 2, this.f80477b);
        see.m35036a(parcel, 3, this.f80478c);
        see.m35036a(parcel, 4, this.f80479d);
        see.m35062b(parcel, a);
    }
}
