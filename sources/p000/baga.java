package p000;

import android.util.Pair;
import java.util.List;

/* renamed from: baga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baga implements bafv {

    /* renamed from: a */
    public final babm f100762a;

    /* renamed from: b */
    public final bamq f100763b;

    /* renamed from: c */
    public final banf f100764c;

    /* renamed from: d */
    public final banf f100765d;

    /* renamed from: e */
    public final banj f100766e;

    /* renamed from: f */
    public final bamr f100767f;

    /* renamed from: g */
    public final cayo f100768g;

    /* renamed from: h */
    private final cayo f100769h;

    /* renamed from: i */
    private final bafz f100770i;

    /* renamed from: j */
    private final int f100771j;

    public baga(cayo cayo, babm babm, bamq bamq, banf banf, banf banf2, banj banj, bamr bamr, cayo cayo2, bafz bafz, int i) {
        this.f100769h = cayo;
        this.f100762a = babm;
        this.f100763b = bamq;
        this.f100764c = banf;
        this.f100765d = banf2;
        this.f100766e = banj;
        this.f100767f = bamr;
        this.f100768g = cayo2;
        this.f100770i = bafz;
        this.f100771j = i;
    }

    /* renamed from: a */
    private final bngx m86810a(banx banx, long j, long j2) {
        bngs bngs = new bngs();
        for (Pair pair : this.f100763b.mo55768a(banx, m86811a(j), m86811a(j2))) {
            byht byht = (byht) GeneratedMessageLite.m124014a(byht.f166507d, (byte[]) pair.second);
            bngs.mo67668c(badk.m86643a(byht.f166511c.getKey(), null, byht.f166510b));
        }
        return bngs.mo67664a();
    }

    /* renamed from: b */
    private final byhy m86812b(bany bany, ByteString bxtx, long j) {
        bxvd da = byhy.f166528f.mo74144da();
        byhx byhx = byhx.UPDATE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhy byhy = (byhy) da.f164949b;
        byhy.f166531b = byhx.f166527e;
        int i = byhy.f166530a | 1;
        byhy.f166530a = i;
        bxtx.getClass();
        int i2 = i | 2;
        byhy.f166530a = i2;
        byhy.f166532c = bxtx;
        byhy.f166530a = i2 | 4;
        byhy.f166533d = j;
        byhy byhy2 = (byhy) da.mo74062i();
        this.f100764c.mo55762a(bany, byhy2);
        bamq bamq = this.f100763b;
        byte[] a = m86811a(j);
        bxvd da2 = byht.f166507d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byht byht = (byht) da2.f164949b;
        bxtx.getClass();
        int i3 = byht.f166509a | 2;
        byht.f166509a = i3;
        byht.f166511c = bxtx;
        byht.f166509a = i3 | 1;
        byht.f166510b = j;
        bamq.mo55772a(bany, a, ((byht) da2.mo74062i()).serializeToBytes());
        return byhy2;
    }

    /* renamed from: a */
    public final banf mo55683a() {
        return this.f100764c;
    }

    /* renamed from: b */
    public final banf mo55693b() {
        return this.f100765d;
    }

    /* renamed from: c */
    public final long mo55695c(banx banx) {
        return this.f100766e.mo55749c(banx);
    }

    public final void close() {
        bafz bafz = this.f100770i;
        babm babm = this.f100762a;
        synchronized (bafz.f100753a) {
            long b = bafz.f100754b.mo69172b(babm);
            if (b == 0) {
                bafz.f100753a.remove(babm);
                bafz.f100754b.mo69175d(babm);
                this.f100763b.close();
                this.f100764c.close();
                this.f100765d.close();
                this.f100766e.close();
                this.f100767f.close();
                if (bafz.f100754b.mo69173b()) {
                    bafz.f100753a.notifyAll();
                }
            } else if (b < 0) {
                String valueOf = String.valueOf(babm);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Footprints channel [");
                sb.append(valueOf);
                sb.append("] closed too many times.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: d */
    public final bacv mo55698d(banx banx) {
        long j;
        byhu byhu;
        byjj a = mo55684a(banx);
        if (a == null) {
            return bacv.f100505a;
        }
        if (((long) this.f100766e.mo55753e(banx)) == ((long) this.f100771j)) {
            j = this.f100766e.mo55752d(banx) / 1000;
        } else {
            j = -1;
        }
        long c = mo55695c(banx) / 1000;
        if (a.f166660a != 2) {
            byhu = byhu.f166512c;
        } else {
            byhu = (byhu) a.f166661b;
        }
        return bacv.m86604a(j, c, byhu.f166515b / 1000);
    }

    /* renamed from: c */
    public final bane mo55696c() {
        return this.f100767f.mo55782b();
    }

    /* renamed from: a */
    private static byte[] m86811a(long j) {
        return bqcr.m112599b((j - Long.MIN_VALUE) ^ -1);
    }

    /* renamed from: a */
    public final byjj mo55684a(banx banx) {
        return this.f100766e.mo55740a(banx);
    }

    /* renamed from: a */
    public final List mo55685a(banx banx, long j, long j2, String str) {
        if (str != null) {
            banx.mo55793a(new bafw(this, str));
        }
        return m86810a(banx, j, j2);
    }

    /* renamed from: a */
    public final void mo55686a(bany bany) {
        bxvd da = byhy.f166528f.mo74144da();
        byhx byhx = byhx.RESET;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhy byhy = (byhy) da.f164949b;
        byhy.f166531b = byhx.f166527e;
        byhy.f166530a |= 1;
        this.f100764c.mo55762a(bany, (byhy) da.mo74062i());
        this.f100763b.mo55777b(bany, new byte[0], (byte[]) null);
    }

    /* renamed from: b */
    public final badr mo55692b(banx banx) {
        byjq byjq;
        byjn b = this.f100766e.mo55747b(banx);
        boolean z = false;
        if (byjm.m124878a(b.f166677a) == 1) {
            return badr.m86659a(0, null, null);
        }
        if (b.f166677a == 2) {
            z = true;
        }
        bmxy.m108588a(z);
        if (b.f166677a == 2) {
            byjq = (byjq) b.f166678b;
        } else {
            byjq = byjq.f166688e;
        }
        return bafi.m86738a(byjq);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: baga.a(banx, long, long):bngx
     arg types: [bany, long, long]
     candidates:
      baga.a(bany, long, long):void
      baga.a(bany, bxtx, long):void
      bafv.a(bany, long, long):void
      bafv.a(bany, bxtx, long):void
      baga.a(banx, long, long):bngx */
    /* renamed from: a */
    public final void mo55687a(bany bany, long j, long j2) {
        bnre i = m86810a((banx) bany, j, j2).listIterator();
        while (i.hasNext()) {
            badk badk = (badk) i.next();
            banf banf = this.f100764c;
            bxvd da = byhy.f166528f.mo74144da();
            byhx byhx = byhx.DELETE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byhy byhy = (byhy) da.f164949b;
            byhy.f166531b = byhx.f166527e;
            byhy.f166530a |= 1;
            long c = badk.mo55614c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byhy byhy2 = (byhy) da.f164949b;
            byhy2.f166530a |= 4;
            byhy2.f166533d = c;
            banf.mo55762a(bany, (byhy) da.mo74062i());
        }
        this.f100763b.mo55777b(bany, m86811a(j), m86811a(j2));
    }

    /* renamed from: b */
    public final void mo55694b(bany bany) {
        this.f100763b.mo55776b(bany, ByteString.f164797b, (ByteString) null);
        this.f100766e.mo55742a(bany);
        this.f100765d.mo55764b(bany).mo55760a(bany);
        this.f100764c.mo55764b(bany).mo55760a(bany);
        banf banf = this.f100764c;
        bxvd da = byhy.f166528f.mo74144da();
        byhx byhx = byhx.RESET;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhy byhy = (byhy) da.f164949b;
        byhy.f166531b = byhx.f166527e;
        byhy.f166530a |= 1;
        banf.mo55762a(bany, (byhy) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo55688a(bany bany, badr badr, long j, int i, long j2, long j3) {
        banj banj = this.f100766e;
        bxvd da = byjn.f166675c.mo74144da();
        byjq a = bafi.m86743a(badr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjn byjn = (byjn) da.f164949b;
        a.getClass();
        byjn.f166678b = a;
        byjn.f166677a = 2;
        banj.mo55746a(bany, (byjn) da.mo74062i());
        this.f100766e.mo55744a(bany, j);
        this.f100766e.mo55743a(bany, i);
        this.f100766e.mo55748b(bany, j2);
        this.f100766e.mo55750c(bany, j3);
        bany.mo55793a(new bafy(this));
    }

    /* renamed from: a */
    public final void mo55689a(bany bany, ByteString bxtx, long j) {
        m86812b(bany, bxtx, j);
    }

    /* renamed from: a */
    public final void mo55690a(bany bany, ByteString bxtx, long j, String str) {
        byhy b = m86812b(bany, bxtx, j);
        banf banf = this.f100765d;
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byhy byhy = (byhy) bxvd.f164949b;
        byhy byhy2 = byhy.f166528f;
        str.getClass();
        byhy.f166530a |= 8;
        byhy.f166534e = str;
        banf.mo55762a(bany, (byhy) bxvd.mo74062i());
        bany.mo55793a(new bafx(this, str));
    }

    /* renamed from: a */
    public final void mo55691a(bany bany, byjj byjj) {
        if (byji.m124874b(byjj.f166660a) == 3) {
            this.f100766e.mo55745a(bany, byjj);
        } else if (byji.m124874b(byjj.f166660a) != 1) {
            int b = byji.m124874b(byjj.f166660a);
            String a = byji.m124873a(b);
            if (b == 0) {
                throw null;
            }
            String a2 = byji.m124873a(3);
            StringBuilder sb = new StringBuilder(a.length() + 30 + a2.length());
            sb.append("Invalid sync token ");
            sb.append(a);
            sb.append(", expected ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ((achw) this.f100769h.mo16713a()).logVerbose("Sync token is not set and will be initialized", new Object[0]);
        }
    }
}
