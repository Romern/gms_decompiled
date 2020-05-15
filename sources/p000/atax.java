package p000;

import android.content.Intent;

/* renamed from: atax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atax {

    /* renamed from: a */
    public final Intent f89980a;

    /* renamed from: b */
    final int f89981b;

    /* renamed from: c */
    final int f89982c;

    private atax(Intent intent, int i, int i2) {
        this.f89980a = intent;
        this.f89981b = i;
        this.f89982c = i2;
    }

    /* renamed from: a */
    static atax m75350a(int i) {
        return new atax(null, 1, i);
    }

    /* renamed from: a */
    public static atax m75351a(Intent intent, int i) {
        return new atax(intent, i, 1);
    }
}
