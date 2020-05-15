package p000;

import com.google.android.gms.ocr.base.Boundaries;

/* renamed from: akuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akuw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boundaries f72923a;

    /* renamed from: b */
    final /* synthetic */ akuy f72924b;

    public akuw(akuy akuy, Boundaries boundaries) {
        this.f72924b = akuy;
        this.f72923a = boundaries;
    }

    public final void run() {
        akvb akvb = this.f72924b.f72930d;
        if (akvb != null) {
            akvb.mo39736a(this.f72923a);
        }
    }
}
