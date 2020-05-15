package p000;

import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: awrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrh {

    /* renamed from: a */
    private static awrh f94910a;

    /* renamed from: b */
    private final AtomicLong f94911b = new AtomicLong();

    /* renamed from: c */
    private final ExecutorService f94912c;

    /* renamed from: d */
    private final C1231nx f94913d;

    public awrh(int i, ExecutorService executorService) {
        this.f94912c = executorService;
        this.f94913d = new C1231nx(i);
    }

    /* renamed from: a */
    public static synchronized awrh m80776a() {
        awrh awrh;
        synchronized (awrh.class) {
            if (f94910a == null) {
                f94910a = new awrh(((Integer) awie.f94416l.mo58455c()).intValue(), awrt.f94941a);
            }
            awrh = f94910a;
        }
        return awrh;
    }

    /* renamed from: b */
    public final Object mo52502b(awrf awrf) {
        return m80777a(awrf, false, "prefetchAndDoNotConsume");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r6 <= android.os.SystemClock.elapsedRealtime()) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fa A[SYNTHETIC] */
    /* renamed from: a */
    private final Object m80777a(awrf awrf, boolean z, String str) {
        String format;
        awrg awrg;
        Throwable th;
        Throwable e;
        awre awre;
        awgg awgg = new awgg();
        awgg.f94298a = true;
        awgg.mo52123a(awrf.getClass().getCanonicalName());
        awgg.mo52123a(awrf.mo52497a());
        awrf.mo52498a(awgg);
        String a = awgg.mo52121a();
        synchronized (this) {
            format = String.format(Locale.US, "%s(%s)[%d]", str, awrf.mo52497a(), Long.valueOf(this.f94911b.getAndIncrement()));
            awrg = (awrg) this.f94913d.mo15546a(a);
            if (awrg != null) {
                if (!z || !awrg.f94908c) {
                    long j = awrg.f94909d;
                    if (j < 0) {
                    }
                    Locale locale = Locale.US;
                    Object[] objArr = {format, awrg.f94906a};
                    if (z) {
                        awrg.f94908c = true;
                    }
                }
            }
            Locale locale2 = Locale.US;
            new Object[1][0] = format;
            awrg = new awrg(format, new FutureTask(new awrc(awrf)));
            this.f94912c.execute(awrg.f94907b);
            this.f94913d.mo15547a(a, awrg);
            if (z) {
            }
        }
        awre awre2 = new awre(null, -1);
        try {
            awre = (awre) awrg.f94907b.get(((Long) awie.f94415k.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
            try {
                new Object[1][0] = format;
                Object obj = awre.f94904a;
                synchronized (this) {
                    awrg.mo52500a(awre.f94905b);
                    if (z && this.f94913d.mo15546a(a) == awrg) {
                        this.f94913d.mo15552b(a);
                    }
                }
                return obj;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
                try {
                    Locale locale3 = Locale.US;
                    new Object[1][0] = format;
                    throw new awrd("Failed to fetch", e);
                } catch (Throwable th2) {
                    th = th2;
                    awre2 = awre;
                    synchronized (this) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                awre2 = awre;
                synchronized (this) {
                    awrg.mo52500a(awre2.f94905b);
                    if (z && this.f94913d.mo15546a(a) == awrg) {
                        this.f94913d.mo15552b(a);
                    }
                }
                throw th;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            awre = awre2;
            e = e3;
            Locale locale32 = Locale.US;
            new Object[1][0] = format;
            throw new awrd("Failed to fetch", e);
        } catch (Throwable th4) {
            th = th4;
            synchronized (this) {
            }
        }
    }

    /* renamed from: a */
    public final Object mo52501a(awrf awrf) {
        return m80777a(awrf, true, "fetchAndConsume");
    }
}
