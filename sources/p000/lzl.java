package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: lzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzl implements lzr {

    /* renamed from: a */
    public final lvn f33276a = new lvn("PlaySetupServiceV2Helper");

    /* renamed from: b */
    public final lzt f33277b;

    /* renamed from: c */
    public final String f33278c;

    /* renamed from: d */
    private final ScheduledExecutorService f33279d;

    /* renamed from: e */
    private final boolean f33280e = cckw.f179263a.mo6606a().mo76211A();

    /* renamed from: f */
    private mcj f33281f;

    /* renamed from: g */
    private mcj f33282g;

    public lzl(Context context, ScheduledExecutorService scheduledExecutorService, String str) {
        lzt lzt = new lzt(context, scheduledExecutorService);
        this.f33277b = lzt;
        bmxy.m108581a(scheduledExecutorService);
        this.f33279d = scheduledExecutorService;
        this.f33278c = str;
    }

    /* renamed from: a */
    public static final Bundle m24713a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("caller_id", str);
        bundle.putInt("update_types", -1);
        return bundle;
    }

    /* renamed from: b */
    public final synchronized bqgg mo19782b() {
        if (this.f33280e) {
            this.f33276a.mo25412b("Trying to resume app updates for %s", this.f33278c);
            if (this.f33281f != null) {
                this.f33276a.mo25412b("Pause updates was requested before, cancelling", new Object[0]);
                this.f33281f.cancel(true);
                this.f33281f = null;
            }
            if (this.f33282g == null) {
                this.f33276a.mo25412b("Resume app updates was not requested before, requesting now", new Object[0]);
                this.f33282g = new mcj(new lzi(this), this.f33279d, (int) cckw.m130268f(), null, mat.m24776a(cckw.m130269g(), TimeUnit.MILLISECONDS));
                this.f33277b.f33296f.remove(this);
            }
            return this.f33282g;
        }
        return bqga.m112777a((Throwable) new lzk());
    }

    /* renamed from: c */
    public final synchronized void mo19783c() {
        lzt lzt = this.f33277b;
        lzt.f33292b.mo25412b("Unbinding from the service", new Object[0]);
        try {
            skh.m35531a().mo25689a(lzt.f33293c, lzt);
        } catch (IllegalArgumentException | IllegalStateException e) {
            lzt.f33292b.mo25410a(e);
        }
    }

    /* renamed from: d */
    public final void mo19784d() {
    }

    /* renamed from: e */
    public final synchronized void mo19785e() {
        if (this.f33281f != null) {
            this.f33276a.mo25412b("Service was disconnected and pause updates request was in-flight for %s, re-requesting", this.f33278c);
            this.f33281f = null;
            bqga.m112781a(mo19781a(), new lzj(this), this.f33279d);
        }
    }

    /* renamed from: a */
    public final synchronized bqgg mo19781a() {
        if (this.f33280e) {
            this.f33276a.mo25412b("Trying to pause app updates for %s", this.f33278c);
            if (this.f33282g != null) {
                this.f33276a.mo25412b("Resume updates was requested before, cancelling", new Object[0]);
                this.f33282g.cancel(true);
                this.f33282g = null;
            }
            if (this.f33281f == null) {
                this.f33276a.mo25412b("Pause app updates was not requested before, requesting now", new Object[0]);
                this.f33281f = new mcj(new lzh(this), this.f33279d, (int) cckw.m130268f(), null, mat.m24776a(cckw.m130269g(), TimeUnit.MILLISECONDS));
                this.f33277b.f33296f.add(this);
            }
            return this.f33281f;
        }
        return bqga.m112777a((Throwable) new lzk());
    }
}
