package com.google.android.gms.ads.identifier.settings;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.ads.identifier.settings.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0289g {

    /* renamed from: a */
    private static befa f8028a;

    /* renamed from: a */
    private static synchronized befa m5218a() {
        befa befa;
        synchronized (C0289g.class) {
            if (f8028a == null) {
                f8028a = new befa(Arrays.asList(new befu()), Arrays.asList(new beih()));
            }
            befa = f8028a;
        }
        return befa;
    }

    /* renamed from: a */
    public static byte[] m5219a(PackageInfo packageInfo, String str) {
        InputStream inputStream;
        try {
            if (!cbvp.f178349a.mo6606a().mo75438j()) {
                return m5220a(new File(packageInfo.applicationInfo.sourceDir));
            }
            befq a = befr.m94979a();
            a.mo60673b(packageInfo.applicationInfo.sourceDir);
            Uri a2 = beii.m95136a(a.mo60670a(), beij.f111582a);
            befa a3 = m5218a();
            begc begc = new begc(a2);
            inputStream = (InputStream) a3.mo60643a(a2, behs.m95063a(), begc);
            boav.m111026b(inputStream);
            String a4 = beih.m95128a((Uri) bqfy.m112768a(begc.f111529a, IOException.class));
            if (a4 == null) {
                Log.d("ApkHashUtils", "Digest cannot be found in computed uri");
                if (inputStream == null) {
                    return null;
                }
                inputStream.close();
                return null;
            }
            byte[] decode = Base64.decode(a4, 2);
            if (inputStream != null) {
                inputStream.close();
            }
            return decode;
            return null;
            throw th;
        } catch (NoSuchAlgorithmException e) {
            Log.w("HashAPK", String.format("NoSuchAlgorithmException %s", e));
        } catch (IOException e2) {
            Log.w("HashAPK", String.format("Failed to hash package %s", str));
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
    }

    /* renamed from: a */
    static byte[] m5220a(File file) {
        byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
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
            Log.d("ApkHashUtils", String.format("Hashing algorithm cannot be found", new Object[0]));
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            return messageDigest.digest();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
