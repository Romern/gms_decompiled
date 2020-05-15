package p000;

import java.util.List;
import java.util.Map;

/* renamed from: chvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chvm {

    /* renamed from: a */
    public final /* synthetic */ chqk f189272a;

    /* renamed from: b */
    final /* synthetic */ chvp f189273b;

    public chvm(chvp chvp, chqk chqk) {
        this.f189273b = chvp;
        this.f189272a = chqk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        if (r2 != r9) goto L_0x000c;
     */
    /* renamed from: a */
    public final void mo85712a(Map map) {
        chtr chtr;
        try {
            synchronized (this.f189273b) {
                chvp chvp = this.f189273b;
                Map map2 = chvp.f189286d;
                if (map2 == null) {
                }
                chtr chtr2 = new chtr();
                if (map != null) {
                    for (String str : map.keySet()) {
                        if (!str.endsWith("-bin")) {
                            chtn a = chtn.m149535a(str, chtr.f189134b);
                            for (String str2 : (List) map.get(str)) {
                                chtr2.mo85648a(a, str2);
                            }
                        } else {
                            chtn a2 = chtn.m149536a(str, chtr.f189133a);
                            for (String str3 : (List) map.get(str)) {
                                chtr2.mo85648a(a2, boan.f132470d.mo68796b(str3));
                            }
                        }
                    }
                }
                chvp.f189285c = chtr2;
                this.f189273b.f189286d = map;
                chtr = this.f189273b.f189285c;
            }
            this.f189272a.mo85540a(chtr);
        } catch (Throwable th) {
            this.f189272a.mo85539a(chuv.f189223j.mo85687a("Failed to convert credential metadata").mo85692c(th));
        }
    }
}
