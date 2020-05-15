package p000;

/* renamed from: apkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apkv implements aubq {

    /* renamed from: a */
    private final aplb f84642a;

    /* renamed from: b */
    private final apik f84643b;

    /* renamed from: c */
    private final aapx f84644c;

    public apkv(aplb aplb, apik apik, aapx aapx) {
        this.f84642a = aplb;
        this.f84643b = apik;
        this.f84644c = aapx;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int intValue = ((Integer) aucb.mo50386d()).intValue();
        if (apje.m70447b(intValue)) {
            aplb aplb = this.f84642a;
            aplb.f84662h.mo47254c(this.f84644c);
            return;
        }
        aplb aplb2 = this.f84642a;
        apik apik = this.f84643b;
        aplb2.f84662h.mo47246a(apik.f84459a, 4);
        aplb2.f84662h.mo47245a(aplb2.mo47386d(), apik, apka.m70510d(intValue));
        if (cdnj.f181319a.mo6606a().mo77998b()) {
            synchronized (aplb2.f84655a) {
                aplb2.mo47381a(intValue, apik);
            }
            return;
        }
        aplb2.mo47381a(intValue, apik);
    }
}
