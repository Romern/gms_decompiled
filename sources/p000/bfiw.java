package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: bfiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfiw {

    /* renamed from: a */
    public final bgnp f114083a;

    /* renamed from: b */
    public boolean f114084b = false;

    /* renamed from: c */
    public boolean f114085c = true;

    /* renamed from: d */
    public boolean f114086d = false;

    /* renamed from: e */
    public boolean f114087e = true;

    /* renamed from: f */
    public boolean f114088f = false;

    /* renamed from: g */
    public boolean f114089g = false;

    /* renamed from: h */
    public boolean f114090h = false;

    /* renamed from: i */
    public int f114091i = -1;

    /* renamed from: j */
    public long f114092j = -1;

    /* renamed from: k */
    public long f114093k = -1;

    /* renamed from: l */
    public boolean f114094l = false;

    /* renamed from: m */
    public long f114095m = -1;

    /* renamed from: n */
    public boolean f114096n = false;

    /* renamed from: o */
    public long f114097o = -1;

    /* renamed from: p */
    public bgom f114098p = null;

    /* renamed from: q */
    public boolean f114099q = false;

    /* renamed from: r */
    public int f114100r = 1;

    /* renamed from: s */
    private final List f114101s;

    /* renamed from: t */
    private final bgmk f114102t;

    /* renamed from: u */
    private final bgns f114103u;

    /* renamed from: v */
    private final bglw f114104v;

    /* renamed from: w */
    private final bgoj f114105w;

    /* renamed from: x */
    private final bfct f114106x;

    /* renamed from: y */
    private final Random f114107y;

    /* renamed from: z */
    private final Calendar f114108z = Calendar.getInstance();

    public bfiw(bgnp bgnp, bgmk bgmk, bgns bgns, bgoj bgoj, bfct bfct, bglw bglw) {
        Random random = new Random();
        this.f114104v = bglw;
        this.f114083a = bgnp;
        this.f114102t = bgmk;
        this.f114103u = bgns;
        this.f114106x = bfct;
        this.f114105w = bgoj;
        this.f114107y = random;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new bfla(6, 45, 10));
        arrayList.add(new bfla(15, 30, 19));
        this.f114101s = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private final void m96932a(long j, long j2) {
        this.f114092j = j;
        this.f114103u.mo62917a(bgnq.BURST_COLLECTION_TRIGGER, this.f114092j, null);
        String valueOf = String.valueOf(new Date(j2 + this.f114092j));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Alarm scheduled at ");
        sb.append(valueOf);
        sb.toString();
    }

    /* renamed from: a */
    private final boolean m96935a(long j) {
        return j >= this.f114092j + -2000;
    }

    /* renamed from: b */
    private final void m96937b(long j, boolean z) {
        this.f114103u.mo62914a(bgnq.BURST_COLLECTION_TRIGGER);
        this.f114092j = -1;
        m96941e();
        this.f114090h = false;
        this.f114091i = -1;
        this.f114088f = false;
        this.f114089g = false;
        if (z) {
            this.f114097o = -1;
            this.f114098p = null;
        }
        if (this.f114100r != 1) {
            this.f114100r = 1;
            this.f114093k = j;
        }
        m96940d();
    }

    /* renamed from: c */
    private final void m96939c() {
        if (!this.f114096n) {
            this.f114103u.mo62923b(bgnq.BURST_COLLECTION_TRIGGER, 60000, null);
            this.f114096n = true;
        }
    }

    /* renamed from: d */
    private final void m96940d() {
        if (this.f114096n) {
            this.f114103u.mo62925c(bgnq.BURST_COLLECTION_TRIGGER);
            this.f114096n = false;
        }
    }

    /* renamed from: e */
    private final void m96941e() {
        if (this.f114094l) {
            bmxy.m108600b(this.f114095m != -1);
            this.f114104v.mo60985c(this.f114095m);
            this.f114094l = false;
            this.f114095m = -1;
        }
    }

    /* renamed from: a */
    private final void m96933a(Calendar calendar, long j) {
        bfla.m97164a(calendar, ((bfla) this.f114101s.get(0)).f114327a);
        this.f114108z.add(6, 1);
        m96938b(this.f114108z, j);
    }

    /* renamed from: a */
    private final void m96934a(Calendar calendar, bfla bfla, long j) {
        if (!bfla.mo61869b(calendar)) {
            bfla.m97164a(calendar, bfla.f114327a);
        }
        if (this.f114093k != -1) {
            long timeInMillis = calendar.getTimeInMillis();
            long j2 = this.f114093k + 600000;
            if (j2 > timeInMillis - j) {
                calendar.setTimeInMillis(j2 + j);
            }
            if (bfla.mo61869b(calendar)) {
                m96938b(calendar, j);
            } else if (bfla == this.f114101s.get(0)) {
                bfla.m97164a(calendar, ((bfla) this.f114101s.get(1)).f114327a);
                m96934a(calendar, (bfla) this.f114101s.get(1), j);
            } else {
                m96933a(calendar, j);
            }
        } else {
            m96938b(calendar, j);
        }
    }

    /* renamed from: b */
    private final void m96938b(Calendar calendar, long j) {
        m96932a(calendar.getTimeInMillis() - j, j);
    }

    /* renamed from: b */
    public final void mo61776b() {
        int i = this.f114100r;
        if (i == 4 || i == 5) {
            this.f114088f = true;
            mo61775a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* renamed from: a */
    private final boolean m96936a(long j, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean cs = this.f114083a.mo62757l().mo62791cs();
        boolean f = this.f114106x.mo61412f();
        if (!bfjg.m97018a(2) || !bfjg.m97018a(4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f114084b && this.f114087e && bfjb.m96990a()) {
            if (this.f114099q) {
                z3 = false;
            } else if (f && z2 && cs && this.f114086d) {
                z3 = true;
            }
            i = this.f114100r;
            int i3 = i - 1;
            if (i != 0) {
                throw null;
            } else if (i3 == 0 ? z3 : i3 == 1 ? !(!z3 || this.f114088f) : !(i3 == 2 || i3 == 3 ? !z3 || (!((i2 = this.f114091i) == 0 || i2 == 3) || this.f114088f) : i3 == 4 && (!z3 || this.f114088f || this.f114085c || m96935a(j)))) {
                return false;
            } else {
                boolean z4 = this.f114084b;
                boolean z5 = this.f114085c;
                boolean z6 = this.f114086d;
                boolean z7 = this.f114088f;
                StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
                sb.append("[fullCollectionEnabled=");
                sb.append(z4);
                sb.append(", screenOn=");
                sb.append(z5);
                sb.append(", isBatteryHealthy=");
                sb.append(z6);
                sb.append(", collectionCanceled=");
                sb.append(z7);
                sb.append(", serverEnabled=");
                sb.append(f);
                sb.append(", gservicesEnabled=");
                sb.append(z2);
                sb.append(", gpsEnabled=");
                sb.append(cs);
                sb.append("]");
                sb.toString();
                m96937b(j, z);
                return true;
            }
        }
        z3 = false;
        i = this.f114100r;
        int i32 = i - 1;
        if (i != 0) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfiw.a(long, boolean):boolean
     arg types: [long, int]
     candidates:
      bfiw.a(long, long):void
      bfiw.a(java.util.Calendar, long):void
      bfiw.a(long, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfiw.b(long, boolean):void
     arg types: [long, int]
     candidates:
      bfiw.b(java.util.Calendar, long):void
      bfiw.b(long, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0256 A[EDGE_INSN: B:122:0x0256->B:89:0x0256 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0239  */
    /* renamed from: a */
    public final void mo61775a() {
        bfla bfla;
        boolean z;
        boolean z2 = false;
        do {
            long c = this.f114102t.mo62776c();
            int i = this.f114100r;
            int i2 = i - 1;
            bfla bfla2 = null;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                if (!m96936a(c, true)) {
                    long d = this.f114102t.mo62777d();
                    if (this.f114092j == -1) {
                        this.f114108z.setTimeInMillis(c + d);
                        Iterator it = this.f114101s.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bfla = (bfla) it.next();
                                long c2 = bfla.m97167c(this.f114108z);
                                if (bfla.mo61867a(c2) || bfla.f114327a > c2) {
                                    bfla2 = bfla;
                                }
                                if (!it.hasNext()) {
                                    break;
                                }
                            }
                        }
                        bfla2 = bfla;
                        bgoj bgoj = this.f114105w;
                        boolean a = bgoj.f116920a.f116933e.mo63050a(58000, bgoj.f116925f.mo62776c(), false);
                        if (bfla2 != null && a) {
                            m96934a(this.f114108z, bfla2, d);
                        } else {
                            m96933a(this.f114108z, d);
                            z2 = false;
                            continue;
                        }
                    } else if (m96935a(c)) {
                        this.f114108z.setTimeInMillis(this.f114092j + d);
                        Calendar calendar = this.f114108z;
                        Iterator it2 = this.f114101s.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            bfla bfla3 = (bfla) it2.next();
                            if (bfla3.mo61869b(calendar)) {
                                bfla2 = bfla3;
                                break;
                            }
                        }
                        if (bfla2 != null) {
                            m96939c();
                            if (!this.f114094l) {
                                if (this.f114095m == -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bmxy.m108600b(z);
                                long h = ((long) this.f114106x.mo61414h()) * 1000;
                                this.f114095m = h;
                                this.f114104v.mo60962a(h, true);
                                this.f114094l = true;
                            }
                            bfla.m97164a(this.f114108z, bfla2.f114328b);
                            m96932a(this.f114108z.getTimeInMillis() - d, d);
                            this.f114100r = 2;
                            m96940d();
                            z2 = true;
                            continue;
                        } else {
                            m96937b(c, true);
                            z2 = true;
                            continue;
                        }
                    } else {
                        this.f114103u.mo62917a(bgnq.BURST_COLLECTION_TRIGGER, this.f114092j, null);
                        z2 = false;
                        continue;
                    }
                }
                z2 = false;
                continue;
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (!m96936a(c, true)) {
                            if (!this.f114089g) {
                                z2 = false;
                                continue;
                            } else if (!this.f114085c) {
                                m96939c();
                                bgoj bgoj2 = this.f114105w;
                                long min = Math.min(bgoj2.f116920a.f116933e.mo63051b(bgoj2.f116925f.mo62776c()), 120000L);
                                if (min < 58000) {
                                    m96937b(c, true);
                                    m96940d();
                                    z2 = true;
                                    continue;
                                } else {
                                    bgoj bgoj3 = this.f114105w;
                                    bgoo bgoo = bgoj3.f116924e;
                                    long c3 = bgoj3.f116925f.mo62776c();
                                    bgom a2 = bgoo.mo63044a(min, c3);
                                    Locale locale = Locale.US;
                                    Object[] objArr = {Long.valueOf(min), Long.valueOf(bgoo.f116942c)};
                                    if (a2 != null) {
                                        bgoj3.f116920a.mo63036a(c3);
                                    }
                                    this.f114098p = a2;
                                    if (a2 != null) {
                                        this.f114097o = this.f114102t.mo62776c() + min;
                                        this.f114083a.mo62757l().mo62790a(bgnq.BURST_COLLECTION_TRIGGER, true);
                                        m96932a(this.f114097o, this.f114102t.mo62777d());
                                        this.f114100r = 5;
                                        z2 = true;
                                        continue;
                                    } else {
                                        m96937b(c, true);
                                        m96940d();
                                        z2 = true;
                                        continue;
                                    }
                                }
                            } else {
                                m96937b(c, true);
                            }
                        }
                        z2 = true;
                        continue;
                    } else if (i2 != 4) {
                        continue;
                    } else if (m96936a(c, false)) {
                        long j = this.f114097o - c;
                        if (j > 0) {
                            bgoj bgoj4 = this.f114105w;
                            bgom bgom = this.f114098p;
                            if (bgom != null) {
                                long a3 = bgom.mo63039a(j);
                                Locale locale2 = Locale.US;
                                Object[] objArr2 = {Long.valueOf(j), Long.valueOf(a3)};
                                if (a3 > 0) {
                                    bgoj4.f116920a.mo63036a(bgoj4.f116925f.mo62776c());
                                }
                            }
                        }
                        this.f114083a.mo62757l().mo62790a(bgnq.BURST_COLLECTION_TRIGGER, false);
                        this.f114097o = -1;
                        this.f114098p = null;
                        z2 = true;
                        continue;
                    } else {
                        this.f114103u.mo62917a(bgnq.BURST_COLLECTION_TRIGGER, this.f114092j, null);
                        z2 = false;
                        continue;
                    }
                } else if (m96936a(c, true)) {
                    z2 = true;
                    continue;
                } else if (m96935a(c)) {
                    this.f114083a.mo62756k().mo62918a(Boolean.TRUE);
                    m96941e();
                    this.f114100r = 4;
                    z2 = true;
                    continue;
                } else {
                    this.f114103u.mo62917a(bgnq.BURST_COLLECTION_TRIGGER, this.f114092j, null);
                    z2 = false;
                    continue;
                }
            } else if (m96936a(c, true)) {
                z2 = true;
                continue;
            } else if (this.f114090h) {
                int nextInt = this.f114107y.nextInt(this.f114106x.mo61415i());
                Locale locale3 = Locale.US;
                new Object[1][0] = Integer.valueOf(nextInt);
                m96932a(c + ((long) nextInt), this.f114102t.mo62777d());
                this.f114100r = 3;
                z2 = true;
                continue;
            } else if (m96935a(c)) {
                m96937b(c, true);
                z2 = true;
                continue;
            } else {
                this.f114103u.mo62917a(bgnq.BURST_COLLECTION_TRIGGER, this.f114092j, null);
                z2 = false;
                continue;
            }
        } while (z2);
    }
}
