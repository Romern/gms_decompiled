package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransitDisplayCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algy();

    /* renamed from: a */
    public String f81623a;

    /* renamed from: b */
    public String f81624b;

    /* renamed from: c */
    public boolean f81625c;

    /* renamed from: d */
    public String f81626d;

    /* renamed from: e */
    public ProtoSafeParcelable f81627e;

    private TransitDisplayCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitDisplayCardIntentArgs) {
            TransitDisplayCardIntentArgs transitDisplayCardIntentArgs = (TransitDisplayCardIntentArgs) obj;
            return sdg.m34949a(this.f81623a, transitDisplayCardIntentArgs.f81623a) && sdg.m34949a(this.f81624b, transitDisplayCardIntentArgs.f81624b) && sdg.m34949a(Boolean.valueOf(this.f81625c), Boolean.valueOf(transitDisplayCardIntentArgs.f81625c)) && sdg.m34949a(this.f81626d, transitDisplayCardIntentArgs.f81626d) && sdg.m34949a(this.f81627e, transitDisplayCardIntentArgs.f81627e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81623a, this.f81624b, Boolean.valueOf(this.f81625c), this.f81626d, this.f81627e});
    }

    public TransitDisplayCardIntentArgs(String str, String str2, boolean z, String str3, ProtoSafeParcelable protoSafeParcelable) {
        this.f81623a = str;
        this.f81624b = str2;
        this.f81625c = z;
        this.f81626d = str3;
        this.f81627e = protoSafeParcelable;
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
        see.m35046a(parcel, 1, this.f81623a, false);
        see.m35046a(parcel, 2, this.f81624b, false);
        see.m35051a(parcel, 3, this.f81625c);
        see.m35046a(parcel, 4, this.f81626d, false);
        see.m35040a(parcel, 5, this.f81627e, i, false);
        see.m35062b(parcel, a);
    }
}
