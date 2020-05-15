package p000;

/* renamed from: fnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnr extends flm {
    public fnr(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        super.mo10890a();
        aeat.m51532a(mo10939f().getApplicationContext()).mo33986a("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.analytics.AnalyticsTaskService");
    }

    /* renamed from: b */
    public final void mo11015b() {
        super.mo11015b();
        aeat.m51532a(mo10939f()).mo33986a("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.analytics.AnalyticsTaskService");
    }

    /* renamed from: a */
    public final void mo11014a(long j) {
        mo10926a("Scheduling task with Gcm. Time", Long.valueOf(j));
        aeat a = aeat.m51532a(mo10939f().getApplicationContext());
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.analytics.AnalyticsTaskService";
        aebi.mo34004a(j / 1000, ((j + j) / 1000) + 1);
        aebi.f63099k = "Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG";
        aebi.mo34027b(1);
        aebi.f63102n = true;
        a.mo33984a(aebi.mo33974b());
    }
}
