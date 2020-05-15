package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: duw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duw extends duq {

    /* renamed from: f */
    private final Set f14135f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public duw(bxcs bxcs) {
        super(duw.class, bxcs, (r0 == 0 ? 1 : r0) - 1, bxcl.INSTALLED_APPS_FENCE, new int[]{39});
        int a = bxcr.m122582a(bxcs.f162985a);
        this.f14135f = new HashSet();
    }

    /* renamed from: a */
    private final boolean m9469a() {
        for (bxkv bxkv : this.f14135f) {
            if (bxkv.f163801b.equals(((bxcs) this.f14076c).f162986b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        if (this.f14135f.size() == 0) {
            return mo9646b();
        }
        int i = this.f14075b;
        if (i == 1) {
            return mo9643a(m9469a());
        }
        if (i == 2) {
            return mo9643a(!m9469a());
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("duw", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("[InstalledAppsFenceImpl] Unknown trigger type=%s", this.f14075b);
        return mo9646b();
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.INSTALLED_APPS) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            int a2 = bxet.m122640a(bxeu.f163128b);
            if (a2 != 0 && a2 == 2) {
                bxcf bxcf = bxce.f162775h;
                if (bxcf == null) {
                    bxcf = bxcf.f162779a;
                }
                bxvj bxvj = bxku.f163795c;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxku.f163795c;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    this.f14135f.clear();
                    this.f14135f.addAll(((bxku) b).f163797a);
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("duw", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[InstalledAppsFenceImpl] No installed apps data.");
            }
        }
    }
}
