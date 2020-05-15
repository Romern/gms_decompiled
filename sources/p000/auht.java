package p000;

import android.content.Context;

/* renamed from: auht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auht {

    /* renamed from: a */
    final /* synthetic */ auhu f91838a;

    /* renamed from: b */
    private final Context f91839b;

    /* renamed from: c */
    private int f91840c = 0;

    public auht(auhu auhu, Context context) {
        this.f91838a = auhu;
        this.f91839b = context;
    }

    /* renamed from: a */
    public final synchronized void mo50538a() {
        int i = this.f91840c;
        this.f91840c = i + 1;
        if (i == 0) {
            this.f91838a.mo50541a(this.f91839b.getApplicationContext());
        }
    }

    /* renamed from: b */
    public final synchronized void mo50539b() {
        boolean z;
        if (this.f91840c > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        int i = this.f91840c - 1;
        this.f91840c = i;
        if (i == 0) {
            this.f91838a.mo50543b(this.f91839b.getApplicationContext());
        }
    }

    public final synchronized void finalize() {
        try {
            if (this.f91840c > 0) {
                while (this.f91840c > 0) {
                    mo50539b();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
