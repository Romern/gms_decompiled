package p000;

import android.app.Application;
import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdld extends bdky implements bdkj, bdhy {

    /* renamed from: f */
    private static final bnrt f105868f = bnrt.m110178a("bdld");

    /* renamed from: a */
    volatile bdgg f105869a;

    /* renamed from: b */
    public final cijl f105870b;

    /* renamed from: c */
    public final AtomicBoolean f105871c;

    /* renamed from: d */
    public volatile ciof f105872d;

    /* renamed from: e */
    volatile bdlb f105873e;

    /* renamed from: g */
    private final boolean f105874g;

    /* renamed from: h */
    private final int f105875h;

    /* renamed from: i */
    private final AtomicBoolean f105876i = new AtomicBoolean();

    /* renamed from: j */
    private final bdfd f105877j;

    /* renamed from: k */
    private final bdkg f105878k;

    /* renamed from: l */
    private final bdpz f105879l = bdpz.m91271a();

    public bdld(bdkh bdkh, Application application, cijl cijl, bmxv bmxv) {
        this.f105878k = bdkh.mo58105a(bqfb.INSTANCE, this.f105879l);
        this.f105870b = cijl;
        float b = ((bdkx) bmxv.mo66814b()).mo58132b();
        boolean z = true;
        bmxy.m108589a(b > 0.0f && b <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.f105877j = bdfd.m90662a(application);
        bdkw bdkw = new bdkw();
        bdkw.f105860b = Float.valueOf(100.0f);
        bdql bdql = bdql.f106267b;
        if (bdql != null) {
            bdkw.f105861c = bdql;
            bdkw.f105859a = false;
            bdkw.f105862d = false;
            String str = bdkw.f105859a == null ? " enabled" : "";
            str = bdkw.f105860b == null ? str.concat(" startupSamplePercentage") : str;
            str = bdkw.f105861c == null ? String.valueOf(str).concat(" stackTraceTransmitter") : str;
            str = bdkw.f105862d == null ? String.valueOf(str).concat(" deferredInitLogging") : str;
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            float f = new bdkv(bdkw.f105859a.booleanValue(), bdkw.f105860b.floatValue(), bdkw.f105861c, bdkw.f105862d.booleanValue()).f105855a;
            this.f105874g = bdqa.m91274a(b / f).mo58289a();
            this.f105875h = (int) (f / b);
            ((bdkx) bmxv.mo66814b()).mo58135e();
            bmxy.m108581a(((bdkx) bmxv.mo66814b()).mo58133c());
            this.f105871c = new AtomicBoolean((!((bdkx) bmxv.mo66814b()).mo58134d() || !bdjb.m90893d(application)) ? false : z);
            return;
        }
        throw new NullPointerException("Null stackTraceTransmitter");
    }

    /* renamed from: b */
    private final void m91009b(cioo cioo) {
        if (!this.f105874g || this.f105879l.mo58288b()) {
            bnrq bnrq = (bnrq) f105868f.mo68390d();
            bnrq.mo68432a("bdld", "b", 306, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("Startup metric for '%s' dropped.", cioo);
        } else if (beel.m91854a()) {
            bdhp.m90826a(bqga.m112776a(new bdkz(this, cioo), (Executor) this.f105870b.mo6445a()));
        } else {
            mo58142a(cioo);
        }
    }

    /* renamed from: a */
    public final void mo58063a() {
        if (!this.f105871c.get()) {
            cioo cioo = cioo.PRIMES_FIRST_ACTIVITY_LAUNCHED;
            if (!this.f105874g || this.f105879l.mo58288b()) {
                bnrq bnrq = (bnrq) f105868f.mo68390d();
                bnrq.mo68432a("bdld", "b", 306, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68420a("Startup metric for '%s' dropped.", cioo);
            } else if (beel.m91854a()) {
                bdhp.m90826a(bqga.m112776a(new bdkz(this, cioo), (Executor) this.f105870b.mo6445a()));
            } else {
                mo58142a(cioo);
            }
        }
        this.f105873e = new bdlb(this);
        this.f105877j.mo57955a(this.f105873e);
    }

    /* renamed from: c */
    public final void mo58086c() {
        if (this.f105871c.get()) {
            this.f105872d = null;
        } else if (!this.f105879l.mo58288b() && this.f105874g) {
            mo58142a(cioo.PRIMES_CRASH_MONITORING_INITIALIZED);
        } else {
            bnrq bnrq = (bnrq) f105868f.mo68390d();
            bnrq.mo68432a("bdld", "c", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.");
        }
    }

    /* renamed from: b */
    public final void mo58031b() {
        if (this.f105873e != null) {
            this.f105877j.mo57956b(this.f105873e);
            this.f105873e = null;
        }
        if (this.f105876i.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof bdlc)) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((bdlc) Thread.getDefaultUncaughtExceptionHandler()).f105867a;
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
    }

    /* renamed from: a */
    public final void mo58142a(cioo cioo) {
        bxvd da = cios.f191113s.mo74144da();
        bxvd da2 = ciop.f191103d.mo74144da();
        int i = this.f105875h;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ciop ciop = (ciop) da2.f164949b;
        int i2 = ciop.f191105a | 2;
        ciop.f191105a = i2;
        ciop.f191107c = i;
        ciop.f191106b = cioo.f191102f;
        ciop.f191105a = i2 | 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cios cios = (cios) da.f164949b;
        ciop ciop2 = (ciop) da2.mo74062i();
        ciop2.getClass();
        cios.f191122h = ciop2;
        cios.f191115a |= 128;
        this.f105878k.mo58102a((cios) da.mo74062i());
    }
}
