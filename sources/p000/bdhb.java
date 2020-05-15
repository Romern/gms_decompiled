package p000;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: bdhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdhb implements bdez, bdig {

    /* renamed from: a */
    private final bdfd f105619a;

    /* renamed from: b */
    private final cijl f105620b;

    /* renamed from: c */
    private final ArrayList f105621c = new ArrayList();

    /* renamed from: d */
    private boolean f105622d;

    public bdhb(bdfd bdfd, cijl cijl) {
        this.f105619a = bdfd;
        this.f105620b = cijl;
        bdfd.mo57955a(this);
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f105619a.mo57956b(this);
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        synchronized (this.f105621c) {
            if (!this.f105622d) {
                this.f105622d = true;
                this.f105619a.mo57956b(this);
                Iterator it = this.f105621c.iterator();
                while (it.hasNext()) {
                    bdhp.m90826a(bqga.m112776a((Runnable) it.next(), (Executor) this.f105620b.mo6445a()));
                }
                this.f105621c.clear();
            }
        }
    }
}
