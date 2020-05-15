package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ugw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ujx f47575a;

    /* renamed from: b */
    final /* synthetic */ Set f47576b;

    /* renamed from: c */
    final /* synthetic */ ugx f47577c;

    public ugw(ugx ugx, ujx ujx, Set set) {
        this.f47577c = ugx;
        this.f47575a = ujx;
        this.f47576b = set;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        uig a = this.f47577c.mo27366a(this.f47575a, uoh.f48391a);
        HashSet<String> hashSet = new HashSet(this.f47576b);
        try {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ujy ujy = (ujy) it.next();
                hashSet.remove(ujy.f47834b);
                if (!this.f47576b.contains(ujy.f47834b)) {
                    this.f47577c.mo27425b(ujy);
                }
            }
            a.close();
            long h = this.f47575a.mo27613h();
            for (String str : hashSet) {
                this.f47577c.mo27414a(new ujy(this.f47577c.f47578a, h, str));
            }
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
