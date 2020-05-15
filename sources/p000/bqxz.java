package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: bqxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqxz extends WeakReference {

    /* renamed from: a */
    private final int f141930a;

    public bqxz(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f141930a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bqxz bqxz = (bqxz) obj;
        return this.f141930a == bqxz.f141930a && get() == bqxz.get();
    }

    public final int hashCode() {
        return this.f141930a;
    }
}
