package p000;

import com.google.android.gms.ocr.credit.base.CreditCardResult;
import java.util.Collections;

/* renamed from: akse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akse implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CreditCardResult f72609a;

    /* renamed from: b */
    final /* synthetic */ aksg f72610b;

    public akse(aksg aksg, CreditCardResult creditCardResult) {
        this.f72610b = aksg;
        this.f72609a = creditCardResult;
    }

    public final void run() {
        if (this.f72610b.mo39803f()) {
            this.f72610b.mo39683a(false);
            this.f72610b.f72402a.mo39725b();
            this.f72610b.f72402a.mo39727c();
            this.f72610b.f72616o.vibrate(50);
            this.f72610b.f72411j.mo39695a(Collections.singletonList(this.f72609a));
        }
    }
}
