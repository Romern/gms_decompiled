package p000;

import android.telephony.NumberVerificationCallback;
import android.telephony.PhoneNumberRange;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: teg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class teg {

    /* renamed from: a */
    public static final Logger f45738a = tea.m36798a("flash_call_receiver");

    /* renamed from: f */
    private static final bnhe f45739f;

    /* renamed from: b */
    public final AtomicBoolean f45740b = new AtomicBoolean();

    /* renamed from: c */
    final NumberVerificationCallback f45741c = new tef(this);

    /* renamed from: d */
    public CountDownLatch f45742d = null;

    /* renamed from: e */
    public Object f45743e = null;

    /* renamed from: g */
    private final TelephonyManager f45744g;

    /* renamed from: h */
    private final Executor f45745h = snp.m35702a(9);

    /* renamed from: i */
    private final ReentrantLock f45746i = new ReentrantLock();

    /* renamed from: j */
    private tei f45747j = null;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(0, "UNSPECIFIED");
        h.mo67695b(1, "TIMED OUT");
        h.mo67695b(2, "NETWORK NOT AVAILABLE");
        h.mo67695b(3, "TOO MANY CALLS");
        h.mo67695b(4, "CONCURRENT REQUESTS");
        h.mo67695b(5, "IN ECBM");
        h.mo67695b(6, "IN EMERGENCY CALL");
        f45739f = h.mo67618b();
    }

    public teg(TelephonyManager telephonyManager) {
        this.f45744g = telephonyManager;
    }

    /* renamed from: a */
    static String m36823a(int i) {
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i);
        return String.format(locale, "FlashCall verification failed, reason code: %d, %s.", valueOf, f45739f.getOrDefault(valueOf, "UNKNOWN"));
    }

    /* renamed from: b */
    public static int m36824b(int i) {
        switch (i) {
            case 1:
                return 72;
            case 2:
                return 73;
            case 3:
                return 74;
            case 4:
                return 75;
            case 5:
                return 76;
            case 6:
                return 77;
            default:
                return 71;
        }
    }

    /* renamed from: c */
    public static int m36825c(int i) {
        switch (i) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            default:
                return 2;
        }
    }

    /* renamed from: b */
    public final void mo26436b(tei tei) {
        synchronized (this.f45746i) {
            if (this.f45747j == tei) {
                this.f45747j = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final tei mo26433a() {
        tei tei;
        synchronized (this.f45746i) {
            tei = this.f45747j;
        }
        return tei;
    }

    /* renamed from: a */
    public final void mo26434a(tei tei) {
        synchronized (this.f45746i) {
            this.f45747j = tei;
            Object obj = this.f45743e;
            if (obj != null) {
                if (obj instanceof String) {
                    tei.mo26439a((String) obj);
                } else if (obj instanceof Integer) {
                    tei.mo26438a(((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26435a(cbos cbos) {
        String str;
        boolean z = false;
        if (cbos.f177857a.charAt(0) == '+') {
            str = cbos.f177857a.substring(1);
        } else {
            str = cbos.f177857a;
        }
        PhoneNumberRange phoneNumberRange = new PhoneNumberRange(str, cbos.f177858b, cbos.f177860d, cbos.f177859c);
        synchronized (this.f45746i) {
            if (this.f45740b.get()) {
                f45738a.mo25418e("Request for phonerange: %s failed, can't trigger more than one request.", phoneNumberRange);
            } else {
                this.f45743e = null;
                try {
                    this.f45742d = new CountDownLatch(1);
                    this.f45744g.requestNumberVerification(phoneNumberRange, cdgc.m133121b(), this.f45745h, this.f45741c);
                    f45738a.mo25412b("Request done, with timeout: %d ms, phonerange: %s.", Long.valueOf(cdgc.m133121b()), phoneNumberRange);
                    this.f45740b.set(true);
                    this.f45742d.await(cdgc.f180745a.mo6606a().mo77486h(), TimeUnit.MILLISECONDS);
                    if (this.f45742d.getCount() > 0) {
                        z = true;
                    }
                } catch (InterruptedException e) {
                    f45738a.mo25417e("Request failed, latch was interrupted.", e, new Object[0]);
                    return z;
                } catch (SecurityException e2) {
                    f45738a.mo25417e("Request failed, gmscore is not set in device config.", e2, new Object[0]);
                    return z;
                }
            }
        }
        return z;
    }
}
