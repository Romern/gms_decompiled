package p000;

import java.util.concurrent.Executor;

/* renamed from: bars */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bars implements cayy {

    /* renamed from: a */
    private final cijl f101632a;

    /* renamed from: b */
    private final cijl f101633b;

    /* renamed from: c */
    private final cijl f101634c;

    /* renamed from: d */
    private final cijl f101635d;

    public bars(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f101632a = cijl;
        this.f101633b = cijl2;
        this.f101634c = cijl3;
        this.f101635d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        barw barw = (barw) this.f101632a.mo6445a();
        accv b = accx.m48946b();
        b.getClass();
        bame bame = new bame(new barl(b), new barm(b, ((baar) this.f101633b).mo6445a(), cayx.m127580b(this.f101634c), barw, (Executor) this.f101635d.mo6445a()));
        cazf.m127593a(bame, "Cannot return null from a non-@Nullable @Provides method");
        return bame;
    }
}
