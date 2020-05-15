package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfq */
final /* synthetic */ class tfq implements View.OnClickListener {

    /* renamed from: a */
    private final tft f45872a;

    /* renamed from: b */
    private final bmxv f45873b;

    public tfq(tft tft, bmxv bmxv) {
        this.f45872a = tft;
        this.f45873b = bmxv;
    }

    public void onClick(View view) {
        tft tft = this.f45872a;
        bmxv bmxv = this.f45873b;
        if (((Intent) bmxv.mo66814b()).resolveActivity(tft.f45882e.getContext().getPackageManager()) != null) {
            tft.f45880c.mo26568a(tio.GENERIC_CARD_ALTERNATE_ICON, tio.GENERIC_CARD);
            tft.f45882e.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
