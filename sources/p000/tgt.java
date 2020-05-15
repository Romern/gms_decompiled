package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgt */
final /* synthetic */ class tgt implements View.OnClickListener {

    /* renamed from: a */
    private final tgx f45975a;

    /* renamed from: b */
    private final bmxv f45976b;

    public tgt(tgx tgx, bmxv bmxv) {
        this.f45975a = tgx;
        this.f45976b = bmxv;
    }

    public void onClick(View view) {
        tgx tgx = this.f45975a;
        bmxv bmxv = this.f45976b;
        if (bmxv.mo66813a() && ((Intent) bmxv.mo66814b()).resolveActivity(tgx.f45981a.getContext().getPackageManager()) != null) {
            tgx.f45981a.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
