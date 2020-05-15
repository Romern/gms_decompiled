package p000;

/* renamed from: ciwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwm {

    /* renamed from: a */
    public final ciwu f191601a;

    public ciwm(int i, civt civt) {
        bxvd da = ciwu.f191610e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwu ciwu = (ciwu) da.f164949b;
        ciwu.f191612a |= 1;
        ciwu.f191613b = i;
        bxtx a = bxtx.m123261a(civt.f191540a.mo86595a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwu ciwu2 = (ciwu) da.f164949b;
        a.getClass();
        ciwu2.f191612a |= 2;
        ciwu2.f191614c = a;
        bxtx a2 = bxtx.m123261a(civt.f191541b.f191538a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwu ciwu3 = (ciwu) da.f164949b;
        a2.getClass();
        ciwu3.f191612a |= 4;
        ciwu3.f191615d = a2;
        this.f191601a = (ciwu) da.mo74062i();
    }

    /* renamed from: a */
    public final civt mo86607a() {
        try {
            return new civt(civq.m151054b(this.f191601a.f191614c.mo73780k()), civq.m151050a(this.f191601a.f191615d.mo73780k()));
        } catch (civg e) {
            throw new AssertionError(e);
        }
    }

    public ciwm(byte[] bArr) {
        this.f191601a = (ciwu) bxvk.m124014a(ciwu.f191610e, bArr);
    }
}
