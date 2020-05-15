package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: vlj */
final /* synthetic */ class vlj implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    static final DialogInterface.OnKeyListener f49439a = new vlj();

    private vlj() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener = vlk.f49440a;
        return i == 84;
    }
}
