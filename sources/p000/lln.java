package p000;

import android.text.Editable;
import java.util.function.Consumer;

/* renamed from: lln */
final /* synthetic */ class lln implements Consumer {

    /* renamed from: a */
    private final llz f26324a;

    public lln(llz llz) {
        this.f26324a = llz;
    }

    public final void accept(Object obj) {
        llz llz = this.f26324a;
        String obj2 = ((Editable) obj).toString();
        String replaceAll = obj2.replaceAll("[^\\d]", "");
        if (replaceAll.length() > 4) {
            replaceAll = replaceAll.substring(0, 4);
        }
        StringBuilder sb = new StringBuilder(replaceAll);
        if (replaceAll.length() > 1) {
            sb.insert(2, " / ");
        }
        String sb2 = sb.toString();
        llz.f26347n.setText(sb2);
        llz.f26160b.putCharSequence("PaymentFixFlowActivityController::expiration_date", sb);
        if (obj2.endsWith(" /")) {
            llz.f26347n.setSelection(2);
        } else {
            llz.f26347n.setSelection(sb2.length());
        }
        llz.mo15265k();
    }
}
