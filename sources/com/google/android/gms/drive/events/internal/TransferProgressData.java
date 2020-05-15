package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransferProgressData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urc();

    /* renamed from: a */
    public final int f30791a;

    /* renamed from: b */
    public final DriveId f30792b;

    /* renamed from: c */
    public final int f30793c;

    /* renamed from: d */
    public final long f30794d;

    /* renamed from: e */
    public final long f30795e;

    public TransferProgressData(int i, DriveId driveId) {
        this(i, driveId, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferProgressData transferProgressData = (TransferProgressData) obj;
        return this.f30791a == transferProgressData.f30791a && sdg.m34949a(this.f30792b, transferProgressData.f30792b) && this.f30793c == transferProgressData.f30793c && this.f30794d == transferProgressData.f30794d && this.f30795e == transferProgressData.f30795e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30791a), this.f30792b, Integer.valueOf(this.f30793c), Long.valueOf(this.f30794d), Long.valueOf(this.f30795e)});
    }

    public TransferProgressData(int i, DriveId driveId, int i2, long j, long j2) {
        this.f30791a = i;
        this.f30792b = driveId;
        this.f30793c = i2;
        this.f30794d = j;
        this.f30795e = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30791a);
        see.m35040a(parcel, 3, this.f30792b, i, false);
        see.m35063b(parcel, 4, this.f30793c);
        see.m35036a(parcel, 5, this.f30794d);
        see.m35036a(parcel, 6, this.f30795e);
        see.m35062b(parcel, a);
    }
}
