package p000;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: bnik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnik extends bnha {

    /* renamed from: c */
    private transient Object[] f131664c = new Object[4];

    /* renamed from: d */
    private transient Object[] f131665d = new Object[4];

    /* renamed from: e */
    private final Comparator f131666e;

    /* renamed from: a */
    public final bnim mo67618b() {
        int i = this.f131614b;
        if (i == 0) {
            return bnim.m109533a(this.f131666e);
        }
        if (i == 1) {
            return bnim.m109534a(this.f131666e, this.f131664c[0], this.f131665d[0]);
        }
        Object[] copyOf = Arrays.copyOf(this.f131664c, i);
        Arrays.sort(copyOf, this.f131666e);
        Object[] objArr = new Object[this.f131614b];
        for (int i2 = 0; i2 < this.f131614b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (this.f131666e.compare(copyOf[i3], copyOf[i2]) == 0) {
                    String valueOf = String.valueOf(copyOf[i3]);
                    String valueOf2 = String.valueOf(copyOf[i2]);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
                    sb.append("keys required to be distinct but compared as equal: ");
                    sb.append(valueOf);
                    sb.append(" and ");
                    sb.append(valueOf2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            objArr[Arrays.binarySearch(copyOf, this.f131664c[i2], this.f131666e)] = this.f131665d[i2];
        }
        return new bnim(new bnoo(bngx.m109373b(copyOf), this.f131666e), bngx.m109373b(objArr));
    }

    public bnik(Comparator comparator) {
        bmxy.m108581a(comparator);
        this.f131666e = comparator;
    }

    /* renamed from: a */
    public final void mo67695b(Object obj, Object obj2) {
        int i = this.f131614b + 1;
        int length = this.f131664c.length;
        if (i > length) {
            int a = bngl.m109321a(length, i);
            this.f131664c = Arrays.copyOf(this.f131664c, a);
            this.f131665d = Arrays.copyOf(this.f131665d, a);
        }
        bndz.m109114a(obj, obj2);
        Object[] objArr = this.f131664c;
        int i2 = this.f131614b;
        objArr[i2] = obj;
        this.f131665d[i2] = obj2;
        this.f131614b = i2 + 1;
    }
}
