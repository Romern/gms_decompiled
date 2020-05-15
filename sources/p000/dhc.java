package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dhc extends dht {

    /* renamed from: a */
    public final String f13095a;

    protected dhc(Context context, int i, int i2, String str) {
        super(context, i, i2, null);
        this.f13095a = str;
    }

    /* renamed from: a */
    public ApplicationInfo mo8907a() {
        return this.f13185e.createPackageContext(this.f13095a, 0).getApplicationInfo();
    }

    /* renamed from: b */
    public String mo8910b() {
        try {
            return this.f13185e.getPackageManager().getApplicationInfo(this.f13095a, 0).sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dhc)) {
            return false;
        }
        return this.f13095a.equals(((dhc) obj).f13095a);
    }

    /* renamed from: f */
    public din mo8914f() {
        PackageInfo packageInfo = this.f13185e.getPackageManager().getPackageInfo(this.f13095a, 0);
        bxvd j = mo8962j();
        long j2 = packageInfo.lastUpdateTime;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        din.f13231a |= 4;
        din.f13234d = j2;
        String str = packageInfo.versionName == null ? "" : packageInfo.versionName;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din3 = (din) j.f164949b;
        str.getClass();
        din3.f13231a |= 32;
        din3.f13237g = str;
        int i = packageInfo.versionCode;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din4 = (din) j.f164949b;
        din4.f13231a |= 64;
        din4.f13238h = i;
        return (din) j.mo74062i();
    }

    public final int hashCode() {
        return this.f13095a.hashCode();
    }

    /* renamed from: j */
    public final bxvd mo8962j() {
        bxvd j = super.mo8962j();
        String str = this.f13095a;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        str.getClass();
        int i = din.f13231a | 2;
        din.f13231a = i;
        din.f13233c = str;
        String str2 = this.f13095a;
        str2.getClass();
        din.f13231a = i | 16;
        din.f13236f = str2;
        return j;
    }

    public String toString() {
        String str = this.f13095a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("InstalledApk(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public dhc(Context context, int i, String str) {
        this(context, 3, i, str);
    }

    /* renamed from: a */
    public ClassLoader mo8908a(ClassLoader classLoader) {
        String str;
        ApplicationInfo applicationInfo = this.f13185e.getPackageManager().getApplicationInfo(this.f13095a, 0);
        ArrayList arrayList = new ArrayList(3);
        if (applicationInfo.nativeLibraryDir != null) {
            arrayList.add(applicationInfo.nativeLibraryDir);
        }
        int i = Build.VERSION.SDK_INT;
        if ((applicationInfo.flags & 268435456) == 0) {
            List b = djr.m8671b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) b.get(i2);
                String str3 = applicationInfo.sourceDir;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 6 + String.valueOf(str2).length());
                sb.append(str3);
                sb.append("!/lib/");
                sb.append(str2);
                arrayList.add(sb.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f13188h)) {
            arrayList.add(this.f13188h);
        }
        if (arrayList.size() != 0) {
            str = TextUtils.join(File.pathSeparator, arrayList);
        } else {
            str = null;
        }
        String str4 = applicationInfo.sourceDir;
        if (!TextUtils.isEmpty(this.f13187g)) {
            String valueOf = String.valueOf(str4);
            String str5 = File.pathSeparator;
            String str6 = this.f13187g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
            sb2.append(valueOf);
            sb2.append(str5);
            sb2.append(str6);
            str4 = sb2.toString();
        }
        if (applicationInfo.sharedLibraryFiles != null && applicationInfo.sharedLibraryFiles.length > 0) {
            String valueOf2 = String.valueOf(str4);
            String str7 = File.pathSeparator;
            String join = TextUtils.join(File.pathSeparator, applicationInfo.sharedLibraryFiles);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(str7).length() + String.valueOf(join).length());
            sb3.append(valueOf2);
            sb3.append(str7);
            sb3.append(join);
            str4 = sb3.toString();
        }
        return diy.m8599a(str4, str, classLoader);
    }

    /* renamed from: a */
    public boolean mo8909a(djy djy) {
        PackageInfo packageInfo = this.f13185e.getPackageManager().getPackageInfo(this.f13095a, 0);
        return packageInfo.lastUpdateTime == djy.mo9153d() && packageInfo.versionCode == djy.mo9157h();
    }
}
