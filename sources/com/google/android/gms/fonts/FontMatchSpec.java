package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FontMatchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zxd();

    /* renamed from: a */
    public final int f32463a;

    /* renamed from: b */
    public String f32464b;

    /* renamed from: c */
    public float f32465c;

    /* renamed from: d */
    public int f32466d;

    /* renamed from: e */
    public float f32467e;

    /* renamed from: f */
    public boolean f32468f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public FontMatchSpec(int i, String str, float f, int i2, float f2, boolean z) {
        boolean z2;
        this.f32463a = i;
        sdo.checkIfNull((Object) str, (Object) "family");
        this.f32464b = str;
        this.f32465c = f;
        this.f32466d = i2;
        this.f32467e = f2;
        this.f32468f = z;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34972a(z2, "invalid width %.01f", Float.valueOf(f));
        sdo.m34972a(i2 > 0 && i2 <= 1000, "invalid weight %d", Integer.valueOf(i2));
        sdo.m34972a(f2 >= 0.0f && f2 <= 1.0f, "invalid italic: %.01f", Float.valueOf(f2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontMatchSpec) {
            FontMatchSpec fontMatchSpec = (FontMatchSpec) obj;
            if (sdg.m34949a(this.f32464b, fontMatchSpec.f32464b) && Float.compare(this.f32465c, fontMatchSpec.f32465c) == 0 && this.f32466d == fontMatchSpec.f32466d && Float.compare(this.f32467e, fontMatchSpec.f32467e) == 0 && this.f32468f == fontMatchSpec.f32468f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32464b, Float.valueOf(this.f32465c), Integer.valueOf(this.f32466d), Float.valueOf(this.f32467e), Boolean.valueOf(this.f32468f)});
    }

    public final String toString() {
        String str = this.f32464b;
        float f = this.f32465c;
        int i = this.f32466d;
        float f2 = this.f32467e;
        boolean z = this.f32468f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
        sb.append("{");
        sb.append(str);
        sb.append(", wdth ");
        sb.append(f);
        sb.append(", wght ");
        sb.append(i);
        sb.append(", ital ");
        sb.append(f2);
        sb.append(", bestEffort ");
        sb.append(z);
        sb.append("}");
        return sb.toString();
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
        see.m35063b(parcel, 1, this.f32463a);
        see.m35046a(parcel, 2, this.f32464b, false);
        see.m35034a(parcel, 3, this.f32465c);
        see.m35063b(parcel, 4, this.f32466d);
        see.m35034a(parcel, 5, this.f32467e);
        see.m35051a(parcel, 6, this.f32468f);
        see.m35062b(parcel, a);
    }

    public FontMatchSpec(String str) {
        this(1, str, 100.0f, 400, 0.0f, false);
    }

    public FontMatchSpec(String str, float f, int i, float f2, boolean z) {
        this(1, str, f, i, f2, z);
    }
}
