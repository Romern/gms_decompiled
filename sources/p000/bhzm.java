package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: bhzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzm {

    /* renamed from: a */
    final int f119962a;

    /* renamed from: b */
    final int f119963b;

    /* renamed from: c */
    final String f119964c;

    /* renamed from: d */
    final boolean f119965d;

    /* renamed from: e */
    final Collection f119966e;

    /* renamed from: f */
    final int f119967f;

    /* renamed from: g */
    final float f119968g;

    public bhzm(int i, int i2, String str, boolean z, Collection collection, int i3, float f) {
        this.f119962a = i;
        this.f119963b = i2;
        this.f119964c = str;
        this.f119967f = i3;
        this.f119968g = f;
        this.f119965d = z;
        this.f119966e = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhzm) {
            bhzm bhzm = (bhzm) obj;
            return this.f119962a == bhzm.f119962a && this.f119963b == bhzm.f119963b && this.f119967f == bhzm.f119967f && this.f119968g == bhzm.f119968g && this.f119965d == bhzm.f119965d && sdg.m34949a(this.f119964c, bhzm.f119964c) && sdg.m34949a(this.f119966e, bhzm.f119966e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f119962a), Integer.valueOf(this.f119963b), this.f119964c, Boolean.valueOf(this.f119965d), this.f119966e, Integer.valueOf(this.f119967f), Float.valueOf(this.f119968g)});
    }
}
