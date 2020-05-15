package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: aasc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aasc {

    /* renamed from: e */
    private static final Map f56421e = new C1223np();

    /* renamed from: a */
    private final Context f56422a;

    /* renamed from: b */
    public final SharedPreferences f56423b;

    /* renamed from: c */
    protected final String f56424c = this.f56425d.f78827b;

    /* renamed from: d */
    protected final HelpConfig f56425d;

    public aasc(Context context, HelpConfig helpConfig) {
        this.f56422a = context;
        this.f56425d = helpConfig;
        this.f56423b = context.getSharedPreferences("com.google.android.gms.googlehelp.SHARED_PREFS_FILE", 0);
    }

    /* renamed from: a */
    public static String m46836a(aars aars) {
        abee abee = aars.f56397u;
        return String.format("%s|%s", abee.f57183b, Integer.valueOf(abee.f57184c));
    }

    /* renamed from: d */
    public final void mo31700d(String str) {
        File file = new File(this.f56422a.getFilesDir(), mo31656a(str));
        if (file.exists() && !file.delete()) {
            Log.e("gH_Persistence", str.length() == 0 ? new String("Failed to delete ") : "Failed to delete ".concat(str));
        }
    }

    /* renamed from: a */
    public final int mo31693a(String str, int i) {
        return this.f56423b.getInt(mo31656a(str), i);
    }

    /* renamed from: a */
    public final long mo31694a(String str, long j) {
        return this.f56423b.getLong(mo31656a(str), j);
    }

    /* renamed from: a */
    public final aasa mo31695a() {
        return new aasa(this, this.f56423b.edit());
    }

    /* renamed from: a */
    public final bxxc mo31696a(String str, bxxc bxxc) {
        try {
            return aatb.m46962a(new File(this.f56422a.getFilesDir(), mo31656a(str)), bxxc);
        } catch (IOException e) {
            Log.e("gH_Persistence", "Reading proto lite from file failed!", e);
            return null;
        }
    }

    /* renamed from: a */
    public String mo31656a(String str) {
        synchronized (f56421e) {
            Map map = (Map) f56421e.get(this.f56424c);
            if (map == null) {
                map = new C1223np();
                f56421e.put(this.f56424c, map);
            }
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return str2;
            }
            String format = String.format("%s:gh_%s", this.f56424c, str);
            map.put(str, format);
            return format;
        }
    }

    /* renamed from: a */
    public final String mo31697a(String str, String str2) {
        return this.f56423b.getString(mo31656a(str), str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ IOException -> 0x0031 }] */
    /* renamed from: a */
    public final void mo31698a(bxxc bxxc, String str) {
        BufferedOutputStream bufferedOutputStream;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.f56422a.getFilesDir(), mo31656a(str))));
                try {
                    bufferedOutputStream.write(bxxc.serializeToBytes());
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
                if (bufferedOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("gH_Persistence", "Writing proto lite to file failed!", e);
        }
    }

    /* renamed from: a */
    public final boolean mo31699a(String str, boolean z) {
        return this.f56423b.getBoolean(mo31656a(str), z);
    }
}
