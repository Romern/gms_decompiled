package p000;

import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.Route;

/* renamed from: adke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adke {

    /* renamed from: a */
    public final int f61993a;

    /* renamed from: b */
    public final AppInfo f61994b;

    /* renamed from: c */
    public final Route f61995c;

    /* renamed from: d */
    public final int f61996d;

    /* renamed from: e */
    final boolean f61997e;

    /* renamed from: f */
    public final String f61998f;

    /* renamed from: g */
    public final int f61999g;

    /* renamed from: h */
    public final int f62000h;

    /* renamed from: i */
    public final String f62001i;

    /* renamed from: j */
    public final byte[] f62002j;

    public adke(int i, String str, int i2, int i3, String str2, byte[] bArr, AppInfo appInfo, Route route, int i4, boolean z) {
        this.f61993a = i;
        this.f61998f = str;
        this.f61999g = i2;
        this.f62000h = i3;
        this.f62001i = str2;
        this.f62002j = bArr;
        this.f61994b = appInfo;
        this.f61995c = route;
        this.f61996d = i4;
        this.f61997e = z;
    }

    /* renamed from: a */
    public static adke m50687a(String str, int i, int i2, String str2, byte[] bArr, AppInfo appInfo, Route route, boolean z) {
        return new adke(2, str, i, i2, str2, bArr, appInfo, route, !z ? 0 : 3, false);
    }
}
