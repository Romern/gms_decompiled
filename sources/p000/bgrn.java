package p000;

import android.os.Message;
import com.google.android.location.quake.ShakeEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: bgrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgrn extends bgtf {

    /* renamed from: a */
    private final long f117347a = TimeUnit.SECONDS.toNanos(cezv.f183536a.mo6606a().quakeApiSessionCooldownS());

    /* renamed from: b */
    private final long f117348b = TimeUnit.SECONDS.toNanos(cezv.f183536a.mo6606a().quakeApiSessionAccelMaxS());

    /* renamed from: c */
    private final long f117349c = TimeUnit.MILLISECONDS.toNanos(cezv.f183536a.mo6606a().quakeApiAccelHeadMs());

    /* renamed from: d */
    private final long f117350d = TimeUnit.MILLISECONDS.toNanos(cezv.f183536a.mo6606a().quakeApiAccelTriggeringMs());

    /* renamed from: e */
    private final long f117351e = TimeUnit.MILLISECONDS.toNanos(cezv.f183536a.mo6606a().quakeApiAccelTailMs());

    /* renamed from: i */
    private final boolean f117352i;

    /* renamed from: j */
    private final bgsd f117353j;

    /* renamed from: k */
    private final bmxv f117354k;

    /* renamed from: l */
    private final bgqq f117355l;

    /* renamed from: m */
    private final bmzi f117356m;

    /* renamed from: n */
    private final bmzi f117357n;

    /* renamed from: o */
    private final bmzi f117358o;

    /* renamed from: p */
    private boolean f117359p;

    /* renamed from: q */
    private bgtk f117360q;

    /* renamed from: r */
    private bgpw f117361r;

    /* renamed from: s */
    private ShakeEvent f117362s;

    /* renamed from: t */
    private long f117363t;

    /* renamed from: u */
    private long f117364u;

    public bgrn(boolean z, bgsd bgsd, bmxv bmxv, bgqq bgqq, bmzi bmzi, bmzi bmzi2, bmzi bmzi3) {
        super("RTRep");
        this.f117352i = z;
        this.f117353j = bgsd;
        this.f117354k = bmxv;
        this.f117355l = bgqq;
        this.f117356m = bmzi;
        this.f117357n = bmzi2;
        this.f117358o = bmzi3;
    }

    /* renamed from: b */
    private final void m99809b(long j) {
        String.valueOf((j - this.f117362s.f150846a) / 1000000);
    }

    /* renamed from: c */
    public final void mo63118c() {
        long j = this.f117362s.f150846a - this.f117349c;
        this.f117364u = j;
        m99808a(j);
    }

    /* renamed from: d */
    public final void mo63119d() {
        srn srn = bgrw.f117381a;
        this.f117361r.mo63087a(this.f117353j.mo63082h().f117454d, (bmxv) this.f117357n.mo6606a());
    }

    /* renamed from: a */
    private final void m99808a(long j) {
        long j2;
        buob buob;
        long j3;
        int i;
        double d;
        srn srn = bgrw.f117381a;
        bgqp b = this.f117355l.mo63108b(this.f117355l.mo63105a(this.f117362s.f150846a));
        buoc buoc = (buoc) this.f117356m.mo6606a();
        if (buoc != null) {
            if (!buoc.f154473a.mo61831a()) {
                long j4 = j - buoc.f154481i;
                int a = buoc.f154473a.mo61827a(j4);
                bfkf bfkf = buoc.f154473a;
                int i2 = bfkf.f114284c - 1;
                if (a == -1) {
                    j3 = bfkf.mo61829a(0);
                    a = 0;
                } else {
                    j3 = j4;
                }
                bxvd da = buof.f154514f.mo74144da();
                int i3 = buoc.f154477e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buof buof = (buof) da.f164949b;
                buof.f154516a = i3;
                buof.f154517b = buoc.f154478f;
                long j5 = 1000000000 / ((long) buoc.f154477e);
                int i4 = a;
                long j6 = j3;
                while (i4 <= i2) {
                    int i5 = i4 != i2 ? i4 + 1 : i4;
                    long a2 = buoc.f154473a.mo61829a(i4);
                    long a3 = buoc.f154473a.mo61829a(i5);
                    long j7 = j6;
                    while (j7 >= a2 && j7 <= a3) {
                        if (a3 != a2) {
                            double d2 = (double) (j7 - a2);
                            i = i2;
                            double d3 = (double) (a3 - a2);
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            d = d2 / d3;
                        } else {
                            i = i2;
                            d = 0.0d;
                        }
                        int i6 = i5;
                        bxvd bxvd = da;
                        int i7 = i4;
                        int a4 = buoc.mo72963a(i4, i5, 0, d);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        buof buof2 = (buof) bxvd.f164949b;
                        if (!buof2.f154518c.mo73666a()) {
                            buof2.f154518c = GeneratedMessageLite.m124019a(buof2.f154518c);
                        }
                        buof2.f154518c.mo74153d(a4);
                        int a5 = buoc.mo72963a(i7, i6, 1, d);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        buof buof3 = (buof) bxvd.f164949b;
                        if (!buof3.f154519d.mo73666a()) {
                            buof3.f154519d = GeneratedMessageLite.m124019a(buof3.f154519d);
                        }
                        buof3.f154519d.mo74153d(a5);
                        int a6 = buoc.mo72963a(i7, i6, 2, d);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        buof buof4 = (buof) bxvd.f164949b;
                        if (!buof4.f154520e.mo73666a()) {
                            buof4.f154520e = GeneratedMessageLite.m124019a(buof4.f154520e);
                        }
                        buof4.f154520e.mo74153d(a6);
                        j7 += j5;
                        da = bxvd;
                        i4 = i7;
                        i2 = i;
                        i5 = i6;
                    }
                    i4++;
                    da = da;
                    j6 = j7;
                    i2 = i2;
                }
                buof buof5 = (buof) da.mo74062i();
                long j8 = buoc.f154481i;
                buob = new buob(buof5, j3 + j8, j6 + j8);
            } else {
                buob = null;
            }
            if (buob != null) {
                bhce.m100624a(this.f117362s.f150846a / 1000000);
                m99809b(j);
                m99809b(buob.f154471b);
                m99809b(buob.f154472c);
                buob.f154470a.f154518c.size();
                bgqq bgqq = this.f117355l;
                this.f117361r.mo63088a(bgqq.mo63108b(bgqq.mo63105a(buob.f154471b)), buob.f154470a, b, (bmxv) this.f117357n.mo6606a());
                j2 = buob.f154472c;
            } else {
                j2 = Long.MAX_VALUE;
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.f117363t = j2;
        long j9 = j2 - this.f117364u;
        long j10 = j2 - this.f117362s.f150846a;
        long j11 = this.f117351e;
        if (j10 < j11) {
            long j12 = this.f117350d;
            if (j10 >= j12) {
                long j13 = j11 - j10;
                if (j9 + j13 <= this.f117348b) {
                    this.f117482h.f117486b.mo63149a(12, null, j13 / 1000000);
                }
            } else if (j9 + j12 <= this.f117348b) {
                this.f117482h.f117486b.mo63149a(12, null, j12 / 1000000);
            }
        }
    }

    /* renamed from: b */
    public final void mo63113b() {
        srn srn = bgrw.f117381a;
        if (this.f117361r != null) {
            if (this.f117354k.mo66813a() && !((bgpg) this.f117354k.mo66814b()).mo63070d()) {
                this.f117361r.mo63089a((bmxv) this.f117357n.mo6606a());
            }
            this.f117361r.mo63086a();
            this.f117361r = null;
        }
    }

    /* renamed from: a */
    public final void mo63111a() {
        srn srn = bgrw.f117381a;
        this.f117361r = (bgpw) this.f117358o.mo6606a();
        boolean quakeApiUsePersistentThrottler = cezv.f183536a.mo6606a().quakeApiUsePersistentThrottler();
        this.f117359p = quakeApiUsePersistentThrottler;
        if (quakeApiUsePersistentThrottler && this.f117360q == null) {
            this.f117360q = bgta.m99877a("ea_qrt_s", new bgqr(this.f117355l), cezv.f183536a.mo6606a().quakeApiSessionThrottlerConfig(), new sty(this.f117482h.f117486b));
        }
        this.f117482h.mo63156c();
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        if (this.f117361r == null) {
            return false;
        }
        int i = message.what;
        if (i == 6) {
            srn srn = bgrw.f117381a;
            if (this.f117352i) {
                mo63119d();
            }
        } else if (i == 7) {
            srn srn2 = bgrw.f117381a;
            ShakeEvent shakeEvent = (ShakeEvent) bgtg.m99902b(message);
            this.f117362s = shakeEvent;
            if (this.f117359p) {
                if (!this.f117360q.mo63143a(new bgrm(this))) {
                    this.f117360q.mo63142a();
                }
            } else if ((this.f117363t + this.f117347a) - shakeEvent.f150846a <= 0) {
                mo63118c();
            }
        } else if (i == 12) {
            srn srn3 = bgrw.f117381a;
            m99808a(this.f117363t);
            return true;
        }
        return false;
    }
}
