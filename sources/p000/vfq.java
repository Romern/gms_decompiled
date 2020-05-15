package p000;

import java.util.Locale;

/* renamed from: vfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfq {
    /* renamed from: a */
    public static void m40318a(vfp vfp, ufe ufe, uhn uhn, uey uey, ukk ukk, uml uml) {
        uhn.mo27435d();
        try {
            ujx a = uhn.mo27402a(uey, ukk);
            if (!a.mo27565aa().equals(uml)) {
                if (!uml.mo27696b() && !uml.mo27697c()) {
                    a.mo27560a(uml.UNPINNED);
                    a.mo27627m(false);
                } else if (a.mo27605e()) {
                    a.mo27560a(uml);
                    a.mo27627m(false);
                } else {
                    throw new aaaj(10, String.format(Locale.US, "Pinning is not enabled for this document: %s", a.mo27610g()));
                }
                uhn.mo27442f();
                uhn.mo27439e();
                if (!uml.mo27696b()) {
                    synchronized (vfp.f49194g) {
                        vfn vfn = (vfn) vfp.f49194g.get(ukk);
                        if (vfn != null) {
                            uga uga = vfn.f49177a;
                            if (uga != null) {
                                uga.mo27305a();
                            }
                        }
                        try {
                            vfp.mo28399a(vfp.f49189b.mo27402a(uey, ukk));
                        } catch (uaa e) {
                        }
                    }
                    ufe.mo27275a();
                    return;
                }
                vfp.mo28398a();
                return;
            }
            uhn.mo27442f();
            uhn.mo27439e();
        } catch (uaa e2) {
            throw new aaaj(1502, "Drive item not found, or you are not authorized to access it.");
        } catch (Throwable th) {
            uhn.mo27439e();
            throw th;
        }
    }
}
