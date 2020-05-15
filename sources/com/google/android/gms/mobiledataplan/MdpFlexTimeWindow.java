package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agot();

    /* renamed from: a */
    public final String f80194a;

    /* renamed from: b */
    public final String f80195b;

    /* renamed from: c */
    public final String f80196c;

    /* renamed from: d */
    public final int f80197d;

    public MdpFlexTimeWindow(String str, String str2, String str3, int i) {
        this.f80194a = str;
        this.f80195b = str2;
        this.f80196c = str3;
        this.f80197d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow) obj;
            return sdg.m34949a(this.f80194a, mdpFlexTimeWindow.f80194a) && sdg.m34949a(this.f80195b, mdpFlexTimeWindow.f80195b) && sdg.m34949a(this.f80196c, mdpFlexTimeWindow.f80196c) && sdg.m34949a(Integer.valueOf(this.f80197d), Integer.valueOf(mdpFlexTimeWindow.f80197d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80194a, this.f80195b, this.f80196c, Integer.valueOf(this.f80197d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("RecurrenceType", this.f80194a);
        a.mo25396a("StartTime", this.f80195b);
        a.mo25396a("EndTime", this.f80196c);
        a.mo25396a("DiscountPercentage", Integer.valueOf(this.f80197d));
        return a.toString();
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
        see.m35046a(parcel, 1, this.f80194a, false);
        see.m35046a(parcel, 2, this.f80195b, false);
        see.m35046a(parcel, 3, this.f80196c, false);
        see.m35063b(parcel, 4, this.f80197d);
        see.m35062b(parcel, a);
    }
}
