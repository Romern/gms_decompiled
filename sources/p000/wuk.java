package p000;

import android.app.PendingIntent;
import android.support.p001v4.graphics.drawable.IconCompat;

/* renamed from: wuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wuk extends wuo {

    /* renamed from: a */
    private final String f51374a;

    /* renamed from: b */
    private final String f51375b;

    /* renamed from: c */
    private final IconCompat f51376c;

    /* renamed from: d */
    private final PendingIntent f51377d;

    public wuk(String str, String str2, IconCompat iconCompat, PendingIntent pendingIntent) {
        this.f51374a = str;
        this.f51375b = str2;
        this.f51376c = iconCompat;
        this.f51377d = pendingIntent;
    }

    /* renamed from: a */
    public final String mo29421a() {
        return this.f51374a;
    }

    /* renamed from: b */
    public final String mo29422b() {
        return this.f51375b;
    }

    /* renamed from: c */
    public final IconCompat mo29423c() {
        return this.f51376c;
    }

    /* renamed from: d */
    public final PendingIntent mo29424d() {
        return this.f51377d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wuo) {
            wuo wuo = (wuo) obj;
            return this.f51374a.equals(wuo.mo29421a()) && this.f51375b.equals(wuo.mo29422b()) && this.f51376c.equals(wuo.mo29423c()) && this.f51377d.equals(wuo.mo29424d());
        }
    }

    public final int hashCode() {
        return ((((((this.f51374a.hashCode() ^ 1000003) * 1000003) ^ this.f51375b.hashCode()) * 1000003) ^ this.f51376c.hashCode()) * 1000003) ^ this.f51377d.hashCode();
    }

    public final String toString() {
        String str = this.f51374a;
        String str2 = this.f51375b;
        String valueOf = String.valueOf(this.f51376c);
        String valueOf2 = String.valueOf(this.f51377d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("DecodedListSlice{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", pendingIntent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
