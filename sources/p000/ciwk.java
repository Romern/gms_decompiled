package p000;

/* renamed from: ciwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwk {

    /* renamed from: a */
    public final byte[] f191599a;

    /* renamed from: b */
    private final civw f191600b;

    public ciwk(civw civw, byte[] bArr) {
        this.f191600b = civw;
        this.f191599a = bArr;
    }

    /* renamed from: a */
    public final cixf mo86606a(civs civs, civt civt) {
        civv civv = new civv(this.f191600b.mo86601a(civq.m151053a(civs, civt.f191541b), this.f191599a, "WhisperRatchet".getBytes(), 64));
        return new cixf(new ciwk(this.f191600b, civv.f191545a), new ciwh(this.f191600b, civv.f191546b, 0));
    }
}
