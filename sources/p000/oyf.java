package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Objects;

/* renamed from: oyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oyf {

    /* renamed from: a */
    public final String f38609a;

    /* renamed from: b */
    public final String f38610b;

    /* renamed from: c */
    public final int f38611c;

    static {
        odk.m28481a("CAR.SETUP");
    }

    public oyf(String str) {
        String[] split = str.split(":", 3);
        int i = 0;
        this.f38609a = split[0];
        if (split.length >= 2) {
            try {
                i = Integer.decode(split[1]).intValue();
            } catch (NumberFormatException e) {
            }
            this.f38611c = i;
        } else {
            this.f38611c = 0;
        }
        this.f38610b = split.length == 3 ? split[2] : null;
    }

    /* renamed from: a */
    protected static final PackageInfo m29988a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            int i = packageInfo.versionCode;
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: b */
    public int mo22781b(Context context) {
        PackageInfo a = m29988a(context, this.f38609a);
        if (a != null) {
            return !mo22780a(a) ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: c */
    public final boolean mo22782c(Context context) {
        try {
            if (context.getPackageManager().getApplicationEnabledSetting(this.f38609a) == 3) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oyf) {
            oyf oyf = (oyf) obj;
            return this.f38611c == oyf.f38611c && Objects.equals(this.f38609a, oyf.f38609a) && Objects.equals(this.f38610b, oyf.f38610b);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f38609a, this.f38610b, Integer.valueOf(this.f38611c));
    }

    public String toString() {
        String str = this.f38609a;
        int i = this.f38611c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("pkg=");
        sb.append(str);
        sb.append(", minVersion=");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo22779a(Context context) {
        return mo22781b(context) == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo22780a(PackageInfo packageInfo) {
        return ((long) this.f38611c) == -1 || packageInfo.versionCode >= this.f38611c;
    }

    public oyf(String str, String str2, int i) {
        this.f38609a = str;
        this.f38610b = str2;
        this.f38611c = i;
    }
}
