package p000;

import java.util.ArrayList;

/* renamed from: vqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqv {

    /* renamed from: a */
    private static final bnic f49823a = bnic.m109489a("!");

    /* renamed from: a */
    public static bmxz m41075a(String str) {
        bmxz bmxz;
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108643a(";").mo66918a((CharSequence) str)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : bmyx.m108643a(",").mo66918a((CharSequence) str2)) {
                vqu vqu = new vqu(str3);
                String a = vqu.mo28754a(f49823a);
                vqr vqr = (vqr) vqu.mo28753a(bnhe.m109412a("MAC", vqt.MAC, "NAM", vqt.NAME, "MAJ", vqq.MAJOR_CLASS, "CLS", vqq.CLASS, "PROF", vqo.f49804a));
                if (vqr != null) {
                    bmxz = vqr.mo28752a(vqu);
                    if (a != null) {
                        bmxz = bmyf.m108613a(bmxz);
                    }
                } else {
                    bmxz = bmyd.ALWAYS_FALSE;
                }
                arrayList2.add(bmxz);
            }
            arrayList.add(new bmya(bmyf.m108616a((Iterable) arrayList2)));
        }
        return new bmye(bmyf.m108616a((Iterable) arrayList));
    }
}
