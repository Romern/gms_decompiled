package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.container.ConfigurationManager$IntentHandler;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: dfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfy extends dez {

    /* renamed from: i */
    private static volatile dfy f13031i = null;

    /* renamed from: q */
    private static final long f13032q = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: e */
    public final Object f13033e = new Object();

    /* renamed from: f */
    public FileInputStream f13034f;

    /* renamed from: g */
    public long f13035g = 0;

    /* renamed from: h */
    public final Set f13036h = new C1225nr();

    /* renamed from: j */
    private djz f13037j;

    /* renamed from: k */
    private dky f13038k;

    /* renamed from: l */
    private dky f13039l;

    /* renamed from: m */
    private BroadcastReceiver f13040m;

    /* renamed from: n */
    private boolean f13041n = false;

    /* renamed from: o */
    private int f13042o = 0;

    /* renamed from: p */
    private volatile dfv f13043p;

    public dfy(Context context) {
        super(context, "current_config.fb");
    }

    /* renamed from: a */
    private final Pair m8328a(djz djz, dky dky, List list, List list2, List list3, dky dky2, String str, String str2, dky dky3, dky dky4, Map map) {
        int i;
        dja dja = new dja(this.f12990a.getPackageName());
        dky a = dja.mo9122a(this.f12990a, list, list2, list3, dky, dky3, dky2, map);
        bmzs.m108698a(dja.f13282m);
        List list4 = dja.f13272c;
        bmzs.m108698a(dja.f13282m);
        dmn dmn = (dmn) dja.f13283p.mo74062i();
        bmzs.m108698a(dja.f13282m);
        List unmodifiableList = Collections.unmodifiableList(dja.f13277h);
        bmzs.m108698a(dja.f13282m);
        dky dky5 = dja.f13271b;
        if (djz == null) {
            i = 281600;
        } else if (djz.getByteBuffer() != null) {
            i = (djz.getByteBuffer().remaining() * 6) / 5;
        } else {
            i = 281600;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            djz a2 = djh.m8647a(i, a, list4, dmn, str, dky4, unmodifiableList, dky2, str2, dky5);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Convert duration: ");
            sb.append(currentTimeMillis2);
            sb.toString();
            return Pair.create(a2, dky5);
        } catch (AssertionError e) {
            dgd.m8383a(this.f12990a, 32, "convert");
            throw new InvalidConfigException(e);
        }
    }

    /* renamed from: b */
    public static final diz m8333b(Context context) {
        dfq.m8314a();
        if (!cdjl.f180997a.mo6606a().mo77696b()) {
            return null;
        }
        bmyx a = bmyx.m108640a(',').mo66920b().mo66917a();
        dfq.m8314a();
        return new diz(context, a.mo66918a((CharSequence) cdjl.f180997a.mo6606a().mo77697c()));
    }

    /* renamed from: o */
    static bxvd m8335o() {
        bxvd da = dip.f13254e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dip dip = (dip) da.f164949b;
        int i = dip.f13256a | 1;
        dip.f13256a = i;
        dip.f13257b = 15;
        int i2 = i | 2;
        dip.f13256a = i2;
        dip.f13258c = 0;
        dip.f13256a = i2 | 4;
        dip.f13259d = 0;
        return da;
    }

    /* renamed from: p */
    private final void m8336p() {
        dez.m8264a(this.f12991b, "downgrade_from_config.fb").delete();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [bxwc, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* renamed from: c */
    public final dky mo8895c(djz djz) {
        synchronized (this.f13033e) {
            djz djz2 = this.f13037j;
            if (djz2 == djz) {
                dky dky = this.f13039l;
                if (dky != null) {
                    return dky;
                }
                ByteBuffer __vector_as_bytebuffer = djz2.__vector_as_bytebuffer(14, 1);
                if (__vector_as_bytebuffer == null) {
                    dky dky2 = dhz.f13199c;
                    this.f13039l = dky2;
                    return dky2;
                }
                try {
                    dky a = dky.m8762a((Iterable) ((boju) GeneratedMessageLite.m124013a(boju.f133349e, __vector_as_bytebuffer, bxus.m123743b())).f133352b, dhz.f13197a);
                    this.f13039l = a;
                    return a;
                } catch (bxwf e) {
                    throw new InvalidConfigException(e);
                }
            } else {
                throw new InvalidConfigException("module configuration is not current");
            }
        }
    }

    /* renamed from: d */
    public final dky mo8896d() {
        return mo8895c(mo8898f());
    }

    /* renamed from: e */
    public final boolean mo8897e() {
        boolean exists;
        synchronized (this.f13033e) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                exists = mo8900h().exists();
            } catch (SecurityException e) {
                return false;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return exists;
    }

    /* renamed from: f */
    public final djz mo8898f() {
        return mo8884a((dfs) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final File mo8899g() {
        return m8330a(this.f12991b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final File mo8900h() {
        return new File(this.f12991b, "current_modules_init.pb");
    }

    /* renamed from: i */
    public final void mo8901i() {
        PendingIntent a = mo8881a(0);
        if (a != null) {
            ((AlarmManager) this.f12990a.getSystemService("alarm")).cancel(a);
            a.cancel();
        }
    }

    /* renamed from: j */
    public final void mo8902j() {
        try {
            this.f12990a.startService(new Intent("com.google.android.chimera.container.MODULE_SCAN").setPackage(this.f12990a.getPackageName()));
        } catch (SecurityException e) {
        }
    }

    /* renamed from: k */
    public final void mo8903k() {
        File h = mo8900h();
        String valueOf = String.valueOf(h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Deleting config file: ");
        sb.append(valueOf);
        sb.toString();
        if (h.delete()) {
            mo8901i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo8904l() {
        return dez.m8264a(this.f12991b, "downgrade_from_config.fb").exists();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final dfv mo8905m() {
        if (!this.f12991b.exists()) {
            return null;
        }
        dfv dfv = new dfv(this, this.f12991b.getPath());
        dfv.startWatching();
        return dfv;
    }

    /* renamed from: n */
    public final bxvd mo8906n() {
        bxvd bxvd;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            byte[] a = dft.m8323a(mo8900h());
            if (a == null) {
                bxvd = m8335o();
            } else {
                dip dip = (dip) GeneratedMessageLite.m124016a(dip.f13254e, a, bxus.m123743b());
                bxvd bxvd2 = (bxvd) dip.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) dip);
                bxvd = ((dip) bxvd2.f164949b).f13257b != 15 ? m8335o() : bxvd2;
            }
        } catch (bxwf e) {
            bxvd = m8335o();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return bxvd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[SYNTHETIC, Splitter:B:16:0x0034] */
    /* renamed from: b */
    private final Closeable m8334b(boolean z) {
        RandomAccessFile randomAccessFile;
        if (z && this.f13041n) {
            return null;
        }
        try {
            randomAccessFile = new RandomAccessFile(new File(this.f12991b, ".config.lock"), "rw");
            try {
                randomAccessFile.getChannel().lock(0, Long.MAX_VALUE, z);
                if (!z) {
                    this.f13041n = true;
                }
                return randomAccessFile;
            } catch (IOException e) {
                if (randomAccessFile != null) {
                }
                return null;
            }
        } catch (IOException e2) {
            randomAccessFile = null;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e3) {
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [bngx, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* renamed from: b */
    public final dky mo8894b(djz djz) {
        synchronized (this.f13033e) {
            djz djz2 = this.f13037j;
            if (djz2 == djz) {
                dky dky = this.f13038k;
                if (dky != null) {
                    return dky;
                }
                int e = djz2.mo9180e();
                brtm brtm = new brtm();
                bngs b = bngx.m109371b(e);
                for (int i = 0; i < e; i++) {
                    this.f13037j.mo9174a(brtm, i);
                    b.mo67668c(djh.m8646a(brtm));
                }
                dky a = dky.m8762a((Iterable) b.mo67664a(), dgk.f13059a);
                this.f13038k = a;
                return a;
            }
            throw new InvalidConfigException("module configuration is not current");
        }
    }

    /* renamed from: a */
    public static dfy m8329a(Context context) {
        dfy dfy = f13031i;
        if (dfy == null) {
            synchronized (dfy.class) {
                dfy = f13031i;
                if (dfy == null) {
                    dfy = new dfy(context);
                    f13031i = dfy;
                }
            }
        }
        return dfy;
    }

    /* renamed from: a */
    static File m8330a(File file) {
        return new File(file, "current_config.fb");
    }

    /* renamed from: a */
    private static Map m8331a(djz djz, djz djz2) {
        C1223np npVar = new C1223np();
        int c = djz2.mo9177c();
        dka dka = new dka();
        dka dka2 = new dka();
        djy djy = new djy();
        djy djy2 = new djy();
        for (int i = 0; i < c; i++) {
            djz2.mo9171a(dka, i);
            String b = dka.mo9184b();
            dka dka3 = null;
            if (djz != null) {
                int c2 = djz.mo9177c();
                int i2 = 0;
                while (true) {
                    if (i2 >= c2) {
                        break;
                    }
                    djz.mo9171a(dka2, i2);
                    int compareTo = dka2.mo9184b().compareTo(b);
                    if (compareTo != 0) {
                        if (compareTo > 0) {
                            break;
                        }
                        i2++;
                    } else {
                        djz.mo9170a(djy2, dka2.mo9183R());
                        dka3 = dka2;
                        break;
                    }
                }
            }
            if (dka3 != null) {
                djz2.mo9170a(djy, dka.mo9183R());
                if (dff.m8282a(djy2, djy, true) != 0) {
                    npVar.put(b, Integer.valueOf(dka3.mo9186e()));
                }
            } else {
                npVar.put(b, -1);
            }
        }
        return npVar;
    }

    /* renamed from: a */
    private static boolean m8332a(Map map) {
        return map.containsKey("");
    }

    /* renamed from: a */
    public final PendingIntent mo8881a(int i) {
        int i2;
        Intent startIntent = IntentOperation.getStartIntent(this.f12990a, ConfigurationManager$IntentHandler.class, "com.google.android.chimera.container.NEW_MODULE_TIMEOUT");
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("chimera_retries", i);
        Context context = this.f12990a;
        if (i > 0) {
            i2 = 134217728;
        } else {
            i2 = 536870912;
        }
        return PendingIntent.getService(context, 0, startIntent, i2);
    }

    /* renamed from: a */
    public final Context mo8882a(Context context, djz djz, int i) {
        boolean z = false;
        if (i >= 0 && i < djz.mo9177c()) {
            z = true;
        }
        bmxy.m108600b(z);
        return mo8883a(context, djz, djz.mo9176b(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo8883a(Context context, djz djz, dka dka) {
        Context a;
        synchronized (this.f13033e) {
            if (djz == this.f13037j) {
                boolean z = false;
                if (dka.mo9183R() >= 0 && dka.mo9183R() < djz.mo9175b()) {
                    z = true;
                }
                bmzs.m108698a(z);
                try {
                    a = djp.m8662a().mo9140a(context, djz, dka, dfq.m8314a());
                } catch (djq e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("ChimeraCfgMgr", valueOf.length() == 0 ? new String("Module could not be loaded: ") : "Module could not be loaded: ".concat(valueOf));
                    return null;
                }
            } else {
                dgd.m8382a(this.f12990a, 14);
                throw new InvalidConfigException("module configuration is not current");
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01af A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b0 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c4 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c5 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0203 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0209 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e A[Catch:{ FileNotFoundException -> 0x0075, all -> 0x015e, all -> 0x0041, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0130 A[SYNTHETIC, Splitter:B:94:0x0130] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:145:0x0212=Splitter:B:145:0x0212, B:68:0x00e5=Splitter:B:68:0x00e5} */
    /* renamed from: a */
    public final djz mo8884a(dfs dfs) {
        boolean z;
        djz djz;
        Intent startIntent;
        boolean z2;
        Throwable th;
        FileInputStream fileInputStream;
        djz djz2;
        FileInputStream fileInputStream2;
        dfs dfs2 = dfs;
        if (!mo8638b()) {
            File g = mo8899g();
            synchronized (this.f13033e) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                boolean z3 = false;
                boolean z4 = true;
                try {
                    long lastModified = g.lastModified();
                    boolean z5 = false;
                    boolean z6 = false;
                    File file = g;
                    while (true) {
                        try {
                            if (this.f13037j != null && lastModified == this.f13035g) {
                                z = z5;
                                break;
                            }
                            FileInputStream fileInputStream3 = null;
                            try {
                                Closeable b = m8334b(z4);
                                try {
                                    fileInputStream = new FileInputStream(file);
                                    try {
                                        djz2 = dft.m8325c(fileInputStream);
                                        aytw.m84814b();
                                        this.f12993d = z4;
                                    } catch (FileNotFoundException e) {
                                        e = e;
                                    }
                                } catch (FileNotFoundException e2) {
                                    e = e2;
                                    fileInputStream = null;
                                    try {
                                        if (!mo8637a()) {
                                            File a = m8330a(dft.m8317a(dge.m8385a(this.f12990a)));
                                            FileInputStream fileInputStream4 = new FileInputStream(a);
                                            lastModified = 0;
                                            fileInputStream = fileInputStream4;
                                            z6 = true;
                                            file = a;
                                            djz2 = dft.m8325c(fileInputStream4);
                                            if (djz2.mo9168Q() != 15) {
                                            }
                                        } else {
                                            throw e;
                                        }
                                    } catch (FileNotFoundException e3) {
                                        lastModified = file.lastModified();
                                        fileInputStream2 = new FileInputStream(file);
                                        djz2 = dft.m8325c(fileInputStream2);
                                        this.f12993d = z4;
                                        fileInputStream = fileInputStream2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream3 = fileInputStream2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (b != null) {
                                        try {
                                            b.close();
                                        } catch (Throwable th4) {
                                            try {
                                                bqye.m113761a(th, th4);
                                            } catch (InvalidConfigException | FileNotFoundException e4) {
                                                e = e4;
                                                z2 = z5;
                                                try {
                                                    if (this.f13037j != null) {
                                                    }
                                                    if (this.f13042o % 25 == 5) {
                                                    }
                                                    this.f13042o++;
                                                    String valueOf = String.valueOf(e);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                                                    sb.append("Failed to read module config: ");
                                                    sb.append(valueOf);
                                                    Log.e("ChimeraCfgMgr", sb.toString());
                                                    dhb.m8472a(fileInputStream3);
                                                    this.f13035g = lastModified;
                                                    if (!(e instanceof InvalidConfigException)) {
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (z3) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e5) {
                                                e = e5;
                                                z3 = z5;
                                                try {
                                                    String valueOf2 = String.valueOf(e);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                                                    sb2.append("Failed to read module config: ");
                                                    sb2.append(valueOf2);
                                                    Log.e("ChimeraCfgMgr", sb2.toString());
                                                    dhb.m8472a(fileInputStream3);
                                                    throw new InvalidConfigException(e);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (z3) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                    }
                                    throw th;
                                }
                                if (djz2.mo9168Q() != 15) {
                                    dhb.m8472a(this.f13034f);
                                    this.f13037j = djz2;
                                    this.f13034f = fileInputStream;
                                    this.f13035g = lastModified;
                                    this.f13038k = null;
                                    this.f13039l = null;
                                    if (b != null) {
                                        try {
                                            b.close();
                                        } catch (InvalidConfigException | FileNotFoundException e6) {
                                            e = e6;
                                            fileInputStream3 = fileInputStream;
                                            z2 = true;
                                            if (this.f13037j != null) {
                                                if (mo8904l()) {
                                                    Process.killProcess(Process.myPid());
                                                }
                                            }
                                            if (this.f13042o % 25 == 5) {
                                                dgd.m8383a(this.f12990a, 11, e.getMessage());
                                            }
                                            this.f13042o++;
                                            String valueOf3 = String.valueOf(e);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
                                            sb3.append("Failed to read module config: ");
                                            sb3.append(valueOf3);
                                            Log.e("ChimeraCfgMgr", sb3.toString());
                                            dhb.m8472a(fileInputStream3);
                                            this.f13035g = lastModified;
                                            if (!(e instanceof InvalidConfigException)) {
                                                throw new InvalidConfigException(e);
                                            }
                                            throw ((InvalidConfigException) e);
                                        } catch (IOException e7) {
                                            e = e7;
                                            fileInputStream3 = fileInputStream;
                                            z3 = true;
                                            String valueOf22 = String.valueOf(e);
                                            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 30);
                                            sb22.append("Failed to read module config: ");
                                            sb22.append(valueOf22);
                                            Log.e("ChimeraCfgMgr", sb22.toString());
                                            dhb.m8472a(fileInputStream3);
                                            throw new InvalidConfigException(e);
                                        }
                                    }
                                    try {
                                        if (this.f13040m == null) {
                                            this.f13040m = new dfu(this);
                                            Context context = this.f12990a;
                                            BroadcastReceiver broadcastReceiver = this.f13040m;
                                            IntentFilter intentFilter = new IntentFilter("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                                            djz djz3 = this.f13037j;
                                            int __offset = djz3.__offset(12);
                                            context.registerReceiver(broadcastReceiver, intentFilter, __offset != 0 ? djz3.__string(__offset + djz3.bb_pos) : null, null);
                                        }
                                        if (this.f13043p == null) {
                                            this.f13043p = mo8905m();
                                        }
                                        if (z6) {
                                            z = true;
                                            break;
                                        }
                                        lastModified = file.lastModified();
                                        z4 = true;
                                        z5 = true;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        z3 = true;
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (z3) {
                                            mo8887a(this.f13037j);
                                        }
                                        throw th;
                                    }
                                } else {
                                    int Q = djz2.mo9168Q();
                                    StringBuilder sb4 = new StringBuilder(86);
                                    sb4.append("Stored Chimera config has different version (current=15, stored=");
                                    sb4.append(Q);
                                    sb4.append("), ignoring");
                                    Log.w("ChimeraCfgMgr", sb4.toString());
                                    throw new InvalidConfigException("unexpected config format");
                                }
                            } catch (InvalidConfigException | FileNotFoundException e8) {
                                e = e8;
                                z2 = z5;
                                if (this.f13037j != null) {
                                }
                                if (this.f13042o % 25 == 5) {
                                }
                                this.f13042o++;
                                String valueOf32 = String.valueOf(e);
                                StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf32).length() + 30);
                                sb32.append("Failed to read module config: ");
                                sb32.append(valueOf32);
                                Log.e("ChimeraCfgMgr", sb32.toString());
                                dhb.m8472a(fileInputStream3);
                                this.f13035g = lastModified;
                                if (!(e instanceof InvalidConfigException)) {
                                }
                            } catch (IOException e9) {
                                e = e9;
                                z3 = z5;
                                String valueOf222 = String.valueOf(e);
                                StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 30);
                                sb222.append("Failed to read module config: ");
                                sb222.append(valueOf222);
                                Log.e("ChimeraCfgMgr", sb222.toString());
                                dhb.m8472a(fileInputStream3);
                                throw new InvalidConfigException(e);
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            z3 = z5;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            if (z3) {
                            }
                            throw th;
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z) {
                        mo8887a(this.f13037j);
                        if (mo8897e() && aytw.m84815b(this.f12990a)) {
                            try {
                                if (mo8881a(0) == null && (startIntent = IntentOperation.getStartIntent(this.f12990a, ConfigurationManager$IntentHandler.class, "com.google.android.chimera.container.CHECK_MODULES_INIT")) != null) {
                                    this.f12990a.startService(startIntent);
                                }
                            } catch (SecurityException e10) {
                            }
                        }
                    }
                    if (dfs2 != null) {
                        dfs2.f13020a = this.f13035g;
                    }
                    djz = this.f13037j;
                } catch (Throwable th9) {
                    th = th9;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z3) {
                    }
                    throw th;
                }
            }
            return djz;
        }
        throw new InvalidConfigException("not migrated with user locked");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8885a(long j) {
        dfv m = mo8905m();
        if (m != null) {
            try {
                m.f13023b.clear();
                long lastModified = m.f13022a.mo8899g().lastModified();
                if (!m.f13022a.mo8904l()) {
                    if (!(lastModified == j || lastModified == 0)) {
                        m.stopWatching();
                    }
                }
                m.f13022a.mo8902j();
                m.f13023b.take();
            } catch (InterruptedException e) {
                Log.e("ChimeraCfgMgr", "Waiting for downgrade to complete interrupted");
            } catch (Throwable th) {
                m.stopWatching();
                throw th;
            }
            m.stopWatching();
        }
        Log.e("ChimeraCfgMgr", "finish waiting for safemode to complete");
    }

    /* renamed from: a */
    public final void mo8886a(dfx dfx) {
        synchronized (this.f13036h) {
            this.f13036h.add(dfx);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8887a(djz djz) {
        djp.m8662a().mo9143a(djz);
        synchronized (this.f13036h) {
            for (dfx dfx : this.f13036h) {
                if (dfx.mo8842a(djz)) {
                    Process.killProcess(Process.myPid());
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r14 == r0) goto L_0x0109;
     */
    /* renamed from: a */
    public final void mo8888a(djz djz, int i) {
        FileInputStream fileInputStream;
        Throwable th;
        brtm brtm;
        dka dka;
        int i2;
        Context context;
        brtm brtm2;
        djz djz2;
        dht a;
        djz djz3 = djz;
        File a2 = dez.m8264a(this.f12991b, "downgrade_from_config.fb");
        long lastModified = a2.lastModified();
        long uptimeMillis = SystemClock.uptimeMillis();
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        if (uptimeMillis - lastModified <= millis && (lastModified <= uptimeMillis || uptimeMillis <= millis)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            try {
                fileInputStream = new FileInputStream(a2);
                djz c = dft.m8325c(fileInputStream);
                fileInputStream.close();
                Context context2 = this.f12990a;
                brtm f = c.mo9181f();
                brtm brtm3 = new brtm();
                dka dka2 = new dka();
                int i3 = 0;
                while (i3 < f.mo69898G()) {
                    f.mo69921c(brtm3, i3);
                    c.mo9171a(dka2, brtm3.mo9290S());
                    int e2 = dka2.mo9186e();
                    int a3 = djl.m8653a(djz3, dka2.mo9184b());
                    if (a3 < e2) {
                        djy a4 = c.mo9169a(c.mo9176b(brtm3.mo9290S()).mo9183R());
                        if (!(a4.mo9149a() == 1 || (a = dht.m8526a(context2, a4)) == null)) {
                            try {
                                if (dff.m8281a(a.mo8914f(), a4) == 0) {
                                    djl.m8654a(context2, c, dka2, dmv.m8840b(f.mo69896E(), brtm3.mo69894C()), e2, a3);
                                    i2 = i3;
                                    dka = dka2;
                                    brtm = brtm3;
                                    brtm2 = f;
                                    djz2 = c;
                                    context = context2;
                                }
                            } catch (PackageManager.NameNotFoundException e3) {
                            }
                        }
                        String valueOf = String.valueOf(dka2.mo9184b());
                        if (valueOf.length() == 0) {
                            new String("Executing downgrade handler in downgrade-to config: ");
                        } else {
                            "Executing downgrade handler in downgrade-to config: ".concat(valueOf);
                        }
                        int a5 = dlb.m8783a(djz3, dka2.mo9184b());
                        if (a5 >= 0) {
                            brtm f2 = djz.mo9181f();
                            brtm brtm4 = new brtm();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= f2.mo69898G()) {
                                    break;
                                }
                                f2.mo69921c(brtm4, i4);
                                int S = brtm4.mo9290S();
                                if (S < a5) {
                                    i4++;
                                }
                            }
                            i4 = -1;
                            if (i4 >= 0) {
                                String b = dmv.m8840b(f2.mo69896E(), f2.mo69921c(new brtm(), i4).mo69894C());
                                i2 = i3;
                                dka = dka2;
                                brtm = brtm3;
                                brtm2 = f;
                                djz2 = c;
                                context = context2;
                                djl.m8654a(context2, djz, djz3.mo9176b(a5), b, dka2.mo9186e(), djz3.mo9176b(a5).mo9186e());
                            } else {
                                i2 = i3;
                                dka = dka2;
                                brtm = brtm3;
                                brtm2 = f;
                                djz2 = c;
                                context = context2;
                            }
                        } else {
                            i2 = i3;
                            dka = dka2;
                            brtm = brtm3;
                            brtm2 = f;
                            djz2 = c;
                            context = context2;
                        }
                    } else {
                        i2 = i3;
                        dka = dka2;
                        brtm = brtm3;
                        brtm2 = f;
                        djz2 = c;
                        context = context2;
                    }
                    i3 = i2 + 1;
                    c = djz2;
                    f = brtm2;
                    context2 = context;
                    dka2 = dka;
                    brtm3 = brtm;
                }
                dgd.m8383a(this.f12990a, 48, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                return;
            } catch (InvalidConfigException | IOException e4) {
                Log.e("ChimeraCfgMgr", "Failed to read downgrade-from config", e4);
                Context context3 = this.f12990a;
                String valueOf2 = String.valueOf(e4.toString());
                dgd.m8383a(context3, 49, valueOf2.length() == 0 ? new String("Read fail:") : "Read fail:".concat(valueOf2));
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            dgd.m8383a(this.f12990a, 49, "Timeout");
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8889a(Map map, int i, boolean z, boolean z2) {
        int i2 = i;
        boolean z3 = z;
        if (aytw.m84815b(this.f12990a)) {
            boolean z4 = !z2;
            StringBuilder sb = new StringBuilder(94);
            sb.append("Sending com.google.android.chimera.IntentOperation.NEW_MODULE Intents: ");
            sb.append(i2);
            sb.append(",");
            sb.append(z4);
            sb.append(",");
            sb.append(z3);
            Log.i("ChimeraCfgMgr", sb.toString());
            boolean a = m8332a(map);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                int intValue = ((Integer) entry.getValue()).intValue();
                Intent intent = new Intent(IntentOperation.ACTION_NEW_MODULE);
                if (intValue >= 0) {
                    intent.putExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, intValue);
                }
                intent.putExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, a);
                IntentOperation.startModuleIntentOperation(this.f12990a, str, intent);
            }
            if (z3) {
                PendingIntent a2 = mo8881a(3);
                if (a2 != null) {
                    try {
                        ((AlarmManager) this.f12990a.getSystemService("alarm")).setInexactRepeating(3, SystemClock.elapsedRealtime() + f13032q, f13032q, a2);
                    } catch (SecurityException e) {
                    }
                }
                Log.w("ChimeraCfgMgr", "Can't set alarm for modules init watchdog");
            }
            Intent startIntent = IntentOperation.getStartIntent(this.f12990a, ConfigurationManager$IntentHandler.class, IntentOperation.ACTION_NEW_MODULE);
            if (startIntent != null) {
                this.f12990a.startService(startIntent.putExtra("chimera_complete", i2).putExtra("chimera_full_reinit", z4));
            } else {
                Log.w("ChimeraCfgMgr", "Failed to create NEW_MODULE cleanup intent");
            }
        }
    }

    /* renamed from: a */
    public final void mo8890a(boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            dhb.m8480c(this.f12991b);
            if (z) {
                dhb.m8481d(mo8899g());
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (mo8881a(0) == null) goto L_0x001c;
     */
    /* renamed from: a */
    public final void mo8891a(boolean z, boolean z2) {
        synchronized (this.f13033e) {
            bxvd n = mo8906n();
            dip dip = (dip) n.f164949b;
            if (dip.f13258c != dip.f13259d) {
                if (z) {
                }
                dip dip2 = (dip) n.f164949b;
                int i = dip2.f13259d;
                int i2 = dip2.f13258c;
                if (i > i2) {
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Resetting bad ModulesInit (");
                    sb.append(i2);
                    sb.append("/");
                    sb.append(i);
                    sb.append(")");
                    Log.w("ChimeraCfgMgr", sb.toString());
                    if (n.f164950c) {
                        n.mo74035c();
                        n.f164950c = false;
                    }
                    dip dip3 = (dip) n.f164949b;
                    dip dip4 = dip.f13254e;
                    dip3.f13256a |= 4;
                    dip3.f13259d = 0;
                }
                int i3 = ((dip) n.f164949b).f13258c + 1;
                if (n.f164950c) {
                    n.mo74035c();
                    n.f164950c = false;
                }
                dip dip5 = (dip) n.f164949b;
                dip dip6 = dip.f13254e;
                dip5.f13256a |= 2;
                dip5.f13258c = i3;
                if (!mo8892a(n)) {
                    Log.w("ChimeraCfgMgr", "Not emitting NEW_MODULES due to failed modulesInit write");
                } else {
                    mo8889a(m8331a((djz) null, this.f13037j), i3, z2, false);
                }
            } else {
                mo8903k();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8892a(bxvd bxvd) {
        byte[] k = ((dip) bxvd.mo74062i()).serializeToBytes();
        File file = new File(this.f12991b, "pending_modules_init.pb");
        File h = mo8900h();
        if (dft.m8316a(k, file, h, false) != 0) {
            return true;
        }
        h.delete();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0264, code lost:
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0268, code lost:
        r0 = r37.mo9179d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0270, code lost:
        if (r7.size() != r0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0272, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0273, code lost:
        if (r2 >= r0) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0283, code lost:
        if (((java.lang.String) r7.get(r2)).equals(r14.mo9178c(r2)) == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0285, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028f, code lost:
        if (mo8637a() == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0297, code lost:
        if (r13.f13035g == 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        p000.dft.m8321a(r37.getByteBuffer());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        p000.dgd.m8383a(r13.f12990a, 11, r0.getMessage());
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02bd, code lost:
        if (r0.length() == 0) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bf, code lost:
        r0 = new java.lang.String("Stored Chimera config verification failed: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c5, code lost:
        r0 = "Stored Chimera config verification failed: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c9, code lost:
        android.util.Log.e("ChimeraCfgMgr", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cd, code lost:
        if (r42 != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d9, code lost:
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r3 = r15.f13026b;
        r4 = r15.f13027c;
        r0 = r15.f13028d;
        r8 = r15.f13029e;
        r17 = r24;
        r40 = r23;
        r15 = r12;
        r0 = m8328a(r37, r3, r4, r0, r8, r7, r40, r41, r10, r40, r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0317, code lost:
        r1 = (p000.djz) r0.first;
        r0 = (p000.dky) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0321, code lost:
        monitor-enter(r13.f13033e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0324, code lost:
        if (r14 == r13.f13037j) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x032a, code lost:
        if (r17.isEmpty() != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032c, code lost:
        r3 = "<no config>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x032f, code lost:
        r3 = p000.dhz.m8548a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0333, code lost:
        r5 = p000.dhz.m8548a(r40);
        r7 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 28) + java.lang.String.valueOf(r5).length());
        r7.append("Updating module config: ");
        r7.append(r3);
        r7.append(" -> ");
        r7.append(r5);
        android.util.Log.i("ChimeraCfgMgr", r7.toString());
        r3 = m8333b(r13.f12990a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x036e, code lost:
        if (r15 > 0) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0374, code lost:
        if (mo8904l() == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0376, code lost:
        if (r14 == null) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x037a, code lost:
        if (r1 != null) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x037c, code lost:
        r4 = r37.mo9181f();
        r5 = new p000.brtm();
        r6 = new p000.dka();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038f, code lost:
        if (r10 < r4.mo69898G()) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0391, code lost:
        r4.mo69921c(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039c, code lost:
        if (r5.mo9290S() < r37.mo9177c()) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x039e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a0, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a1, code lost:
        p000.bmzs.m108698a(r7);
        r14.mo9171a(r6, r5.mo9290S());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b7, code lost:
        if (p000.djl.m8653a(r1, r6.mo9184b()) < r6.mo9186e()) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b9, code lost:
        android.util.Log.e("DowngradeHelper", "isModuleDowngradeRequired true");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c0, code lost:
        if (r42 != false) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c4, code lost:
        if (r13.f13043p == null) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c7, code lost:
        r13.f13043p.stopWatching();
        r13.f13043p = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03cf, code lost:
        r4 = p000.dez.m8264a(r13.f12991b, "current_config.fb");
        r5 = p000.dez.m8264a(r13.f12991b, "downgrade_from_config.fb");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e3, code lost:
        if (r4.renameTo(r5) != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e5, code lost:
        r5.setLastModified(android.os.SystemClock.uptimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ed, code lost:
        r4.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f0, code lost:
        mo8887a(p000.djh.m8647a(1024, java.util.Collections.emptyList(), java.util.Collections.emptyList(), p000.dmn.f13549v, "", java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), "", java.util.Collections.emptyList()));
        mo8888a(r1, r15);
        m8336p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x041e, code lost:
        mo8885a(r13.f13035g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0424, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0428, code lost:
        android.util.Log.e("DowngradeHelper", "isModuleDowngradeRequired false");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0430, code lost:
        if (r42 == false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0432, code lost:
        mo8885a(r13.f13035g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0438, code lost:
        mo8888a(r1, r15);
        m8336p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043f, code lost:
        m8336p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0442, code lost:
        r13.f13037j = r1;
        r13.f13038k = r0;
        r13.f13039l = r40;
        p000.dhb.m8472a(r13.f13034f);
        r13.f13034f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0452, code lost:
        if (r42 != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        r5 = m8334b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r0 = mo8906n();
        r6 = ((p000.dip) r0.f164949b).f13258c + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0467, code lost:
        if (r0.f164950c == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x046a, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x046f, code lost:
        r7 = (p000.dip) r0.f164949b;
        r8 = p000.dip.f13254e;
        r7.f13256a |= 2;
        r7.f13258c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0481, code lost:
        if (mo8892a(r0) != false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0487, code lost:
        if (mo8638b() == false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0489, code lost:
        r15 = new java.io.File(r13.f12991b, "pending_config.fb");
        r19 = mo8899g();
        r0 = false;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0499, code lost:
        if (r10 < 2) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x049b, code lost:
        r21 = r10 + 1;
        r7 = r13.f13037j.getByteBuffer().duplicate();
        r0 = new p000.dfs();
        r7 = p000.dft.m8318a(r7, r15, r19, r0, true, true);
        r8 = r0.f13020a;
        r13.f13035g = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ba, code lost:
        if (r7 != null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04c0, code lost:
        if (r8 != 0) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r0 = p000.dft.m8325c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04d4, code lost:
        if (r0.getByteBuffer().equals(r13.f13037j.getByteBuffer()) != false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04d6, code lost:
        r13.f13037j = r0;
        r13.f13034f = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04e2, code lost:
        throw new java.io.IOException("mapped file doesn't match original buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ec, code lost:
        throw new java.io.IOException("write failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        android.util.Log.e("ChimeraCfgMgr", "Failed to write/verify config", r0);
        r13.f13035g = 0;
        r19.delete();
        p000.dhb.m8472a(r7);
        r10 = r21;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0503, code lost:
        if (r0 != false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0506, code lost:
        r13.f12993d = true;
        r0 = new java.lang.String[]{"current_config.pb", "current_features.pb"};
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0517, code lost:
        if (r10 >= 2) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0519, code lost:
        new java.io.File(r13.f12991b, r0[r10]).delete();
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0528, code lost:
        p000.aytw.m84814b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0531, code lost:
        if (p000.aytw.m84815b(r13.f12990a) == false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0533, code lost:
        r0 = p000.dft.m8317a(p000.dge.m8385a(r13.f12990a));
        r8 = new java.lang.String[]{"current_config.pb", "current_features.pb", "current_config.fb", "pending_config.fb", "current_modules_init.pb", "pending_modules_init.pb"};
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x055c, code lost:
        if (r10 >= 6) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x055e, code lost:
        new java.io.File(r0, r8[r10]).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0568, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x056b, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x056d, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x056f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0570, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0574, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r0 = new android.content.Intent("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
        r0.putExtra("last_modified_time", r13.f13035g);
        r13.f12990a.sendBroadcast(r0);
        r7 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0594, code lost:
        if (r13.f12990a.getApplicationInfo().targetSdkVersion < 26) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0597, code lost:
        r7 = r13.f12990a;
        r7.sendBroadcast(r0.setPackage(r7.getPackageName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05a4, code lost:
        r0 = m8331a(r14, r1);
        r7 = m8332a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05ac, code lost:
        if (r3 != null) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05ae, code lost:
        if (r7 == false) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        r3.mo9110a(r1, r0.keySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05b8, code lost:
        r3.mo9109a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05bb, code lost:
        if (r14 != null) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05bd, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05bf, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        mo8889a(r0, r6, true, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05c5, code lost:
        if (r10 == false) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05c7, code lost:
        p000.dgd.m8383a(r13.f12990a, 32, "main");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d1, code lost:
        p000.dgv.m8427a(r13.f12990a).mo8989g();
        p000.dgd.m8383a(r13.f12990a, 47, p000.dhz.m8548a(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05e5, code lost:
        if (r5 != null) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        r13.f13041n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05ed, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ef, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05f1, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05f2, code lost:
        if (r5 != null) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05fd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0600, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        r13.f13041n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0603, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0606, code lost:
        r13.f13041n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0609, code lost:
        mo8902j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060d, code lost:
        mo8887a(r13.f13037j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x061c, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException("Config changed while recomputing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0620, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0621, code lost:
        r1 = java.lang.String.valueOf(r38);
        r0 = java.lang.String.valueOf(r0);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 28) + java.lang.String.valueOf(r0).length());
        r5.append("Invalid module set config ");
        r5.append(r1);
        r5.append(": ");
        r5.append(r0);
        android.util.Log.i("ChimeraCfgMgr", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b2, code lost:
        if (p000.dhz.m8550a(r9, r8) == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b4, code lost:
        r0 = r15.f13026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01be, code lost:
        if (p000.dfq.m8314a().mo8870i() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c0, code lost:
        r2 = r37.mo9180e();
        r4 = new p000.brtm();
        r0 = r0.iterator();
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d3, code lost:
        if (r0.hasNext() == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d5, code lost:
        r3 = (p000.djc) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01df, code lost:
        if (r3.f13312d == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e1, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e3, code lost:
        if (r5 == r2) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e5, code lost:
        r20 = r5 + 1;
        r14.mo9174a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ee, code lost:
        if (r4.mo69931t() == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fa, code lost:
        if (r4.mo9295P().equals(r3.f13310b) == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fc, code lost:
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0208, code lost:
        if (r4.mo69929s() != r3.f13311c) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0210, code lost:
        if (r4.mo69931t() != r3.f13312d) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0218, code lost:
        if (r4.mo69932u() == r3.f13313e) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021e, code lost:
        r9 = r23;
        r8 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022c, code lost:
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0234, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023b, code lost:
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0249, code lost:
        r24 = r8;
        r23 = r9;
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024f, code lost:
        if (r0 < r2) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0252, code lost:
        r20 = r0 + 1;
        r14.mo9174a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025b, code lost:
        if (r4.mo69931t() != false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025d, code lost:
        r0 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05f4 A[SYNTHETIC, Splitter:B:260:0x05f4] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0600 A[ExcHandler: all (r0v28 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:181:0x0455] */
    /* renamed from: a */
    public final boolean mo8893a(djz djz, dfw dfw, Set set, String str, String str2, boolean z, int i, Map map) {
        int i2;
        dky dky;
        dky dky2;
        dky dky3;
        int a;
        List list;
        int i3;
        dht dht;
        djz djz2 = djz;
        dfw dfw2 = dfw;
        int i4 = i;
        Map map2 = map;
        if (!mo8638b()) {
            dfq.m8314a();
            bmyx a2 = bmyx.m108640a(',').mo66920b().mo66917a();
            bngs j = bngx.m109377j();
            j.mo67666b(a2.mo66918a((CharSequence) cdjl.f180997a.mo6606a().mo77698d()));
            aymd aymd = aymd.BUILD_TYPE_UNKNOWN;
            if (stu.m36327m().ordinal() == 12) {
                j.mo67666b(a2.mo66918a((CharSequence) cdjl.f180997a.mo6606a().mo77699e()));
            }
            bngx a3 = j.mo67664a();
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            int size = a3.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add((String) a3.get(i5));
            }
            dky b = dky.m8764b((Iterable) arrayList);
            dky dky4 = dfw2.f13025a;
            try {
                List list2 = dfw2.f13027c;
                List list3 = dfw2.f13028d;
                List list4 = dfw2.f13029e;
                ArrayList arrayList2 = new ArrayList(list2.size() + list3.size() + list4.size());
                List asList = Arrays.asList(list2, list3, list4);
                int i6 = 0;
                while (true) {
                    i2 = 5;
                    if (i6 < asList.size()) {
                        a = dim.m8578a(i6);
                        list = (List) asList.get(i6);
                        i3 = 0;
                        while (i3 < list.size()) {
                            try {
                                dht = (dht) list.get(i3);
                                din f = dht.mo8914f();
                                bxvd bxvd = (bxvd) f.mo74142c(i2);
                                bxvd.mo73625a((GeneratedMessageLite) f);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                din din = (din) bxvd.f164949b;
                                din din2 = din.f13229r;
                                int i7 = a - 1;
                                if (a != 0) {
                                    din.f13241k = i7;
                                    din.f13231a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    arrayList2.add((din) bxvd.mo74062i());
                                    i3++;
                                    i2 = 5;
                                } else {
                                    throw null;
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                String valueOf = String.valueOf(dfw);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                                sb.append("Rejecting module set due to missing APK: ");
                                sb.append(valueOf);
                                Log.w("ChimeraCfgMgr", sb.toString());
                                return false;
                            }
                        }
                        i6++;
                    } else {
                        dky b2 = dky.m8765b(arrayList2, dfe.f13005a);
                        synchronized (this.f13033e) {
                            if (djz2 == this.f13037j) {
                                if (djz2 != null) {
                                    dky = mo8895c(djz);
                                } else {
                                    dky = dhz.f13199c;
                                }
                                if (djz2 == null) {
                                    dky2 = dky;
                                    dky3 = dky4;
                                } else if (b2.size() == djz.mo9175b()) {
                                    djy djy = new djy();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= b2.size()) {
                                            break;
                                        }
                                        djz2.mo9170a(djy, i8);
                                        if (dff.m8281a((din) b2.get(i8), djy) != 0) {
                                            dky2 = dky;
                                            dky3 = dky4;
                                            break;
                                        }
                                        i8++;
                                    }
                                } else {
                                    dky2 = dky;
                                    dky3 = dky4;
                                }
                            } else {
                                throw new InvalidConfigException("Config changed while recomputing");
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                if (a == 2) {
                    String valueOf2 = String.valueOf(dht);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                    sb2.append("Can't get descriptor for required APK ");
                    sb2.append(valueOf2);
                    Log.w("ChimeraCfgMgr", sb2.toString());
                    if (map2 != null) {
                        map2.put(dht, new dfg(2));
                    }
                    throw e2;
                }
                list.remove(i3);
                i2 = 5;
            } catch (PackageManager.NameNotFoundException e3) {
                String valueOf3 = String.valueOf(dfw);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 41);
                sb3.append("Rejecting module set due to missing APK: ");
                sb3.append(valueOf3);
                Log.w("ChimeraCfgMgr", sb3.toString());
                return false;
            }
        } else {
            throw new InvalidConfigException("Not migrated with user locked");
        }
    }
}
