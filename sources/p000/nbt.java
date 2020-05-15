package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: nbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbt implements ncf {

    /* renamed from: a */
    public final bnia f35212a = bnic.m109500j();

    /* renamed from: b */
    public boolean f35213b;

    /* renamed from: c */
    private final naz f35214c;

    /* renamed from: d */
    private final bnia f35215d = bnic.m109500j();

    public nbt(naz naz) {
        this.f35214c = naz;
    }

    /* renamed from: c */
    private static MessageDigest m25901c() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new lwh("Digest unavailable: SHA-256", e);
        }
    }

    /* renamed from: a */
    public final void mo20426a(byte[] bArr, int i) {
        bmxy.m108601b(!this.f35213b, "Cannot process chunk after close()");
        bnia bnia = this.f35212a;
        bxvd da = mcy.f33461d.mo74144da();
        da.mo73631a(bArr, 0, i);
        bnia.mo67629b((mcy) da.mo74062i());
        this.f35215d.mo67629b(this.f35214c.mo20425a(Arrays.copyOf(bArr, i)));
    }

    /* renamed from: b */
    public final void mo20428b() {
    }

    public final void close() {
        this.f35213b = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnnt, bnic]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final byte[] mo20427a() {
        bmxy.m108601b(this.f35213b, "Must close() before getDigest()");
        MessageDigest c = m25901c();
        bnre i = bngx.m109369a((Comparator) bnnt.f131877a, (Iterable) this.f35215d.mo67751a()).listIterator();
        while (i.hasNext()) {
            c.update(((nbw) i.next()).f35217a);
        }
        return c.digest();
    }
}
