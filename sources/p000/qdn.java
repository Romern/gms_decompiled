package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* renamed from: qdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdn {

    /* renamed from: a */
    private static final SecureRandom f40991a = new SecureRandom();

    /* renamed from: d */
    static long m31952d(Context context) {
        String a = qdg.m31916a(context);
        if (a == null || !qdg.m31919a(a)) {
            return 0;
        }
        try {
            return Long.parseLong((String) bmyx.m108640a(':').mo66925c((CharSequence) a).get(0));
        } catch (Exception e) {
            Log.w("GoogleSettingsUtils", "Exception while parsing Android ID", e);
            return 0;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* renamed from: e */
    static void m31953e(Context context) {
        long j = 0;
        long a = aymn.m84261a(context.getContentResolver(), "android_id", 0L);
        if (a == 0) {
            if (cdci.m132542h()) {
                j = m31952d(context);
            }
            m31949b(context, j, a);
        }
    }

    /* renamed from: f */
    static void m31954f(Context context) {
        long j;
        try {
            j = m31961m(context).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot find CheckinChimeraService.xml shared prefs");
            j = 0;
        }
        try {
            if (cdci.f180455a.mo6606a().mo77251n()) {
                long b = qdg.m31920b(context);
                long d = qdg.m31923d(context);
                if (d != 0) {
                    if (d != b) {
                        Log.i("GoogleSettingsUtils", "Resetting security token from Checkin Prefs");
                        qdg.m31921b("Resetting security token from Checkin Prefs");
                        m31948b(context, d);
                        return;
                    }
                }
                long e2 = qdg.m31924e(context);
                if (e2 != 0) {
                    if (e2 != b) {
                        Log.i("GoogleSettingsUtils", "Resetting security token from Backup File");
                        qdg.m31921b("Resetting security token from Backup File");
                        m31950c(context, e2);
                        m31948b(context, e2);
                        return;
                    }
                }
                if (j != 0 && j != b) {
                    Log.i("GoogleSettingsUtils", "Resetting security token from Chimera Prefs");
                    qdg.m31921b("Resetting security token from Chimera Prefs");
                    m31944a(context, j);
                    m31948b(context, j);
                }
            } else if (j != 0) {
                long e3 = qdg.m31924e(context);
                if (e3 == 0) {
                    Log.w("GoogleSettingsUtils", "Backup security token is 0");
                } else {
                    j = e3;
                }
                Log.i("GoogleSettingsUtils", "Resetting security token");
                StringBuilder sb = new StringBuilder(48);
                sb.append("Resetting security token to ");
                sb.append(j);
                qdg.m31921b(sb.toString());
                m31944a(context, j);
                m31948b(context, j);
                m31955g(context);
            }
        } catch (IOException e4) {
            Log.e("GoogleSettingsUtils", "Exception while trying to reset security token", e4);
        }
    }

    /* renamed from: g */
    static void m31955g(Context context) {
        try {
            SharedPreferences m = m31961m(context);
            if (m.getLong("CheckinTask_securityToken", 0) == 0) {
                if (m.getLong("OperationScheduler_lastSuccessTimeMillis", 0) == 0) {
                    return;
                }
            }
            SharedPreferences.Editor edit = m.edit();
            edit.remove("CheckinTask_securityToken");
            edit.remove("OperationScheduler_lastSuccessTimeMillis");
            edit.apply();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot clear Chimera Service Shared prefs, failed to find GoogleServicesFramework package");
        }
    }

    /* renamed from: h */
    public static long m31956h(Context context) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("CheckinLogging", 0);
        try {
            j = sharedPreferences.getLong("logging_id", 0);
        } catch (ClassCastException e) {
            Log.e("GoogleSettingsUtils", "Can't parse Logging ID", e);
            j = 0;
        }
        if (j != 0) {
            return j;
        }
        long nextLong = f40991a.nextLong();
        sharedPreferences.edit().putLong("logging_id", nextLong).commit();
        return nextLong;
    }

    /* renamed from: i */
    public static qgo m31957i(Context context) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        try {
            j = m31961m(context).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            j = 0;
        }
        bxvd da = qgo.f41191f.mo74144da();
        boolean z4 = true;
        if (qdg.m31922c(context) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgo qgo = (qgo) da.f164949b;
        qgo.f41193a |= 1;
        qgo.f41194b = z;
        if (qdg.m31924e(context) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgo qgo2 = (qgo) da.f164949b;
        qgo2.f41193a |= 2;
        qgo2.f41195c = z2;
        if (qdg.m31923d(context) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgo qgo3 = (qgo) da.f164949b;
        int i = qgo3.f41193a | 4;
        qgo3.f41193a = i;
        qgo3.f41196d = z3;
        if (j == 0) {
            z4 = false;
        }
        qgo3.f41193a = i | 8;
        qgo3.f41197e = z4;
        return (qgo) da.mo74062i();
    }

    /* renamed from: j */
    public static String m31958j(Context context) {
        return context.getSharedPreferences("wearable", svu.m36486a().mo26193e()).getString("network_id", null);
    }

    /* renamed from: k */
    public static String m31959k(Context context) {
        return context.getSharedPreferences("wearable", svu.m36486a().mo26193e()).getString("network_secret", null);
    }

    /* renamed from: l */
    public static SharedPreferences m31960l(Context context) {
        return context.getSharedPreferences("Checkin", 0);
    }

    /* renamed from: m */
    private static SharedPreferences m31961m(Context context) {
        return qdh.m31930a(context).getSharedPreferences("CheckinChimeraService", 0);
    }

    /* renamed from: a */
    static void m31943a(Context context) {
        if (new File(context.getFilesDir(), "checkin_id_token").exists() && !context.deleteFile("checkin_id_token")) {
            Log.w("GoogleSettingsUtils", "Unable to clear checkin_id_token file");
            qdg.m31921b("Unable to clear checkin_id_token file");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* renamed from: b */
    public static long m31947b(Context context) {
        long a = aymn.m84261a(context.getContentResolver(), "android_id", 0L);
        if (cdci.m132542h()) {
            long d = m31952d(context);
            if (d != 0) {
                if (d != a) {
                    String l = Long.toString(d);
                    m31949b(context, d, a);
                    String valueOf = String.valueOf(l);
                    qdg.m31921b(valueOf.length() == 0 ? new String("setAndroidIdGservices, New Aid:") : "setAndroidIdGservices, New Aid:".concat(valueOf));
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver == null) {
                        Log.w("GoogleSettingsUtils", "Content Resolver is null, not updating gservices");
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("android_id", l);
                        Log.i("GoogleSettingsUtils", "Updating Android ID in Gservices");
                        try {
                            contentResolver.update(svu.f45250b, contentValues, null, null);
                        } catch (RuntimeException e) {
                            String message = e.getMessage();
                            String packageName = context.getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 65 + String.valueOf(packageName).length());
                            sb.append("Caught exception updating gservices MAIN DIFF: ");
                            sb.append(message);
                            sb.append(" Context package: ");
                            sb.append(packageName);
                            Log.w("GoogleSettingsUtils", sb.toString());
                        }
                    }
                    m31946a(context, l);
                }
                return d;
            } else if (a != 0) {
                m31945a(context, a, qdg.m31920b(context));
            }
        } else {
            m31943a(context);
        }
        if (a == 0) {
            m31949b(context, 0, a);
        }
        return a;
    }

    /* renamed from: c */
    static void m31950c(Context context, long j) {
        try {
            SharedPreferences sharedPreferences = qdh.m31930a(context).getSharedPreferences("CheckinService", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (j != sharedPreferences.getLong("CheckinTask_securityToken", 0)) {
                edit.putLong("CheckinTask_securityToken", j);
                edit.apply();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot write token, failed to find GoogleServicesFramework package");
        }
    }

    /* renamed from: a */
    static void m31944a(Context context, long j) {
        m31950c(context, j);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(qdh.m31930a(context).openFileOutput("security_token", 0));
            dataOutputStream.writeLong(j);
            dataOutputStream.close();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot write token, failed to find GoogleServicesFramework package");
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("GoogleSettingsUtils", valueOf.length() == 0 ? new String("Cannot write token, exception in Context lookup ") : "Cannot write token, exception in Context lookup ".concat(valueOf));
        }
    }

    /* renamed from: c */
    public static boolean m31951c(Context context) {
        return m31947b(context) != 0 || qdg.m31929j(context) > 0;
    }

    /* renamed from: a */
    static void m31945a(Context context, long j, long j2) {
        if (j != 0 && j2 != 0) {
            StringBuilder sb = new StringBuilder(41);
            sb.append(j);
            sb.append(":");
            sb.append(j2);
            String sb2 = sb.toString();
            if (!sb2.equals(qdg.m31916a(context))) {
                try {
                    FileOutputStream openFileOutput = context.openFileOutput("checkin_id_token", 0);
                    openFileOutput.write(sb2.getBytes(bmwy.f131158c));
                    openFileOutput.close();
                    Log.i("GoogleSettingsUtils", "Updated ID in checkin_id_token file");
                    qdg.m31921b("Updated ID in checkin_id_token file");
                } catch (IOException e) {
                    Log.e("GoogleSettingsUtils", "Exception while updating checkin_id_token file");
                    String valueOf = String.valueOf(sb2);
                    qdg.m31921b(valueOf.length() == 0 ? new String("writeCheckinIdToken, IOException IdToken") : "writeCheckinIdToken, IOException IdToken".concat(valueOf));
                }
            }
        }
    }

    /* renamed from: a */
    static void m31946a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Checkin", 0);
        if (str != null || sharedPreferences.contains("android_id")) {
            sharedPreferences.edit().putString("android_id", str).apply();
        }
    }

    /* renamed from: b */
    static void m31948b(Context context, long j) {
        if (cdci.m132542h()) {
            m31945a(context, m31947b(context), j);
        } else {
            m31943a(context);
        }
    }

    /* renamed from: b */
    private static void m31949b(Context context, long j, long j2) {
        String a = aymn.m84264a(context.getContentResolver(), "android_id");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Checkin", 0);
        String str = null;
        try {
            str = sharedPreferences.getString("android_id", null);
        } catch (ClassCastException e) {
            try {
                long j3 = sharedPreferences.getLong("android_id", 0);
                if (j3 != 0) {
                    str = Long.toString(j3);
                }
            } catch (ClassCastException e2) {
                Log.w("GoogleSettingsUtils", "Exception while fetching event log AID as a long", e2);
            }
        }
        if (j2 != 0 || a != null || j != 0 || str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 91 + String.valueOf(str).length());
            sb.append("AID GSERVICES:");
            sb.append(j2);
            sb.append(",CR:");
            sb.append(a);
            sb.append(",CHECKIN_ID_TOKEN:");
            sb.append(j);
            sb.append(",CHECKIN PREFS:");
            sb.append(str);
            qdg.m31921b(sb.toString());
        }
    }
}
