package p000;

import android.graphics.Bitmap;

/* renamed from: aczd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczd {

    /* renamed from: a */
    public final int f61127a;

    /* renamed from: b */
    public final String f61128b;

    /* renamed from: c */
    public final String f61129c;

    /* renamed from: d */
    public String f61130d;

    /* renamed from: e */
    public Bitmap f61131e;

    public aczd(String str, String str2, int i, String str3) {
        this.f61130d = str;
        this.f61129c = str2;
        this.f61127a = i;
        this.f61128b = str3;
    }

    /* renamed from: a */
    public static aczd m50036a() {
        return new aczd(null, null, 2, null);
    }

    /* renamed from: a */
    public static aczd m50037a(String str) {
        return new aczd(null, str, 1, null);
    }

    /* renamed from: a */
    public static aczd m50038a(String str, String str2) {
        return new aczd(null, str, 0, str2);
    }
}
