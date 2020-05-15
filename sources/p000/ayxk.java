package p000;

import java.util.List;
import java.util.Map;

/* renamed from: ayxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxk {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0.f164952m.mo73911a(r6.f164958d) == false) goto L_0x0049;
     */
    /* renamed from: a */
    public static void m85037a(aywp aywp, List list) {
        boolean z;
        while (aywp != null) {
            aywu a = aywp.mo54483a();
            boolean z2 = false;
            if (a != null) {
                bptu bptu = a.f98654c;
                if (bptu == null) {
                    bptu = bptu.f139179e;
                }
                if ((bptu.f139181a & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108601b(z, "Instrumented view has no VE ID.");
                list.add(a);
            }
            aywp aywp2 = (aywp) aywp.f98637b.mo54498h();
            if (aywp2 == null) {
                if (!aywp.f98637b.mo54491a()) {
                    bxvj bxvj = azag.f98830a;
                    Map map = GeneratedMessageLite.f164959aj;
                    a.mo74135a(bxvj);
                }
                z2 = true;
                bmxy.m108605b(z2, "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s", aywp);
                return;
            }
            aywp = aywp2;
        }
    }
}
