package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: wyr */
final /* synthetic */ class wyr implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private final wys f51582a;

    public wyr(wys wys) {
        this.f51582a = wys;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        wwk wwk = this.f51582a.f51583a;
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        wwk.mo29482a(121, wwk.f51476a);
        wwk.f51478c.mo18611i();
        return true;
    }
}
