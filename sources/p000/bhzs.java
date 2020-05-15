package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: bhzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzs {

    /* renamed from: a */
    public final String f119985a;

    /* renamed from: b */
    public final double f119986b;

    /* renamed from: c */
    public final double f119987c;

    /* renamed from: d */
    public float f119988d;

    /* renamed from: e */
    public final List f119989e;

    public bhzs(String str, double d, double d2, float f) {
        this(str, d, d2, f, new HashSet());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhzs) {
            bhzs bhzs = (bhzs) obj;
            return bmxi.m108538a(this.f119985a, bhzs.f119985a) && this.f119986b == bhzs.f119986b && this.f119987c == bhzs.f119987c && this.f119988d == bhzs.f119988d && bmxi.m108538a(this.f119989e, bhzs.f119989e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119985a, Double.valueOf(this.f119986b), Double.valueOf(this.f119987c), Float.valueOf(this.f119988d), this.f119989e});
    }

    public bhzs(String str, double d, double d2, float f, Collection collection) {
        this.f119985a = str;
        this.f119986b = d;
        this.f119987c = d2;
        this.f119988d = f;
        this.f119989e = new ArrayList(collection);
    }
}
