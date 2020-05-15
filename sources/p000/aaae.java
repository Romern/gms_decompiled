package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: aaae */
final /* synthetic */ class aaae implements Runnable {

    /* renamed from: a */
    private final aaaf f27825a;

    /* renamed from: b */
    private final Status f27826b;

    public aaae(aaaf aaaf, Status status) {
        this.f27825a = aaaf;
        this.f27826b = status;
    }

    public final void run() {
        bljb a;
        bljb a2;
        aaaf aaaf = this.f27825a;
        Status status = this.f27826b;
        try {
            a = blkh.m107281a("ServicePostProcessing");
            for (aaak aaak : aaaf.f27828b.f27836g) {
                aaak.mo16663a(aaaf.f27827a, status);
            }
            if (a != null) {
                a.close();
            }
            a2 = blkh.m107281a("GlobalPostProcessing");
            for (aaak aaak2 : aaag.f27831b) {
                aaak2.mo16663a(aaaf.f27827a, status);
            }
            if (a2 != null) {
                a2.close();
            }
            aaaf.f27828b.f27834e.onAfterExecution();
            return;
            throw th;
            throw th;
        } catch (Throwable th) {
            aaaf.f27828b.f27834e.onAfterExecution();
            throw th;
        }
    }
}
