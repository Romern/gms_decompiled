package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: dgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgv extends dez {

    /* renamed from: e */
    public static final ReadWriteLock f13086e = new ReentrantReadWriteLock(true);

    /* renamed from: f */
    public static final Object f13087f = new Object();

    /* renamed from: g */
    private static volatile dgv f13088g;

    /* renamed from: h */
    private static final Object f13089h = new Object();

    private dgv(Context context) {
        super(context, "current_fileapks.pb");
    }

    /* renamed from: a */
    public static dgv m8427a(Context context) {
        dgv dgv = f13088g;
        if (dgv == null) {
            synchronized (dgv.class) {
                dgv = f13088g;
                if (dgv == null) {
                    dgv = new dgv(context);
                    f13088g = dgv;
                }
            }
        }
        return dgv;
    }

    /* renamed from: b */
    static File m8431b(File file) {
        return new File(file, "current_fileapks.pb");
    }

    /* renamed from: l */
    static dke m8432l() {
        bxvd da = dke.f13390f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dke dke = (dke) da.f164949b;
        dke.f13392a |= 1;
        dke.f13393b = 7;
        return (dke) da.mo74062i();
    }

    /* renamed from: d */
    public final File mo8986d() {
        return m8428a(this.f12991b);
    }

    /* renamed from: e */
    public final bnhe mo8987e() {
        bnhe bnhe = null;
        if (mo8638b()) {
            return null;
        }
        synchronized (f13087f) {
            dke k = mo8993k();
            bnha a = bnhe.m109406a(k.f13394c.size());
            File d = mo8986d();
            if (d != null) {
                for (dkd dkd : k.f13394c) {
                    int a2 = dkc.m8723a(dkd.f13387g);
                    if (a2 != 0 && a2 == 3) {
                        for (dkf dkf : dkd.f13385e) {
                            int binarySearch = Collections.binarySearch(k.f13395d, dkf, dha.f13093b);
                            if (binarySearch >= 0) {
                                dkf dkf2 = (dkf) k.f13395d.get(binarySearch);
                                a.mo67695b(dha.m8458a(dkf), new File(dha.m8469b(d, dkf2.f13402d), dkf2.f13400b).getAbsolutePath());
                            }
                        }
                    }
                }
                bnhe = a.mo67618b();
            }
        }
        return bnhe;
    }

    /* renamed from: f */
    public final String mo8988f() {
        int i = Build.VERSION.SDK_INT;
        try {
            return this.f12990a.getPackageManager().getPackageInfo(this.f12990a.getPackageName(), 2097152).applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FileApkMgr", "Could not find system container");
            return null;
        }
    }

    /* renamed from: g */
    public final void mo8989g() {
        this.f12990a.startService(new Intent("com.google.android.chimera.FileApkManager.DELETE_UNUSED_FILEAPKS").setPackage(this.f12990a.getPackageName()));
    }

    /* renamed from: i */
    public final List mo8991i() {
        List list;
        int a;
        f13086e.readLock().lock();
        try {
            dgo j = mo8992j();
            File file = j.f13073b;
            dke dke = j.f13074c;
            File a2 = m8428a(file);
            if (a2 != null) {
                if (a2.isDirectory()) {
                    list = new ArrayList();
                    for (dkd dkd : dke.f13394c) {
                        if (dkd.f13389i && (a = dkc.m8723a(dkd.f13387g)) != 0 && a == 4) {
                            list.add(dkd.f13388h);
                        }
                    }
                    return list;
                }
            }
            Log.w("FileApkMgr", "Main modules directory could not be created.");
            list = Collections.emptyList();
            return list;
        } finally {
            f13086e.readLock().unlock();
        }
    }

    /* renamed from: j */
    public final dgo mo8992j() {
        Context context = this.f12990a;
        File file = this.f12991b;
        File b = m8431b(file);
        if (mo8639c()) {
            context = dge.m8385a(context);
            file = dft.m8317a(context);
            b = m8431b(file);
        }
        return new dgo(context, file, mo8974a(context, b));
    }

    /* renamed from: k */
    public final dke mo8993k() {
        if (mo8639c()) {
            Context a = dge.m8385a(this.f12990a);
            File a2 = dft.m8317a(this.f12990a);
            File file = new File(a2, "current_fileapks.pb");
            File file2 = new File(a2, "m");
            dhb.m8476a(file2);
            File a3 = dft.m8317a(a);
            File file3 = new File(a3, "current_fileapks.pb");
            File file4 = new File(a3, "m");
            if (file3.isFile() && file4.isDirectory()) {
                try {
                    byte[] bArr = new byte[8192];
                    File[] listFiles = file4.listFiles();
                    if (listFiles != null) {
                        Set singleton = Collections.singleton("oat");
                        for (File file5 : listFiles) {
                            if (file5.isDirectory()) {
                                String name = file5.getName();
                                try {
                                    Integer.parseInt(name, 16);
                                    dhb.m8474a(file5, new File(file2, name), singleton, bArr);
                                } catch (NumberFormatException e) {
                                }
                            }
                        }
                        dhb.m8475a(file3, file, bArr);
                    } else {
                        throw new IOException("Failed to list CE modules dir");
                    }
                } catch (IOException e2) {
                    Log.w("DPSUtils", "Migrating to Device Protected Storage failed", e2);
                    dhb.m8476a(file2);
                    dge.m8386a(a, "current_fileapks.pb", "m");
                    mo8986d();
                }
            }
            this.f12993d = true;
        }
        return mo8974a(this.f12990a, m8431b(this.f12991b));
    }

    /* renamed from: h */
    public final Collection mo8990h() {
        return mo8975a(-1, false, false, bnon.f131923a);
    }

    /* renamed from: a */
    static File m8428a(File file) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            File file2 = new File(file, "m");
            if (!file2.isDirectory()) {
                synchronized (f13087f) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                        if (!file2.mkdir()) {
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return null;
                        }
                    }
                }
            }
            dhb.m8480c(file2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return file2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m8429a(File file, dkf dkf) {
        String valueOf = String.valueOf(dha.m8459a(file, dkf).getAbsolutePath());
        if (valueOf.length() == 0) {
            new String("Optimizing: ");
        } else {
            "Optimizing: ".concat(valueOf);
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(java.io.File, dke, boolean):boolean
     arg types: [java.io.File, dke, int]
     candidates:
      dgv.a(dkw, boolean, dks):boolean
      dgv.a(java.util.Set, dks, boolean):boolean
      dgv.a(java.io.File, dke, boolean):boolean */
    /* renamed from: a */
    private final boolean m8430a(dke dke, dks dks) {
        bngx a;
        if (mo8984a(this.f12991b, dke, true)) {
            if (dks != null) {
                synchronized (dks.f13425c) {
                    ArrayList arrayList = dks.f13427e;
                    a = bngx.m109368a((Collection) arrayList.subList(dks.f13428f, arrayList.size()));
                    dks.f13428f = dks.f13427e.size();
                }
                dks.f13424b.execute(new dkq(dks, a));
            }
            return true;
        }
        Log.w("FileApkMgr", "Failed to write incremental config");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029f A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9 A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171 A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ec A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0204 A[Catch:{ bxwf -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e A[Catch:{ bxwf -> 0x035b }] */
    /* renamed from: a */
    public final dke mo8974a(Context context, File file) {
        int i;
        File d;
        String str;
        String path;
        byte[] a = dft.m8323a(file);
        if (a != null) {
            try {
                bxvd da = dke.f13390f.mo74144da();
                da.mo73635b(a, bxus.m123743b());
                int i2 = ((dke) da.f164949b).f13393b;
                int i3 = 3;
                if (i2 == 3) {
                    int i4 = 0;
                    while (i4 < ((dke) da.f164949b).f13394c.size()) {
                        dkd d2 = da.mo74040d(i4);
                        bxvd bxvd = (bxvd) d2.mo74142c(5);
                        bxvd.mo73625a((bxvk) d2);
                        Uri parse = Uri.parse(((dkd) bxvd.f164949b).f13382b);
                        if (parse.isRelative() || "file".equals(parse.getScheme())) {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            dkd dkd = (dkd) bxvd.f164949b;
                            dkd dkd2 = dkd.f13379j;
                            dkd.f13387g = 1;
                            dkd.f13381a |= 16;
                        } else {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            dkd dkd3 = (dkd) bxvd.f164949b;
                            dkd dkd4 = dkd.f13379j;
                            dkd3.f13387g = 2;
                            dkd3.f13381a |= 16;
                        }
                        da.mo73968a(i4, (dkd) bxvd.mo74062i());
                        i4++;
                        i3 = 3;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    dke dke = (dke) da.f164949b;
                    dke.f13392a |= 1;
                    dke.f13393b = 4;
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                StringBuilder sb = new StringBuilder(89);
                                sb.append("Stored Staged Apks config has different version (current=7, stored=");
                                sb.append(i2);
                                sb.append("), ignoring");
                                Log.w("FileApkMgr", sb.toString());
                            }
                            return (dke) da.mo74062i();
                        }
                        d = mo8986d();
                        if (d == null) {
                            Log.e("FileApkMgr", "Failed fetching module directory during config upgrade");
                            return m8432l();
                        }
                        for (int i5 = 0; i5 < ((dke) da.f164949b).f13395d.size(); i5++) {
                            dkf e = da.mo74046e(i5);
                            dhs a2 = dhs.m8523a(dha.m8459a(d, e).getAbsolutePath());
                            if (a2 != null) {
                                bxvd bxvd2 = (bxvd) e.mo74142c(5);
                                bxvd2.mo73625a((bxvk) e);
                                String str2 = a2.f13182a;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                dkf dkf = (dkf) bxvd2.f164949b;
                                dkf dkf2 = dkf.f13397i;
                                str2.getClass();
                                int i6 = dkf.f13399a | 32;
                                dkf.f13399a = i6;
                                dkf.f13405g = str2;
                                String str3 = a2.f13183b;
                                str3.getClass();
                                dkf.f13399a = i6 | 64;
                                dkf.f13406h = str3;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                dke dke2 = (dke) da.f164949b;
                                dkf dkf3 = (dkf) bxvd2.mo74062i();
                                dkf3.getClass();
                                dke2.mo9190b();
                                dke2.f13395d.set(i5, dkf3);
                            }
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dke dke3 = (dke) da.f164949b;
                        dke3.f13392a |= 1;
                        dke3.f13393b = 7;
                        return (dke) da.mo74062i();
                    }
                    i = 0;
                    while (i < ((dke) da.f164949b).f13394c.size()) {
                        dkd d3 = da.mo74040d(i);
                        bxvd bxvd3 = (bxvd) d3.mo74142c(5);
                        bxvd3.mo73625a((bxvk) d3);
                        Uri parse2 = Uri.parse(((dkd) bxvd3.f164949b).f13382b);
                        boolean z = parse2.isRelative() || "file".equals(parse2.getScheme());
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        dkd dkd5 = (dkd) bxvd3.f164949b;
                        dkd dkd6 = dkd.f13379j;
                        dkd5.f13381a |= 64;
                        dkd5.f13389i = z;
                        da.mo73968a(i, (dkd) bxvd3.mo74062i());
                        i++;
                    }
                    if (!da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    dke dke4 = (dke) da.f164949b;
                    dke4.f13392a |= 1;
                    dke4.f13393b = 6;
                    d = mo8986d();
                    if (d == null) {
                    }
                }
                PackageManager packageManager = context.getPackageManager();
                int size = ((dke) da.f164949b).f13394c.size();
                ArrayList arrayList = new ArrayList(size);
                int i7 = 0;
                while (i7 < ((dke) da.f164949b).f13394c.size()) {
                    dkd d4 = da.mo74040d(i7);
                    int a3 = dkc.m8723a(d4.f13387g);
                    if (a3 == 0) {
                        path = Uri.parse(d4.f13382b).getPath();
                        if (path != null) {
                            String valueOf = String.valueOf(d4.f13382b);
                            if (valueOf.length() == 0) {
                                new String("Staged apk path is null: ");
                            } else {
                                "Staged apk path is null: ".concat(valueOf);
                            }
                            str = null;
                        } else {
                            File file2 = new File(path);
                            if (!file2.exists()) {
                                if (path.length() == 0) {
                                    new String("Staged apk file not found: ");
                                } else {
                                    "Staged apk file not found: ".concat(path);
                                }
                                str = null;
                            } else {
                                PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file2.getAbsolutePath(), 0);
                                if (packageArchiveInfo == null) {
                                    if (path.length() == 0) {
                                        new String("Staged apk package archive info null: ");
                                    } else {
                                        "Staged apk package archive info null: ".concat(path);
                                    }
                                    str = null;
                                } else {
                                    str = packageArchiveInfo.packageName;
                                    try {
                                        String str4 = packageManager.getApplicationInfo(str, 0).sourceDir;
                                        if (!file2.equals(new File(str4))) {
                                            StringBuilder sb2 = new StringBuilder(path.length() + 26 + String.valueOf(str4).length());
                                            sb2.append("Staged apk not active: ");
                                            sb2.append(path);
                                            sb2.append(" [");
                                            sb2.append(str4);
                                            sb2.append("]");
                                            sb2.toString();
                                            str = null;
                                        }
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36 + path.length());
                                        sb3.append("Staged apk package name ");
                                        sb3.append(str);
                                        sb3.append(" not found: ");
                                        sb3.append(path);
                                        sb3.toString();
                                        str = null;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            bxvd bxvd4 = (bxvd) d4.mo74142c(5);
                            bxvd4.mo73625a((bxvk) d4);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            dkd dkd7 = (dkd) bxvd4.f164949b;
                            dkd dkd8 = dkd.f13379j;
                            str.getClass();
                            dkd7.f13381a |= 32;
                            dkd7.f13388h = str;
                            dkd dkd9 = (dkd) bxvd4.mo74062i();
                            arrayList.add(dkd9);
                            da.mo73968a(i7, dkd9);
                        }
                        i7++;
                        i3 = 3;
                    } else {
                        if (a3 == i3) {
                            str = "";
                        }
                        path = Uri.parse(d4.f13382b).getPath();
                        if (path != null) {
                        }
                        if (str != null) {
                        }
                        i7++;
                        i3 = 3;
                    }
                    if (str != null) {
                    }
                    i7++;
                    i3 = 3;
                }
                if (arrayList.size() < size) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((dke) da.f164949b).f13394c = bxvk.m124030de();
                    da.mo74075k(arrayList);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dke dke5 = (dke) da.f164949b;
                dke5.f13392a |= 1;
                dke5.f13393b = 5;
                i = 0;
                while (i < ((dke) da.f164949b).f13394c.size()) {
                }
                if (!da.f164950c) {
                }
                dke dke42 = (dke) da.f164949b;
                dke42.f13392a |= 1;
                dke42.f13393b = 6;
                d = mo8986d();
                if (d == null) {
                }
            } catch (bxwf e3) {
                String valueOf2 = String.valueOf(e3.getMessage());
                Log.e("FileApkMgr", valueOf2.length() == 0 ? new String("Failed to read config file: ") : "Failed to read config file: ".concat(valueOf2));
            }
        }
        return m8432l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f4 A[Catch:{ all -> 0x0134 }] */
    /* renamed from: a */
    public final Collection mo8975a(int i, boolean z, boolean z2, Set set) {
        Collection collection;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int a;
        int i3;
        int i4 = i;
        f13086e.readLock().lock();
        try {
            dgo j = mo8992j();
            Context context = j.f13072a;
            File file = j.f13073b;
            dke dke = j.f13074c;
            File a2 = m8428a(file);
            if (a2 != null) {
                if (a2.isDirectory()) {
                    collection = new ArrayList();
                    BitSet bitSet = z2 ? new BitSet(dke.f13395d.size()) : null;
                    for (dkd dkd : dke.f13394c) {
                        if (i4 < 0 || !dkd.f13384d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i4 < 0) {
                            z4 = true;
                        } else {
                            z4 = !z3;
                        }
                        int a3 = dkc.m8723a(dkd.f13387g);
                        if (a3 != 0) {
                            if (a3 == 2 && i4 >= 0) {
                                if (i4 == dkd.f13386f) {
                                    z6 = false;
                                    z5 = true;
                                    if (!z) {
                                        int a4 = dkc.m8723a(dkd.f13387g);
                                        if (a4 != 0 && a4 == 3) {
                                        }
                                    }
                                    for (dkf dkf : dkd.f13385e) {
                                        if (dkf.f13403e) {
                                            if (z6) {
                                            }
                                        } else if (!z5) {
                                        }
                                        int binarySearch = Collections.binarySearch(dke.f13395d, dkf, dha.f13093b);
                                        if (binarySearch >= 0) {
                                            if (bitSet != null) {
                                                if (!bitSet.get(binarySearch)) {
                                                    bitSet.set(binarySearch);
                                                }
                                            }
                                            dkf dkf2 = (dkf) dke.f13395d.get(binarySearch);
                                            File a5 = dha.m8459a(a2, dkf2);
                                            int a6 = dkc.m8723a(dkd.f13387g);
                                            if (a6 != 0 && a6 == 4) {
                                                if (set.contains(dkd.f13388h)) {
                                                    i2 = 1;
                                                    String absolutePath = a5.getAbsolutePath();
                                                    a = dkc.m8723a(dkd.f13387g);
                                                    if (a == 0) {
                                                        i3 = a;
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    collection.add(new dgl(context, i2, absolutePath, i3, dkf2.f13404f, dkd.f13382b, dha.m8458a(dkf2)));
                                                }
                                            }
                                            i2 = 0;
                                            String absolutePath2 = a5.getAbsolutePath();
                                            a = dkc.m8723a(dkd.f13387g);
                                            if (a == 0) {
                                            }
                                            collection.add(new dgl(context, i2, absolutePath2, i3, dkf2.f13404f, dkd.f13382b, dha.m8458a(dkf2)));
                                        }
                                    }
                                    i4 = i;
                                }
                            }
                        }
                        z6 = z3;
                        z5 = z4;
                        if (!z) {
                        }
                        while (r20.hasNext()) {
                        }
                        i4 = i;
                    }
                    return collection;
                }
            }
            Log.w("FileApkMgr", "Main modules directory could not be created.");
            collection = Collections.emptyList();
            return collection;
        } finally {
            f13086e.readLock().unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(java.io.File, dke, boolean):boolean
     arg types: [java.io.File, dke, int]
     candidates:
      dgv.a(dkw, boolean, dks):boolean
      dgv.a(java.util.Set, dks, boolean):boolean
      dgv.a(java.io.File, dke, boolean):boolean */
    /* renamed from: a */
    public final void mo8976a(djz djz, File file, File file2, bxvd bxvd, boolean z) {
        String str;
        File parentFile;
        djz djz2 = djz;
        File file3 = file;
        bxvd bxvd2 = bxvd;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int c = djz.mo9177c();
        dka dka = new dka();
        djy djy = new djy();
        for (int i = 0; i < c; i++) {
            djz2.mo9171a(dka, i);
            djz2.mo9170a(djy, dka.mo9183R());
            if (djy.mo9149a() == 3 && (parentFile = new File(djy.mo9151b()).getParentFile()) != null) {
                try {
                    int parseInt = Integer.parseInt(parentFile.getName(), 16);
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Adding active module unique id: [");
                    sb.append(parseInt);
                    sb.append("]");
                    sb.toString();
                    sparseBooleanArray.put(parseInt, true);
                } catch (NumberFormatException e) {
                }
            }
        }
        for (dkd dkd : Collections.unmodifiableList(((dke) bxvd2.f164949b).f13394c)) {
            bxwc bxwc = dkd.f13385e;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                dkf dkf = (dkf) bxwc.get(i2);
                if (!dkf.f13403e) {
                    str = "active";
                } else {
                    str = "outdated";
                }
                int i3 = dkf.f13402d;
                StringBuilder sb2 = new StringBuilder(str.length() + 46);
                sb2.append("Adding ");
                sb2.append(str);
                sb2.append(" installed APK unique id: [");
                sb2.append(i3);
                sb2.append("]");
                sb2.toString();
                sparseBooleanArray.put(dkf.f13402d, true);
            }
        }
        ArrayList arrayList = new ArrayList(((dke) bxvd2.f164949b).f13395d.size());
        boolean z2 = false;
        for (dkf dkf2 : Collections.unmodifiableList(((dke) bxvd2.f164949b).f13395d)) {
            if (!sparseBooleanArray.get(dkf2.f13402d)) {
                int i4 = dkf2.f13402d;
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Unreferenced module unique id: [");
                sb3.append(i4);
                sb3.append("]");
                sb3.toString();
                z2 = true;
            } else {
                int i5 = dkf2.f13402d;
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("Referenced module unique id: [");
                sb4.append(i5);
                sb4.append("]");
                sb4.toString();
                arrayList.add(dkf2);
            }
        }
        if (z2) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            dke dke = dke.f13390f;
            ((dke) bxvd2.f164949b).f13395d = bxvk.m124030de();
            bxvd2.mo74070j(arrayList);
            if (z) {
                if (!mo8984a(file2, (dke) bxvd.mo74062i(), false)) {
                    Log.e("FileApkMgr", "Failed to update config file");
                }
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            Log.w("FileApkMgr", "Main module directory could not be listed.");
            File a = dha.m8460a(file.getParentFile(), file3);
            if (a != null) {
                mo8986d();
                if (!file.isDirectory()) {
                    Log.w("FileApkMgr", "Main modules directory could not be created.");
                } else if (!a.renameTo(new File(file3, a.getName()))) {
                    Log.e("FileApkMgr", "Failed to rename condemned module directory.");
                    if (!dhb.m8476a(a)) {
                        Log.e("FileApkMgr", "Failed to delete condemned module directory.");
                    }
                }
            }
        } else {
            for (File file4 : listFiles) {
                if (file4.isDirectory()) {
                    String name = file4.getName();
                    if (!name.startsWith("c-")) {
                        try {
                            if (sparseBooleanArray.get(Integer.parseInt(name, 16))) {
                                String valueOf = String.valueOf(name);
                                if (valueOf.length() == 0) {
                                    new String("Keeping up-to-date module: ");
                                } else {
                                    "Keeping up-to-date module: ".concat(valueOf);
                                }
                            } else {
                                String valueOf2 = String.valueOf(name);
                                Log.i("FileApkMgr", valueOf2.length() == 0 ? new String("Deleting stale module: ") : "Deleting stale module: ".concat(valueOf2));
                                File a2 = dha.m8460a(file3, file4);
                                if (a2 != null) {
                                    dhb.m8476a(a2);
                                }
                            }
                        } catch (NumberFormatException e2) {
                        }
                    } else if (!dhb.m8476a(file4)) {
                        String valueOf3 = String.valueOf(name);
                        Log.w("FileApkMgr", valueOf3.length() == 0 ? new String("Failed to delete condemned module: ") : "Failed to delete condemned module: ".concat(valueOf3));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8977a(boolean z) {
        String str;
        if (mo8637a()) {
            File d = mo8986d();
            if (d == null || !d.isDirectory()) {
                Log.e("FileApkMgr", "Failed to get module files directory");
                return;
            }
            synchronized (f13089h) {
                if (!z) {
                    str = "";
                } else {
                    str = " container-only";
                }
                if (str.length() == 0) {
                    new String("Starting optimizing");
                } else {
                    "Starting optimizing".concat(str);
                }
                f13086e.readLock().lock();
                try {
                    dke dke = mo8992j().f13074c;
                    if (z) {
                        for (dkd dkd : dke.f13394c) {
                            int a = dkc.m8723a(dkd.f13387g);
                            if (a != 0 && a == 2) {
                                for (dkf dkf : dkd.f13385e) {
                                    int binarySearch = Collections.binarySearch(dke.f13395d, dkf, dha.f13093b);
                                    if (binarySearch >= 0) {
                                        m8429a(d, (dkf) dke.f13395d.get(binarySearch));
                                    }
                                }
                            }
                        }
                    } else {
                        for (dkf dkf2 : dke.f13395d) {
                            m8429a(d, dkf2);
                        }
                    }
                    String str2 = !z ? "" : " container-only";
                    StringBuilder sb = new StringBuilder(str2.length() + 19);
                    sb.append("Optimizing");
                    sb.append(str2);
                    sb.append(" complete");
                    sb.toString();
                } finally {
                    f13086e.readLock().unlock();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8978a(bxvd bxvd, File file, dfz dfz, Set set, dkw dkw) {
        bxvd bxvd2 = bxvd;
        File file2 = file;
        ArrayList arrayList = new ArrayList(((dke) bxvd2.f164949b).f13395d.size());
        boolean z = false;
        for (dkf dkf : Collections.unmodifiableList(((dke) bxvd2.f164949b).f13395d)) {
            File a = dha.m8459a(file2, dkf);
            try {
                din f = new dgl(this.f12990a, 0, a.getAbsolutePath(), 2, dkf.f13404f, "", null).mo8914f();
                try {
                    if (dkw.mo9238a(a)) {
                        arrayList.add(dkf);
                    } else {
                        String str = dkf.f13401c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                        sb.append("Module signature verification failed: [");
                        sb.append(str);
                        sb.append("]");
                        Log.w("FileApkMgr", sb.toString());
                        Context context = this.f12990a;
                        String str2 = dkf.f13400b;
                        int i = f.f13238h;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 14);
                        sb2.append(str2);
                        sb2.append(" (");
                        sb2.append(i);
                        sb2.append(")");
                        dgd.m8383a(context, 44, sb2.toString());
                        dha.m8460a(file2, dha.m8469b(file2, dkf.f13402d));
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            } catch (PackageManager.NameNotFoundException e2) {
                String str3 = dkf.f13401c;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 20);
                sb3.append("Module not found: [");
                sb3.append(str3);
                sb3.append("]");
                sb3.toString();
                dha.m8460a(file2, dha.m8469b(file2, dkf.f13402d));
                z = true;
            }
        }
        if (z) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            dke dke = dke.f13390f;
            ((dke) bxvd2.f164949b).f13395d = bxvk.m124030de();
            bxvd2.mo74070j(arrayList);
        }
        return z | dha.m8468a(bxvd2, dfz, set);
    }

    /* renamed from: a */
    public final boolean mo8979a(dks dks) {
        return mo8983a(dfq.m8315b(), dfq.m8314a().mo8862a(), dks);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8980a(dkw dkw, bxvd bxvd, dht dht, File file, boolean z, dks dks) {
        bxvd bxvd2;
        int i;
        int i2;
        bxvd bxvd3 = bxvd;
        dht dht2 = dht;
        String m = dht.mo9029m();
        if (m == null) {
            return false;
        }
        try {
            din f = dht.mo8914f();
            String str = f.f13236f;
            long j = f.f13234d;
            int i3 = f.f13238h;
            bxvd da = dkd.f13379j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            dkd dkd = (dkd) da.f164949b;
            m.getClass();
            boolean z2 = true;
            dkd.f13381a |= 1;
            dkd.f13382b = m;
            int binarySearch = Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd3.f164949b).f13394c), (dkd) da.mo74062i(), dha.f13094c);
            int i4 = 2;
            if (binarySearch >= 0) {
                dkd d = bxvd3.mo74040d(binarySearch);
                bxvd2 = (bxvd) d.mo74142c(5);
                bxvd2.mo73625a((bxvk) d);
                dkd dkd2 = (dkd) bxvd2.f164949b;
                if (j != dkd2.f13383c || i3 != dkd2.f13386f || !str.equals(dkd2.f13388h)) {
                    if (m.length() == 0) {
                        new String("Restarting staging: ");
                    } else {
                        "Restarting staging: ".concat(m);
                    }
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    dkd dkd3 = (dkd) bxvd2.f164949b;
                    int i5 = dkd3.f13381a | 2;
                    dkd3.f13381a = i5;
                    dkd3.f13383c = j;
                    dkd3.f13381a = i5 | 8;
                    dkd3.f13386f = i3;
                    int a = dik.m8576a(f.f13232b);
                    if (a == 0) {
                        i4 = 4;
                    } else if (a != 2) {
                        i4 = 4;
                    }
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    dkd dkd4 = (dkd) bxvd2.f164949b;
                    dkd4.f13387g = i4 - 1;
                    int i6 = dkd4.f13381a | 16;
                    dkd4.f13381a = i6;
                    str.getClass();
                    int i7 = i6 | 32;
                    dkd4.f13381a = i7;
                    dkd4.f13388h = str;
                    int i8 = i7 | 64;
                    dkd4.f13381a = i8;
                    dkd4.f13389i = dht2 instanceof dhc;
                    if (!dkd4.f13384d) {
                        Iterator it = Collections.unmodifiableList(dkd4.f13385e).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = binarySearch;
                                z2 = true;
                                break;
                            } else if (!((dkf) it.next()).f13403e) {
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ((dkd) bxvd2.f164949b).f13385e = bxvk.m124030de();
                                i = binarySearch;
                                z2 = true;
                            }
                        }
                    } else {
                        dkd4.f13381a = i8 | 4;
                        dkd4.f13384d = false;
                        for (int i9 = 0; i9 < ((dkd) bxvd2.f164949b).f13385e.size(); i9++) {
                            dkf c = bxvd2.mo74034c(i9);
                            bxvd bxvd4 = (bxvd) c.mo74142c(5);
                            bxvd4.mo73625a((bxvk) c);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            dkf dkf = (dkf) bxvd4.f164949b;
                            dkf dkf2 = dkf.f13397i;
                            dkf.f13399a |= 8;
                            dkf.f13403e = true;
                            bxvd2.mo73969a(i9, (dkf) bxvd4.mo74062i());
                        }
                        i = binarySearch;
                        z2 = true;
                    }
                } else if (((dkd) bxvd2.f164949b).f13384d) {
                    if (m.length() == 0) {
                        new String("Staging already complete: ");
                    } else {
                        "Staging already complete: ".concat(m);
                    }
                    return false;
                } else {
                    if (m.length() == 0) {
                        new String("Continuing staging: ");
                    } else {
                        "Continuing staging: ".concat(m);
                    }
                    i = binarySearch;
                    z2 = false;
                }
            } else {
                if (m.length() == 0) {
                    new String("Starting staging: ");
                } else {
                    "Starting staging: ".concat(m);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dkd dkd5 = (dkd) da.f164949b;
                int i10 = dkd5.f13381a | 2;
                dkd5.f13381a = i10;
                dkd5.f13383c = j;
                dkd5.f13381a = i10 | 8;
                dkd5.f13386f = i3;
                int a2 = dik.m8576a(f.f13232b);
                if (a2 == 0) {
                    i2 = 4;
                } else {
                    i2 = a2 != 2 ? 4 : 2;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dkd dkd6 = (dkd) da.f164949b;
                dkd6.f13387g = i2 - 1;
                int i11 = dkd6.f13381a | 16;
                dkd6.f13381a = i11;
                str.getClass();
                int i12 = i11 | 32;
                dkd6.f13381a = i12;
                dkd6.f13388h = str;
                dkd6.f13381a = i12 | 64;
                dkd6.f13389i = dht2 instanceof dhc;
                bxvd2 = da;
                i = dha.m8457a(bxvd3, binarySearch, (dkd) da.mo74062i());
            }
            boolean z3 = true;
            bmzs.m108698a(!((dkd) bxvd2.f164949b).f13384d);
            ArrayList arrayList = new ArrayList();
            if (dht2 instanceof dfz) {
                if (!dgu.m8423a("/system/", "m/container", dht2, arrayList)) {
                    z3 = dgu.m8423a("/system/", "app_chimera/m", dht2, arrayList);
                }
                dgu.m8423a("/system/", "m/optional", dht2, arrayList);
                if (z3) {
                    z2 |= mo8982a(dkw, z, bxvd, bxvd2, i, arrayList, file, dks);
                    bxvd3.mo73968a(i, (dkd) bxvd2.mo74062i());
                    return z2;
                }
            }
            Context context = this.f12990a;
            try {
                AssetManager assets = dht.mo8911c().getAssets();
                String[] list = assets.list("chimera-modules");
                if (list != null) {
                    Arrays.sort(list);
                    for (String str2 : list) {
                        if (str2.endsWith(".apk")) {
                            arrayList.add(new dgs(assets, str2));
                        }
                    }
                    z2 |= mo8982a(dkw, z, bxvd, bxvd2, i, arrayList, file, dks);
                    bxvd3.mo73968a(i, (dkd) bxvd2.mo74062i());
                    return z2;
                }
                throw new IOException("unknown error");
            } catch (PackageManager.NameNotFoundException | djq | IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FileApkMgr", valueOf.length() == 0 ? new String("Error while unpacking chimera modules:") : "Error while unpacking chimera modules:".concat(valueOf));
                dgd.m8383a(context, 33, e.getMessage());
            }
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(java.io.File, dke, boolean):boolean
     arg types: [java.io.File, dke, int]
     candidates:
      dgv.a(dkw, boolean, dks):boolean
      dgv.a(java.util.Set, dks, boolean):boolean
      dgv.a(java.io.File, dke, boolean):boolean */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0336  */
    /* renamed from: a */
    public final boolean mo8981a(dkw dkw, Set set, boolean z, boolean z2, dks dks) {
        boolean z3;
        bxvd bxvd;
        File[] fileArr;
        boolean z4;
        File[] fileArr2;
        int i;
        int i2;
        bxvd bxvd2;
        boolean z5;
        int i3;
        int i4;
        int i5;
        bxvd bxvd3;
        boolean z6;
        Set set2 = set;
        boolean z7 = false;
        if (mo8638b()) {
            return false;
        }
        dfz dfz = new dfz(this.f12990a);
        int i6 = 1;
        if (set2 != null) {
            bmxy.m108600b(!set2.contains(dfz));
        }
        synchronized (f13087f) {
            File d = mo8986d();
            if (d != null) {
                if (d.isDirectory()) {
                    dke k = mo8993k();
                    bxvd bxvd4 = (bxvd) k.mo74142c(5);
                    bxvd4.mo73625a((bxvk) k);
                    if (z) {
                        z3 = mo8978a(bxvd4, d, dfz, set, dkw);
                    } else {
                        z3 = dha.m8468a(bxvd4, dfz, set2);
                    }
                    boolean a = z3 | mo8980a(dkw, bxvd4, dfz, d, z2, dks);
                    dfq.m8314a();
                    if (cdjl.f180997a.mo6606a().mo77687A()) {
                        String f = mo8988f();
                        if (f != null) {
                            File parentFile = new File(f).getParentFile();
                            if (parentFile == null) {
                                String valueOf = String.valueOf((Object) null);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                                sb.append("Failed fetching parent directory of ");
                                sb.append(valueOf);
                                Log.e("FileApkMgr", sb.toString());
                                fileArr = null;
                            } else {
                                File file = new File(parentFile, "m/independent");
                                if (!file.isDirectory()) {
                                    String valueOf2 = String.valueOf(file);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 61);
                                    sb2.append("System image independent module root not found at ");
                                    sb2.append(valueOf2);
                                    sb2.append(". Ignoring.");
                                    sb2.toString();
                                    fileArr = null;
                                } else {
                                    File[] listFiles = file.listFiles();
                                    if (listFiles == null) {
                                        String valueOf3 = String.valueOf(file);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 44);
                                        sb3.append("Failed to list independent module files in ");
                                        sb3.append(valueOf3);
                                        sb3.append(".");
                                        Log.e("FileApkMgr", sb3.toString());
                                    } else {
                                        fileArr = listFiles;
                                    }
                                }
                            }
                            if (fileArr == null) {
                                Arrays.sort(fileArr);
                                int length = fileArr.length;
                                z4 = false;
                                int i7 = 0;
                                while (i7 < length) {
                                    File file2 = fileArr[i7];
                                    if (file2.getName().endsWith(".apk")) {
                                        PackageInfo packageArchiveInfo = this.f12990a.getPackageManager().getPackageArchiveInfo(file2.getAbsolutePath(), z7 ? 1 : 0);
                                        if (packageArchiveInfo == null) {
                                            String valueOf4 = String.valueOf(file2.getAbsolutePath());
                                            Log.w("FileApkMgr", valueOf4.length() == 0 ? new String("Failed fetching package info for ") : "Failed fetching package info for ".concat(valueOf4));
                                            z5 = z4;
                                            i2 = i7;
                                            i = length;
                                            fileArr2 = fileArr;
                                            bxvd2 = bxvd4;
                                        } else {
                                            bxvd da = dkd.f13379j.mo74144da();
                                            String uri = Uri.fromFile(file2).toString();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z7;
                                            }
                                            dkd dkd = (dkd) da.f164949b;
                                            uri.getClass();
                                            dkd.f13381a |= i6;
                                            dkd.f13382b = uri;
                                            int binarySearch = Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd4.f164949b).f13394c), (dkd) da.mo74062i(), dha.f13094c);
                                            if (binarySearch < 0) {
                                                z5 = z4;
                                                bxvd3 = da;
                                                i5 = dha.m8457a(bxvd4, binarySearch, (dkd) da.mo74062i());
                                                i4 = i7;
                                                i3 = length;
                                                z6 = true;
                                            } else {
                                                dkd d2 = bxvd4.mo74040d(binarySearch);
                                                bxvd3 = (bxvd) d2.mo74142c(5);
                                                bxvd3.mo73625a((bxvk) d2);
                                                dkd dkd2 = (dkd) bxvd3.mo74062i();
                                                String str = packageArchiveInfo.packageName;
                                                int i8 = packageArchiveInfo.versionCode;
                                                z5 = z4;
                                                if (dkd2.f13384d) {
                                                    i4 = i7;
                                                    i3 = length;
                                                    if (file2.lastModified() == dkd2.f13383c && i8 == dkd2.f13386f && str.equals(dkd2.f13388h)) {
                                                        int a2 = dkc.m8723a(dkd2.f13387g);
                                                        if (a2 == 0) {
                                                            z6 = true;
                                                        } else {
                                                            if (a2 == 5) {
                                                                z6 = false;
                                                            }
                                                            z6 = true;
                                                        }
                                                        i5 = binarySearch;
                                                    }
                                                } else {
                                                    i4 = i7;
                                                    i3 = length;
                                                }
                                                z6 = true;
                                                i5 = binarySearch;
                                            }
                                            if (!z6) {
                                                String absolutePath = file2.getAbsolutePath();
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(absolutePath).length() + 37);
                                                sb4.append("Skipping ");
                                                sb4.append(absolutePath);
                                                sb4.append(", source APK has not changed");
                                                sb4.toString();
                                                fileArr2 = fileArr;
                                                bxvd2 = bxvd4;
                                                i2 = i4;
                                                i = i3;
                                            } else {
                                                String valueOf5 = String.valueOf(file2.getAbsolutePath());
                                                if (valueOf5.length() == 0) {
                                                    new String("Staging: ");
                                                } else {
                                                    "Staging: ".concat(valueOf5);
                                                }
                                                if (bxvd3.f164950c) {
                                                    bxvd3.mo74035c();
                                                    bxvd3.f164950c = false;
                                                }
                                                dkd dkd3 = (dkd) bxvd3.f164949b;
                                                dkd3.f13387g = 4;
                                                dkd3.f13381a |= 16;
                                                long lastModified = file2.lastModified();
                                                if (bxvd3.f164950c) {
                                                    bxvd3.mo74035c();
                                                    bxvd3.f164950c = false;
                                                }
                                                dkd dkd4 = (dkd) bxvd3.f164949b;
                                                dkd4.f13381a |= 2;
                                                dkd4.f13383c = lastModified;
                                                int i9 = packageArchiveInfo.versionCode;
                                                if (bxvd3.f164950c) {
                                                    bxvd3.mo74035c();
                                                    bxvd3.f164950c = false;
                                                }
                                                dkd dkd5 = (dkd) bxvd3.f164949b;
                                                dkd5.f13381a |= 8;
                                                dkd5.f13386f = i9;
                                                String str2 = packageArchiveInfo.packageName;
                                                if (bxvd3.f164950c) {
                                                    bxvd3.mo74035c();
                                                    bxvd3.f164950c = false;
                                                }
                                                dkd dkd6 = (dkd) bxvd3.f164949b;
                                                str2.getClass();
                                                int i10 = dkd6.f13381a | 32;
                                                dkd6.f13381a = i10;
                                                dkd6.f13388h = str2;
                                                dkd6.f13381a = i10 | 4;
                                                dkd6.f13384d = false;
                                                dkd6.f13385e = bxvk.m124030de();
                                                File file3 = file2;
                                                i2 = i4;
                                                i = i3;
                                                fileArr2 = fileArr;
                                                bxvd2 = bxvd4;
                                                if (!mo8982a(dkw, z2, bxvd4, bxvd3, i5, Collections.singletonList(new dgu(file2)), d, null)) {
                                                    String absolutePath2 = file3.getAbsolutePath();
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(absolutePath2).length() + 25);
                                                    sb5.append("Failed staging ");
                                                    sb5.append(absolutePath2);
                                                    sb5.append(", skipping");
                                                    Log.e("FileApkMgr", sb5.toString());
                                                }
                                                bxvd2.mo73968a(i5, (dkd) bxvd3.mo74062i());
                                                z4 = true;
                                                i7 = i2 + 1;
                                                bxvd4 = bxvd2;
                                                length = i;
                                                fileArr = fileArr2;
                                                z7 = false;
                                                i6 = 1;
                                            }
                                        }
                                    } else {
                                        z5 = z4;
                                        i2 = i7;
                                        i = length;
                                        fileArr2 = fileArr;
                                        bxvd2 = bxvd4;
                                    }
                                    z4 = z5;
                                    i7 = i2 + 1;
                                    bxvd4 = bxvd2;
                                    length = i;
                                    fileArr = fileArr2;
                                    z7 = false;
                                    i6 = 1;
                                }
                                bxvd = bxvd4;
                            } else {
                                bxvd = bxvd4;
                                z4 = false;
                            }
                            a |= z4;
                        }
                        fileArr = null;
                        if (fileArr == null) {
                        }
                        a |= z4;
                    } else {
                        bxvd = bxvd4;
                    }
                    if (set2 != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            a |= mo8980a(dkw, bxvd, (dht) it.next(), d, z2, null);
                        }
                    }
                    if (!a && !dha.m8467a(bxvd)) {
                        return false;
                    }
                    if (mo8984a(this.f12991b, (dke) bxvd.mo74062i(), true)) {
                        return true;
                    }
                    Log.e("FileApkMgr", "Failed to write config file");
                    return false;
                }
            }
            Log.e("FileApkMgr", "Failed to get module files directory");
            return false;
        }
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:174:0x0370 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:351:0x0662 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:605:0x0618 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:287:0x04ed */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:278:0x04cf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:150:0x0311 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:163:0x0359 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:261:0x04aa */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:221:0x0452 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:256:0x049e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:242:0x0479 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:232:0x0467 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:167:0x0361 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String], assign insn: 0x024e: CONST_STR  (r26v1 ? I:java.lang.String) =  "^\\s*(.+?): \"(.*?)\"$" */
    /* JADX WARN: Type inference failed for: r26v2, assign insn: PHI: (r26v2 ?) = (r26v41 ? I:?[int, float, short, byte, char]), (r26v49 ? I:?[int, float, short, byte, char]), (r26v59 char) binds: [B:262:?, B:222:?, B:288:?] */
    /* JADX WARN: Type inference failed for: r5v51, assign insn: PHI: (r5v51 ?) = (r5v90 ?), (r5v103 ?) binds: [B:286:0x04ec, B:156:0x033f] */
    /* JADX WARN: Type inference failed for: r5v59, assign insn: PHI: (r5v59 ?) = (r5v60 ?), (r5v71 ?), (r5v71 ?), (r5v72 ?), (r5v72 ?), (r5v72 ?), (r5v72 ?) binds: [B:278:0x04cf, B:261:0x04aa, B:262:?, B:221:0x0452, B:222:?, B:200:0x03eb, B:201:?] */
    /* JADX WARN: Type inference failed for: r5v60, assign insn: PHI: (r5v60 ?) = (r5v92 ?), (r5v107 ?) binds: [B:273:0x04c8, B:125:0x02a9] */
    /* JADX WARN: Type inference failed for: r5v61, assign insn: PHI: (r5v61 ?) = (r5v72 ?), (r5v93 ?) binds: [B:259:0x04a2, B:272:0x04c6] */
    /* JADX WARN: Type inference failed for: r5v64, types: [nr, java.util.Set], assign insn: 0x0261: CONSTRUCTOR  (r5v64 ? I:nr) =  call: nr.<init>():void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.lang.String], assign insn: 0x0357: CONST_STR  (r5v68 ? I:java.lang.String) =  "assets/module.yaml" */
    /* JADX WARN: Type inference failed for: r5v69, assign insn: PHI: (r5v69 ?) = (r5v68 ?), (r5v71 ?) binds: [B:163:0x0359, B:171:0x036a] */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.util.zip.ZipEntry], assign insn: PHI: (r5v71 ?) = (r5v99 ?), (r5v100 ?) binds: [B:165:0x035d, B:168:?] */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.io.InputStream], assign insn: 0x036a: INVOKE  (r5v72 ? I:java.io.InputStream) = (r6v79 java.util.zip.ZipFile), (r5v71 ? I:java.util.zip.ZipEntry) type: VIRTUAL call: java.util.zip.ZipFile.getInputStream(java.util.zip.ZipEntry):java.io.InputStream */
    /* JADX WARN: Type inference failed for: r26v25, assign insn: PHI: (r26v25 ?) = (r26v1 ?), (r26v28 ?), (r26v43 ? I:?[int, float, short, byte, char]), (r26v44 ? I:?[int, float, short, byte, char]), (r26v52 ? I:?[int, float, short, byte, char]), (r26v53 ? I:?[int, float, short, byte, char]) binds: [B:174:0x0370, B:242:0x0479, B:217:0x044c, B:218:?, B:196:0x03e5, B:197:?] */
    /* JADX WARN: Type inference failed for: r26v28, assign insn: PHI: (r26v28 ?) = (r26v29 ?), (r26v65 ?) binds: [B:236:0x046c, B:223:0x0457] */
    /* JADX WARN: Type inference failed for: r26v29, assign insn: 0x0470: CONST  (r26v29 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v41, assign insn: 0x04a8: CONST  (r26v41 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v43, assign insn: 0x0447: CONST  (r26v43 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v44, assign insn: 0x0447: CONST  (r26v44 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v49, assign insn: 0x0447: CONST  (r26v49 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v52, assign insn: 0x03ba: CONST  (r26v52 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r26v53, assign insn: 0x03ba: CONST  (r26v53 ? I:?[int, float, short, byte, char]) = (57 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r5v90, assign insn: ?: MOVE  (r5v90 ?) = (r5v57 dgr) */
    /* JADX WARN: Type inference failed for: r5v92, assign insn: ?: MOVE  (r5v92 ?) = (r5v61 ?) */
    /* JADX WARN: Type inference failed for: r5v93, assign insn: ?: MOVE  (r5v93 ?) = (r5v62 dgr) */
    /* JADX WARN: Type inference failed for: r5v99, assign insn: ?: MOVE  (r5v99 ?) = (r5v70 java.util.zip.ZipEntry) */
    /* JADX WARN: Type inference failed for: r26v65, assign insn: ?: MOVE  (r26v65 ?) = (r26v32 char) */
    /* JADX WARN: Type inference failed for: r5v100, assign insn: ?: MOVE  (r5v100 ?) = (r5v74 java.util.zip.ZipEntry) */
    /* JADX WARN: Type inference failed for: r5v103, assign insn: ?: MOVE  (r5v103 ?) = (r5v77 java.lang.String) */
    /* JADX WARN: Type inference failed for: r5v107, assign insn: ?: MOVE  (r5v107 ?) = (r5v85 java.lang.String) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(djz, java.io.File, java.io.File, bxvd, boolean):void
     arg types: [djz, java.io.File, java.io.File, bxvd, int]
     candidates:
      dgv.a(bxvd, java.io.File, dfz, java.util.Set, dkw):boolean
      dgv.a(dkw, java.util.Set, boolean, boolean, dks):boolean
      dgv.a(djz, java.io.File, java.io.File, bxvd, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a6, code lost:
        r15 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ac, code lost:
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r10 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03b8, code lost:
        r32 = r14;
        r26 = '9';
        r26 = '9';
        r26 = '9';
        r26 = '9';
        r26 = '9';
        r26 = 57;
        r26 = 57;
        r26 = '9';
        r26 = '9';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r15).length() + 57);
        r7.append("FileApk ");
        r7.append(r15);
        r7.append(" wants min-sdk ");
        r7.append(r2);
        r7.append(", but found ");
        r7.append(r10);
        android.util.Log.e("FileApkUtils", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0415, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0417, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0443, code lost:
        r30 = r10;
        r32 = r14;
        r26 = '9';
        r26 = 57;
        r26 = '9';
        r26 = '9';
        r26 = '9';
        r26 = '9';
        r26 = 57;
        r26 = 57;
        r26 = '9';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0457, code lost:
        r0 = th;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0465, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0477, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0494, code lost:
        r0 = th;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x049c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04a2, code lost:
        r0 = th;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x04d9, code lost:
        r0 = e;
        r26 = r26;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0140, code lost:
        if (r22 == false) goto L_0x0142;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0498 A[SYNTHETIC, Splitter:B:252:0x0498] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0592 A[SYNTHETIC, Splitter:B:306:0x0592] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0925 A[Catch:{ all -> 0x095c, all -> 0x0a32 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0a14  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0a3f  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0a4f  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0a6c  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0a9b  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0aae  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x04a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0182 A[SYNTHETIC, Splitter:B:65:0x0182] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    public final boolean mo8982a(dkw dkw, boolean z, bxvd bxvd, bxvd bxvd2, int i, List list, File file, dks dks) {
        Iterable iterable;
        String str;
        boolean z2;
        boolean z3;
        bxvd bxvd3;
        Iterator it;
        boolean z4;
        dkf dkf;
        File file2;
        int i2;
        int i3;
        String str2;
        bxvd bxvd4;
        int i4;
        int i5;
        bxvd bxvd5;
        dks dks2;
        boolean z5;
        File file3;
        Throwable th;
        File file4;
        File file5;
        dkf e;
        String str3;
        String str4;
        File file6;
        int i6;
        dgr dgr;
        char c;
        Integer a;
        bxvd bxvd6;
        dgr dgr2;
        PackageInfo packageInfo;
        String str5;
        File file7;
        dhs dhs;
        String str6;
        boolean z6;
        Integer num;
        String str7;
        String str8;
        String str9;
        String str10;
        Throwable th2;
        String str11;
        File file8;
        Throwable th3;
        FileOutputStream fileOutputStream;
        Throwable th4;
        Integer num2;
        char c2;
        Exception exc;
        char c3;
        ? r5;
        Throwable th5;
        dgr dgr3;
        int i7;
        dgr dgr4;
        File file9;
        String str12;
        String str13;
        ? r52;
        dgv dgv = this;
        bxvd bxvd7 = bxvd;
        bxvd bxvd8 = bxvd2;
        int i8 = i;
        File file10 = file;
        dks dks3 = dks;
        int size = list.size();
        if (dks3 != null) {
            iterable = new dgq(bngx.m109368a((Collection) list), dks3);
        } else {
            iterable = list;
        }
        Iterator it2 = iterable.iterator();
        boolean z7 = false;
        int i9 = 1;
        boolean z8 = false;
        boolean z9 = false;
        while (it2.hasNext()) {
            dgr dgr5 = (dgr) it2.next();
            if (z8) {
                bxvd7.mo73968a(i8, (dkd) bxvd2.mo74062i());
                if (!dgv.m8430a((dke) bxvd.mo74062i(), dks3)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            String a2 = dgr5.mo8971a();
            bxvd da = dkf.f13397i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z7;
            }
            dkf dkf2 = (dkf) da.f164949b;
            a2.getClass();
            dkf2.f13399a |= i9;
            dkf2.f13400b = a2;
            int binarySearch = Collections.binarySearch(Collections.unmodifiableList(((dkd) bxvd8.f164949b).f13385e), (dkf) da.mo74062i(), dha.f13092a);
            if (binarySearch >= 0) {
                dkf c4 = bxvd8.mo74034c(binarySearch);
                bxvd bxvd9 = (bxvd) c4.mo74142c(5);
                bxvd9.mo73625a((bxvk) c4);
                bxvd3 = bxvd9;
            } else {
                bxvd3 = da;
            }
            if (binarySearch < 0 || ((dkf) bxvd3.f164949b).f13403e) {
                z4 = z8;
            } else {
                z4 = z8;
                int binarySearch2 = Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd7.f164949b).f13395d), (dkf) bxvd3.mo74062i(), dha.f13093b);
                if (binarySearch2 >= 0) {
                    String str14 = ((dkf) bxvd3.f164949b).f13401c;
                    it = it2;
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 19 + String.valueOf(str14).length());
                    sb.append("Already staged: ");
                    sb.append(a2);
                    sb.append(" [");
                    sb.append(str14);
                    sb.append("]");
                    sb.toString();
                    dkf = bxvd7.mo74046e(binarySearch2);
                    if (dkf != null) {
                        try {
                            String valueOf = String.valueOf(a2);
                            if (valueOf.length() == 0) {
                                new String("Staging: ");
                            } else {
                                "Staging: ".concat(valueOf);
                            }
                            File file11 = new File(file10, "s");
                            if (file11.isDirectory()) {
                                File[] listFiles = file11.listFiles();
                                if (listFiles != null) {
                                    boolean z10 = true;
                                    for (File file12 : listFiles) {
                                        if (!dhb.m8476a(file12)) {
                                            z10 = false;
                                        }
                                    }
                                }
                                if (dha.m8460a(file10, file11) == null) {
                                    file4 = null;
                                } else if (!file11.mkdirs()) {
                                    Log.e("FileApkUtils", "Failed to create module scratch directory.");
                                    file4 = null;
                                }
                                if (file4 == null) {
                                    try {
                                        File file13 = new File(file4, a2);
                                        String a3 = dgr5.mo8972a(file13);
                                        if (a3 == null) {
                                            try {
                                                String valueOf2 = String.valueOf(a2);
                                                Log.e("FileApkMgr", valueOf2.length() == 0 ? new String("Failed to stage: ") : "Failed to stage: ".concat(valueOf2));
                                                dgd.m8382a(dgv.f12990a, 34);
                                                dhb.m8476a(file4);
                                                z8 = z4;
                                                it2 = it;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                file5 = file4;
                                                file3 = file5;
                                                if (file3 != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            if (bxvd3.f164950c) {
                                                bxvd3.mo74035c();
                                                bxvd3.f164950c = false;
                                            }
                                            dkf dkf3 = (dkf) bxvd3.f164949b;
                                            a3.getClass();
                                            String str15 = a2;
                                            int i10 = dkf3.f13399a | 2;
                                            dkf3.f13399a = i10;
                                            dkf3.f13401c = a3;
                                            dkf3.f13399a = i10 | 8;
                                            dkf3.f13403e = false;
                                            int binarySearch3 = Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd7.f164949b).f13395d), (dkf) bxvd3.mo74062i(), dha.f13093b);
                                            if (binarySearch3 < 0) {
                                                String absolutePath = file13.getAbsolutePath();
                                                String str16 = a3;
                                                PackageInfo packageArchiveInfo = dgv.f12990a.getPackageManager().getPackageArchiveInfo(absolutePath, 0);
                                                dhs a4 = dhs.m8523a(absolutePath);
                                                Context context = dgv.f12990a;
                                                dhs dhs2 = a4;
                                                if (packageArchiveInfo == null) {
                                                    String name = file13.getName();
                                                    dgd.m8383a(context, 38, name);
                                                    String valueOf3 = String.valueOf(name);
                                                    Log.e("FileApkMgr", valueOf3.length() == 0 ? new String("File is not a valid apk: ") : "File is not a valid apk: ".concat(valueOf3));
                                                    i2 = size;
                                                    file6 = file4;
                                                    str4 = str15;
                                                    str3 = str16;
                                                } else {
                                                    bxvd bxvd10 = bxvd3;
                                                    if (dkw.mo9238a(file13)) {
                                                        ? r26 = "^\\s*(.+?): \"(.*?)\"$";
                                                        Pattern compile = Pattern.compile(r26);
                                                        try {
                                                            ZipFile zipFile = new ZipFile(file13);
                                                            try {
                                                                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                                                                dgr = dgr5;
                                                                try {
                                                                    ? nrVar = new C1225nr();
                                                                    while (true) {
                                                                        i6 = entries.hasMoreElements();
                                                                        if (i6 == 0) {
                                                                            break;
                                                                        }
                                                                        try {
                                                                            i2 = size;
                                                                            try {
                                                                                String name2 = ((ZipEntry) entries.nextElement()).getName();
                                                                                if (name2.startsWith("lib/")) {
                                                                                    File parentFile = new File(name2).getParentFile();
                                                                                    if (parentFile != null) {
                                                                                        nrVar.add(parentFile.getName());
                                                                                        size = i2;
                                                                                    } else {
                                                                                        size = i2;
                                                                                    }
                                                                                } else {
                                                                                    size = i2;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                th5 = th;
                                                                                i6 = binarySearch3;
                                                                                file2 = file4;
                                                                                i3 = binarySearch;
                                                                                str13 = nrVar;
                                                                                c3 = '9';
                                                                                r52 = str13;
                                                                                try {
                                                                                    zipFile.close();
                                                                                } catch (Throwable th8) {
                                                                                    bqye.m113761a(th5, th8);
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            i2 = size;
                                                                            th5 = th;
                                                                            i6 = binarySearch3;
                                                                            file2 = file4;
                                                                            i3 = binarySearch;
                                                                            str13 = nrVar;
                                                                            c3 = '9';
                                                                            r52 = str13;
                                                                            zipFile.close();
                                                                            throw th5;
                                                                        }
                                                                    }
                                                                    i2 = size;
                                                                    try {
                                                                        int i11 = nrVar.f26758b;
                                                                        if (i11 == 1) {
                                                                            str12 = (String) nrVar.iterator().next();
                                                                        } else {
                                                                            if (i11 == 2) {
                                                                                if (nrVar.contains("arm64-v8a")) {
                                                                                    str12 = "arm64-v8a";
                                                                                } else if (nrVar.contains("x86_64")) {
                                                                                    str12 = "x86_64";
                                                                                }
                                                                            }
                                                                            str12 = null;
                                                                        }
                                                                        if (str12 != null) {
                                                                            try {
                                                                                int i12 = Build.VERSION.SDK_INT;
                                                                                List asList = Arrays.asList(Build.SUPPORTED_ABIS);
                                                                                if (!asList.contains(str12)) {
                                                                                    String valueOf4 = String.valueOf(file13);
                                                                                    String valueOf5 = String.valueOf(asList);
                                                                                    i3 = binarySearch;
                                                                                    try {
                                                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 36 + str12.length() + String.valueOf(valueOf5).length());
                                                                                        sb2.append("FileApk ");
                                                                                        sb2.append(valueOf4);
                                                                                        sb2.append(" wants ABI ");
                                                                                        sb2.append(str12);
                                                                                        sb2.append(", but found ABIs ");
                                                                                        sb2.append(valueOf5);
                                                                                        String sb3 = sb2.toString();
                                                                                        Log.e("FileApkUtils", sb3);
                                                                                        str12 = sb3;
                                                                                        try {
                                                                                            zipFile.close();
                                                                                            file2 = file4;
                                                                                        } catch (IOException | NumberFormatException e2) {
                                                                                            exc = e2;
                                                                                            i6 = binarySearch3;
                                                                                            file2 = file4;
                                                                                            c2 = '9';
                                                                                            file5 = sb3;
                                                                                            try {
                                                                                                String valueOf6 = String.valueOf(file13);
                                                                                                String message = exc.getMessage();
                                                                                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 35 + String.valueOf(message).length());
                                                                                                sb4.append("Failed to read module.yaml from : ");
                                                                                                sb4.append(valueOf6);
                                                                                                sb4.append(":");
                                                                                                sb4.append(message);
                                                                                                sb4.toString();
                                                                                                c = c2;
                                                                                                bmzs.m108696a(packageArchiveInfo);
                                                                                                a = dha.m8461a(file10, ((dke) bxvd7.f164949b).f13396e);
                                                                                                if (a != null) {
                                                                                                }
                                                                                                num = num2;
                                                                                                if (num == null) {
                                                                                                }
                                                                                                dhb.m8476a(file5);
                                                                                                dgv = this;
                                                                                                bxvd8 = bxvd2;
                                                                                                i8 = i;
                                                                                                dks3 = dks;
                                                                                                it2 = it;
                                                                                                size = i2;
                                                                                                z8 = true;
                                                                                                i9 = 1;
                                                                                                z7 = false;
                                                                                                z9 = true;
                                                                                            } catch (Throwable th10) {
                                                                                                th = th10;
                                                                                                th = th;
                                                                                                file3 = file5;
                                                                                                if (file3 != null) {
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            String valueOf7 = String.valueOf(file13.getName());
                                                                                            dgd.m8383a(context, 38, valueOf7.length() == 0 ? new String("compat:") : "compat:".concat(valueOf7));
                                                                                            str4 = str15;
                                                                                            str3 = str16;
                                                                                            file6 = file2;
                                                                                        } catch (Throwable th11) {
                                                                                            th = th11;
                                                                                            file5 = file2;
                                                                                        }
                                                                                    } catch (Throwable th12) {
                                                                                        th = th12;
                                                                                        str12 = str12;
                                                                                        th5 = th;
                                                                                        i6 = binarySearch3;
                                                                                        file2 = file4;
                                                                                        str13 = str12;
                                                                                        c3 = '9';
                                                                                        r52 = str13;
                                                                                        zipFile.close();
                                                                                        throw th5;
                                                                                    }
                                                                                } else {
                                                                                    i3 = binarySearch;
                                                                                }
                                                                            } catch (Throwable th13) {
                                                                                th = th13;
                                                                                i3 = binarySearch;
                                                                                th5 = th;
                                                                                i6 = binarySearch3;
                                                                                file2 = file4;
                                                                                str13 = str12;
                                                                                c3 = '9';
                                                                                r52 = str13;
                                                                                zipFile.close();
                                                                                throw th5;
                                                                            }
                                                                        } else {
                                                                            i3 = binarySearch;
                                                                        }
                                                                        r5 = "assets/module.yaml";
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        i7 = binarySearch3;
                                                                        dgr4 = nrVar;
                                                                        file9 = file4;
                                                                        i3 = binarySearch;
                                                                        dgr3 = dgr4;
                                                                        char c5 = '9';
                                                                        r5 = dgr3;
                                                                        th5 = th;
                                                                        c3 = c5;
                                                                        r52 = r5;
                                                                        zipFile.close();
                                                                        throw th5;
                                                                    }
                                                                } catch (Throwable th15) {
                                                                    th = th15;
                                                                    i7 = binarySearch3;
                                                                    i2 = size;
                                                                    dgr4 = dgr5;
                                                                    file9 = file4;
                                                                    i3 = binarySearch;
                                                                    dgr3 = dgr4;
                                                                    char c52 = '9';
                                                                    r5 = dgr3;
                                                                    th5 = th;
                                                                    c3 = c52;
                                                                    r52 = r5;
                                                                    zipFile.close();
                                                                    throw th5;
                                                                }
                                                                try {
                                                                    ZipEntry entry = zipFile.getEntry(r5);
                                                                    r5 = entry;
                                                                    if (entry == null) {
                                                                        str12 = "module.yaml";
                                                                        r5 = zipFile.getEntry(str12);
                                                                    }
                                                                    if (r5 != 0) {
                                                                        r5 = zipFile.getInputStream(r5);
                                                                        if (r5 != 0) {
                                                                            try {
                                                                                InputStreamReader inputStreamReader = new InputStreamReader(r5);
                                                                                try {
                                                                                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                                                                                    while (true) {
                                                                                        try {
                                                                                            String readLine = bufferedReader.readLine();
                                                                                            if (readLine == null) {
                                                                                                break;
                                                                                            }
                                                                                            Matcher matcher = compile.matcher(readLine);
                                                                                            if (matcher.matches()) {
                                                                                                Pattern pattern = compile;
                                                                                                String group = matcher.group(1);
                                                                                                String group2 = matcher.group(2);
                                                                                                if ("min_sdk".equals(group)) {
                                                                                                    int parseInt = Integer.parseInt(group2);
                                                                                                    if (parseInt > Build.VERSION.SDK_INT) {
                                                                                                        break;
                                                                                                    }
                                                                                                    compile = pattern;
                                                                                                } else {
                                                                                                    compile = pattern;
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th16) {
                                                                                            th = th16;
                                                                                            i6 = binarySearch3;
                                                                                            file2 = file4;
                                                                                            char c6 = '9';
                                                                                            Throwable th17 = th;
                                                                                            bufferedReader.close();
                                                                                            throw th17;
                                                                                        }
                                                                                    }
                                                                                    bmzs.m108696a(packageArchiveInfo);
                                                                                    a = dha.m8461a(file10, ((dke) bxvd7.f164949b).f13396e);
                                                                                    if (a != null) {
                                                                                        try {
                                                                                            str6 = str16;
                                                                                            dhs = dhs2;
                                                                                            file7 = file13;
                                                                                            packageInfo = packageArchiveInfo;
                                                                                            str5 = str15;
                                                                                            dgr2 = dgr;
                                                                                            num2 = a;
                                                                                            bxvd6 = bxvd10;
                                                                                            z6 = true;
                                                                                            z6 = true;
                                                                                        } catch (InvalidConfigException e3) {
                                                                                            e = e3;
                                                                                            file7 = file13;
                                                                                            packageInfo = packageArchiveInfo;
                                                                                            str5 = str15;
                                                                                            str6 = str16;
                                                                                            dhs = dhs2;
                                                                                            bxvd6 = bxvd10;
                                                                                            dgr2 = dgr;
                                                                                            num2 = a;
                                                                                            z6 = true;
                                                                                            Log.e("FileApkMgr", "Failed to get current config for cleanup", e);
                                                                                            num = num2;
                                                                                            if (num == null) {
                                                                                            }
                                                                                            dhb.m8476a(file5);
                                                                                            dgv = this;
                                                                                            bxvd8 = bxvd2;
                                                                                            i8 = i;
                                                                                            dks3 = dks;
                                                                                            it2 = it;
                                                                                            size = i2;
                                                                                            z8 = true;
                                                                                            i9 = 1;
                                                                                            z7 = false;
                                                                                            z9 = true;
                                                                                        }
                                                                                        try {
                                                                                            mo8976a(dfy.m8329a(this.f12990a).mo8898f(), file, this.f12991b, bxvd, false);
                                                                                            num = dha.m8461a(file10, ((dke) bxvd7.f164949b).f13396e);
                                                                                        } catch (InvalidConfigException e4) {
                                                                                            e = e4;
                                                                                            Log.e("FileApkMgr", "Failed to get current config for cleanup", e);
                                                                                            num = num2;
                                                                                            if (num == null) {
                                                                                            }
                                                                                            dhb.m8476a(file5);
                                                                                            dgv = this;
                                                                                            bxvd8 = bxvd2;
                                                                                            i8 = i;
                                                                                            dks3 = dks;
                                                                                            it2 = it;
                                                                                            size = i2;
                                                                                            z8 = true;
                                                                                            i9 = 1;
                                                                                            z7 = false;
                                                                                            z9 = true;
                                                                                        }
                                                                                    } else {
                                                                                        file7 = file13;
                                                                                        packageInfo = packageArchiveInfo;
                                                                                        str5 = str15;
                                                                                        str6 = str16;
                                                                                        dhs = dhs2;
                                                                                        bxvd6 = bxvd10;
                                                                                        dgr2 = dgr;
                                                                                        num2 = a;
                                                                                        z6 = true;
                                                                                        num = num2;
                                                                                    }
                                                                                    if (num == null) {
                                                                                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                                                                        int intValue = num.intValue();
                                                                                        boolean b = dgr2.mo8973b();
                                                                                        File b2 = dha.m8469b(file10, intValue);
                                                                                        if (b2.exists()) {
                                                                                            Log.e("FileApkMgr", "Module directory already exists.");
                                                                                            str7 = str6;
                                                                                            str8 = str5;
                                                                                            file5 = file2;
                                                                                        } else {
                                                                                            file5 = file2;
                                                                                            if (!file5.setExecutable(z6, false)) {
                                                                                                Log.e("FileApkMgr", "Failed to make module directory world traversable.");
                                                                                                str7 = str6;
                                                                                                str8 = str5;
                                                                                            } else if (b || file7.setReadable(z6, false)) {
                                                                                                int i13 = Build.VERSION.SDK_INT;
                                                                                                if (applicationInfo == null || (applicationInfo.flags & 268435456) != 0) {
                                                                                                    try {
                                                                                                        long currentTimeMillis = System.currentTimeMillis();
                                                                                                        File file14 = new File(file7.getParentFile(), "n");
                                                                                                        if (!file14.isDirectory()) {
                                                                                                            if (file14.mkdir()) {
                                                                                                                dhb.m8481d(file14);
                                                                                                                dhb.m8480c(file14);
                                                                                                            } else {
                                                                                                                throw new IOException("Failed to create native library root.");
                                                                                                            }
                                                                                                        }
                                                                                                        ZipFile zipFile2 = new ZipFile(file7);
                                                                                                        try {
                                                                                                            Enumeration<? extends ZipEntry> entries2 = zipFile2.entries();
                                                                                                            String str17 = c;
                                                                                                            while (entries2.hasMoreElements()) {
                                                                                                                try {
                                                                                                                    ZipEntry zipEntry = (ZipEntry) entries2.nextElement();
                                                                                                                    if (!zipEntry.getName().startsWith("lib/")) {
                                                                                                                        str17 = str5;
                                                                                                                    } else if (!zipEntry.isDirectory()) {
                                                                                                                        File file15 = new File(zipEntry.getName());
                                                                                                                        String name3 = file15.getName();
                                                                                                                        File parentFile2 = file15.getParentFile();
                                                                                                                        if (parentFile2 != null) {
                                                                                                                            Enumeration<? extends ZipEntry> enumeration = entries2;
                                                                                                                            String name4 = parentFile2.getName();
                                                                                                                            File file16 = new File(file14, name4);
                                                                                                                            if (!file16.exists()) {
                                                                                                                                int i14 = Build.VERSION.SDK_INT;
                                                                                                                                file8 = file14;
                                                                                                                                String[] strArr = Build.SUPPORTED_ABIS;
                                                                                                                                str11 = str6;
                                                                                                                                try {
                                                                                                                                    int length = strArr.length;
                                                                                                                                    str17 = str5;
                                                                                                                                    int i15 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        if (i15 >= length) {
                                                                                                                                            file14 = file8;
                                                                                                                                            entries2 = enumeration;
                                                                                                                                            str6 = str11;
                                                                                                                                            str5 = str17;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        int i16 = length;
                                                                                                                                        if (strArr[i15].equals(name4)) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i15++;
                                                                                                                                        length = i16;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th18) {
                                                                                                                                    th2 = th18;
                                                                                                                                    str7 = str11;
                                                                                                                                    str8 = str17;
                                                                                                                                    zipFile2.close();
                                                                                                                                    throw th2;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                file8 = file14;
                                                                                                                                str11 = str6;
                                                                                                                                str17 = str5;
                                                                                                                            }
                                                                                                                            File file17 = new File(file16, name3);
                                                                                                                            try {
                                                                                                                                InputStream inputStream = zipFile2.getInputStream(zipEntry);
                                                                                                                                if (inputStream != null) {
                                                                                                                                    try {
                                                                                                                                        File parentFile3 = file17.getParentFile();
                                                                                                                                        if (parentFile3 != null) {
                                                                                                                                            if (!parentFile3.exists()) {
                                                                                                                                                if (parentFile3.mkdirs()) {
                                                                                                                                                    dhb.m8481d(parentFile3);
                                                                                                                                                    dhb.m8480c(parentFile3);
                                                                                                                                                }
                                                                                                                                                inputStream.close();
                                                                                                                                                file14 = file8;
                                                                                                                                                entries2 = enumeration;
                                                                                                                                                str6 = str11;
                                                                                                                                                str5 = str17;
                                                                                                                                            }
                                                                                                                                            fileOutputStream = new FileOutputStream(file17);
                                                                                                                                            byte[] bArr = new byte[8192];
                                                                                                                                            while (true) {
                                                                                                                                                int read = inputStream.read(bArr);
                                                                                                                                                if (read == -1) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                fileOutputStream.write(bArr, 0, read);
                                                                                                                                            }
                                                                                                                                            fileOutputStream.close();
                                                                                                                                            dhb.m8481d(file17);
                                                                                                                                            dhb.m8480c(file17);
                                                                                                                                            inputStream.close();
                                                                                                                                            file14 = file8;
                                                                                                                                            entries2 = enumeration;
                                                                                                                                            str6 = str11;
                                                                                                                                            str5 = str17;
                                                                                                                                        } else {
                                                                                                                                            throw new IOException("No parent dir.");
                                                                                                                                        }
                                                                                                                                    } catch (IOException e5) {
                                                                                                                                        IOException iOException = e5;
                                                                                                                                        try {
                                                                                                                                            String absolutePath2 = file17.getAbsolutePath();
                                                                                                                                            String message2 = iOException.getMessage();
                                                                                                                                            StringBuilder sb5 = new StringBuilder(String.valueOf(absolutePath2).length() + 24 + String.valueOf(message2).length());
                                                                                                                                            sb5.append("Failed to extract to ");
                                                                                                                                            sb5.append(absolutePath2);
                                                                                                                                            sb5.append(" : ");
                                                                                                                                            sb5.append(message2);
                                                                                                                                            Log.w("ChimeraNativeLib", sb5.toString());
                                                                                                                                        } catch (Throwable th19) {
                                                                                                                                            th3 = th19;
                                                                                                                                            if (inputStream != null) {
                                                                                                                                                inputStream.close();
                                                                                                                                            }
                                                                                                                                            throw th3;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th20) {
                                                                                                                                        bqye.m113761a(th4, th20);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    throw new IOException("Can't open zip entry.");
                                                                                                                                }
                                                                                                                            } catch (IOException e6) {
                                                                                                                                IOException iOException2 = e6;
                                                                                                                                String absolutePath3 = file15.getAbsolutePath();
                                                                                                                                String message3 = iOException2.getMessage();
                                                                                                                                StringBuilder sb6 = new StringBuilder(String.valueOf(absolutePath3).length() + 24 + String.valueOf(message3).length());
                                                                                                                                sb6.append("Failed to extract to ");
                                                                                                                                sb6.append(absolutePath3);
                                                                                                                                sb6.append(" : ");
                                                                                                                                sb6.append(message3);
                                                                                                                                Log.w("ChimeraNativeLib", sb6.toString());
                                                                                                                                file14 = file8;
                                                                                                                                entries2 = enumeration;
                                                                                                                                str6 = str11;
                                                                                                                                str5 = str17;
                                                                                                                            } catch (Throwable th21) {
                                                                                                                                bqye.m113761a(th3, th21);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str17 = str5;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        str17 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th22) {
                                                                                                                    th2 = th22;
                                                                                                                    str7 = str6;
                                                                                                                    str8 = str5;
                                                                                                                    zipFile2.close();
                                                                                                                    throw th2;
                                                                                                                }
                                                                                                            }
                                                                                                            str10 = str6;
                                                                                                            str9 = str5;
                                                                                                        } catch (Throwable th23) {
                                                                                                            str7 = str6;
                                                                                                            str8 = str5;
                                                                                                            th2 = th23;
                                                                                                            zipFile2.close();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                        try {
                                                                                                            zipFile2.close();
                                                                                                            StringBuilder sb7 = new StringBuilder(57);
                                                                                                            sb7.append("Spent ");
                                                                                                            sb7.append(System.currentTimeMillis() - currentTimeMillis);
                                                                                                            sb7.append("ms extracting native libraries.");
                                                                                                            sb7.toString();
                                                                                                        } catch (IOException e7) {
                                                                                                            e = e7;
                                                                                                            str7 = str10;
                                                                                                            str8 = str9;
                                                                                                            Log.e("FileApkMgr", "Failed to extract all native libraries.", e);
                                                                                                            String valueOf8 = String.valueOf(num);
                                                                                                            StringBuilder sb8 = new StringBuilder(String.valueOf(str8).length() + 29 + str7.length() + String.valueOf(valueOf8).length());
                                                                                                            sb8.append("Failed to stage: ");
                                                                                                            sb8.append(str8);
                                                                                                            sb8.append(" [");
                                                                                                            sb8.append(str7);
                                                                                                            sb8.append("] with id ");
                                                                                                            sb8.append(valueOf8);
                                                                                                            Log.e("FileApkMgr", sb8.toString());
                                                                                                            dhb.m8476a(file5);
                                                                                                            dgv = this;
                                                                                                            bxvd8 = bxvd2;
                                                                                                            i8 = i;
                                                                                                            dks3 = dks;
                                                                                                            it2 = it;
                                                                                                            size = i2;
                                                                                                            z8 = true;
                                                                                                            i9 = 1;
                                                                                                            z7 = false;
                                                                                                            z9 = true;
                                                                                                        }
                                                                                                    } catch (IOException e8) {
                                                                                                        e = e8;
                                                                                                        str7 = str6;
                                                                                                        str8 = str5;
                                                                                                        Log.e("FileApkMgr", "Failed to extract all native libraries.", e);
                                                                                                        String valueOf82 = String.valueOf(num);
                                                                                                        StringBuilder sb82 = new StringBuilder(String.valueOf(str8).length() + 29 + str7.length() + String.valueOf(valueOf82).length());
                                                                                                        sb82.append("Failed to stage: ");
                                                                                                        sb82.append(str8);
                                                                                                        sb82.append(" [");
                                                                                                        sb82.append(str7);
                                                                                                        sb82.append("] with id ");
                                                                                                        sb82.append(valueOf82);
                                                                                                        Log.e("FileApkMgr", sb82.toString());
                                                                                                        dhb.m8476a(file5);
                                                                                                        dgv = this;
                                                                                                        bxvd8 = bxvd2;
                                                                                                        i8 = i;
                                                                                                        dks3 = dks;
                                                                                                        it2 = it;
                                                                                                        size = i2;
                                                                                                        z8 = true;
                                                                                                        i9 = 1;
                                                                                                        z7 = false;
                                                                                                        z9 = true;
                                                                                                    }
                                                                                                } else {
                                                                                                    str10 = str6;
                                                                                                    str9 = str5;
                                                                                                }
                                                                                                int i17 = Build.VERSION.SDK_INT;
                                                                                                if (!file5.renameTo(b2)) {
                                                                                                    Log.e("FileApkMgr", "Failed to rename module directory to final name. It won't be visible for module finding.");
                                                                                                    str7 = str10;
                                                                                                    str8 = str9;
                                                                                                } else {
                                                                                                    int intValue2 = num.intValue();
                                                                                                    bxvd4 = bxvd6;
                                                                                                    if (bxvd4.f164950c) {
                                                                                                        bxvd4.mo74035c();
                                                                                                        bxvd4.f164950c = false;
                                                                                                    }
                                                                                                    dkf dkf4 = (dkf) bxvd4.f164949b;
                                                                                                    int i18 = dkf4.f13399a | 4;
                                                                                                    dkf4.f13399a = i18;
                                                                                                    dkf4.f13402d = intValue2;
                                                                                                    if (dhs != null) {
                                                                                                        String str18 = dhs.f13182a;
                                                                                                        str18.getClass();
                                                                                                        int i19 = i18 | 32;
                                                                                                        dkf4.f13399a = i19;
                                                                                                        dkf4.f13405g = str18;
                                                                                                        String str19 = dhs.f13183b;
                                                                                                        str19.getClass();
                                                                                                        dkf4.f13399a = i19 | 64;
                                                                                                        dkf4.f13406h = str19;
                                                                                                    }
                                                                                                    dkf dkf5 = (dkf) bxvd4.mo74062i();
                                                                                                    bmxy.m108600b(true);
                                                                                                    int i20 = (-i6) - 1;
                                                                                                    if (bxvd7.f164950c) {
                                                                                                        bxvd.mo74035c();
                                                                                                        bxvd7.f164950c = false;
                                                                                                    }
                                                                                                    dke dke = (dke) bxvd7.f164949b;
                                                                                                    dke dke2 = dke.f13390f;
                                                                                                    dkf5.getClass();
                                                                                                    dke.mo9190b();
                                                                                                    dke.f13395d.add(i20, dkf5);
                                                                                                    int intValue3 = num.intValue() + 1;
                                                                                                    if (bxvd7.f164950c) {
                                                                                                        bxvd.mo74035c();
                                                                                                        bxvd7.f164950c = false;
                                                                                                    }
                                                                                                    dke dke3 = (dke) bxvd7.f164949b;
                                                                                                    dke3.f13392a |= 2;
                                                                                                    dke3.f13396e = intValue3;
                                                                                                    if (z) {
                                                                                                        m8429a(file10, dkf5);
                                                                                                    }
                                                                                                    StringBuilder sb9 = new StringBuilder(String.valueOf(str9).length() + 11 + str10.length());
                                                                                                    sb9.append("Staged: ");
                                                                                                    str2 = str9;
                                                                                                    sb9.append(str2);
                                                                                                    sb9.append(" [");
                                                                                                    sb9.append(str10);
                                                                                                    sb9.append("]");
                                                                                                    sb9.toString();
                                                                                                    e = dkf5;
                                                                                                }
                                                                                            } else {
                                                                                                Log.e("FileApkMgr", "Failed to make apk world readable.");
                                                                                                str7 = str6;
                                                                                                str8 = str5;
                                                                                            }
                                                                                        }
                                                                                        String valueOf822 = String.valueOf(num);
                                                                                        StringBuilder sb822 = new StringBuilder(String.valueOf(str8).length() + 29 + str7.length() + String.valueOf(valueOf822).length());
                                                                                        sb822.append("Failed to stage: ");
                                                                                        sb822.append(str8);
                                                                                        sb822.append(" [");
                                                                                        sb822.append(str7);
                                                                                        sb822.append("] with id ");
                                                                                        sb822.append(valueOf822);
                                                                                        Log.e("FileApkMgr", sb822.toString());
                                                                                    } else {
                                                                                        file5 = file2;
                                                                                        StringBuilder sb10 = new StringBuilder(String.valueOf(str5).length() + 20 + str6.length());
                                                                                        sb10.append("Failed to stage: ");
                                                                                        sb10.append(str5);
                                                                                        sb10.append(" [");
                                                                                        sb10.append(str6);
                                                                                        sb10.append("]");
                                                                                        Log.e("FileApkMgr", sb10.toString());
                                                                                    }
                                                                                    dhb.m8476a(file5);
                                                                                    dgv = this;
                                                                                    bxvd8 = bxvd2;
                                                                                    i8 = i;
                                                                                    dks3 = dks;
                                                                                    it2 = it;
                                                                                    size = i2;
                                                                                    z8 = true;
                                                                                } catch (Throwable th24) {
                                                                                    th = th24;
                                                                                    i6 = binarySearch3;
                                                                                    file2 = file4;
                                                                                    r26 = 57;
                                                                                    Throwable th25 = th;
                                                                                    inputStreamReader.close();
                                                                                    throw th25;
                                                                                }
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                                i6 = binarySearch3;
                                                                                file2 = file4;
                                                                                char c7 = '9';
                                                                                Throwable th27 = th;
                                                                                if (r5 == 0) {
                                                                                    r5.close();
                                                                                }
                                                                                throw th27;
                                                                            }
                                                                        } else {
                                                                            throw new IOException("Failed to open zip entry input stream.");
                                                                        }
                                                                    } else {
                                                                        i6 = binarySearch3;
                                                                        file2 = file4;
                                                                        c3 = '9';
                                                                        c = 57;
                                                                        c3 = '9';
                                                                        zipFile.close();
                                                                        bmzs.m108696a(packageArchiveInfo);
                                                                        a = dha.m8461a(file10, ((dke) bxvd7.f164949b).f13396e);
                                                                        if (a != null) {
                                                                        }
                                                                        num = num2;
                                                                        if (num == null) {
                                                                        }
                                                                        dhb.m8476a(file5);
                                                                        dgv = this;
                                                                        bxvd8 = bxvd2;
                                                                        i8 = i;
                                                                        dks3 = dks;
                                                                        it2 = it;
                                                                        size = i2;
                                                                        z8 = true;
                                                                    }
                                                                } catch (Throwable th28) {
                                                                    th = th28;
                                                                    i7 = binarySearch3;
                                                                    file9 = file4;
                                                                    dgr3 = r5;
                                                                    char c522 = '9';
                                                                    r5 = dgr3;
                                                                    th5 = th;
                                                                    c3 = c522;
                                                                    r52 = r5;
                                                                    zipFile.close();
                                                                    throw th5;
                                                                }
                                                            } catch (Throwable th29) {
                                                                th = th29;
                                                                dgr = dgr5;
                                                                i7 = binarySearch3;
                                                                i2 = size;
                                                                dgr4 = dgr5;
                                                                file9 = file4;
                                                                i3 = binarySearch;
                                                                dgr3 = dgr4;
                                                                char c5222 = '9';
                                                                r5 = dgr3;
                                                                th5 = th;
                                                                c3 = c5222;
                                                                r52 = r5;
                                                                zipFile.close();
                                                                throw th5;
                                                            }
                                                        } catch (IOException | NumberFormatException e9) {
                                                            e = e9;
                                                            dgr = dgr5;
                                                            i6 = binarySearch3;
                                                            i2 = size;
                                                            file2 = file4;
                                                            i3 = binarySearch;
                                                            char c8 = '9';
                                                            dgr dgr6 = dgr5;
                                                            exc = e;
                                                            c2 = c8;
                                                            file5 = dgr6;
                                                            String valueOf62 = String.valueOf(file13);
                                                            String message4 = exc.getMessage();
                                                            StringBuilder sb42 = new StringBuilder(String.valueOf(valueOf62).length() + 35 + String.valueOf(message4).length());
                                                            sb42.append("Failed to read module.yaml from : ");
                                                            sb42.append(valueOf62);
                                                            sb42.append(":");
                                                            sb42.append(message4);
                                                            sb42.toString();
                                                            c = c2;
                                                            bmzs.m108696a(packageArchiveInfo);
                                                            a = dha.m8461a(file10, ((dke) bxvd7.f164949b).f13396e);
                                                            if (a != null) {
                                                            }
                                                            if (num == null) {
                                                            }
                                                            dhb.m8476a(file5);
                                                            dgv = this;
                                                            bxvd8 = bxvd2;
                                                            i8 = i;
                                                            dks3 = dks;
                                                            it2 = it;
                                                            size = i2;
                                                            z8 = true;
                                                            i9 = 1;
                                                            z7 = false;
                                                            z9 = true;
                                                        }
                                                    } else {
                                                        i2 = size;
                                                        file6 = file4;
                                                        str4 = str15;
                                                        str3 = str16;
                                                        String name5 = file13.getName();
                                                        dgd.m8383a(context, 44, name5);
                                                        String valueOf9 = String.valueOf(name5);
                                                        Log.e("FileApkMgr", valueOf9.length() == 0 ? new String("File is not properly signed: ") : "File is not properly signed: ".concat(valueOf9));
                                                    }
                                                }
                                                StringBuilder sb11 = new StringBuilder(String.valueOf(str4).length() + 20 + str3.length());
                                                sb11.append("Failed to stage: ");
                                                sb11.append(str4);
                                                sb11.append(" [");
                                                sb11.append(str3);
                                                sb11.append("]");
                                                Log.e("FileApkMgr", sb11.toString());
                                                dhb.m8476a(file5);
                                                dgv = this;
                                                bxvd8 = bxvd2;
                                                i8 = i;
                                                dks3 = dks;
                                                it2 = it;
                                                size = i2;
                                                z8 = true;
                                            } else {
                                                String str20 = a3;
                                                bxvd4 = bxvd3;
                                                int i21 = binarySearch3;
                                                i2 = size;
                                                file5 = file4;
                                                i3 = binarySearch;
                                                str2 = str15;
                                                StringBuilder sb12 = new StringBuilder(String.valueOf(str2).length() + 19 + str20.length());
                                                sb12.append("Already staged: ");
                                                sb12.append(str2);
                                                sb12.append(" [");
                                                sb12.append(str20);
                                                sb12.append("]");
                                                sb12.toString();
                                                e = bxvd7.mo74046e(i21);
                                            }
                                            dhb.m8476a(file5);
                                            z4 = true;
                                        }
                                        i9 = 1;
                                        z7 = false;
                                        z9 = true;
                                    } catch (Throwable th30) {
                                        th = th30;
                                        file5 = file4;
                                        th = th;
                                        file3 = file5;
                                        if (file3 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    int i22 = size;
                                    file5 = file4;
                                    Log.e("FileApkMgr", "Failed to create scratch dir");
                                    dgv = this;
                                    bxvd8 = bxvd2;
                                    i8 = i;
                                    dks3 = dks;
                                    z8 = z4;
                                    it2 = it;
                                    size = i22;
                                    i9 = 1;
                                    z7 = false;
                                    z9 = true;
                                }
                            } else if (file11.exists() && !file11.delete()) {
                                Log.e("FileApkUtils", "Failed to delete file with name of module scratch directory.");
                                file4 = null;
                                if (file4 == null) {
                                }
                            } else if (!file11.mkdirs()) {
                                Log.e("FileApkUtils", "Failed to create module scratch directory.");
                                file4 = null;
                                if (file4 == null) {
                                }
                            }
                            file4 = file11;
                            if (file4 == null) {
                            }
                        } catch (Throwable th31) {
                            th = th31;
                            file3 = null;
                            if (file3 != null) {
                                dhb.m8476a(file3);
                            }
                            throw th;
                        }
                    } else {
                        bxvd4 = bxvd3;
                        i2 = size;
                        i3 = binarySearch;
                        str2 = a2;
                    }
                    i4 = ((dkf) bxvd4.f164949b).f13402d;
                    i5 = dkf.f13402d;
                    if (i4 != i5) {
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        dkf dkf6 = (dkf) bxvd4.f164949b;
                        dkf6.f13399a |= 4;
                        dkf6.f13402d = i5;
                        z4 = true;
                    }
                    if (i3 >= 0) {
                        dkf dkf7 = (dkf) bxvd4.mo74062i();
                        bmxy.m108600b(true);
                        int i23 = (-i3) - 1;
                        bxvd5 = bxvd2;
                        if (bxvd5.f164950c) {
                            bxvd2.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        dkd dkd = (dkd) bxvd5.f164949b;
                        dkd dkd2 = dkd.f13379j;
                        dkf7.getClass();
                        dkd.mo9188a();
                        dkd.f13385e.add(i23, dkf7);
                        z5 = true;
                    } else {
                        bxvd5 = bxvd2;
                        bxvd5.mo73969a(i3, (dkf) bxvd4.mo74062i());
                        z5 = z4;
                    }
                    dks2 = dks;
                    if (dks2 != null) {
                        synchronized (dks2.f13425c) {
                            try {
                                dks2.f13426d.remove(str2);
                                dks2.f13427e.add(str2);
                            } catch (Throwable th32) {
                                throw th32;
                            }
                        }
                    }
                    dgv = this;
                    i8 = i;
                    dks3 = dks2;
                    bxvd8 = bxvd5;
                    it2 = it;
                    size = i2;
                    i9 = 1;
                    z7 = false;
                }
            }
            it = it2;
            dkf = null;
            if (dkf != null) {
            }
            i4 = ((dkf) bxvd4.f164949b).f13402d;
            i5 = dkf.f13402d;
            if (i4 != i5) {
            }
            if (i3 >= 0) {
            }
            dks2 = dks;
            if (dks2 != null) {
            }
            dgv = this;
            i8 = i;
            dks3 = dks2;
            bxvd8 = bxvd5;
            it2 = it;
            size = i2;
            i9 = 1;
            z7 = false;
        }
        bxvd bxvd11 = bxvd8;
        dks dks4 = dks3;
        int i24 = size;
        boolean z11 = !z9;
        if (bxvd11.f164950c) {
            bxvd2.mo74035c();
            bxvd11.f164950c = false;
        }
        dkd dkd3 = (dkd) bxvd11.f164949b;
        dkd dkd4 = dkd.f13379j;
        dkd3.f13381a |= 4;
        dkd3.f13384d = z11;
        boolean z12 = z8 | z11;
        if (!z9) {
            ArrayList arrayList = new ArrayList(dkd3.f13385e.size());
            boolean z13 = false;
            for (dkf dkf8 : Collections.unmodifiableList(((dkd) bxvd11.f164949b).f13385e)) {
                if (!dkf8.f13403e) {
                    arrayList.add(dkf8);
                } else {
                    z13 = true;
                }
            }
            if (z13) {
                if (bxvd11.f164950c) {
                    bxvd2.mo74035c();
                    bxvd11.f164950c = false;
                }
                ((dkd) bxvd11.f164949b).f13385e = bxvk.m124030de();
                if (bxvd11.f164950c) {
                    bxvd2.mo74035c();
                    bxvd11.f164950c = false;
                }
                dkd dkd5 = (dkd) bxvd11.f164949b;
                dkd5.mo9188a();
                bxsy.m123078a(arrayList, dkd5.f13385e);
                z3 = true;
            } else {
                z3 = false;
            }
            z12 |= z3;
        }
        if (((dkd) bxvd11.f164949b).f13385e.size() != i24) {
            if (!bxvd11.f164950c) {
                z2 = false;
            } else {
                bxvd2.mo74035c();
                z2 = false;
                bxvd11.f164950c = false;
            }
            dkd dkd6 = (dkd) bxvd11.f164949b;
            dkd6.f13381a |= 4;
            dkd6.f13384d = z2;
        }
        dkd dkd7 = (dkd) bxvd11.f164949b;
        if (!dkd7.f13384d) {
            str = "incomplete";
        } else {
            str = "complete";
        }
        String str21 = dkd7.f13382b;
        StringBuilder sb13 = new StringBuilder(str.length() + 10 + String.valueOf(str21).length());
        sb13.append("Staging ");
        sb13.append(str);
        sb13.append(": ");
        sb13.append(str21);
        sb13.toString();
        if (!z12) {
            return false;
        }
        bxvd7.mo73968a(i, (dkd) bxvd2.mo74062i());
        m8430a((dke) bxvd.mo74062i(), dks4);
        return true;
        throw th4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(dkw, java.util.Set, boolean, boolean, dks):boolean
     arg types: [dkw, ?[OBJECT, ARRAY], int, boolean, dks]
     candidates:
      dgv.a(djz, java.io.File, java.io.File, bxvd, boolean):void
      dgv.a(bxvd, java.io.File, dfz, java.util.Set, dkw):boolean
      dgv.a(dkw, java.util.Set, boolean, boolean, dks):boolean */
    /* renamed from: a */
    public final boolean mo8983a(dkw dkw, boolean z, dks dks) {
        return mo8981a(dkw, (Set) null, false, z, dks);
    }

    /* renamed from: a */
    public final boolean mo8984a(File file, dke dke, boolean z) {
        boolean z2 = false;
        if (dft.m8316a(dke.mo73642k(), new File(file, "pending_fileapks.pb"), m8431b(file), false) > 0) {
            z2 = true;
        }
        aytw.m84814b();
        if (z && z2) {
            this.f12993d = true;
        }
        return z2;
    }

    /* renamed from: a */
    public final boolean mo8985a(Set set, dks dks, boolean z) {
        return mo8981a(dfq.m8315b(), set, z, dfq.m8314a().mo8862a(), dks);
    }
}
