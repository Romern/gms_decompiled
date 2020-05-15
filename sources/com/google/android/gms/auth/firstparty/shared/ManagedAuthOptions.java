package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManagedAuthOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new izf();

    /* renamed from: a */
    final int f10873a;

    /* renamed from: b */
    public int f10874b;

    /* renamed from: c */
    int f10875c;
    @Deprecated

    /* renamed from: d */
    long f10876d;

    public ManagedAuthOptions() {
        this(1, 0, 0, -1);
    }

    /* renamed from: a */
    public static ManagedAuthOptions m6596a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new ManagedAuthOptions();
        }
        return (ManagedAuthOptions) sef.m35069a(bArr, CREATOR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ManagedAuthOptions) {
            ManagedAuthOptions managedAuthOptions = (ManagedAuthOptions) obj;
            if (this.f10874b == managedAuthOptions.f10874b && this.f10875c == managedAuthOptions.f10875c && this.f10876d == managedAuthOptions.f10876d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10874b), Integer.valueOf(this.f10875c), Long.valueOf(this.f10876d)});
    }

    @Deprecated
    public ManagedAuthOptions(int i, int i2) {
        this(1, i, i2, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10873a);
        see.m35063b(parcel, 2, this.f10874b);
        see.m35063b(parcel, 3, this.f10875c);
        see.m35036a(parcel, 4, this.f10876d);
        see.m35062b(parcel, a);
    }

    public ManagedAuthOptions(int i, int i2, int i3, long j) {
        this.f10873a = i;
        this.f10874b = i2;
        this.f10875c = i3;
        this.f10876d = j;
    }

    /* renamed from: a */
    public final Bundle mo7693a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enforced_management_mode", this.f10874b);
        bundle.putInt("restore_mode", this.f10875c);
        long j = this.f10876d;
        if (j != -1) {
            bundle.putLong("source_device_id", j);
        }
        return bundle;
    }
}
