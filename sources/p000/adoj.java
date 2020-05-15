package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoj extends cazu {

    /* renamed from: b */
    private final cazn f62269b;

    /* renamed from: c */
    private final cazn f62270c;

    /* renamed from: d */
    private final cijl f62271d;

    /* renamed from: e */
    private final cijl f62272e;

    /* renamed from: f */
    private final cijl f62273f;

    /* renamed from: g */
    private final cijl f62274g;

    /* renamed from: h */
    private final cijl f62275h;

    /* renamed from: i */
    private final cazn f62276i;

    public adoj(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7, cazn cazn3) {
        super(cijl2, cbag.m127657a(adoj.class), cijl);
        this.f62269b = cbac.m127643a(cazn);
        this.f62270c = cbac.m127643a(cazn2);
        this.f62271d = cijl3;
        this.f62272e = cijl4;
        this.f62273f = cijl5;
        this.f62274g = cijl6;
        this.f62275h = cijl7;
        this.f62276i = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62269b.mo75201b(), this.f62276i.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cazn cazn = this.f62270c;
        cijl cijl = this.f62271d;
        cijl cijl2 = this.f62272e;
        cijl cijl3 = this.f62273f;
        cijl cijl4 = this.f62274g;
        cijl cijl5 = this.f62275h;
        Executor executor = (Executor) list.get(1);
        if (!adqn.m51003a((Context) list.get(0))) {
            if (ceqm.m137878i()) {
                adnt.m50874c("Mediastore access denied");
            }
            ((adqs) cijl5).mo6445a().mo33721b();
            return adqn.m51000a(((adps) cijl).mo6445a(), ((adpq) cijl2).mo6445a(), ((adpu) cijl4).mo6445a(), ((adpr) cijl3).mo6445a(), executor);
        }
        adqn.m51002a(((adps) cijl).mo6445a(), ((adpq) cijl2).mo6445a(), ((adpr) cijl3).mo6445a(), ((adpu) cijl4).mo6445a());
        return cazn.mo75201b();
    }
}
