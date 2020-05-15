package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: tgs */
final /* synthetic */ class tgs implements tid {

    /* renamed from: a */
    private final tgx f45973a;

    /* renamed from: b */
    private final bmxv f45974b;

    public tgs(tgx tgx, bmxv bmxv) {
        this.f45973a = tgx;
        this.f45974b = bmxv;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        tgx tgx = this.f45973a;
        bmxv bmxv2 = this.f45974b;
        if (bmxv.mo66813a()) {
            tgx.f45982b.setImageDrawable(new BitmapDrawable(tgx.f45981a.getResources(), (Bitmap) bmxv.mo66814b()));
            tgx.f45982b.setVisibility(0);
            tgx.f45982b.setOnClickListener(new tgv(tgx, bmxv2));
        }
    }
}
