package p000;

import android.content.ComponentName;

/* renamed from: ozq */
public final /* synthetic */ class ozq implements Runnable {

    /* renamed from: a */
    private final pam f38667a;

    /* renamed from: b */
    private final long f38668b;

    /* renamed from: c */
    private final ComponentName f38669c;

    /* renamed from: d */
    private final oha f38670d;

    public ozq(pam pam, long j, ComponentName componentName, oha oha) {
        this.f38667a = pam;
        this.f38668b = j;
        this.f38669c = componentName;
        this.f38670d = oha;
    }

    public final void run() {
        boolean z;
        pam pam = this.f38667a;
        long j = this.f38668b;
        ComponentName componentName = this.f38669c;
        oha oha = this.f38670d;
        if (pam.f38723g == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Cannot resume already live car connection");
        pam.f38723g = pam.mo22836a(j, componentName, oha, null);
        pam.f38723g.mo22824a();
    }
}
