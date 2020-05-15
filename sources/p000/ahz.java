package p000;

/* renamed from: ahz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahz extends ahs {
    /* renamed from: a */
    public final void mo732a(aia aia, aia aia2) {
        aia.next = aia2;
    }

    /* renamed from: a */
    public final void mo733a(aia aia, Thread thread) {
        aia.thread = thread;
    }

    /* renamed from: a */
    public final boolean mo734a(aib aib, ahw ahw, ahw ahw2) {
        synchronized (aib) {
            if (aib.listeners != ahw) {
                return false;
            }
            aib.listeners = ahw2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo735a(aib aib, aia aia, aia aia2) {
        synchronized (aib) {
            if (aib.waiters != aia) {
                return false;
            }
            aib.waiters = aia2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo736a(aib aib, Object obj, Object obj2) {
        synchronized (aib) {
            if (aib.value != obj) {
                return false;
            }
            aib.value = obj2;
            return true;
        }
    }
}
