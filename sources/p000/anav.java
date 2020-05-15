package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: anav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anav {

    /* renamed from: a */
    private final Context f76516a;

    /* renamed from: b */
    private final anaz f76517b;

    /* renamed from: c */
    private final bmza f76518c;

    /* renamed from: d */
    private Long f76519d = 0L;

    public anav(Context context, anaz anaz, bmza bmza) {
        this.f76516a = context;
        this.f76517b = anaz;
        this.f76518c = bmza;
    }

    /* renamed from: a */
    public final void mo41626a() {
        this.f76518c.mo66929c();
        this.f76518c.mo66930d();
        this.f76519d = Long.valueOf(System.nanoTime() / 1000);
    }

    /* renamed from: a */
    public final void mo41627a(String str, int i) {
        this.f76518c.mo66931e();
        anba h = anbb.m63898h();
        h.f76520a = str;
        h.mo41644a(this.f76519d.longValue());
        h.mo41647b(this.f76518c.mo66928a(TimeUnit.MICROSECONDS));
        h.mo41646b(i);
        h.mo41645a(false);
        h.f76521b = almn.m61290a(this.f76516a);
        h.mo41643a(0);
        this.f76517b.mo41633a(h.mo41642a());
    }

    /* renamed from: a */
    public final void mo41628a(String str, int i, int i2) {
        this.f76518c.mo66931e();
        anba h = anbb.m63898h();
        h.f76520a = str;
        h.mo41644a(this.f76519d.longValue());
        h.mo41647b(this.f76518c.mo66928a(TimeUnit.MICROSECONDS));
        h.mo41646b(i);
        h.mo41645a(true);
        h.f76521b = almn.m61290a(this.f76516a);
        h.mo41643a(i2);
        this.f76517b.mo41633a(h.mo41642a());
    }
}
