package p000;

import android.os.Handler;
import java.util.Map;

/* renamed from: buha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class buha {

    /* renamed from: a */
    private final C1223np f153801a = new C1223np();

    /* renamed from: b */
    private final Handler f153802b;

    public buha(Handler handler) {
        if (handler != null) {
            this.f153802b = handler;
            return;
        }
        throw new IllegalArgumentException("'handler' cannot be null.");
    }

    /* renamed from: a */
    private final bugz mo72632a(bugo bugo, Handler handler) {
        bugz bugz = (bugz) this.f153801a.get(bugo);
        if (bugz != null) {
            return bugz;
        }
        bugz bugz2 = new bugz(handler);
        this.f153801a.put(bugo, bugz2);
        return bugz2;
    }

    /* renamed from: c */
    public final void mo72652c(bugo bugo) {
        mo72653c(bugo, this.f153802b);
    }

    /* renamed from: d */
    public final void mo72654d(bugo bugo) {
        if (bugo != null) {
            synchronized (this.f153801a) {
                this.f153801a.remove(bugo);
            }
        }
    }

    /* renamed from: c */
    public final void mo72653c(bugo bugo, Handler handler) {
        if (bugo == null) {
            throw new IllegalArgumentException("Argument 'callback' cannot be null");
        } else if (handler != null) {
            synchronized (this.f153801a) {
                bugz a = mo72632a(bugo, handler);
                synchronized (a.f153799b) {
                    a.f153800c = true;
                    a.f153799b.clear();
                }
            }
        } else {
            throw new IllegalArgumentException("Argument 'handler' cannot be null");
        }
    }

    /* renamed from: a */
    public final void mo72649a(int i, bugn bugn, bugr bugr, buhd buhd) {
        C1223np npVar;
        boolean z;
        bugx bugx = new bugx(bugn, bugr, buhd);
        synchronized (this.f153801a) {
            npVar = new C1223np(this.f153801a);
        }
        for (Map.Entry entry : npVar.entrySet()) {
            bugo bugo = (bugo) entry.getKey();
            bugz bugz = (bugz) entry.getValue();
            synchronized (bugz.f153799b) {
                z = true;
                if (!bugz.f153800c && !bugz.f153799b.contains(Integer.valueOf(i))) {
                    z = false;
                }
            }
            if (z) {
                bugz.f153798a.post(new bugy(bugx, bugo));
            }
        }
    }

    /* renamed from: a */
    public final void mo72650a(int i, bugo bugo) {
        mo72651a(i, bugo, this.f153802b);
    }

    /* renamed from: a */
    public final void mo72651a(int i, bugo bugo, Handler handler) {
        if (bugo == null) {
            throw new IllegalArgumentException("Argument 'callback' cannot be null");
        } else if (handler != null) {
            synchronized (this.f153801a) {
                bugz a = mo72632a(bugo, handler);
                synchronized (a.f153799b) {
                    if (!a.f153800c) {
                        a.f153799b.add(Integer.valueOf(i));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Argument 'handler' cannot be null");
        }
    }
}
