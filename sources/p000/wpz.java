package p000;

import android.content.DialogInterface;

/* renamed from: wpz */
final /* synthetic */ class wpz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wqa f51120a;

    public wpz(wqa wqa) {
        this.f51120a = wqa;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wqa wqa = this.f51120a;
        wqa.f51121a.f51124c.clear();
        if (wqa.f51121a.getArguments().containsKey("memberId")) {
            wqa.f51121a.f51122a.mo18499g();
        } else {
            wqa.f51121a.f51122a.mo18500h();
        }
    }
}
