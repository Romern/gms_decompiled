package p000;

import java.nio.ByteBuffer;

/* renamed from: oij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class oij extends ojh {

    /* renamed from: b */
    private static final bnsn f37696b = odk.m28481a("CAR.GAL.MIC");

    /* renamed from: a */
    protected int f37697a = 0;

    public oij(int i, ofs ofs, ojm ojm, int i2) {
        super(i, ofs, ojm, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        int b = birw.m102772b(i);
        if (b == 32775) {
            bish bish = (bish) GeneratedMessageLite.m124013a(bish.f121557d, byteBuffer, bxus.m123744c());
            if (bish != null) {
                mo22180a(bish);
            }
        } else if (b != 1) {
            bnsi c = f37696b.mo68388c();
            c.mo68432a("oij", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Received message with invalid type header: %d", i);
        } else {
            byteBuffer.getLong();
            mo22181b(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22180a(bish bish);

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22181b(ByteBuffer byteBuffer);
}
