package p000;

import android.view.View;

/* renamed from: atvp */
final /* synthetic */ class atvp implements View.OnClickListener {

    /* renamed from: a */
    private final atvu f91016a;

    public atvp(atvu atvu) {
        this.f91016a = atvu;
    }

    public void onClick(View view) {
        new atvm().show(this.f91016a.f91026b.getSupportFragmentManager(), (String) null);
    }
}
