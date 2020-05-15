package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bnkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnkw implements Iterator {

    /* renamed from: a */
    int f131786a;

    /* renamed from: b */
    int f131787b = -1;

    /* renamed from: c */
    bnlc f131788c;

    /* renamed from: d */
    AtomicReferenceArray f131789d;

    /* renamed from: e */
    bnkx f131790e;

    /* renamed from: f */
    bnlv f131791f;

    /* renamed from: g */
    bnlv f131792g;

    /* renamed from: h */
    final /* synthetic */ bnlw f131793h;

    public bnkw(bnlw bnlw) {
        this.f131793h = bnlw;
        this.f131786a = bnlw.f131825c.length - 1;
        mo67960a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67960a() {
        this.f131791f = null;
        if (!mo67962b() && !mo67963c()) {
            while (true) {
                int i = this.f131786a;
                if (i >= 0) {
                    bnlc[] bnlcArr = this.f131793h.f131825c;
                    this.f131786a = i - 1;
                    bnlc bnlc = bnlcArr[i];
                    this.f131788c = bnlc;
                    if (bnlc.f131796b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.f131788c.f131799e;
                        this.f131789d = atomicReferenceArray;
                        this.f131787b = atomicReferenceArray.length() - 1;
                        if (mo67963c()) {
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
    public final boolean mo67962b() {
        bnkx bnkx = this.f131790e;
        if (bnkx == null) {
            return false;
        }
        while (true) {
            this.f131790e = bnkx.mo67951c();
            bnkx bnkx2 = this.f131790e;
            if (bnkx2 == null) {
                return false;
            }
            if (mo67961a(bnkx2)) {
                return true;
            }
            bnkx = this.f131790e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo67963c() {
        while (true) {
            int i = this.f131787b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f131789d;
            this.f131787b = i - 1;
            bnkx bnkx = (bnkx) atomicReferenceArray.get(i);
            this.f131790e = bnkx;
            if (bnkx != null && (mo67961a(bnkx) || mo67962b())) {
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final bnlv mo67964d() {
        bnlv bnlv = this.f131791f;
        if (bnlv != null) {
            this.f131792g = bnlv;
            mo67960a();
            return this.f131792g;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f131791f != null;
    }

    public final void remove() {
        bndz.m109115a(this.f131792g != null);
        this.f131793h.remove(this.f131792g.f131819a);
        this.f131792g = null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo67961a(bnkx bnkx) {
        Object obj;
        try {
            Object a = bnkx.mo67949a();
            if (bnkx.mo67949a() != null) {
                obj = bnkx.mo67952d();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f131791f = new bnlv(this.f131793h, a, obj);
                this.f131788c.mo67992d();
                return true;
            }
            this.f131788c.mo67992d();
            return false;
        } catch (Throwable th) {
            this.f131788c.mo67992d();
            throw th;
        }
    }
}
