package p000;

import android.os.Process;

/* renamed from: anaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anaj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ anak f76483a;

    public anaj(anak anak) {
        this.f76483a = anak;
    }

    public final void run() {
        amvm amvm;
        Thread thread;
        Process.setThreadPriority(10);
        try {
            anak anak = this.f76483a;
            anak.f76485b.mo41592a(anak.f76486c);
            anak anak2 = this.f76483a;
            amvm = anak2.f76487d;
            thread = anak2.f76484a;
        } catch (amyc e) {
            amvm.m63392c(this.f76483a.f76484a);
            this.f76483a.f76487d.mo41390a(e.f76366a);
            anak anak3 = this.f76483a;
            amvm = anak3.f76487d;
            thread = anak3.f76484a;
        } catch (Exception e2) {
            amvm.m63392c(this.f76483a.f76484a);
            this.f76483a.f76487d.mo41390a(e2);
            anak anak4 = this.f76483a;
            amvm = anak4.f76487d;
            thread = anak4.f76484a;
        } catch (Throwable th) {
            anak anak5 = this.f76483a;
            anak5.f76487d.mo41392b(anak5.f76484a);
            this.f76483a.f76484a = null;
            throw th;
        }
        amvm.mo41392b(thread);
        this.f76483a.f76484a = null;
    }
}
