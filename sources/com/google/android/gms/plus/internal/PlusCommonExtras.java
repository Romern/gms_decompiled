package com.google.android.gms.plus.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlusCommonExtras extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new antz();

    /* renamed from: a */
    public final int f82347a;

    /* renamed from: b */
    public String f82348b;

    /* renamed from: c */
    public String f82349c;

    public PlusCommonExtras() {
        this.f82347a = 1;
        this.f82348b = "";
        this.f82349c = "";
    }

    /* renamed from: b */
    public static PlusCommonExtras m68418b(Intent intent) {
        if (intent == null) {
            return new PlusCommonExtras();
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) sef.m35067a(intent, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", CREATOR);
        return plusCommonExtras == null ? new PlusCommonExtras() : plusCommonExtras;
    }

    /* renamed from: a */
    public final void mo46573a(Intent intent) {
        sef.m35071a(this, intent, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusCommonExtras) {
            PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
            if (this.f82347a != plusCommonExtras.f82347a || !sdg.m34949a(this.f82348b, plusCommonExtras.f82348b) || !sdg.m34949a(this.f82349c, plusCommonExtras.f82349c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82347a), this.f82348b, this.f82349c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("versionCode", Integer.valueOf(this.f82347a));
        a.mo25396a("Gpsrc", this.f82348b);
        a.mo25396a("ClientCallingPackage", this.f82349c);
        return a.toString();
    }

    public PlusCommonExtras(int i, String str, String str2) {
        this.f82347a = i;
        this.f82348b = str;
        this.f82349c = str2;
    }

    /* renamed from: a */
    public final void mo46574a(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", sef.m35074a(this));
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
        see.m35046a(parcel, 1, this.f82348b, false);
        see.m35046a(parcel, 2, this.f82349c, false);
        see.m35063b(parcel, 1000, this.f82347a);
        see.m35062b(parcel, a);
    }

    /* renamed from: b */
    public static PlusCommonExtras m68419b(Bundle bundle) {
        byte[] bArr;
        if (bundle != null) {
            bArr = bundle.getByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return new PlusCommonExtras();
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) sef.m35069a(bArr, CREATOR);
        return plusCommonExtras == null ? new PlusCommonExtras() : plusCommonExtras;
    }
}
