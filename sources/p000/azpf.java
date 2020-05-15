package p000;

import android.content.Context;

/* renamed from: azpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azpf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azph f99812a;

    public azpf(azph azph) {
        this.f99812a = azph;
    }

    public final void run() {
        Context context = this.f99812a.f99818d;
        this.f99812a.mo55161a("Matchstick.Storage.DatabaseSize", context.getDatabasePath(azcl.m85289a(context).getDatabaseName()).length());
    }
}
