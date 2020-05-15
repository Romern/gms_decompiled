package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.smsindexer.SmsMonitorIntentOperation;

/* renamed from: adsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adsu extends adzx {

    /* renamed from: d */
    private static adsu f62668d;

    /* renamed from: a */
    private final Context f62669a;

    /* renamed from: b */
    private final skc f62670b;

    /* renamed from: c */
    private long f62671c = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private adsu(Context context) {
        super("ipa", "SmsContentObserver", null);
        skc skc = new skc(context);
        this.f62669a = context;
        this.f62670b = skc;
    }

    /* renamed from: a */
    public static synchronized void m51138a() {
        synchronized (adsu.class) {
            if (f62668d != null) {
                f62668d.f62669a.getContentResolver().unregisterContentObserver(f62668d);
                f62668d.m51142c();
                f62668d = null;
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m51139a(long j) {
        this.f62671c = j;
    }

    /* renamed from: b */
    static synchronized void m51141b(Context context) {
        synchronized (adsu.class) {
            m51140a(context);
            if (f62668d != null) {
                f62668d.m51142c();
                f62668d.m51139a(SystemClock.elapsedRealtime());
            }
        }
    }

    /* renamed from: c */
    private final void m51142c() {
        PendingIntent service = PendingIntent.getService(this.f62669a, 0, m51144d(this.f62669a), 536870912);
        if (service != null) {
            synchronized (adsu.class) {
                f62668d.f62670b.mo25668a(service);
            }
            service.cancel();
        }
    }

    /* renamed from: d */
    static Intent m51144d(Context context) {
        return IntentOperation.getStartIntent(context, SmsMonitorIntentOperation.class, "com.google.android.gms.ipa.smsindexer.SMS_CHANGED");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m51140a(Context context) {
        synchronized (adsu.class) {
            if (!adta.m51152a(context)) {
                m51138a();
            } else if (f62668d == null) {
                adsu adsu = new adsu(context.getApplicationContext());
                f62668d = adsu;
                adsu.mo33789b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo33789b() {
        try {
            this.f62669a.getContentResolver().registerContentObserver(adta.f62681c, false, this);
        } catch (NoClassDefFoundError | SecurityException e) {
            adns.m50862a().mo33690a(51);
        }
    }

    /* renamed from: c */
    public static synchronized void m51143c(Context context) {
        synchronized (adsu.class) {
            m51140a(context);
            if (f62668d != null) {
                f62668d.onChange(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r2 <= (r1.f62671c + p000.ceqm.f183265a.mo6606a().mo79641z())) goto L_0x0034;
     */
    /* renamed from: a */
    public final synchronized void mo13611a(boolean z, Uri uri) {
        synchronized (this) {
            new Object[1][0] = Boolean.valueOf(z);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Intent d = m51144d(this.f62669a);
            if (PendingIntent.getService(this.f62669a, 0, d, 536870912) != null) {
            }
            PendingIntent service = PendingIntent.getService(this.f62669a, 0, d, 134217728);
            long M = ceqm.f183265a.mo6606a().mo79600M();
            this.f62670b.mo25675a("Ipa:SmsObserverOnChange", 2, elapsedRealtime + M, service, (String) null);
            new Object[1][0] = Long.valueOf(M);
        }
    }
}
