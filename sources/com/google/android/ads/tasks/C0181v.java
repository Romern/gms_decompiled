package com.google.android.ads.tasks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.ads.tasks.v */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0181v implements Callable {

    /* renamed from: a */
    protected final dca f7592a;

    /* renamed from: b */
    protected final String f7593b;

    /* renamed from: c */
    protected final String f7594c;

    /* renamed from: d */
    protected Method f7595d;

    /* renamed from: e */
    protected final int f7596e;

    /* renamed from: f */
    protected final int f7597f;

    /* renamed from: g */
    protected final bxvd f7598g;

    public C0181v(dca dca, String str, String str2, bxvd bxvd, int i, int i2) {
        getClass().getSimpleName();
        this.f7592a = dca;
        this.f7593b = str;
        this.f7594c = str2;
        this.f7598g = bxvd;
        this.f7596e = i;
        this.f7597f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5035a();

    /* renamed from: b */
    public Void call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method a = this.f7592a.mo8504a(this.f7593b, this.f7594c);
            this.f7595d = a;
            if (a == null) {
                return null;
            }
            mo5035a();
            dax dax = this.f7592a.f12776l;
            if (!(dax == null || (i = this.f7596e) == Integer.MIN_VALUE)) {
                dax.mo8479a(this.f7597f, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }
}
