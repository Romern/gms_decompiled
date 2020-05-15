package p000;

import java.nio.ByteBuffer;

/* renamed from: oii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oii extends ojh {

    /* renamed from: a */
    public static final int f37691a = 32769;

    /* renamed from: b */
    public static final int f37692b = 32771;

    /* renamed from: c */
    private static final bnsn f37693c = odk.m28481a("CAR.GAL.INST");

    /* renamed from: e */
    private static final int f37694e = 32770;

    /* renamed from: d */
    private final oih f37695d;

    public oii(oih oih, ojm ojm) {
        super(11, oih, ojm);
        this.f37695d = oih;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (this.f37695d != null) {
            int i2 = f37694e;
            if (i2 == 0) {
                throw null;
            } else if (i == i2) {
                bxvd da = birj.f121419c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                birj birj = (birj) da.f164949b;
                birj.f121422b = 0;
                int i3 = 1;
                birj.f121421a |= 1;
                da.mo73631a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining());
                oih oih = this.f37695d;
                int a = biri.m102755a(((birj) da.mo74062i()).f121422b);
                if (a != 0) {
                    i3 = a;
                }
                oih.mo22022a(i3);
            } else {
                bnsi b = f37693c.mo68387b();
                b.mo68432a("oii", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68409a("Invalid message type: %d", i);
            }
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }
}
