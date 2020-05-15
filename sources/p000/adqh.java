package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqh extends cazu {

    /* renamed from: b */
    private final cazn f62486b;

    /* renamed from: c */
    private final cazn f62487c;

    /* renamed from: d */
    private final cijl f62488d;

    /* renamed from: e */
    private final cijl f62489e;

    /* renamed from: f */
    private final cijl f62490f;

    /* renamed from: g */
    private final cijl f62491g;

    /* renamed from: h */
    private final cijl f62492h;

    /* renamed from: i */
    private final cazn f62493i;

    /* renamed from: j */
    private final cazn f62494j;

    public adqh(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(adqh.class), cijl);
        this.f62486b = cbac.m127643a(cazn);
        this.f62487c = cbac.m127643a(cazn2);
        this.f62488d = cijl3;
        this.f62489e = cijl4;
        this.f62490f = cijl5;
        this.f62491g = cijl6;
        this.f62492h = cijl7;
        this.f62493i = cbac.m127643a(cazn3);
        this.f62494j = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62486b.mo75201b(), this.f62493i.mo75201b(), this.f62494j.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cazn cazn = this.f62487c;
        cijl cijl = this.f62488d;
        cijl cijl2 = this.f62489e;
        cijl cijl3 = this.f62490f;
        cijl cijl4 = this.f62491g;
        cijl cijl5 = this.f62492h;
        adqo adqo = (adqo) list.get(1);
        Executor executor = (Executor) list.get(2);
        if (!adqn.m51003a((Context) list.get(0))) {
            if (ceqm.m137878i()) {
                adnt.m50874c("Mediastore access denied");
            }
            ((adqs) cijl).mo6445a().mo33721b();
            return adqn.m51000a(((adps) cijl2).mo6445a(), ((adpq) cijl3).mo6445a(), ((adpu) cijl5).mo6445a(), ((adpr) cijl4).mo6445a(), executor);
        }
        adqn.m51002a(((adps) cijl2).mo6445a(), ((adpq) cijl3).mo6445a(), ((adpr) cijl4).mo6445a(), ((adpu) cijl5).mo6445a());
        adqo.mo33712c();
        return cazn.mo75201b();
    }
}
