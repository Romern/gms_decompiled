package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bryr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryr implements bryo {

    /* renamed from: b */
    public static final chqn f143673b = chqn.m149404a("com.google.frameworks.client.data.android.metrics.MutableMetricsContext");

    /* renamed from: c */
    public final brum f143674c;

    /* renamed from: d */
    public final AtomicBoolean f143675d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f143676e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicInteger f143677f = new AtomicInteger(0);

    /* renamed from: g */
    public final AtomicInteger f143678g = new AtomicInteger(0);

    /* renamed from: h */
    public final AtomicInteger f143679h = new AtomicInteger(0);

    /* renamed from: i */
    public final AtomicInteger f143680i = new AtomicInteger(-1);

    /* renamed from: j */
    public final AtomicLong f143681j = new AtomicLong(-1);

    /* renamed from: k */
    public final AtomicLong f143682k = new AtomicLong(-1);

    /* renamed from: l */
    public final AtomicLong f143683l = new AtomicLong(-1);

    /* renamed from: m */
    public final AtomicReference f143684m = new AtomicReference(null);

    public bryr(brum brum) {
        this.f143674c = brum;
    }

    /* renamed from: a */
    public final void mo70086a() {
        bmxy.m108601b(!this.f143676e.getAndSet(true), "Already recorded cache lookup.");
    }
}
