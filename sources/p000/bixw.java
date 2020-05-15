package p000;

import android.os.Bundle;

/* renamed from: bixw */
final /* synthetic */ class bixw implements Runnable {

    /* renamed from: a */
    private final bixy f122235a;

    /* renamed from: b */
    private final int f122236b;

    /* renamed from: c */
    private final Bundle f122237c;

    public bixw(bixy bixy, int i, Bundle bundle) {
        this.f122235a = bixy;
        this.f122236b = i;
        this.f122237c = bundle;
    }

    public final void run() {
        this.f122235a.mo64854b(this.f122236b, this.f122237c);
    }
}
