package p000;

import org.chromium.net.CronetException;

/* renamed from: cisl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisy f191330a;

    /* renamed from: b */
    final /* synthetic */ cisx f191331b;

    public cisl(cisx cisx, cisy cisy) {
        this.f191331b = cisx;
        this.f191330a = cisy;
    }

    public final void run() {
        try {
            this.f191330a.mo86442a();
        } catch (Throwable th) {
            this.f191331b.mo86479a((CronetException) new cirj("System error", th));
        }
    }
}
