package p000;

import android.view.View;

/* renamed from: aqum */
final /* synthetic */ class aqum implements View.OnLongClickListener {

    /* renamed from: a */
    private final aqun f86842a;

    /* renamed from: b */
    private final String f86843b;

    public aqum(aqun aqun, String str) {
        this.f86842a = aqun;
        this.f86843b = str;
    }

    public final boolean onLongClick(View view) {
        aqun aqun = this.f86842a;
        tey.m36885a(aqun.f86844c.getContext(), this.f86843b).show();
        return true;
    }
}
