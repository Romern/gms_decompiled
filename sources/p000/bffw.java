package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bffw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffw extends bfgq {

    /* renamed from: a */
    public volatile boolean f113716a = false;

    /* renamed from: b */
    public volatile String f113717b;

    /* renamed from: c */
    public final byte[] f113718c;

    /* renamed from: d */
    public volatile boolean f113719d = false;

    /* renamed from: e */
    public volatile bfdg f113720e;

    /* renamed from: f */
    public final bgmj f113721f;

    /* renamed from: g */
    public final bgns f113722g;

    /* renamed from: m */
    private final ThreadPoolExecutor f113723m;

    /* renamed from: n */
    private volatile String f113724n = null;

    /* renamed from: o */
    private final Object f113725o = new Object();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public bffw(bgns bgns, String str, byte[] bArr, bfew bfew, bhdb bhdb, bfhd bfhd, bgmj bgmj) {
        super(bfew, bhdb, bfhd);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unsupported policy: 0");
        bmxy.m108589a(true, (Object) sb.toString());
        if (!str.endsWith(File.separator)) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(File.separator);
            str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        this.f113717b = str;
        this.f113718c = bArr;
        this.f113721f = bgmj;
        this.f113722g = bgns;
        this.f113723m = new bffu(this, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new ThreadPoolExecutor.AbortPolicy());
    }

    /* renamed from: b */
    private static final bfgp m96621b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() == 0) {
                new String("mkdir: ");
            } else {
                "mkdir: ".concat(valueOf);
            }
            if (!file.mkdir()) {
                return new bfgp(false, null, String.format(Locale.US, "Failed to create dir: %s", str));
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61567a() {
        this.f113723m.shutdown();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (!this.f113723m.isShutdown()) {
                this.f113723m.shutdown();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61632a(bfhd bfhd) {
        if (bfhd != null) {
            try {
                bfhd.mo61691a(this.f113717b);
            } catch (FileNotFoundException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Failed to create sessionSummary ");
                } else {
                    "Failed to create sessionSummary ".concat(valueOf);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61633a(bsax bsax) {
        if (!this.f113798j) {
            m96622b(bsax);
        }
    }

    /* renamed from: b */
    private final boolean m96622b(bsax bsax) {
        boolean z;
        if (!bsax.mo70137i(6) || !bsax.mo70129e(6).mo70137i(3)) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108601b(z, "No sequence number specified!");
        int b = bsax.mo70129e(6).mo70114b(3);
        try {
            this.f113723m.execute(new bffv(this, b, bsax));
            return true;
        } catch (RejectedExecutionException e) {
            bfew bfew = this.f113796h;
            if (bfew != null) {
                bfew.mo61490a(b, (String) null, "Failed to write to file: work queue full.");
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[SYNTHETIC, Splitter:B:28:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC, Splitter:B:35:0x004e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0038=Splitter:B:18:0x0038, B:31:0x004a=Splitter:B:31:0x004a} */
    /* renamed from: a */
    public final synchronized void mo61634a(String str) {
        boolean z = true;
        if (this.f113724n != null && !this.f113724n.equals(str)) {
            z = false;
        }
        bmxy.m108589a(z, "sessionId in two writes should be consistent.");
        if (this.f113724n == null) {
            byte[] bytes = str.getBytes();
            mo61635b();
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f113717b, "sessionId"));
                try {
                    fileOutputStream2.write(bytes);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                    }
                    this.f113724n = str;
                } catch (IOException e2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        return;
                    }
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
        }
        return;
    }

    /* renamed from: b */
    public final bfgp mo61635b() {
        synchronized (this.f113725o) {
            if (this.f113719d) {
                return null;
            }
            bfgp b = m96621b(this.f113717b);
            if (b != null) {
                return b;
            }
            String format = String.format(Locale.US, "%d-%d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf((int) (Math.random() * 1000000.0d)));
            String valueOf = String.valueOf(this.f113717b);
            String str = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(format).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(format);
            sb.append(str);
            this.f113717b = sb.toString();
            bfgp b2 = m96621b(this.f113717b);
            if (b2 != null) {
                return b2;
            }
            this.f113719d = true;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61568a(bsax bsax, bsax bsax2) {
        bsax.mo70118b(6, bsax2);
        return m96622b(bsax);
    }
}
