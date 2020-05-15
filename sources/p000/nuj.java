package p000;

/* renamed from: nuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nuj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f36513a;

    /* renamed from: b */
    final /* synthetic */ nuk f36514b;

    public nuj(nuk nuk, String str) {
        this.f36514b = nuk;
        this.f36513a = str;
    }

    public final void run() {
        nij nij = (nij) this.f36514b.mo21726f();
        if (nij != null) {
            nij.mo20775b(this.f36513a);
        }
    }
}
