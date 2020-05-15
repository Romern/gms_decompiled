package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;

/* renamed from: adta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adta {

    /* renamed from: a */
    public static final Uri f62679a;

    /* renamed from: b */
    public static final Uri f62680b;

    /* renamed from: c */
    public static final Uri f62681c;

    /* renamed from: h */
    private static final boolean f62682h;

    /* renamed from: i */
    private static adta f62683i;

    /* renamed from: j */
    private static boolean f62684j;

    /* renamed from: k */
    private static brhj f62685k;

    /* renamed from: d */
    public final Context f62686d;

    /* renamed from: e */
    public final adtg f62687e;

    /* renamed from: f */
    public final adsp f62688f;

    /* renamed from: g */
    public boolean f62689g;

    static {
        boolean z;
        Uri uri;
        Uri uri2;
        Uri uri3;
        try {
            uri3 = Telephony.Sms.CONTENT_URI;
            uri2 = Telephony.Mms.CONTENT_URI;
            uri = Telephony.MmsSms.CONTENT_URI;
            z = true;
        } catch (NoClassDefFoundError e) {
            uri3 = Uri.parse("content://sms");
            uri2 = Uri.parse("content://mms");
            uri = Uri.parse("content://mms-sms/");
            z = false;
        }
        f62679a = uri3;
        f62680b = uri2;
        f62681c = uri;
        f62682h = z;
    }

    public adta(Context context) {
        this.f62686d = context;
        adnr adnr = new adnr(context.getContentResolver(), null);
        this.f62687e = new adtg(context, adnr);
        this.f62688f = new adsp(adnr, context);
    }

    /* renamed from: a */
    public static aubt m51150a(int i) {
        return new adsw(i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adta.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      adta.a(boolean, boolean):void
      adta.a(android.content.Context, boolean):void */
    /* renamed from: b */
    static void m51153b(Context context) {
        if (!m51159h(context)) {
            SQLiteDatabase a = adtc.m51167a(context).mo33802a();
            if (a != null) {
                a.beginTransaction();
                try {
                    a.delete("mmssms", null, null);
                    if (ceqm.m137881l()) {
                        a.delete("contact_annotation", null, null);
                        new Object[1][0] = "contact_annotation";
                    }
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    m51155d(context).mo32873b("Message");
                    m51158g(context);
                    m51151a(context, true);
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            } else {
                adnt.m50871b("Failed to clear SMS Corpus database tables");
            }
        }
    }

    /* renamed from: c */
    public static adta m51154c(Context context) {
        synchronized (adta.class) {
            if (m51152a(context)) {
                if (f62683i == null) {
                    adta adta = new adta(context.getApplicationContext());
                    f62683i = adta;
                    synchronized (adta) {
                        if (!adta.f62689g) {
                            adnv.m50879a().mo33695a(new adsy(adta));
                        }
                    }
                }
                adta adta2 = f62683i;
                return adta2;
            }
            f62683i = null;
            adsu.m51138a();
            adnv.m50879a().mo33695a(new adsx(context));
            return null;
        }
    }

    /* renamed from: d */
    public static brhj m51155d(Context context) {
        if (f62685k == null) {
            f62685k = brhj.m114016a(context);
        }
        return f62685k;
    }

    /* renamed from: e */
    static synchronized boolean m51156e(Context context) {
        boolean z;
        synchronized (adta.class) {
            int i = Build.VERSION.SDK_INT;
            z = true;
            if (!f62684j) {
                if (C1145kt.m18540a(context, "android.permission.READ_SMS") != 0 || C1145kt.m18540a(context, "android.permission.READ_PHONE_STATE") != 0) {
                    z = false;
                }
                f62684j = z;
            }
        }
        return z;
    }

    /* renamed from: f */
    static SharedPreferences m51157f(Context context) {
        return context.getSharedPreferences("ipa-sms-corpus", 0);
    }

    /* renamed from: g */
    static void m51158g(Context context) {
        m51157f(context).edit().remove("last_sms_date").remove("last_mms_date").remove("last_sms_id").remove("last_mms_id").apply();
    }

    /* renamed from: h */
    private static boolean m51159h(Context context) {
        return m51157f(context).getBoolean("clear_completed_after_disable", false);
    }

    /* renamed from: a */
    private static void m51151a(Context context, boolean z) {
        if (m51159h(context) != z) {
            m51157f(context).edit().putBoolean("clear_completed_after_disable", z).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo33797d() {
        return m51157f(this.f62686d).getInt("last_sms_id", -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adta.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      adta.a(boolean, boolean):void
      adta.a(android.content.Context, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33799f() {
        m51151a(this.f62686d, false);
    }

    /* renamed from: a */
    public static boolean m51152a(Context context) {
        PackageManager packageManager;
        int i = Build.VERSION.SDK_INT;
        if (!ceqm.f183265a.mo6606a().mo79636u() || !spn.m35887f() || ((!"true".equals(stn.m36304a("ro.mobile_ninjas.is_emulated", "")) && (!f62682h || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.telephony"))) || !m51156e(context))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo33798e() {
        return m51157f(this.f62686d).getInt("last_mms_id", -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo33796c() {
        return m51157f(this.f62686d).getLong("last_mms_date", -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final adtc mo33793a() {
        return adtc.m51167a(this.f62686d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo33795b() {
        return m51157f(this.f62686d).getLong("last_sms_date", -1);
    }

    /* renamed from: a */
    public final void mo33794a(boolean z, boolean z2) {
        adnv.m50879a().mo33695a(new adsz(this, z, z2));
        adsu.m51141b(this.f62686d);
    }
}
