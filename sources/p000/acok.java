package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.icing.proxy.SmsChimeraContentProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acok {

    /* renamed from: a */
    public static final Uri f60336a;

    /* renamed from: b */
    public static final Uri f60337b;

    /* renamed from: c */
    public static final Uri f60338c;

    /* renamed from: h */
    private static final boolean f60339h;

    /* renamed from: i */
    private static acok f60340i;

    /* renamed from: j */
    private static boolean f60341j;

    /* renamed from: d */
    public final Context f60342d;

    /* renamed from: e */
    public final abym f60343e = new abym(this.f60342d);

    /* renamed from: f */
    public final acoq f60344f;

    /* renamed from: g */
    public boolean f60345g;

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
        f60336a = uri3;
        f60337b = uri2;
        f60338c = uri;
        f60339h = z;
    }

    public acok(Context context) {
        this.f60342d = context;
        this.f60344f = new acoq(context, new acne(this.f60343e, context.getContentResolver()));
        if (m49605e(this.f60342d).getBoolean("clear_completed_after_disable", false)) {
            m49605e(this.f60342d).edit().putBoolean("clear_completed_after_disable", false).apply();
        }
    }

    /* renamed from: a */
    static void m49600a(Context context, apox apox) {
        acnv.m49554d("Maybe clear SMS Corpus");
        SharedPreferences e = m49605e(context);
        if (e.getBoolean("clear_completed_after_disable", false)) {
            acnv.m49554d("Clear completed before. No need to clear");
            return;
        }
        acom a = acom.m49611a(context, SmsChimeraContentProvider.f79082a);
        SQLiteDatabase f = a.mo32959f();
        if (f != null) {
            f.beginTransaction();
            try {
                f.delete("mmssms", null, null);
                f.delete("mmssms_tag", null, null);
                boolean b = a.mo11319b(a.f17227c.f17229b[0], Long.MAX_VALUE);
                f.setTransactionSuccessful();
                if (b) {
                    aucb b2 = apox.mo47488b(context.getPackageName(), "sms");
                    try {
                        aucu.m76783a(b2, 5000, TimeUnit.MILLISECONDS);
                        CorpusStatus corpusStatus = (CorpusStatus) b2.mo50386d();
                        if (corpusStatus.f9523a && corpusStatus.f9524b != 0) {
                            acnv.m49554d("Clearing SMS Corpus");
                            try {
                                aucu.m76783a(apox.mo47486a(context.getPackageName(), "sms"), 5000, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                                acnv.m49556e("Failed to get SMS Corpus status");
                                return;
                            }
                        }
                        SharedPreferences.Editor edit = e.edit();
                        acnv.m49554d("SMS Corpus is empty now");
                        edit.remove("last_sms_date").remove("last_sms_id").remove("last_mms_date").remove("last_mms_id");
                        edit.putBoolean("clear_completed_after_disable", true).apply();
                        return;
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        acnv.m49556e("Failed to get SMS Corpus status");
                        return;
                    }
                }
            } finally {
                f.endTransaction();
            }
        }
        acnv.m49556e("Failed to clear SMS Corpus database tables");
    }

    /* renamed from: b */
    static boolean m49602b(Context context) {
        PackageManager packageManager;
        if (!acth.m49837a()) {
            return f60339h && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.hardware.telephony");
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        return null;
     */
    /* renamed from: c */
    public static acok m49603c(Context context) {
        synchronized (acok.class) {
            if (m49601a(context)) {
                if (f60340i == null) {
                    acok acok = new acok(context.getApplicationContext());
                    f60340i = acok;
                    synchronized (acok) {
                        if (!acok.f60345g) {
                            acoe.m49588a().mo32944a(acoe.m49589a("SmsCorpusInitRunnable", new acoh(acok)));
                        }
                    }
                    acnv.m49554d("Created SMSCorpus");
                }
                acok acok2 = f60340i;
                return acok2;
            }
            f60340i = null;
            acof.m49591a();
            if (m49602b(context)) {
                acoe.m49588a().mo32944a(acoe.m49589a("SmsCorpusClearRunnable", new acog(context)));
            }
        }
    }

    /* renamed from: d */
    static synchronized boolean m49604d(Context context) {
        boolean z;
        synchronized (acok.class) {
            int i = Build.VERSION.SDK_INT;
            z = true;
            if (!f60341j) {
                if (C1145kt.m18540a(context, "android.permission.READ_SMS") != 0 || C1145kt.m18540a(context, "android.permission.READ_PHONE_STATE") != 0) {
                    z = false;
                }
                f60341j = z;
            }
        }
        return z;
    }

    /* renamed from: e */
    static SharedPreferences m49605e(Context context) {
        return context.getSharedPreferences("proxy-sms-corpus", 0);
    }

    /* renamed from: b */
    public final long mo32953b() {
        return m49605e(this.f60342d).getLong("last_sms_date", -1);
    }

    /* renamed from: c */
    public final long mo32954c() {
        return m49605e(this.f60342d).getLong("last_mms_date", -1);
    }

    /* renamed from: a */
    public static boolean m49601a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (cemq.m137365b()) {
            acnv.m49554d("SMS Corpus is disabled by Gservices flag");
            return false;
        } else if (!spn.m35887f()) {
            acnv.m49554d("SMS Corpus is disabled because it's not in main profile");
            return false;
        } else if (!m49602b(context)) {
            acnv.m49554d("SMS Corpus is disabled because SMS is not supported on the device");
            return false;
        } else if (m49604d(context)) {
            return true;
        } else {
            acnv.m49554d("SMS Corpus is disabled because indexing is not permitted");
            return false;
        }
    }

    /* renamed from: a */
    public final acom mo32950a() {
        return acom.m49611a(this.f60342d, SmsChimeraContentProvider.f79082a);
    }

    /* renamed from: a */
    public final void mo32951a(bpzm bpzm, int i) {
        this.f60343e.mo32446a(bpzm, i, cema.f182934a.mo6606a().mo79315q());
    }

    /* renamed from: a */
    public final void mo32952a(boolean z) {
        acoe.m49588a().mo32944a(acoe.m49589a("SmsCorpusProcessChangeRunnable", new acoj(this, z)));
        acof.m49594b(this.f60342d);
    }
}
