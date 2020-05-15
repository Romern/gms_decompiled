package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

/* renamed from: emw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class emw extends enb {

    /* renamed from: a */
    private static final ArrayList f15308a = new ArrayList(Arrays.asList(1, 2));

    /* renamed from: b */
    private static final ArrayList f15309b = new ArrayList(Arrays.asList(1, 2, 3));

    /* renamed from: c */
    private static final Set f15310c = Collections.singleton("com.google.android.gms");

    /* renamed from: d */
    private final Context f15311d;

    /* renamed from: e */
    private final emu f15312e;

    /* renamed from: f */
    private final emt f15313f;

    /* renamed from: g */
    private final emv f15314g;

    /* renamed from: h */
    private final ArrayList f15315h = new ArrayList();

    /* renamed from: i */
    private final qon f15316i;

    public emw(Context context, emu emu, emt emt, emv emv, qon qon) {
        this.f15311d = context;
        this.f15312e = emu;
        this.f15313f = emt;
        this.f15314g = emv;
        this.f15316i = qon;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: emw.a(java.lang.String, java.lang.String, boolean):int
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      emw.a(java.util.List, int, ok):ok
      emw.a(int, int, emn):void
      emw.a(emn, long, long):void
      enb.a(int, android.os.Parcel, android.os.Parcel):boolean
      dck.a(int, android.os.Parcel, android.os.Parcel):boolean
      emw.a(java.lang.String, java.lang.String, boolean):int */
    /* renamed from: a */
    private final int m10701a(String str, String str2) {
        return m10702a(str, str2, true);
    }

    /* renamed from: b */
    private static int m10716b(C1245ok okVar) {
        int i = 0;
        for (int i2 = 0; i2 < okVar.f26809h; i2++) {
            if (((emn) okVar.mo15621c(i2)).f15288q >= i) {
                i = ((emn) okVar.mo15621c(i2)).f15288q + 1;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m10722c(emn emn) {
        if (emn.f15282k == null) {
            return emn.f15279h == null ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: d */
    private static Bundle m10724d(emn emn) {
        Bundle bundle = new Bundle();
        bundle.putString("name", emn.f15272a);
        bundle.putString("version_code", emn.f15273b);
        bundle.putLong("download_size", m10717b(emn));
        return bundle;
    }

    /* renamed from: e */
    private static int m10726e(emn emn) {
        if (emn.f15289r == null) {
            return 6;
        }
        int i = emn.f15290s;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 8) {
            return i != 16 ? 0 : 1;
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0803, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0808, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x080b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x080c, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0869, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x087f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05d8 A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05da A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x060f A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x061d A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0869 A[ExcHandler: all (th java.lang.Throwable), PHI: r13 10  PHI: (r13v23 enm) = (r13v24 enm), (r13v24 enm), (r13v6 enm), (r13v6 enm), (r13v6 enm) binds: [B:199:0x04a1, B:200:?, B:148:0x032d, B:197:0x049e, B:198:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x032d] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0885 A[ExcHandler: Exception (e java.lang.Exception), PHI: r13 10  PHI: (r13v22 enm) = (r13v6 enm), (r13v6 enm), (r13v6 enm), (r13v6 enm), (r13v29 enm) binds: [B:122:0x02b0, B:123:?, B:124:0x02b2, B:133:0x02c1, B:136:0x02c9] A[DONT_GENERATE, DONT_INLINE], Splitter:B:122:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0932 A[Catch:{ enk -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0938 A[Catch:{ enk -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0b31  */
    /* renamed from: f */
    private final int m10728f(emn emn) {
        FileOutputStream fileOutputStream;
        enm enm;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        Throwable th;
        int i;
        enl enl;
        emw emw;
        X509Certificate[][] x509CertificateArr;
        emw emw2;
        Signature[] signatureArr;
        ArrayList arrayList;
        int i2;
        ArrayList<X509Certificate> arrayList2;
        enk enk;
        File file;
        String str;
        String str2;
        blkq blkq;
        String str3;
        String str4;
        String str5;
        long j;
        InputStream inputStream;
        emw emw3 = this;
        emn emn2 = emn;
        String str6 = "Module '";
        emw3.m10711a(6, 0, emn2);
        File a = emw3.f15314g.mo10296a();
        if (a == null) {
            Log.e("DynamicModuleDownloader", "No module root");
            return 0;
        } else if (!m10715a(a, emn2.f15275d)) {
            Log.e("DynamicModuleDownloader", "low disk");
            return 0;
        } else {
            File file2 = new File(a, emv.m10695c(emn));
            eni.m10769a(file2);
            try {
                ParcelFileDescriptor a2 = emw3.f15312e.mo10291a(emn2.f15289r.longValue());
                autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(a2);
                try {
                    long statSize = a2.getStatSize();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        enm = new enm(fileOutputStream2);
                        try {
                            if (emn2.f15282k != null) {
                                try {
                                    if (((long) autoCloseInputStream.available()) == emn2.f15283l.longValue()) {
                                        try {
                                            if (emn2.f15287p == null) {
                                                try {
                                                    Log.i("DynamicModuleDownloader", "Using cached base module file.");
                                                    file = new File(emw3.f15314g.mo10296a(), emv.m10694b(emn2.f15272a, emn2.f15285n));
                                                } catch (enk e) {
                                                    enk = e;
                                                    str6 = "'.";
                                                    Log.e("DynamicModuleDownloader", enk.getMessage());
                                                    String str7 = emn2.f15272a;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 45);
                                                    sb.append("Requesting compressed download for module '");
                                                    sb.append(str7);
                                                    sb.append(str6);
                                                    Log.i("DynamicModuleDownloader", sb.toString());
                                                    m10714a(enm);
                                                    m10714a(fileOutputStream2);
                                                    m10714a(autoCloseInputStream);
                                                    i = 4;
                                                    if (i != 2) {
                                                    }
                                                    return i;
                                                }
                                            } else {
                                                Log.i("DynamicModuleDownloader", "Using base module file stored externally.");
                                                file = new File(emn2.f15287p);
                                            }
                                            try {
                                                String str8 = enn.m10771a(new FileInputStream(file), null, 1).f15326b;
                                                if (str8 != null) {
                                                    if (!str8.equals(emn2.f15286o)) {
                                                        String str9 = emn2.f15272a;
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 55);
                                                        sb2.append("Base module file for module '");
                                                        sb2.append(str9);
                                                        sb2.append("' has incorrect SHA1 hash.");
                                                        Log.e("DynamicModuleDownloader", sb2.toString());
                                                        String valueOf = String.valueOf(emn2.f15286o);
                                                        Log.e("DynamicModuleDownloader", valueOf.length() == 0 ? new String("Expected: ") : "Expected: ".concat(valueOf));
                                                        Log.e("DynamicModuleDownloader", str8.length() == 0 ? new String("Obtained: ") : "Obtained: ".concat(str8));
                                                        file = null;
                                                    }
                                                }
                                            } catch (IOException e2) {
                                                Log.e("DynamicModuleDownloader", "Base module file could not be read while computing its hash.");
                                                file = null;
                                            }
                                            if (file != null) {
                                                try {
                                                    int intValue = emn2.f15284m.intValue();
                                                    InputStream gZIPInputStream = (intValue == 2 || intValue == 3 || intValue == 4) ? new GZIPInputStream(autoCloseInputStream, 8192) : emn2.f15284m.intValue() == 5 ? new bqik(autoCloseInputStream) : autoCloseInputStream;
                                                    if (file.exists()) {
                                                        try {
                                                            int intValue2 = emn2.f15284m.intValue();
                                                            if (intValue2 == 1 || intValue2 == 2) {
                                                                try {
                                                                    long j2 = emn2.f15275d;
                                                                    blku a3 = blku.m107310a(file);
                                                                    try {
                                                                        byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
                                                                        str = "'.";
                                                                        try {
                                                                            str5 = str6;
                                                                            try {
                                                                                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(gZIPInputStream, 4096));
                                                                                int readInt = dataInputStream.readInt();
                                                                                if (readInt != -771763713) {
                                                                                    String valueOf2 = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
                                                                                    throw new blkq(valueOf2.length() == 0 ? new String("Unexpected magic=") : "Unexpected magic=".concat(valueOf2));
                                                                                }
                                                                                int read = dataInputStream.read();
                                                                                if (read == 4) {
                                                                                    long j3 = 0;
                                                                                    while (true) {
                                                                                        long j4 = j2 - j3;
                                                                                        try {
                                                                                            int read2 = dataInputStream.read();
                                                                                            if (read2 == -1) {
                                                                                                emw3 = this;
                                                                                                try {
                                                                                                    throw new IOException("Patch file overrun");
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                    Throwable th3 = th;
                                                                                                    try {
                                                                                                        enm.flush();
                                                                                                        throw th3;
                                                                                                    } catch (Throwable th4) {
                                                                                                        th = th4;
                                                                                                        Throwable th5 = th;
                                                                                                        try {
                                                                                                            a3.close();
                                                                                                        } catch (Throwable th6) {
                                                                                                            try {
                                                                                                                bqye.m113761a(th5, th6);
                                                                                                            } catch (blkq e3) {
                                                                                                                e = e3;
                                                                                                                blkq = e;
                                                                                                                str2 = str5;
                                                                                                                String str10 = emn2.f15272a;
                                                                                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str10).length() + 35);
                                                                                                                sb3.append(str2);
                                                                                                                sb3.append(str10);
                                                                                                                sb3.append("' patch content is invalid.");
                                                                                                                Log.e("DynamicModuleDownloader", sb3.toString());
                                                                                                                String valueOf3 = String.valueOf(blkq.getMessage());
                                                                                                                Log.e("DynamicModuleDownloader", valueOf3.length() != 0 ? new String("Error message: ") : "Error message: ".concat(valueOf3));
                                                                                                                emw3.m10711a(8, -1014, emn2);
                                                                                                                emw3.m10711a(13, -1014, emn2);
                                                                                                                str6 = str;
                                                                                                                String str11 = emn2.f15272a;
                                                                                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str11).length() + 39);
                                                                                                                sb4.append("Patch application failed for module '");
                                                                                                                sb4.append(str11);
                                                                                                                sb4.append(str6);
                                                                                                                throw new enk(sb4.toString());
                                                                                                            } catch (IOException e4) {
                                                                                                                str4 = str5;
                                                                                                                String str12 = emn2.f15272a;
                                                                                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str12).length() + 44);
                                                                                                                sb5.append(str4);
                                                                                                                sb5.append(str12);
                                                                                                                sb5.append("' patch failed with an IO-Exception.");
                                                                                                                Log.e("DynamicModuleDownloader", sb5.toString());
                                                                                                                emw3.m10711a(8, -1015, emn2);
                                                                                                                emw3.m10711a(13, -1015, emn2);
                                                                                                                str6 = str;
                                                                                                                String str112 = emn2.f15272a;
                                                                                                                StringBuilder sb42 = new StringBuilder(String.valueOf(str112).length() + 39);
                                                                                                                sb42.append("Patch application failed for module '");
                                                                                                                sb42.append(str112);
                                                                                                                sb42.append(str6);
                                                                                                                throw new enk(sb42.toString());
                                                                                                            } catch (Exception e5) {
                                                                                                                try {
                                                                                                                    String str13 = emn2.f15272a;
                                                                                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(str13).length() + 48);
                                                                                                                    sb6.append(str5);
                                                                                                                    sb6.append(str13);
                                                                                                                    sb6.append("' patch failed with a generic exception.");
                                                                                                                    Log.e("DynamicModuleDownloader", sb6.toString());
                                                                                                                    emw3.m10711a(8, -1016, emn2);
                                                                                                                    emw3.m10711a(13, -1016, emn2);
                                                                                                                    str6 = str;
                                                                                                                    String str1122 = emn2.f15272a;
                                                                                                                    StringBuilder sb422 = new StringBuilder(String.valueOf(str1122).length() + 39);
                                                                                                                    sb422.append("Patch application failed for module '");
                                                                                                                    sb422.append(str1122);
                                                                                                                    sb422.append(str6);
                                                                                                                    throw new enk(sb422.toString());
                                                                                                                } catch (enk e6) {
                                                                                                                    e = e6;
                                                                                                                    enk = e;
                                                                                                                    str6 = str;
                                                                                                                    Log.e("DynamicModuleDownloader", enk.getMessage());
                                                                                                                    String str72 = emn2.f15272a;
                                                                                                                    StringBuilder sb7 = new StringBuilder(String.valueOf(str72).length() + 45);
                                                                                                                    sb7.append("Requesting compressed download for module '");
                                                                                                                    sb7.append(str72);
                                                                                                                    sb7.append(str6);
                                                                                                                    Log.i("DynamicModuleDownloader", sb7.toString());
                                                                                                                    m10714a(enm);
                                                                                                                    m10714a(fileOutputStream2);
                                                                                                                    m10714a(autoCloseInputStream);
                                                                                                                    i = 4;
                                                                                                                    if (i != 2) {
                                                                                                                    }
                                                                                                                    return i;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        throw th5;
                                                                                                    }
                                                                                                }
                                                                                            } else if (read2 != 0) {
                                                                                                switch (read2) {
                                                                                                    case 247:
                                                                                                        j = j2;
                                                                                                        read2 = dataInputStream.readUnsignedShort();
                                                                                                        blks.m107308a(bArr, dataInputStream, enm, read2, j4);
                                                                                                        break;
                                                                                                    case 248:
                                                                                                        j = j2;
                                                                                                        read2 = dataInputStream.readInt();
                                                                                                        blks.m107308a(bArr, dataInputStream, enm, read2, j4);
                                                                                                        break;
                                                                                                    case 249:
                                                                                                        j = j2;
                                                                                                        long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                                                                                        read2 = dataInputStream.read();
                                                                                                        if (read2 != -1) {
                                                                                                            blks.m107307a(bArr, a3, enm, readUnsignedShort, read2, j4);
                                                                                                            break;
                                                                                                        } else {
                                                                                                            throw new IOException("Unexpected end of patch");
                                                                                                        }
                                                                                                    case 250:
                                                                                                        j = j2;
                                                                                                        read2 = dataInputStream.readUnsignedShort();
                                                                                                        blks.m107307a(bArr, a3, enm, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                                                                                        break;
                                                                                                    case 251:
                                                                                                        j = j2;
                                                                                                        read2 = dataInputStream.readInt();
                                                                                                        blks.m107307a(bArr, a3, enm, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                                                                                        break;
                                                                                                    case 252:
                                                                                                        j = j2;
                                                                                                        long readInt2 = (long) dataInputStream.readInt();
                                                                                                        read2 = dataInputStream.read();
                                                                                                        if (read2 != -1) {
                                                                                                            blks.m107307a(bArr, a3, enm, readInt2, read2, j4);
                                                                                                            break;
                                                                                                        } else {
                                                                                                            throw new IOException("Unexpected end of patch");
                                                                                                        }
                                                                                                    case 253:
                                                                                                        j = j2;
                                                                                                        read2 = dataInputStream.readUnsignedShort();
                                                                                                        blks.m107307a(bArr, a3, enm, (long) dataInputStream.readInt(), read2, j4);
                                                                                                        break;
                                                                                                    case 254:
                                                                                                        j = j2;
                                                                                                        long readInt3 = (long) dataInputStream.readInt();
                                                                                                        read2 = dataInputStream.readInt();
                                                                                                        blks.m107307a(bArr, a3, enm, readInt3, read2, j4);
                                                                                                        break;
                                                                                                    case 255:
                                                                                                        long readLong = dataInputStream.readLong();
                                                                                                        read2 = dataInputStream.readInt();
                                                                                                        blks.m107307a(bArr, a3, enm, readLong, read2, j4);
                                                                                                        j = j2;
                                                                                                        break;
                                                                                                    default:
                                                                                                        blks.m107308a(bArr, dataInputStream, enm, read2, j4);
                                                                                                        j = j2;
                                                                                                        break;
                                                                                                }
                                                                                                j3 += (long) read2;
                                                                                                j2 = j;
                                                                                            } else {
                                                                                                enm.flush();
                                                                                                a3.close();
                                                                                            }
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            emw3 = this;
                                                                                            Throwable th32 = th;
                                                                                            enm.flush();
                                                                                            throw th32;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    StringBuilder sb8 = new StringBuilder(30);
                                                                                    sb8.append("Unexpected version=");
                                                                                    sb8.append(read);
                                                                                    throw new blkq(sb8.toString());
                                                                                }
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                emw3 = this;
                                                                                Throwable th52 = th;
                                                                                a3.close();
                                                                                throw th52;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            emw3 = this;
                                                                            str5 = str6;
                                                                            Throwable th522 = th;
                                                                            a3.close();
                                                                            throw th522;
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        emw3 = this;
                                                                        str5 = str6;
                                                                        str = "'.";
                                                                        Throwable th5222 = th;
                                                                        a3.close();
                                                                        throw th5222;
                                                                    }
                                                                } catch (blkq e7) {
                                                                    e = e7;
                                                                    emw3 = this;
                                                                    str3 = "'.";
                                                                    str2 = str6;
                                                                    blkq = e;
                                                                    String str102 = emn2.f15272a;
                                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(str102).length() + 35);
                                                                    sb32.append(str2);
                                                                    sb32.append(str102);
                                                                    sb32.append("' patch content is invalid.");
                                                                    Log.e("DynamicModuleDownloader", sb32.toString());
                                                                    String valueOf32 = String.valueOf(blkq.getMessage());
                                                                    Log.e("DynamicModuleDownloader", valueOf32.length() != 0 ? new String("Error message: ") : "Error message: ".concat(valueOf32));
                                                                    emw3.m10711a(8, -1014, emn2);
                                                                    emw3.m10711a(13, -1014, emn2);
                                                                    str6 = str;
                                                                    String str11222 = emn2.f15272a;
                                                                    StringBuilder sb4222 = new StringBuilder(String.valueOf(str11222).length() + 39);
                                                                    sb4222.append("Patch application failed for module '");
                                                                    sb4222.append(str11222);
                                                                    sb4222.append(str6);
                                                                    throw new enk(sb4222.toString());
                                                                } catch (IOException e8) {
                                                                    emw3 = this;
                                                                    str = "'.";
                                                                    str4 = str6;
                                                                    String str122 = emn2.f15272a;
                                                                    StringBuilder sb52 = new StringBuilder(String.valueOf(str122).length() + 44);
                                                                    sb52.append(str4);
                                                                    sb52.append(str122);
                                                                    sb52.append("' patch failed with an IO-Exception.");
                                                                    Log.e("DynamicModuleDownloader", sb52.toString());
                                                                    emw3.m10711a(8, -1015, emn2);
                                                                    emw3.m10711a(13, -1015, emn2);
                                                                    str6 = str;
                                                                    String str112222 = emn2.f15272a;
                                                                    StringBuilder sb42222 = new StringBuilder(String.valueOf(str112222).length() + 39);
                                                                    sb42222.append("Patch application failed for module '");
                                                                    sb42222.append(str112222);
                                                                    sb42222.append(str6);
                                                                    throw new enk(sb42222.toString());
                                                                } catch (Exception e9) {
                                                                    emw3 = this;
                                                                    str5 = str6;
                                                                    str = "'.";
                                                                    String str132 = emn2.f15272a;
                                                                    StringBuilder sb62 = new StringBuilder(String.valueOf(str132).length() + 48);
                                                                    sb62.append(str5);
                                                                    sb62.append(str132);
                                                                    sb62.append("' patch failed with a generic exception.");
                                                                    Log.e("DynamicModuleDownloader", sb62.toString());
                                                                    emw3.m10711a(8, -1016, emn2);
                                                                    emw3.m10711a(13, -1016, emn2);
                                                                    str6 = str;
                                                                    String str1122222 = emn2.f15272a;
                                                                    StringBuilder sb422222 = new StringBuilder(String.valueOf(str1122222).length() + 39);
                                                                    sb422222.append("Patch application failed for module '");
                                                                    sb422222.append(str1122222);
                                                                    sb422222.append(str6);
                                                                    throw new enk(sb422222.toString());
                                                                } catch (Throwable th11) {
                                                                }
                                                            } else if (intValue2 == 3) {
                                                                enm enm2 = enm;
                                                                try {
                                                                    enm = enm2;
                                                                    blkr.m107306a(file, enm, gZIPInputStream, Long.valueOf(emn2.f15275d));
                                                                    str = "'.";
                                                                } catch (blkq e10) {
                                                                    e = e10;
                                                                    str2 = str6;
                                                                    str3 = "'.";
                                                                    blkq = e;
                                                                    String str1022 = emn2.f15272a;
                                                                    StringBuilder sb322 = new StringBuilder(String.valueOf(str1022).length() + 35);
                                                                    sb322.append(str2);
                                                                    sb322.append(str1022);
                                                                    sb322.append("' patch content is invalid.");
                                                                    Log.e("DynamicModuleDownloader", sb322.toString());
                                                                    String valueOf322 = String.valueOf(blkq.getMessage());
                                                                    Log.e("DynamicModuleDownloader", valueOf322.length() != 0 ? new String("Error message: ") : "Error message: ".concat(valueOf322));
                                                                    emw3.m10711a(8, -1014, emn2);
                                                                    emw3.m10711a(13, -1014, emn2);
                                                                    str6 = str;
                                                                    String str11222222 = emn2.f15272a;
                                                                    StringBuilder sb4222222 = new StringBuilder(String.valueOf(str11222222).length() + 39);
                                                                    sb4222222.append("Patch application failed for module '");
                                                                    sb4222222.append(str11222222);
                                                                    sb4222222.append(str6);
                                                                    throw new enk(sb4222222.toString());
                                                                } catch (IOException e11) {
                                                                    str4 = str6;
                                                                    str = "'.";
                                                                    String str1222 = emn2.f15272a;
                                                                    StringBuilder sb522 = new StringBuilder(String.valueOf(str1222).length() + 44);
                                                                    sb522.append(str4);
                                                                    sb522.append(str1222);
                                                                    sb522.append("' patch failed with an IO-Exception.");
                                                                    Log.e("DynamicModuleDownloader", sb522.toString());
                                                                    emw3.m10711a(8, -1015, emn2);
                                                                    emw3.m10711a(13, -1015, emn2);
                                                                    str6 = str;
                                                                    String str112222222 = emn2.f15272a;
                                                                    StringBuilder sb42222222 = new StringBuilder(String.valueOf(str112222222).length() + 39);
                                                                    sb42222222.append("Patch application failed for module '");
                                                                    sb42222222.append(str112222222);
                                                                    sb42222222.append(str6);
                                                                    throw new enk(sb42222222.toString());
                                                                } catch (Exception e12) {
                                                                    enm = enm2;
                                                                    str5 = str6;
                                                                    str = "'.";
                                                                    String str1322 = emn2.f15272a;
                                                                    StringBuilder sb622 = new StringBuilder(String.valueOf(str1322).length() + 48);
                                                                    sb622.append(str5);
                                                                    sb622.append(str1322);
                                                                    sb622.append("' patch failed with a generic exception.");
                                                                    Log.e("DynamicModuleDownloader", sb622.toString());
                                                                    emw3.m10711a(8, -1016, emn2);
                                                                    emw3.m10711a(13, -1016, emn2);
                                                                    str6 = str;
                                                                    String str1122222222 = emn2.f15272a;
                                                                    StringBuilder sb422222222 = new StringBuilder(String.valueOf(str1122222222).length() + 39);
                                                                    sb422222222.append("Patch application failed for module '");
                                                                    sb422222222.append(str1122222222);
                                                                    sb422222222.append(str6);
                                                                    throw new enk(sb422222222.toString());
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    enm = enm2;
                                                                    th = th;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    m10714a(enm);
                                                                    m10714a(fileOutputStream);
                                                                    m10714a(autoCloseInputStream);
                                                                    throw th;
                                                                }
                                                            } else {
                                                                String str14 = emn2.f15272a;
                                                                String valueOf4 = String.valueOf(emn2.f15284m);
                                                                StringBuilder sb9 = new StringBuilder(String.valueOf(str14).length() + 55 + String.valueOf(valueOf4).length());
                                                                sb9.append(str6);
                                                                sb9.append(str14);
                                                                sb9.append("' is delivered with unexpected patch format '");
                                                                sb9.append(valueOf4);
                                                                sb9.append("'.");
                                                                Log.e("DynamicModuleDownloader", sb9.toString());
                                                                emw3.m10711a(8, -1013, emn2);
                                                                emw3.m10711a(13, -1013, emn2);
                                                                str6 = "'.";
                                                            }
                                                            enl = new enl(Base64.encodeToString(enm.f15327a.digest(), 11), enm.f15328b);
                                                        } catch (blkq e13) {
                                                            e = e13;
                                                            str2 = str6;
                                                            str3 = "'.";
                                                            blkq = e;
                                                            String str10222 = emn2.f15272a;
                                                            StringBuilder sb3222 = new StringBuilder(String.valueOf(str10222).length() + 35);
                                                            sb3222.append(str2);
                                                            sb3222.append(str10222);
                                                            sb3222.append("' patch content is invalid.");
                                                            Log.e("DynamicModuleDownloader", sb3222.toString());
                                                            String valueOf3222 = String.valueOf(blkq.getMessage());
                                                            Log.e("DynamicModuleDownloader", valueOf3222.length() != 0 ? new String("Error message: ") : "Error message: ".concat(valueOf3222));
                                                            emw3.m10711a(8, -1014, emn2);
                                                            emw3.m10711a(13, -1014, emn2);
                                                            str6 = str;
                                                            String str11222222222 = emn2.f15272a;
                                                            StringBuilder sb4222222222 = new StringBuilder(String.valueOf(str11222222222).length() + 39);
                                                            sb4222222222.append("Patch application failed for module '");
                                                            sb4222222222.append(str11222222222);
                                                            sb4222222222.append(str6);
                                                            throw new enk(sb4222222222.toString());
                                                        } catch (IOException e14) {
                                                            str4 = str6;
                                                            str = "'.";
                                                            String str12222 = emn2.f15272a;
                                                            StringBuilder sb5222 = new StringBuilder(String.valueOf(str12222).length() + 44);
                                                            sb5222.append(str4);
                                                            sb5222.append(str12222);
                                                            sb5222.append("' patch failed with an IO-Exception.");
                                                            Log.e("DynamicModuleDownloader", sb5222.toString());
                                                            emw3.m10711a(8, -1015, emn2);
                                                            emw3.m10711a(13, -1015, emn2);
                                                            str6 = str;
                                                            String str112222222222 = emn2.f15272a;
                                                            StringBuilder sb42222222222 = new StringBuilder(String.valueOf(str112222222222).length() + 39);
                                                            sb42222222222.append("Patch application failed for module '");
                                                            sb42222222222.append(str112222222222);
                                                            sb42222222222.append(str6);
                                                            throw new enk(sb42222222222.toString());
                                                        } catch (Exception e15) {
                                                        }
                                                    } else {
                                                        String str15 = "'.";
                                                        try {
                                                            String str16 = emn2.f15272a;
                                                            String str17 = emn2.f15285n;
                                                            StringBuilder sb10 = new StringBuilder(String.valueOf(str16).length() + 90 + String.valueOf(str17).length());
                                                            sb10.append("Base file for the patch of module '");
                                                            sb10.append(str16);
                                                            sb10.append("' not found. Base version for the expected file was '");
                                                            sb10.append(str17);
                                                            str6 = str15;
                                                            sb10.append(str6);
                                                            Log.e("DynamicModuleDownloader", sb10.toString());
                                                            emw3.m10711a(8, -1012, emn2);
                                                            emw3.m10711a(13, -1012, emn2);
                                                        } catch (enk e16) {
                                                            e = e16;
                                                            str6 = str15;
                                                            enk = e;
                                                            Log.e("DynamicModuleDownloader", enk.getMessage());
                                                            String str722 = emn2.f15272a;
                                                            StringBuilder sb72 = new StringBuilder(String.valueOf(str722).length() + 45);
                                                            sb72.append("Requesting compressed download for module '");
                                                            sb72.append(str722);
                                                            sb72.append(str6);
                                                            Log.i("DynamicModuleDownloader", sb72.toString());
                                                            m10714a(enm);
                                                            m10714a(fileOutputStream2);
                                                            m10714a(autoCloseInputStream);
                                                            i = 4;
                                                            if (i != 2) {
                                                            }
                                                            return i;
                                                        }
                                                    }
                                                    String str1122222222222 = emn2.f15272a;
                                                    StringBuilder sb422222222222 = new StringBuilder(String.valueOf(str1122222222222).length() + 39);
                                                    sb422222222222.append("Patch application failed for module '");
                                                    sb422222222222.append(str1122222222222);
                                                    sb422222222222.append(str6);
                                                    throw new enk(sb422222222222.toString());
                                                } catch (IOException e17) {
                                                    emw3.m10711a(8, -1019, emn2);
                                                    emw3.m10711a(13, -1019, emn2);
                                                    String str18 = emn2.f15272a;
                                                    StringBuilder sb11 = new StringBuilder(String.valueOf(str18).length() + 58);
                                                    sb11.append("The downloaded patch file for module '");
                                                    sb11.append(str18);
                                                    sb11.append("' could not be read.");
                                                    throw new enk(sb11.toString());
                                                } catch (enk e18) {
                                                    e = e18;
                                                    enk = e;
                                                    Log.e("DynamicModuleDownloader", enk.getMessage());
                                                    String str7222 = emn2.f15272a;
                                                    StringBuilder sb722 = new StringBuilder(String.valueOf(str7222).length() + 45);
                                                    sb722.append("Requesting compressed download for module '");
                                                    sb722.append(str7222);
                                                    sb722.append(str6);
                                                    Log.i("DynamicModuleDownloader", sb722.toString());
                                                    m10714a(enm);
                                                    m10714a(fileOutputStream2);
                                                    m10714a(autoCloseInputStream);
                                                    i = 4;
                                                    if (i != 2) {
                                                    }
                                                    return i;
                                                }
                                            } else {
                                                emw3.m10711a(8, -1012, emn2);
                                                emw3.m10711a(13, -1012, emn2);
                                                String str19 = emn2.f15272a;
                                                StringBuilder sb12 = new StringBuilder(String.valueOf(str19).length() + 71);
                                                sb12.append("Patch base is not available for module '");
                                                sb12.append(str19);
                                                sb12.append("'. Retrying compressed version.");
                                                throw new enk(sb12.toString());
                                            }
                                        } catch (enk e19) {
                                            e = e19;
                                            str6 = "'.";
                                            enk = e;
                                            Log.e("DynamicModuleDownloader", enk.getMessage());
                                            String str72222 = emn2.f15272a;
                                            StringBuilder sb7222 = new StringBuilder(String.valueOf(str72222).length() + 45);
                                            sb7222.append("Requesting compressed download for module '");
                                            sb7222.append(str72222);
                                            sb7222.append(str6);
                                            Log.i("DynamicModuleDownloader", sb7222.toString());
                                            m10714a(enm);
                                            m10714a(fileOutputStream2);
                                            m10714a(autoCloseInputStream);
                                            i = 4;
                                            if (i != 2) {
                                            }
                                            return i;
                                        }
                                    } else {
                                        str6 = "'.";
                                        try {
                                            emw3.m10711a(8, -1018, emn2);
                                            emw3.m10711a(13, -1018, emn2);
                                            String str20 = emn2.f15272a;
                                            StringBuilder sb13 = new StringBuilder(String.valueOf(str20).length() + 66);
                                            sb13.append("Size of downloaded patch file for module '");
                                            sb13.append(str20);
                                            sb13.append("' could not be verified.");
                                            throw new enk(sb13.toString());
                                        } catch (IOException e20) {
                                            emw3.m10711a(8, -1019, emn2);
                                            emw3.m10711a(13, -1019, emn2);
                                            String str21 = emn2.f15272a;
                                            StringBuilder sb14 = new StringBuilder(String.valueOf(str21).length() + 58);
                                            sb14.append("The downloaded patch file for module '");
                                            sb14.append(str21);
                                            sb14.append("' could not be read.");
                                            throw new enk(sb14.toString());
                                        }
                                    }
                                } catch (IOException e21) {
                                    str6 = "'.";
                                    emw3.m10711a(8, -1019, emn2);
                                    emw3.m10711a(13, -1019, emn2);
                                    String str212 = emn2.f15272a;
                                    StringBuilder sb142 = new StringBuilder(String.valueOf(str212).length() + 58);
                                    sb142.append("The downloaded patch file for module '");
                                    sb142.append(str212);
                                    sb142.append("' could not be read.");
                                    throw new enk(sb142.toString());
                                }
                            } else if (emn2.f15279h != null) {
                                try {
                                    int intValue3 = emn2.f15281j.intValue();
                                    if (intValue3 == 1) {
                                        inputStream = new bqik(autoCloseInputStream);
                                    } else if (intValue3 == 2) {
                                        inputStream = new GZIPInputStream(autoCloseInputStream, 8192);
                                    } else {
                                        emw3.m10711a(8, -1009, emn2);
                                        emw3.m10711a(10, -1009, emn2);
                                        String valueOf5 = String.valueOf(emn2.f15281j);
                                        String str22 = emn2.f15272a;
                                        StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf5).length() + 85 + String.valueOf(str22).length());
                                        sb15.append("Unknown compression format (");
                                        sb15.append(valueOf5);
                                        sb15.append(") received for module '");
                                        sb15.append(str22);
                                        sb15.append("'. Retrying uncompressed download.");
                                        throw new enj(sb15.toString());
                                    }
                                    enl = enn.m10771a(inputStream, enm, 2);
                                } catch (IOException e22) {
                                    emw3.m10711a(8, -1008, emn2);
                                    emw3.m10711a(10, -1008, emn2);
                                    String str23 = emn2.f15272a;
                                    StringBuilder sb16 = new StringBuilder(String.valueOf(str23).length() + 88);
                                    sb16.append("Failed to read the brotli compressed file for module '");
                                    sb16.append(str23);
                                    sb16.append("'. Retrying uncompressed download.");
                                    throw new enj(sb16.toString());
                                } catch (IOException e23) {
                                    emw3.m10711a(8, -1008, emn2);
                                    emw3.m10711a(10, -1008, emn2);
                                    String str24 = emn2.f15272a;
                                    StringBuilder sb17 = new StringBuilder(String.valueOf(str24).length() + 48);
                                    sb17.append("Failed copying compressed module for module: '");
                                    sb17.append(str24);
                                    sb17.append("'.");
                                    throw new enj(sb17.toString());
                                } catch (IOException e24) {
                                    emw3.m10711a(8, -1008, emn2);
                                    emw3.m10711a(10, -1008, emn2);
                                    String str25 = emn2.f15272a;
                                    StringBuilder sb18 = new StringBuilder(String.valueOf(str25).length() + 86);
                                    sb18.append("Failed to read the gzip compressed file for module '");
                                    sb18.append(str25);
                                    sb18.append("'. Retrying uncompressed download.");
                                    throw new enj(sb18.toString());
                                } catch (enj e25) {
                                    Log.e("DynamicModuleDownloader", e25.getMessage());
                                    String str26 = emn2.f15272a;
                                    StringBuilder sb19 = new StringBuilder(String.valueOf(str26).length() + 39);
                                    sb19.append("Requesting full download for module '");
                                    sb19.append(str26);
                                    sb19.append("'.");
                                    Log.i("DynamicModuleDownloader", sb19.toString());
                                    m10714a(enm);
                                    m10714a(fileOutputStream2);
                                    m10714a(autoCloseInputStream);
                                    i = 3;
                                }
                            } else {
                                try {
                                    enl = enn.m10771a(autoCloseInputStream, enm, 2);
                                } catch (IOException e26) {
                                    StringBuilder sb20 = new StringBuilder(39);
                                    sb20.append("Failed copying downloaded module: ");
                                    sb20.append(false);
                                    Log.e("DynamicModuleDownloader", sb20.toString());
                                    emw3.m10711a(8, -1001, emn2);
                                    m10714a(enm);
                                    m10714a(fileOutputStream2);
                                    m10714a(autoCloseInputStream);
                                    i = 0;
                                    if (i != 2) {
                                    }
                                    return i;
                                }
                            }
                            try {
                                m10714a(enm);
                                m10714a(fileOutputStream2);
                                m10714a(autoCloseInputStream);
                                String str27 = emn2.f15272a;
                                StringBuilder sb21 = new StringBuilder(String.valueOf(str27).length() + 21);
                                sb21.append("Downloaded module '");
                                sb21.append(str27);
                                sb21.append("' ");
                                String sb22 = sb21.toString();
                                if (enl.f15325a != emn2.f15275d) {
                                    emw = this;
                                } else if (!enl.mo10319a().equals(emn2.f15276e)) {
                                    emw = this;
                                } else {
                                    try {
                                        x509CertificateArr = blq.m3304a(file2.getAbsolutePath());
                                    } catch (bln | IOException | SecurityException e27) {
                                        x509CertificateArr = null;
                                    }
                                    if (x509CertificateArr == null) {
                                        emw2 = this;
                                    } else if (x509CertificateArr.length == 0) {
                                        emw2 = this;
                                    } else if (x509CertificateArr[0].length != 0) {
                                        emw2 = this;
                                        Context context = emw2.f15311d;
                                        try {
                                            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                                        } catch (PackageManager.NameNotFoundException e28) {
                                            signatureArr = null;
                                        }
                                        if (signatureArr != null) {
                                            arrayList = new ArrayList();
                                            for (Signature signature : signatureArr) {
                                                X509Certificate a4 = ena.m10749a(signature);
                                                if (a4 != null) {
                                                    arrayList.add(a4);
                                                }
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            if (!arrayList.isEmpty()) {
                                                Iterator it = arrayList.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        X509Certificate x509Certificate = (X509Certificate) it.next();
                                                        int i3 = 0;
                                                        while (true) {
                                                            if (i3 >= x509CertificateArr.length) {
                                                                Log.i("DynamicModuleDownloader", "Module certificate could not be verified from the app certificates.");
                                                            } else if (!x509CertificateArr[i3][0].equals(x509Certificate)) {
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (emn2.f15282k == null) {
                                                    m10713a(emn, statSize, file2.length());
                                                    i2 = 0;
                                                } else if (emn2.f15279h != null) {
                                                    i2 = 0;
                                                    emw2.m10710a(10, 0);
                                                } else {
                                                    i2 = 0;
                                                }
                                                emw2.m10711a(7, i2, emn2);
                                                i = 2;
                                                if (i != 2) {
                                                    eni.m10769a(file2);
                                                }
                                                return i;
                                            }
                                        }
                                        Log.e("DynamicModuleDownloader", "No certificates found for app.");
                                        Context context2 = emw2.f15311d;
                                        try {
                                            String[] list = context2.getAssets().list("split_certs");
                                            if (list != null) {
                                                int length = list.length;
                                                if (length != 0) {
                                                    arrayList2 = new ArrayList();
                                                    for (String str28 : list) {
                                                        if (str28.endsWith(".pem")) {
                                                            String valueOf6 = String.valueOf(str28);
                                                            X509Certificate a5 = ena.m10748a(context2, valueOf6.length() == 0 ? new String("split_certs/") : "split_certs/".concat(valueOf6));
                                                            if (a5 != null) {
                                                                arrayList2.add(a5);
                                                            }
                                                        }
                                                    }
                                                    if (arrayList2 == null) {
                                                        if (!arrayList2.isEmpty()) {
                                                            for (X509Certificate x509Certificate2 : arrayList2) {
                                                                for (X509Certificate[] x509CertificateArr2 : x509CertificateArr) {
                                                                    if (x509CertificateArr2[0].equals(x509Certificate2)) {
                                                                        Log.i("DynamicModuleDownloader", "A matching split signature is found for module certificate.");
                                                                        if (emn2.f15282k == null) {
                                                                        }
                                                                        emw2.m10711a(7, i2, emn2);
                                                                        i = 2;
                                                                        if (i != 2) {
                                                                        }
                                                                        return i;
                                                                    }
                                                                }
                                                            }
                                                            Log.i("DynamicModuleDownloader", "No matching split signature could be found.");
                                                        }
                                                    }
                                                    Log.e("DynamicModuleDownloader", "Signatures could not be verified.");
                                                    emw2.m10711a(8, -1006, emn2);
                                                    i = 0;
                                                    if (i != 2) {
                                                    }
                                                    return i;
                                                }
                                            }
                                            Log.i("DynamicModuleDownloader", "No split certificates could be read from the relevant assets folder.");
                                            arrayList2 = null;
                                        } catch (IOException e29) {
                                            Log.i("DynamicModuleDownloader", "An IOException is encountered while accessing the split certificates folder.");
                                            arrayList2 = null;
                                        }
                                        if (arrayList2 == null) {
                                        }
                                        Log.e("DynamicModuleDownloader", "Signatures could not be verified.");
                                        emw2.m10711a(8, -1006, emn2);
                                        i = 0;
                                        if (i != 2) {
                                        }
                                        return i;
                                    } else {
                                        emw2 = this;
                                    }
                                    String str29 = emn2.f15272a;
                                    StringBuilder sb23 = new StringBuilder(String.valueOf(str29).length() + 35);
                                    sb23.append("Downloaded module '");
                                    sb23.append(str29);
                                    sb23.append("' is not signed.");
                                    Log.e("DynamicModuleDownloader", sb23.toString());
                                    emw2.m10711a(8, -1006, emn2);
                                    i = 0;
                                    if (i != 2) {
                                    }
                                    return i;
                                }
                                long j5 = enl.f15325a;
                                long j6 = emn2.f15275d;
                                if (j5 != j6) {
                                    if (emn2.f15282k != null) {
                                        StringBuilder sb24 = new StringBuilder(String.valueOf(sb22).length() + 122);
                                        sb24.append("Patched file ");
                                        sb24.append(sb22);
                                        sb24.append("has incorrect length (");
                                        sb24.append(j5);
                                        sb24.append(" vs ");
                                        sb24.append(j6);
                                        sb24.append("). Retrying to download compressed version.");
                                        Log.e("DynamicModuleDownloader", sb24.toString());
                                        emw.m10711a(8, -1017, emn2);
                                        emw.m10711a(13, -1017, emn2);
                                    } else if (emn2.f15279h != null) {
                                        StringBuilder sb25 = new StringBuilder(String.valueOf(sb22).length() + 124);
                                        sb25.append("Uncompressed ");
                                        sb25.append(sb22);
                                        sb25.append("has incorrect length (");
                                        sb25.append(j5);
                                        sb25.append(" vs ");
                                        sb25.append(j6);
                                        sb25.append("). Retrying to download uncompressed version.");
                                        Log.e("DynamicModuleDownloader", sb25.toString());
                                        emw.m10711a(8, -1010, emn2);
                                        emw.m10711a(10, -1010, emn2);
                                    } else {
                                        StringBuilder sb26 = new StringBuilder(String.valueOf(sb22).length() + 67);
                                        sb26.append(sb22);
                                        sb26.append("has incorrect length (");
                                        sb26.append(j5);
                                        sb26.append(" vs ");
                                        sb26.append(j6);
                                        sb26.append(")");
                                        Log.e("DynamicModuleDownloader", sb26.toString());
                                        emw.m10711a(8, -1003, emn2);
                                    }
                                } else if (emn2.f15282k != null) {
                                    String str30 = emn2.f15276e;
                                    String a6 = enl.mo10319a();
                                    StringBuilder sb27 = new StringBuilder(String.valueOf(str30).length() + 87 + String.valueOf(a6).length());
                                    sb27.append("Expected sha256 for patched file is ");
                                    sb27.append(str30);
                                    sb27.append(" but got ");
                                    sb27.append(a6);
                                    sb27.append(". Retrying to download compressed version.");
                                    Log.e("DynamicModuleDownloader", sb27.toString());
                                    emw.m10711a(8, -1018, emn2);
                                    emw.m10711a(13, -1018, emn2);
                                } else if (emn2.f15279h != null) {
                                    String str31 = emn2.f15276e;
                                    String a7 = enl.mo10319a();
                                    StringBuilder sb28 = new StringBuilder(String.valueOf(str31).length() + 95 + String.valueOf(a7).length());
                                    sb28.append("Expected sha256 for de-compressed file is ");
                                    sb28.append(str31);
                                    sb28.append(" but got ");
                                    sb28.append(a7);
                                    sb28.append(". Retrying to download uncompressed version.");
                                    Log.e("DynamicModuleDownloader", sb28.toString());
                                    emw.m10711a(8, -1007, emn2);
                                    emw.m10711a(10, -1007, emn2);
                                } else {
                                    Log.e("DynamicModuleDownloader", String.valueOf(sb22).concat("has incorrect sha256"));
                                    emw.m10711a(8, -1005, emn2);
                                }
                                if (emn2.f15282k == null) {
                                    i = emn2.f15279h != null ? 3 : 1;
                                } else {
                                    i = 4;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                Throwable th14 = th;
                                eni.m10769a(file2);
                                throw th14;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        fileOutputStream = fileOutputStream2;
                        enm = null;
                        m10714a(enm);
                        m10714a(fileOutputStream);
                        m10714a(autoCloseInputStream);
                        throw th;
                    }
                } catch (FileNotFoundException e30) {
                    try {
                        Log.e("DynamicModuleDownloader", "Downloaded file could not be found or copied! Re-trying ingestion later.");
                        emw3.m10711a(8, -1001, emn2);
                        m10714a((Closeable) null);
                        m10714a((Closeable) null);
                        m10714a(autoCloseInputStream);
                        i = 0;
                        if (i != 2) {
                        }
                        return i;
                    } catch (Throwable th17) {
                        enm = null;
                        fileOutputStream = null;
                        th = th17;
                        m10714a(enm);
                        m10714a(fileOutputStream);
                        m10714a(autoCloseInputStream);
                        throw th;
                    }
                } catch (SecurityException e31) {
                    try {
                        Log.e("DynamicModuleDownloader", "Cannot access downloaded file! Re-trying ingestion later.");
                        emw3.m10711a(8, -1024, emn2);
                        m10714a((Closeable) null);
                        m10714a((Closeable) null);
                        m10714a(autoCloseInputStream);
                        i = 0;
                        if (i != 2) {
                        }
                        return i;
                    } catch (Throwable th18) {
                        th = th18;
                        enm = null;
                        fileOutputStream = null;
                        m10714a(enm);
                        m10714a(fileOutputStream);
                        m10714a(autoCloseInputStream);
                        throw th;
                    }
                } catch (Throwable th19) {
                    th = th19;
                    enm = null;
                    fileOutputStream = null;
                    m10714a(enm);
                    m10714a(fileOutputStream);
                    m10714a(autoCloseInputStream);
                    throw th;
                }
            } catch (FileNotFoundException e32) {
                autoCloseInputStream = null;
                Log.e("DynamicModuleDownloader", "Downloaded file could not be found or copied! Re-trying ingestion later.");
                emw3.m10711a(8, -1001, emn2);
                m10714a((Closeable) null);
                m10714a((Closeable) null);
                m10714a(autoCloseInputStream);
                i = 0;
                if (i != 2) {
                }
                return i;
            } catch (SecurityException e33) {
                autoCloseInputStream = null;
                Log.e("DynamicModuleDownloader", "Cannot access downloaded file! Re-trying ingestion later.");
                emw3.m10711a(8, -1024, emn2);
                m10714a((Closeable) null);
                m10714a((Closeable) null);
                m10714a(autoCloseInputStream);
                i = 0;
                if (i != 2) {
                }
                return i;
            } catch (Throwable th20) {
                th = th20;
                autoCloseInputStream = null;
                enm = null;
                fileOutputStream = null;
                m10714a(enm);
                m10714a(fileOutputStream);
                m10714a(autoCloseInputStream);
                throw th;
            }
            if (i != 2) {
            }
            return i;
        }
    }

    /* renamed from: g */
    private final void m10729g(emn emn) {
        emn.f15289r = Long.valueOf(this.f15312e.mo10290a(m10703a(emn), emn.f15272a, emn.f15273b, emn.f15277f, emn.f15292u, emn.f15293v, emn.f15294w, m10722c(emn)));
        m10711a(1, 0, emn);
    }

    /* renamed from: a */
    private final int m10702a(String str, String str2, boolean z) {
        C1245ok b = mo10307b();
        if (b != null) {
            emn emn = null;
            for (int i = 0; i < b.f26809h; i++) {
                emn emn2 = (emn) b.mo15621c(i);
                if (emn2.f15272a.equals(str) && (str2 == null || emn2.f15273b.equals(str2))) {
                    if (emn2.f15289r != null) {
                        emn = emn2;
                    } else if (z) {
                        return m10726e(emn2);
                    }
                }
            }
            if (emn != null) {
                return m10726e(emn);
            }
        }
        return 0;
    }

    /* renamed from: b */
    static long m10717b(emn emn) {
        int c = m10722c(emn);
        if (c == 2) {
            return emn.f15280i.longValue();
        }
        if (c != 3) {
            return emn.f15275d;
        }
        return emn.f15283l.longValue();
    }

    /* renamed from: d */
    private static String m10725d(Bundle bundle) {
        String string = bundle.getString("name");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Bundle must contain module name!");
    }

    /* renamed from: c */
    private final void m10723c(C1245ok okVar) {
        boolean z;
        C1245ok okVar2 = new C1245ok(okVar.f26809h);
        for (int i = 0; i < okVar.f26809h; i++) {
            emn emn = (emn) okVar.mo15621c(i);
            Long l = emn.f15289r;
            if (l != null) {
                okVar2.put(l, emn);
                emn.f15290s = 16;
            } else {
                emn.f15290s = 0;
            }
        }
        if (!okVar2.isEmpty()) {
            long[] jArr = new long[okVar2.f26809h];
            for (int i2 = 0; i2 < okVar2.f26809h; i2++) {
                jArr[i2] = ((Long) okVar2.mo15620b(i2)).longValue();
            }
            for (Map.Entry entry : this.f15312e.mo10292a(jArr).entrySet()) {
                emn emn2 = (emn) okVar2.remove(entry.getKey());
                if (emn2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                eng.m10766a(z);
                int intValue = ((Integer) entry.getValue()).intValue();
                emn2.f15290s = intValue;
                if (intValue == 16) {
                    String valueOf = String.valueOf(emn2.f15272a);
                    Log.e("DynamicModuleDownloader", valueOf.length() == 0 ? new String("download status failed for ") : "download status failed for ".concat(valueOf));
                }
            }
        }
    }

    /* renamed from: e */
    private final synchronized void m10727e() {
        enh enh;
        if (!this.f15315h.isEmpty()) {
            emt emt = this.f15313f;
            Context context = this.f15311d;
            ArrayList<Bundle> arrayList = this.f15315h;
            try {
                enh = new enh();
                end b = ((emz) emt).mo10313b(context, enh);
                if (b != null) {
                    try {
                        for (Bundle bundle : arrayList) {
                            b.mo10314a(context.getPackageName(), bundle);
                        }
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e.getMessage());
                        Log.e("ZappPhoneskyConn", valueOf.length() == 0 ? new String("onModuleEvent() failed: ") : "onModuleEvent() failed: ".concat(valueOf));
                    }
                    emz.m10743a(context, enh);
                }
            } catch (Exception e2) {
                Log.w("ZappPhoneskyConn", "Unable to send log events to phonesky.", e2);
            } catch (Throwable th) {
                emz.m10743a(context, enh);
                throw th;
            }
            this.f15315h.clear();
        }
    }

    /* renamed from: d */
    public final Bundle mo10310d() {
        File[] listFiles;
        int i;
        Bundle bundle = new Bundle();
        C1245ok a = m10707a(this.f15314g.mo10298b(), (C1245ok) null);
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i2 = 0; i2 < a.f26809h; i2++) {
            File b = this.f15314g.mo10299b((emn) a.mo15621c(i2));
            if (b.exists()) {
                hashMap.put(b.getAbsolutePath(), (emn) a.mo15621c(i2));
            }
        }
        File a2 = this.f15314g.mo10296a();
        if (!(a2 == null || (listFiles = a2.listFiles()) == null)) {
            boolean z2 = true;
            for (int i3 = 0; i3 < listFiles.length; i3++) {
                if (!hashMap.containsKey(listFiles[i3].getAbsolutePath())) {
                    boolean delete = listFiles[i3].delete();
                    z2 &= delete;
                    if (!delete) {
                        i = -1011;
                    } else {
                        i = 0;
                    }
                    m10710a(9, i);
                }
            }
            m10727e();
            z = z2;
        }
        bundle.putBoolean("cleanup_successful", z);
        return bundle;
    }

    /* renamed from: a */
    static Uri m10703a(emn emn) {
        int c = m10722c(emn);
        if (c == 2) {
            return emn.f15279h;
        }
        if (c == 3) {
            return emn.f15282k;
        }
        if (emn.f15291t == null) {
            emn.f15291t = Uri.parse(emn.f15274c);
        }
        return emn.f15291t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return null;
     */
    /* renamed from: b */
    private final synchronized emn m10718b(long j) {
        emn emn;
        int i;
        String l = Long.toString(j);
        SharedPreferences b = this.f15314g.mo10298b();
        String string = b.getString(l, null);
        if (string != null) {
            emn = emn.m10670a(string);
        } else {
            emn = null;
        }
        if (emn != null) {
            Integer num = (Integer) this.f15312e.mo10292a(j).get(Long.valueOf(j));
            if (num == null) {
                String str = emn.f15272a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62);
                sb.append("Failed to query DownloadMgr for completion status of module '");
                sb.append(str);
                sb.append("'");
                Log.w("DynamicModuleDownloader", sb.toString());
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 8) {
                m10711a(3, 0, emn);
                i = m10728f(emn);
            } else if (intValue == 16) {
                m10711a(5, num.intValue(), emn);
                i = 1;
            }
            if (i != 0) {
                if (i == 1) {
                    SharedPreferences.Editor edit = b.edit();
                    edit.remove(l);
                    if (edit.commit()) {
                        this.f15312e.mo10294b(j);
                    }
                } else if (i == 2) {
                    SharedPreferences.Editor edit2 = b.edit();
                    edit2.remove(l);
                    emn.f15289r = null;
                    edit2.putString(emn.mo10282c(), emn.toString());
                    if (edit2.commit()) {
                        this.f15312e.mo10294b(j);
                    }
                } else if (i != 3) {
                    emn.mo10281b();
                    m10729g(emn);
                    m10712a(b, emn, l, j);
                } else {
                    emn.mo10278a();
                    emn.mo10281b();
                    m10729g(emn);
                    m10712a(b, emn, l, j);
                }
                emn.f15290s = num.intValue();
                m10727e();
                return emn;
            }
            m10727e();
            return null;
        }
    }

    /* renamed from: a */
    private static Uri m10704a(String str) {
        Uri parse;
        String scheme;
        if (str == null || (scheme = (parse = Uri.parse(str)).getScheme()) == null || !"https".equals(scheme.toLowerCase())) {
            return null;
        }
        return parse;
    }

    /* renamed from: c */
    public final Bundle mo10308c() {
        mo10304a();
        return new Bundle();
    }

    /* renamed from: a */
    private static Bundle m10705a(int i, int i2, emn emn, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putInt("error_code", i2);
        if (j != 0) {
            bundle.putLong("patch_size", j);
            bundle.putLong("apk_size", j2);
        }
        if (emn != null) {
            bundle.putString("module_name", emn.f15272a);
            bundle.putString("module_version_code", emn.f15273b);
            if (emn.f15275d > 0) {
                bundle.putLong("download_size", m10717b(emn));
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public final Bundle mo10309c(Bundle bundle) {
        emn a = this.f15314g.mo10295a(m10725d(bundle), bundle.getString("version_code"));
        boolean z = false;
        if (a == null) {
            return m10706a(false);
        }
        File b = this.f15314g.mo10299b(a);
        SharedPreferences.Editor edit = this.f15314g.mo10298b().edit();
        edit.remove(emn.m10671a(a.f15272a, a.f15273b));
        boolean commit = edit.commit();
        if (!commit || !b.exists() || b.delete()) {
            z = commit;
        }
        return m10706a(z);
    }

    /* renamed from: a */
    private static Bundle m10706a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("delete_successful", z);
        return bundle;
    }

    /* renamed from: a */
    private static C1245ok m10707a(SharedPreferences sharedPreferences, C1245ok okVar) {
        String str;
        emn emn;
        Map<String, ?> all = sharedPreferences.getAll();
        C1245ok okVar2 = new C1245ok(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Object value = entry.getValue();
            emn emn2 = null;
            if (value instanceof String) {
                str = (String) value;
            } else {
                str = null;
            }
            if (str != null && (emn2 = emn.m10670a(str)) == null) {
                try {
                    long parseLong = Long.parseLong(entry.getKey());
                    if (okVar != null) {
                        okVar.put(Long.valueOf(parseLong), Boolean.TRUE);
                    }
                } catch (NumberFormatException e) {
                }
            }
            if (!(emn2 == null || (emn = (emn) okVar2.put(emn2.mo10283d(), emn2)) == null)) {
                String str2 = emn.f15272a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
                sb.append("Found two download requests for module '");
                sb.append(str2);
                sb.append("'");
                Log.e("DynamicModuleDownloader", sb.toString());
                Long l = emn.f15289r;
                if (!(l == null || okVar == null)) {
                    okVar.put(l, Boolean.TRUE);
                }
            }
        }
        return okVar2;
    }

    /* renamed from: b */
    private static String m10719b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private final synchronized void m10720b(String str) {
        this.f15316i.f41879b.mo10311b(this.f15311d, 1, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01da A[LOOP:5: B:100:0x01d6->B:103:0x01da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02bf A[LOOP:10: B:144:0x02bb->B:146:0x02bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x030e  */
    /* renamed from: b */
    private final synchronized boolean m10721b(List list, boolean z) {
        int i;
        SharedPreferences.Editor edit;
        int i2;
        emn emn;
        int i3;
        C1245ok okVar;
        long j;
        List list2 = list;
        synchronized (this) {
            if (this.f15312e.mo10293a(this.f15311d)) {
                long j2 = this.f15316i.f41878a;
                if (j2 > 0) {
                    try {
                        PackageInfo packageInfo = this.f15311d.getPackageManager().getPackageInfo("com.android.vending", 0);
                        j = packageInfo != null ? (long) packageInfo.versionCode : 0;
                    } catch (Exception e) {
                        j = 0;
                    }
                    if (j > 0 && j < j2) {
                        StringBuilder sb = new StringBuilder(123);
                        sb.append("Play Store version ");
                        sb.append(j);
                        sb.append(" is too old. Wanted at least version ");
                        sb.append(j2);
                        sb.append(". Aborting module download.");
                        sb.toString();
                        m10720b(String.valueOf(j));
                        m10727e();
                        return false;
                    }
                }
                File a = this.f15314g.mo10296a();
                if (a == null) {
                    Log.e("DynamicModuleDownloader", "Module download root is missing.");
                    m10710a(5, -1025);
                    m10727e();
                    return false;
                }
                String packageName = this.f15311d.getPackageName();
                if (!f15310c.contains(packageName)) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f15311d.getSystemService("activity")).getRunningAppProcesses()) {
                        if (runningAppProcessInfo.importance <= 125) {
                            if (!packageName.equals(runningAppProcessInfo.processName)) {
                                int i4 = 0;
                                while (i4 < runningAppProcessInfo.pkgList.length) {
                                    if (!packageName.equals(runningAppProcessInfo.pkgList[i4])) {
                                        i4++;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    return false;
                }
                C1245ok okVar2 = new C1245ok();
                SharedPreferences b = this.f15314g.mo10298b();
                C1245ok a2 = m10707a(b, okVar2);
                int i5 = a2.f26809h + okVar2.f26809h;
                int b2 = m10716b(a2);
                m10723c(a2);
                C1245ok okVar3 = new C1245ok(a2.f26809h);
                C1245ok okVar4 = new C1245ok(list.size());
                C1245ok a3 = m10708a(list2, b2, m10709a(a2));
                if (a3 == null) {
                    return false;
                }
                int size = list.size();
                int i6 = 0;
                boolean z2 = false;
                int i7 = 0;
                while (i7 < size) {
                    emo emo = (emo) list2.get(i7);
                    emn emn2 = (emn) a3.get(emn.m10671a(emo.f15295a, emo.f15296b));
                    int a4 = a2.mo15616a(emn2.mo10283d());
                    if (a4 >= 0) {
                        emn = (emn) a2.mo15621c(a4);
                    } else {
                        emn = null;
                    }
                    if (emn == null) {
                        okVar = a3;
                        i3 = size;
                    } else {
                        okVar = a3;
                        i3 = size;
                        if (emn.f15290s != 16 && emn2.f15273b.equals(emn.f15273b)) {
                            emn.f15278g = Integer.valueOf(emq.m10683a(this.f15311d));
                            okVar3.put(emn.mo10283d(), emn);
                            if (emn.f15290s == 8) {
                                i6++;
                            }
                            a2.mo8152d(a4);
                            z2 = true;
                            i7++;
                            list2 = list;
                            a3 = okVar;
                            size = i3;
                        }
                    }
                    okVar4.put(emn2.mo10283d(), emn2);
                    i7++;
                    list2 = list;
                    a3 = okVar;
                    size = i3;
                }
                if (z) {
                    for (int i8 = 0; i8 < a2.f26809h; i8++) {
                        Long l = ((emn) a2.mo15621c(i8)).f15289r;
                        if (l != null) {
                            okVar2.put(l, Boolean.TRUE);
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < a2.f26809h; i9++) {
                        emn emn3 = (emn) a2.mo15621c(i9);
                        if (emn3.f15290s != 16) {
                            okVar3.put(emn3.mo10283d(), emn3);
                        }
                    }
                }
                if (i5 > 0 && list.size() == i5) {
                    if (okVar3.f26809h != i5) {
                        i = 0;
                        while (i < okVar4.f26809h) {
                            emn emn4 = (emn) okVar4.mo15621c(i);
                            okVar3.put(emn4.mo10283d(), emn4);
                            i++;
                        }
                        if (i6 > 0) {
                            ArrayList arrayList = new ArrayList(i6);
                            for (int i10 = 0; i10 < okVar3.f26809h; i10++) {
                                emn emn5 = (emn) okVar3.mo15621c(i10);
                                if (emn5.f15290s == 8) {
                                    arrayList.add(emn5);
                                }
                            }
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                emn emn6 = (emn) arrayList.get(i11);
                                int f = m10728f(emn6);
                                if (f != 1) {
                                    if (f == 2) {
                                        okVar2.put(emn6.f15289r, Boolean.TRUE);
                                        emn6.f15289r = null;
                                    } else if (f == 3) {
                                        emn6.mo10281b();
                                        emn6.mo10278a();
                                    } else if (f == 4) {
                                        emn6.mo10281b();
                                    }
                                }
                                okVar2.put(emn6.f15289r, Boolean.TRUE);
                                okVar4.put(emn6.mo10283d(), emn6);
                            }
                        }
                        if (okVar4.isEmpty()) {
                            long j3 = 0;
                            for (int i12 = 0; i12 < okVar4.f26809h; i12++) {
                                j3 += ((emn) okVar4.mo15621c(i12)).f15275d;
                            }
                            if (m10715a(a, j3)) {
                                for (int i13 = 0; i13 < okVar4.f26809h; i13++) {
                                    emn emn7 = (emn) okVar4.mo15621c(i13);
                                    emn7.f15289r = Long.valueOf(this.f15312e.mo10290a(m10703a(emn7), emn7.f15272a, emn7.f15273b, emn7.f15277f, emn7.f15292u, emn7.f15293v, emn7.f15294w, m10722c(emn7)));
                                    m10711a(1, 0, emn7);
                                }
                            } else {
                                Log.e("DynamicModuleDownloader", "low disk");
                                m10710a(5, -1021);
                                m10727e();
                                return false;
                            }
                        }
                        edit = b.edit();
                        edit.clear();
                        for (i2 = 0; i2 < okVar3.f26809h; i2++) {
                            emn emn8 = (emn) okVar3.mo15621c(i2);
                            edit.putString(emn8.mo10282c(), emn8.toString());
                        }
                        if (!edit.commit()) {
                            Log.e("DynamicModuleDownloader", "Failed to store updated downloads list, no new modules will be downloaded");
                            m10710a(5, -1022);
                            okVar2.clear();
                            for (int i14 = 0; i14 < okVar4.f26809h; i14++) {
                                emn emn9 = (emn) okVar4.mo15621c(i14);
                                eng.m10766a(emn9.f15289r != null);
                                okVar2.put(emn9.f15289r, Boolean.TRUE);
                            }
                        }
                        if (!okVar2.isEmpty()) {
                            int i15 = okVar2.f26809h;
                            long[] jArr = new long[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                jArr[i16] = ((Long) okVar2.mo15620b(i16)).longValue();
                            }
                            this.f15312e.mo10294b(jArr);
                        }
                        m10727e();
                        return true;
                    } else if (i6 == 0 && okVar4.isEmpty() && !z2) {
                        return true;
                    }
                }
                i = 0;
                while (i < okVar4.f26809h) {
                }
                if (i6 > 0) {
                }
                if (okVar4.isEmpty()) {
                }
                edit = b.edit();
                edit.clear();
                while (i2 < okVar3.f26809h) {
                }
                if (!edit.commit()) {
                }
                if (!okVar2.isEmpty()) {
                }
                m10727e();
                return true;
            }
            m10710a(5, -1023);
            m10727e();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0146 A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016b  */
    /* renamed from: a */
    private final C1245ok m10708a(List list, int i, C1245ok okVar) {
        String str;
        String str2;
        C1245ok okVar2;
        ems ems;
        emw emw;
        String str3;
        int i2;
        HashMap hashMap;
        int i3;
        String str4;
        String str5;
        List list2;
        C1245ok okVar3;
        String str6;
        int i4;
        String str7;
        String str8;
        String str9;
        Uri uri;
        emo emo;
        C1245ok okVar4 = okVar;
        C1245ok okVar5 = new C1245ok(list.size());
        if (list.isEmpty()) {
            return okVar5;
        }
        C1245ok okVar6 = new C1245ok(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            emo emo2 = (emo) list.get(i5);
            emo emo3 = (emo) okVar6.put(emn.m10671a(emo2.f15295a, emo2.f15296b), emo2);
            if (emo3 != null && !emo3.equals(emo2)) {
                String str10 = emo2.f15295a;
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 57);
                sb.append("Ignoring malformed download request (duplicate module '");
                sb.append(str10);
                sb.append("')");
                Log.e("DynamicModuleDownloader", sb.toString());
                m10710a(5, -1026);
                m10727e();
                return null;
            }
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList(okVar6.f26809h);
        int i6 = 0;
        while (true) {
            str = "version_code";
            str2 = "name";
            if (i6 >= okVar6.f26809h) {
                break;
            }
            emo emo4 = (emo) okVar6.mo15621c(i6);
            Bundle bundle = new Bundle();
            String str11 = emo4.f15295a;
            bundle.putString(str2, str11);
            String str12 = emo4.f15296b;
            if (str12 != null) {
                bundle.putString(str, str12);
            }
            if (okVar4.containsKey(str11)) {
                bundle.putString("existing_version_code", (String) okVar4.get(str11));
            } else {
                String str13 = emo4.f15300f;
                if (str13 != null) {
                    bundle.putString("existing_version_code", str13);
                    String str14 = emo4.f15301g;
                    if (str14 != null) {
                        hashMap2.put(m10719b(str11, str13), str14);
                    }
                }
            }
            bundle.putIntegerArrayList("supported_compression_formats", f15308a);
            bundle.putIntegerArrayList("supported_patch_formats", f15309b);
            arrayList.add(bundle);
            i6++;
        }
        emt emt = this.f15313f;
        Context context = this.f15311d;
        enh enh = new enh();
        emz emz = (emz) emt;
        end b = emz.mo10313b(context, enh);
        if (b != null) {
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                ene ene = new ene(arrayBlockingQueue);
                okVar2 = okVar5;
                try {
                    String packageName = context.getPackageName();
                    Parcel bj = b.mo8529bj();
                    bj.writeString(packageName);
                    bj.writeTypedList(arrayList);
                    dcl.m8164a(bj, ene);
                    b.mo8530c(2, bj);
                    ems = (ems) arrayBlockingQueue.poll(90, TimeUnit.SECONDS);
                    if (ems == null) {
                        try {
                            Log.w("ZappPhoneskyConn", "Timed out waiting for zapp response");
                            ((emz) emt).mo10312a(context, 2, null);
                        } catch (Exception e) {
                            e = e;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    ems = null;
                    try {
                        String message = e.getMessage();
                        String valueOf = String.valueOf(message);
                        Log.e("ZappPhoneskyConn", valueOf.length() != 0 ? new String("resolveZappModules failed: ") : "resolveZappModules failed: ".concat(valueOf));
                        ((emz) emt).mo10312a(context, 3, message);
                        emz.m10743a(context, enh);
                        if (ems == null) {
                        }
                        if (ems != null) {
                        }
                        String valueOf2 = String.valueOf(str3);
                        Log.e("DynamicModuleDownloader", valueOf2.length() == 0 ? new String("Zapp module request failed: ") : "Zapp module request failed: ".concat(valueOf2));
                        return null;
                    } catch (Throwable th) {
                        emz.m10743a(context, enh);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                okVar2 = okVar5;
                ems = null;
                String message2 = e.getMessage();
                String valueOf3 = String.valueOf(message2);
                Log.e("ZappPhoneskyConn", valueOf3.length() != 0 ? new String("resolveZappModules failed: ") : "resolveZappModules failed: ".concat(valueOf3));
                ((emz) emt).mo10312a(context, 3, message2);
                emz.m10743a(context, enh);
                if (ems == null) {
                }
                if (ems != null) {
                }
                String valueOf22 = String.valueOf(str3);
                Log.e("DynamicModuleDownloader", valueOf22.length() == 0 ? new String("Zapp module request failed: ") : "Zapp module request failed: ".concat(valueOf22));
                return null;
            }
            emz.m10743a(context, enh);
        } else {
            okVar2 = okVar5;
            emz.mo10312a(context, 4, null);
            ems = null;
        }
        if (ems == null) {
            emw = this;
        } else if (ems.f15304a == 0) {
            List list3 = ems.f15305b;
            int size = list3.size();
            int i7 = 0;
            while (i7 < size) {
                Bundle bundle2 = (Bundle) list3.get(i7);
                String string = bundle2.getString(str2);
                String string2 = bundle2.getString("download_url");
                String string3 = bundle2.getString(str);
                if (string3 == null || string3.isEmpty()) {
                    string3 = Long.toString(bundle2.getLong("version"));
                }
                long j = bundle2.getLong("size", -1);
                String string4 = bundle2.getString("hash_sha256");
                if (string == null) {
                    list2 = list3;
                    i4 = size;
                    i3 = i7;
                    hashMap = hashMap2;
                    str6 = "'";
                    str5 = str;
                    str4 = str2;
                    okVar3 = okVar2;
                } else if (string2 == null || j <= 0) {
                    list2 = list3;
                    i4 = size;
                    i3 = i7;
                    hashMap = hashMap2;
                    str6 = "'";
                    str5 = str;
                    str4 = str2;
                    okVar3 = okVar2;
                } else if (string3.isEmpty() || string4 == null) {
                    list2 = list3;
                    i4 = size;
                    i3 = i7;
                    hashMap = hashMap2;
                    str6 = "'";
                    str5 = str;
                    str4 = str2;
                    okVar3 = okVar2;
                } else {
                    Uri a = m10704a(string2);
                    if (a == null) {
                        StringBuilder sb2 = new StringBuilder(string.length() + 41 + string2.length());
                        sb2.append("Ignoring invalid Zapp URL for module '");
                        sb2.append(string);
                        sb2.append("': ");
                        sb2.append(string2);
                        Log.w("DynamicModuleDownloader", sb2.toString());
                        list2 = list3;
                        i2 = size;
                        i3 = i7;
                        hashMap = hashMap2;
                        str5 = str;
                        str4 = str2;
                        okVar3 = okVar2;
                    } else {
                        Uri a2 = m10704a(bundle2.getString("compressed_download_url"));
                        Long valueOf4 = Long.valueOf(bundle2.getLong("compressed_download_size"));
                        list2 = list3;
                        Integer valueOf5 = Integer.valueOf(bundle2.getInt("compression_format"));
                        if (a2 == null) {
                            i2 = size;
                            valueOf5 = null;
                            a2 = null;
                            valueOf4 = null;
                        } else {
                            i2 = size;
                            if (valueOf4.longValue() == 0) {
                                valueOf5 = null;
                                a2 = null;
                                valueOf4 = null;
                            } else if (!f15308a.contains(valueOf5)) {
                                valueOf5 = null;
                                a2 = null;
                                valueOf4 = null;
                            }
                        }
                        Uri a3 = m10704a(bundle2.getString("patch_download_url"));
                        str5 = str;
                        Long valueOf6 = Long.valueOf(bundle2.getLong("patch_size"));
                        str4 = str2;
                        Integer valueOf7 = Integer.valueOf(bundle2.getInt("patch_format"));
                        i3 = i7;
                        String string5 = bundle2.getString("patch_module_base_version");
                        String str15 = "'";
                        String string6 = bundle2.getString("patch_module_base_signature");
                        Bundle bundle3 = bundle2;
                        String str16 = (String) hashMap2.get(m10719b(string, string5));
                        if (a3 == null) {
                            valueOf6 = null;
                            valueOf7 = null;
                            uri = null;
                            str9 = null;
                            str8 = null;
                            str7 = null;
                        } else if (valueOf6.longValue() == 0) {
                            valueOf6 = null;
                            valueOf7 = null;
                            uri = null;
                            str9 = null;
                            str8 = null;
                            str7 = null;
                        } else {
                            Uri uri2 = a3;
                            if (!f15309b.contains(valueOf7) || string5 == null) {
                                valueOf6 = null;
                                valueOf7 = null;
                                uri = null;
                                str9 = null;
                                str8 = null;
                                str7 = null;
                            } else if ((string5.equals(okVar4.get(string)) || str16 != null) && string6 != null) {
                                str7 = str16;
                                str9 = string5;
                                str8 = string6;
                                uri = uri2;
                            } else {
                                valueOf6 = null;
                                valueOf7 = null;
                                uri = null;
                                str9 = null;
                                str8 = null;
                                str7 = null;
                            }
                        }
                        try {
                            String a4 = eni.m10768a(string4);
                            int i8 = okVar6.f26809h;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    emo = null;
                                    break;
                                }
                                emo = (emo) okVar6.mo15621c(i9);
                                String str17 = emo.f15296b;
                                if (string.equals(emo.f15295a) && (str17 == null || str17.equals(string3))) {
                                    break;
                                }
                                i9++;
                            }
                            if (emo == null) {
                                StringBuilder sb3 = new StringBuilder(string.length() + 50 + String.valueOf(string3).length());
                                sb3.append("Ignoring Zapp module response for unknown module ");
                                sb3.append(string);
                                sb3.append(":");
                                sb3.append(string3);
                                Log.w("DynamicModuleDownloader", sb3.toString());
                                hashMap = hashMap2;
                                okVar3 = okVar2;
                            } else {
                                String str18 = emo.f15296b;
                                if (str18 != null && !str18.equals(string3)) {
                                    String str19 = emo.f15296b;
                                    StringBuilder sb4 = new StringBuilder(string.length() + 56 + String.valueOf(str19).length() + String.valueOf(string3).length());
                                    sb4.append("Zapp module ");
                                    sb4.append(string);
                                    sb4.append(" has incorrect version (expected ");
                                    sb4.append(str19);
                                    sb4.append(", offered ");
                                    sb4.append(string3);
                                    sb4.append(")");
                                    Log.e("DynamicModuleDownloader", sb4.toString());
                                    return null;
                                }
                                hashMap = hashMap2;
                                emn emn = new emn(emo.f15295a, string3, a, j, a4, i, emo.f15299e, emq.m10683a(this.f15311d));
                                if (a2 != null) {
                                    emn.mo10279a(a2, valueOf4.longValue(), valueOf5.intValue());
                                }
                                if (uri != null) {
                                    emn.mo10280a(uri, valueOf6.longValue(), valueOf7.intValue(), str9, str8, str7);
                                }
                                emn.f15292u = bundle3.getBoolean("show_notification");
                                emn.f15293v = emo.f15297c;
                                emn.f15294w = emo.f15298d;
                                String a5 = emn.m10671a(emo.f15295a, emo.f15296b);
                                okVar3 = okVar2;
                                if (((emn) okVar3.put(a5, emn)) != null) {
                                    StringBuilder sb5 = new StringBuilder(string.length() + 52 + String.valueOf(string3).length());
                                    sb5.append("Received duplicate Zapp module response for module ");
                                    sb5.append(string);
                                    sb5.append(":");
                                    sb5.append(string3);
                                    Log.w("DynamicModuleDownloader", sb5.toString());
                                }
                            }
                        } catch (IllegalArgumentException e4) {
                            hashMap = hashMap2;
                            okVar3 = okVar2;
                            StringBuilder sb6 = new StringBuilder(string.length() + 37);
                            sb6.append("Ignoring invalid SHA256 for module '");
                            sb6.append(string);
                            sb6.append(str15);
                            Log.e("DynamicModuleDownloader", sb6.toString());
                        }
                    }
                    size = i2;
                    okVar4 = okVar;
                    okVar2 = okVar3;
                    list3 = list2;
                    str = str5;
                    str2 = str4;
                    hashMap2 = hashMap;
                    i7 = i3 + 1;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(string).length() + 46);
                sb7.append("Ignoring malformed Zapp response for module '");
                sb7.append(string);
                sb7.append(str6);
                Log.w("DynamicModuleDownloader", sb7.toString());
                size = i2;
                okVar4 = okVar;
                okVar2 = okVar3;
                list3 = list2;
                str = str5;
                str2 = str4;
                hashMap2 = hashMap;
                i7 = i3 + 1;
            }
            C1245ok okVar7 = okVar2;
            if (okVar7.f26809h == okVar6.f26809h) {
                return okVar7;
            }
            Log.e("DynamicModuleDownloader", "Zapp module info missing, aborting download");
            return null;
        } else {
            emw = this;
        }
        if (ems != null) {
            int i10 = ems.f15304a;
            StringBuilder sb8 = new StringBuilder(11);
            sb8.append(i10);
            str3 = sb8.toString();
            if (ems.f15306c != null) {
                String valueOf8 = String.valueOf(str3);
                int i11 = ems.f15306c.getInt("error_code");
                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 12);
                sb9.append(valueOf8);
                sb9.append(",");
                sb9.append(i11);
                str3 = sb9.toString();
            }
        } else {
            emw.m10710a(5, -1027);
            m10727e();
            str3 = null;
        }
        String valueOf222 = String.valueOf(str3);
        Log.e("DynamicModuleDownloader", valueOf222.length() == 0 ? new String("Zapp module request failed: ") : "Zapp module request failed: ".concat(valueOf222));
        return null;
    }

    /* renamed from: a */
    private final C1245ok m10709a(C1245ok okVar) {
        String str;
        C1245ok okVar2 = new C1245ok(okVar.f26809h);
        for (int i = 0; i < okVar.f26809h; i++) {
            emn emn = (emn) okVar.mo15621c(i);
            if (m10701a(emn.f15272a, emn.f15273b) == 6 && ((str = (String) okVar2.get(emn.f15272a)) == null || str.compareTo(emn.f15273b) < 0)) {
                okVar2.put(emn.f15272a, emn.f15273b);
            }
        }
        return okVar2;
    }

    /* renamed from: b */
    public final Bundle mo10305b(Bundle bundle) {
        emn a;
        String d = m10725d(bundle);
        SharedPreferences b = this.f15314g.mo10298b();
        Map<String, ?> all = b.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (str.startsWith("_") && str.contains(":") && (a = emn.m10670a(b.getString(str, null))) != null && d.equals(a.f15272a)) {
                arrayList.add(a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((emn) arrayList.get(i)).f15273b);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("version_codes", arrayList2);
        return bundle2;
    }

    /* renamed from: a */
    private final synchronized void m10710a(int i, int i2) {
        this.f15315h.add(m10705a(i, i2, null, 0, 0));
    }

    /* renamed from: a */
    private final synchronized void m10711a(int i, int i2, emn emn) {
        this.f15315h.add(m10705a(i, i2, emn, 0, 0));
    }

    /* renamed from: a */
    private final void m10712a(SharedPreferences sharedPreferences, emn emn, String str, long j) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.putString(emn.mo10282c(), emn.toString());
        if (edit.commit()) {
            this.f15312e.mo10294b(j);
        }
    }

    /* renamed from: b */
    public final Bundle mo10306b(List list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("module_download_info_response_bundles", new ArrayList(0));
        if (!list.isEmpty()) {
            C1245ok a = m10707a(this.f15314g.mo10298b(), (C1245ok) null);
            C1245ok okVar = new C1245ok(a.f26809h);
            for (int i = 0; i < a.f26809h; i++) {
                emn emn = (emn) a.mo15621c(i);
                okVar.put(emn.m10671a(emn.f15272a, emn.f15273b), emn);
            }
            ArrayList arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Bundle bundle2 = (Bundle) list.get(i2);
                String d = m10725d(bundle2);
                String a2 = emn.m10671a(d, bundle2.getString("version_code"));
                if (okVar.containsKey(a2)) {
                    arrayList2.add(m10724d((emn) okVar.mo15621c(okVar.mo15616a(a2))));
                } else {
                    arrayList.add(new emo(d, bundle2.getString("version_code"), null, null, false, bundle2.getString("existing_version_code"), bundle2.getString("patch_module_base_external_path")));
                }
            }
            int b = m10716b(a);
            m10723c(a);
            C1245ok a3 = m10708a(arrayList, b, m10709a(a));
            if (a3 != null) {
                for (int i3 = 0; i3 < a3.f26809h; i3++) {
                    arrayList2.add(m10724d((emn) a3.mo15621c(i3)));
                }
                bundle.putParcelableArrayList("module_download_info_response_bundles", arrayList2);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private final synchronized void m10713a(emn emn, long j, long j2) {
        this.f15315h.add(m10705a(13, 0, emn, j, j2));
    }

    /* renamed from: a */
    private static void m10714a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m10715a(File file, long j) {
        return file.getUsableSpace() >= j * 4;
    }

    /* renamed from: a */
    public final Bundle mo10300a(long j) {
        emn b = m10718b(j);
        Bundle bundle = new Bundle();
        if (b != null) {
            bundle.putString("com.google.android.finsky.zapp.MODULE_NAME", b.f15272a);
            bundle.putString("com.google.android.finsky.zapp.MODULE_VERSION", b.f15273b);
            bundle.putInt("com.google.android.finsky.zapp.DOWNLOAD_STATUS", m10726e(b));
        }
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: emw.a(java.lang.String, java.lang.String, boolean):int
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      emw.a(java.util.List, int, ok):ok
      emw.a(int, int, emn):void
      emw.a(emn, long, long):void
      enb.a(int, android.os.Parcel, android.os.Parcel):boolean
      dck.a(int, android.os.Parcel, android.os.Parcel):boolean
      emw.a(java.lang.String, java.lang.String, boolean):int */
    /* renamed from: a */
    public final Bundle mo10301a(Bundle bundle) {
        String str;
        String str2;
        emn emn;
        String d = m10725d(bundle);
        String string = bundle.getString("version_code");
        emn a = this.f15314g.mo10295a(d, string);
        Integer num = null;
        if (bundle.getBoolean("ingest")) {
            emn a2 = this.f15314g.mo10295a(d, string);
            C1245ok b = mo10307b();
            if (b != null) {
                int i = 0;
                while (true) {
                    if (i >= b.f26809h) {
                        break;
                    }
                    emn = (emn) b.mo15621c(i);
                    if (emn.f15272a.equals(d) && emn.f15289r != null && emn.f15290s == 8 && (string == null || emn.f15273b.equals(string))) {
                        a2 = m10718b(emn.f15289r.longValue());
                    } else {
                        i++;
                    }
                }
                a2 = m10718b(emn.f15289r.longValue());
            }
            str = a2 != null ? this.f15314g.mo10297a(a2) : null;
        } else {
            str = a != null ? this.f15314g.mo10297a(a) : null;
        }
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("file_path", str);
        }
        bundle2.putString("version_code", string);
        bundle2.putInt("module_status", m10701a(d, string));
        bundle2.putInt("pending_module_status", m10702a(d, string, false));
        emn a3 = this.f15314g.mo10295a(d, string);
        if (a3 != null && this.f15314g.mo10299b(a3).exists()) {
            num = a3.f15278g;
        }
        if (num != null) {
            bundle2.putInt("apk_version_at_which_offered", num.intValue());
        }
        if (!(a == null || (str2 = a.f15276e) == null)) {
            bundle2.putString("hash_sha256", str2);
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1245ok mo10307b() {
        C1245ok a = m10707a(this.f15314g.mo10298b(), (C1245ok) null);
        m10723c(a);
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: emw.a(java.util.List, boolean):android.os.Bundle
     arg types: [java.util.List, int]
     candidates:
      emw.a(java.lang.String, java.lang.String):int
      emw.a(android.content.SharedPreferences, ok):ok
      emw.a(int, int):void
      emw.a(java.io.File, long):boolean
      emw.a(java.util.List, boolean):android.os.Bundle */
    @Deprecated
    /* renamed from: a */
    public final Bundle mo10302a(List list) {
        return mo10303a(list, false);
    }

    /* renamed from: a */
    public final Bundle mo10303a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            arrayList.add(new emo(m10725d(bundle), bundle.getString("version_code"), bundle.getString("notification_title"), bundle.getString("notification_description"), bundle.getBoolean("metered"), bundle.getString("existing_version_code"), bundle.getString("patch_module_base_external_path")));
        }
        boolean b = m10721b(arrayList, z);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("download_successful", b);
        return bundle2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[SYNTHETIC, Splitter:B:29:0x0073] */
    /* renamed from: a */
    public final synchronized void mo10304a() {
        int i;
        SharedPreferences.Editor edit;
        int i2;
        C1245ok okVar = new C1245ok();
        SharedPreferences b = this.f15314g.mo10298b();
        C1245ok a = m10707a(b, okVar);
        if (!a.isEmpty()) {
            i = 0;
            while (i < a.f26809h) {
            }
            edit = b.edit();
            edit.clear();
            while (i2 < a.f26809h) {
            }
            if (edit.commit()) {
            }
        } else if (!okVar.isEmpty()) {
            i = 0;
            while (i < a.f26809h) {
                emn emn = (emn) a.mo15621c(i);
                Long l = emn.f15289r;
                if (l != null) {
                    okVar.put(l, Boolean.TRUE);
                }
                m10711a(4, 0, emn);
                i++;
            }
            edit = b.edit();
            edit.clear();
            for (i2 = 0; i2 < a.f26809h; i2++) {
                emn emn2 = (emn) a.mo15621c(i2);
                if (!okVar.containsKey(emn2.f15289r)) {
                    edit.putString(emn2.mo10282c(), emn2.toString());
                }
            }
            if (edit.commit()) {
                Log.w("DynamicModuleDownloader", "Failed to store updated downloads list, not canceling downloads");
                return;
            }
            if (!okVar.isEmpty()) {
                int i3 = okVar.f26809h;
                long[] jArr = new long[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    jArr[i4] = ((Long) okVar.mo15620b(i4)).longValue();
                }
                this.f15312e.mo10294b(jArr);
            }
            m10727e();
        }
    }
}
