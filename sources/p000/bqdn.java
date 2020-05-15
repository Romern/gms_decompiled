package p000;

/* renamed from: bqdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdn extends bqdg {
    /* renamed from: a */
    public final void mo69126a(bqds bqds, bqds bqds2) {
        bqds.next = bqds2;
    }

    /* renamed from: a */
    public final void mo69127a(bqds bqds, Thread thread) {
        bqds.thread = thread;
    }

    /* renamed from: a */
    public final boolean mo69128a(bqdt bqdt, bqdk bqdk, bqdk bqdk2) {
        synchronized (bqdt) {
            if (bqdt.listeners != bqdk) {
                return false;
            }
            bqdt.listeners = bqdk2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo69129a(bqdt bqdt, bqds bqds, bqds bqds2) {
        synchronized (bqdt) {
            if (bqdt.waiters != bqds) {
                return false;
            }
            bqdt.waiters = bqds2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo69130a(bqdt bqdt, Object obj, Object obj2) {
        synchronized (bqdt) {
            boolean z = bqdt.f140525j;
            if (bqdt.value != obj) {
                return false;
            }
            bqdt.value = obj2;
            return true;
        }
    }
}
