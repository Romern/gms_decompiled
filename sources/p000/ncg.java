package p000;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ncg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncg {

    /* renamed from: b */
    private static final lvn f35242b = new lvn("EncryptedBackupTask");

    /* renamed from: a */
    public final AtomicBoolean f35243a = new AtomicBoolean(false);

    /* renamed from: c */
    private final lwj f35244c;

    /* renamed from: d */
    private final SecureRandom f35245d;

    /* renamed from: e */
    private final ByteArrayOutputStream f35246e = new ByteArrayOutputStream();

    /* renamed from: f */
    private final nca f35247f;

    public ncg(lwj lwj, SecureRandom secureRandom, nca nca) {
        this.f35244c = lwj;
        this.f35245d = secureRandom;
        this.f35247f = nca;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnnt, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    private final mcp m25918a(SecretKey secretKey, byte[] bArr, naw naw, Set set) {
        bxtx bxtx;
        boolean z;
        boolean z2;
        SecretKey secretKey2 = secretKey;
        byte[] bArr2 = bArr;
        naw naw2 = naw;
        nbz a = this.f35247f.mo20447a(secretKey2, bArr2, set);
        bngx bngx = a.f35221a;
        bngx bngx2 = a.f35222b;
        bnha h = bnhe.m109414h();
        int size = bngx2.size();
        for (int i = 0; i < size; i++) {
            nbc nbc = (nbc) bngx2.get(i);
            h.mo67695b(nbc.mo20416b(), nbc);
        }
        bnhe b = h.mo67618b();
        bmxy.m108601b(!naw2.f35158f, "Cannot write chunks after flushing.");
        bnre i2 = bngx.m109369a((Comparator) bnnt.f131877a, (Iterable) bngx).listIterator();
        while (i2.hasNext()) {
            nbw nbw = (nbw) i2.next();
            if (!naw2.f35156d.containsKey(nbw)) {
                naw2.f35156d.put(nbw, Long.valueOf(naw2.f35154b.mo20420a()));
                bmxy.m108582a(nbw, "Hash cannot be null");
                if (naw2.f35155c.f35220a.containsKey(nbw)) {
                    nbx nbx = (nbx) naw2.f35155c.f35220a.get(nbw);
                    naw2.f35154b.mo20421a(nbx.f35219b, nbx.f35218a);
                    if (nbx.f35218a >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bmxy.m108589a(z2, "Chunk must have zero or positive length");
                    bxvd bxvd = naw2.f35159g;
                    bxvd da = mco.f33426d.mo74144da();
                    bxtx a2 = bxtx.m123261a(nbw.f35217a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mco mco = (mco) da.f164949b;
                    a2.getClass();
                    int i3 = mco.f33428a | 1;
                    mco.f33428a = i3;
                    mco.f33429b = a2;
                    int i4 = nbx.f35218a;
                    mco.f33428a = 2 | i3;
                    mco.f33430c = i4;
                    bxvd.mo74064i(da);
                } else if (b.containsKey(nbw)) {
                    nbc nbc2 = (nbc) b.get(nbw);
                    nax nax = naw2.f35154b;
                    nax.mo20422a(nbc2.mo20417c());
                    nax.mo20422a(nbc2.mo20415a());
                    int length = nbc2.mo20417c().length + nbc2.mo20415a().length;
                    bnhe bnhe = b;
                    bnre bnre = i2;
                    naw2.f35157e += (long) length;
                    if (length >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108589a(z, "Chunk must have zero or positive length");
                    bxvd bxvd2 = naw2.f35159g;
                    bxvd da2 = mco.f33426d.mo74144da();
                    bxtx a3 = bxtx.m123261a(nbw.f35217a);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    mco mco2 = (mco) da2.f164949b;
                    a3.getClass();
                    int i5 = mco2.f33428a | 1;
                    mco2.f33428a = i5;
                    mco2.f33429b = a3;
                    mco2.f33428a = 2 | i5;
                    mco2.f33430c = length;
                    bxvd2.mo74064i(da2);
                    b = bnhe;
                    i2 = bnre;
                } else {
                    String valueOf = String.valueOf(nbw);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Chunk did not exist in old chunks or new chunks: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (naw.f35153a.mo19637a(4)) {
            naw.f35153a.mo25412b("Total backup size: %d kb, new chunks size: %d kb", Long.valueOf(naw2.f35154b.mo20420a() / 1024), Long.valueOf(naw2.f35157e / 1024));
        }
        int size2 = bngx.size();
        for (int i6 = 0; i6 < size2; i6++) {
            bxvd bxvd3 = naw2.f35160h;
            int intValue = ((Long) naw2.f35156d.get((nbw) bngx.get(i6))).intValue();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            mcq mcq = (mcq) bxvd3.f164949b;
            mcq mcq2 = mcq.f33439d;
            if (!mcq.f33442b.mo73666a()) {
                mcq.f33442b = bxvk.m124019a(mcq.f33442b);
            }
            mcq.f33442b.mo74153d(intValue);
        }
        byte[] bArr3 = a.f35223c;
        bxvd bxvd4 = naw2.f35160h;
        bxtx a4 = bxtx.m123261a(bArr3);
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        mcq mcq3 = (mcq) bxvd4.f164949b;
        mcq mcq4 = mcq.f33439d;
        a4.getClass();
        mcq3.f33441a |= 1;
        mcq3.f33443c = a4;
        mcq mcq5 = (mcq) naw2.f35160h.mo74062i();
        bxvd da3 = mct.f33445f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        mct mct = (mct) da3.f164949b;
        mct.f33448b = 1;
        int i7 = mct.f33447a | 1;
        mct.f33447a = i7;
        mct.f33451e = 1;
        mct.f33447a = i7 | 8;
        bxtx a5 = bxtx.m123261a(m25920a(secretKey2, mcq5));
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        mct mct2 = (mct) da3.f164949b;
        a5.getClass();
        mct2.f33447a |= 4;
        mct2.f33450d = a5;
        mct mct3 = (mct) da3.mo74062i();
        bmxy.m108582a(mct3, "Metadata cannot be null");
        long a6 = naw2.f35154b.mo20420a();
        naw2.f35154b.mo20422a(mct3.mo73642k());
        naw2.f35154b.mo20422a(bqcr.m112599b(a6));
        naw2.f35154b.mo20423b();
        naw2.f35158f = true;
        bxvd bxvd5 = naw2.f35159g;
        if (bArr2 != null) {
            bxtx = bxtx.m123261a(bArr);
        } else {
            bxtx = bxtx.f164797b;
        }
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        mcp mcp = (mcp) bxvd5.f164949b;
        mcp mcp2 = mcp.f33431g;
        bxtx.getClass();
        mcp.f33433a |= 8;
        mcp.f33438f = bxtx;
        return (mcp) naw2.f35159g.mo74062i();
    }

    /* renamed from: a */
    private final void m25919a() {
        if (this.f35243a.get()) {
            throw new CancellationException("EncryptedBackupTask was cancelled");
        }
    }

    /* renamed from: a */
    private final byte[] m25920a(SecretKey secretKey, mcq mcq) {
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr = new byte[12];
            this.f35245d.nextBytes(bArr);
            try {
                instance.init(1, secretKey, new GCMParameterSpec(128, bArr));
                byte[] k = mcq.mo73642k();
                int length = k.length;
                byte[] copyOf = Arrays.copyOf(bArr, length + 28);
                try {
                    instance.doFinal(k, 0, length, copyOf, 12);
                    return copyOf;
                } catch (BadPaddingException | ShortBufferException e) {
                    throw new RuntimeException("Impossible exception", e);
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new lwh("GCMParameterSpec unsupported", e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new lwh("AES/GCM/NoPadding not supported", e3);
        }
    }

    /* renamed from: a */
    public final mcp mo20451a(bxvd bxvd, SecretKey secretKey, mde mde, mcp mcp) {
        byte[] k = mcp.f33438f.mo73780k();
        naw naw = new naw(new nbb(new blbr(this.f35246e, (int) cclp.f179364a.mo6606a().mo76298a())), mcp);
        bnia j = bnic.m109500j();
        bxwc bxwc = mcp.f33434b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            j.mo67629b(new nbw(((mco) bxwc.get(i)).f33429b.mo73780k()));
        }
        mcp a = m25918a(secretKey, k, naw, j.mo67751a());
        m25919a();
        String str = mcp.f33437e;
        lvn lvn = f35242b;
        String valueOf = String.valueOf(str);
        lvn.mo25409a(valueOf.length() == 0 ? new String("Old doc id: ") : "Old doc id: ".concat(valueOf), new Object[0]);
        String a2 = this.f35244c.mo19703a(bxvd, str, this.f35246e.toByteArray(), mde);
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mcp mcp2 = (mcp) bxvd2.f164949b;
        mcp mcp3 = mcp.f33431g;
        a2.getClass();
        mcp2.f33433a |= 4;
        mcp2.f33437e = a2;
        return (mcp) bxvd2.mo74062i();
    }

    /* renamed from: a */
    public final mcp mo20452a(bxvd bxvd, SecretKey secretKey, mde mde, byte[] bArr) {
        mcp a = m25918a(secretKey, bArr, new naw(new nbe(this.f35246e), mcp.f33431g), bnon.f131923a);
        m25919a();
        String a2 = this.f35244c.mo19704a(bxvd, this.f35246e.toByteArray(), mde);
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mcp mcp = (mcp) bxvd2.f164949b;
        a2.getClass();
        mcp.f33433a |= 4;
        mcp.f33437e = a2;
        return (mcp) bxvd2.mo74062i();
    }
}
