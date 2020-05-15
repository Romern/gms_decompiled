package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Objects;

/* renamed from: dig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dig extends dgm {

    /* renamed from: a */
    private final String f13218a;

    /* renamed from: b */
    private final String f13219b;

    public dig(Context context, int i, String str, String str2, dhs dhs) {
        super(context, 5, i, dhs, str2);
        this.f13218a = context.getPackageName();
        this.f13219b = str;
    }

    /* renamed from: a */
    public final ClassLoader mo8908a(ClassLoader classLoader) {
        int i = Build.VERSION.SDK_INT;
        try {
            ClassLoader classLoader2 = this.f13185e.createContextForSplit(this.f13219b).getClassLoader();
            bmzs.m108700a(!classLoader2.equals(this.f13185e.getClassLoader()), "isolatedSplits not working as expected!", new Object[0]);
            String valueOf = String.valueOf(classLoader2);
            String valueOf2 = String.valueOf(classLoader2.getParent());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("Classloader=");
            sb.append(valueOf);
            sb.append(", parent=");
            sb.append(valueOf2);
            sb.toString();
            return classLoader2;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf3 = String.valueOf(mo9092h());
            throw new djq(valueOf3.length() == 0 ? new String("Failed loading split APK ") : "Failed loading split APK ".concat(valueOf3), e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dig) {
            dig dig = (dig) obj;
            if (!Objects.equals(this.f13218a, dig.f13218a) || !Objects.equals(this.f13219b, dig.f13219b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final din mo8914f() {
        PackageInfo packageInfo = this.f13185e.getPackageManager().getPackageInfo(this.f13218a, 0);
        if (packageInfo == null) {
            String valueOf = String.valueOf(mo9092h());
            throw new PackageManager.NameNotFoundException(valueOf.length() == 0 ? new String("Failed reading stored package info from ") : "Failed reading stored package info from ".concat(valueOf));
        }
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
        String b = bmxx.m108578b(packageInfo.versionName);
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din3 = (din) j.f164949b;
        b.getClass();
        din3.f13231a |= 32;
        din3.f13237g = b;
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

    /* renamed from: h */
    public final String mo9092h() {
        String str = this.f13218a;
        String str2 = this.f13219b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("split:/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(this.f13218a, this.f13219b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final bxvd mo8962j() {
        bxvd j = super.mo8962j();
        String str = this.f13218a;
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din = (din) j.f164949b;
        din din2 = din.f13229r;
        str.getClass();
        din.f13231a |= 16;
        din.f13236f = str;
        String h = mo9092h();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        din din3 = (din) j.f164949b;
        h.getClass();
        din3.f13231a |= 2048;
        din3.f13244n = h;
        return j;
    }

    /* renamed from: o */
    public final boolean mo8963o() {
        return false;
    }

    /* renamed from: p */
    public final boolean mo8964p() {
        return false;
    }

    public final String toString() {
        String str = this.f13218a;
        String str2 = this.f13219b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append("SplitApk(");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo8909a(djy djy) {
        return mo8967l() == djy.mo9153d() && this.f13185e.getPackageManager().getPackageInfo(this.f13218a, 0).versionCode == djy.mo9157h();
    }
}
