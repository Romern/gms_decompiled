package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqkc extends AlertDialog {

    /* renamed from: a */
    public final aqke f86269a;

    public aqkc(Context context, aqka aqka, Bundle bundle) {
        super(context);
        this.f86269a = new aqke(context, aqka, bundle);
        setTitle(aqka.f86265l);
        setButton(-1, context.getText(C0126R.string.close_button_label), new aqkb());
        setView(this.f86269a.f86270a.mo26027a());
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f86269a.f86270a.mo26031a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }
}
