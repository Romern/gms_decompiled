package p000;

/* renamed from: ahrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrr extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahsa f67894a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahrr(ahsa ahsa, String str) {
        super(str);
        this.f67894a = ahsa;
    }

    public final void run() {
        synchronized (this.f67894a.f67915e) {
            while (true) {
                ahrz ahrz = (ahrz) this.f67894a.f67916f.poll();
                if (ahrz == null) {
                    srn srn = ahsd.f67925a;
                } else {
                    int ordinal = ahrz.ordinal();
                    if (ordinal == 0) {
                        this.f67894a.mo37006a();
                    } else if (ordinal == 1) {
                        this.f67894a.mo37007b();
                    }
                }
            }
        }
    }
}
