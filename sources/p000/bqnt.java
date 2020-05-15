package p000;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: bqnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqnt {

    /* renamed from: a */
    private final bqsh f141319a;

    private bqnt(bqsh bqsh) {
        this.f141319a = bqsh;
    }

    /* renamed from: a */
    public static bqnt m113060a() {
        return new bqnt((bqsh) bqsj.f141531c.mo74144da());
    }

    /* renamed from: c */
    private final synchronized int m113063c() {
        int d;
        d = m113065d();
        while (m113062a(d)) {
            d = m113065d();
        }
        return d;
    }

    /* renamed from: d */
    private static int m113065d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: b */
    public final synchronized bqns mo69309b() {
        return bqns.m113055a((bqsj) this.f141319a.mo74062i());
    }

    /* renamed from: c */
    private final synchronized bqsi m113064c(bqsf bqsf) {
        bxvd da;
        bqsd a = bqok.m113103a(bqsf);
        int c = m113063c();
        int b = bqsq.m113326b(bqsf.f141518c);
        if (b == 0) {
            b = 1;
        }
        if (b == 2) {
            b = 3;
        }
        da = bqsi.f141525e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqsi bqsi = (bqsi) da.f164949b;
        a.getClass();
        bqsi.f141527a = a;
        bqsi.f141529c = c;
        bqsi.f141528b = bqse.m113311a(3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqsi) da.f164949b).f141530d = bqsq.m113325a(b);
        return (bqsi) da.mo74062i();
    }

    /* renamed from: b */
    public final synchronized void mo69310b(bqsf bqsf) {
        mo69308a(bqsf);
    }

    /* renamed from: a */
    public static bqnt m113061a(bqns bqns) {
        bqsj bqsj = bqns.f141318a;
        bxvd bxvd = (bxvd) bqsj.mo74142c(5);
        bxvd.mo73625a((bxvk) bqsj);
        return new bqnt((bqsh) bxvd);
    }

    /* renamed from: a */
    private final synchronized boolean m113062a(int i) {
        boolean z;
        Iterator it = Collections.unmodifiableList(((bqsj) this.f141319a.f164949b).f141534b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((bqsi) it.next()).f141529c == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo69308a(bqsf bqsf) {
        bqsi c = m113064c(bqsf);
        this.f141319a.mo69327a(c);
        bqsh bqsh = this.f141319a;
        int i = c.f141529c;
        if (bqsh.f164950c) {
            bqsh.mo74035c();
            bqsh.f164950c = false;
        }
        bqsj bqsj = bqsj.f141531c;
        ((bqsj) bqsh.f164949b).f141533a = i;
    }
}
