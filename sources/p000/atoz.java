package p000;

import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.AcceptTosChimeraActivity;

/* renamed from: atoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atoz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AcceptTosChimeraActivity f90621a;

    public atoz(AcceptTosChimeraActivity acceptTosChimeraActivity) {
        this.f90621a = acceptTosChimeraActivity;
    }

    public final void run() {
        int i;
        Button button = this.f90621a.f108747e;
        if (!cgwn.m147270t()) {
            i = C0126R.string.accept_and_continue_label;
        } else {
            i = C0126R.string.accept_label;
        }
        button.setText(i);
        this.f90621a.f108745c = true;
    }
}
