package p000;

/* renamed from: aavb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aavb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aavc f56636a;

    public aavb(aavc aavc) {
        this.f56636a = aavc;
    }

    public final void run() {
        if (this.f56636a.mo31819a()) {
            aavc aavc = this.f56636a;
            aavc.f56638b.executeOnExecutor(aavc.f56639c, new Void[0]);
            this.f56636a.f56638b = null;
        }
    }
}
