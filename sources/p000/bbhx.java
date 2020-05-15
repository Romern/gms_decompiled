package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bbhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhx extends cazu {

    /* renamed from: b */
    private final cazn f102679b;

    /* renamed from: c */
    private final cazn f102680c;

    public bbhx(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bbhx.class), cijl);
        this.f102679b = cbac.m127643a(cazn);
        this.f102680c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return cbac.m127642a(this.f102679b.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        try {
            return bqga.m112775a((bbfw) ((cazm) obj).mo75194a());
        } catch (ExecutionException e) {
            return this.f102680c.mo75201b();
        }
    }
}
