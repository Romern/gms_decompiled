package p000;

import android.content.Context;

/* renamed from: onc */
final /* synthetic */ class onc implements Runnable {

    /* renamed from: a */
    private final onl f37995a;

    public onc(onl onl) {
        this.f37995a = onl;
    }

    public final void run() {
        onl onl = this.f37995a;
        if (!onl.f38009b.containsKey(onl.f38015h)) {
            onl.m29233a("timeout handler ran for unexpected stage: %s", onl.f38015h);
            return;
        }
        onk onk = (onk) onl.f38009b.get(onl.f38015h);
        Context context = onl.f38013f;
        onj onj = onl.f38015h;
        bnsi d = onl.f38008a.mo68390d();
        d.mo68432a("onl", "a", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68426a("timed out at stage %s after %d milliseconds, publishing %s (USB reset enabled: %b)", onj, Long.valueOf(onk.mo22354e()), onk.mo22316a(), Boolean.valueOf(onk.mo22355f()));
        ofd.m28611a(context, "com.google.android.gms.car.USB_ISSUE_FOUND", onk.mo22316a());
        if (!onk.mo22355f() || !((Boolean) onl.f38014g.mo6606a()).booleanValue()) {
            onl.f38016i = true;
        } else {
            onl.mo22356a(onj.START);
        }
    }
}
