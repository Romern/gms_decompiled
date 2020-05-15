package p000;

import android.util.Log;

/* renamed from: apiu */
final /* synthetic */ class apiu implements Runnable {

    /* renamed from: a */
    private final apiz f84500a;

    public apiu(apiz apiz) {
        this.f84500a = apiz;
    }

    public final void run() {
        apiz apiz = this.f84500a;
        synchronized (apiz.f84514h.f84522a) {
            if (!apiz.f84511e) {
                String valueOf = String.valueOf(apiz.f84508b.f84518c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Enforcing binder timeout for ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TED", sb.toString());
                apiz.mo47331b();
            }
        }
    }
}
