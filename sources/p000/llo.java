package p000;

import android.text.Editable;
import java.util.function.Consumer;

/* renamed from: llo */
final /* synthetic */ class llo implements Consumer {

    /* renamed from: a */
    private final llz f26325a;

    public llo(llz llz) {
        this.f26325a = llz;
    }

    public final void accept(Object obj) {
        llz llz = this.f26325a;
        llz.f26350q.setVisibility(8);
        llz.f26160b.putCharSequence("PaymentFixFlowActivityController::cardholder_name", (Editable) obj);
        llz.mo15265k();
    }
}
