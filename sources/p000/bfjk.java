package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/* renamed from: bfjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjk extends bfit {

    /* renamed from: l */
    public static final Set f114173l = bfgt.m96707a(bfgt.f113818h, bfgt.f113817g, bfgt.f113815e);

    /* renamed from: k */
    public final bfew f114174k = new bfjj(this);

    /* renamed from: m */
    public bfft f114175m;

    /* renamed from: n */
    public long f114176n = -1;

    /* renamed from: o */
    public final bfjm f114177o;

    /* renamed from: p */
    public long f114178p = Long.MAX_VALUE;

    /* renamed from: q */
    private final bfjf f114179q;

    /* renamed from: r */
    private final bfjy f114180r;

    /* renamed from: s */
    private final bfiu f114181s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfjk(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq, bfjf bfjf, bfjy bfjy) {
        super("IOCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.IDLE);
        bfiu bfiu = new bfiu(bgmk, bgns, (bfla) bfjy.f114242j.get(0), bfjf, bfjy);
        bfjm bfjm = new bfjm(bfjf, bgmk, bgnp.mo62752g(), bgnp.mo62753h());
        this.f114179q = bfjf;
        this.f114180r = bfjy;
        this.f114181s = bfiu;
        this.f114177o = bfjm;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m97023f(boolean z) {
        this.f114175m = null;
        this.f114176n = -1;
        if (z) {
            this.f114050d.mo62917a(bgnq.IN_OUT_DOOR_COLLECTOR, 0, null);
        }
    }

    /* renamed from: b */
    public final boolean mo61758b(long j) {
        bfne bfne;
        long j2;
        bfju bfju;
        int i;
        long j3 = j;
        long j4 = this.f114178p;
        if (j4 != Long.MAX_VALUE && -10000 + j4 <= j3 && j3 <= j4 + 180000) {
            int i2 = this.f114180r.f114251i;
            boolean cs = this.f114048b.mo62757l().mo62791cs();
            boolean a = bfjg.m97018a(16);
            if (i2 == 1 && cs && a) {
                this.f114178p = Long.MAX_VALUE;
                this.f114179q.mo61797j();
                HashMap hashMap = new HashMap(1);
                hashMap.put(bfgt.f113815e, 1);
                bfft a2 = this.f114048b.mo62747b().mo62765a(false, f114173l, hashMap, 10000, null, this.f114174k, this.f114047a, null);
                this.f114175m = a2;
                if (a2 != null) {
                    a2.mo61627a();
                    this.f114176n = j3;
                }
                if (this.f114175m != null) {
                    this.f114056j = bfis.IN_OUT_DOOR_COLLECTION_WAIT;
                }
            }
        } else if (j4 != Long.MAX_VALUE && j3 > j4 + 180000) {
            this.f114178p = Long.MAX_VALUE;
            this.f114179q.mo61797j();
        }
        if (this.f114056j != bfis.IN_OUT_DOOR_COLLECTION_WAIT && this.f114178p == Long.MAX_VALUE && this.f114180r.f114250h && bfjg.m97018a(16)) {
            bfiu bfiu = this.f114181s;
            if (bfiu.f114061d.f114250h) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(bfiu.f114058a.mo62775b());
                bfne a3 = bfne.m97311a(Long.valueOf(bfiu.f114065h.mo61796i()), bfju.USING_FULL_TIME_SPANS);
                Object obj = a3.f114467a;
                if (obj != null) {
                    j2 = ((Long) obj).longValue();
                } else {
                    j2 = 0;
                }
                Object obj2 = a3.f114468b;
                if (obj2 != null) {
                    bfju = (bfju) obj2;
                } else {
                    bfju = bfju.USING_FULL_TIME_SPANS;
                }
                long timeInMillis = instance.getTimeInMillis() - 300000;
                if (j2 == 0 || -86400000 + j2 >= instance.getTimeInMillis() || timeInMillis >= j2) {
                    bfne = bfne.m97311a(0L, bfju.USING_FULL_TIME_SPANS);
                } else {
                    bfne = bfiu.mo61773a(j2, bfju);
                }
                Object obj3 = bfne.f114467a;
                if (obj3 == null || ((Long) obj3).longValue() == 0) {
                    if (bfiu.f114064g == null) {
                        bfne = bfne.m97311a(Long.MAX_VALUE, bfju.USING_FULL_TIME_SPANS);
                    } else {
                        Date k = bfiu.f114065h.mo61798k();
                        if (k == null) {
                            bfiu.f114065h.mo61785a(instance);
                            i = 6;
                        } else {
                            Calendar instance2 = Calendar.getInstance();
                            instance2.setTime(k);
                            if (!bfla.m97165a(instance2, instance)) {
                                bfiu.f114065h.mo61785a(instance);
                                i = 6;
                            } else {
                                i = Math.max(0, 6 - bfiu.f114065h.mo61800m());
                            }
                        }
                        if (i > 0 && !bfiu.f114064g.mo61868a(instance)) {
                            bfne = bfiu.mo61774a(instance, i);
                        } else {
                            Calendar instance3 = Calendar.getInstance();
                            instance3.setTime(instance.getTime());
                            instance3.add(5, 1);
                            bfla.m97164a(instance3, bfiu.f114064g.f114327a);
                            bfiu.f114065h.mo61785a(instance3);
                            bfne = bfiu.mo61774a(instance3, 6);
                        }
                    }
                }
            } else {
                bfne = bfne.m97311a(Long.MAX_VALUE, bfju.USING_FULL_TIME_SPANS);
            }
            Long l = (Long) bfne.f114467a;
            if (l != null) {
                this.f114178p = l.longValue();
            }
        }
        if (this.f114056j == bfis.IDLE) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo61771g() {
        bfft bfft = this.f114175m;
        if (bfft != null) {
            if (this.f114180r.f114251i != 1) {
                bfft.mo61628b();
                if (!this.f114180r.mo61816d() || !mo61754a()) {
                    m97023f(false);
                    this.f114056j = bfis.IDLE;
                    return true;
                }
            }
            return false;
        }
        this.f114056j = bfis.IDLE;
        return true;
    }
}
