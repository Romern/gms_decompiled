package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgl extends dgm {

    /* renamed from: a */
    public String f13063a;

    /* renamed from: b */
    public String f13064b;

    /* renamed from: c */
    public String f13065c;

    /* renamed from: j */
    private final int f13066j;

    /* renamed from: k */
    private final String f13067k;

    /* renamed from: l */
    private final int f13068l;

    public dgl(Context context, int i, String str, int i2, int i3, String str2, dhs dhs) {
        super(context, 4, i, dhs, str);
        this.f13068l = i2;
        this.f13066j = i3;
        this.f13067k = str2;
    }

    /* renamed from: a */
    public final ClassLoader mo8908a(ClassLoader classLoader) {
        String str;
        String str2 = this.f13065c;
        if (str2 == null) {
            str2 = mo8959h();
        }
        if (!TextUtils.isEmpty(this.f13188h)) {
            if (str2 != null) {
                String str3 = File.pathSeparator;
                String str4 = this.f13188h;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                str2 = sb.toString();
            } else {
                str2 = this.f13188h;
            }
        }
        try {
            str = new File(this.f13070d).getCanonicalPath();
        } catch (IOException e) {
            String str5 = this.f13070d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 45);
            sb2.append("Unable to determine canonical path for apk '");
            sb2.append(str5);
            sb2.append("'");
            Log.w("ChimeraFileApk", sb2.toString());
            str = this.f13070d;
        }
        int i = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(this.f13187g)) {
            String valueOf = String.valueOf(str);
            String str6 = File.pathSeparator;
            String str7 = this.f13187g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str6).length() + String.valueOf(str7).length());
            sb3.append(valueOf);
            sb3.append(str6);
            sb3.append(str7);
            str = sb3.toString();
        }
        ClassLoader a = diy.m8599a(str, str2, classLoader);
        String str8 = this.f13063a;
        if (str8 == null) {
            return a;
        }
        try {
            a.loadClass(str8);
            return a;
        } catch (ClassNotFoundException e2) {
            String str9 = this.f13070d;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb4 = new StringBuilder(String.valueOf(str9).length() + 41 + String.valueOf(valueOf2).length());
            sb4.append("Failed to validate PathClassLoader for ");
            sb4.append(str9);
            sb4.append(": ");
            sb4.append(valueOf2);
            Log.w("ChimeraFileApk", sb4.toString());
            int i2 = Build.VERSION.SDK_INT;
            String valueOf3 = String.valueOf(new File(this.f13070d).getName());
            throw new djq(valueOf3.length() == 0 ? new String("Can't load code for ") : "Can't load code for ".concat(valueOf3));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dgl) {
            return this.f13070d.equals(((dgl) obj).f13070d);
        }
        return false;
    }

    /* renamed from: f */
    public final din mo8914f() {
        bxvd j = mo8962j();
        long l = mo8967l();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        din.f13231a |= 4;
        din.f13234d = l;
        PackageInfo packageArchiveInfo = this.f13185e.getPackageManager().getPackageArchiveInfo(this.f13070d, 0);
        if (packageArchiveInfo == null) {
            String valueOf = String.valueOf(this.f13070d);
            throw new PackageManager.NameNotFoundException(valueOf.length() == 0 ? new String("Failed reading stored package info from ") : "Failed reading stored package info from ".concat(valueOf));
        }
        String str = packageArchiveInfo.packageName;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din3 = (din) j.f164949b;
        str.getClass();
        din3.f13231a |= 16;
        din3.f13236f = str;
        String str2 = packageArchiveInfo.versionName == null ? "" : packageArchiveInfo.versionName;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din4 = (din) j.f164949b;
        str2.getClass();
        din4.f13231a |= 32;
        din4.f13237g = str2;
        int i = packageArchiveInfo.versionCode;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din5 = (din) j.f164949b;
        din5.f13231a |= 64;
        din5.f13238h = i;
        return (din) j.mo74062i();
    }

    /* renamed from: h */
    public final String mo8959h() {
        String str = this.f13070d;
        File file = new File(new File(str).getParentFile(), "n");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (file.exists()) {
            List b = djr.m8671b();
            int size = b.size();
            while (i < size) {
                String str2 = (String) b.get(i);
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append("/");
                sb.append(str2);
                arrayList.add(sb.toString());
                i++;
            }
        } else {
            int i2 = Build.VERSION.SDK_INT;
            List b2 = djr.m8671b();
            int size2 = b2.size();
            while (i < size2) {
                String str3 = (String) b2.get(i);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str3).length());
                sb2.append(str);
                sb2.append("!/lib/");
                sb2.append(str3);
                arrayList.add(sb2.toString());
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join(File.pathSeparator, arrayList);
        }
        return null;
    }

    public final int hashCode() {
        return this.f13070d.hashCode();
    }

    /* renamed from: i */
    public final boolean mo8961i() {
        return this.f13070d.startsWith("/system/");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final bxvd mo8962j() {
        bxvd j = super.mo8962j();
        int i = this.f13068l;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        din.f13239i = i - 1;
        int i2 = din.f13231a | 128;
        din.f13231a = i2;
        int i3 = this.f13066j;
        int i4 = i2 | 512;
        din.f13231a = i4;
        din.f13242l = i3;
        String str = this.f13067k;
        str.getClass();
        din.f13231a = i4 | 2048;
        din.f13244n = str;
        if (mo8961i()) {
            String str2 = Build.FINGERPRINT;
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            din din3 = (din) j.f164949b;
            str2.getClass();
            din3.f13231a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            din3.f13247q = str2;
        }
        return j;
    }

    /* renamed from: o */
    public final boolean mo8963o() {
        return this.f13068l == 3;
    }

    /* renamed from: p */
    public final boolean mo8964p() {
        return this.f13068l == 2;
    }

    public final String toString() {
        String str = this.f13070d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append("FileApk(");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dht.a(djy, boolean):boolean
     arg types: [djy, int]
     candidates:
      dht.a(android.content.Context, djy):dht
      dht.a(java.io.InputStream, byte[]):void
      dht.a(djy, boolean):boolean */
    /* renamed from: a */
    public final boolean mo8909a(djy djy) {
        return mo8957a(djy, false);
    }

    /* renamed from: a */
    public final boolean mo8957a(djy djy, boolean z) {
        if (mo8967l() != djy.mo9153d()) {
            return false;
        }
        if (!z || !mo8961i() || Build.FINGERPRINT.equals(djy.mo9166q())) {
            return true;
        }
        return false;
    }
}
