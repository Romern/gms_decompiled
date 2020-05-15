package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bnav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnav implements Iterator {

    /* renamed from: a */
    int f131320a;

    /* renamed from: b */
    int f131321b = -1;

    /* renamed from: c */
    bnbe f131322c;

    /* renamed from: d */
    AtomicReferenceArray f131323d;

    /* renamed from: e */
    bncc f131324e;

    /* renamed from: f */
    bnca f131325f;

    /* renamed from: g */
    bnca f131326g;

    /* renamed from: h */
    final /* synthetic */ bncb f131327h;

    public bnav(bncb bncb) {
        this.f131327h = bncb;
        this.f131320a = bncb.f131418d.length - 1;
        mo67022a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67022a() {
        this.f131325f = null;
        if (!mo67024b() && !mo67025c()) {
            while (true) {
                int i = this.f131320a;
                if (i >= 0) {
                    bnbe[] bnbeArr = this.f131327h.f131418d;
                    this.f131320a = i - 1;
                    bnbe bnbe = bnbeArr[i];
                    this.f131322c = bnbe;
                    if (bnbe.f131350b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.f131322c.f131354f;
                        this.f131323d = atomicReferenceArray;
                        this.f131321b = atomicReferenceArray.length() - 1;
                        if (mo67025c()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo67024b() {
        bncc bncc = this.f131324e;
        if (bncc == null) {
            return false;
        }
        while (true) {
            this.f131324e = bncc.mo66992b();
            bncc bncc2 = this.f131324e;
            if (bncc2 == null) {
                return false;
            }
            if (mo67023a(bncc2)) {
                return true;
            }
            bncc = this.f131324e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo67025c() {
        while (true) {
            int i = this.f131321b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f131323d;
            this.f131321b = i - 1;
            bncc bncc = (bncc) atomicReferenceArray.get(i);
            this.f131324e = bncc;
            if (bncc != null && (mo67023a(bncc) || mo67024b())) {
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final bnca mo67026d() {
        bnca bnca = this.f131325f;
        if (bnca != null) {
            this.f131326g = bnca;
            mo67022a();
            return this.f131326g;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f131325f != null;
    }

    public final void remove() {
        bmxy.m108600b(this.f131326g != null);
        this.f131327h.remove(this.f131326g.f131410a);
        this.f131326g = null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo67023a(bncc bncc) {
        try {
            long a = this.f131327h.f131430p.mo15379a();
            Object d = bncc.mo66997d();
            bncb bncb = this.f131327h;
            Object obj = null;
            if (bncc.mo66997d() != null) {
                Object obj2 = bncc.mo66988a().get();
                if (obj2 != null) {
                    if (!bncb.mo67092a(bncc, a)) {
                        obj = obj2;
                    }
                }
            }
            if (obj != null) {
                this.f131325f = new bnca(this.f131327h, d, obj);
                this.f131322c.mo67061e();
                return true;
            }
            this.f131322c.mo67061e();
            return false;
        } catch (Throwable th) {
            this.f131322c.mo67061e();
            throw th;
        }
    }
}
