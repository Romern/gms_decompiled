package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: aunw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunw {

    /* renamed from: a */
    public final String f92178a;

    /* renamed from: b */
    public final Throwable f92179b;

    /* renamed from: c */
    final /* synthetic */ aunx f92180c;

    public aunw(aunx aunx, String str, Throwable th) {
        this.f92180c = aunx;
        sdo.m34977c(str);
        this.f92178a = str;
        this.f92179b = th;
    }

    /* renamed from: a */
    public final void mo50706a() {
        aunx aunx = this.f92180c;
        if (aunx.mo50712a(5)) {
            Throwable th = this.f92179b;
            if (th == null) {
                Log.e(aunx.f92181a, this.f92178a);
            } else {
                Log.e(aunx.f92181a, this.f92178a, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo50707b() {
        aunx aunx = this.f92180c;
        aunv aunv = (aunv) aunv.f92171a.mo13145b();
        String str = aunx.f92181a;
        String str2 = this.f92178a;
        Throwable th = this.f92179b;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        synchronized (aunv.f92173c) {
            int i = (aunv.f92177g + 1) % 100;
            aunv.f92177g = i;
            if (i == 0) {
                aunv.f92176f = cgzt.m147782g();
            }
            if (aunv.f92176f) {
                LogRecord logRecord = new LogRecord(Level.INFO, str2);
                logRecord.setLoggerName(str);
                logRecord.setThrown(th);
                FileHandler fileHandler = aunv.f92174d;
                if (fileHandler == null && !aunv.f92175e) {
                    File externalCacheDir = aunv.f92172b.getExternalCacheDir();
                    FileHandler fileHandler2 = null;
                    if (externalCacheDir != null) {
                        if (!externalCacheDir.exists()) {
                            if (!externalCacheDir.mkdirs()) {
                            }
                        }
                        try {
                            FileHandler fileHandler3 = new FileHandler(new File(externalCacheDir, "googletrustagent_export.log").getAbsolutePath(), 1048576, 1, true);
                            fileHandler3.setFormatter(new aunu());
                            fileHandler2 = fileHandler3;
                        } catch (IOException e) {
                        }
                    }
                    aunv.f92174d = fileHandler2;
                    fileHandler = aunv.f92174d;
                    if (fileHandler == null) {
                        aunv.f92175e = true;
                    }
                }
                if (fileHandler != null) {
                    fileHandler.publish(logRecord);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo50708c() {
        aunx aunx = this.f92180c;
        if (aunx.mo50712a(4)) {
            Throwable th = this.f92179b;
            if (th == null) {
                Log.i(aunx.f92181a, this.f92178a);
            } else {
                Log.i(aunx.f92181a, this.f92178a, th);
            }
        }
    }

    /* renamed from: d */
    public final void mo50709d() {
        aunx aunx = this.f92180c;
        if (aunx.mo50712a(5)) {
            Throwable th = this.f92179b;
            if (th == null) {
                Log.w(aunx.f92181a, this.f92178a);
            } else {
                Log.w(aunx.f92181a, this.f92178a, th);
            }
        }
    }
}
