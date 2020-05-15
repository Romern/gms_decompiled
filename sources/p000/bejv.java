package p000;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: bejv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bejv {

    /* renamed from: a */
    public Executor f111685a;

    /* renamed from: b */
    public befa f111686b;

    /* renamed from: c */
    private beis f111687c = belt.f111802a;

    /* renamed from: d */
    private final HashMap f111688d = new HashMap();

    /* renamed from: e */
    private bely f111689e;

    /* renamed from: a */
    public final beju mo60766a() {
        return new beju(this.f111685a, this.f111686b, this.f111687c, this.f111688d, this.f111689e);
    }

    /* renamed from: a */
    public final void mo60767a(beis beis, bely bely) {
        this.f111687c = beis;
        this.f111689e = bely;
    }

    /* renamed from: a */
    public final void mo60768a(belj belj) {
        String a = belj.mo60754a(beir.ALLOWED);
        bmxy.m108596a(!this.f111688d.containsKey(a), "There is already a factory registered for the ID %s", a);
        this.f111688d.put(a, belj);
    }
}
