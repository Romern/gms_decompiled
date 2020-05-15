package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jcc */
public final /* synthetic */ class jcc implements bmxj {

    /* renamed from: a */
    private final String f22146a;

    /* renamed from: b */
    private final List f22147b;

    /* renamed from: c */
    private final int f22148c;

    public jcc(String str, List list, int i) {
        this.f22146a = str;
        this.f22147b = list;
        this.f22148c = i;
    }

    public final Object apply(Object obj) {
        int i;
        String str = this.f22146a;
        List list = this.f22147b;
        int i2 = this.f22148c;
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
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((jbf) list.get(i3)).f22086a);
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = bxwc.size();
        for (int i4 = 0; i4 < size2; i4++) {
            jbf jbf = (jbf) bxwc.get(i4);
            if (!arrayList.contains(jbf.f22086a)) {
                i = 0;
            } else {
                i = i2;
            }
            bxvd bxvd = (bxvd) jbf.mo74142c(5);
            bxvd.mo73625a((bxvk) jbf);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            jbf jbf2 = jbf.f22084e;
            ((jbf) bxvd.f164949b).f22089d = i;
            arrayList2.add((jbf) bxvd.mo74062i());
        }
        jbd jbd2 = jbd.f22078d;
        str.getClass();
        bxww bxww2 = jbb.f22076a;
        if (bxww2.containsKey(str)) {
            jbd2 = (jbd) bxww2.get(str);
        }
        bxvd bxvd2 = (bxvd) jbd2.mo74142c(5);
        bxvd2.mo73625a((bxvk) jbd2);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((jbd) bxvd2.f164949b).f22081b = bxvk.m124030de();
        bxvd2.mo74119x(arrayList2);
        bxvd bxvd3 = (bxvd) jbb.mo74142c(5);
        bxvd3.mo73625a((bxvk) jbb);
        bxvd3.mo74003a(str, (jbd) bxvd2.mo74062i());
        return (jbb) bxvd3.mo74062i();
    }
}
