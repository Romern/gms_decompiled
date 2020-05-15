package p000;

/* renamed from: agil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agil extends agme {
    public agil(agmn agmn) {
        super(agmn);
    }

    /* renamed from: a */
    public final void mo35454a(long j) {
        aeat a = aeat.m51532a(mo35542z());
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.measurement.PackageMeasurementTaskService";
        aebi.mo34004a(j / 1000, ((j + j) / 1000) + 1);
        aebi.f63099k = "Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG";
        aebi.mo34027b(1);
        aebi.f63102n = true;
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    public final void mo35455b() {
        super.mo35455b();
        aeat.m51532a(mo35542z()).mo33986a("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        aeat.m51532a(mo35542z()).mo33986a("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
        return super.mo35305a();
    }
}
