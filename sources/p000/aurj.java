package p000;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: aurj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurj implements auoz {

    /* renamed from: d */
    private static WeakReference f92323d = new WeakReference(null);

    /* renamed from: a */
    public final Object f92324a = new Object();

    /* renamed from: b */
    public boolean f92325b;

    /* renamed from: c */
    public bohi f92326c = bohi.f133070z;

    /* renamed from: e */
    private final Context f92327e;

    /* renamed from: f */
    private boolean f92328f;

    /* renamed from: g */
    private boolean f92329g;

    private aurj(Context context) {
        this.f92327e = context;
    }

    /* renamed from: a */
    public static synchronized aurj m77699a() {
        aurj aurj;
        synchronized (aurj.class) {
            aurj = (aurj) f92323d.get();
            if (aurj == null) {
                aurj = new aurj(rpr.m34216b());
                f92323d = new WeakReference(aurj);
            }
        }
        return aurj;
    }

    /* renamed from: a */
    public final void mo50610a(boolean z) {
    }

    /* renamed from: b */
    public final void mo50612b(boolean z) {
        synchronized (this.f92324a) {
            boolean z2 = this.f92329g;
            if (z2 != z) {
                Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z)};
                this.f92329g = z;
                mo50824a("is_configured", z);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo50826c() {
        boolean z;
        synchronized (this.f92324a) {
            z = this.f92329g;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo50827d() {
        boolean z;
        synchronized (this.f92324a) {
            z = this.f92325b;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50609a(bohi bohi) {
        synchronized (this.f92324a) {
            this.f92326c = bohi;
        }
    }

    /* renamed from: a */
    public final void mo50824a(String str, boolean z) {
        this.f92327e.sendBroadcast(new Intent().setAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED").putExtra(str, z), "com.google.android.gms.trustagent.permission.TRUSTAGENT_STATE");
    }

    /* renamed from: b */
    public final boolean mo50825b() {
        boolean z;
        synchronized (this.f92324a) {
            z = this.f92328f;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50611a(boolean z, boolean z2, boolean z3, String str) {
        synchronized (this.f92324a) {
            boolean z4 = this.f92328f;
            if (z != z4) {
                Object[] objArr = {Boolean.valueOf(z4), Boolean.valueOf(z)};
                this.f92328f = z;
                mo50824a("is_trusted", z);
            }
        }
    }
}
