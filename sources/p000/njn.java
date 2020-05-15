package p000;

import android.content.Context;

/* renamed from: njn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class njn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f35838a;

    public njn(Context context) {
        this.f35838a = context;
    }

    public final void run() {
        ssj.m36231b(this.f35838a, "sslwrapper_jni");
        njp.f35841k.countDown();
    }
}
