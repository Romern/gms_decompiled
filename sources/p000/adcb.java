package p000;

import java.lang.ref.Reference;

/* renamed from: adcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adcb {

    /* renamed from: a */
    private volatile Reference f61359a = mo33308a(null);

    /* renamed from: b */
    private final bmzi f61360b;

    /* renamed from: c */
    private final Object f61361c;

    public adcb(bmzi bmzi) {
        this.f61360b = bmzi;
        this.f61361c = new Object();
    }

    /* renamed from: a */
    public final Object mo33309a() {
        Object obj;
        Object obj2 = this.f61359a.get();
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this.f61361c) {
            obj = this.f61359a.get();
            if (obj == null) {
                obj = this.f61360b.mo6606a();
                this.f61359a = mo33308a(obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Reference mo33308a(Object obj);
}
