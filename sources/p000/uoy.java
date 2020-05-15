package p000;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uoy {

    /* renamed from: b */
    private static final sbw f48443b = new sbw("CallbackSet", "");

    /* renamed from: a */
    public final Object f48444a = new Object();

    /* renamed from: c */
    private final Set f48445c = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27803a() {
        synchronized (this.f48445c) {
            this.f48445c.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo27806b() {
        boolean isEmpty;
        synchronized (this.f48445c) {
            isEmpty = this.f48445c.isEmpty();
        }
        return isEmpty;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo27804a(uox uox) {
        bngx a;
        boolean removeAll;
        synchronized (this.f48445c) {
            bngs b = bngx.m109371b(this.f48445c.size());
            b.mo67666b((Iterable) this.f48445c);
            a = b.mo67664a();
        }
        bngs j = bngx.m109377j();
        bnre i = a.listIterator();
        while (i.hasNext()) {
            uqi uqi = (uqi) i.next();
            try {
                if (!uox.mo27802a(uqi)) {
                    f48443b.mo25372b("CallbackSet", "Callback is no longer needed; removing");
                    j.mo67668c(uqi);
                }
            } catch (RemoteException e) {
                f48443b.mo25373b("CallbackSet", "Callback caused RemoteException; removing", e);
                j.mo67668c(uqi);
            }
        }
        synchronized (this.f48445c) {
            removeAll = this.f48445c.removeAll(j.mo67664a());
        }
        return removeAll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo27807b(uqi uqi) {
        boolean remove;
        synchronized (this.f48445c) {
            remove = this.f48445c.remove(uqi);
        }
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo27805a(uqi uqi) {
        boolean add;
        synchronized (this.f48444a) {
            synchronized (this.f48445c) {
                add = this.f48445c.add(uqi);
            }
        }
        return add;
    }
}
