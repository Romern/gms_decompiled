package p000;

import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: bysv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysv {

    /* renamed from: a */
    public byte[] f167622a = null;

    /* renamed from: b */
    private bxtx f167623b = null;

    /* renamed from: c */
    private bxtx f167624c = null;

    /* renamed from: d */
    private bxtx f167625d = null;

    /* renamed from: e */
    private final SecureRandom f167626e = new SecureRandom();

    /* renamed from: a */
    private final bytc m125300a(byss byss, bysr bysr, byte[] bArr) {
        bxvd da = bytc.f167647i.mo74144da();
        int i = byss.f167611f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bytc bytc = (bytc) da.f164949b;
        if (i != 0) {
            bytc.f167650b = i;
            int i2 = bytc.f167649a | 1;
            bytc.f167649a = i2;
            int i3 = bysr.f167604d;
            if (i3 != 0) {
                bytc.f167651c = i3;
                int i4 = i2 | 2;
                bytc.f167649a = i4;
                bxtx bxtx = this.f167624c;
                if (bxtx != null) {
                    bxtx.getClass();
                    i4 |= 4;
                    bytc.f167649a = i4;
                    bytc.f167652d = bxtx;
                }
                bxtx bxtx2 = this.f167625d;
                if (bxtx2 != null) {
                    bxtx2.getClass();
                    i4 |= 8;
                    bytc.f167649a = i4;
                    bytc.f167653e = bxtx2;
                }
                bxtx bxtx3 = this.f167623b;
                if (bxtx3 != null) {
                    bxtx3.getClass();
                    i4 |= 32;
                    bytc.f167649a = i4;
                    bytc.f167655g = bxtx3;
                }
                byte[] bArr2 = this.f167622a;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    bytc.f167649a = i4 | 64;
                    bytc.f167656h = length;
                }
                if (bArr != null) {
                    bxtx a = bxtx.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bytc bytc2 = (bytc) da.f164949b;
                    a.getClass();
                    bytc2.f167649a |= 16;
                    bytc2.f167654f = a;
                }
                return (bytc) da.mo74062i();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo74501b(byte[] bArr) {
        this.f167623b = bxtx.m123261a(bArr);
    }

    /* renamed from: c */
    public final void mo74502c(byte[] bArr) {
        this.f167624c = bxtx.m123261a(bArr);
    }

    /* renamed from: a */
    private final byti m125301a(Key key, byss byss, byte[] bArr, byte[] bArr2) {
        byte[] a = byst.m125279a(byss, key, this.f167626e, byst.m125288b(bArr, bArr2));
        bxvd da = byti.f167671d.mo74144da();
        bxtx a2 = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byti byti = (byti) da.f164949b;
        a2.getClass();
        byti.f167673a |= 1;
        byti.f167674b = a2;
        bxtx a3 = bxtx.m123261a(a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byti byti2 = (byti) da.f164949b;
        a3.getClass();
        byti2.f167673a |= 2;
        byti2.f167675c = a3;
        return (byti) da.mo74062i();
    }

    /* renamed from: a */
    static boolean m125302a(Key key, byss byss, Key key2) {
        return byss.f167610e || !Arrays.equals(key.getEncoded(), key2.getEncoded());
    }

    /* renamed from: a */
    private static final byte[] m125303a(byte[] bArr, byte[] bArr2) {
        bxvd da = bytf.f167664d.mo74144da();
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bytf bytf = (bytf) da.f164949b;
        a.getClass();
        bytf.f167666a |= 1;
        bytf.f167667b = a;
        bxtx a2 = bxtx.m123261a(bArr2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bytf bytf2 = (bytf) da.f164949b;
        a2.getClass();
        bytf2.f167666a |= 2;
        bytf2.f167668c = a2;
        return ((bytf) da.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    public final byti mo74498a(Key key, byss byss, Key key2, bysr bysr, byte[] bArr) {
        byte[] bArr2 = null;
        if (key == null || byss == null || key2 == null || bysr == null || bArr == null) {
            throw null;
        } else if (bysr == bysr.NONE) {
            String valueOf = String.valueOf(bysr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append(valueOf);
            sb.append(" not supported for encrypted messages");
            throw new IllegalArgumentException(sb.toString());
        } else if (byss.f167610e && this.f167624c == null) {
            throw new IllegalStateException("Must set a verificationKeyId when using public key signature with encryption");
        } else {
            byte[] a = byst.m125278a(bysr, this.f167626e);
            byte[] k = m125300a(byss, bysr, a).mo73642k();
            if (m125302a(key, byss, key2)) {
                bArr = byst.m125288b(byst.m125285a(byst.m125288b(k, this.f167622a)), bArr);
            } else {
                bArr2 = this.f167622a;
            }
            return m125301a(key, byss, m125303a(k, byst.m125281a(key2, bysr, this.f167626e, a, bArr)), bArr2);
        }
    }

    /* renamed from: a */
    public final byti mo74499a(Key key, byss byss, byte[] bArr) {
        if (key == null || byss == null || bArr == null) {
            throw null;
        } else if (this.f167625d == null) {
            return m125301a(key, byss, m125303a(m125300a(byss, bysr.NONE, (byte[]) null).mo73642k(), bArr), this.f167622a);
        } else {
            throw new IllegalStateException("Cannot set decryptionKeyId for a cleartext message");
        }
    }

    /* renamed from: a */
    public final void mo74500a(byte[] bArr) {
        this.f167625d = bxtx.m123261a(bArr);
    }
}
