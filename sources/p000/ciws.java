package p000;

/* renamed from: ciws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciws {

    /* renamed from: a */
    public final cixc f191609a;

    public ciws(int i, long j, civt civt, byte[] bArr) {
        bxvd da = cixc.f191660g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixc cixc = (cixc) da.f164949b;
        cixc.f191662a |= 1;
        cixc.f191663b = i;
        ByteString a = ByteString.m123261a(civt.f191540a.mo86595a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixc cixc2 = (cixc) da.f164949b;
        a.getClass();
        cixc2.f191662a |= 2;
        cixc2.f191664c = a;
        ByteString a2 = ByteString.m123261a(civt.f191541b.f191538a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixc cixc3 = (cixc) da.f164949b;
        a2.getClass();
        cixc3.f191662a |= 4;
        cixc3.f191665d = a2;
        ByteString a3 = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixc cixc4 = (cixc) da.f164949b;
        a3.getClass();
        int i2 = cixc4.f191662a | 8;
        cixc4.f191662a = i2;
        cixc4.f191666e = a3;
        cixc4.f191662a = i2 | 16;
        cixc4.f191667f = j;
        this.f191609a = (cixc) da.mo74062i();
    }

    /* renamed from: a */
    public final civt mo86618a() {
        try {
            return new civt(civq.m151054b(this.f191609a.f191664c.getKey()), civq.m151050a(this.f191609a.f191665d.getKey()));
        } catch (civg e) {
            throw new AssertionError(e);
        }
    }

    public ciws(byte[] bArr) {
        this.f191609a = (cixc) GeneratedMessageLite.m124014a(cixc.f191660g, bArr);
    }
}
