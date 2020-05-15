package p000;

import java.util.ArrayList;

/* renamed from: jca */
final /* synthetic */ class jca implements bmxj {

    /* renamed from: a */
    private final String f22140a;

    /* renamed from: b */
    private final jbf f22141b;

    /* renamed from: c */
    private final String f22142c;

    /* renamed from: d */
    private final int f22143d;

    public jca(String str, jbf jbf, String str2, int i) {
        this.f22140a = str;
        this.f22141b = jbf;
        this.f22142c = str2;
        this.f22143d = i;
    }

    public final Object apply(Object obj) {
        String str = this.f22140a;
        jbf jbf = this.f22141b;
        String str2 = this.f22142c;
        int i = this.f22143d;
        jbb jbb = (jbb) obj;
        imn imn = jcf.f22150a;
        jbd jbd = jbd.f22078d;
        str.getClass();
        bxww bxww = jbb.f22076a;
        if (bxww.containsKey(str)) {
            jbd = (jbd) bxww.get(str);
        }
        bxwc bxwc = jbd.f22081b;
        ArrayList arrayList = new ArrayList();
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            jbf jbf2 = (jbf) bxwc.get(i2);
            if (!jbf.f22086a.equals(jbf2.f22086a)) {
                arrayList.add(jbf2);
            } else {
                bxvd bxvd = (bxvd) jbf2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) jbf2);
                str2.getClass();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                jbf jbf3 = (jbf) bxvd.f164949b;
                jbf jbf4 = jbf.f22084e;
                bxww bxww2 = jbf3.f22088c;
                if (!bxww2.f165014a) {
                    jbf3.f22088c = bxww2.mo74203a();
                }
                jbf3.f22088c.put(str2, Integer.valueOf(i));
                arrayList.add((jbf) bxvd.mo74062i());
            }
        }
        jbd jbd2 = jbd.f22078d;
        str.getClass();
        bxww bxww3 = jbb.f22076a;
        if (bxww3.containsKey(str)) {
            jbd2 = (jbd) bxww3.get(str);
        }
        bxvd bxvd2 = (bxvd) jbd2.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) jbd2);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((jbd) bxvd2.f164949b).f22081b = GeneratedMessageLite.m124030de();
        bxvd2.mo74119x(arrayList);
        bxvd bxvd3 = (bxvd) jbb.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) jbb);
        bxvd3.mo74003a(str, (jbd) bxvd2.mo74062i());
        return (jbb) bxvd3.mo74062i();
    }
}
