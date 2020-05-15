package p000;

import java.util.Arrays;

/* renamed from: bnia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnia extends bngk {

    /* renamed from: d */
    Object[] f131653d;

    /* renamed from: e */
    private int f131654e;

    public bnia() {
        super(4);
    }

    /* renamed from: a */
    public bnic mo67751a() {
        bnic bnic;
        Object[] objArr;
        int i = this.f131596b;
        if (i == 0) {
            return bnon.f131923a;
        }
        if (i == 1) {
            return bnic.m109489a(this.f131595a[0]);
        }
        if (this.f131653d != null && bnic.m109498b(i) == this.f131653d.length) {
            if (bnic.m109497a(this.f131596b, this.f131595a.length)) {
                objArr = Arrays.copyOf(this.f131595a, this.f131596b);
            } else {
                objArr = this.f131595a;
            }
            int i2 = this.f131654e;
            Object[] objArr2 = this.f131653d;
            bnic = new bnon(objArr, i2, objArr2, objArr2.length - 1, this.f131596b);
        } else {
            bnic = bnic.m109487a(this.f131596b, this.f131595a);
            this.f131596b = bnic.size();
        }
        this.f131597c = true;
        this.f131653d = null;
        return bnic;
    }

    /* renamed from: b */
    public final void mo67752b(Iterable iterable) {
        bmxy.m108581a(iterable);
        if (this.f131653d != null) {
            for (Object obj : iterable) {
                mo67629b(obj);
            }
            return;
        }
        super.mo67626a(iterable);
    }

    /* renamed from: c */
    public void mo67629b(Object obj) {
        int length;
        bmxy.m108581a(obj);
        if (this.f131653d == null || bnic.m109498b(this.f131596b) > (length = this.f131653d.length)) {
            this.f131653d = null;
            super.mo67627a(obj);
            return;
        }
        int i = length - 1;
        int hashCode = obj.hashCode();
        int a = bngg.m109304a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.f131653d;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                objArr[i2] = obj;
                this.f131654e += hashCode;
                super.mo67627a(obj);
                return;
            } else if (!obj2.equals(obj)) {
                a = i2 + 1;
            } else {
                return;
            }
        }
    }

    public bnia(int i) {
        super(i);
        this.f131653d = new Object[bnic.m109498b(i)];
    }

    /* renamed from: b */
    public final void mo67753b(Object... objArr) {
        if (this.f131653d != null) {
            for (Object obj : objArr) {
                mo67629b(obj);
            }
            return;
        }
        super.mo67628a(objArr);
    }
}
