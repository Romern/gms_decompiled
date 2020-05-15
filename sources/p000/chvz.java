package p000;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* renamed from: chvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chvz extends chwp {

    /* renamed from: p */
    private final CronetEngine f189308p;

    /* renamed from: q */
    private boolean f189309q;

    /* renamed from: r */
    private int f189310r;

    /* renamed from: s */
    private boolean f189311s;

    /* renamed from: t */
    private int f189312t;

    private chvz(String str, int i, CronetEngine cronetEngine) {
        super(InetSocketAddress.createUnresolved(str, i), ciag.m149910a(str, i));
        bmxy.m108582a(cronetEngine, "cronetEngine");
        this.f189308p = cronetEngine;
    }

    /* renamed from: a */
    public static chvz m149656a(String str, int i, CronetEngine cronetEngine) {
        bmxy.m108582a(cronetEngine, "cronetEngine");
        return new chvz(str, i, cronetEngine);
    }

    /* renamed from: a */
    public final void mo85717a(int i) {
        this.f189309q = true;
        this.f189310r = i;
    }

    /* renamed from: b */
    public final void mo85718b(int i) {
        this.f189311s = true;
        this.f189312t = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final chxx mo85716a() {
        return new chvw(new chvy(this.f189308p, this.f189309q, this.f189310r, this.f189311s, this.f189312t), bqfb.INSTANCE, this.f189408o.mo86027a());
    }
}
