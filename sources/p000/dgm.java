package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: dgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dgm extends dht {

    /* renamed from: a */
    private ApplicationInfo f13069a;

    /* renamed from: d */
    public final String f13070d;

    public dgm(Context context, int i, int i2, dhs dhs, String str) {
        super(context, i, i2, dhs);
        this.f13070d = str;
    }

    /* renamed from: a */
    public final synchronized ApplicationInfo mo8907a() {
        if (this.f13069a == null) {
            ApplicationInfo applicationInfo = new ApplicationInfo();
            this.f13069a = applicationInfo;
            applicationInfo.packageName = this.f13185e.getPackageName();
            ApplicationInfo applicationInfo2 = this.f13069a;
            String str = this.f13070d;
            applicationInfo2.publicSourceDir = str;
            applicationInfo2.sourceDir = str;
        }
        return this.f13069a;
    }

    /* renamed from: b */
    public final String mo8910b() {
        return this.f13070d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public bxvd mo8962j() {
        bxvd j = super.mo8962j();
        String str = this.f13070d;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        str.getClass();
        din.f13231a |= 2;
        din.f13233c = str;
        return j;
    }

    /* renamed from: k */
    public final dmj mo8966k() {
        InputStream inputStream;
        try {
            ZipFile zipFile = new ZipFile(this.f13070d);
            try {
                ZipEntry entry = zipFile.getEntry("assets/ChimeraManifest.pb");
                if (entry != null) {
                    try {
                        inputStream = zipFile.getInputStream(entry);
                        if (inputStream != null) {
                            dmj a = dht.m8528a(inputStream);
                            inputStream.close();
                            zipFile.close();
                            return a;
                        }
                        throw new IOException("input stream is null");
                    } catch (IOException e) {
                        String str = this.f13070d;
                        String name = entry.getName();
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(name).length() + String.valueOf(message).length());
                        sb.append("Failed to read chimera manifests from ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(name);
                        sb.append(": ");
                        sb.append(message);
                        Log.e("ChimeraFileApkBase", sb.toString());
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                zipFile.close();
                return null;
                throw th;
            } catch (Throwable th2) {
                zipFile.close();
                throw th2;
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(this);
            String message2 = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(message2).length());
            sb2.append("Failed to read chimera manifests from ");
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(message2);
            Log.e("ChimeraFileApkBase", sb2.toString());
            return null;
        } catch (Throwable th3) {
            bqye.m113761a(th2, th3);
        }
    }

    /* renamed from: l */
    public final long mo8967l() {
        long lastModified = new File(this.f13070d).lastModified();
        if (lastModified != 0) {
            return lastModified;
        }
        throw new PackageManager.NameNotFoundException(this.f13070d);
    }
}
