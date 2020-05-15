package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: argz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argz {

    /* renamed from: a */
    static final long f87711a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b */
    public static final sek f87712b = ascp.m73787a("D2D", "EnrollmentChecker");

    /* renamed from: d */
    private static volatile argz f87713d;

    /* renamed from: c */
    CountDownLatch f87714c;

    /* renamed from: e */
    private long f87715e;

    /* renamed from: f */
    private final ios f87716f;

    /* renamed from: g */
    private final adyd f87717g;

    /* renamed from: h */
    private final Map f87718h = new HashMap();

    private argz(Context context) {
        ios a = inl.m15759a(context.getApplicationContext());
        adyd a2 = adyd.m51363a(context.getApplicationContext());
        sdo.m34959a(context);
        this.f87716f = a;
        this.f87717g = a2;
    }

    /* renamed from: a */
    public static argz m72750a(Context context) {
        if (f87713d == null) {
            synchronized (argz.class) {
                if (f87713d == null) {
                    f87713d = new argz(context);
                }
            }
        }
        return f87713d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized long mo48530b() {
        long currentTimeMillis = System.currentTimeMillis() - this.f87715e;
        long j = (long) ((int) cgqs.f187523a.mo6606a().mo84324j());
        if (currentTimeMillis >= j) {
            return 0;
        }
        return j - currentTimeMillis;
    }

    /* renamed from: c */
    public final void mo48532c() {
        List asList = Arrays.asList(this.f87717g.mo33916a("com.google"));
        if (cgpa.m146403d()) {
            mo48531b(asList);
        } else {
            mo48529a(asList);
        }
    }

    /* renamed from: a */
    private final void m72751a(CountDownLatch countDownLatch, Account account) {
        this.f87716f.mo13178a(4, bnkn.m109665a("PublicKey", "authzen"), "ForceRegistration", account, null).mo50371a(new argy(account, countDownLatch));
    }

    /* renamed from: b */
    public final synchronized void mo48531b(List list) {
        cgqd.m146558c();
        f87712b.mo25409a("Enrolling accounts", new Object[0]);
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (!"com.google".equals(account.type)) {
                countDownLatch.countDown();
            } else {
                if (this.f87718h.containsKey(account.name)) {
                    if (currentTimeMillis - ((Long) this.f87718h.get(account.name)).longValue() < f87711a) {
                        countDownLatch.countDown();
                    }
                }
                f87712b.mo25409a("Enrolling %s", account.name);
                this.f87718h.put(account.name, Long.valueOf(currentTimeMillis));
                m72751a(countDownLatch, account);
            }
        }
        this.f87715e = System.currentTimeMillis();
        this.f87714c = countDownLatch;
    }

    /* renamed from: a */
    public final void mo48528a() {
        sdo.m34973b("Should not await on main thread!");
        CountDownLatch countDownLatch = this.f87714c;
        if (countDownLatch != null) {
            try {
                if (!countDownLatch.await(mo48530b(), TimeUnit.MILLISECONDS)) {
                    try {
                        f87712b.mo25418e("Timed out waiting Cryptauth", new Object[0]);
                    } catch (InterruptedException e) {
                        e = e;
                    }
                }
            } catch (InterruptedException e2) {
                e = e2;
                f87712b.mo25410a((Throwable) e);
                this.f87714c = null;
            }
        }
        this.f87714c = null;
    }

    /* renamed from: a */
    public final synchronized boolean mo48529a(List list) {
        cgqd.m146558c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f87715e <= f87711a) {
            return false;
        }
        f87712b.mo25409a("Enrolling accounts", new Object[0]);
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (!"com.google".equals(account.type)) {
                countDownLatch.countDown();
            } else {
                m72751a(countDownLatch, account);
            }
        }
        this.f87714c = countDownLatch;
        this.f87715e = currentTimeMillis;
        return true;
    }
}
