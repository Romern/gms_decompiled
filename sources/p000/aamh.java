package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;

/* renamed from: aamh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamh implements Comparable {

    /* renamed from: a */
    public final String f28457a;

    /* renamed from: b */
    public final int f28458b;

    private aamh(String str, int i) {
        this.f28457a = str;
        this.f28458b = i;
    }

    /* renamed from: a */
    public static aamh m21512a(blmp blmp) {
        return m21513a(blmp.f126870e, (int) blmp.f126876k);
    }

    /* renamed from: b */
    public final PackageInfo mo17017b(aamf aamf, int i) {
        return m21514a(aamf).getPackageInfo(this.f28457a, i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((aamh) obj).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aamh) {
            aamh aamh = (aamh) obj;
            if (this.f28458b != aamh.f28458b || !sdg.m34949a(this.f28457a, aamh.f28457a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28457a, Integer.valueOf(this.f28458b)});
    }

    public final String toString() {
        String str = this.f28457a;
        int i = this.f28458b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static aamh m21513a(String str, int i) {
        return new aamh(str, i);
    }

    /* renamed from: a */
    private final PackageManager m21514a(aamf aamf) {
        PackageManager c = aamf.mo17013c(this.f28458b);
        if (c != null) {
            return c;
        }
        throw new PackageManager.NameNotFoundException("Unable to get PackageManager for user");
    }

    /* renamed from: a */
    public final aeco mo17015a() {
        aecn aecn = new aecn();
        aecn.mo34039a(this.f28458b);
        aecn.mo34041b(this.f28457a);
        return aecn.mo34038a();
    }

    /* renamed from: a */
    public final ApplicationInfo mo17016a(aamf aamf, int i) {
        return m21514a(aamf).getApplicationInfo(this.f28457a, i);
    }
}
