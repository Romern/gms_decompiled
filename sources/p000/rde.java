package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.Os;
import android.util.Log;
import android.util.LruCache;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.clearcut.store.FlatFileLogStore$CantCreateDirException;
import com.google.android.gms.clearcut.store.FlatFileLogStore$InvalidLogFileNameException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ClosedByInterruptException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: rde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rde implements rdp {

    /* renamed from: a */
    public static final int f42700a = bxuk.m123661k(Integer.MAX_VALUE);

    /* renamed from: i */
    private static final bmyx f42701i = bmyx.m108640a(',');

    /* renamed from: j */
    private static final String[] f42702j = new String[0];

    /* renamed from: k */
    private static final bmyx f42703k = bmyx.m108640a('.');

    /* renamed from: b */
    public final Object f42704b = new Object();

    /* renamed from: c */
    public final Object f42705c = new Object();

    /* renamed from: d */
    public final Context f42706d;

    /* renamed from: e */
    public final File f42707e;

    /* renamed from: f */
    public final LruCache f42708f = new rcp(this, (int) cddx.f180554a.mo6606a().mo77316i());

    /* renamed from: g */
    public final LruCache f42709g = new LruCache((int) cddx.f180554a.mo6606a().mo77315h());

    /* renamed from: h */
    final belh f42710h;

    /* renamed from: l */
    private final Object f42711l = new Object();

    /* renamed from: m */
    private final bngx f42712m;

    /* renamed from: n */
    private final rch f42713n;

    /* renamed from: o */
    private String f42714o;

    /* renamed from: p */
    private long f42715p;

    /* renamed from: q */
    private final LruCache f42716q = new C1589rcs(this, (int) cdep.f180615a.mo6606a().mo77362a());

    /* renamed from: r */
    private volatile Map f42717r = null;

    /* renamed from: s */
    private volatile Long f42718s = null;

    /* renamed from: t */
    private final qwk f42719t;

    public rde(Context context, beju beju) {
        File file = new File(context.getFilesDir(), "clearcut");
        qwk a = qwh.m32998a(context);
        this.f42706d = context;
        this.f42707e = file;
        try {
            this.f42714o = file.getCanonicalPath();
        } catch (IOException e) {
            Log.e("FlatFileLogStore", "Failed to get the canonical path for root directory.", e);
        }
        this.f42712m = bngx.m109370a((Object[]) cagz.values());
        this.f42713n = new rch(context, beju);
        this.f42715p = 0;
        bejq g = bejr.m95186g();
        befq a2 = befr.m94979a();
        a2.mo60671a(file);
        a2.mo60672a("internal_events.pb");
        g.mo60762a(a2.mo60670a());
        g.mo60764a(cafw.f173023b);
        this.f42710h = beju.mo60765a(g.mo60761a());
        this.f42719t = a;
    }

    /* renamed from: a */
    private static int m33356a(bxuc bxuc) {
        int i = 0;
        while (!bxuc.mo73783A()) {
            try {
                bxuc.mo73797f(bxuc.mo73811t());
                i++;
            } catch (IOException e) {
                Log.e("FlatFileLogStore", "Error counting log events in stream", e);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final String[] m33365a(String[] strArr) {
        return strArr == null ? f42702j : strArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnfi, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, rci]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: b */
    private final Iterable m33366b(bngx bngx) {
        return bnjd.m109586b((Iterable) bnfi.m109238b(bnjd.m109575a(bnjd.m109586b((Iterable) bnfi.m109238b(bnjd.m109575a(bnjd.m109586b(bnjd.m109575a((Iterable) bngx, (bmxj) new rci(this)), rcj.f42641a), rck.f42642a)), rcl.f42643a), rcm.f42644a)), rcn.f42645a);
    }

    /* renamed from: c */
    public static final int m33368c(File file) {
        InputStream d;
        try {
            d = m33370d(file);
            int a = m33356a(bxuc.m123417a(d, f42700a));
            d.close();
            return a;
        } catch (IOException e) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Error counting log events in file ") : "Error counting log events in file ".concat(valueOf), e);
            return 0;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    private static InputStream m33370d(File file) {
        List c = f42703k.mo66925c((CharSequence) file.getName());
        if (c.isEmpty()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Empty file name:") : "Empty file name:".concat(valueOf));
        } else if (c.size() > 2) {
            String valueOf2 = String.valueOf(file.getAbsolutePath());
            throw new FlatFileLogStore$InvalidLogFileNameException(valueOf2.length() == 0 ? new String("Invalid log file name: ") : "Invalid log file name: ".concat(valueOf2));
        } else if (c.size() == 1) {
            return new FileInputStream(file);
        } else {
            try {
                if (rcu.m33345a((String) c.get(1)) - 1 != 0) {
                    return new GZIPInputStream(new FileInputStream(file));
                }
                return new FileInputStream(file);
            } catch (IllegalArgumentException e) {
                String valueOf3 = String.valueOf((String) c.get(1));
                throw new IOException(valueOf3.length() == 0 ? new String("Unsupported compression algorithm: ") : "Unsupported compression algorithm: ".concat(valueOf3), e);
            }
        }
    }

    /* renamed from: e */
    private static ByteString m33371e(File file) {
        InputStream d;
        ByteString bxtx;
        InputStream d2 = m33370d(file);
        try {
            ArrayList arrayList = new ArrayList();
            int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = new byte[i];
                    int i3 = 0;
                    while (i3 < i) {
                        int read = d2.read(bArr, i3, i - i3);
                        if (read == -1) {
                            break;
                        }
                        i3 += read;
                    }
                    if (i3 != 0) {
                        bxtx = bxtx.m123262a(bArr, 0, i3);
                    } else {
                        bxtx = null;
                    }
                    if (bxtx != null) {
                        i2 += bxtx.mo73744a();
                        arrayList.add(bxtx);
                        i = Math.min(i + i, 8192);
                    }
                } catch (EOFException e) {
                    try {
                        d = m33370d(file);
                        d.skip((long) i2);
                        byte[] bArr2 = new byte[1];
                        while (d.read(bArr2, 0, 1) != -1) {
                            arrayList.add(bxtx.m123261a(bArr2));
                        }
                        d.close();
                    } catch (EOFException e2) {
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                } catch (Throwable th2) {
                    d.close();
                    throw th2;
                }
                break;
            }
            ByteString a = bxtx.m123257a(arrayList);
            d2.close();
            return a;
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        throw th;
    }

    public final void close() {
        synchronized (this.f42704b) {
            mo24503g();
        }
    }

    /* renamed from: f */
    public final Map mo24502f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f42704b) {
            for (File file : m33366b(this.f42712m)) {
                caik caik = (caik) this.f42716q.get(new File(file, "play_logger_context.pb").getAbsolutePath());
                if (caik != null) {
                    Iterator it = rcz.m33351a(file).iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        File a = ((rcy) it).next();
                        if (!a.getName().equals("play_logger_context.pb")) {
                            j += mo24480a(a.length());
                        }
                    }
                    hashMap.put(caik, new rdh(j));
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo24503g() {
        this.f42708f.evictAll();
        this.f42709g.evictAll();
    }

    /* renamed from: h */
    public final rdi mo24504h() {
        return new rdc(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ff, code lost:
        r22.close();
     */
    /* renamed from: i */
    public final rdj mo24505i() {
        Object obj;
        rdd rdd;
        Throwable th;
        long j;
        int i;
        int i2;
        rcr rcr;
        String str;
        File file;
        rdm rdm;
        String name;
        rdj rdj = new rdj();
        Object obj2 = this.f42704b;
        synchronized (obj2) {
            try {
                mo24503g();
                rcr rcr2 = new rcr(this, mo24490b() - cddx.m132739c());
                int i3 = 1;
                long l = m33372l();
                int i4 = 0;
                boolean z = false;
                while (true) {
                    int i5 = i4 + 1;
                    long j2 = rcr2.f42653b;
                    rdd rdd2 = new rdd(this);
                    try {
                        for (File file2 : m33366b(this.f42712m)) {
                            if (i5 != i3) {
                                j = j2;
                            } else {
                                file = new File(file2, "play_logger_context.pb");
                                try {
                                    int a = m33357a(mo24494b(file));
                                    name = file.getParentFile().getName();
                                    if (a != Integer.parseInt(name)) {
                                        rdm = rcv.PLC_HASH_MISMATCH;
                                    } else if (((caik) this.f42716q.get(file.getAbsolutePath())) == null) {
                                        rdm = rcv.FAIL_TO_PARSE_PLC_PROTO;
                                    } else {
                                        rdm = null;
                                    }
                                } catch (NumberFormatException e) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 26);
                                    sb.append("Failed to convert ");
                                    sb.append(name);
                                    sb.append(" to int.");
                                    Log.e("FlatFileLogStore", sb.toString(), e);
                                    rdm = rcv.FAIL_TO_PARSE_PLC_DIR_NAME;
                                } catch (Throwable th2) {
                                    th = th2;
                                    rdd = rdd2;
                                    obj = obj2;
                                }
                                if (rdm != null) {
                                    long j3 = j2;
                                    rcr2.mo24462a(m33360a(rdd2, file2, rdj, file, rdm));
                                    j2 = j3;
                                } else {
                                    j = j2;
                                }
                            }
                            String[] a2 = m33365a(file2.list());
                            int length = a2.length;
                            if (length <= i3) {
                                rdd2.f42696a.add(file2);
                                j2 = j;
                            } else {
                                int i6 = 0;
                                while (i6 < length) {
                                    String str2 = a2[i6];
                                    if (str2.equals("play_logger_context.pb")) {
                                        i = length;
                                        i2 = i5;
                                        rdd = rdd2;
                                        rcr = rcr2;
                                        obj = obj2;
                                    } else {
                                        i2 = i5;
                                        rdd = rdd2;
                                        i = length;
                                        rcr = rcr2;
                                        obj = obj2;
                                        try {
                                            long a3 = m33358a(rdd2, l, file2, str2, !z, rdj);
                                            if (a3 != -1) {
                                                rcr.mo24462a(a3);
                                            } else if (rcr.f42653b > 0) {
                                                int indexOf = str2.indexOf(46);
                                                if (indexOf != -1) {
                                                    str = str2.substring(0, indexOf);
                                                } else {
                                                    str = str2;
                                                }
                                                long parseLong = Long.parseLong(str);
                                                if (rcr.f42653b <= rcr.f42654c || rcr.size() >= 1500) {
                                                    if (!rcr.isEmpty()) {
                                                        if (((rcq) rcr.peek()).f42650a <= parseLong) {
                                                        }
                                                    }
                                                }
                                                long a4 = rcr.f42655d.mo24480a(new File(file2, str2).length());
                                                rcr.add(new rcq(parseLong, a4));
                                                rcr.f42652a = Math.max(rcr.f42652a, (long) rcr.size());
                                                rcr.f42654c += a4;
                                                rcr.mo24461a();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            rdd.close();
                                            throw th;
                                        }
                                    }
                                    i6++;
                                    rcr2 = rcr;
                                    obj2 = obj;
                                    i5 = i2;
                                    rdd2 = rdd;
                                    length = i;
                                }
                                j2 = j;
                                rdd2 = rdd2;
                                i3 = 1;
                            }
                        }
                        long j4 = j2;
                        int i7 = i5;
                        rdd rdd3 = rdd2;
                        rcr rcr3 = rcr2;
                        obj = obj2;
                        if (rcr3.isEmpty()) {
                            break;
                        }
                        l = ((rcq) rcr3.peek()).f42650a + 1;
                        rcr3.clear();
                        if (j4 <= rcr3.f42653b) {
                            if (i7 != 1) {
                                break;
                            }
                        }
                        try {
                            rdd3.close();
                            if (rcr3.f42653b <= 0 || i7 >= 100) {
                                break;
                            }
                            rcr2 = rcr3;
                            obj2 = obj;
                            i4 = i7;
                            i3 = 1;
                            z = true;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } catch (IOException e2) {
                        IOException iOException = e2;
                        String valueOf = String.valueOf(file.getAbsolutePath());
                        Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Failed to read PLC file ") : "Failed to read PLC file ".concat(valueOf), iOException);
                        rdm = rcv.FAIL_TO_READ_PLC_FILE.mo24468a(iOException);
                    } catch (Throwable th5) {
                        th = th5;
                        rdd = rdd2;
                        obj = obj2;
                        th = th;
                        rdd.close();
                        throw th;
                    }
                }
                return rdj;
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final bnhe mo24506j() {
        bnhe b;
        synchronized (this.f42705c) {
            bnha h = bnhe.m109414h();
            SharedPreferences sharedPreferences = this.f42706d.getSharedPreferences("LogDropPref", 0);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                List c = f42701i.mo66925c((CharSequence) entry.getKey());
                if (c.size() == 1 && cdeb.f180572a.mo6606a().mo77326c()) {
                    h.mo67695b(new rdo("", (String) c.get(0)), (Integer) entry.getValue());
                }
                if (c.size() == 2) {
                    h.mo67695b(new rdo((String) c.get(0), (String) c.get(1)), (Integer) entry.getValue());
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            if (edit.commit()) {
                b = h.mo67618b();
            } else {
                throw new IOException("Failed to clear log drop count");
            }
        }
        return b;
    }

    /* renamed from: k */
    public final String mo24507k() {
        String str;
        int i = Build.VERSION.SDK_INT;
        if (!this.f42706d.isDeviceProtectedStorage()) {
            str = "CE";
        } else {
            str = "DE";
        }
        return str.concat("FlatFileLogStore");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m33369c(String str, long j) {
        if (this.f42717r != null) {
            if (!this.f42717r.containsKey(str)) {
                this.f42717r.put(str, new rdh());
            }
            ((rdh) this.f42717r.get(str)).f42729c += j;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: l */
    public static final long m33372l() {
        return Math.max(0L, System.currentTimeMillis() - cddx.f180554a.mo6606a().mo77314g());
    }

    /* renamed from: a */
    static int m33357a(byte[] bArr) {
        int length = bArr.length;
        int i = length & -4;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 4) {
            int i5 = ((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | (bArr[i4 + 3] << 24)) * -862048943;
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
        }
        int i7 = length & 3;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i2 = (bArr[i + 2] & 255) << 16;
                }
                int i8 = i3 ^ length;
                int i9 = (i8 ^ (i8 >>> 16)) * -2048144789;
                int i10 = (i9 ^ (i9 >>> 13)) * -1028477387;
                return i10 ^ (i10 >>> 16);
            }
            i2 |= (bArr[i + 1] & 255) << 8;
        }
        int i11 = ((bArr[i] & 255) | i2) * -862048943;
        i3 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        int i82 = i3 ^ length;
        int i92 = (i82 ^ (i82 >>> 16)) * -2048144789;
        int i102 = (i92 ^ (i92 >>> 13)) * -1028477387;
        return i102 ^ (i102 >>> 16);
    }

    /* renamed from: c */
    public final List mo24495c(String str) {
        rde rde;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        InputStream d;
        Throwable th;
        rde rde2 = this;
        ArrayList arrayList = new ArrayList();
        synchronized (rde2.f42704b) {
            mo24503g();
            rdd rdd = new rdd(rde2);
            try {
                bnre i = rde2.f42712m.listIterator();
                while (i.hasNext()) {
                    File file = new File(rde.f42707e.getAbsolutePath().concat("/").concat(Integer.toString(((cagz) i.next()).f174516f)).concat("/").concat(str));
                    if (file.isDirectory()) {
                        Iterator it = rcz.m33351a(file).iterator();
                        while (it.hasNext()) {
                            File a = ((rcy) it).next();
                            if (a.isDirectory()) {
                                caik caik = (caik) rde.f42716q.get(new File(a, "play_logger_context.pb").getAbsolutePath());
                                if (caik != null) {
                                    int i2 = caik.f174713a;
                                    if ((i2 & 2) != 0) {
                                        str2 = caik.f174714b;
                                    } else {
                                        str2 = null;
                                    }
                                    int i3 = caik.f174715c;
                                    int i4 = caik.f174716d;
                                    if ((i2 & 16) != 0) {
                                        str3 = caik.f174717e;
                                    } else {
                                        str3 = null;
                                    }
                                    if ((i2 & 32) != 0) {
                                        str4 = caik.f174718f;
                                    } else {
                                        str4 = null;
                                    }
                                    boolean z = caik.f174719g;
                                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                        str5 = caik.f174721i;
                                    } else {
                                        str5 = null;
                                    }
                                    boolean z2 = caik.f174722j;
                                    if ((i2 & 8192) != 0) {
                                        num = Integer.valueOf(caik.f174726n);
                                    } else {
                                        num = null;
                                    }
                                    PlayLoggerContext playLoggerContext = new PlayLoggerContext(str2, i3, i4, str3, str4, z, str5, z2, 0, num);
                                    Iterator it2 = rcz.m33351a(a).iterator();
                                    while (it2.hasNext()) {
                                        File a2 = ((rcy) it2).next();
                                        if (!a2.getName().equals("play_logger_context.pb")) {
                                            d = m33370d(a2);
                                            bxuc a3 = bxuc.m123416a(d);
                                            while (!a3.mo73783A()) {
                                                LogEventParcelable logEventParcelable = new LogEventParcelable(playLoggerContext, null, null, null, null, null, null, true);
                                                logEventParcelable.f30031b = a3.mo73804m();
                                                arrayList.add(logEventParcelable);
                                            }
                                            rdd.mo24477a(a2);
                                            d.close();
                                        }
                                    }
                                    rde = this;
                                } else {
                                    rde = this;
                                }
                            } else {
                                rde = this;
                            }
                        }
                        rde2 = this;
                    } else {
                        rde2 = this;
                    }
                }
                rdd.close();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                try {
                    rdd.close();
                } catch (Throwable th4) {
                    bqye.m113761a(th3, th4);
                }
                throw th3;
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: a */
    public static final long m33358a(rdd rdd, long j, File file, String str, boolean z, rdj rdj) {
        String str2;
        rdd rdd2 = rdd;
        long j2 = j;
        File file2 = file;
        String str3 = str;
        rdj rdj2 = rdj;
        int indexOf = str3.indexOf(46);
        if (indexOf != -1) {
            try {
                str2 = str3.substring(0, indexOf);
            } catch (NumberFormatException e) {
                return m33359a(rdd2, file2, str3, rdj2);
            }
        } else {
            str2 = str3;
        }
        long parseLong = Long.parseLong(str2);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str3.indexOf(46, i) != -1) {
                return m33359a(rdd2, file2, str3, rdj2);
            }
            try {
                rcu.m33345a(str3.substring(i));
            } catch (IllegalArgumentException e2) {
                return m33359a(rdd2, file2, str3, rdj2);
            }
        }
        if (parseLong >= j2) {
            return -1;
        }
        File file3 = new File(file2, str3);
        long length = file3.length();
        int c = m33368c(file3);
        if (rdd2.mo24478a(file3, file.getParentFile().getName(), !z ? rdl.OVERSIZE : rcv.LOG_FILE_TOO_OLD, c)) {
            if (rdj2 != null) {
                if (z) {
                    rdj2.f42730a += length;
                    rdj2.f42734e += (long) c;
                    if (cddx.f180554a.mo6606a().mo77313f()) {
                        Date date = new Date(parseLong);
                        Date date2 = new Date(j2);
                        Date date3 = new Date(System.currentTimeMillis());
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                        try {
                            rdn rdn = new rdn(file.getParentFile().getName(), Long.parseLong(simpleDateFormat.format(date)), Long.parseLong(simpleDateFormat.format(date2)), Long.parseLong(simpleDateFormat.format(date3)));
                            if (!rdj2.f42738i.containsKey(rdn)) {
                                rdj2.f42738i.put(rdn, 1L);
                            } else {
                                Map map = rdj2.f42738i;
                                map.put(rdn, Long.valueOf(((Long) map.get(rdn)).longValue() + 1));
                            }
                        } catch (NumberFormatException e3) {
                            Log.e("FlatFileLogStore", "Failed to parse epoch time to date integer.", e3);
                        }
                    }
                } else {
                    rdj2.f42735f += (long) c;
                    rdj2.f42731b += length;
                }
            }
            return length;
        }
        Log.e("FlatFileLogStore", String.valueOf(file3.getAbsolutePath()).concat(" could not be deleted."));
        return 0;
    }

    /* renamed from: b */
    private static rct m33367b(bxuc bxuc) {
        long j = Long.MIN_VALUE;
        long j2 = Long.MIN_VALUE;
        while (true) {
            int a = bxuc.mo73786a();
            if (a != 0) {
                int b = bxzh.m124563b(a);
                if (b == 17) {
                    j = bxuc.mo73794e();
                } else if (b != 22) {
                    bxuc.mo73789b(a);
                } else {
                    j2 = bxuc.mo73794e();
                }
                if (j2 != Long.MIN_VALUE && j != Long.MIN_VALUE) {
                    return new rct(j2, j);
                }
            } else if (j != Long.MIN_VALUE) {
                return new rct(0, j);
            } else {
                return null;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo24498d() {
        long b = mo24490b();
        long c = cddx.m132739c();
        return b > c + c;
    }

    /* renamed from: d */
    public final int[] mo24499d(String str) {
        SharedPreferences sharedPreferences = this.f42706d.getSharedPreferences("TestCodePref", 0);
        synchronized (this.f42711l) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString(str, "");
            if (string.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : f42701i.mo66918a((CharSequence) string)) {
                Integer a = bqcn.m112582a(str2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            edit.remove(str);
            if (!edit.commit()) {
                String valueOf = String.valueOf(str);
                Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Failed to remove test codes for ") : "Failed to remove test codes for ".concat(valueOf));
            }
            int[] a2 = bqcn.m112584a(arrayList);
            return a2;
        }
    }

    /* renamed from: e */
    public final long mo24500e() {
        bnre i = this.f42712m.listIterator();
        long j = 0;
        while (i.hasNext()) {
            File file = new File(this.f42707e, Integer.toString(((cagz) i.next()).f174516f));
            if (file.isDirectory()) {
                Iterator it = rcz.m33351a(file).iterator();
                while (it.hasNext()) {
                    File a = ((rcy) it).next();
                    if (a.isDirectory()) {
                        j += (long) m33365a(a.list()).length;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public final long mo24490b() {
        long longValue;
        if (this.f42718s != null) {
            return this.f42718s.longValue();
        }
        synchronized (this.f42704b) {
            if (this.f42718s == null) {
                long j = 0;
                for (File file : m33366b(this.f42712m)) {
                    Iterator it = rcz.m33351a(file).iterator();
                    while (it.hasNext()) {
                        File a = ((rcy) it).next();
                        if (!a.getName().equals("play_logger_context.pb")) {
                            j += mo24480a(a.length());
                        }
                    }
                }
                this.f42718s = Long.valueOf(j);
            }
            longValue = this.f42718s.longValue();
        }
        return longValue;
    }

    /* renamed from: e */
    public final int[] mo24501e(String str) {
        rch rch = this.f42713n;
        try {
            cahj cahj = cahj.f174548b;
            str.getClass();
            bxww bxww = ((cahh) bqhi.m112838a(rch.f42639a.mo60776a())).f174547a;
            if (bxww.containsKey(str)) {
                cahj = (cahj) bxww.get(str);
            }
            bxvt bxvt = cahj.f174550a;
            bqhi.m112838a(rch.f42639a.mo60777a(new rcg(str), bqfb.INSTANCE));
            return bqcn.m112584a(bxvt);
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        return r1;
     */
    /* renamed from: b */
    public final long mo24491b(String str) {
        synchronized (this.f42704b) {
            if (this.f42717r == null || !this.f42717r.containsKey(str)) {
                if (this.f42717r == null) {
                    mo24496c();
                }
                rdh rdh = (rdh) this.f42717r.get(str);
                long j = rdh != null ? rdh.f42727a : 0;
            } else {
                long j2 = ((rdh) this.f42717r.get(str)).f42727a;
                return j2;
            }
        }
    }

    /* renamed from: c */
    public final Map mo24496c() {
        synchronized (this.f42704b) {
            if (this.f42717r == null) {
                HashMap hashMap = new HashMap();
                for (File file : m33366b(this.f42712m)) {
                    String name = file.getParentFile().getName();
                    if (!hashMap.containsKey(name)) {
                        hashMap.put(name, new rdh());
                    }
                    rdh rdh = (rdh) hashMap.get(name);
                    rdh.f42728b++;
                    Iterator it = rcz.m33351a(file).iterator();
                    while (it.hasNext()) {
                        File a = ((rcy) it).next();
                        if (!a.getName().equals("play_logger_context.pb")) {
                            rdh.f42729c++;
                            rdh.f42727a += mo24480a(a.length());
                        }
                    }
                }
                this.f42717r = hashMap;
                HashMap hashMap2 = new HashMap(this.f42717r);
                return hashMap2;
            }
            HashMap hashMap3 = new HashMap(this.f42717r);
            return hashMap3;
        }
    }

    /* renamed from: b */
    public final void mo24492b(String str, long j) {
        if (this.f42717r != null) {
            if (!this.f42717r.containsKey(str)) {
                this.f42717r.put(str, new rdh());
            }
            ((rdh) this.f42717r.get(str)).f42728b += j;
            if (((rdh) this.f42717r.get(str)).equals(new rdh())) {
                this.f42717r.remove(str);
            }
        }
    }

    /* renamed from: a */
    private static final long m33359a(rdd rdd, File file, String str, rdj rdj) {
        File file2 = new File(file, str);
        long length = file2.length();
        if (!rdd.mo24478a(file2, file.getParentFile().getName(), rcv.CORRUPTED_LOG_FILE_NAME, 1)) {
            return 0;
        }
        if (rdj != null) {
            rdj.f42737h++;
        }
        return length;
    }

    /* renamed from: b */
    public final void mo24493b(int[] iArr, String str, Collection collection) {
        rch rch = this.f42713n;
        HashMap hashMap = new HashMap();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!str2.equals(str)) {
                    cahi cahi = (cahi) cahj.f174548b.mo74144da();
                    cahj cahj = cahj.f174548b;
                    str2.getClass();
                    bxww bxww = ((cahh) rch.f42639a.mo60776a().get()).f174547a;
                    if (bxww.containsKey(str2)) {
                        cahj = (cahj) bxww.get(str2);
                    }
                    cahi.mo74645a(cahj.f174550a);
                    cahi.mo74645a(bqcn.m112586b(iArr));
                    hashMap.put(str2, (cahj) cahi.mo74062i());
                }
            }
            rch.f42639a.mo60777a(new rcf(hashMap), bqfb.INSTANCE).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("DimensionStore", "Failed to accumulate dimensions to dimension storage.", e);
        }
    }

    /* renamed from: a */
    private final long m33360a(rdd rdd, File file, rdj rdj, File file2, rdm rdm) {
        rdj rdj2 = rdj;
        String name = file.getParentFile().getName();
        Iterator it = rcz.m33351a(file).iterator();
        long j = 0;
        while (it.hasNext()) {
            File a = ((rcy) it).next();
            if (!a.getName().equals("play_logger_context.pb")) {
                long length = a.length();
                int c = m33368c(a);
                if (rdd.mo24478a(a, file.getParentFile().getName(), rdm, c)) {
                    j += mo24480a(length);
                    if (rdj2 != null) {
                        rdj2.f42736g += (long) c;
                        rdj2.f42732c += length;
                    }
                }
            }
        }
        if (!file2.delete()) {
            Log.e("FlatFileLogStore", String.valueOf(file2.getAbsolutePath()).concat(" could not be deleted."));
        }
        if (!file.delete()) {
            Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
        } else {
            if (rdj2 != null) {
                rdj2.f42733d++;
            }
            mo24492b(name, -1);
        }
        return j;
    }

    /* renamed from: a */
    static rdb m33361a(File file) {
        InputStream d;
        String name = file.getName();
        try {
            d = m33370d(file);
            int i = f42700a;
            bxuc a = bxuc.m123417a(d, i + i);
            a.mo73791c(a.mo73805n());
            rdb rdb = new rdb(name, m33367b(a));
            d.close();
            return rdb;
        } catch (IOException e) {
            Log.e("FlatFileLogStore", "Can't get boot count and uptime from log event.", e);
            return new rdb(name, null);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final byte[] mo24494b(File file) {
        FileInputStream fileInputStream;
        try {
            return bobi.m111041b(file);
        } catch (ClosedByInterruptException e) {
            Thread.currentThread().interrupt();
            fileInputStream = new FileInputStream(file);
            byte[] a = boav.m111020a(fileInputStream);
            fileInputStream.close();
            return a;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x00e2 A[EDGE_INSN: B:106:0x00e2->B:40:0x00e2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc A[Catch:{ EOFException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ EOFException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ EOFException -> 0x010c }, LOOP:2: B:23:0x0095->B:39:0x00cd, LOOP_END] */
    /* renamed from: a */
    static rdf m33362a(cafw cafw, rdb rdb, File file) {
        Throwable th;
        rct rct;
        cafv cafv;
        int i;
        Throwable th2;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        cafw cafw2 = cafw;
        rdb rdb2 = rdb;
        File file2 = file;
        boolean d = cddx.m132740d();
        if (!(cafw2 == null || cafw2.f173025a.size() <= 0 || (rct = rdb2.f42693b) == null)) {
            long j = 0;
            if (rct.f42657a != 0) {
                cafv cafv2 = (cafv) cafw2.f173025a.get(cafw2.f173025a.size() - 1);
                if (rdb2.f42693b.compareTo(new rct((long) cafv2.f173019b, cafv2.f173020c)) < 0) {
                    int i5 = 0;
                    do {
                        cafv = (cafv) cafw2.f173025a.get(i5);
                        if (rdb2.f42693b.compareTo(new rct((long) cafv.f173019b, cafv.f173020c)) < 0) {
                            break;
                        }
                        i5++;
                    } while (i5 < cafw2.f173025a.size());
                    bxtv m = ByteString.m123270m();
                    bxuk a = bxuk.m123634a(m);
                    InputStream d2 = m33370d(file);
                    try {
                        int i6 = f42700a;
                        bxuc a2 = bxuc.m123417a(d2, i6 + i6);
                        a.mo73867c(a2.mo73795e(a2.mo73805n()));
                        byte[] bArr2 = null;
                        int i7 = 1;
                        rct rct2 = null;
                        while (true) {
                            if (bArr2 == null) {
                                try {
                                    if (a2.mo73783A()) {
                                        break;
                                    }
                                } catch (EOFException e) {
                                    i4 = i;
                                }
                            }
                            while (true) {
                                if (cafv == null || rct2 == null) {
                                    i2 = i;
                                } else {
                                    i2 = i;
                                    try {
                                        if (rct2.f42657a != j) {
                                            bArr = bArr2;
                                            if (rct2.compareTo(new rct((long) cafv.f173019b, cafv.f173020c)) >= 0) {
                                                bArr2 = bArr;
                                                break;
                                            }
                                            if (bArr != null) {
                                                bArr2 = bArr;
                                            } else {
                                                a.mo73867c(bArr);
                                                i7++;
                                                bArr2 = null;
                                            }
                                            if (!a2.mo73783A()) {
                                                break;
                                            }
                                            bArr2 = a2.mo73795e(a2.mo73805n());
                                            rct2 = m33367b(bxuc.m123419a(bArr2));
                                            i = i2;
                                            j = 0;
                                        }
                                    } catch (EOFException e2) {
                                        i3 = i2;
                                    }
                                }
                                bArr = bArr2;
                                if (bArr != null) {
                                }
                                if (!a2.mo73783A()) {
                                }
                            }
                            if (cafv == null) {
                                i = i2;
                                j = 0;
                            } else {
                                a.mo73838a(cafv.f173022e);
                                int i8 = i2 + 1;
                                try {
                                    if (i8 >= cafw2.f173025a.size()) {
                                        i = i8;
                                        cafv = null;
                                        j = 0;
                                    } else {
                                        cafv = (cafv) cafw2.f173025a.get(i8);
                                        i = i8;
                                        j = 0;
                                    }
                                } catch (EOFException e3) {
                                    i3 = i8;
                                }
                            }
                        }
                        i4 = i;
                        i3 = i4;
                        d2.close();
                        while (i3 < cafw2.f173025a.size()) {
                            a.mo73838a(((cafv) cafw2.f173025a.get(i3)).f173022e);
                            i3++;
                        }
                        a.mo73851c();
                        if (d) {
                            return new rdf(file2, m.mo73765a(), i7);
                        }
                        return new rdf(file2, m.mo73765a(), 1);
                    } catch (Throwable th3) {
                        bqye.m113761a(th2, th3);
                    }
                }
            }
        }
        if (!cddx.f180554a.mo6606a().mo77308a()) {
            InputStream d3 = m33370d(file);
            if (d) {
                try {
                    ByteString a3 = ByteString.m123256a(d3);
                    rdf rdf = new rdf(file2, a3, m33356a(a3.mo73764h()));
                    d3.close();
                    return rdf;
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                }
            } else {
                rdf rdf2 = new rdf(file2, ByteString.m123256a(d3), 1);
                d3.close();
                return rdf2;
            }
        } else if (!d) {
            return new rdf(file2, m33371e(file), 1);
        } else {
            ByteString e4 = m33371e(file);
            return new rdf(file2, e4, m33356a(e4.mo73764h()));
        }
        throw th2;
        throw th;
    }

    /* renamed from: a */
    private static final void m33363a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo24480a(long j) {
        String str;
        long j2 = this.f42715p;
        if (j2 == 0) {
            try {
                this.f42715p = 4096;
                File absoluteFile = this.f42707e.getAbsoluteFile();
                if (!absoluteFile.exists()) {
                    str = absoluteFile.getParent();
                } else {
                    str = absoluteFile.getAbsolutePath();
                }
                if (str != null) {
                    int i = Build.VERSION.SDK_INT;
                    long j3 = Os.statvfs(str).f_frsize;
                    if (j3 >= 128 && j3 < 500000) {
                        this.f42715p = j3;
                    }
                }
                j2 = this.f42715p;
            } catch (Throwable th) {
                j2 = this.f42715p;
            }
        }
        return ((j / j2) + ((long) (j % j2 == 0 ? 0 : 1))) * j2;
    }

    /* renamed from: a */
    public final Map mo24481a(bngx bngx) {
        Set set;
        caik caik;
        String string = this.f42706d.getSharedPreferences("LogStoreUtil", 0).getString("log_source_batching_blacklist", null);
        if (string == null || string.isEmpty()) {
            set = bnon.f131923a;
        } else {
            set = bnic.m109496a((Object[]) string.split(","));
        }
        HashMap hashMap = new HashMap();
        synchronized (this.f42704b) {
            for (File file : m33366b(bngx)) {
                caik caik2 = (caik) this.f42716q.get(new File(file, "play_logger_context.pb").getAbsolutePath());
                if (caik2 != null) {
                    if (!set.contains(rer.m33480a(caik2))) {
                        bxvd da = caik.f174711o.mo74144da();
                        if ((caik2.f174713a & 512) != 0) {
                            boolean z = caik2.f174722j;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caik caik3 = (caik) da.f164949b;
                            caik3.f174713a |= 512;
                            caik3.f174722j = z;
                        }
                        if ((caik2.f174713a & 16) != 0) {
                            String str = caik2.f174717e;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caik caik4 = (caik) da.f164949b;
                            str.getClass();
                            caik4.f174713a |= 16;
                            caik4.f174717e = str;
                        }
                        if ((caik2.f174713a & 128) != 0) {
                            String str2 = caik2.f174720h;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caik caik5 = (caik) da.f164949b;
                            str2.getClass();
                            caik5.f174713a |= 128;
                            caik5.f174720h = str2;
                        }
                        if (!cdes.m132867b()) {
                            if ((caik2.f174713a & 1024) != 0) {
                                int i = caik2.f174723k;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                caik caik6 = (caik) da.f164949b;
                                caik6.f174713a |= 1024;
                                caik6.f174723k = i;
                            }
                        }
                        caik = (caik) da.mo74062i();
                    } else {
                        caik = caik2;
                    }
                    Collection collection = (Collection) hashMap.get(caik);
                    if (collection == null) {
                        collection = new ArrayList();
                        hashMap.put(caik, collection);
                    }
                    try {
                        collection.add(new rdt(caik2, Long.parseLong(file.getName())));
                    } catch (NumberFormatException e) {
                        String name = file.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25);
                        sb.append("Failed to parse ");
                        sb.append(name);
                        sb.append(" to long.");
                        Log.e("FlatFileLogStore", sb.toString(), e);
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo24482a(int i) {
        Integer num;
        try {
            num = (Integer) aucu.m76783a(this.f42719t.mo24319a(), cddj.f180527a.mo6606a().mo77287a(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("FlatFileLogStore", "Failed to get boot count.", e);
            num = null;
        }
        if (num != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            bxvf bxvf = (bxvf) cagi.f173096t.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi = (cagi) bxvf.f164949b;
            int i2 = cagi.f173098a | 1;
            cagi.f173098a = i2;
            cagi.f173099b = currentTimeMillis;
            cagi.f173098a = i2 | 2;
            cagi.f173100c = elapsedRealtime;
            int a = cagh.m126602a(i);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi2 = (cagi) bxvf.f164949b;
            int i3 = a - 1;
            if (a != 0) {
                cagi2.f173110n = i3;
                cagi2.f173098a |= 1048576;
                cagi cagi3 = (cagi) bxvf.mo74062i();
                bxvd da = cafv.f173016f.mo74144da();
                int intValue = num.intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cafv cafv = (cafv) da.f164949b;
                int i4 = cafv.f173018a | 1;
                cafv.f173018a = i4;
                cafv.f173019b = intValue;
                int i5 = i4 | 2;
                cafv.f173018a = i5;
                cafv.f173020c = elapsedRealtime;
                cafv.f173018a = i5 | 4;
                cafv.f173021d = currentTimeMillis;
                ByteString aL = cagi3.mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cafv cafv2 = (cafv) da.f164949b;
                aL.getClass();
                cafv2.f173018a |= 8;
                cafv2.f173022e = aL;
                try {
                    bqhi.m112838a(this.f42710h.mo60777a(new rco(Math.max(0L, System.currentTimeMillis() - cddx.f180554a.mo6606a().mo77311d()), new rct((long) num.intValue(), elapsedRealtime), da), bqfb.INSTANCE));
                } catch (ExecutionException e2) {
                    Log.e("FlatFileLogStore", "Failed to update Clearcut internal events.", e2);
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo24483a(String str, long j) {
        long j2;
        long a = mo24480a(Math.abs(j));
        if (this.f42718s != null) {
            long longValue = this.f42718s.longValue();
            if (j < 0) {
                j2 = -a;
            } else {
                j2 = a;
            }
            this.f42718s = Long.valueOf(longValue + j2);
        }
        if (this.f42717r != null) {
            if (!this.f42717r.containsKey(str)) {
                this.f42717r.put(str, new rdh());
            }
            rdh rdh = (rdh) this.f42717r.get(str);
            long j3 = rdh.f42727a;
            if (j < 0) {
                a = -a;
            }
            rdh.f42727a = j3 + a;
        }
    }

    /* renamed from: a */
    public final void mo24484a(String str, rdm rdm, int i) {
        rai.m33154a(str, rdm.mo24467a(), i);
        String valueOf = String.valueOf(rdm);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(",");
        sb.append(valueOf);
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.f42706d.getSharedPreferences("LogDropPref", 0);
        synchronized (this.f42705c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(sb2, sharedPreferences.getInt(sb2, 0) + i);
            if (!edit.commit()) {
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("Failed to record ");
                sb3.append(i);
                sb3.append("dropped logs");
                Log.e("FlatFileLogStore", sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo24485a(Collection collection) {
        synchronized (this.f42704b) {
            rdd rdd = new rdd(this);
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bnre i = ((rdg) it.next()).f42725c.listIterator();
                    while (i.hasNext()) {
                        File file = ((rdf) i.next()).f42720a;
                        if (file != null) {
                            rdd.mo24477a(file);
                        }
                    }
                }
                rdd.close();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final void mo24486a(int[] iArr, String str, Collection collection) {
        SharedPreferences sharedPreferences = this.f42706d.getSharedPreferences("TestCodePref", 0);
        synchronized (this.f42711l) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!str2.equals(str)) {
                    HashSet hashSet = new HashSet();
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                    String string = sharedPreferences.getString(str2, "");
                    if (!string.isEmpty()) {
                        for (String str3 : f42701i.mo66918a((CharSequence) string)) {
                            Integer a = bqcn.m112582a(str3);
                            if (a != null) {
                                hashSet.add(a);
                            }
                        }
                    }
                    edit.putString(str2, bmxr.m108544a(",").mo66874a((Iterable) hashSet));
                }
            }
            if (!edit.commit()) {
                Log.e("FlatFileLogStore", "Failed to persist test codes.");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24487a() {
        File file = new File(this.f42707e, Integer.toString(3));
        if (!file.isDirectory()) {
            return false;
        }
        Iterator it = rcz.m33351a(file).iterator();
        while (it.hasNext()) {
            File a = ((rcy) it).next();
            if (a.isDirectory() && m33365a(a.list()).length > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r25v0, types: [boolean], assign insn: PHI: (r25v0 ?) = (r25v1 ?), (r25v2 ?) binds: [B:139:0x0300, B:137:?] */
    /* JADX WARN: Type inference failed for: r25v1, assign insn: 0x0304: CONST  (r25v1 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r25v2, assign insn: 0x02ac: CONST  (r25v2 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, boolean):void throws java.io.IOException}
     arg types: [java.io.FileOutputStream, int]
     candidates:
      ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, int):void throws java.io.IOException}
      ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, boolean):void throws java.io.IOException} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0396, code lost:
        if (r1.f42682f >= p000.cddx.f180554a.mo6606a().mo77321n()) goto L_0x0398;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0235 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0236 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0285 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0292 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* renamed from: a */
    public final boolean mo24488a(caik caik, ByteString bxtx) {
        int i;
        Object obj;
        boolean z;
        ? r25;
        String str;
        int i2;
        rdd rdd;
        Throwable th;
        Object obj2;
        File file;
        long j;
        long j2;
        OutputStream outputStream;
        rcx rcx;
        rdd rdd2;
        rdd rdd3;
        Throwable th2;
        caik caik2 = caik;
        String a = rer.m33480a(caik);
        try {
            i = rcu.m33345a(cddx.f180554a.mo6606a().mo77309b());
            int i3 = Build.VERSION.SDK_INT;
        } catch (IllegalArgumentException e) {
            i = 1;
        }
        int i4 = Build.VERSION.SDK_INT;
        Trace.beginSection("Clearcut flat file serialize PLC proto");
        byte[] k = caik.serializeToBytes();
        if (k == null) {
            mo24484a(a, rcv.PLC_TO_BYTES_FAIL, 1);
            return false;
        }
        int i5 = Build.VERSION.SDK_INT;
        Trace.endSection();
        int a2 = m33357a(k);
        File file2 = new File(this.f42707e.getAbsolutePath().concat("/").concat(Integer.toString(caik2.f174723k)).concat("/").concat(a).concat("/").concat(String.valueOf(a2)));
        File file3 = new File(file2, "play_logger_context.pb");
        Object obj3 = this.f42704b;
        synchronized (obj3) {
            try {
                if (file2.exists() && m33365a(file2.list()).length > 0 && !file3.exists()) {
                    LruCache lruCache = this.f42708f;
                    Integer valueOf = Integer.valueOf(a2);
                    lruCache.remove(valueOf);
                    this.f42709g.remove(valueOf);
                    rdd rdd4 = new rdd(this);
                    try {
                        rdd3 = rdd4;
                        try {
                            m33360a(rdd4, file2, null, file3, rcv.DIR_HAS_NO_PLC_FILE);
                            rdd3.close();
                            if (file2.exists()) {
                                mo24484a(a, rcv.FAIL_TO_DELETE_PLC_DIR, 1);
                                return false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            rdd3.close();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        rdd3 = rdd4;
                        th2 = th;
                        rdd3.close();
                        throw th2;
                    }
                }
                LruCache lruCache2 = this.f42708f;
                Object valueOf2 = Integer.valueOf(a2);
                rcx rcx2 = (rcx) lruCache2.get(valueOf2);
                IOException iOException = null;
                if (rcx2 == null) {
                    z = false;
                } else if (!caik2.equals(rcx2.f42679c)) {
                    mo24484a(a, rcv.PLC_HASH_COLLISION, 1);
                    return false;
                } else {
                    if (rcx2.f42678b.getName().endsWith(rcu.m33346a(i))) {
                        if (rcx2.f42682f <= cddx.m132738b()) {
                            z = true;
                        }
                    }
                    this.f42708f.remove(valueOf2);
                    this.f42709g.remove(valueOf2);
                    rcx2 = null;
                    z = true;
                }
                if (rcx2 != null) {
                    obj = obj3;
                    i2 = a2;
                    str = a;
                    r25 = 1;
                } else if (this.f42714o == null || file2.getCanonicalPath().startsWith(this.f42714o)) {
                    if (!file2.exists()) {
                        if (file2.mkdirs()) {
                            mo24492b(a, 1);
                        } else {
                            throw new FlatFileLogStore$CantCreateDirException(String.format(Locale.US, "Creating PlcHash directory '%s/%s/%s' failed.", Integer.valueOf(caik2.f174723k), a, valueOf2));
                        }
                    }
                    if (z) {
                        obj2 = valueOf2;
                    } else if (file3.exists()) {
                        byte[] b = mo24494b(file3);
                        if (Arrays.equals(b, k)) {
                            obj2 = valueOf2;
                        } else if (m33357a(b) != a2) {
                            rdd rdd5 = new rdd(this);
                            try {
                                rdd2 = rdd5;
                                Object obj4 = valueOf2;
                                try {
                                    m33360a(rdd5, file2, null, file3, rcv.CORRUPTED_PLC_FILE);
                                    rdd2.close();
                                    if (file2.exists()) {
                                        mo24484a(a, rcv.FAIL_TO_DELETE_PLC_DIR, 1);
                                        return false;
                                    } else if (file2.mkdirs()) {
                                        mo24492b(a, 1);
                                        m33363a(file3, k);
                                        obj2 = obj4;
                                    } else {
                                        throw new FlatFileLogStore$CantCreateDirException(String.format(Locale.US, "Creating PlcHash directory '%s/%s/%s' failed.", Integer.valueOf(caik2.f174723k), a, obj4));
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    Throwable th6 = th;
                                    try {
                                        rdd2.close();
                                    } catch (Throwable th7) {
                                        bqye.m113761a(th6, th7);
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                rdd2 = rdd5;
                                Throwable th62 = th;
                                rdd2.close();
                                throw th62;
                            }
                        } else {
                            mo24484a(a, rcv.PLC_HASH_COLLISION, 1);
                            return false;
                        }
                    } else {
                        obj2 = valueOf2;
                        m33363a(file3, k);
                    }
                    rda rda = (rda) this.f42709g.remove(obj2);
                    if (rda != null) {
                        file = new File(file2, rda.f42690a);
                        if (file.exists() && rda.f42690a.endsWith(rcu.m33346a(i))) {
                            j2 = mo24480a(file.length());
                            j = rda.f42691b;
                            if (file != null) {
                                String a3 = rcu.m33346a(i);
                                long currentTimeMillis = System.currentTimeMillis();
                                String valueOf3 = String.valueOf(currentTimeMillis);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 1 + a3.length());
                                sb.append(valueOf3);
                                sb.append(".");
                                sb.append(a3);
                                File file4 = new File(file2, sb.toString());
                                while (file4.exists()) {
                                    currentTimeMillis++;
                                    String valueOf4 = String.valueOf(currentTimeMillis);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 1 + a3.length());
                                    sb2.append(valueOf4);
                                    sb2.append(".");
                                    sb2.append(a3);
                                    a2 = a2;
                                    a = a;
                                    file4 = new File(file2, sb2.toString());
                                    obj3 = obj3;
                                }
                                m33369c(file2.getParentFile().getName(), 1);
                                file = file4;
                            }
                            if (i - 1 == 0) {
                                outputStream = new GZIPOutputStream((OutputStream) new FileOutputStream(file, true), true);
                            } else {
                                outputStream = new FileOutputStream(file, true);
                            }
                            obj = obj3;
                            File file5 = file;
                            rcx rcx3 = rcx;
                            i2 = a2;
                            r25 = 1;
                            long j3 = j;
                            String str2 = a;
                            rcx = new rcx(SystemClock.elapsedRealtime(), file5, caik, j3, j2, outputStream, bxuk.m123635a(outputStream, f42700a));
                            this.f42708f.put(Integer.valueOf(i2), rcx3);
                            str = str2;
                            rcx2 = rcx3;
                        }
                    }
                    file = null;
                    j2 = 0;
                    j = 0;
                    if (file != null) {
                    }
                    if (i - 1 == 0) {
                    }
                    obj = obj3;
                    File file52 = file;
                    rcx rcx32 = rcx;
                    i2 = a2;
                    r25 = 1;
                    long j32 = j;
                    String str22 = a;
                    try {
                        rcx = new rcx(SystemClock.elapsedRealtime(), file52, caik, j32, j2, outputStream, bxuk.m123635a(outputStream, f42700a));
                        this.f42708f.put(Integer.valueOf(i2), rcx32);
                        str = str22;
                        rcx2 = rcx32;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } else {
                    mo24484a(a, rcv.DIR_TRAVERSAL_ATTACK, 1);
                    return false;
                }
                long j4 = rcx2.f42683g;
                long j5 = rcx2.f42682f;
                int b2 = bxuk.m123640b(bxtx);
                try {
                    rcx2.f42681e.mo73838a(bxtx);
                    rcx2.f42681e.mo73851c();
                    rcx2.f42680d.flush();
                } catch (IOException e2) {
                    iOException = e2;
                }
                long a4 = mo24480a(rcx2.f42678b.length());
                rcx2.f42684h++;
                rcx2.f42682f += (long) b2;
                rcx2.f42683g = a4;
                mo24483a(str, a4 - j4);
                if (iOException != null) {
                    LruCache lruCache3 = this.f42708f;
                    Integer valueOf5 = Integer.valueOf(i2);
                    lruCache3.remove(valueOf5);
                    this.f42709g.remove(valueOf5);
                    if (j5 == 0) {
                        rdd = new rdd(this);
                        rdd.mo24477a(rcx2.f42678b);
                        rdd.close();
                    }
                    throw iOException;
                }
                if (bqbr.m112524a(rcx2.f42684h)) {
                    if (((long) rcx2.f42684h) >= cddx.f180554a.mo6606a().mo77322o()) {
                    }
                    Object[] objArr = new Object[4];
                    objArr[0] = Integer.valueOf(rcx2.f42684h);
                    objArr[r25] = Long.valueOf(rcx2.f42682f);
                    objArr[2] = str;
                    objArr[3] = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - rcx2.f42677a));
                    Log.w("FlatFileLogStore", String.format("Excessive logging: %d events, %d bytes from log source %s last %ds", objArr));
                }
                return r25;
            } catch (Throwable th10) {
                th = th10;
                obj = obj3;
                throw th;
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo24489a(String str) {
        bnre i = this.f42712m.listIterator();
        while (i.hasNext()) {
            File file = new File(this.f42707e, Integer.toString(((cagz) i.next()).f174516f));
            if (file.isDirectory()) {
                Iterator it = rcz.m33351a(file).iterator();
                while (it.hasNext()) {
                    File a = ((rcy) it).next();
                    if (a.isDirectory() && !a.getName().equals(str) && m33365a(a.list()).length > 0) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
