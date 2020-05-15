package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: wba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wba {

    /* renamed from: d */
    public static final /* synthetic */ int f50368d = 0;

    /* renamed from: g */
    private static volatile wba f50369g = null;

    /* renamed from: a */
    public final Context f50370a;

    /* renamed from: b */
    public long f50371b = 0;

    /* renamed from: c */
    public djz f50372c = null;

    /* renamed from: e */
    private waz f50373e = null;

    /* renamed from: f */
    private final BroadcastReceiver f50374f = new way(this);

    private wba(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f50370a = applicationContext;
        applicationContext.registerReceiver(this.f50374f, new IntentFilter("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"), "com.google.android.gms.chimera.permission.CONFIG_CHANGE", null);
    }

    /* renamed from: a */
    public static final djz m41701a(Context context, long j) {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder(65);
        sb.append("content://com.google.android.gms.chimera/api/");
        sb.append(j);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(sb.toString()), "r");
            if (openFileDescriptor != null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    djz c = dft.m8325c(fileInputStream);
                    djp.m8662a().mo9143a(c);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e) {
                    }
                    return c;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e2) {
                    }
                    throw th;
                }
            } else {
                throw new IOException("Config file descriptor is null");
            }
            throw th;
        } catch (NullPointerException e3) {
            throw new IOException("Exception while loading config file descriptor", e3);
        }
    }

    /* renamed from: a */
    private final synchronized waz m41702a(Cursor cursor) {
        boolean z;
        if (this.f50373e == null) {
            int columnIndex = cursor.getColumnIndex("usePlatformClassLoaders");
            boolean z2 = true;
            if (columnIndex < 0 || cursor.getInt(columnIndex) == 0) {
                z = false;
            } else {
                z = true;
            }
            int columnIndex2 = cursor.getColumnIndex("checkFingerprint");
            if (columnIndex2 < 0 || cursor.getInt(columnIndex2) == 0) {
                z2 = false;
            }
            this.f50373e = new waz(z, z2);
        }
        return this.f50373e;
    }

    /* renamed from: a */
    public static wba m41703a(Context context) {
        wba wba = f50369g;
        if (wba == null) {
            synchronized (wba.class) {
                wba = f50369g;
                if (wba == null) {
                    wba = new wba(context);
                    f50369g = wba;
                }
            }
        }
        return wba;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r4 == r11.f50371b) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r11.f50372c = m41701a(r12, r4);
        r11.f50371b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r4 = r11.f50372c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        android.os.StrictMode.setThreadPolicy(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (r7 != 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5 = p000.waq.m41679b(r12, r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if (r5 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
        if (r5.moveToFirst() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        if (r5.getInt(0) >= r14) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0075, code lost:
        r2 = r5.getInt(5);
        r8 = r5.getLong(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
        r7 = r7 - 1;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0092, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        android.util.Log.e("DynamiteLoaderV2Impl", "Failed to create module context.", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r11.f50372c != null) goto L_0x0020;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b A[ExcHandler: InvalidConfigException | djq | IOException (r12v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x001a] */
    /* renamed from: a */
    public final Context mo29009a(Context context, String str, int i, Cursor cursor) {
        Cursor b;
        djz djz;
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(5);
            long j = cursor.getLong(6);
            StrictMode.ThreadPolicy a = stl.m36298a();
            int i3 = 2;
            while (true) {
                try {
                    synchronized (this) {
                        break;
                    }
                    dka b2 = djz.mo9176b(i2);
                    qlr a2 = qlr.m32402a(context);
                    if (a2 == null) {
                        Log.e("DynamiteLoaderV2Impl", "Failed to create dynamite context.");
                    } else {
                        Context a3 = djp.m8662a().mo9140a(a2, djz, b2, m41702a(cursor));
                        StrictMode.setThreadPolicy(a);
                        return a3;
                    }
                } catch (InvalidConfigException | djq | IOException e) {
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(a);
                    throw th;
                }
            }
            throw e;
        }
        Log.e("DynamiteLoaderV2Impl", "Failed to read query result");
        return null;
        throw th;
    }
}
