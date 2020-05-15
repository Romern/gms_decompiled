package p000;

import com.google.android.chimera.Activity;

/* renamed from: adbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbs extends C0053bl implements C1504y {

    /* renamed from: a */
    private static final Long f61349a = -1L;

    /* renamed from: d */
    private long f61350d = f61349a.longValue();

    /* renamed from: e */
    private final bmyl f61351e;

    /* renamed from: f */
    private long f61352f;

    /* renamed from: g */
    private long f61353g = 0;

    public adbs(C0013ak akVar, bmyl bmyl) {
        this.f61351e = bmyl;
        akVar.getLifecycle().mo557a(this);
    }

    /* renamed from: a */
    public static void m50134a(Activity activity, C0013ak akVar, bmyl bmyl) {
        adbs adbs = (adbs) adcj.m50162a(activity, new adbr(akVar, bmyl)).mo3444a(adbs.class);
    }

    /* renamed from: c */
    public final void mo5c() {
        if (this.f61350d == f61349a.longValue()) {
            this.f61350d = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }

    /* renamed from: b */
    public final void mo4b() {
        this.f61353g += System.currentTimeMillis() - this.f61350d;
        this.f61350d = f61349a.longValue();
    }

    /* renamed from: a */
    public final void mo2a() {
        this.f61352f = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
        if (akVar.getLifecycle().mo556a().equals(C0007ae.DESTROYED)) {
            akVar.getLifecycle().mo558b(this);
            this.f61351e.mo12292a(new adbt(this.f61352f, System.currentTimeMillis(), this.f61353g, null));
        }
    }
}
