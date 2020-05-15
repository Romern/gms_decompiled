package p000;

import android.os.Build;
import java.util.Locale;

/* renamed from: eo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0965eo {

    /* renamed from: a */
    public final String f15371a;

    /* renamed from: b */
    public final String f15372b;

    /* renamed from: c */
    public final int f15373c;

    /* renamed from: d */
    public final boolean f15374d;

    /* renamed from: e */
    public final int f15375e;

    /* renamed from: f */
    public final String f15376f;

    /* renamed from: g */
    private final int f15377g;

    public C0965eo(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f15371a = str;
        this.f15372b = str2;
        this.f15374d = z;
        this.f15375e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f15373c = i3;
        this.f15376f = str3;
        this.f15377g = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0965eo) {
            C0965eo eoVar = (C0965eo) obj;
            int i = Build.VERSION.SDK_INT;
            if (this.f15375e == eoVar.f15375e && this.f15371a.equals(eoVar.f15371a) && this.f15374d == eoVar.f15374d) {
                if (this.f15377g == 1 && eoVar.f15377g == 2 && (str3 = this.f15376f) != null && !str3.equals(eoVar.f15376f)) {
                    return false;
                }
                if (this.f15377g == 2 && eoVar.f15377g == 1 && (str2 = eoVar.f15376f) != null && !str2.equals(this.f15376f)) {
                    return false;
                }
                return (this.f15377g != eoVar.f15377g || ((str = this.f15376f) == null ? eoVar.f15376f == null : str.equals(eoVar.f15376f))) && this.f15373c == eoVar.f15373c;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15371a.hashCode() * 31) + this.f15373c) * 31) + (!this.f15374d ? 1237 : 1231)) * 31) + this.f15375e;
    }

    public final String toString() {
        return "Column{name='" + this.f15371a + "', type='" + this.f15372b + "', affinity='" + this.f15373c + "', notNull=" + this.f15374d + ", primaryKeyPosition=" + this.f15375e + ", defaultValue='" + this.f15376f + "'}";
    }
}
