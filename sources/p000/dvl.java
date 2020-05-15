package p000;

import com.google.android.gms.awareness.fence.FenceState;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: dvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvl extends duq {

    /* renamed from: f */
    private TimeZone f14195f;

    /* renamed from: g */
    private final drx f14196g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvl(bxex bxex) {
        super(dvl.class, bxex, (r0 == null ? bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE : r0).f163146n, !bxex.f163154f ? bxcl.TIME_FENCE : bxcl.LOCAL_TIME_FENCE, bxex.f163154f ? new int[]{45} : new int[]{-1});
        bxew a = bxew.m122643a(bxex.f163150b);
        this.f14196g = new dvk(this, "TimeFenceImpl");
    }

    /* renamed from: a */
    private final int m9526a(int i, long j) {
        Calendar l = m9528l();
        l.setTimeInMillis(j);
        if (l.get(7) == i) {
            return FenceState.m7187a(m9527a(Long.valueOf(dqt.m9103b(j, mo9705a())), Long.valueOf(mo9707j()), Long.valueOf(mo9708k())));
        }
        return 1;
    }

    /* renamed from: l */
    private final Calendar m9528l() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(mo9705a());
        instance.setLenient(false);
        return instance;
    }

    /* renamed from: b */
    public final long mo9706b(long j) {
        bxex bxex = (bxex) this.f14076c;
        if (!bxex.f163154f) {
            return Long.MAX_VALUE;
        }
        bxew a = bxew.m122643a(bxex.f163150b);
        if (a == null) {
            a = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        }
        if (a == bxew.ABSOLUTE_INTERVAL) {
            long c = dqt.m9106c(mo9707j(), mo9705a());
            long c2 = dqt.m9106c(mo9708k(), mo9705a());
            if (j < c) {
                return c - j;
            }
            if (j < c2) {
                return c2 - j;
            }
            return Long.MAX_VALUE;
        }
        long b = dqt.m9103b(j, mo9705a());
        if (b < mo9707j()) {
            return mo9707j() - b;
        }
        if (b < mo9708k()) {
            return mo9708k() - b;
        }
        return (mo9707j() + 86400000) - b;
    }

    /* renamed from: j */
    public final long mo9707j() {
        return ((bxex) this.f14076c).f163152d;
    }

    /* renamed from: k */
    public final long mo9708k() {
        return ((bxex) this.f14076c).f163153e;
    }

    /* renamed from: a */
    private static final boolean m9527a(Long l, Long l2, Long l3) {
        return l.longValue() >= l2.longValue() && l.longValue() < l3.longValue();
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        switch (this.f14075b) {
            case 1:
                return mo9643a(m9527a(Long.valueOf(j), Long.valueOf(dqt.m9106c(mo9707j(), mo9705a())), Long.valueOf(dqt.m9106c(mo9708k(), mo9705a()))));
            case 2:
                return mo9643a(m9527a(Long.valueOf(dqt.m9103b(j, mo9705a())), Long.valueOf(mo9707j()), Long.valueOf(mo9708k())));
            case 3:
                Calendar l = m9528l();
                l.setTimeInMillis(j);
                if (l.get(7) == 7 || l.get(7) == 1) {
                    return mo9643a(m9527a(Long.valueOf(dqt.m9103b(j, mo9705a())), Long.valueOf(mo9707j()), Long.valueOf(mo9708k())));
                }
                return mo9643a(false);
            case 4:
                Calendar l2 = m9528l();
                l2.setTimeInMillis(j);
                if (l2.get(7) == 7 || l2.get(7) == 1) {
                    return mo9643a(false);
                }
                return mo9643a(m9527a(Long.valueOf(dqt.m9103b(j, mo9705a())), Long.valueOf(mo9707j()), Long.valueOf(mo9708k())));
            case 5:
                int a = m9526a(1, j);
                this.f14078e = a;
                return a;
            case 6:
                int a2 = m9526a(2, j);
                this.f14078e = a2;
                return a2;
            case 7:
                int a3 = m9526a(3, j);
                this.f14078e = a3;
                return a3;
            case 8:
                int a4 = m9526a(4, j);
                this.f14078e = a4;
                return a4;
            case 9:
                int a5 = m9526a(5, j);
                this.f14078e = a5;
                return a5;
            case 10:
                int a6 = m9526a(6, j);
                this.f14078e = a6;
                return a6;
            case 11:
                int a7 = m9526a(7, j);
                this.f14078e = a7;
                return a7;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvl", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[TimeFenceImpl] Unknown time fence type for fence metching = %s", this.f14075b);
                return mo9646b();
        }
    }

    /* renamed from: a */
    public final TimeZone mo9705a() {
        TimeZone timeZone = this.f14195f;
        if (timeZone != null) {
            return timeZone;
        }
        bxex bxex = (bxex) this.f14076c;
        if (bxex.f163154f) {
            this.f14195f = TimeZone.getDefault();
        } else if ((bxex.f163149a & 2) == 0 || bxex.f163151c.isEmpty()) {
            return null;
        } else {
            this.f14195f = TimeZone.getTimeZone(((bxex) this.f14076c).f163151c);
        }
        return this.f14195f;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxex bxex = (bxex) this.f14076c;
        if (bxex.f163154f) {
            bxew a = bxew.m122643a(bxex.f163150b);
            if (a == null) {
                a = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            }
            if (a != bxew.ABSOLUTE_INTERVAL) {
                bxco a2 = bxco.m122577a(bxce.f162772e);
                if (a2 == null) {
                    a2 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                if (a2 == bxco.TIME_PROPERTY) {
                    bxeu bxeu = bxce.f162774g;
                    if (bxeu == null) {
                        bxeu = bxeu.f163125e;
                    }
                    int a3 = bxet.m122640a(bxeu.f163128b);
                    if (a3 != 0 && a3 == 2) {
                        bxcf bxcf = bxce.f162775h;
                        if (bxcf == null) {
                            bxcf = bxcf.f162779a;
                        }
                        bxvj bxvj = bxnk.f164045d;
                        bxcf.mo74135a(bxvj);
                        if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                            bxcf bxcf2 = bxce.f162775h;
                            if (bxcf2 == null) {
                                bxcf2 = bxcf.f162779a;
                            }
                            bxvj bxvj2 = bxnk.f164045d;
                            bxcf2.mo74135a(bxvj2);
                            Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                            if (b == null) {
                                b = bxvj2.f164956b;
                            } else {
                                bxvj2.mo74139a(b);
                            }
                            bxnk bxnk = (bxnk) b;
                            new Object[1][0] = bxnk;
                            this.f14195f = TimeZone.getTimeZone(bxnk.f164048b);
                            this.f14196g.mo9514a(mo9706b(dwq.m9665i().mo20505a()), dqy.m9123a("TimeFenceImpl#fenceEvalOp"));
                            return;
                        }
                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                        bnsl.mo68432a("dvl", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[TimeFenceImpl] could not read TimeProperty proto from ContextData");
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                bxco a4 = bxco.m122577a(bxce.f162772e);
                if (a4 == null) {
                    a4 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                objArr[0] = Integer.valueOf(a4.f162973bD);
            }
        }
    }
}
