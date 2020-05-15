package com.google.android.gms.common.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.Conscrypt;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProviderInstallerImpl {

    /* renamed from: a */
    private static final Object f30300a = new Object();

    /* renamed from: b */
    private static Provider f30301b;

    /* renamed from: a */
    private static SSLContext m22647a() {
        int i = 0;
        while (i < 2) {
            try {
                SSLContext instance = SSLContext.getInstance("Default");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        throw new SecurityException("Failed to find SSLContext.Default provider");
    }

    private static native int getNativeCodeVersion();

    public static void insertProvider(Context context) {
        sgt sgt = new sgt(context);
        synchronized (f30300a) {
            if (f30301b == null) {
                m22648a(sgt);
            }
            int insertProviderAt = Security.insertProviderAt(f30301b, 1);
            if (insertProviderAt == 1) {
                int i = Build.VERSION.SDK_INT;
                Security.setProperty("ssl.SocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLSocketFactoryImpl");
                Security.setProperty("ssl.ServerSocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLServerSocketFactoryImpl");
                SSLContext a = m22647a();
                SSLContext.setDefault(a);
                HttpsURLConnection.setDefaultSSLSocketFactory(a.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(cayn.f176430a);
                Log.i("ProviderInstaller", "Installed default security provider GmsCore_OpenSSL");
            } else if (insertProviderAt != -1) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("Failed to install security provider GmsCore_OpenSSL, result: ");
                sb.append(insertProviderAt);
                throw new SecurityException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m22648a(Context context) {
        if ("com.google.android.gms".equals(context.getPackageName())) {
            try {
                context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                if (sro.m36134b(context, "conscrypt_gmscore_jni")) {
                    int a = srr.m36143a(spo.m35902a(context));
                    try {
                        int nativeCodeVersion = getNativeCodeVersion();
                        if (a != nativeCodeVersion) {
                            throw new SecurityException(String.format("libgmscore version mismatch (%d vs. %d)", Integer.valueOf(a), Integer.valueOf(nativeCodeVersion)));
                        }
                    } catch (UnsatisfiedLinkError e) {
                        throw new SecurityException(e);
                    }
                } else {
                    throw new SecurityException("loadLibrary failed");
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new SecurityException("Failed to find ApplicationInfo", e2);
            }
        } else {
            System.loadLibrary("conscrypt_gmscore_jni");
        }
        Conscrypt.ProviderBuilder newProviderBuilder = Conscrypt.newProviderBuilder();
        newProviderBuilder.setName("GmsCore_OpenSSL");
        newProviderBuilder.defaultTlsProtocol("TLSv1.2");
        f30301b = newProviderBuilder.build();
    }
}
