package p000;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: blif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blif implements Runnable {

    /* renamed from: a */
    final /* synthetic */ blii f126609a;

    public blif(blii blii) {
        this.f126609a = blii;
    }

    public final void run() {
        while (!this.f126609a.f126615c.isShutdown()) {
            try {
                blig blig = ((blih) this.f126609a.f126614b.remove()).f126612a;
                int i = blig.f126610b;
                blig.mo69138b((Object) null);
            } catch (InterruptedException e) {
                try {
                    this.f126609a.f126615c.execute(this);
                    return;
                } catch (RejectedExecutionException e2) {
                    for (blih blih : blii.f126613a.keySet()) {
                        blih.f126612a.mo69136a((Throwable) e2);
                    }
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.f126609a.f126615c.execute(this);
                } catch (RejectedExecutionException e3) {
                    for (blih blih2 : blii.f126613a.keySet()) {
                        blih2.f126612a.mo69136a((Throwable) e3);
                    }
                }
                throw th;
            }
        }
        try {
            this.f126609a.f126615c.execute(this);
        } catch (RejectedExecutionException e4) {
            for (blih blih3 : blii.f126613a.keySet()) {
                blih3.f126612a.mo69136a((Throwable) e4);
            }
        }
    }
}
