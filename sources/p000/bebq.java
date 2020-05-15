package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bebq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebq {

    /* renamed from: a */
    public final bebw f106875a;

    /* renamed from: b */
    public final bxvd f106876b;

    public bebq() {
        this(bebw.f106888a);
    }

    /* renamed from: a */
    public static bebq m91735a(bebw bebw, int i, Long l, Long l2) {
        bebq bebq = new bebq(bebw);
        bebq.mo58531a(i);
        bebq.mo58530a();
        if (l != null) {
            bebq.mo58532a(l.longValue());
        } else if (i != 717) {
            String valueOf = String.valueOf(bkxt.m106879b(i));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("cannot have a null lastHeartbeatSeqNum for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (l2 != null) {
            bxvd da = bkzq.f125670d.mo74144da();
            bxvd da2 = bkzr.f125681c.mo74144da();
            long longValue = l2.longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bkzr bkzr = (bkzr) da2.f164949b;
            bkzr.f125683a |= 1;
            bkzr.f125684b = longValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzq bkzq = (bkzq) da.f164949b;
            bkzr bkzr2 = (bkzr) da2.mo74062i();
            bkzr2.getClass();
            bkzq.f125673b = bkzr2;
            bkzq.f125672a |= 4;
            bebq.mo58533a((bkzq) da.mo74062i());
        } else if (i != 717) {
            String valueOf2 = String.valueOf(bkxt.m106879b(i));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("cannot have a null lastHeartbeatClientTimeUsec for ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
        return bebq;
    }

    /* renamed from: b */
    public final void mo58534b(long j) {
        bxvd bxvd = this.f106876b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxq bkxq2 = bkxq.f125402g;
        bkxq.f125404a |= 16;
        bkxq.f125406c = j;
    }

    public bebq(bebq bebq) {
        this.f106875a = bebq.f106875a;
        bkxq bkxq = (bkxq) bebq.f106876b.mo74062i();
        bxvd bxvd = (bxvd) bkxq.mo74142c(5);
        bxvd.mo73625a((bxvk) bkxq);
        this.f106876b = bxvd;
    }

    public bebq(bebw bebw) {
        this.f106876b = bkxq.f125402g.mo74144da();
        this.f106875a = bebw;
    }

    /* renamed from: a */
    public static bebq m91736a(bebw bebw, long j, long j2) {
        return m91735a(bebw, 1154, Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    public final void mo58530a() {
        long a = this.f106875a.mo58543a();
        bxvd bxvd = this.f106876b;
        bxvd da = bkxp.f125396e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkxp bkxp = (bkxp) da.f164949b;
        bkxp.f125401d = 1;
        bkxp.f125398a |= 4;
        bxvd da2 = bkxm.f125391c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bkxm bkxm = (bkxm) da2.f164949b;
        bkxm.f125393a |= 1;
        bkxm.f125394b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkxp bkxp2 = (bkxp) da.f164949b;
        bkxm bkxm2 = (bkxm) da2.mo74062i();
        bkxm2.getClass();
        bkxp2.f125399b = bkxm2;
        bkxp2.f125398a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxp bkxp3 = (bkxp) da.mo74062i();
        bkxq bkxq2 = bkxq.f125402g;
        bkxp3.getClass();
        bkxq.f125409f = bkxp3;
        bkxq.f125404a |= 2048;
    }

    /* renamed from: a */
    public final void mo58531a(int i) {
        bxvd bxvd = this.f106876b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxq bkxq2 = bkxq.f125402g;
        bkxq.f125405b = i - 1;
        bkxq.f125404a |= 2;
    }

    /* renamed from: a */
    public final void mo58532a(long j) {
        bxvd bxvd = this.f106876b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxq bkxq2 = bkxq.f125402g;
        bkxq.f125404a |= 512;
        bkxq.f125408e = j;
    }

    /* renamed from: a */
    public final void mo58533a(bkzq bkzq) {
        bxvd bxvd = this.f106876b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxq bkxq2 = bkxq.f125402g;
        bkzq.getClass();
        bkxq.f125407d = bkzq;
        bkxq.f125404a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
