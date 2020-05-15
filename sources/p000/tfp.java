package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfp */
final /* synthetic */ class tfp implements View.OnClickListener {

    /* renamed from: a */
    private final tft f45870a;

    /* renamed from: b */
    private final bmxv f45871b;

    public tfp(tft tft, bmxv bmxv) {
        this.f45870a = tft;
        this.f45871b = bmxv;
    }

    public void onClick(View view) {
        tft tft = this.f45870a;
        bmxv bmxv = this.f45871b;
        if (((Intent) bmxv.mo66814b()).resolveActivity(tft.f45882e.getContext().getPackageManager()) != null) {
            tft.f45880c.mo26568a(tio.GENERIC_CARD_PRIMARY_ICON, tio.GENERIC_CARD);
            tft.f45882e.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
