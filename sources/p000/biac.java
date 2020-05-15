package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: biac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biac {

    /* renamed from: a */
    public final bhzs f120025a;

    /* renamed from: b */
    public final int f120026b;

    /* renamed from: c */
    public final int f120027c;

    /* renamed from: d */
    public final String f120028d;

    /* renamed from: e */
    public final boolean f120029e;

    public biac(bhzs bhzs, int i, int i2, String str, boolean z) {
        this.f120025a = bhzs;
        this.f120026b = i;
        this.f120027c = i2;
        this.f120028d = str;
        this.f120029e = z;
    }

    /* renamed from: a */
    public final Collection mo64479a() {
        return this.f120025a.f119989e;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof biac)) {
            biac biac = (biac) obj;
            if (!this.f120025a.f119985a.equals(biac.f120025a.f119985a) || this.f120027c != biac.f120027c || this.f120029e != biac.f120029e || this.f120026b != biac.f120026b || !sdg.m34949a(this.f120028d, biac.f120028d) || !sdg.m34949a(this.f120025a.f119989e, biac.mo64479a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f120025a.f119985a, Integer.valueOf(this.f120026b), Integer.valueOf(this.f120027c), this.f120028d, Boolean.valueOf(this.f120029e), this.f120025a.f119989e});
    }
}
