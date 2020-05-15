package p000;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: qiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qiv {

    /* renamed from: a */
    public static final File f41485a = new File("/system/etc/security/otacerts.zip");

    /* renamed from: b */
    public static final sek f41486b = qgn.m32143a("DevicePropertiesModule");

    /* renamed from: a */
    static long m32232a(Context context) {
        return qdn.m31947b(context);
    }

    /* renamed from: b */
    static long m32235b(Context context) {
        return qdn.m31956h(context);
    }

    /* renamed from: c */
    static long m32237c(Context context) {
        return qdg.m31920b(context);
    }

    /* renamed from: d */
    static String m32239d() {
        return "SHA-1";
    }

    /* renamed from: e */
    static bmxv m32241e(Context context) {
        return bmxv.m108567c(qdn.m31960l(context).getString("CheckinService_deviceDataVersionInfo", null));
    }

    /* renamed from: f */
    static bmxv m32242f(Context context) {
        int c = svu.m36486a().mo26190c(context);
        return c >= 0 ? bmxv.m108566b(Integer.valueOf(c)) : bmvz.f131120a;
    }

    /* renamed from: g */
    static qho m32243g(Context context) {
        return qdg.m31927h(context);
    }

    /* renamed from: h */
    static qgt m32244h(Context context) {
        if (sre.m36080a(context)) {
            return qgt.SW_DEVICE;
        }
        if (sre.m36082b(context)) {
            return qgt.LATCHSKY_DEVICE;
        }
        return qgt.NO_RESTRICTION;
    }

    /* renamed from: i */
    static bmxv m32245i(Context context) {
        String j = qdn.m31958j(context);
        String k = qdn.m31959k(context);
        if (j == null || k == null) {
            return bmvz.f131120a;
        }
        bxvd da = qgw.f41264d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgw qgw = (qgw) da.f164949b;
        j.getClass();
        int i = qgw.f41266a | 1;
        qgw.f41266a = i;
        qgw.f41267b = j;
        k.getClass();
        qgw.f41266a = i | 2;
        qgw.f41268c = k;
        return bmxv.m108566b((qgw) da.mo74062i());
    }

    /* renamed from: a */
    static String m32233a() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }

    /* renamed from: b */
    static bmxv m32236b() {
        TimeZone timeZone = TimeZone.getDefault();
        return timeZone != null ? bmxv.m108566b(timeZone.getID()) : bmvz.f131120a;
    }

    /* renamed from: c */
    static Integer m32238c() {
        return Integer.valueOf(svu.m36486a().mo26189c());
    }

    /* renamed from: d */
    static String m32240d(Context context) {
        return aymn.m84265a(context.getContentResolver(), "digest", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* renamed from: a */
    static List m32234a(cayo cayo, String str) {
        int i;
        ZipFile zipFile;
        ArrayList arrayList = new ArrayList();
        try {
            zipFile = new ZipFile((File) cayo.mo16713a());
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                byte[] bArr = new byte[2048];
                i = 0;
                while (entries.hasMoreElements()) {
                    try {
                        InputStream inputStream = zipFile.getInputStream((ZipEntry) entries.nextElement());
                        MessageDigest a = spo.m35903a(str);
                        if (a != null) {
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                a.update(bArr, 0, read);
                            }
                            arrayList.add(Base64.encodeToString(a.digest(), 2));
                            i++;
                        } else {
                            f41486b.mo25420f("no support for SHA-1?", new Object[0]);
                            arrayList.add("--NoSuchAlgorithmException--");
                            i++;
                        }
                        inputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e) {
                                e = e;
                                f41486b.mo25415d("error reading OTA certs: %s", e, e.getMessage());
                                arrayList.add("--IOException--");
                                i++;
                                if (i == 0) {
                                }
                                return arrayList;
                            }
                        }
                        throw th;
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException e2) {
                    e = e2;
                }
                if (i == 0) {
                    arrayList.add("--no-output--");
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                i = 0;
                if (zipFile != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
            i = 0;
            if (zipFile != null) {
            }
            throw th;
        }
    }
}
