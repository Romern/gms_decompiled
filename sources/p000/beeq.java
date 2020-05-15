package p000;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: beeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beeq implements Closeable {

    /* renamed from: a */
    static final Pattern f111436a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: b */
    public final File f111437b;

    /* renamed from: c */
    public final File f111438c;

    /* renamed from: d */
    public final File f111439d;

    /* renamed from: e */
    public final int f111440e;

    /* renamed from: f */
    public long f111441f = 0;

    /* renamed from: g */
    public Writer f111442g;

    /* renamed from: h */
    public final LinkedHashMap f111443h = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: i */
    public int f111444i;

    /* renamed from: j */
    private final long f111445j;

    /* renamed from: k */
    private long f111446k = 0;

    /* renamed from: l */
    private final ExecutorService f111447l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: m */
    private final Callable f111448m = new beem(this);

    public beeq(File file, long j) {
        this.f111437b = file;
        this.f111438c = new File(file, "journal");
        this.f111439d = new File(file, "journal.tmp");
        this.f111440e = 2;
        this.f111445j = j;
    }

    /* renamed from: a */
    public static String m94898a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == 13) {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    public static void m94901b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private static final void m94902d(String str) {
        if (!f111436a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    private final void m94903f() {
        if (this.f111442g == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo60621c(String str) {
        m94903f();
        m94902d(str);
        beeo beeo = (beeo) this.f111443h.get(str);
        if (beeo != null && beeo.f111433d == null) {
            for (int i = 0; i < this.f111440e; i++) {
                File a = beeo.mo60612a(i);
                if (a.exists()) {
                    if (!a.delete()) {
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("failed to delete ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                }
                long j = this.f111441f;
                long[] jArr = beeo.f111431b;
                this.f111441f = j - jArr[i];
                jArr[i] = 0;
            }
            this.f111444i++;
            Writer writer = this.f111442g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8);
            sb2.append("REMOVE ");
            sb2.append(str);
            sb2.append(10);
            writer.append((CharSequence) sb2.toString());
            this.f111443h.remove(str);
            if (mo60622c()) {
                this.f111447l.submit(this.f111448m);
            }
        }
    }

    public final synchronized void close() {
        if (this.f111442g != null) {
            ArrayList arrayList = new ArrayList(this.f111443h.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                been been = ((beeo) arrayList.get(i)).f111433d;
                if (been != null) {
                    been.mo60611a();
                }
            }
            mo60625e();
            this.f111442g.close();
            this.f111442g = null;
        }
    }

    /* renamed from: e */
    public final void mo60625e() {
        while (this.f111441f > this.f111445j) {
            mo60621c((String) ((Map.Entry) this.f111443h.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: b */
    public final synchronized been mo60619b(String str) {
        m94903f();
        m94902d(str);
        beeo beeo = (beeo) this.f111443h.get(str);
        if (beeo == null) {
            beeo = new beeo(this, str);
            this.f111443h.put(str, beeo);
        } else if (beeo.f111433d != null) {
            return null;
        }
        been been = new been(this, beeo);
        beeo.f111433d = been;
        Writer writer = this.f111442g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f111442g.flush();
        return been;
    }

    /* renamed from: d */
    public final synchronized void mo60624d() {
        m94903f();
        mo60625e();
        this.f111442g.flush();
    }

    /* renamed from: a */
    public static void m94899a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("DiskLruCache", "close", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* renamed from: b */
    public final synchronized void mo60620b() {
        Writer writer = this.f111442g;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f111439d), 8192);
        bufferedWriter.write("com.google.android.libraries.storage.disklru");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(0));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f111440e));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (beeo beeo : this.f111443h.values()) {
            if (beeo.f111433d == null) {
                String str = beeo.f111430a;
                String a = beeo.mo60613a();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(a).length());
                sb.append("CLEAN ");
                sb.append(str);
                sb.append(a);
                sb.append(10);
                bufferedWriter.write(sb.toString());
            } else {
                String str2 = beeo.f111430a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                sb2.append("DIRTY ");
                sb2.append(str2);
                sb2.append(10);
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        this.f111439d.renameTo(this.f111438c);
        this.f111442g = new BufferedWriter(new FileWriter(this.f111438c, true), 8192);
    }

    /* renamed from: c */
    public final boolean mo60622c() {
        int i = this.f111444i;
        return i >= 2000 && i >= this.f111443h.size();
    }

    /* renamed from: a */
    public static void m94900a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m94900a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
        sb2.append("not a directory: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized beep mo60616a(String str) {
        m94903f();
        m94902d(str);
        beeo beeo = (beeo) this.f111443h.get(str);
        if (beeo != null && beeo.f111432c) {
            File[] fileArr = new File[this.f111440e];
            for (int i = 0; i < this.f111440e; i++) {
                File a = beeo.mo60612a(i);
                fileArr[i] = a;
                if (!a.exists()) {
                    return null;
                }
            }
            this.f111444i++;
            Writer writer = this.f111442g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("READ ");
            sb.append(str);
            sb.append(10);
            writer.append((CharSequence) sb.toString());
            if (mo60622c()) {
                this.f111447l.submit(this.f111448m);
            }
            return new beep(fileArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r0.length() != 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r0 = "unexpected journal line: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        throw new java.io.IOException(r0);
     */
    /* renamed from: a */
    public final void mo60617a() {
        String a;
        String[] strArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f111438c), 8192);
        try {
            String a2 = m94898a((InputStream) bufferedInputStream);
            String a3 = m94898a((InputStream) bufferedInputStream);
            String a4 = m94898a((InputStream) bufferedInputStream);
            String a5 = m94898a((InputStream) bufferedInputStream);
            String a6 = m94898a((InputStream) bufferedInputStream);
            if (!"com.google.android.libraries.storage.disklru".equals(a2) || !"1".equals(a3) || !Integer.toString(0).equals(a4) || !Integer.toString(this.f111440e).equals(a5) || !"".equals(a6)) {
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
            while (true) {
                try {
                    a = m94898a((InputStream) bufferedInputStream);
                    String[] split = a.split(" ");
                    int length = split.length;
                    if (length < 2) {
                        break;
                    }
                    String str = split[1];
                    if (split[0].equals("REMOVE")) {
                        if (length == 2) {
                            this.f111443h.remove(str);
                        }
                    }
                    beeo beeo = (beeo) this.f111443h.get(str);
                    if (beeo == null) {
                        beeo = new beeo(this, str);
                        this.f111443h.put(str, beeo);
                    }
                    if (split[0].equals("CLEAN")) {
                        if (length == this.f111440e + 2) {
                            beeo.f111432c = true;
                            beeo.f111433d = null;
                            strArr = (String[]) Arrays.copyOfRange(split, 2, length);
                            if (strArr.length == beeo.f111434e.f111440e) {
                                for (int i = 0; i < strArr.length; i++) {
                                    beeo.f111431b[i] = Long.parseLong(strArr[i]);
                                }
                            } else {
                                throw beeo.m94892a(strArr);
                            }
                        }
                    }
                    if (split[0].equals("DIRTY")) {
                        if (length == 2) {
                            beeo.f111433d = new been(this, beeo);
                        }
                    }
                    if (!split[0].equals("READ")) {
                        break;
                    } else if (length != 2) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw beeo.m94892a(strArr);
                } catch (EOFException e2) {
                    return;
                }
            }
            String valueOf = String.valueOf(a);
            throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
        } finally {
            m94899a((Closeable) bufferedInputStream);
        }
    }

    /* renamed from: a */
    public final synchronized void mo60618a(been been, boolean z) {
        beeo beeo = been.f111428a;
        if (beeo.f111433d == been) {
            if (z) {
                if (!beeo.f111432c) {
                    int i = 0;
                    while (i < this.f111440e) {
                        if (beeo.mo60614b(i).exists()) {
                            i++;
                        } else {
                            been.mo60611a();
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("edit didn't create file ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f111440e; i2++) {
                File b = beeo.mo60614b(i2);
                if (!z) {
                    m94901b(b);
                } else if (b.exists()) {
                    File a = beeo.mo60612a(i2);
                    b.renameTo(a);
                    long j = beeo.f111431b[i2];
                    long length = a.length();
                    beeo.f111431b[i2] = length;
                    this.f111441f = (this.f111441f - j) + length;
                }
            }
            this.f111444i++;
            beeo.f111433d = null;
            if (!beeo.f111432c) {
                if (!z) {
                    this.f111443h.remove(beeo.f111430a);
                    Writer writer = this.f111442g;
                    String str = beeo.f111430a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb2.append("REMOVE ");
                    sb2.append(str);
                    sb2.append(10);
                    writer.write(sb2.toString());
                    mo60624d();
                    if (this.f111441f > this.f111445j || mo60622c()) {
                        this.f111447l.submit(this.f111448m);
                    }
                }
            }
            beeo.f111432c = true;
            Writer writer2 = this.f111442g;
            String str2 = beeo.f111430a;
            String a2 = beeo.mo60613a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(a2).length());
            sb3.append("CLEAN ");
            sb3.append(str2);
            sb3.append(a2);
            sb3.append(10);
            writer2.write(sb3.toString());
            if (z) {
                this.f111446k++;
            }
            mo60624d();
            this.f111447l.submit(this.f111448m);
        } else {
            throw new IllegalStateException();
        }
    }
}
