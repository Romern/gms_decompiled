package com.google.android.gms.netrec.module;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetRecChimeraGcmTaskService extends aeah {
    /* renamed from: a */
    public static aebi m67641a(String str, Bundle bundle) {
        m67643b(str, bundle);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.netrec.module.NetRecGcmTaskService";
        aebi.f63107s = bundle;
        return aebi;
    }

    /* renamed from: b */
    public static void m67643b(String str, Bundle bundle) {
        sdo.m34977c(str);
        bundle.putString("taskName", str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static void m67642a(aeat aeat, aeca aeca) {
        sdo.checkIfNull((Object) "Task must be created with getPeriodicTaskBuilder or getOneOffTaskBuilder", (Object) aeca.f63120m.getString("taskName"));
        aeat.mo33984a(aeca);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        boolean z;
        new Object[1][0] = aecc.f63128a;
        int i = eoa.f15378a;
        int i2 = spn.f44932a;
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            eoa.m10824a("NetRec", "Received task with no extras", new Object[0]);
            return 2;
        }
        String string = bundle.getString("taskName");
        if (TextUtils.isEmpty(string)) {
            eoa.m10824a("NetRec", "Received task with no destination extra", new Object[0]);
            return 2;
        }
        int hashCode = string.hashCode();
        if (hashCode != 561485102) {
            if (hashCode != 718611012) {
                if (hashCode == 1276226106 && string.equals("ReinstateNetworkTask")) {
                    c = 1;
                    if (c != 0) {
                        akmf akmf = new akmf(this, akmy.m60045a(this), new akjy(this), new akmg(this), RequestFuture.newFuture(), rpr.m34216b().getRequestQueue());
                        bmza b = bmza.m108659b(bmvy.f131119a);
                        String str = aecc.f63128a;
                        if (!cfpd.m142364d()) {
                            eoa.m10828c("NetRec", "Unable to run %s score refresh task (scoring disabled).", str);
                            return 2;
                        }
                        new Object[1][0] = str;
                        try {
                            int a = akmf.mo39556a(str);
                            Cursor rawQuery = akmf.f72248b.mo39578b().rawQuery(String.format("SELECT EXISTS(SELECT 1 FROM %s WHERE %s=? LIMIT 1)", "network", "waiting_for_update"), new String[]{"1"});
                            if (!rawQuery.moveToNext() || rawQuery.getInt(0) != 1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            rawQuery.close();
                            if (z) {
                                eoa.m10826b("NetRec", "Still entries pending update, scheduling new %s refresh.", str);
                                akme akme = new akme(akmf.f72247a);
                                if (!"rapid_refresh_scores_task".equals(str)) {
                                    if (!"refresh_scores_task".equals(str)) {
                                        eoa.m10824a("NetRec", "Unsupported tag %s, using standard task", str);
                                    }
                                    akme.mo39555b();
                                } else {
                                    akme.mo39553a();
                                }
                            }
                            b.mo66931e();
                            eoa.m10826b("NetRec", "Completed %s score refresh task in %d ms, returning %d", str, Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS)), Integer.valueOf(a));
                            return a;
                        } catch (RuntimeException e) {
                            eoa.m10825a("NetRec", e, "Unexpected exception when handling score refresh", new Object[0]);
                            aknj.m60083a(akmf.f72247a).mo39586a(e);
                            aknf.m60075a("GcmTaskError");
                            return 2;
                        }
                    } else if (c == 1) {
                        akmd a2 = akmd.m59995a(this);
                        new Object[1][0] = aecc.f63128a;
                        try {
                            return !a2.mo39552a(aecc.f63129b.getString("ssid"), null, true) ? 1 : 0;
                        } catch (RuntimeException e2) {
                            eoa.m10825a("NetRec", e2, "Unexpected exception when handling score updates in reinstate task.", new Object[0]);
                            aknj.m60083a(a2.f72244b).mo39586a(e2);
                            aknf.m60075a("GcmTaskError");
                            return 2;
                        }
                    } else if (c != 2) {
                        eoa.m10824a("NetRec", "Received task with unhandled destination: '%s'", string);
                        return 2;
                    } else {
                        akly akly = new akly(this, akmy.m60045a(this));
                        eoa.m10826b("NetRec", "Running CleanupDatabaseTask GCM task", new Object[0]);
                        try {
                            SQLiteDatabase a3 = akly.f72228a.mo39569a();
                            if (a3 == null) {
                                eoa.m10824a("NetRec", "Couldn't open database", new Object[0]);
                            }
                            eoa.m10826b("NetRec", "Removed %d records from the database", Integer.valueOf(akmy.m60049c(a3)));
                            return 0;
                        } catch (RuntimeException e3) {
                            eoa.m10825a("NetRec", e3, "Unexpected exception when handling cache expiration.", new Object[0]);
                            aknj.m60083a(akly.f72229b).mo39586a(e3);
                            aknf.m60075a("GcmTaskError");
                            return 2;
                        }
                    }
                }
            } else if (string.equals("CleanupDatabaseTask")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (string.equals("ScoreRefreshTask")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
