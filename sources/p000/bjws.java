package p000;

import android.text.TextUtils;

/* renamed from: bjws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjws {

    /* renamed from: a */
    public final String f123530a;

    /* renamed from: b */
    public final int f123531b;

    /* renamed from: c */
    public final int f123532c;

    /* renamed from: d */
    public final String f123533d;

    public bjws(String str, int i, int i2, String str2) {
        this.f123530a = TextUtils.isEmpty(str) ? "" : str;
        this.f123531b = i;
        this.f123532c = i2;
        this.f123533d = TextUtils.isEmpty(str2) ? "" : str2;
    }

    /* renamed from: a */
    public final boolean mo65594a() {
        return !TextUtils.isEmpty(this.f123530a);
    }

    /* renamed from: b */
    public final boolean mo65595b() {
        return (this.f123531b == 0 || this.f123532c == 0) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo65596c() {
        return !TextUtils.isEmpty(this.f123533d);
    }
}
