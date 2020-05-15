package p000;

/* renamed from: sl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1354sl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27029a;

    public C1354sl(C1372tc tcVar) {
        this.f27029a = tcVar;
    }

    public final void run() {
        C1372tc tcVar = this.f27029a;
        if ((tcVar.f27073A & 1) != 0) {
            tcVar.mo15994e(0);
        }
        C1372tc tcVar2 = this.f27029a;
        if ((tcVar2.f27073A & 4096) != 0) {
            tcVar2.mo15994e(108);
        }
        C1372tc tcVar3 = this.f27029a;
        tcVar3.f27121z = false;
        tcVar3.f27073A = 0;
    }
}
