package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: avvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvn {

    /* renamed from: d */
    private static avvn f93985d = null;

    /* renamed from: a */
    public final Object f93986a = new Object();

    /* renamed from: b */
    public final HashSet f93987b;

    /* renamed from: c */
    public final Context f93988c;

    /* renamed from: e */
    private final File f93989e;

    /* renamed from: f */
    private boolean f93990f;

    /* renamed from: g */
    private final Context f93991g;

    public avvn(Context context) {
        boolean z = false;
        this.f93990f = false;
        this.f93988c = context;
        this.f93987b = new HashSet();
        this.f93989e = context.getDir("usage_reporting_db", 0);
        this.f93991g = aytw.m84817d(context);
        aytw.m84814b();
        if (chdn.m148523d() && m79441b(this.f93991g)) {
            z = true;
        }
        this.f93990f = z;
    }

    /* renamed from: a */
    public static synchronized avvn m79436a() {
        avvn avvn;
        synchronized (avvn.class) {
            if (f93985d == null) {
                f93985d = new avvn(rpr.m34216b());
            }
            avvn = f93985d;
        }
        return avvn;
    }

    /* renamed from: b */
    private static boolean m79441b(Context context) {
        return !context.getSharedPreferences("usagereporting", 0).getAll().isEmpty();
    }

    /* renamed from: c */
    public final int mo51648c() {
        int i;
        synchronized (this.f93986a) {
            SharedPreferences b = mo51647b();
            i = 0;
            if (b != null) {
                i = b.getInt("DeviceWideCbSecretNumber", 0);
            }
            if (b != null) {
                if (i == 0 && avvm.m79434a()) {
                    SharedPreferences.Editor edit = b.edit();
                    i = new Random().nextInt(1024) + 1;
                    edit.putInt("DeviceWideCbSecretNumber", i);
                    edit.apply();
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final String m79437a(long j) {
        if (j == 0) {
            return "OptInUsageReporting";
        }
        return "OptInUsageReporting" + "-" + j;
    }

    /* renamed from: b */
    public static boolean m79442b(SharedPreferences sharedPreferences) {
        return sharedPreferences != null && sharedPreferences.contains("OptInUsageReporting");
    }

    /* renamed from: a */
    public static boolean m79438a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("OptInUsageReporting", false);
        }
        return false;
    }

    /* renamed from: b */
    private static final byte[] m79443b(int i) {
        if (i > 127 || i < 0) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("The whitelist key must be between 0 and 127 inclusive. Given key: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return new byte[]{(byte) i};
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private final boolean m79439a(LevelDb levelDb, String str) {
        sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
        try {
            byte[] bArr = levelDb.get(m79440a(str));
            if (bArr == null || bArr.length <= 0 || bArr[0] != 1) {
                return false;
            }
            return true;
        } catch (LevelDbException e) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo51646b(String str) {
        LevelDb open;
        int i;
        sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
        synchronized (this) {
            try {
                open = LevelDb.open(this.f93989e);
                i = !m79439a(open, str) ? 2 : 3;
                if (open != null) {
                    open.close();
                }
            } catch (LevelDbException e) {
                return 1;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return i;
        throw th;
    }

    /* renamed from: a */
    public static byte[] m79440a(String str) {
        return String.valueOf(str.toLowerCase(Locale.ROOT)).concat("OptInPlayPass").getBytes();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return r4;
     */
    /* renamed from: a */
    public final synchronized List mo51641a(int i) {
        LevelDb open;
        sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
        try {
            open = LevelDb.open(this.f93989e);
            byte[] bArr = open.get(m79443b(i));
            if (bArr != null && bArr.length != 0) {
                bngx a = bngx.m109370a((Object[]) new String(bArr).split(","));
                if (open != null) {
                    open.close();
                }
            } else if (open != null) {
                open.close();
            }
        } catch (LevelDbException | IllegalArgumentException e) {
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
        return null;
    }

    /* renamed from: b */
    public final SharedPreferences mo51647b() {
        aytw.m84814b();
        if (chdn.m148523d()) {
            if (!this.f93990f) {
                boolean b = m79441b(this.f93991g);
                this.f93990f = b;
                if (!b && chdn.f188491a.mo6606a().mo85146e()) {
                    aytw.m84814b();
                    if (aytw.m84815b(this.f93988c)) {
                        this.f93990f = this.f93991g.moveSharedPreferencesFrom(this.f93988c, "usagereporting");
                    }
                }
            }
            if (this.f93990f) {
                return this.f93991g.getSharedPreferences("usagereporting", 0);
            }
            if (aytw.m84815b(this.f93988c)) {
                return this.f93988c.getSharedPreferences("usagereporting", 0);
            }
            return null;
        } else if (aytw.m84815b(this.f93988c)) {
            return this.f93988c.getSharedPreferences("usagereporting", 0);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo51642a(int i, avup avup) {
        List a = mo51641a(i);
        if (a != null) {
            avup.mo51623a(Status.f30107a, a);
        } else {
            avup.mo51623a(Status.f30109c, (List) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final synchronized void mo51643a(int i, List list, avup avup) {
        LevelDb open;
        sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
        try {
            open = LevelDb.open(this.f93989e);
            open.put(m79443b(i), TextUtils.join(",", list).getBytes());
            avup.mo51626d(Status.f30107a);
            if (open != null) {
                open.close();
            }
        } catch (LevelDbException | IllegalArgumentException e) {
            avup.mo51626d(Status.f30109c);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final void mo51644a(Context context) {
        List<Long> list;
        int c = chdz.m148557d() ? mo51648c() : 0;
        synchronized (this.f93986a) {
            SharedPreferences b = mo51647b();
            rzz.m34727a(b, "Unexpected null from getPrefs.");
            UserManager userManager = (UserManager) context.getSystemService("user");
            bngs bngs = new bngs();
            boolean z = true;
            try {
                for (Object obj : (List) userManager.getClass().getDeclaredMethod("getUsers", new Class[0]).invoke(userManager, new Object[0])) {
                    bngs.mo67668c(Long.valueOf(userManager.getSerialNumberForUser((UserHandle) obj.getClass().getDeclaredMethod("getUserHandle", new Class[0]).invoke(obj, new Object[0]))));
                }
                list = bngs.mo67664a();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                list = bnkn.m109665a(0L);
            }
            for (Long l : list) {
                if (chdh.f188485a.mo6606a().mo85138a()) {
                    sre.m36087g(context);
                }
                z &= b.getBoolean(m79437a(l.longValue()), false);
            }
            if (!chdz.m148557d()) {
                Settings.Global.putInt(context.getContentResolver(), "multi_cb", z ? 1 : 0);
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                if (!z) {
                    c--;
                }
                Settings.Global.putInt(contentResolver, "multi_cb", c);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r3 != r4) goto L_0x004e;
     */
    /* renamed from: a */
    public final synchronized boolean mo51645a(UsageReportingOptInOptions usageReportingOptInOptions, avvj avvj) {
        LevelDb open;
        boolean z;
        byte b;
        sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
        int i = usageReportingOptInOptions.f109541d;
        if (i != 0) {
            avvj.mo51639a(chdz.f188510a.mo6606a().mo85162f(), "setting PlayPass opt in");
            try {
                open = LevelDb.open(this.f93989e);
                if (i != 1) {
                    z = false;
                } else {
                    z = true;
                }
                boolean a = m79439a(open, usageReportingOptInOptions.f109542e);
                String str = usageReportingOptInOptions.f109542e;
                sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
                try {
                    if (open.get(m79440a(str)) != null) {
                    }
                } catch (LevelDbException e) {
                }
                String str2 = usageReportingOptInOptions.f109542e;
                sdo.m34971a(aytw.m84815b(this.f93988c), (Object) "User is not unlocked.");
                byte[] a2 = m79440a(str2);
                byte[] bArr = new byte[1];
                if (i == 1) {
                    b = 1;
                } else {
                    b = 0;
                }
                bArr[0] = b;
                open.put(a2, bArr);
                if (open != null) {
                    open.close();
                }
            } catch (LevelDbException e2) {
                return false;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return true;
        throw th;
    }
}
