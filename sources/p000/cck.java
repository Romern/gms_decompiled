package p000;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cck implements Closeable {

    /* renamed from: a */
    public final File f6487a;

    /* renamed from: b */
    public final File f6488b;

    /* renamed from: c */
    public final File f6489c;

    /* renamed from: d */
    public final int f6490d;

    /* renamed from: e */
    public long f6491e = 0;

    /* renamed from: f */
    public Writer f6492f;

    /* renamed from: g */
    public final LinkedHashMap f6493g = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: h */
    public int f6494h;

    /* renamed from: i */
    final ThreadPoolExecutor f6495i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ccg());

    /* renamed from: j */
    private final File f6496j;

    /* renamed from: k */
    private final int f6497k;

    /* renamed from: l */
    private final long f6498l;

    /* renamed from: m */
    private long f6499m = 0;

    /* renamed from: n */
    private final Callable f6500n = new ccf(this);

    public cck(File file) {
        this.f6487a = file;
        this.f6497k = 1;
        this.f6488b = new File(file, "journal");
        this.f6489c = new File(file, "journal.tmp");
        this.f6496j = new File(file, "journal.bkp");
        this.f6490d = 1;
        this.f6498l = 262144000;
    }

    /* renamed from: a */
    public static void m3945a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    private static void m3948b(Writer writer) {
        int i = Build.VERSION.SDK_INT;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: e */
    private final void m3949e() {
        if (this.f6492f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo3709c(String str) {
        m3949e();
        cci cci = (cci) this.f6493g.get(str);
        if (cci != null && cci.f6484f == null) {
            for (int i = 0; i < this.f6490d; i = 1) {
                File b = cci.mo3702b();
                if (b.exists()) {
                    if (!b.delete()) {
                        String valueOf = String.valueOf(b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("failed to delete ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                }
                long j = this.f6491e;
                long[] jArr = cci.f6480b;
                this.f6491e = j - jArr[0];
                jArr[0] = 0;
            }
            this.f6494h++;
            this.f6492f.append((CharSequence) "REMOVE");
            this.f6492f.append(' ');
            this.f6492f.append((CharSequence) str);
            this.f6492f.append(10);
            this.f6493g.remove(str);
            if (mo3710c()) {
                this.f6495i.submit(this.f6500n);
            }
        }
    }

    public final synchronized void close() {
        if (this.f6492f != null) {
            ArrayList arrayList = new ArrayList(this.f6493g.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cch cch = ((cci) arrayList.get(i)).f6484f;
                if (cch != null) {
                    cch.mo3699a();
                }
            }
            mo3712d();
            m3947a(this.f6492f);
            this.f6492f = null;
        }
    }

    /* renamed from: d */
    public final void mo3712d() {
        while (this.f6491e > this.f6498l) {
            mo3709c((String) ((Map.Entry) this.f6493g.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public static void m3946a(File file, File file2, boolean z) {
        if (z) {
            m3945a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m3947a(Writer writer) {
        int i = Build.VERSION.SDK_INT;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: b */
    public final synchronized cch mo3707b(String str) {
        m3949e();
        cci cci = (cci) this.f6493g.get(str);
        if (cci == null) {
            cci = new cci(this, str);
            this.f6493g.put(str, cci);
        } else if (cci.f6484f != null) {
            return null;
        }
        cch cch = new cch(this, cci);
        cci.f6484f = cch;
        this.f6492f.append((CharSequence) "DIRTY");
        this.f6492f.append(' ');
        this.f6492f.append((CharSequence) str);
        this.f6492f.append(10);
        m3948b(this.f6492f);
        return cch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized ccj mo3704a(String str) {
        m3949e();
        cci cci = (cci) this.f6493g.get(str);
        if (cci != null && cci.f6483e) {
            for (File file : cci.f6481c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f6494h++;
            this.f6492f.append((CharSequence) "READ");
            this.f6492f.append(' ');
            this.f6492f.append((CharSequence) str);
            this.f6492f.append(10);
            if (mo3710c()) {
                this.f6495i.submit(this.f6500n);
            }
            return new ccj(cci.f6481c);
        }
    }

    /* renamed from: c */
    public final boolean mo3710c() {
        int i = this.f6494h;
        return i >= 2000 && i >= this.f6493g.size();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: b */
    public final synchronized void mo3708b() {
        Writer writer = this.f6492f;
        if (writer != null) {
            m3947a(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6489c), ccn.f6507a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6497k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6490d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (cci cci : this.f6493g.values()) {
                if (cci.f6484f != null) {
                    String str = cci.f6479a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                    sb.append("DIRTY ");
                    sb.append(str);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    String str2 = cci.f6479a;
                    String a = cci.mo3701a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(a).length());
                    sb2.append("CLEAN ");
                    sb2.append(str2);
                    sb2.append(a);
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            m3947a(bufferedWriter);
            if (this.f6488b.exists()) {
                m3946a(this.f6488b, this.f6496j, true);
            }
            m3946a(this.f6489c, this.f6488b, false);
            this.f6496j.delete();
            this.f6492f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6488b, true), ccn.f6507a));
        } catch (Throwable th) {
            m3947a(bufferedWriter);
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r4.length() != 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r4 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r4 = "unexpected journal line: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        throw new java.io.IOException(r4);
     */
    /* renamed from: a */
    public final void mo3705a() {
        String a;
        String str;
        String[] split;
        ccm ccm = new ccm(new FileInputStream(this.f6488b), ccn.f6507a);
        try {
            String a2 = ccm.mo3714a();
            String a3 = ccm.mo3714a();
            String a4 = ccm.mo3714a();
            String a5 = ccm.mo3714a();
            String a6 = ccm.mo3714a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.f6497k).equals(a4) || !Integer.toString(this.f6490d).equals(a5) || !"".equals(a6)) {
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 35 + String.valueOf(a3).length() + String.valueOf(a5).length() + String.valueOf(a6).length());
                sb.append("unexpected journal header: [");
                sb.append(a2);
                sb.append(", ");
                sb.append(a3);
                sb.append(", ");
                sb.append(a5);
                sb.append(", ");
                sb.append(a6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    a = ccm.mo3714a();
                    int indexOf = a.indexOf(32);
                    if (indexOf == -1) {
                        break;
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = a.indexOf(32, i2);
                    if (indexOf2 == -1) {
                        str = a.substring(i2);
                        if (indexOf == 6) {
                            if (a.startsWith("REMOVE")) {
                                this.f6493g.remove(str);
                                i++;
                            }
                        }
                    } else {
                        str = a.substring(i2, indexOf2);
                    }
                    cci cci = (cci) this.f6493g.get(str);
                    if (cci == null) {
                        cci = new cci(this, str);
                        this.f6493g.put(str, cci);
                    }
                    if (indexOf2 != -1 && indexOf == 5 && a.startsWith("CLEAN")) {
                        split = a.substring(indexOf2 + 1).split(" ");
                        cci.f6483e = true;
                        cci.f6484f = null;
                        if (split.length == cci.f6485g.f6490d) {
                            for (int i3 = 0; i3 < split.length; i3++) {
                                cci.f6480b[i3] = Long.parseLong(split[i3]);
                            }
                            i++;
                        } else {
                            throw cci.m3940a(split);
                        }
                    } else if (indexOf2 != -1 || indexOf != 5 || !a.startsWith("DIRTY")) {
                        if (indexOf2 == -1) {
                            if (indexOf != 4 || !a.startsWith("READ")) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    } else {
                        cci.f6484f = new cch(this, cci);
                        i++;
                    }
                } catch (NumberFormatException e) {
                    throw cci.m3940a(split);
                } catch (EOFException e2) {
                    this.f6494h = i - this.f6493g.size();
                    if (ccm.f6503b != -1) {
                        this.f6492f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6488b, true), ccn.f6507a));
                    } else {
                        mo3708b();
                    }
                    return;
                }
            }
            String valueOf = String.valueOf(a);
            throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
        } finally {
            ccn.m3960a(ccm);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo3706a(cch cch, boolean z) {
        int i;
        int i2;
        cci cci = cch.f6475a;
        if (cci.f6484f == cch) {
            if (!z) {
                i = 0;
            } else if (cci.f6483e) {
                i = 0;
            } else {
                int i3 = 0;
                while (i3 < this.f6490d) {
                    if (!cch.f6476b[0]) {
                        cch.mo3699a();
                        StringBuilder sb = new StringBuilder(61);
                        sb.append("Newly created entry didn't create value for index 0");
                        throw new IllegalStateException(sb.toString());
                    } else if (cci.mo3703c().exists()) {
                        i3 = 1;
                    } else {
                        cch.mo3699a();
                        return;
                    }
                }
                i = 0;
            }
            while (i < this.f6490d) {
                File c = cci.mo3703c();
                if (z) {
                    if (c.exists()) {
                        File b = cci.mo3702b();
                        c.renameTo(b);
                        long j = cci.f6480b[0];
                        long length = b.length();
                        cci.f6480b[0] = length;
                        this.f6491e = (this.f6491e - j) + length;
                    }
                    i2 = 1;
                } else {
                    m3945a(c);
                    i2 = 1;
                }
            }
            this.f6494h++;
            cci.f6484f = null;
            if (cci.f6483e || z) {
                cci.f6483e = true;
                this.f6492f.append((CharSequence) "CLEAN");
                this.f6492f.append(' ');
                this.f6492f.append((CharSequence) cci.f6479a);
                this.f6492f.append((CharSequence) cci.mo3701a());
                this.f6492f.append(10);
                if (z) {
                    this.f6499m++;
                }
            } else {
                this.f6493g.remove(cci.f6479a);
                this.f6492f.append((CharSequence) "REMOVE");
                this.f6492f.append(' ');
                this.f6492f.append((CharSequence) cci.f6479a);
                this.f6492f.append(10);
            }
            m3948b(this.f6492f);
            if (this.f6491e > this.f6498l || mo3710c()) {
                this.f6495i.submit(this.f6500n);
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
