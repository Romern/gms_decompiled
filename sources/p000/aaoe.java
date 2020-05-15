package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: aaoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoe {
    /* renamed from: a */
    public static String m21744a(Context context) {
        SharedPreferences b = aakw.m21417b(context);
        if (cecz.m136067o().equals(b.getString("sender", null))) {
            return b.getString("regId", null);
        }
        SharedPreferences.Editor edit = b.edit();
        edit.remove("sender");
        edit.remove("regId");
        edit.commit();
        return null;
    }

    /* renamed from: b */
    public static boolean m21746b(Context context) {
        aytw.m84814b();
        if (ceck.m135995e()) {
            return m21748d(context).contains("gcm_local_directboot_token");
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: c */
    public static void m21747c(Context context) {
        aeat a = aeat.m51532a(context);
        aytw.m84814b();
        if (ceck.m135995e() && !m21746b(context)) {
            aebi aebi = new aebi();
            aebi.f63099k = "direct_boot_registration";
            aebi.f63097i = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService";
            aebi.mo34004a(0L, 30L);
            aebi.mo34024a(0, 0);
            aebi.mo34023a(0);
            aebi.mo34029b(true);
            aebi.f63102n = true;
            a.mo33984a(aebi.mo33974b());
        }
    }

    /* renamed from: d */
    public static synchronized SharedPreferences m21748d(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (aaoe.class) {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences("com.google.android.gms.gcm.gmsproc.directboot", 0);
        }
        return sharedPreferences;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m21745a(Context context, aeat aeat) {
        SharedPreferences b = aakw.m21417b(context);
        if (m21744a(context) == null || ((cecz.f182285a.mo6606a().mo78798Q() && b.getInt("GCM_V", 0) != 201515033) || !cecz.m136067o().equals(b.getString("sender", "")) || b.getLong("reg_time", 0) + (cecz.f182285a.mo6606a().mo78782A() * 1000) < System.currentTimeMillis())) {
            Log.i("GCM-GMS", "Scheduling task to register GMS");
            aebi aebi = new aebi();
            aebi.f63099k = "gms_registration";
            aebi.f63097i = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService";
            aebi.mo34004a(0L, 30L);
            aebi.mo34023a(0);
            aebi.mo34024a(0, 0);
            aebi.mo34029b(true);
            aebi.f63102n = true;
            aeat.mo33984a(aebi.mo33974b());
        }
    }
}
