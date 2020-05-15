package p000;

/* renamed from: awlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awlu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awma f94598a;

    public awlu(awma awma) {
        this.f94598a = awma;
    }

    public final void run() {
        awma awma = this.f94598a;
        awma.mo52808n(false);
        awma.f94604c = false;
        bxvd da = bwjk.f159796e.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjk bwjk = (bwjk) da.f164949b;
        a.getClass();
        bwjk.f159799b = a;
        bwjk.f159798a |= 1;
        ByteString a2 = ByteString.m123261a(awma.f94605d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjk bwjk2 = (bwjk) da.f164949b;
        a2.getClass();
        bwjk2.f159798a |= 2;
        bwjk2.f159800c = a2;
        bwhf a3 = awfx.m79880a(awma.f123962aG, awma.f123961aF);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjk bwjk3 = (bwjk) da.f164949b;
        a3.getClass();
        bwjk3.f159801d = a3;
        bwjk3.f159798a |= 4;
        bwjk bwjk4 = (bwjk) da.mo74062i();
        awma.mo52864a(bwjk4, 2);
        awma.mo52900j(2);
        awma.mo52839Y().f94357a.mo52414a(bwjk4);
    }
}
