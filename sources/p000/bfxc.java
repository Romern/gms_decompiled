package p000;

import android.content.Context;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: bfxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxc {

    /* renamed from: a */
    public static volatile boolean f115575a = false;

    /* renamed from: b */
    private static PrintWriter f115576b;

    static {
        new FieldPosition(0);
        new Date();
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
        new StringBuffer(20);
    }

    /* renamed from: a */
    public static synchronized void m98130a() {
        synchronized (bfxc.class) {
        }
    }

    /* renamed from: b */
    public static void m98133b(String str, String str2) {
        Log.e(str, str2);
        m98130a();
    }

    /* renamed from: c */
    public static void m98134c(String str, String str2) {
        Log.w(str, str2);
        m98130a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m98131a(Context context) {
        synchronized (bfxc.class) {
            if (f115576b == null) {
                int i = spn.f44932a;
                f115575a = false;
                try {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        File file = new File(externalFilesDir, "geofencer_debug_log");
                        if (file.exists()) {
                            try {
                                f115576b = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, true)));
                            } catch (Exception e) {
                            }
                        }
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable("Logger", 6)) {
                        Log.e("Logger", "Unable to retrieve external files dir.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m98132a(String str, String str2) {
        Log.i(str, str2);
        m98130a();
    }
}
