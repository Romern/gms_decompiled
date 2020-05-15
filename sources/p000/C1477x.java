package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: x */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1477x {

    /* renamed from: a */
    final Executor f27545a;

    /* renamed from: b */
    public final C0034at f27546b;

    /* renamed from: c */
    final AtomicBoolean f27547c = new AtomicBoolean(true);

    /* renamed from: d */
    final AtomicBoolean f27548d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f27549e = new C1423v(this);

    /* renamed from: f */
    public C0915ct f27550f;

    /* renamed from: g */
    public C0077cf f27551g;

    /* renamed from: h */
    final /* synthetic */ C0073cc f27552h;

    /* renamed from: i */
    final /* synthetic */ C0913cs f27553i;

    /* renamed from: j */
    final /* synthetic */ Executor f27554j;

    /* renamed from: k */
    final /* synthetic */ Executor f27555k;

    /* renamed from: l */
    public final C0078cg f27556l;

    public C1477x(Executor executor, C0073cc ccVar, C0913cs csVar, Executor executor2, Executor executor3) {
        this.f27552h = ccVar;
        this.f27553i = csVar;
        this.f27554j = executor2;
        this.f27555k = executor3;
        new C1450w(this);
        this.f27545a = executor;
        this.f27546b = new C1396u(this);
        this.f27556l = new C0078cg();
    }
}
