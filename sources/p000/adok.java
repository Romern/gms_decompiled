package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adok extends cazu {

    /* renamed from: b */
    private final cazn f62277b;

    /* renamed from: c */
    private final cazn f62278c;

    /* renamed from: d */
    private final cazn f62279d;

    /* renamed from: e */
    private final cazn f62280e;

    public adok(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(adok.class), cijl);
        this.f62277b = cbac.m127643a(cazn);
        this.f62278c = cbac.m127643a(cazn2);
        this.f62279d = cbac.m127643a(cazn3);
        this.f62280e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62277b.mo75201b(), this.f62278c.mo75201b(), this.f62280e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return bqdx.m112673a(this.f62279d.mo75201b(), new adoi((Boolean) list.get(0), (Boolean) list.get(1)), (Executor) list.get(2));
    }
}
