package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Value extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxv();

    /* renamed from: a */
    public final int f32181a;

    /* renamed from: b */
    public boolean f32182b;

    /* renamed from: c */
    public float f32183c;

    /* renamed from: d */
    public String f32184d;

    /* renamed from: e */
    public Map f32185e;

    /* renamed from: f */
    public int[] f32186f;

    /* renamed from: g */
    public float[] f32187g;

    /* renamed from: h */
    public byte[] f32188h;

    public Value(int i) {
        this(i, false, 0.0f, null, null, null, null, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final int mo18986a() {
        boolean z = true;
        if (this.f32181a != 1) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Value is not in int format");
        return Float.floatToRawIntBits(this.f32183c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value) {
            Value value = (Value) obj;
            int i = this.f32181a;
            if (i == value.f32181a && this.f32182b == value.f32182b) {
                if (i != 1) {
                    if (i == 3) {
                        return sdg.m34949a(this.f32184d, value.f32184d);
                    }
                    if (i == 4) {
                        return sdg.m34949a(this.f32185e, value.f32185e);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f32186f, value.f32186f);
                    }
                    if (i == 6) {
                        return Arrays.equals(this.f32187g, value.f32187g);
                    }
                    if (i != 7) {
                        return this.f32183c == value.f32183c;
                    }
                    return Arrays.equals(this.f32188h, value.f32188h);
                } else if (mo18986a() == value.mo18986a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f32183c), this.f32184d, this.f32185e, this.f32186f, this.f32187g, this.f32188h});
    }

    public final String toString() {
        if (!this.f32182b) {
            return "unset";
        }
        switch (this.f32181a) {
            case 1:
                return Integer.toString(mo18986a());
            case 2:
                return Float.toString(this.f32183c);
            case 3:
                return this.f32184d;
            case 4:
                return new TreeMap(this.f32185e).toString();
            case 5:
                return Arrays.toString(this.f32186f);
            case 6:
                return Arrays.toString(this.f32187g);
            case 7:
                byte[] bArr = this.f32188h;
                int length = bArr.length;
                if (bArr == null || length == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder(((length + 15) / 16) * 57);
                int i = length;
                int i2 = 0;
                int i3 = 0;
                while (i > 0) {
                    if (i2 != 0) {
                        if (i2 == 8) {
                            sb.append(" -");
                        }
                    } else if (length >= 65536) {
                        sb.append(String.format("%08X:", Integer.valueOf(i3)));
                    } else {
                        sb.append(String.format("%04X:", Integer.valueOf(i3)));
                    }
                    sb.append(String.format(" %02X", Integer.valueOf(bArr[i3] & 255)));
                    i--;
                    i2++;
                    if (i2 == 16 || i == 0) {
                        sb.append(10);
                        i2 = 0;
                    }
                    i3++;
                }
                return sb.toString();
            default:
                return "unknown";
        }
    }

    public Value(int i, boolean z, float f, String str, Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        C1223np npVar;
        this.f32181a = i;
        this.f32182b = z;
        this.f32183c = f;
        this.f32184d = str;
        if (bundle != null) {
            bundle.setClassLoader(MapValue.class.getClassLoader());
            npVar = new C1223np(bundle.size());
            for (String str2 : bundle.keySet()) {
                npVar.put(str2, (MapValue) bundle.getParcelable(str2));
            }
        } else {
            npVar = null;
        }
        this.f32185e = npVar;
        this.f32186f = iArr;
        this.f32187g = fArr;
        this.f32188h = bArr;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, float[], boolean):void
     arg types: [android.os.Parcel, int, float[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32181a);
        see.m35051a(parcel, 2, this.f32182b);
        see.m35034a(parcel, 3, this.f32183c);
        see.m35046a(parcel, 4, this.f32184d, false);
        Map map = this.f32185e;
        if (map != null) {
            bundle = new Bundle(map.size());
            for (Map.Entry entry : this.f32185e.entrySet()) {
                bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
            }
        } else {
            bundle = null;
        }
        see.m35037a(parcel, 5, bundle, false);
        see.m35055a(parcel, 6, this.f32186f, false);
        see.m35054a(parcel, 7, this.f32187g, false);
        see.m35052a(parcel, 8, this.f32188h, false);
        see.m35062b(parcel, a);
    }
}
