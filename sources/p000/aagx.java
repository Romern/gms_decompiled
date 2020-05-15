package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aagx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagx extends aahl {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: a */
    static String m21247a(File file) {
        byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
        FileInputStream fileInputStream = null;
        MessageDigest messageDigest = null;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
            }
            if (messageDigest != null) {
                break;
            }
        }
        if (messageDigest == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                for (int read = fileInputStream2.read(bArr); read != -1; read = fileInputStream2.read(bArr)) {
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream2.close();
                return srv.m36160a(messageDigest.digest());
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a9, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b0, code lost:
        if ((r6.getCause() instanceof p000.bxwf) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        throw ((p000.bxwf) r6.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b9, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01bb, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c2, code lost:
        if ((r6.getCause() instanceof p000.bxwf) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cd, code lost:
        throw new p000.bxwf(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d4, code lost:
        throw ((p000.bxwf) r6.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d9, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ef, code lost:
        android.util.Log.w(p000.aahl.f28139b, java.lang.String.format("Failed to find package %s", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01fe, code lost:
        if (r3 != null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0201, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0202, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0212, code lost:
        if (r3 == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0214, code lost:
        r3.mo16867a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0218, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0219, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x021c, code lost:
        r3.mo16867a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018f, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0190, code lost:
        if (r11 != null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        p000.bqye.m113761a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d8 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ed A[Catch:{ IOException -> 0x01ba, RuntimeException -> 0x01a8, NoSuchAlgorithmException -> 0x0201, NameNotFoundException -> 0x01ee, all -> 0x01d8, bxwf -> 0x01a5, bxwf -> 0x01d5, all -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ee A[Catch:{ IOException -> 0x01ba, RuntimeException -> 0x01a8, NoSuchAlgorithmException -> 0x0201, NameNotFoundException -> 0x01ee, all -> 0x01d8, bxwf -> 0x01a5, bxwf -> 0x01d5, all -> 0x0218 }, ExcHandler: NameNotFoundException (e android.content.pm.PackageManager$NameNotFoundException), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0200 A[Catch:{ IOException -> 0x01ba, RuntimeException -> 0x01a8, NoSuchAlgorithmException -> 0x0201, NameNotFoundException -> 0x01ee, all -> 0x01d8, bxwf -> 0x01a5, bxwf -> 0x01d5, all -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0201 A[Catch:{ IOException -> 0x01ba, RuntimeException -> 0x01a8, NoSuchAlgorithmException -> 0x0201, NameNotFoundException -> 0x01ee, all -> 0x01d8, bxwf -> 0x01a5, bxwf -> 0x01d5, all -> 0x0218 }, ExcHandler: NoSuchAlgorithmException (r0v1 'e' java.security.NoSuchAlgorithmException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a1 A[ExcHandler: IOException (e java.io.IOException), PHI: r3 10  PHI: (r3v8 aago) = (r3v0 aago), (r3v9 aago), (r3v9 aago), (r3v9 aago), (r3v9 aago), (r3v0 aago), (r3v0 aago) binds: [B:11:0x0035, B:67:0x0167, B:68:?, B:72:0x017a, B:73:?, B:88:0x0198, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE], Splitter:B:11:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a3 A[ExcHandler: NameNotFoundException (e android.content.pm.PackageManager$NameNotFoundException), PHI: r3 10  PHI: (r3v7 aago) = (r3v0 aago), (r3v9 aago), (r3v9 aago), (r3v9 aago), (r3v9 aago), (r3v0 aago), (r3v0 aago) binds: [B:11:0x0035, B:67:0x0167, B:68:?, B:72:0x017a, B:73:?, B:88:0x0198, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE], Splitter:B:11:0x0035] */
    /* renamed from: a */
    public final int mo16868a(Context context, aaip aaip) {
        String str;
        Signature[] signatureArr;
        String str2;
        Throwable th;
        String str3 = "";
        aago aago = null;
        try {
            bxtx bxtx = aaip.f28213c;
            bxus c = bxus.m123744c();
            aaiq aaiq = aaiq.f28214c;
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) aaiq.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), c);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            str3 = ((aaiq) bxvk).f28217b;
            try {
                new Object[1][0] = str3;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str3, 0);
                if (packageInfo != null) {
                    int i = packageInfo.versionCode;
                    String str4 = packageInfo.versionName == null ? "0" : packageInfo.versionName;
                    bxvd da = aaim.f28200g.mo74144da();
                    Object[] objArr = {str3, str4};
                    if (!cebj.f182222a.mo6606a().mo78733a()) {
                        str = m21247a(new File(packageInfo.applicationInfo.sourceDir));
                    } else {
                        befq a2 = befr.m94979a();
                        a2.mo60673b(packageInfo.applicationInfo.sourceDir);
                        Uri a3 = beii.m95136a(a2.mo60670a(), beij.f111582a);
                        befa b = aagu.m21243b();
                        begc begc = new begc(a3);
                        InputStream inputStream = (InputStream) b.mo60643a(a3, behs.m95063a(), begc);
                        boav.m111026b(inputStream);
                        String a4 = beih.m95128a((Uri) bqfy.m112768a(begc.f111529a, IOException.class));
                        if (a4 != null) {
                            String a5 = srv.m36160a(Base64.decode(a4, 2));
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            str = a5;
                        } else {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            str = null;
                        }
                    }
                    if (str == null) {
                        new Object[1][0] = str3;
                        return 2;
                    }
                    if (ceba.m135893b()) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (packageInfo.signingInfo != null) {
                            SigningInfo signingInfo = packageInfo.signingInfo;
                            if (!signingInfo.hasMultipleSigners()) {
                                signatureArr = signingInfo.getSigningCertificateHistory();
                            } else {
                                signatureArr = signingInfo.getApkContentsSigners();
                            }
                            if (signatureArr.length > 0) {
                                str2 = signatureArr[0].toCharsString();
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                aaim aaim = (aaim) da.f164949b;
                                str2.getClass();
                                aaim.f28202a |= 16;
                                aaim.f28207f = str2;
                            }
                        }
                    }
                    Object[] objArr2 = {str3, str};
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aaim aaim2 = (aaim) da.f164949b;
                    str3.getClass();
                    aaim2.f28202a |= 1;
                    aaim2.f28203b = str3;
                    String l = Long.toString((long) i);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aaim aaim3 = (aaim) da.f164949b;
                    l.getClass();
                    int i3 = 4 | aaim3.f28202a;
                    aaim3.f28202a = i3;
                    aaim3.f28205d = l;
                    str4.getClass();
                    int i4 = i3 | 2;
                    aaim3.f28202a = i4;
                    aaim3.f28204c = str4;
                    if (str != null) {
                        str.getClass();
                        aaim3.f28202a = i4 | 8;
                        aaim3.f28206e = str;
                    }
                    aago = aago.m21234a(context);
                    aaim aaim4 = (aaim) da.mo74062i();
                    try {
                        aago.f28087a.mo16851a(aaim4);
                        new Object[1][0] = aaim4.f28203b;
                    } catch (aagp e) {
                        new Object[1][0] = aaim4.f28203b;
                    }
                    if (aago != null) {
                        aago.mo16867a();
                    }
                    return 0;
                }
                new Object[1][0] = str3;
                return 2;
                throw th;
            } catch (NoSuchAlgorithmException e2) {
                NoSuchAlgorithmException noSuchAlgorithmException = e2;
                Log.w(aahl.f28139b, String.format("NoSuchAlgorithmException %s", noSuchAlgorithmException));
            } catch (PackageManager.NameNotFoundException e3) {
            } catch (IOException e4) {
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (aago != null) {
                }
                throw th3;
            }
        } catch (NoSuchAlgorithmException e5) {
        } catch (PackageManager.NameNotFoundException e6) {
        } catch (IOException e7) {
            Log.w(aahl.f28139b, String.format("Failed to hash package %s", str3));
            if (aago != null) {
            }
            return 2;
        } catch (Throwable th4) {
        }
    }
}
