package p000;

import android.view.View;

/* renamed from: tfn */
final /* synthetic */ class tfn implements View.OnClickListener {

    /* renamed from: a */
    private final tft f45867a;

    public tfn(tft tft) {
        this.f45867a = tft;
    }

    public void onClick(View view) {
        tft tft = this.f45867a;
        if (!tft.f45878a) {
            tft.f45880c.mo26568a(tio.SEE_MORE_BUTTON, tio.GENERIC_CARD);
            tft.f45878a = true;
            tft.f45879b.mo18001b();
            tft.f45881d.mo18005a();
            return;
        }
        tft.f45880c.mo26568a(tio.SEE_LESS_BUTTON, tio.GENERIC_CARD);
        tft.mo26475a();
    }
}
