package p000;

import android.content.Intent;

/* renamed from: jxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxw {

    /* renamed from: a */
    public final int f23486a;

    /* renamed from: b */
    public final Intent f23487b;

    /* renamed from: c */
    public final int f23488c;

    /* renamed from: d */
    public final Intent f23489d;

    /* renamed from: e */
    public final int f23490e;

    /* renamed from: f */
    public final int f23491f;

    private jxw(int i, Intent intent, int i2, Intent intent2, int i3, int i4) {
        this.f23486a = i;
        this.f23487b = intent;
        this.f23488c = i2;
        this.f23489d = intent2;
        this.f23490e = i3;
        this.f23491f = i4;
    }

    /* renamed from: a */
    public static jxw m17484a(int i, Intent intent) {
        return new jxw(i, intent, 0, null, -1, -1);
    }

    /* renamed from: b */
    public static jxw m17486b(int i, Intent intent) {
        return new jxw(0, null, i, intent, -1, -1);
    }

    /* renamed from: a */
    public final boolean mo14213a() {
        return this.f23487b != null;
    }

    /* renamed from: a */
    public static jxw m17485a(int i, Intent intent, int i2, int i3) {
        return new jxw(i, intent, 0, null, i2, i3);
    }

    /* renamed from: b */
    public static jxw m17487b(int i, Intent intent, int i2, int i3) {
        return new jxw(0, null, i, intent, i2, i3);
    }
}
