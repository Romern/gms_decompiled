package p000;

/* renamed from: alcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alcb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ alcd f73386a;

    public alcb(alcd alcd) {
        this.f73386a = alcd;
    }

    public final void run() {
        this.f73386a.f73388a.reset();
        this.f73386a.f73388a.setStartTime(0);
        alcd alcd = this.f73386a;
        alcd.startAnimation(alcd.f73388a);
    }
}
