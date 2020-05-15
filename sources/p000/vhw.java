package p000;

/* renamed from: vhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vhw implements bkpj {
    /* renamed from: a */
    public final void mo28476a(bkpk bkpk, Runnable runnable) {
        if (bkpk == bkpk.SUCCESS) {
            runnable.run();
            return;
        }
        vhz.f49307a.mo25369a("Not retrying request with status: %s", bkpk);
    }
}
