package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: acni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acni {

    /* renamed from: a */
    private static boolean f60234a;

    /* renamed from: a */
    public static synchronized void m49501a(Context context) {
        Intent a;
        synchronized (acni.class) {
            if (m49502a() && (a = UpdateIcingCorporaIntentOperation.m66724a(context, "FORCE_ALL")) != null) {
                context.startService(a);
            }
            if (acok.m49601a(context)) {
                SharedPreferences e = acok.m49605e(context);
                if (!e.getBoolean("enable_sms_corpus_with_appdatasearchhelper", false)) {
                    acnv.m49554d("Clearing legacy SMS Corpus");
                    e.edit().clear().apply();
                    context.deleteFile("icing_sms_corpus.bin");
                    context.deleteFile("icing_sms_corpus.docs");
                    context.deleteFile("icing_sms_corpus.bin");
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m49503b(Context context) {
        Intent c;
        synchronized (acni.class) {
            acnv.m49554d("Calling IcingInternalCorpora.initializeUponIndexServiceRestart");
            acok.m49603c(context);
            if (aclx.m49425a(context) && (c = UpdateIcingCorporaIntentOperation.m66731c(context)) != null) {
                context.startService(c);
            }
        }
    }

    /* renamed from: c */
    public static void m49505c(Context context) {
        abym abym = new abym(context);
        acnv.m49541a("IcingInternalCorpora.onMaintenance");
        acoe.m49588a().mo32944a(acoe.m49589a("IcingInternalCorpusMaintenanceRunnable", new acnh(context, abym)));
    }

    /* renamed from: b */
    static synchronized boolean m49504b() {
        boolean z;
        synchronized (acni.class) {
            if (!f60234a) {
                int i = Build.VERSION.SDK_INT;
                f60234a = C1145kt.m18540a(rpr.m34216b(), "android.permission.READ_CONTACTS") == 0;
            }
            z = f60234a;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m49502a() {
        if (((Boolean) abzt.f58890ae.mo58455c()).booleanValue()) {
            acnv.m49554d("Contacts corpus is disabled by Gservices flag");
            return false;
        } else if (m49504b()) {
            return true;
        } else {
            acnv.m49554d("Contacts corpus is disabled because indexing is not permitted");
            return false;
        }
    }
}
