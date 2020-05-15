package p000;

/* renamed from: ahtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtm extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahtn f68007a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahtm(ahtn ahtn, String str) {
        super(str);
        this.f68007a = ahtn;
    }

    public final void run() {
        try {
            ahtn ahtn = this.f68007a;
            if (ahtn.f68008a) {
                ahtn.f68173c.unregisterReceiver(ahtn.f68009b);
                this.f68007a.f68008a = false;
            }
        } catch (IllegalArgumentException e) {
            srn srn = ahsd.f67925a;
        }
    }
}
