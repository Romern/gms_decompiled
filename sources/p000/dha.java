package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dha {

    /* renamed from: a */
    static final Comparator f13092a = new dgw();

    /* renamed from: b */
    static final Comparator f13093b = new dgx();

    /* renamed from: c */
    public static final Comparator f13094c = new dgy();

    /* renamed from: a */
    public static int m8457a(bxvd bxvd, int i, dkd dkd) {
        bmxy.m108600b(true);
        int i2 = (-i) - 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        dke dke = (dke) bxvd.f164949b;
        dke dke2 = dke.f13390f;
        dkd.getClass();
        dke.mo9189a();
        dke.f13394c.add(i2, dkd);
        if (dkd.f13389i) {
            String str = dkd.f13388h;
            int i3 = 0;
            while (true) {
                if (i3 >= ((dke) bxvd.f164949b).f13394c.size()) {
                    break;
                }
                if (i3 != i2) {
                    dkd d = bxvd.mo74040d(i3);
                    if (d.f13389i && str.equals(d.f13388h)) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dke dke3 = (dke) bxvd.f164949b;
                        dke3.mo9189a();
                        dke3.f13394c.remove(i3);
                        if (i3 < i2) {
                            return i2 - 1;
                        }
                    }
                }
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static File m8469b(File file, int i) {
        return new File(file, String.format("%08x", Integer.valueOf(i)));
    }

    /* renamed from: c */
    public static void m8471c(File file) {
        if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to fix permissions; not a directory: ");
            sb.append(valueOf);
            Log.w("FileApkUtils", sb.toString());
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m8465a(file2, "n".equals(file2.getName()), 2);
            }
        }
        dhb.m8480c(file);
    }

    /* renamed from: b */
    public static void m8470b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 != null) {
                dhb.m8480c(parentFile2);
            }
            dhb.m8480c(parentFile);
        }
        dhb.m8480c(file);
    }

    /* renamed from: a */
    public static dhs m8458a(dkf dkf) {
        if (!dkf.f13405g.isEmpty() && !dkf.f13406h.isEmpty()) {
            return new dhs(dkf.f13405g, dkf.f13406h);
        }
        String valueOf = String.valueOf(dkf.f13402d);
        return new dhs(valueOf, valueOf);
    }

    /* renamed from: a */
    static File m8459a(File file, dkf dkf) {
        return new File(m8469b(file, dkf.f13402d), dkf.f13400b);
    }

    /* renamed from: a */
    static File m8460a(File file, File file2) {
        String name = file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
        sb.append("c-");
        sb.append(name);
        sb.append("-");
        sb.append(currentTimeMillis);
        File file3 = new File(file, sb.toString());
        if (file2.renameTo(file3)) {
            return file3;
        }
        String valueOf = String.valueOf(name);
        Log.e("FileApkUtils", valueOf.length() == 0 ? new String("Failed to condemn module directory: ") : "Failed to condemn module directory: ".concat(valueOf));
        return null;
    }

    /* renamed from: a */
    public static Integer m8461a(File file, int i) {
        int i2 = i + 1000;
        while (i < i2) {
            if (!m8469b(file, i).exists()) {
                return Integer.valueOf(i);
            }
            i++;
        }
        Log.e("FileApkUtils", "No unique module IDs available");
        return null;
    }

    /* renamed from: a */
    static String m8462a(AssetManager assetManager, String str, File file) {
        FileOutputStream fileOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InputStream open = assetManager.open(str);
            try {
                dku a = dku.m8755a("SHA-256");
                try {
                    fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        a.update(bArr, 0, read);
                        fileOutputStream.write(bArr, 0, read);
                    }
                    String a2 = m8464a(a.digest());
                    fileOutputStream.close();
                    a.mo9223a();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                    sb.append("Spent ");
                    sb.append(currentTimeMillis2);
                    sb.append("ms copying ");
                    sb.append(str);
                    sb.append(" and computing apk ");
                    sb.append("SHA-256");
                    sb.append(".");
                    sb.toString();
                    if (open != null) {
                        open.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    a.mo9223a();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (open != null) {
                    open.close();
                }
                throw th2;
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
            sb2.append("Failed to stage asset ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(valueOf);
            Log.e("FileApkUtils", sb2.toString());
            return null;
        } catch (Throwable th3) {
            bqye.m113761a(th2, th3);
        }
    }

    /* renamed from: a */
    static String m8463a(File file) {
        dku a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a = dku.m8755a("SHA-256");
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        String a2 = m8464a(a.digest());
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb = new StringBuilder(51);
                        sb.append("Spent ");
                        sb.append(currentTimeMillis2);
                        sb.append("ms computing apk ");
                        sb.append("SHA-256");
                        sb.append(".");
                        sb.toString();
                        a.mo9223a();
                        fileInputStream.close();
                        return a2;
                    }
                    a.update(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException | NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FileApkUtils", valueOf.length() == 0 ? new String("Failed to compute SHA-256: ") : "Failed to compute SHA-256: ".concat(valueOf));
            return null;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* renamed from: a */
    public static String m8464a(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b = bArr[i3];
            int i5 = (b >> 4) & 15;
            int i6 = i4 + 1;
            if (i5 >= 10) {
                i = i5 + 87;
            } else {
                i = i5 + 48;
            }
            cArr[i4] = (char) i;
            byte b2 = b & 15;
            int i7 = i6 + 1;
            if (b2 >= 10) {
                i2 = b2 + 87;
            } else {
                i2 = b2 + 48;
            }
            cArr[i6] = (char) i2;
            i3++;
            i4 = i7;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static void m8465a(File file, boolean z, int i) {
        File[] listFiles;
        if (file.isDirectory()) {
            if (z) {
                dhb.m8481d(file);
            }
            dhb.m8480c(file);
            if (i > 0 && (listFiles = file.listFiles()) != null) {
                int length = listFiles.length;
                for (int i2 = 0; i2 < length; i2++) {
                    m8465a(listFiles[i2], z, i - 1);
                }
            }
        } else if (file.isFile()) {
            dhb.m8481d(file);
            if (z) {
                dhb.m8480c(file);
            }
        }
    }

    /* renamed from: a */
    public static void m8466a(String str) {
        File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 != null) {
                m8470b(parentFile2);
            }
            if (!dhb.m8479b(parentFile)) {
                m8471c(parentFile);
            }
        }
    }

    /* renamed from: a */
    public static boolean m8467a(bxvd bxvd) {
        C1225nr nrVar = new C1225nr(8);
        Iterator it = Collections.unmodifiableList(((dke) bxvd.f164949b).f13394c).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bxwc bxwc = ((dkd) it.next()).f13385e;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                nrVar.add(((dkf) bxwc.get(i)).f13401c);
            }
        }
        ArrayList arrayList = new ArrayList(((dke) bxvd.f164949b).f13395d.size());
        boolean z = false;
        for (dkf dkf : Collections.unmodifiableList(((dke) bxvd.f164949b).f13395d)) {
            if (!nrVar.contains(dkf.f13401c)) {
                String str = dkf.f13401c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
                sb.append("Unreferenced module digest: [");
                sb.append(str);
                sb.append("]");
                sb.toString();
                z = true;
            } else {
                arrayList.add(dkf);
            }
        }
        if (!z) {
            return false;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        dke dke = dke.f13390f;
        ((dke) bxvd.f164949b).f13395d = GeneratedMessageLite.m124030de();
        bxvd.mo74070j(arrayList);
        return true;
    }

    /* renamed from: a */
    static boolean m8468a(bxvd bxvd, dfz dfz, Set set) {
        bxvd bxvd2 = bxvd;
        int i = 8;
        C1245ok okVar = new C1245ok(8);
        okVar.put(((dhc) dfz).f13095a, dfz);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dht dht = (dht) it.next();
                if (dht instanceof dhc) {
                    dhc dhc = (dhc) dht;
                    okVar.put(dhc.f13095a, dhc);
                }
            }
        }
        ArrayList arrayList = new ArrayList(((dke) bxvd2.f164949b).f13394c.size());
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < ((dke) bxvd2.f164949b).f13394c.size()) {
            dkd d = bxvd2.mo74040d(i2);
            bxvd bxvd3 = (bxvd) d.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) d);
            dkd dkd = (dkd) bxvd3.f164949b;
            if (dkd.f13389i) {
                String str = dkd.f13382b;
                dhc dhc2 = (dhc) okVar.get(dkd.f13388h);
                if (dhc2 != null) {
                    String m = dhc2.mo9029m();
                    if (m != null && !m.equals(((dkd) bxvd3.f164949b).f13382b)) {
                        if (m.length() == 0) {
                            new String("Staged apk new location: ");
                        } else {
                            "Staged apk new location: ".concat(m);
                        }
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        dkd dkd2 = (dkd) bxvd3.f164949b;
                        dkd dkd3 = dkd.f13379j;
                        m.getClass();
                        int i3 = dkd2.f13381a | 1;
                        dkd2.f13381a = i3;
                        dkd2.f13382b = m;
                        dkd2.f13381a = i3 | 4;
                        dkd2.f13384d = false;
                        for (int i4 = 0; i4 < ((dkd) bxvd3.f164949b).f13385e.size(); i4++) {
                            dkf c = bxvd3.mo74034c(i4);
                            bxvd bxvd4 = (bxvd) c.mo74142c(5);
                            bxvd4.mo73625a((GeneratedMessageLite) c);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            dkf dkf = (dkf) bxvd4.f164949b;
                            dkf dkf2 = dkf.f13397i;
                            dkf.f13399a |= i;
                            dkf.f13403e = true;
                            bxvd3.mo73969a(i4, (dkf) bxvd4.mo74062i());
                        }
                        z = true;
                    }
                } else {
                    int a = dkc.m8723a(((dkd) bxvd3.f164949b).f13387g);
                    if (!(a == 0 || a != 4 || set == null)) {
                        String valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            new String("Staged installed APK removed: ");
                        } else {
                            "Staged installed APK removed: ".concat(valueOf);
                        }
                        z2 = true;
                        i2++;
                        i = 8;
                    }
                }
            }
            dkd dkd4 = (dkd) bxvd3.f164949b;
            if (dkd4.f13384d) {
                Iterator it2 = Collections.unmodifiableList(dkd4.f13385e).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd2.f164949b).f13395d), (dkf) it2.next(), f13093b) < 0) {
                        String valueOf2 = String.valueOf(((dkd) bxvd3.f164949b).f13382b);
                        if (valueOf2.length() == 0) {
                            new String("Staging now incomplete: ");
                        } else {
                            "Staging now incomplete: ".concat(valueOf2);
                        }
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        dkd dkd5 = (dkd) bxvd3.f164949b;
                        dkd dkd6 = dkd.f13379j;
                        dkd5.f13381a |= 4;
                        dkd5.f13384d = false;
                        z3 = true;
                    }
                }
            }
            int a2 = dkc.m8723a(((dkd) bxvd3.f164949b).f13387g);
            if (a2 != 0 && a2 == 5 && !((dkd) bxvd3.f164949b).f13384d) {
                z2 = true;
                i2++;
                i = 8;
            } else {
                dkd dkd7 = (dkd) bxvd3.mo74062i();
                bxvd2.mo73968a(i2, dkd7);
                arrayList.add(dkd7);
                i2++;
                i = 8;
            }
        }
        if (z) {
            Collections.sort(arrayList, f13094c);
        } else if (!z2) {
            return z3;
        }
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        dke dke = dke.f13390f;
        ((dke) bxvd2.f164949b).f13394c = GeneratedMessageLite.m124030de();
        bxvd2.mo74075k(arrayList);
        return true;
    }
}
