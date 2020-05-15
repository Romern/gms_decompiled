package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfo */
final /* synthetic */ class tfo implements View.OnClickListener {

    /* renamed from: a */
    private final tft f45868a;

    /* renamed from: b */
    private final bmxv f45869b;

    public tfo(tft tft, bmxv bmxv) {
        this.f45868a = tft;
        this.f45869b = bmxv;
    }

    public void onClick(View view) {
        tft tft = this.f45868a;
        bmxv bmxv = this.f45869b;
        if (((Intent) bmxv.mo66814b()).resolveActivity(tft.f45882e.getContext().getPackageManager()) != null) {
            tft.f45880c.mo26568a(tio.GENERIC_CARD_ENTRY, tio.GENERIC_CARD);
            tft.f45882e.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
