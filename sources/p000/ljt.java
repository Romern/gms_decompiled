package p000;

import android.content.Intent;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: ljt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljt implements lis {

    /* renamed from: a */
    private static final Object f26213a = new Object();

    /* renamed from: b */
    private final DataIntent$ResultTransformer f26214b;

    /* renamed from: c */
    private final int f26215c;

    /* renamed from: d */
    private final Intent f26216d;

    /* renamed from: e */
    private final kqn f26217e;

    /* renamed from: f */
    private final bmxv f26218f;

    /* renamed from: g */
    private final FillForm f26219g;

    /* renamed from: h */
    private final kck f26220h;

    public ljt(DataIntent$ResultTransformer dataIntent$ResultTransformer, int i, Intent intent, kqn kqn, bmxv bmxv, FillForm fillForm, kck kck) {
        this.f26214b = dataIntent$ResultTransformer;
        this.f26215c = i;
        this.f26216d = intent;
        this.f26217e = kqn;
        this.f26218f = bmxv;
        this.f26219g = fillForm;
        this.f26220h = kck;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return f26213a;
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        Object a = this.f26214b.mo7934a(this.f26215c, this.f26216d);
        if (a == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        kct a2 = kct.m17647a(a, kcs.m17644a("", ""));
        if (this.f26218f.mo66813a()) {
            return bqdx.m112673a(((kqn) this.f26218f.mo66814b()).mo14816b(kql.m18340a(this.f26219g, this.f26220h, bnic.m109489a(a2))), new ljs(a2), bqfb.INSTANCE);
        }
        kbz kbz = (kbz) this.f26217e.mo14815a(kql.m18340a(this.f26219g, this.f26220h, bnic.m109489a(a2))).mo14790a().get(a2);
        if (kbz == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        return bqga.m112775a(bmxv.m108566b(new Intent().putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", kbz.f23732a)));
    }
}
