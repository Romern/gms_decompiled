package p000;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: sqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqm implements Appendable, Closeable {

    /* renamed from: a */
    public final ScheduledExecutorService f44979a;

    /* renamed from: b */
    public final long f44980b;

    /* renamed from: c */
    public final long f44981c;

    /* renamed from: d */
    public final TimeUnit f44982d;

    /* renamed from: e */
    public final Object f44983e = new Object();

    /* renamed from: f */
    public final FileOutputStream f44984f;

    /* renamed from: g */
    public final PrintStream f44985g;

    /* renamed from: h */
    public long f44986h;

    /* renamed from: i */
    public long f44987i;

    /* renamed from: j */
    public ScheduledFuture f44988j;

    /* renamed from: k */
    final Runnable f44989k = new sqk(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    public sqm(File file, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        boolean z;
        FileOutputStream fileOutputStream;
        if (i < 0) {
            Log.w("CachingFileWriter", "buffer size should be >= 0");
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "bufferSize must be >= 0");
        if (!sre.m36084d(rpr.m34216b())) {
            if (i > 102400) {
                i = 102400;
            }
        } else if (i > 20480) {
            i = 20480;
        }
        this.f44980b = (long) i;
        this.f44986h = 0;
        this.f44979a = scheduledExecutorService;
        this.f44981c = j;
        this.f44982d = timeUnit;
        PrintStream printStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                fileOutputStream.getChannel().force(true);
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                Log.w("CachingFileWriter", "Couldn't set force on the output channel.");
                this.f44984f = fileOutputStream;
                if (fileOutputStream != null) {
                }
                this.f44985g = printStream;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream = null;
            Log.e("CachingFileWriter", "Couldn't open stats file for appending", e);
            this.f44984f = fileOutputStream;
            if (fileOutputStream != null) {
            }
            this.f44985g = printStream;
        } catch (IOException e4) {
            fileOutputStream = null;
            Log.w("CachingFileWriter", "Couldn't set force on the output channel.");
            this.f44984f = fileOutputStream;
            if (fileOutputStream != null) {
            }
            this.f44985g = printStream;
        }
        this.f44984f = fileOutputStream;
        if (fileOutputStream != null) {
            if (i <= 0) {
                try {
                    printStream = new PrintStream(fileOutputStream, true, "UTF-8");
                } catch (UnsupportedEncodingException e5) {
                    Log.e("CachingFileWriter", "Couldn't open print stats files for writing", e5);
                }
            } else {
                printStream = new PrintStream(new BufferedOutputStream(fileOutputStream, i), false, "UTF-8");
            }
        }
        this.f44985g = printStream;
    }

    /* renamed from: a */
    private final void m35980a(byte[] bArr) {
        if (this.f44985g != null) {
            this.f44979a.execute(new sql(this, bArr));
        }
    }

    public final Appendable append(char c) {
        synchronized (this.f44983e) {
            if (this.f44985g != null) {
                m35980a(String.valueOf(c).getBytes("UTF-8"));
            }
        }
        return this;
    }

    /* renamed from: b */
    public final void mo25980b() {
        synchronized (this.f44983e) {
            if (this.f44986h != 0) {
                FileLock a = mo25976a();
                try {
                    PrintStream printStream = this.f44985g;
                    if (printStream != null) {
                        printStream.flush();
                        this.f44987i++;
                        this.f44986h = 0;
                    }
                } finally {
                    a.release();
                }
            }
        }
    }

    public final void close() {
        synchronized (this.f44983e) {
            PrintStream printStream = this.f44985g;
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    /* renamed from: a */
    public final FileLock mo25976a() {
        try {
            return this.f44984f.getChannel().lock();
        } catch (OverlappingFileLockException e) {
            throw new IOException("Unable to lock file exclusively", e);
        }
    }

    public final Appendable append(CharSequence charSequence) {
        synchronized (this.f44983e) {
            if (this.f44985g != null) {
                m35980a(charSequence.toString().getBytes("UTF-8"));
            }
        }
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        synchronized (this.f44983e) {
            if (this.f44985g != null) {
                m35980a(charSequence.subSequence(i, i2).toString().getBytes("UTF-8"));
            }
        }
        return this;
    }
}
