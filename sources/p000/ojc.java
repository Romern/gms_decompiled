package p000;

import java.nio.ByteBuffer;

/* renamed from: ojc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ojc extends ojh {

    /* renamed from: a */
    private static final bnsn f37737a = odk.m28481a("CAR.GAL.INST");

    /* renamed from: b */
    private final ojb f37738b;

    public ojc(ojb ojb, ojm ojm) {
        super(13, ojb, ojm);
        this.f37738b = ojb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (this.f37738b == null) {
            return;
        }
        if (i == 32770) {
            bitn bitn = (bitn) bxvk.m124013a(bitn.f121680d, byteBuffer, bxus.m123744c());
            ojb ojb = this.f37738b;
            String str = bitn.f121683b;
            String str2 = bitn.f121684c;
            birj birj = bitn.f121682a;
            if (birj == null) {
                birj = birj.f121419c;
            }
            int a = biri.m102755a(birj.f121422b);
            if (a == 0) {
                a = 1;
            }
            ojb.mo21106a(str, str2, a - 1);
            return;
        }
        bnsi b = f37737a.mo68387b();
        b.mo68432a("ojc", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68409a("Invalid message type: %d", i);
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }
}
