package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: apjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjc {

    /* renamed from: a */
    public final Object f84522a = new Object();

    /* renamed from: b */
    public final C1223np f84523b = new C1223np();

    /* renamed from: c */
    public final aamf f84524c;

    /* renamed from: d */
    public final Looper f84525d;

    /* renamed from: e */
    public final ScheduledExecutorService f84526e = snp.m35703a(1, 10);

    /* renamed from: f */
    public final skh f84527f;

    public apjc(aamf aamf, Looper looper) {
        this.f84524c = aamf;
        this.f84525d = looper;
        this.f84527f = skh.m35531a();
    }

    /* renamed from: a */
    static int m70442a() {
        int i = Build.VERSION.SDK_INT;
        return cdnj.f181319a.mo6606a().mo77991N() ? 261 : 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo47339a(apiz apiz) {
        synchronized (this.f84522a) {
            Context b = this.f84524c.mo17012b(0);
            if (b != null) {
                this.f84523b.remove(apiz.f84508b);
                if (!apiz.f84512f) {
                    apiz.f84512f = true;
                    List list = apiz.f84507a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        apjb apjb = (apjb) list.get(i);
                        if (!apjb.f84520a.mo50393b((Object) 2048)) {
                            apjb.f84521b.mo47293a(1);
                        }
                    }
                    apiz.f84507a.clear();
                    apiz.mo47329a(b);
                }
            } else {
                String valueOf = String.valueOf(apiz.f84508b.f84518c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unable to get context for ");
                sb.append(valueOf);
                Log.e("NetworkScheduler.TED", sb.toString());
            }
        }
    }
}
