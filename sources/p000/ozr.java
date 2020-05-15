package p000;

import android.content.ComponentName;

/* renamed from: ozr */
public final /* synthetic */ class ozr implements Runnable {

    /* renamed from: a */
    private final pam f38671a;

    /* renamed from: b */
    private final long f38672b;

    /* renamed from: c */
    private final ComponentName f38673c;

    /* renamed from: d */
    private final oha f38674d;

    /* renamed from: e */
    private final oml f38675e;

    public ozr(pam pam, long j, ComponentName componentName, oha oha, oml oml) {
        this.f38671a = pam;
        this.f38672b = j;
        this.f38673c = componentName;
        this.f38674d = oha;
        this.f38675e = oml;
    }

    public final void run() {
        boolean z;
        pam pam = this.f38671a;
        long j = this.f38672b;
        ComponentName componentName = this.f38673c;
        oha oha = this.f38674d;
        oml oml = this.f38675e;
        if (pam.f38723g == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Cannot resume already live car connection");
        pam.f38723g = pam.mo22836a(j, componentName, oha, oml);
        pam.f38723g.mo22824a();
    }
}
