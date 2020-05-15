package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.icing.proxy.SmsMonitorIntentOperation;

/* renamed from: acof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acof extends adzx {

    /* renamed from: e */
    private static acof f60326e;

    /* renamed from: a */
    private final Context f60327a;

    /* renamed from: b */
    private final skc f60328b;

    /* renamed from: c */
    private final abym f60329c;

    /* renamed from: d */
    private long f60330d = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private acof(Context context) {
        super("icing", "SmsContentObserver", null);
        abym abym = new abym(context);
        skc skc = new skc(context);
        this.f60327a = context;
        this.f60328b = skc;
        this.f60329c = abym;
    }

    /* renamed from: a */
    public static synchronized void m49591a() {
        synchronized (acof.class) {
            if (f60326e != null) {
                acnv.m49554d("Unregistering SMS content observer");
                f60326e.f60327a.getContentResolver().unregisterContentObserver(f60326e);
                f60326e.m49595c();
                f60326e = null;
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m49592a(long j) {
        this.f60330d = j;
    }

    /* renamed from: b */
    static synchronized void m49594b(Context context) {
        synchronized (acof.class) {
            m49593a(context);
            if (f60326e != null) {
                f60326e.m49595c();
                f60326e.m49592a(SystemClock.elapsedRealtime());
                acnv.m49554d("SMS Corpus update scheduled");
            }
        }
    }

    /* renamed from: c */
    private final void m49595c() {
        PendingIntent service = PendingIntent.getService(this.f60327a, 0, m49597d(this.f60327a), 536870912);
        if (service != null) {
            synchronized (acof.class) {
                f60326e.f60328b.mo25668a(service);
            }
            service.cancel();
        }
    }

    /* renamed from: d */
    static Intent m49597d(Context context) {
        return IntentOperation.getStartIntent(context, SmsMonitorIntentOperation.class, "com.google.android.gms.icing.proxy.action.SMS_CHANGED");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m49593a(Context context) {
        synchronized (acof.class) {
            acnv.m49554d("SmsContentObserver.maybeRegister");
            if (!acok.m49601a(context)) {
                acnv.m49554d("SMS content observer isn't registered because SMS Corpus is disabled.");
                m49591a();
            } else if (f60326e == null) {
                acnv.m49554d("Registering SMS content observer");
                acof acof = new acof(context.getApplicationContext());
                f60326e = acof;
                acof.mo32945b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo32945b() {
        try {
            this.f60327a.getContentResolver().registerContentObserver(acok.f60338c, false, this);
        } catch (NoClassDefFoundError | SecurityException e) {
            this.f60329c.mo32447a("sms_register_observer_failed");
            acnv.m49546b("Failed to register SMS Corpus observer");
        }
    }

    /* renamed from: c */
    public static synchronized void m49596c(Context context) {
        synchronized (acof.class) {
            m49593a(context);
            if (f60326e != null) {
                f60326e.onChange(false);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo13611a(boolean z, Uri uri) {
        acnv.m49555d("SmsObserver onChange selfChange=%b", Boolean.valueOf(z));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent d = m49597d(this.f60327a);
        if (PendingIntent.getService(this.f60327a, 0, d, 536870912) != null) {
            if (elapsedRealtime > this.f60330d + ((Long) abzt.f58853U.mo58455c()).longValue()) {
                acnv.m49554d("Max deferral time for SMS processing reached");
                return;
            }
        }
        PendingIntent service = PendingIntent.getService(this.f60327a, 0, d, 134217728);
        long longValue = ((Long) abzt.f58852T.mo58455c()).longValue();
        this.f60328b.mo25675a("Icing:SmsObserverOnChange", 2, elapsedRealtime + longValue, service, (String) null);
        acnv.m49555d("Deferring SMS processing by %d ms", Long.valueOf(longValue));
    }
}
