package com.google.android.gms.platformconfigurator;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeConfigurationUpdateListener extends IntentOperation {

    /* renamed from: a */
    static long f82206a = 0;

    /* renamed from: b */
    static long f82207b = 0;

    /* renamed from: c */
    static boolean f82208c = false;

    /* renamed from: d */
    private static final srn f82209d = srn.m36127a(sgj.PLATFORM_CONFIGURATOR);

    /* renamed from: e */
    private static final long f82210e = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: f */
    private static int f82211f = 0;

    /* renamed from: g */
    private static Set f82212g;

    /* renamed from: h */
    private static Set f82213h;

    /* renamed from: a */
    private final void m68275a() {
        m68277b();
        ankl b = ankh.m64642b(this);
        synchronized (ankl.f77015a) {
            if (ankj.m64648a()) {
                boolean z = true;
                for (String str : cghk.m145455g().f165797a) {
                    z = b.mo41910d(str) && z;
                }
            }
            b.mo41910d(null);
        }
        if (cghk.m145452d()) {
            ankl b2 = ankh.m64642b(this);
            synchronized (ankl.f77015a) {
                b2.mo41905a();
                if (ankj.m64648a()) {
                    boolean z2 = true;
                    for (String str2 : cghk.m145450b().f165797a) {
                        z2 = b2.mo41908b(str2) && z2;
                    }
                }
                b2.mo41908b(null);
            }
        }
        f82208c = true;
    }

    /* renamed from: b */
    private final void m68277b() {
        Intent className = new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver");
        aucb n = ankh.m64637a(this).mo25239n("TRON");
        try {
            aucu.m76783a(n, 2000, TimeUnit.MILLISECONDS);
            className.putExtra("com.google.android.gms.tron.extra.serializedExpTokens", sef.m35074a((ExperimentTokens) n.mo50386d()));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
        }
        sendBroadcast(className);
    }

    /* renamed from: c */
    private final void m68279c() {
        if (f82207b < SystemClock.elapsedRealtime()) {
            m68281d();
        }
    }

    /* renamed from: d */
    private final void m68281d() {
        boolean z;
        boolean z2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean a = ankh.m64639a("com.google.android.gms.settings.platform", this);
        hashSet2.add("com.google.android.gms.settings.platform");
        if (cghk.m145452d()) {
            a = !ankh.m64639a("com.google.android.gms.settings.platform.boot", this) ? false : a;
            hashSet.add("com.google.android.gms.settings.platform.boot");
        }
        if (ankj.m64648a()) {
            if (ankj.m64650b()) {
                synchronized (ankn.f77022a) {
                    if (ankn.f77023b == null) {
                        ankn.f77023b = new ankn(snp.m35702a(10), new anko(getApplicationContext()));
                    }
                }
            }
            bxwc bxwc = (cghk.m145453e() ? cghk.m145458j() : cghk.m145455g()).f165797a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                String str = (String) bxwc.get(i);
                String a2 = ankh.m64638a(str);
                if (!ankh.m64640a(a2, ankh.m64643b(str), this)) {
                    z2 = false;
                } else {
                    z2 = a;
                }
                hashSet2.add(a2);
            }
            if (cghk.m145452d()) {
                bxwc bxwc2 = (cghk.m145453e() ? cghk.m145457i() : cghk.m145450b()).f165797a;
                int size2 = bxwc2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) bxwc2.get(i2);
                    String a3 = ankh.m64638a(str2);
                    if (!ankh.m64640a(a3, ankh.m64643b(str2), this)) {
                        z = false;
                    } else {
                        z = a;
                    }
                    hashSet.add(a3);
                }
            }
        }
        if (a) {
            f82207b = SystemClock.elapsedRealtime() + 3600000;
        }
        if (cghk.m145456h()) {
            f82213h = Collections.unmodifiableSet(hashSet);
            f82212g = Collections.unmodifiableSet(hashSet2);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        if (ankk.m64653a()) {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -544318258:
                    if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 438946629:
                    if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 798292259:
                    if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 832939294:
                    if (action.equals("com.google.android.gms.platformconfigurator.RETRY_UPDATE")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2019499159:
                    if (action.equals("com.google.android.gms.phenotype.UPDATE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2069809336:
                    if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                m68279c();
                m68275a();
            } else if (c == 1 || c == 2) {
                m68279c();
            } else if (c == 3) {
                m68279c();
                if (!cghk.m145456h()) {
                    if (intent.hasExtra("com.google.android.gms.phenotype.URGENT") || f82206a <= SystemClock.elapsedRealtime()) {
                        m68275a();
                        f82206a = SystemClock.elapsedRealtime() + 60000;
                    }
                } else if (f82208c) {
                    m68276a(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), 0);
                } else {
                    m68275a();
                }
            } else if (c != 4) {
                if (c != 5) {
                    intent.getAction();
                } else if (cghk.m145456h()) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                    int intExtra = intent.getIntExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", -1);
                    if (intExtra != -1) {
                        m68276a(stringExtra, intExtra);
                    }
                }
            } else if ("com.google.android.gms.platformconfigurator".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                m68281d();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: c */
    private final void m68280c(String str, int i) {
        if (i < 5) {
            Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i);
            int i2 = f82211f;
            f82211f = i2 + 1;
            new skc(this).mo25675a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, f82210e, PendingIntent.getService(this, i2, startIntent, 134217728), (String) null);
            return;
        }
        bnsl bnsl = (bnsl) f82209d.mo68388c();
        bnsl.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68422a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: b */
    private final void m68278b(String str, int i) {
        boolean z;
        Set set;
        if ("com.google.android.gms.settings.platform".equals(str)) {
            z = ankh.m64642b(this).mo41909c(null);
        } else if ("com.google.android.gms.settings.platform.boot".equals(str)) {
            z = ankh.m64642b(this).mo41907a((String) null);
        } else if (str != null && str.startsWith("com.google.android.platform")) {
            String replace = str.replace("com.google.android.platform.", "");
            Set set2 = f82212g;
            if (set2 != null && set2.contains(str)) {
                z = ankh.m64642b(this).mo41909c(replace);
            } else if (cghk.m145452d() && (set = f82213h) != null && set.contains(str)) {
                z = ankh.m64642b(this).mo41907a(replace);
            } else {
                bnsl bnsl = (bnsl) f82209d.mo68388c();
                bnsl.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Update for unknown DeviceConfig package %s", str);
                return;
            }
        } else {
            return;
        }
        if (!z) {
            bnsl bnsl2 = (bnsl) f82209d.mo68390d();
            bnsl2.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68422a("Failed to propagate package %s, retryCount %d", (Object) str, i);
            int i2 = i + 1;
            if (i2 >= 5) {
                bnsl bnsl3 = (bnsl) f82209d.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68422a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i2);
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
            int i3 = f82211f;
            f82211f = i3 + 1;
            new skc(this).mo25675a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, f82210e, PendingIntent.getService(this, i3, startIntent, 134217728), (String) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    private final void m68276a(String str, int i) {
        boolean z;
        try {
            if ("com.google.android.gms.settings.platform".equals(str)) {
                z = ankh.m64642b(this).mo41909c(null);
            } else if ("com.google.android.gms.settings.platform.boot".equals(str)) {
                z = ankh.m64642b(this).mo41907a((String) null);
            } else if (str != null && str.startsWith("com.google.android.platform")) {
                String replace = str.replace("com.google.android.platform.", "");
                if (f82212g == null || !f82212g.contains(str)) {
                    if (cghk.m145452d()) {
                        if (f82213h != null && f82213h.contains(str)) {
                            z = ankh.m64642b(this).mo41907a(replace);
                        }
                    }
                    bnsl bnsl = (bnsl) f82209d.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Update for unknown DeviceConfig package %s", str);
                    return;
                }
                z = ankh.m64642b(this).mo41909c(replace);
            } else {
                return;
            }
            if (!z) {
                bnsl bnsl2 = (bnsl) f82209d.mo68390d();
                bnsl2.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68422a("Failed to propagate package %s, retryCount %d", (Object) str, i);
                int i2 = i + 1;
                if (i2 < 5) {
                    Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
                    startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
                    startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
                    int i3 = f82211f;
                    f82211f = i3 + 1;
                    new skc(this).mo25675a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, f82210e, PendingIntent.getService(this, i3, startIntent, 134217728), (String) null);
                    return;
                }
                bnsl bnsl3 = (bnsl) f82209d.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68422a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i2);
            }
        } catch (anki e) {
            bnsl bnsl4 = (bnsl) f82209d.mo68388c();
            bnsl4.mo68437a(e);
            bnsl4.mo68432a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Failed to write config for %s. It is banned, not retrying.", str);
        }
    }
}
