package p000;

import com.google.android.libraries.rocket.impressions.Session;
import java.util.ArrayList;

/* renamed from: bebr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebr {

    /* renamed from: a */
    public final Object f106877a = new Object();

    /* renamed from: b */
    public final bebx f106878b;

    /* renamed from: c */
    public final Session f106879c;

    /* renamed from: d */
    public final bebw f106880d;

    public bebr(bebw bebw, bebx bebx, Session session) {
        this.f106880d = bebw;
        if (bebx != null) {
            this.f106878b = bebx;
            if (session != null) {
                this.f106879c = session;
                return;
            }
            throw new IllegalArgumentException("session must be non-null");
        }
        throw new IllegalArgumentException("transport must be non-null");
    }

    /* renamed from: a */
    public final void mo58535a() {
        mo58536a(bebq.m91735a(this.f106880d, 717, null, null));
    }

    /* renamed from: b */
    public final void mo58538b(bebq bebq) {
        bkxq bkxq = (bkxq) bebq.f106876b.f164949b;
        int i = bkxq.f125404a;
        if ((i & 2) == 0) {
            throw new IllegalStateException("must call setImpressionCode() before build()");
        } else if ((i & 16) != 0) {
            bkxp bkxp = bkxq.f125409f;
            if (bkxp == null) {
                bkxp = bkxp.f125396e;
            }
            int a = bkxo.m106872a(bkxp.f125401d);
            if (a != 0) {
                int i2 = 1;
                if (a != 1) {
                    bkxp bkxp2 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                    if (bkxp2 == null) {
                        bkxp2 = bkxp.f125396e;
                    }
                    int a2 = bkxo.m106872a(bkxp2.f125401d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i3 = a2 - 1;
                    if (i3 == 1) {
                        bkxp bkxp3 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                        if (bkxp3 == null) {
                            bkxp3 = bkxp.f125396e;
                        }
                        bkxm bkxm = bkxp3.f125399b;
                        if (bkxm == null) {
                            bkxm = bkxm.f125391c;
                        }
                        if ((bkxm.f125393a & 1) == 0) {
                            throw new IllegalStateException("instant timing without timestamp");
                        }
                    } else if (i3 != 2) {
                        bkxp bkxp4 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                        if (bkxp4 == null) {
                            bkxp4 = bkxp.f125396e;
                        }
                        int a3 = bkxo.m106872a(bkxp4.f125401d);
                        if (a3 != 0) {
                            i2 = a3;
                        }
                        String valueOf = String.valueOf(bkxo.m106873b(i2));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                        sb.append("unknown timing type ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        bkxp bkxp5 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                        if (bkxp5 == null) {
                            bkxp5 = bkxp.f125396e;
                        }
                        bkxl bkxl = bkxp5.f125400c;
                        if (bkxl == null) {
                            bkxl = bkxl.f125386d;
                        }
                        if ((bkxl.f125388a & 1) != 0) {
                            bkxp bkxp6 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                            if (bkxp6 == null) {
                                bkxp6 = bkxp.f125396e;
                            }
                            bkxl bkxl2 = bkxp6.f125400c;
                            if (bkxl2 == null) {
                                bkxl2 = bkxl.f125386d;
                            }
                            if ((bkxl2.f125388a & 2) == 0) {
                                throw new IllegalStateException("elapsed timing without end timestamp");
                            }
                        } else {
                            throw new IllegalStateException("elapsed timing without start timestamp");
                        }
                    }
                    this.f106879c.f111418b.add((bkxq) bebq.f106876b.mo74062i());
                    Session session = this.f106879c;
                    if (session.f111418b.size() != 0) {
                        bxvd da = bkxr.f125411f.mo74144da();
                        bkxy bkxy = session.f111420d;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bkxr bkxr = (bkxr) da.f164949b;
                        bkxy.getClass();
                        bkxr.f125416d = bkxy;
                        bkxr.f125413a = 2 | bkxr.f125413a;
                        bkxw bkxw = (bkxw) session.f111426j.mo74062i();
                        bkxw.getClass();
                        bkxr.f125415c = bkxw;
                        bkxr.f125413a = 1 | bkxr.f125413a;
                        bkxu bkxu = session.f111421e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bkxr bkxr2 = (bkxr) da.f164949b;
                        bkxu.getClass();
                        bkxr2.f125417e = bkxu;
                        bkxr2.f125413a |= 4;
                        ArrayList arrayList = session.f111418b;
                        if (!bkxr2.f125414b.mo73666a()) {
                            bkxr2.f125414b = GeneratedMessageLite.m124021a(bkxr2.f125414b);
                        }
                        bxsy.m123078a(arrayList, bkxr2.f125414b);
                        session.f111418b.clear();
                        this.f106878b.mo58528b((bkxr) da.mo74062i());
                        return;
                    }
                    throw new IllegalStateException("cannot flush empty impression queue");
                }
            }
            int a4 = bkxt.m106878a(((bkxq) bebq.f106876b.f164949b).f125405b);
            if (a4 == 0) {
                a4 = 1005;
            }
            String valueOf2 = String.valueOf(bkxt.m106879b(a4));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 64);
            sb2.append("cannot build an impression without any timing information: code ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("must call setSequenceNumber() before build()");
        }
    }

    /* renamed from: a */
    public final void mo58536a(bebq bebq) {
        Long l;
        Session session = this.f106879c;
        bkxp bkxp = ((bkxq) bebq.f106876b.f164949b).f125409f;
        if (bkxp == null) {
            bkxp = bkxp.f125396e;
        }
        int a = bkxo.m106872a(bkxp.f125401d);
        int i = 1;
        if (a != 0 && a == 2) {
            bkxp bkxp2 = ((bkxq) bebq.f106876b.f164949b).f125409f;
            if (bkxp2 == null) {
                bkxp2 = bkxp.f125396e;
            }
            bkxm bkxm = bkxp2.f125399b;
            if (bkxm == null) {
                bkxm = bkxm.f125391c;
            }
            if ((bkxm.f125393a & 1) != 0) {
                bkxp bkxp3 = ((bkxq) bebq.f106876b.f164949b).f125409f;
                if (bkxp3 == null) {
                    bkxp3 = bkxp.f125396e;
                }
                bkxm bkxm2 = bkxp3.f125399b;
                if (bkxm2 == null) {
                    bkxm2 = bkxm.f125391c;
                }
                l = Long.valueOf(bkxm2.f125394b);
            } else {
                l = null;
            }
            long longValue = l.longValue();
            long j = session.f111422f;
            session.f111423g = j;
            session.f111424h = longValue;
            session.f111422f = 1 + j;
            bebq.mo58534b(j);
            mo58538b(bebq);
            return;
        }
        bkxp bkxp4 = ((bkxq) bebq.f106876b.f164949b).f125409f;
        if (bkxp4 == null) {
            bkxp4 = bkxp.f125396e;
        }
        int a2 = bkxo.m106872a(bkxp4.f125401d);
        if (a2 != 0) {
            i = a2;
        }
        String valueOf = String.valueOf(bkxo.m106873b(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("not an instant timing impression; instead: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo58537a(bebu bebu, String str) {
        bebu bebu2 = this.f106879c.f111419c;
        if (bebu2 != bebu) {
            String valueOf = String.valueOf(bebu2);
            StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(valueOf).length());
            sb.append("cannot ");
            sb.append(str);
            sb.append(" in a ");
            sb.append(valueOf);
            sb.append(" session");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo58539b() {
        Session session = this.f106879c;
        long b = bebw.m91749b();
        long j = session.f111425i;
        if (j <= b && b - j < Session.f111417a) {
            return false;
        }
        bebw bebw = this.f106880d;
        Session session2 = this.f106879c;
        mo58536a(bebq.m91735a(bebw, 692, Long.valueOf(session2.f111423g), Long.valueOf(session2.f111424h)));
        this.f106879c.mo60603a(this.f106880d);
        mo58535a();
        this.f106879c.f111419c = bebu.IN_PROGRESS;
        return true;
    }
}
