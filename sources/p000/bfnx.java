package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bfnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnx extends bfoa implements Comparable {

    /* renamed from: a */
    public final long f114524a;

    /* renamed from: b */
    public final ArrayList f114525b;

    /* renamed from: c */
    public final bfnz[] f114526c;

    /* renamed from: d */
    public bsax f114527d;

    /* renamed from: e */
    public final boolean f114528e;

    public bfnx(long j, ArrayList arrayList, bfnz[] bfnzArr, boolean z) {
        this.f114524a = j;
        this.f114525b = arrayList;
        this.f114528e = z;
        this.f114526c = bfnzArr;
        Collections.sort(arrayList);
    }

    /* renamed from: a */
    public final long mo62003a(int i) {
        return mo62020c(i).f114519b;
    }

    /* renamed from: b */
    public final byte mo62005b(int i) {
        int i2 = mo62020c(i).f114521d + bfnw.f114518g;
        if (i2 > 127) {
            return Byte.MAX_VALUE;
        }
        if (i2 < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) i2;
    }

    /* renamed from: c */
    public final bfnw mo62020c(int i) {
        return (bfnw) this.f114525b.get(i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.f114524a;
        long j2 = ((bfnx) obj).f114524a;
        if (j >= j2) {
            return j > j2 ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: d */
    public final long mo62009d() {
        return this.f114524a;
    }

    /* renamed from: e */
    public final bfnz[] mo62011e() {
        return this.f114526c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bfnx) {
            bfnx bfnx = (bfnx) obj;
            return this.f114524a == bfnx.f114524a && this.f114525b.equals(bfnx.f114525b);
        }
    }

    /* renamed from: f */
    public final boolean mo62013f() {
        bfnz[] bfnzArr = this.f114526c;
        return bfnzArr != null && bfnzArr.length > 0;
    }

    public final int hashCode() {
        long j = this.f114524a;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + this.f114525b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiFullScan [deliveryTime=");
        sb.append(this.f114524a);
        sb.append(", devices=[");
        ArrayList arrayList = this.f114525b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((bfnw) arrayList.get(i)).toString());
            sb.append(", ");
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo62006b() {
        return this.f114525b.size();
    }

    /* renamed from: d */
    public final long mo62022d(int i) {
        return mo62020c(i).f114523f;
    }
}
