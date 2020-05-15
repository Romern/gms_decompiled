package p000;

import android.content.pm.PackageManager;

/* renamed from: hpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hpm implements hep {

    /* renamed from: a */
    private final String f20172a;

    /* renamed from: b */
    private final hep f20173b;

    /* renamed from: c */
    private final String f20174c;

    public hpm(String str, String str2, hep hep) {
        sdo.m34977c(str);
        this.f20172a = str;
        sdo.m34959a(hep);
        this.f20173b = hep;
        this.f20174c = str2;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return this.f20173b.mo12290a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (p000.bmyx.m108640a(',').mo66920b().mo66917a().mo66925c((java.lang.CharSequence) r3.f20174c).contains(p000.spn.m35867b(p000.rpr.m34216b(), r3.f20172a, "SHA-256")) != false) goto L_0x003d;
     */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        if (!"".equals(this.f20174c)) {
            if (!"*".equals(this.f20174c)) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            return this.f20173b.mo12291a(hez);
        }
        throw adbe.m50106a(28443);
    }
}
