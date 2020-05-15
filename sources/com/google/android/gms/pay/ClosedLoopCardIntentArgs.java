package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClosedLoopCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcw();

    /* renamed from: a */
    public String f81446a;

    /* renamed from: b */
    public String f81447b;

    /* renamed from: c */
    public ProtoSafeParcelable f81448c;

    /* renamed from: d */
    public boolean f81449d;

    private ClosedLoopCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosedLoopCardIntentArgs) {
            ClosedLoopCardIntentArgs closedLoopCardIntentArgs = (ClosedLoopCardIntentArgs) obj;
            return sdg.m34949a(this.f81446a, closedLoopCardIntentArgs.f81446a) && sdg.m34949a(this.f81447b, closedLoopCardIntentArgs.f81447b) && sdg.m34949a(this.f81448c, closedLoopCardIntentArgs.f81448c) && sdg.m34949a(Boolean.valueOf(this.f81449d), Boolean.valueOf(closedLoopCardIntentArgs.f81449d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81446a, this.f81447b, this.f81448c, Boolean.valueOf(this.f81449d)});
    }

    public ClosedLoopCardIntentArgs(String str, String str2, ProtoSafeParcelable protoSafeParcelable, boolean z) {
        this.f81446a = str;
        this.f81447b = str2;
        this.f81448c = protoSafeParcelable;
        this.f81449d = z;
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
        see.m35046a(parcel, 1, this.f81446a, false);
        see.m35046a(parcel, 2, this.f81447b, false);
        see.m35040a(parcel, 3, this.f81448c, i, false);
        see.m35051a(parcel, 4, this.f81449d);
        see.m35062b(parcel, a);
    }
}
