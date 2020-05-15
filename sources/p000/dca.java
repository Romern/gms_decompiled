package p000;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.ads.afma.proto2api.C0152c;
import com.google.ads.afma.proto2api.C0154e;
import com.google.android.ads.tasks.C0180u;
import com.google.android.gms.ads.identifier.C0272d;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dca {

    /* renamed from: a */
    public final Context f12765a;

    /* renamed from: b */
    public ExecutorService f12766b;

    /* renamed from: c */
    public DexClassLoader f12767c;

    /* renamed from: d */
    public dbh f12768d;

    /* renamed from: e */
    public byte[] f12769e;

    /* renamed from: f */
    public volatile C0272d f12770f = null;

    /* renamed from: g */
    public volatile boolean f12771g;

    /* renamed from: h */
    public Future f12772h;

    /* renamed from: i */
    public final boolean f12773i;

    /* renamed from: j */
    public volatile C0152c f12774j;

    /* renamed from: k */
    public Future f12775k;

    /* renamed from: l */
    public dax f12776l;

    /* renamed from: m */
    public boolean f12777m;

    /* renamed from: n */
    public boolean f12778n;

    /* renamed from: o */
    public boolean f12779o;

    /* renamed from: p */
    public dbt f12780p;

    /* renamed from: q */
    private final Map f12781q;

    static {
        dca.class.getSimpleName();
    }

    public dca(Context context) {
        boolean z = false;
        this.f12771g = false;
        this.f12772h = null;
        this.f12774j = null;
        this.f12775k = null;
        this.f12777m = false;
        this.f12778n = false;
        this.f12779o = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.f12773i = z;
        this.f12765a = z ? applicationContext : context;
        this.f12781q = new HashMap();
        if (this.f12780p == null) {
            this.f12780p = new dbt(this.f12765a);
        }
    }

    /* renamed from: a */
    public static final void m8133a(File file) {
        if (!file.exists()) {
            new Object[1][0] = file.getAbsolutePath();
        } else {
            file.delete();
        }
    }

    /* renamed from: b */
    public final int mo8508b() {
        if (this.f12776l == null) {
            return Integer.MIN_VALUE;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException e) {
            if (dax.f12717e == null) {
                synchronized (dax.class) {
                    if (dax.f12717e == null) {
                        dax.f12717e = new Random();
                    }
                }
            }
            return dax.f12717e.nextInt();
        }
    }

    /* renamed from: a */
    public static final void m8134a(String str) {
        m8133a(new File(str));
    }

    /* renamed from: a */
    public final C0272d mo8503a() {
        Future future;
        if (!this.f12771g) {
            return null;
        }
        if (this.f12770f == null && (future = this.f12772h) != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.f12772h = null;
            } catch (InterruptedException | ExecutionException e) {
            } catch (TimeoutException e2) {
                this.f12772h.cancel(true);
            }
        }
        return this.f12770f;
    }

    /* renamed from: a */
    public final Method mo8504a(String str, String str2) {
        C0180u uVar = (C0180u) this.f12781q.get(new Pair(str, str2));
        if (uVar == null) {
            return null;
        }
        if (uVar.f7589d != null) {
            return uVar.f7589d;
        }
        try {
            if (uVar.f7591f.await(2, TimeUnit.SECONDS)) {
                return uVar.f7589d;
            }
            return null;
        } catch (InterruptedException e) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6 A[SYNTHETIC, Splitter:B:58:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed A[SYNTHETIC, Splitter:B:62:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fb A[SYNTHETIC, Splitter:B:69:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0102 A[SYNTHETIC, Splitter:B:73:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo8509b(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, str));
            if (!file3.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    long length = file2.length();
                    if (length > 0) {
                        byte[] bArr = new byte[((int) length)];
                        FileInputStream fileInputStream2 = new FileInputStream(file2);
                        try {
                            if (fileInputStream2.read(bArr) > 0) {
                                C0154e eVar = (C0154e) GeneratedMessageLite.m124016a(C0154e.f7549f, bArr, bxus.m123744c());
                                if (!str.equals(new String(eVar.f7554d.mo73780k())) || !Arrays.equals(eVar.f7553c.mo73780k(), dae.m8082a(eVar.f7552b.mo73780k())) || !Arrays.equals(eVar.f7555e.mo73780k(), Build.VERSION.SDK.getBytes())) {
                                    m8133a(file2);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e) {
                                    }
                                } else {
                                    byte[] a = dbh.m8118a(this.f12769e, new String(eVar.f7552b.mo73780k()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(a, 0, a.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException e2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e3) {
                                        }
                                    } catch (dbg | IOException | NoSuchAlgorithmException e4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                m8133a(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e5) {
                                }
                            }
                        } catch (dbg | IOException | NoSuchAlgorithmException e6) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } else {
                        m8133a(file2);
                    }
                } catch (dbg | IOException | NoSuchAlgorithmException e7) {
                    fileOutputStream = null;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8505a(int i) {
        if (this.f12778n) {
            Future<?> submit = this.f12766b.submit(new dby(this, i));
            if (i == 0) {
                this.f12775k = submit;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132 A[SYNTHETIC, Splitter:B:53:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139 A[SYNTHETIC, Splitter:B:57:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a A[SYNTHETIC, Splitter:B:65:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0151 A[SYNTHETIC, Splitter:B:69:0x0151] */
    /* renamed from: a */
    public final void mo8506a(File file, String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, str));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) > 0) {
                                System.out.print("test");
                                System.out.print("test");
                                System.out.print("test");
                                bxvd da = C0154e.f7549f.mo74144da();
                                ByteString a = ByteString.m123261a(Build.VERSION.SDK.getBytes());
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                C0154e eVar = (C0154e) da.f164949b;
                                a.getClass();
                                eVar.f7551a |= 8;
                                eVar.f7555e = a;
                                ByteString a2 = ByteString.m123261a(str.getBytes());
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                C0154e eVar2 = (C0154e) da.f164949b;
                                a2.getClass();
                                eVar2.f7551a |= 4;
                                eVar2.f7554d = a2;
                                byte[] bytes = dbh.m8116a(this.f12769e, bArr).getBytes();
                                ByteString a3 = ByteString.m123261a(bytes);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                C0154e eVar3 = (C0154e) da.f164949b;
                                a3.getClass();
                                eVar3.f7551a = 1 | eVar3.f7551a;
                                eVar3.f7552b = a3;
                                ByteString a4 = ByteString.m123261a(dae.m8082a(bytes));
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                C0154e eVar4 = (C0154e) da.f164949b;
                                a4.getClass();
                                eVar4.f7551a = 2 | eVar4.f7551a;
                                eVar4.f7553c = a4;
                                file2.createNewFile();
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    byte[] k = ((C0154e) da.mo74062i()).mo73642k();
                                    fileOutputStream.write(k, 0, k.length);
                                    fileOutputStream.close();
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e2) {
                                    }
                                } catch (dbg | IOException | NoSuchAlgorithmException e3) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e4) {
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e5) {
                                        }
                                    }
                                    m8133a(file3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e6) {
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e7) {
                                        }
                                    }
                                    m8133a(file3);
                                    throw th;
                                }
                            } else {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e8) {
                                }
                            }
                        } catch (dbg | IOException | NoSuchAlgorithmException e9) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            m8133a(file3);
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            m8133a(file3);
                            throw th;
                        }
                    } catch (dbg | IOException | NoSuchAlgorithmException e10) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        m8133a(file3);
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        m8133a(file3);
                        throw th;
                    }
                    m8133a(file3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8507a(String str, String str2, Class... clsArr) {
        if (!this.f12781q.containsKey(new Pair(str, str2))) {
            this.f12781q.put(new Pair(str, str2), new C0180u(this, str, str2, clsArr));
        }
    }
}
