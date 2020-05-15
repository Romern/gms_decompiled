package p000;

import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: exl */
final /* synthetic */ class exl implements View.OnKeyListener {

    /* renamed from: a */
    private final exx f15983a;

    public exl(exx exx) {
        this.f15983a = exx;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        exx exx = this.f15983a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        new adzt(Looper.getMainLooper()).post(new exj(exx));
        return true;
    }
}
