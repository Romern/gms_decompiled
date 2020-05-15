package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: avfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfh {

    /* renamed from: a */
    private final avcd f93081a;

    public avfh(avcd avcd) {
        this.f93081a = avcd;
    }

    /* renamed from: a */
    private static int m78428a(boolean z) {
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private static boolean m78430b(int i) {
        return i == 3;
    }

    /* renamed from: a */
    private final boolean m78429a(int i) {
        return this.f93081a.mo51144b().contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final bxok mo51193b() {
        bxvd da = bxok.f164161d.mo74144da();
        List a = this.f93081a.mo51142a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bxrq bxrq = (bxrq) a.get(i);
            if (m78429a(bxrq.f164589b)) {
                int i2 = bxrq.f164589b;
                int i3 = 1;
                if (i2 == 9) {
                    int a2 = bxsn.m123069a(bxrq.f164591d);
                    if (a2 != 0) {
                        i3 = a2;
                    }
                    boolean b = m78430b(i3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxok bxok = (bxok) da.f164949b;
                    bxok.f164163a |= 2;
                    bxok.f164165c = b;
                } else if (i2 == 10) {
                    int a3 = bxsn.m123069a(bxrq.f164591d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    boolean b2 = m78430b(a3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxok bxok2 = (bxok) da.f164949b;
                    bxok2.f164163a |= 1;
                    bxok2.f164164b = b2;
                }
            }
        }
        return (bxok) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo51191a(bxok bxok) {
        ArrayList arrayList = new ArrayList();
        if (m78429a(9)) {
            bxvd da = bxsd.f164664d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxsd bxsd = (bxsd) da.f164949b;
            bxsd.f164666a |= 1;
            bxsd.f164667b = 9;
            int a = m78428a(bxok.f164165c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxsd bxsd2 = (bxsd) da.f164949b;
            bxsd2.f164668c = a - 1;
            bxsd2.f164666a |= 2;
            arrayList.add((bxsd) da.mo74062i());
        }
        if (m78429a(10)) {
            bxvd da2 = bxsd.f164664d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxsd bxsd3 = (bxsd) da2.f164949b;
            bxsd3.f164666a |= 1;
            bxsd3.f164667b = 10;
            int a2 = m78428a(bxok.f164164b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxsd bxsd4 = (bxsd) da2.f164949b;
            bxsd4.f164668c = a2 - 1;
            bxsd4.f164666a |= 2;
            arrayList.add((bxsd) da2.mo74062i());
        }
        this.f93081a.mo51143a((bxsd[]) arrayList.toArray(new bxsd[0]));
    }

    /* renamed from: a */
    public final boolean mo51192a() {
        return m78429a(9) || m78429a(10);
    }
}
