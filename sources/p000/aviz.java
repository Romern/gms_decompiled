package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/* renamed from: aviz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aviz {

    /* renamed from: a */
    public static final srn f93261a = srn.m36124a();

    /* renamed from: b */
    private static final byte[] f93262b = {-17, -83, 24, -66, -52, 55, 29, -9, -45, 86, -1, -35, -93, 91, -47, 53, 53, -120, -95, 23};

    /* renamed from: b */
    public static void m78600b(Context context, String str) {
        aviy aviy = new aviy(str);
        SharedPreferences.Editor edit = context.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
        edit.remove(aviy.f93258a);
        edit.remove(aviy.f93259b);
        edit.remove(aviy.f93260c);
        edit.apply();
    }

    /* renamed from: c */
    public static String m78601c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MessageDigest a = spo.m35903a("MD5");
        if (a == null) {
            ((bnsl) f93261a.mo68387b()).mo68405a("couldn't get a digest");
            return null;
        }
        String b = addi.m50206a(context).mo33346b();
        if (!TextUtils.isEmpty(b)) {
            a.update(b.getBytes());
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            a.update(Build.MODEL.getBytes());
        }
        a.update(f93262b);
        byte[] digest = a.digest(str.getBytes());
        if (digest != null) {
            return srv.m36164d(digest);
        }
        ((bnsl) f93261a.mo68387b()).mo68405a("couldn't digest account-id");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* renamed from: a */
    public static bxre m78598a(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (avix.m78596a().f93257a.containsKey(str)) {
                str2 = (String) avix.m78596a().f93257a.get(str);
            } else {
                String c = m78601c(context, str);
                if (c != null) {
                    aviy aviy = new aviy(c);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("UdcConsistencyTokenPrefs", 0);
                    if (sharedPreferences.getBoolean(aviy.f93258a, false) && Long.valueOf(sharedPreferences.getLong(aviy.f93260c, 0)).longValue() > System.currentTimeMillis()) {
                        str2 = sharedPreferences.getString(aviy.f93259b, null);
                    }
                }
            }
            if (str2 != null) {
                return null;
            }
            bxvd da = bxre.f164546c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxre bxre = (bxre) da.f164949b;
            str2.getClass();
            bxre.f164548a |= 1;
            bxre.f164549b = str2;
            return (bxre) da.mo74062i();
        }
        str2 = null;
        if (str2 != null) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static void m78599a(bxrf bxrf, Context context, String str) {
        sdo.m34969a(str, (Object) "AccountId must not be empty");
        if (bxrf != null && (bxrf.f164552a & 1) != 0) {
            blbt blbt = bxrf.f164553b;
            if (blbt == null) {
                blbt = blbt.f125862d;
            }
            int i = blbt.f125866c;
            blbt blbt2 = bxrf.f164553b;
            if (blbt2 == null) {
                blbt2 = blbt.f125862d;
            }
            if ((blbt2.f125864a & 1) != 0) {
                blbt blbt3 = bxrf.f164553b;
                if (blbt3 == null) {
                    blbt3 = blbt.f125862d;
                }
                String str2 = blbt3.f125865b;
                String c = m78601c(context, str);
                if (c == null) {
                    return;
                }
                if (i <= 0) {
                    m78600b(context, c);
                    if (i == 0) {
                        avix.m78596a().mo51286a(str);
                    } else {
                        avix.m78596a().f93257a.put(str, str2);
                    }
                } else {
                    aviy aviy = new aviy(c);
                    SharedPreferences.Editor edit = context.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
                    edit.putBoolean(aviy.f93258a, true);
                    edit.putString(aviy.f93259b, str2);
                    edit.putLong(aviy.f93260c, System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) i));
                    avix.m78596a().mo51286a(str);
                    edit.apply();
                }
            }
        }
    }
}
