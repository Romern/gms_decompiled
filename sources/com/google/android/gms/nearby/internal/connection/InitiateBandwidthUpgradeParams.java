package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InitiateBandwidthUpgradeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aigw();

    /* renamed from: a */
    public aigr f80566a;

    /* renamed from: b */
    public String f80567b;

    public InitiateBandwidthUpgradeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitiateBandwidthUpgradeParams) {
            InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = (InitiateBandwidthUpgradeParams) obj;
            return sdg.m34949a(this.f80566a, initiateBandwidthUpgradeParams.f80566a) && sdg.m34949a(this.f80567b, initiateBandwidthUpgradeParams.f80567b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80566a, this.f80567b});
    }

    public InitiateBandwidthUpgradeParams(IBinder iBinder, String str) {
        aigr aigr;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            aigr = queryLocalInterface instanceof aigr ? (aigr) queryLocalInterface : new aigp(iBinder);
        } else {
            aigr = null;
        }
        this.f80566a = aigr;
        this.f80567b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        aigr aigr = this.f80566a;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35046a(parcel, 2, this.f80567b, false);
        see.m35062b(parcel, a);
    }
}
