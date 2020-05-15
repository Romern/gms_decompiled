package p000;

import android.content.Intent;

/* renamed from: ljs */
final /* synthetic */ class ljs implements bmxj {

    /* renamed from: a */
    private final kct f26212a;

    public ljs(kct kct) {
        this.f26212a = kct;
    }

    public final Object apply(Object obj) {
        kbz kbz = (kbz) ((kqm) obj).mo14790a().get(this.f26212a);
        return kbz != null ? bmxv.m108566b(new Intent().putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", kbz.f23732a)) : bmvz.f131120a;
    }
}
