package com.google.android.gms.people.api.operations;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DatabaseUpdateOperation extends IntentOperation {

    /* renamed from: a */
    private final almi f81702a = new almi();

    /* renamed from: b */
    private bmza f81703b;

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amdm.a(long, boolean):java.lang.String
     arg types: [long, int]
     candidates:
      amdm.a(int, boolean):anci
      amdm.a(long, boolean):java.lang.String */
    /* renamed from: a */
    private final void m67793a() {
        bnic bnic;
        almi almi;
        Cursor a;
        int i;
        int i2;
        int i3;
        almi almi2;
        almi almi3;
        almi almi4;
        almi almi5;
        almi almi6;
        String str;
        altq a2 = altq.m61806a(this);
        a2.mo40774g();
        alto c = a2.mo40768c();
        ArrayList a3 = sqc.m35954a();
        amig.m62939a();
        boolean booleanValue = ((Boolean) amhi.f74911a.mo41191a()).booleanValue();
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83327bD()).booleanValue()) {
            bnic = ancx.m64047a(a2.f74246b);
        } else {
            bnic = altq.f74242h.mo41679c(a2.f74246b);
        }
        HashSet<String> hashSet = new HashSet();
        almx a4 = almx.m61368a(a2.f74246b);
        c.mo40746a();
        int i4 = 0;
        String str2 = null;
        try {
            a = c.mo40744a("SELECT _id,account_name,page_gaia_id FROM owners", (String[]) null);
            a.moveToPosition(-1);
            while (true) {
                i = 1;
                if (!a.moveToNext()) {
                    break;
                }
                long j = a.getLong(0);
                String string = a.getString(1);
                if (cfzd.m144000c()) {
                    str = a.getString(2);
                } else {
                    str = "";
                }
                if (!bnic.contains(string)) {
                    a3.add(Long.valueOf(j));
                    hashSet.add(string);
                } else if (cfzd.m144000c() && !TextUtils.isEmpty(str)) {
                    a3.add(Long.valueOf(j));
                    hashSet.add(string);
                }
            }
            a.close();
            if (booleanValue && (almi6 = a2.f74252i) != null) {
                almi6.f73713b = a3.size();
            }
            if (!a3.isEmpty()) {
                for (String str3 : hashSet) {
                    aluj.m61900a(a2.f74246b, "PeopleDatabaseHelper", str3, (String) null, "Account removed");
                    alsj.m61651a(a2.f74246b).mo40704h(str3);
                    a4.mo40598a(str3, null, 1);
                }
                Iterator it = a3.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    try {
                        long longValue = ((Long) it.next()).longValue();
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Removing owner: ");
                        sb.append(longValue);
                        aluj.m61898a(a2.f74246b, "PeopleDatabaseHelper", sb.toString());
                        c.mo40748a("DELETE FROM owners WHERE _id=?", (Object[]) new String[]{Long.toString(longValue)});
                        c.mo40757i();
                        if (booleanValue) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i4 = i2;
                        almi.f73712a = i4;
                        c.mo40753d();
                        throw th;
                    }
                }
                a2.mo40770d("contactsCleanupPending");
            } else {
                i2 = 0;
            }
            try {
                c.mo40750b();
                if (booleanValue && (almi5 = a2.f74252i) != null) {
                    almi5.f73712a = i2;
                }
                c.mo40753d();
                a4.mo40599b();
                boolean z = !a3.isEmpty();
                alto c2 = a2.mo40768c();
                c2.mo40746a();
                try {
                    int a5 = c2.mo40741a("people", "in_circle=0", (String[]) null);
                    c2.mo40750b();
                    if (a5 > 0) {
                        a2.mo40770d("contactsCleanupPending");
                    }
                    amig.m62939a();
                    if (((Boolean) amhj.f74912a.mo41191a()).booleanValue() && (almi4 = a2.f74252i) != null) {
                        almi4.f73715d = a5;
                    }
                    boolean z2 = z | (a5 > 0);
                    alto c3 = a2.mo40768c();
                    ArrayList<String> a6 = sqc.m35954a();
                    Cursor a7 = a2.mo40763b().mo40744a("SELECT DISTINCT account_name FROM owners WHERE page_gaia_id IS NULL", (String[]) null);
                    try {
                        a7.moveToPosition(-1);
                        while (a7.moveToNext()) {
                            String string2 = a7.getString(0);
                            if (!a2.mo40765b(string2)) {
                                str2 = null;
                                i = 1;
                            } else if (!altq.f74241a.mo41688a(a2.f74246b, string2)) {
                                a6.add(string2);
                                str2 = null;
                                i = 1;
                            } else {
                                str2 = null;
                                i = 1;
                            }
                        }
                        a7.close();
                        amig.m62939a();
                        boolean booleanValue2 = ((Boolean) amhj.f74912a.mo41191a()).booleanValue();
                        if (booleanValue2 && (almi3 = a2.f74252i) != null) {
                            almi3.f73716e = a6.size();
                        }
                        c3.mo40746a();
                        try {
                            if (!a6.isEmpty()) {
                                Log.i("PeopleDatabaseHelper", "Detected G+ -> non-G+ owner(s).  Cleanining up...");
                                String[] strArr = new String[i];
                                ContentValues contentValues = new ContentValues();
                                i3 = 0;
                                for (String str4 : a6) {
                                    String valueOf = String.valueOf(str4);
                                    aluj.m61900a(a2.f74246b, "PeopleDatabaseHelper", str4, str2, valueOf.length() == 0 ? new String("Scrubbing account: ") : "Scrubbing account: ".concat(valueOf));
                                    strArr[0] = str4;
                                    c3.mo40757i();
                                    String str5 = altq.f74243j;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 62);
                                    sb2.append("DELETE FROM sync_tokens WHERE owner_id IN");
                                    sb2.append(str5);
                                    sb2.append(" AND ");
                                    sb2.append("name");
                                    sb2.append(" !='");
                                    sb2.append("gaiamap");
                                    sb2.append("'");
                                    c3.mo40748a(sb2.toString(), (Object[]) strArr);
                                    c3.mo40757i();
                                    String valueOf2 = String.valueOf(altq.f74243j);
                                    c3.mo40748a(valueOf2.length() == 0 ? new String("DELETE FROM people WHERE owner_id IN") : "DELETE FROM people WHERE owner_id IN".concat(valueOf2), (Object[]) strArr);
                                    c3.mo40757i();
                                    String valueOf3 = String.valueOf(altq.f74243j);
                                    c3.mo40748a(valueOf3.length() == 0 ? new String("DELETE FROM ac_people WHERE owner_id IN") : "DELETE FROM ac_people WHERE owner_id IN".concat(valueOf3), (Object[]) strArr);
                                    c3.mo40757i();
                                    String valueOf4 = String.valueOf(altq.f74243j);
                                    c3.mo40748a(valueOf4.length() == 0 ? new String("DELETE FROM circles WHERE owner_id IN") : "DELETE FROM circles WHERE owner_id IN".concat(valueOf4), (Object[]) strArr);
                                    c3.mo40757i();
                                    contentValues.clear();
                                    contentValues.putNull("page_gaia_id");
                                    contentValues.put("sync_circles_to_contacts", (Integer) 0);
                                    contentValues.put("sync_evergreen_to_contacts", (Integer) 0);
                                    contentValues.put("sync_me_to_contacts", (Integer) 0);
                                    c3.mo40740a("owners", contentValues, "account_name=? AND page_gaia_id IS NULL", strArr);
                                    amea.m62724a(a2.f74246b).mo41152e(str4, "CleanupNonG+");
                                    c3.mo40757i();
                                    if (booleanValue2) {
                                        i3++;
                                    }
                                    str2 = null;
                                }
                                a2.mo40770d("contactsCleanupPending");
                            } else {
                                i3 = 0;
                            }
                            c3.mo40750b();
                            c3.mo40753d();
                            Log.i("PeopleDatabaseHelper", "cleanUpNonGplusAccounts done.");
                            if (booleanValue2 && (almi2 = a2.f74252i) != null) {
                                almi2.f73717f = i3;
                            }
                            if (z2 || (!a6.isEmpty())) {
                                amdm a8 = amdm.m62661a(this);
                                for (anbs anbs : a8.f74748b.mo41668a()) {
                                    String str6 = anbs.f76592a;
                                    alsj a9 = alsj.m61651a(a8.f74747a);
                                    boolean equals = str6.equals(amdm.m62662a(a9.mo40688b(true), true));
                                    boolean equals2 = str6.equals(amdm.m62662a(a9.mo40688b(false), false));
                                    if (!equals && !equals2 && altn.m61774a(a8.f74747a).mo40738a(anbs.f76592a, anbs.f76593b) == -1) {
                                        a8.f74748b.mo41669a(anbs.f76592a, anbs.f76593b);
                                    }
                                }
                                amdn a10 = amdn.m62665a(this);
                                a10.mo41125a();
                                for (ancj ancj : a10.f74751b.mo41699a()) {
                                    if (altn.m61774a(a10.f74750a).mo40738a(ancj.f76625a, ancj.f76626b) == -1) {
                                        a10.f74751b.mo41701a(ancj.f76625a, ancj.f76626b);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            c3.mo40753d();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        a7.close();
                        throw th3;
                    }
                } finally {
                    c2.mo40753d();
                }
            } catch (Throwable th4) {
                th = th4;
                i4 = i2;
                almi.f73712a = i4;
                c.mo40753d();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            if (booleanValue && (almi = a2.f74252i) != null) {
                almi.f73712a = i4;
            }
            c.mo40753d();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private final void m67794b() {
        altq a = altq.m61806a(this);
        Locale locale = Locale.getDefault();
        String a2 = a.mo40762a("dbLocale", "");
        if (!locale.toString().equals(a2)) {
            String format = String.format(Locale.US, "Updating DB locale: %s -> %s", a2, locale);
            Log.i("PeopleDatabaseHelper", format);
            aluj.m61898a(a.f74246b, "PeopleDatabaseHelper", format);
            a.f74249e.mo40778a(locale);
            alto c = a.mo40768c();
            c.f74232a.mo40733a();
            try {
                c.f74233b.setLocale(locale);
                c.f74232a.mo40734b();
                c.mo40746a();
                try {
                    altv altv = a.f74249e;
                    Log.i("PeopleSearchIndexManage", "Marking for index update.");
                    alto c2 = altv.f74263b.mo40768c();
                    if (c2 != null) {
                        sdo.m34970a(c2.mo40756g());
                        altv.mo40776a(0);
                    }
                    Intent startIntent = IntentOperation.getStartIntent(a.f74246b, DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX");
                    if (startIntent != null) {
                        a.f74246b.startService(startIntent);
                    }
                    altq.m61811a(c.f74233b, locale);
                    c.mo40750b();
                } finally {
                    c.mo40753d();
                }
            } catch (Throwable th) {
                c.f74232a.mo40734b();
                throw th;
            }
        }
    }

    /* renamed from: c */
    private final void m67795c() {
        boolean z;
        altq a = altq.m61806a(this);
        alto c = a.mo40768c();
        if (c != null) {
            c.mo40746a();
            try {
                altv altv = a.f74249e;
                alto c2 = altv.f74263b.mo40768c();
                sdo.m34970a(c2.mo40756g());
                String a2 = altv.f74263b.mo40762a("indexIcuVersion", "unknown");
                String b = ancm.m64011b(System.getProperty("android.icu.library.version"));
                if (!a2.equals(b)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 29 + b.length());
                    sb.append("ICU version changed from ");
                    sb.append(a2);
                    sb.append(" to ");
                    sb.append(b);
                    String sb2 = sb.toString();
                    Log.i("PeopleSearchIndexManage", sb2);
                    aluj.m61898a(altv.f74262a, "PeopleSearchIndexManage", sb2);
                    z = true;
                } else {
                    z = false;
                }
                amig.m62939a();
                int intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83329bF()).intValue();
                if (!z) {
                    int parseInt = Integer.parseInt(altv.f74263b.mo40762a("searchIndexVersion", "0"));
                    if (parseInt != intValue) {
                        StringBuilder sb3 = new StringBuilder(38);
                        sb3.append("Index version changed from ");
                        sb3.append(parseInt);
                        String sb4 = sb3.toString();
                        Log.i("PeopleSearchIndexManage", sb4);
                        aluj.m61898a(altv.f74262a, "PeopleSearchIndexManage", sb4);
                    }
                    c.mo40750b();
                }
                altv.mo40777a(c2);
                altv.mo40776a(intValue);
                altv.f74263b.mo40764b("indexIcuVersion", b);
                c.mo40750b();
            } finally {
                c.mo40753d();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        bmza bmza;
        Intent intent2 = intent;
        amig.m62939a();
        boolean booleanValue = ((Boolean) amgr.f74894a.mo41191a()).booleanValue();
        if (booleanValue) {
            this.f81703b = bmza.m108658b();
        }
        String action = intent.getAction();
        boolean booleanValue2 = ((Boolean) amhi.f74911a.mo41191a()).booleanValue();
        if (booleanValue2) {
            altq.m61806a(this).f74252i = this.f81702a;
        }
        if ("com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS".equals(action) || ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action) && (intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED") || intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")))) {
            m67793a();
        } else if ("com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX".equals(action)) {
            m67795c();
        } else if ("com.google.android.gms.people.api.operations.UPDATE_LOCALE".equals(action) || "android.intent.action.LOCALE_CHANGED".equals(action)) {
            m67794b();
        } else if ("com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC".equals(action)) {
            if (!altq.m61812a()) {
                m67793a();
                m67794b();
                m67795c();
            }
            altq a = altq.m61806a(this);
            CountDownLatch countDownLatch = a.f74251g;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            a.f74251g = null;
        } else {
            amdk.m62658a("DatabaseUpdateOperation", "Unknown action: %s!", intent.getAction());
        }
        if (booleanValue2) {
            if (booleanValue && (bmza = this.f81703b) != null) {
                this.f81702a.f73719h = bmza.mo66928a(TimeUnit.MICROSECONDS);
                this.f81703b.mo66931e();
            }
            almi almi = this.f81702a;
            String stringExtra = intent2.getStringExtra("account_name");
            int i = almi.f73712a;
            int i2 = almi.f73713b;
            int i3 = almi.f73714c;
            int i4 = almi.f73715d;
            int i5 = almi.f73716e;
            int i6 = almi.f73717f;
            ammj ammj = almi.f73718g;
            if (ammj == null) {
                ammj = ammj.f75289f;
            }
            ammj ammj2 = ammj;
            String str = stringExtra;
            long j = almi.f73719h;
            long j2 = almi.f73720i;
            amig.m62939a();
            if (almk.f73722a.nextDouble() < Double.valueOf(cgbe.f186279a.mo6606a().mo83280aJ()).doubleValue()) {
                bxvd da = ammd.f75264l.mo74144da();
                amig.m62939a();
                long j3 = j2;
                int i7 = 3;
                if (((Boolean) amhi.f74911a.mo41191a()).booleanValue()) {
                    switch (action.hashCode()) {
                        case -1855651815:
                            if (action.equals("com.google.android.gms.people.api.operations.UPDATE_LOCALE")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -612944411:
                            if (action.equals("com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -177095062:
                            if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -19011148:
                            if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 15834784:
                            if (action.equals("com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1326678490:
                            if (action.equals("com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            i7 = 4;
                        } else if (c == 2) {
                            i7 = 5;
                        } else if (c != 3) {
                            if (c == 4) {
                                amig.m62939a();
                                if (((Boolean) amgw.f74899a.mo41191a()).booleanValue()) {
                                    i7 = 7;
                                }
                            } else if (c != 5) {
                                i7 = 1;
                            }
                            amig.m62939a();
                            i7 = !((Boolean) amgw.f74899a.mo41191a()).booleanValue() ? 1 : 8;
                        } else {
                            i7 = 6;
                        }
                    }
                } else {
                    i7 = 2;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ammd ammd = (ammd) da.f164949b;
                ammd.f75267b = i7 - 1;
                int i8 = ammd.f75266a | 1;
                ammd.f75266a = i8;
                int i9 = 2 | i8;
                ammd.f75266a = i9;
                ammd.f75268c = i;
                ammd.f75266a = i9 | 4;
                ammd.f75269d = i2;
                amig.m62939a();
                if (((Boolean) amhj.f74912a.mo41191a()).booleanValue()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammd ammd2 = (ammd) da.f164949b;
                    int i10 = ammd2.f75266a | 16;
                    ammd2.f75266a = i10;
                    ammd2.f75271f = i4;
                    int i11 = i10 | 8;
                    ammd2.f75266a = i11;
                    ammd2.f75270e = i3;
                    int i12 = i11 | 32;
                    ammd2.f75266a = i12;
                    ammd2.f75272g = i5;
                    ammd2.f75266a = i12 | 64;
                    ammd2.f75273h = i6;
                }
                if (((Boolean) amhk.f74913a.mo41191a()).booleanValue()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammd ammd3 = (ammd) da.f164949b;
                    ammj2.getClass();
                    ammd3.f75274i = ammj2;
                    ammd3.f75266a |= 128;
                }
                if (((Boolean) amgr.f74894a.mo41191a()).booleanValue()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammd ammd4 = (ammd) da.f164949b;
                    ammd4.f75266a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    ammd4.f75275j = j;
                }
                if (((Boolean) amgt.f74896a.mo41191a()).booleanValue()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammd ammd5 = (ammd) da.f164949b;
                    ammd5.f75266a |= 512;
                    ammd5.f75276k = j3;
                }
                bxvd da2 = amoh.f75593x.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                amoh amoh = (amoh) da2.f164949b;
                ammd ammd6 = (ammd) da.mo74062i();
                ammd6.getClass();
                amoh.f75608n = ammd6;
                amoh.f75595a |= 2048;
                alml.m61288a(str, da2);
            }
        }
    }
}
