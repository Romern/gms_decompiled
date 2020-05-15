package p000;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: bgus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgus extends ErrorManager implements Filter {

    /* renamed from: a */
    public final File f117594a;

    /* renamed from: b */
    private final Handler f117595b;

    /* renamed from: c */
    private final LogRecord f117596c = new LogRecord(Level.INFO, "");

    public bgus(File file, int i) {
        if (file == null || !file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Incomplete or non-existent dir ");
            sb.append(valueOf);
            Log.e("GCoreUlr", "", new IllegalArgumentException(sb.toString()));
            throw new IllegalArgumentException();
        }
        this.f117594a = file;
        FileHandler fileHandler = new FileHandler(new File(this.f117594a, "log").getAbsolutePath(), i >> 2, 4, true);
        this.f117595b = fileHandler;
        fileHandler.setFormatter(new bguo());
        this.f117595b.setLevel(Level.ALL);
        this.f117595b.setFilter(this);
        this.f117595b.setErrorManager(this);
    }

    /* renamed from: a */
    public final synchronized void mo63222a() {
        this.f117595b.close();
        if (this.f117594a.exists() && !bhcy.m100662a(this.f117594a)) {
            String valueOf = String.valueOf(this.f117594a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Error deleting ");
            sb.append(valueOf);
            Log.e("GCoreUlr", "", new IOException(sb.toString()));
        }
    }

    public final synchronized void error(String str, Exception exc, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(")");
        Log.e("GCoreUlr", sb.toString(), exc);
    }

    public final boolean isLoggable(LogRecord logRecord) {
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f117594a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LogFile{mLogDir=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo63223a(PrintWriter printWriter) {
        if (!this.f117594a.exists()) {
            String valueOf = String.valueOf(this.f117594a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("The log file directory does not exist: ");
            sb.append(valueOf);
            Log.w("GCoreUlr", sb.toString());
            return;
        }
        this.f117595b.flush();
        for (int i = 3; i >= 0; i--) {
            File file = this.f117594a;
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("log.");
            sb2.append(i);
            File file2 = new File(file, sb2.toString());
            if (file2.exists()) {
                printWriter.println();
                printWriter.println(String.valueOf(file2.getName()).concat(":"));
                printWriter.println();
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            printWriter.println(readLine);
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            try {
                                Log.w("GCoreUlr", "Exception: ", e);
                                bgzo.m100462a(bufferedReader);
                            } catch (Throwable th) {
                                th = th;
                                bgzo.m100462a(bufferedReader);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            bgzo.m100462a(bufferedReader);
                            throw th;
                        }
                    }
                    bgzo.m100462a(bufferedReader2);
                } catch (IOException e2) {
                    e = e2;
                    Log.w("GCoreUlr", "Exception: ", e);
                    bgzo.m100462a(bufferedReader);
                } catch (Throwable th3) {
                    th = th3;
                    bgzo.m100462a(bufferedReader);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo63224a(Level level, String str, String str2) {
        mo63225a(level, str, str2, null);
    }

    /* renamed from: a */
    public final synchronized void mo63225a(Level level, String str, String str2, Throwable th) {
        spn.m35873c();
        this.f117596c.setMillis(System.currentTimeMillis());
        this.f117596c.setLevel(level);
        this.f117596c.setMessage(String.format("%s: %s", str, str2));
        this.f117596c.setThrown(th);
        this.f117595b.publish(this.f117596c);
    }

    /* renamed from: a */
    public final synchronized void mo63226a(Level level, String str, Throwable th) {
        mo63225a(level, str, "", th);
    }
}
