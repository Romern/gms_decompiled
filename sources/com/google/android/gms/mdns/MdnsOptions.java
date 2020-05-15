package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdnsOptions extends AbstractSafeParcelable implements rjh {
    public static final Parcelable.Creator CREATOR = new agan();

    /* renamed from: a */
    public final String f80067a;

    /* renamed from: b */
    public final String f80068b;

    public MdnsOptions(String str, String str2) {
        this.f80067a = str;
        this.f80068b = str2;
    }

    /* renamed from: a */
    public static agam m67242a(String str, String str2) {
        return new agam(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MdnsOptions) {
            MdnsOptions mdnsOptions = (MdnsOptions) obj;
            return sdg.m34949a(this.f80067a, mdnsOptions.f80067a) && sdg.m34949a(this.f80068b, mdnsOptions.f80068b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80067a, this.f80068b});
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f80067a, false);
        see.m35046a(parcel, 3, this.f80068b, false);
        see.m35062b(parcel, a);
    }
}
