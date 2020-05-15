package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aclv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclv extends brhj {

    /* renamed from: a */
    protected final brhj f60131a;

    /* renamed from: b */
    public final List f60132b = new ArrayList();

    /* renamed from: c */
    public final List f60133c = new ArrayList();

    /* renamed from: d */
    public int f60134d;

    /* renamed from: e */
    private final int f60135e;

    /* renamed from: f */
    private final int f60136f;

    /* renamed from: g */
    private aucf f60137g = new aucf();

    /* renamed from: h */
    private aucf f60138h = new aucf();

    public aclv(brhj brhj, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34974b(i2 <= 0 ? false : z2);
        this.f60131a = brhj;
        this.f60135e = i;
        this.f60136f = i2;
    }

    /* renamed from: a */
    public final synchronized aucb mo32869a(brhy... brhyArr) {
        auck auck;
        boolean z = true;
        if (brhyArr.length != 1) {
            z = false;
        }
        sdo.m34974b(z);
        if (!this.f60133c.isEmpty()) {
            mo32874b();
        }
        Collections.addAll(this.f60132b, brhyArr);
        auck = this.f60137g.f91388a;
        if (this.f60134d == 0 || this.f60132b.size() >= this.f60135e) {
            mo32871a();
        }
        return auck;
    }

    /* renamed from: b */
    public final aucb mo32872b(brhy... brhyArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final aucb mo32873b(String... strArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo32874b() {
        aclu aclu = new aclu(this, this.f60138h);
        this.f60133c.clear();
        this.f60138h = new aucf();
        this.f60131a.mo32870a((String[]) this.f60133c.toArray(new String[0])).mo50371a(aclu);
    }

    /* renamed from: a */
    public final synchronized aucb mo32870a(String... strArr) {
        auck auck;
        boolean z = true;
        if (strArr.length != 1) {
            z = false;
        }
        sdo.m34974b(z);
        if (!this.f60132b.isEmpty()) {
            mo32871a();
        }
        Collections.addAll(this.f60133c, strArr);
        auck = this.f60138h.f91388a;
        if (this.f60134d == 0 || this.f60133c.size() >= this.f60136f) {
            mo32874b();
        }
        return auck;
    }

    /* renamed from: a */
    public final void mo32871a() {
        aclu aclu = new aclu(this, this.f60137g);
        this.f60132b.clear();
        this.f60137g = new aucf();
        this.f60131a.mo32869a((brhy[]) this.f60132b.toArray(new brhy[0])).mo50371a(aclu);
    }
}
