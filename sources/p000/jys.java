package p000;

import android.view.View;

/* renamed from: jys */
final /* synthetic */ class jys implements View.OnClickListener {

    /* renamed from: a */
    private final imh f23546a;

    public jys(imh imh) {
        this.f23546a = imh;
    }

    public void onClick(View view) {
        imh imh = this.f23546a;
        kaa.f23599d.mo25412b("onNativeSecondaryActionHit", new Object[0]);
        ((kaa) imh).mo14280f("window.nativeSecondaryActionHit()");
    }
}
