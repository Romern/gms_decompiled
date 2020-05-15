package com.google.android.gms.fitness.service.maintenance;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StoreMaintenanceIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final Set f32394a = new HashSet();

    /* renamed from: b */
    private static final srn f32395b = zvt.m46581a();

    /* renamed from: c */
    private yzs f32396c;

    /* renamed from: d */
    private sqv f32397d;

    /* renamed from: a */
    public static PendingIntent m23774a(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.trim");
        bmxy.m108581a(startIntent);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
        bmxy.m108581a(pendingIntent);
        return pendingIntent;
    }

    /* renamed from: b */
    private static synchronized void m23776b(Context context) {
        synchronized (StoreMaintenanceIntentOperation.class) {
            Intent startIntent = IntentOperation.getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.aggregate");
            bmxy.m108581a(startIntent);
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
            bmxy.m108581a(pendingIntent);
            new skc(context).mo25668a(pendingIntent);
        }
    }

    public final void onCreate() {
        yzs a = yzq.m45107a(this);
        this.f32396c = a;
        this.f32397d = a.mo30869a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -2057545999) {
            if (hashCode == 2107679664 && action.equals("com.google.android.gms.fitness.trim")) {
                c = 0;
                if (c == 0) {
                    m23775a();
                    return;
                } else if (c != 1) {
                    ((bnsl) f32395b.mo68387b()).mo68420a("Unexpected intent: %s", intent);
                    return;
                } else {
                    m23776b(this);
                    return;
                }
            }
        } else if (action.equals("com.google.android.gms.fitness.aggregate")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x021d A[Catch:{ IOException -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0226  */
    /* renamed from: a */
    private final synchronized void m23775a() {
        zrk zrk;
        String str;
        Iterator it;
        zrk zrk2;
        long j;
        long j2;
        int i;
        synchronized (this) {
            Iterator it2 = this.f32396c.mo30874b().mo30715b().iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (f32394a.contains(str2)) {
                    zre c = this.f32396c.mo30877c(str2);
                    zrk e = this.f32396c.mo30880e(str2);
                    long a = this.f32396c.mo30869a().mo20505a();
                    zns znt = cdzy.f182121a.mo78644b().mo78645a() ? new znt(this, this.f32396c.mo30887i()) : zns.f55569a;
                    sqv sqv = this.f32397d;
                    try {
                        long b = sqv.mo20506b();
                        Set h = c.mo31388h();
                        znt.mo31284d(h.size());
                        znt.mo31282b(str2.equals("none"));
                        Iterator it3 = h.iterator();
                        while (it3.hasNext()) {
                            caae caae = (caae) it3.next();
                            int a2 = c.mo31358a(caae);
                            int Q = (int) cdzd.f182003a.mo6606a().mo78550Q();
                            caah caah = bzzn.f172096ai;
                            it = it2;
                            try {
                                caah caah2 = caae.f172330f;
                                if (caah2 == null) {
                                    caah2 = caah.f172333d;
                                }
                                if (bzzn.m126363a(caah, caah2)) {
                                    Q = Math.min((int) cdzd.f182003a.mo6606a().mo78554U(), Q);
                                }
                                if (a2 > Q) {
                                    j = c.mo31360a(caae, Q);
                                } else {
                                    j = -1;
                                }
                                caah caah3 = bzzn.f172096ai;
                                Iterator it4 = it3;
                                caah caah4 = caae.f172330f;
                                if (caah4 == null) {
                                    caah4 = caah.f172333d;
                                }
                                if (bzzn.m126363a(caah3, caah4)) {
                                    j2 = b;
                                    j = Math.max(j, TimeUnit.MILLISECONDS.toNanos(a) - TimeUnit.HOURS.toNanos(cdzd.f182003a.mo6606a().mo78555V()));
                                } else {
                                    j2 = b;
                                }
                                if (str2.equals("none")) {
                                    str = str2;
                                    zrk = e;
                                    try {
                                        j = Math.max(j, TimeUnit.MILLISECONDS.toNanos(a) - TimeUnit.DAYS.toNanos(cdzd.f182003a.mo6606a().mo78552S()));
                                    } catch (IOException e2) {
                                        e = e2;
                                        str2 = str;
                                        zrk2 = zrk;
                                        bnsl bnsl = (bnsl) f32395b.mo68388c();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68405a("Transient error while trimming data store");
                                        if (zrk2.mo31396a().isEmpty()) {
                                        }
                                    }
                                } else {
                                    str = str2;
                                    zrk = e;
                                }
                                int P = (int) cdzd.f182003a.mo6606a().mo78549P();
                                if (P > 0) {
                                    j = Math.max(j, TimeUnit.MILLISECONDS.toNanos(a) - TimeUnit.HOURS.toNanos((long) P));
                                }
                                if (j > 0) {
                                    i = c.mo31359a(caae, j);
                                } else {
                                    i = 0;
                                }
                                caah caah5 = caae.f172330f;
                                if (caah5 == null) {
                                    caah5 = caah.f172333d;
                                }
                                znt.mo31277a(caah5, a2, i);
                                it2 = it;
                                it3 = it4;
                                str2 = str;
                                e = zrk;
                                b = j2;
                            } catch (IOException e3) {
                                e = e3;
                                zrk2 = e;
                                bnsl bnsl2 = (bnsl) f32395b.mo68388c();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68405a("Transient error while trimming data store");
                                if (zrk2.mo31396a().isEmpty()) {
                                }
                            }
                        }
                        it = it2;
                        str = str2;
                        zrk = e;
                        long j3 = b;
                        if (znt.mo31280a()) {
                            znt.mo31281b(c.mo31352c());
                            znt.mo31283c(c.mo31355d());
                        }
                        c.mo31353c(a - TimeUnit.DAYS.toMillis(cdzd.f182003a.mo6606a().mo78548O()));
                        c.mo31356d(a - TimeUnit.HOURS.toMillis(cdzv.m135697e()));
                        zrk2 = zrk;
                        try {
                            bnic b2 = zrk2.mo31399b("com.google.android.gms.paired");
                            znt.mo31279a(!b2.isEmpty());
                            if (znt.mo31280a()) {
                                znt.mo31276a(zrk2.mo31396a().size());
                            }
                            bnrd a3 = b2.iterator();
                            while (a3.hasNext()) {
                                yqe yqe = (yqe) a3.next();
                                if (a - yqe.f54382c >= cdzd.f182003a.mo6606a().mo78576ap()) {
                                    zrk2.mo31401b(yqe);
                                }
                            }
                            str2 = str;
                            try {
                                znt.mo31278a(str2, sqv.mo20506b() - j3);
                            } catch (IOException e4) {
                                e = e4;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            str2 = str;
                            bnsl bnsl22 = (bnsl) f32395b.mo68388c();
                            bnsl22.mo68437a(e);
                            bnsl22.mo68405a("Transient error while trimming data store");
                            if (zrk2.mo31396a().isEmpty()) {
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        it = it2;
                        zrk2 = e;
                        bnsl bnsl222 = (bnsl) f32395b.mo68388c();
                        bnsl222.mo68437a(e);
                        bnsl222.mo68405a("Transient error while trimming data store");
                        if (zrk2.mo31396a().isEmpty()) {
                        }
                    }
                    try {
                        if (zrk2.mo31396a().isEmpty()) {
                            f32394a.remove(str2);
                            it2 = it;
                        } else {
                            it2 = it;
                        }
                    } catch (IOException e7) {
                        bnsl bnsl3 = (bnsl) f32395b.mo68388c();
                        bnsl3.mo68437a(e7);
                        bnsl3.mo68405a("Transient error validating account subscription");
                        it2 = it;
                    }
                }
            }
            ytl ytl = ytl.INSTANCE;
            long a4 = this.f32397d.mo20505a();
            if (cdza.m135454b()) {
                SharedPreferences a5 = ytl.m44779a(this);
                SharedPreferences.Editor edit = a5.edit();
                bnrd a6 = bnic.m109495a((Collection) a5.getAll().keySet()).iterator();
                while (a6.hasNext()) {
                    String str3 = (String) a6.next();
                    if (str3.startsWith("earliest-")) {
                        if (a4 - a5.getLong(str3, 0) > TimeUnit.DAYS.toMillis(1)) {
                            String substring = str3.substring(9);
                            String valueOf = String.valueOf(substring);
                            SharedPreferences.Editor remove = edit.remove(valueOf.length() == 0 ? new String("earliest-") : "earliest-".concat(valueOf));
                            String valueOf2 = String.valueOf(substring);
                            SharedPreferences.Editor remove2 = remove.remove(valueOf2.length() == 0 ? new String("events-") : "events-".concat(valueOf2));
                            String valueOf3 = String.valueOf(substring);
                            remove2.remove(valueOf3.length() == 0 ? new String("count-") : "count-".concat(valueOf3));
                        }
                    }
                }
                edit.apply();
            }
            synchronized (f32394a) {
                if (f32394a.isEmpty()) {
                    new skc(this).mo25668a(m23774a(this));
                }
            }
        }
    }
}
