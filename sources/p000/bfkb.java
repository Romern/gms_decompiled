package p000;

import android.os.Build;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: bfkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkb extends bfit {

    /* renamed from: A */
    private bfla f114259A;

    /* renamed from: B */
    private boolean f114260B = false;

    /* renamed from: C */
    private final bfir f114261C;

    /* renamed from: D */
    private boolean f114262D = false;

    /* renamed from: k */
    public final Set f114263k = bfgt.m96707a(bfgt.f113817g, bfgt.f113811a, bfgt.f113830t, bfgt.f113815e, bfgt.f113814d, bfgt.f113818h);

    /* renamed from: l */
    public long f114264l = -1;

    /* renamed from: m */
    public bfju f114265m = null;

    /* renamed from: n */
    public boolean f114266n = false;

    /* renamed from: o */
    public long f114267o = -1;

    /* renamed from: p */
    public bfft f114268p = null;

    /* renamed from: q */
    public boolean f114269q = false;

    /* renamed from: r */
    public final bfhp f114270r = new bfka(this);

    /* renamed from: s */
    long f114271s = -1;

    /* renamed from: t */
    private final bfjf f114272t;

    /* renamed from: u */
    private final bfjy f114273u;

    /* renamed from: v */
    private final bfja f114274v;

    /* renamed from: w */
    private final bglw f114275w;

    /* renamed from: x */
    private final bfjx f114276x;

    /* renamed from: y */
    private boolean f114277y = false;

    /* renamed from: z */
    private Integer f114278z;

    static {
        bfgt.m96707a(bfgt.f113814d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfkb(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq, bfjf bfjf, bfja bfja, bfjy bfjy, bglw bglw, bfjx bfjx) {
        super("SCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.IDLE);
        this.f114272t = bfjf;
        this.f114273u = bfjy;
        this.f114274v = bfja;
        this.f114275w = bglw;
        this.f114276x = bfjx;
        bgnr p = bgnp.mo62761p();
        if (p.mo62796a(bfgt.f113820j)) {
            this.f114263k.add(bfgt.f113820j);
        } else if (p.mo62796a(bfgt.f113816f)) {
            this.f114263k.add(bfgt.f113816f);
        }
        if (p.mo62796a(bfgt.f113819i)) {
            this.f114263k.add(bfgt.f113819i);
        }
        int i = Build.VERSION.SDK_INT;
        this.f114263k.add(bfgt.f113827q);
        this.f114261C = new bfir(bgmk, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m97088a(long j, long j2, long j3, int i, boolean z) {
        long d = this.f114049c.mo62777d();
        long j4 = j + d;
        long j5 = j3 + d;
        this.f114272t.mo61784a(j4, j5, i, this.f114265m);
        this.f114272t.mo61790c();
        Locale locale = Locale.US;
        Object[] objArr = {Integer.valueOf(i), new Date(j4), new Date(j5)};
        if (j2 != -1) {
            long j6 = j3 - j2;
            if (j6 > 0) {
                bgoj bgoj = this.f114053g;
                long c = bgoj.f116925f.mo62776c();
                bgoj.f116920a.f116932d.mo63053b(j6, c);
                long j7 = bgoj.f116920a.f116932d.f116942c;
                StringBuilder sb = new StringBuilder(59);
                sb.append("gps tokens left for sensor collection: ");
                sb.append(j7);
                sb.toString();
                bgoj.f116920a.mo63036a(c);
            }
        }
        m97093h(z);
    }

    /* renamed from: g */
    private final void m97091g(boolean z) {
        if (z != this.f114266n) {
            if (z) {
                this.f114275w.mo60962a(180000, true);
            } else {
                this.f114275w.mo60985c(180000);
            }
            this.f114266n = z;
        }
    }

    /* renamed from: h */
    private final void m97092h(long j) {
        long j2 = this.f114264l;
        if (j2 == -1 || Math.abs(j - j2) > 1000) {
            this.f114264l = j;
            this.f114050d.mo62917a(bgnq.SENSOR_COLLECTOR, j, null);
            Locale locale = Locale.US;
            new Object[1][0] = new Date(this.f114049c.mo62777d() + j);
        }
    }

    /* renamed from: j */
    private final Calendar m97094j() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f114049c.mo62775b());
        return instance;
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
        this.f114260B = true;
    }

    /* renamed from: b */
    public final void mo61757b(boolean z) {
        this.f114273u.mo61812b();
    }

    /* renamed from: c */
    public final void mo61759c(boolean z) {
        this.f114277y = z;
    }

    /* renamed from: e */
    public final void mo61765e() {
        String valueOf = String.valueOf(this.f114273u.mo61814c());
        if (valueOf.length() == 0) {
            new String("Sensor policy changed: ");
        } else {
            "Sensor policy changed: ".concat(valueOf);
        }
        m97090a(m97094j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    public final int mo61819f(boolean z) {
        boolean z2;
        int i;
        File[] listFiles;
        if (z) {
            return 1;
        }
        int i2 = this.f114273u.f114251i;
        boolean cs = this.f114048b.mo62757l().mo62791cs();
        bsax bsax = this.f114274v.f114143p;
        bgoj bgoj = this.f114053g;
        boolean a = bgoj.f116920a.f116932d.mo63050a(300000, bgoj.f116925f.mo62776c(), true);
        boolean z3 = false;
        if (i2 == 1) {
            if (!this.f114277y) {
                z2 = false;
            } else if (cs && bsax != null && a) {
                z2 = true;
            }
            if (z2) {
                File d = this.f114048b.mo62753h().mo62784d();
                if (d == null || (listFiles = d.listFiles()) == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            i++;
                        }
                    }
                }
                boolean z4 = i < 3;
                if (i >= 3) {
                    z3 = true;
                }
                z2 = z4;
            }
            if (!z2) {
                return 1;
            }
            if (i2 != 1) {
                return i2;
            }
            if (!cs) {
                return 24;
            }
            if (bsax == null) {
                return 26;
            }
            if (a) {
                return !z3 ? 99 : 27;
            }
            return 25;
        }
        z2 = false;
        if (z2) {
        }
        if (!z2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo61820i() {
        bfjy bfjy = this.f114273u;
        boolean z = bfjy.f114250h;
        if (!z) {
            String valueOf = String.valueOf(bfjy.toString());
            if (valueOf.length() == 0) {
                new String("cantSchedule: ");
            } else {
                "cantSchedule: ".concat(valueOf);
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfkb.a(long, long, long, int, boolean):void
     arg types: [long, int, long, int, int]
     candidates:
      bfkb.a(bfkb, long, long, long, int):void
      bfkb.a(long, long, long, int, boolean):void */
    /* renamed from: b */
    public final boolean mo61758b(long j) {
        boolean z;
        bfla bfla;
        bfjv bfjv;
        bfla bfla2;
        bfft bfft;
        Integer num;
        long j2 = j;
        if (this.f114260B) {
            z = false;
        } else if (mo61820i()) {
            Calendar j3 = m97094j();
            boolean a = this.f114261C.mo61741a();
            if (this.f114264l == -1) {
                m97090a(j3);
            }
            bfjv a2 = this.f114276x.mo61807a(j3, a);
            bfla bfla3 = a2.f114236c;
            if (bfla3 != null) {
                List list = this.f114276x.f114239a;
                int size = list.size();
                int i = 0;
                while (i < size) {
                    bfla bfla4 = (bfla) list.get(i);
                    i++;
                    if (bfla4.mo61867a(bfla3.f114327a)) {
                        bfla = bfla4;
                    }
                }
                String valueOf = String.valueOf(bfla3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Did not find parent of subtimespan: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            bfla = null;
            bfla bfla5 = this.f114259A;
            if (bfla5 == null) {
                bfla2 = bfla;
                bfjv = a2;
            } else if (bfla5.equals(bfla) || (num = this.f114278z) == null) {
                bfla2 = bfla;
                bfjv = a2;
            } else {
                String valueOf2 = String.valueOf(num);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 69);
                sb2.append("Unable to do collection in the last timespan. Reporting the failure: ");
                sb2.append(valueOf2);
                sb2.toString();
                bfla2 = bfla;
                bfjv = a2;
                m97088a(j, -1L, j, num.intValue(), false);
            }
            this.f114259A = bfla2;
            if (bfjv.f114234a) {
                this.f114265m = bfjv.f114235b;
                int f = mo61819f(a);
                if (f != 1) {
                    this.f114278z = Integer.valueOf(f);
                } else {
                    if (!a) {
                        long j4 = this.f114271s;
                        if (j4 == -1 || j2 - j4 >= 30000) {
                            this.f114278z = 21;
                        }
                    }
                    this.f114261C.mo61742b();
                    if (this.f114264l != -1) {
                        this.f114264l = -1;
                        this.f114050d.mo62914a(bgnq.SENSOR_COLLECTOR);
                    }
                    this.f114056j = bfis.SENSOR_COLLECTION_WAIT;
                    m97091g(false);
                    HashMap hashMap = new HashMap();
                    hashMap.put(bfgt.f113815e, Integer.valueOf(this.f114272t.mo61792e()));
                    hashMap.put(bfgt.f113814d, Integer.valueOf(this.f114272t.mo61793f()));
                    bgnr p = this.f114048b.mo62761p();
                    if (p.mo62796a(bfgt.f113820j)) {
                        hashMap.put(bfgt.f113820j, 1);
                    } else if (p.mo62796a(bfgt.f113816f)) {
                        hashMap.put(bfgt.f113816f, 1);
                    }
                    if (p.mo62796a(bfgt.f113819i)) {
                        hashMap.put(bfgt.f113819i, 3);
                    }
                    EnumSet noneOf = EnumSet.noneOf(bfgt.class);
                    for (bfgt bfgt : this.f114263k) {
                        if (bfgt != bfgt.f113830t || ceze.f183524a.mo6606a().useWifiRtt()) {
                            noneOf.add(bfgt);
                        }
                    }
                    File d = this.f114048b.mo62753h().mo62784d();
                    if (d != null) {
                        bfft = this.f114048b.mo62747b().mo62764a(noneOf, hashMap, d.getPath(), 14, cfaj.f183544a.mo6606a().forceSensorCollectionUpload(), cfaj.f183544a.mo6606a().sensorCollectionWifiScanDelayMs(), this.f114274v.f114143p, this.f114270r, this.f114047a);
                    } else {
                        bfft = null;
                    }
                    this.f114268p = bfft;
                    if (bfft != null) {
                        this.f114267o = j2;
                        this.f114269q = false;
                        this.f114262D = a;
                        bfft.mo61627a();
                        bfjc.m96991a(this.f114048b.mo62760o(), true);
                    }
                    if (this.f114268p == null) {
                        this.f114056j = bfis.IDLE;
                        m97088a(j, -1L, j, 29, false);
                    }
                }
            }
            if (this.f114056j != bfis.IDLE) {
                return true;
            }
            return false;
        } else {
            z = false;
        }
        this.f114260B = z;
        return z;
    }

    /* renamed from: g */
    public final void mo61770g(long j) {
        this.f114261C.mo61740a(j);
    }

    /* renamed from: h */
    private final void m97093h(boolean z) {
        this.f114268p = null;
        this.f114269q = false;
        this.f114267o = -1;
        this.f114262D = false;
        this.f114278z = null;
        this.f114259A = null;
        if (z) {
            this.f114050d.mo62917a(bgnq.SENSOR_COLLECTOR, 0, null);
        }
    }

    /* renamed from: h */
    public final boolean mo61772h() {
        if (this.f114268p != null) {
            if (!this.f114262D) {
                bfjy bfjy = this.f114273u;
                if (bfjy.f114251i != 1) {
                    this.f114269q = true;
                    if (bfjy.mo61816d() && mo61754a()) {
                        bfft bfft = this.f114268p;
                        if (bfft != null) {
                            bfft.mo61628b();
                        }
                    } else {
                        bfft bfft2 = this.f114268p;
                        if (bfft2 != null) {
                            bfft2.mo61629c();
                        }
                        m97093h(false);
                        this.f114056j = bfis.IDLE;
                        return true;
                    }
                }
            }
            return false;
        }
        this.f114056j = bfis.IDLE;
        return true;
    }

    /* renamed from: a */
    private final void m97090a(Calendar calendar) {
        boolean a = this.f114261C.mo61741a();
        int f = mo61819f(a);
        boolean z = this.f114276x.mo61807a(calendar, a).f114234a;
        if (f == 1 && z && this.f114056j == bfis.IDLE) {
            m97091g(true);
            m97092h(this.f114276x.mo61806a(calendar));
            return;
        }
        m97091g(false);
        if (!mo61820i()) {
            return;
        }
        if (z) {
            m97092h(this.f114276x.mo61806a(calendar));
        } else {
            m97092h(this.f114276x.mo61808b(calendar, true));
        }
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        if (bgnq == bgnq.SENSOR_COLLECTOR) {
            this.f114264l = -1;
            m97090a(m97094j());
        }
    }

    /* renamed from: a */
    public final void mo61750a(ActivityRecognitionResult activityRecognitionResult) {
        String valueOf = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Detected activity: ");
        sb.append(valueOf);
        sb.toString();
        if (activityRecognitionResult.mo43491a().mo43513a() == 2) {
            this.f114271s = this.f114049c.mo62776c();
        }
    }
}
