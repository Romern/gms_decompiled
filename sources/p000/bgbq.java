package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bgbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbq {

    /* renamed from: b */
    private static bgbq f116004b;

    /* renamed from: a */
    private final qws f116005a;

    public bgbq(Context context) {
        this.f116005a = new qws(context, "LE", null);
    }

    /* renamed from: a */
    public static synchronized bgbq m98540a(Context context) {
        bgbq bgbq;
        synchronized (bgbq.class) {
            bgbq = new bgbq(context);
            f116004b = bgbq;
        }
        return bgbq;
    }

    /* renamed from: a */
    public final void mo62620a(bugr bugr, int i) {
        if (cezb.m138453b()) {
            mo62621a(bugr, i, 3);
        }
    }

    /* renamed from: a */
    public final void mo62621a(bugr bugr, int i, int i2) {
        bxvd da = bpkj.f137973d.mo74144da();
        long a = bugr.mo72639a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpkj bpkj = (bpkj) da.f164949b;
        bpkj.f137975a |= 1;
        bpkj.f137976b = a;
        int c = bugr.mo72647c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpkj bpkj2 = (bpkj) da.f164949b;
        bpkj2.f137975a |= 2;
        bpkj2.f137977c = c;
        bpkj bpkj3 = (bpkj) da.mo74062i();
        bxvd da2 = bpkp.f137997e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpkp bpkp = (bpkp) da2.f164949b;
        bpkj3.getClass();
        bpkp.f138000b = bpkj3;
        int i3 = bpkp.f137999a | 1;
        bpkp.f137999a = i3;
        bpkp.f138001c = i2 - 1;
        int i4 = i3 | 2;
        bpkp.f137999a = i4;
        bpkp.f137999a = i4 | 4;
        bpkp.f138002d = i;
        bpkp bpkp2 = (bpkp) da2.mo74062i();
        bxvd da3 = bpkl.f137979g.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpkl bpkl = (bpkl) da3.f164949b;
        bpkl.f137982b = 4;
        int i5 = bpkl.f137981a | 1;
        bpkl.f137981a = i5;
        bpkp2.getClass();
        bpkl.f137986f = bpkp2;
        bpkl.f137981a = i5 | 16;
        mo62622a(da3);
    }

    /* renamed from: a */
    public final void mo62622a(bxvd bxvd) {
        bxvd da = bonq.f133833p.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonq bonq = (bonq) da.f164949b;
        bonq.f133836b = 8;
        bonq.f133835a |= 1;
        bpkl bpkl = (bpkl) bxvd.mo74062i();
        bpkl.getClass();
        bonq.f133844j = bpkl;
        bonq.f133835a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f116005a.mo24335a(((bonq) da.mo74062i()).serializeToBytes()).mo24327b();
    }

    /* renamed from: a */
    public final void mo62623a(String str) {
        if (cezb.m138454c()) {
            bxvd da = bpkn.f137992c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpkn bpkn = (bpkn) da.f164949b;
            str.getClass();
            bpkn.f137994a |= 2;
            bpkn.f137995b = str;
            bpkn bpkn2 = (bpkn) da.mo74062i();
            bxvd da2 = bpkl.f137979g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpkl bpkl = (bpkl) da2.f164949b;
            bpkl.f137982b = 3;
            int i = bpkl.f137981a | 1;
            bpkl.f137981a = i;
            bpkn2.getClass();
            bpkl.f137985e = bpkn2;
            bpkl.f137981a = i | 8;
            mo62622a(da2);
        }
    }
}
