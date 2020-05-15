package p000;

import java.util.NoSuchElementException;

/* renamed from: bndp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bndp extends bnrd {

    /* renamed from: a */
    private Object f131494a;

    protected bndp(Object obj) {
        this.f131494a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo67005a(Object obj);

    public final boolean hasNext() {
        return this.f131494a != null;
    }

    public final Object next() {
        if (hasNext()) {
            try {
                Object obj = this.f131494a;
                this.f131494a = mo67005a(obj);
                return obj;
            } catch (Throwable th) {
                this.f131494a = mo67005a(this.f131494a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
