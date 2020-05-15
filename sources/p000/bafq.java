package p000;

import android.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: bafq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafq implements bafl {

    /* renamed from: a */
    public final babm f100723a;

    /* renamed from: b */
    public final bamq f100724b;

    /* renamed from: c */
    public final banf f100725c;

    /* renamed from: d */
    public final banf f100726d;

    /* renamed from: e */
    public final banj f100727e;

    /* renamed from: f */
    public final bamr f100728f;

    /* renamed from: g */
    public final cayo f100729g;

    /* renamed from: h */
    private final cayo f100730h;

    /* renamed from: i */
    private final byhs f100731i;

    /* renamed from: j */
    private final bafp f100732j;

    /* renamed from: k */
    private final int f100733k;

    public bafq(cayo cayo, babm babm, byhs byhs, bamq bamq, banf banf, banf banf2, banj banj, bamr bamr, cayo cayo2, bafp bafp, int i) {
        bmxy.m108581a(cayo);
        bmxy.m108581a(babm);
        bmxy.m108581a(byhs);
        bmxy.m108581a(bamq);
        bmxy.m108581a(banf);
        bmxy.m108581a(banf2);
        bmxy.m108581a(banj);
        bmxy.m108581a(bamr);
        bmxy.m108581a(cayo2);
        bmxy.m108581a(bafp);
        this.f100730h = cayo;
        this.f100723a = babm;
        this.f100731i = byhs;
        this.f100724b = bamq;
        this.f100725c = banf;
        this.f100726d = banf2;
        this.f100727e = banj;
        this.f100728f = bamr;
        this.f100729g = cayo2;
        this.f100732j = bafp;
        this.f100733k = i;
    }

    /* renamed from: a */
    private final badk m86768a(byte[] bArr, byte[] bArr2) {
        byht byht = (byht) GeneratedMessageLite.m124014a(byht.f166507d, bArr2);
        byte[] k = byht.f166511c.getKey();
        if (bArr.length == 0 && !this.f100731i.f166504a) {
            bArr = null;
        }
        return badk.m86643a(k, bArr, byht.f166510b);
    }

    /* renamed from: b */
    private final byhr m86769b(bany bany, ByteString bxtx, ByteString bxtx2, long j) {
        bxvd da = byhr.f166494g.mo74144da();
        byhq byhq = byhq.UPDATE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhr byhr = (byhr) da.f164949b;
        byhr.f166497b = byhq.f166493d;
        int i = byhr.f166496a | 1;
        byhr.f166496a = i;
        bxtx2.getClass();
        int i2 = i | 2;
        byhr.f166496a = i2;
        byhr.f166498c = bxtx2;
        if (bxtx != null) {
            bxtx.getClass();
            i2 |= 4;
            byhr.f166496a = i2;
            byhr.f166499d = bxtx;
        }
        if (j != -1) {
            byhr.f166496a = i2 | 8;
            byhr.f166500e = j;
        }
        byhr byhr2 = (byhr) da.mo74062i();
        this.f100725c.mo55762a(bany, byhr2);
        bxvd da2 = byht.f166507d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byht byht = (byht) da2.f164949b;
        bxtx2.getClass();
        int i3 = byht.f166509a | 2;
        byht.f166509a = i3;
        byht.f166511c = bxtx2;
        if (j != -1) {
            byht.f166509a = i3 | 1;
            byht.f166510b = j;
        }
        bamq bamq = this.f100724b;
        if (bxtx == null) {
            bxtx = bxtx.f164797b;
        }
        bamq.mo55771a(bany, bxtx, ((byht) da2.mo74062i()).mo73639aL());
        return byhr2;
    }

    /* renamed from: a */
    public final banf mo55664a() {
        return this.f100725c;
    }

    /* renamed from: b */
    public final banf mo55674b() {
        return this.f100726d;
    }

    /* renamed from: c */
    public final bacv mo55676c(banx banx) {
        long j;
        byhu byhu;
        byjj a = mo55666a(banx);
        if (a == null) {
            return bacv.f100505a;
        }
        if (((long) this.f100727e.mo55753e(banx)) == ((long) this.f100733k)) {
            j = this.f100727e.mo55752d(banx) / 1000;
        } else {
            j = -1;
        }
        long c = this.f100727e.mo55749c(banx) / 1000;
        if (a.f166660a != 2) {
            byhu = byhu.f166512c;
        } else {
            byhu = (byhu) a.f166661b;
        }
        return bacv.m86604a(j, c, byhu.f166515b / 1000);
    }

    public final void close() {
        bafp bafp = this.f100732j;
        babm babm = this.f100723a;
        synchronized (bafp.f100713a) {
            long b = bafp.f100714b.mo69172b(babm);
            if (b == 0) {
                bafp.f100713a.remove(babm);
                bafp.f100714b.mo69175d(babm);
                this.f100724b.close();
                this.f100725c.close();
                this.f100726d.close();
                this.f100727e.close();
                this.f100728f.close();
                if (bafp.f100714b.mo69173b()) {
                    bafp.f100713a.notifyAll();
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

    /* renamed from: a */
    public final ByteString mo55665a(ByteString bxtx) {
        if (!bxtx.mo73779j() || this.f100731i.f166504a) {
            return bxtx;
        }
        return null;
    }

    /* renamed from: a */
    public final byjj mo55666a(banx banx) {
        return this.f100727e.mo55740a(banx);
    }

    /* renamed from: a */
    public final List mo55667a(banx banx, badj badj, String str) {
        if (str != null) {
            banx.mo55793a(new bafm(this, str));
        }
        HashSet hashSet = new HashSet();
        bnre i = badj.mo55608a().listIterator();
        while (i.hasNext()) {
            badp badp = (badp) i.next();
            byte[] a = badp.mo55630a();
            int b = badp.mo55631b();
            if (b == 1) {
                byte[] a2 = this.f100724b.mo55774a(banx, a);
                if (a2 != null) {
                    hashSet.add(m86768a(a, a2));
                }
            } else if (b == 2) {
                for (Pair pair : this.f100724b.mo55768a(banx, a, baqr.m87412a(a))) {
                    hashSet.add(m86768a((byte[]) pair.first, (byte[]) pair.second));
                }
            }
        }
        return bngx.m109368a((Collection) hashSet);
    }

    /* renamed from: c */
    public final bane mo55677c() {
        return this.f100728f.mo55782b();
    }

    /* renamed from: b */
    public final badj mo55673b(banx banx) {
        boolean z;
        byif byif;
        byjn b = this.f100727e.mo55747b(banx);
        if (byjm.m124878a(b.f166677a) == 1) {
            return badj.m86640b().mo55645a();
        }
        if (b.f166677a == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (b.f166677a == 1) {
            byif = (byif) b.f166678b;
        } else {
            byif = byif.f166558b;
        }
        return bafi.m86737a(byif);
    }

    /* renamed from: a */
    public final void mo55668a(bany bany) {
        bxvd da = byhr.f166494g.mo74144da();
        byhq byhq = byhq.RESET;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhr byhr = (byhr) da.f164949b;
        byhr.f166497b = byhq.f166493d;
        byhr.f166496a |= 1;
        this.f100725c.mo55762a(bany, (byhr) da.mo74062i());
        this.f100724b.mo55776b(bany, ByteString.f164797b, (ByteString) null);
    }

    /* renamed from: a */
    public final void mo55669a(bany bany, badj badj, long j, int i, long j2, long j3) {
        banj banj = this.f100727e;
        bxvd da = byjn.f166675c.mo74144da();
        byif b = bafi.m86746b(badj);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjn byjn = (byjn) da.f164949b;
        b.getClass();
        byjn.f166678b = b;
        byjn.f166677a = 1;
        banj.mo55746a(bany, (byjn) da.mo74062i());
        this.f100727e.mo55744a(bany, j);
        this.f100727e.mo55743a(bany, i);
        this.f100727e.mo55748b(bany, j2);
        this.f100727e.mo55750c(bany, j3);
        bany.mo55793a(new bafo(this));
    }

    /* renamed from: b */
    public final void mo55675b(bany bany) {
        this.f100724b.mo55776b(bany, ByteString.f164797b, (ByteString) null);
        this.f100727e.mo55742a(bany);
        this.f100726d.mo55764b(bany).mo55760a(bany);
        this.f100725c.mo55764b(bany).mo55760a(bany);
        banf banf = this.f100725c;
        bxvd da = byhr.f166494g.mo74144da();
        byhq byhq = byhq.RESET;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhr byhr = (byhr) da.f164949b;
        byhr.f166497b = byhq.f166493d;
        byhr.f166496a |= 1;
        banf.mo55762a(bany, (byhr) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo55670a(bany bany, ByteString bxtx, ByteString bxtx2, long j) {
        m86769b(bany, bxtx, bxtx2, j);
    }

    /* renamed from: a */
    public final void mo55671a(bany bany, byjj byjj) {
        if (byji.m124874b(byjj.f166660a) == 3) {
            this.f100727e.mo55745a(bany, byjj);
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
            ((achw) this.f100730h.mo16713a()).logVerbose("Sync token is not set and will be initialized", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo55672a(bany bany, String str, ByteString bxtx, ByteString bxtx2) {
        boolean z;
        boolean z2 = this.f100731i.f166504a;
        if (bxtx != null) {
            z = false;
        } else {
            z = true;
        }
        if (z2 != z) {
            byhr b = m86769b(bany, bxtx, bxtx2, -1);
            banf banf = this.f100726d;
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byhr byhr = (byhr) bxvd.f164949b;
            byhr byhr2 = byhr.f166494g;
            str.getClass();
            byhr.f166496a |= 16;
            byhr.f166501f = str;
            banf.mo55762a(bany, (byhr) bxvd.mo74062i());
            bany.mo55793a(new bafn(this, str));
            return;
        }
        throw new bafk();
    }
}
