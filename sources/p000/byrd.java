package p000;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* renamed from: byrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrd implements byre {

    /* renamed from: a */
    private final KeyPair f167454a = bysu.m125292a();

    /* renamed from: b */
    private PublicKey f167455b = null;

    /* renamed from: c */
    private SecretKey f167456c = null;

    /* renamed from: d */
    private SecretKey f167457d = null;

    /* renamed from: e */
    private final boolean f167458e;

    /* renamed from: f */
    private int f167459f;

    /* renamed from: g */
    private int f167460g;

    private byrd(int i) {
        this.f167460g = i;
        this.f167458e = i == 1;
        this.f167459f = 1;
    }

    /* renamed from: a */
    public static byrd m125180a() {
        return new byrd(1);
    }

    /* renamed from: b */
    public static byrd m125181b() {
        return new byrd(3);
    }

    /* renamed from: c */
    private final byte[] m125182c(byte[] bArr) {
        if (bArr != null) {
            try {
                SecretKey a = byrp.m125222a(this.f167454a.getPrivate(), this.f167455b);
                if (this.f167459f != 0) {
                    this.f167456c = byrb.m125176a(a, "initiator");
                    this.f167457d = byrb.m125176a(a, "responder");
                } else {
                    this.f167456c = a;
                    this.f167457d = a;
                }
                byrz byrz = new byrz(bysa.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD, byqy.m125143a(bArr, 1).mo73642k());
                SecretKey secretKey = this.f167457d;
                PublicKey publicKey = this.f167454a.getPublic();
                int i = this.f167459f;
                int i2 = byrb.f167453b;
                bxvd da = byrl.f167492d.mo74144da();
                bytb a2 = bysu.m125290a(publicKey);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byrl byrl = (byrl) da.f164949b;
                a2.getClass();
                byrl.f167495b = a2;
                int i3 = 1 | byrl.f167494a;
                byrl.f167494a = i3;
                byrl.f167494a = i3 | 2;
                byrl.f167496c = i;
                return byrb.m125178a(byrz, secretKey, ((byrl) da.mo74062i()).mo73642k());
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new byrq(e);
            }
        } else {
            throw new byrq("Not expecting null payload");
        }
    }

    /* renamed from: d */
    private final byte[] m125183d(byte[] bArr) {
        try {
            int i = byrb.f167453b;
            bytc a = bysw.m125309a((byti) bxvk.m124014a(byti.f167671d, bArr));
            if ((a.f167649a & 8) != 0) {
                byrl byrl = (byrl) bxvk.m124014a(byrl.f167492d, a.f167653e.mo73780k());
                if ((byrl.f167494a & 1) != 0) {
                    if (byrl.f167496c == 0) {
                        this.f167459f = 0;
                    }
                    PrivateKey privateKey = this.f167454a.getPrivate();
                    bytb bytb = byrl.f167495b;
                    if (bytb == null) {
                        bytb = bytb.f167639f;
                    }
                    SecretKey a2 = byrb.m125175a(privateKey, bytb);
                    if (this.f167459f != 0) {
                        this.f167456c = byrb.m125176a(a2, "initiator");
                        this.f167457d = byrb.m125176a(a2, "responder");
                    } else {
                        this.f167456c = a2;
                        this.f167457d = a2;
                    }
                    byri a3 = byrb.m125173a(this.f167457d, bArr);
                    if (a3.f167478c == 1) {
                        return a3.f167477b.mo73780k();
                    }
                    throw new byrq("Incorrect sequence number in responder hello");
                }
                throw new bxwf("Missing public key in responder hello");
            }
            throw new bxwf("Missing decryption key id");
        } catch (bxwf | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new byrq(e);
        }
    }

    /* renamed from: e */
    private final void m125184e(byte[] bArr) {
        try {
            byrk byrk = (byrk) bxvk.m124014a(byrk.f167486d, bArr);
            if ((byrk.f167488a & 1) != 0) {
                bytb bytb = byrk.f167489b;
                if (bytb == null) {
                    bytb = bytb.f167639f;
                }
                this.f167455b = bysu.m125293a(bytb);
                if (byrk.f167490c == 0) {
                    this.f167459f = 0;
                    return;
                }
                return;
            }
            throw new byrq("Missing public key in initiator hello");
        } catch (bxwf | InvalidKeySpecException e) {
            throw new byrq(e);
        }
    }

    /* renamed from: c */
    public final boolean mo74487c() {
        int i = this.f167460g;
        return i == 5 || i == 6;
    }

    /* renamed from: a */
    public final byte[] mo74485a(byte[] bArr) {
        int i = this.f167460g;
        if (i == 4) {
            byte[] c = m125182c(bArr);
            this.f167460g = 5;
            return c;
        }
        String a = byrc.m125179a(i);
        StringBuilder sb = new StringBuilder(a.length() + 47);
        sb.append("Cannot get next message with payload in state: ");
        sb.append(a);
        throw new byrq(sb.toString());
    }

    /* renamed from: b */
    public final byte[] mo74486b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new byrq("Handshake message too short");
        }
        int i = this.f167460g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            byte[] d = m125183d(bArr);
            this.f167460g = 5;
            return d;
        } else if (i2 == 2) {
            m125184e(bArr);
            this.f167460g = 4;
            return new byte[0];
        } else {
            String a = byrc.m125179a(i);
            StringBuilder sb = new StringBuilder(a.length() + 31);
            sb.append("Cannot parse message in state: ");
            sb.append(a);
            throw new byrq(sb.toString());
        }
    }

    /* renamed from: e */
    public final byqy mo74489e() {
        SecretKey secretKey;
        SecretKey secretKey2;
        if (this.f167460g == 6) {
            throw new byrq("Cannot reuse handshake context; is has already been used");
        } else if (mo74487c()) {
            this.f167460g = 6;
            if (this.f167459f == 0) {
                return new byqz(this.f167456c, 1);
            }
            boolean z = this.f167458e;
            if (!z) {
                secretKey = this.f167457d;
            } else {
                secretKey = this.f167456c;
            }
            if (!z) {
                secretKey2 = this.f167456c;
            } else {
                secretKey2 = this.f167457d;
            }
            return new byra(secretKey, secretKey2, !z ? 1 : 0, z ? 1 : 0);
        } else {
            throw new byrq("Handshake is not complete; cannot create connection context");
        }
    }

    /* renamed from: d */
    public final byte[] mo74488d() {
        int i = this.f167460g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f167460g = 2;
            bxvd da = byrk.f167486d.mo74144da();
            bytb a = bysu.m125290a(this.f167454a.getPublic());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byrk byrk = (byrk) da.f164949b;
            a.getClass();
            byrk.f167489b = a;
            int i3 = byrk.f167488a | 1;
            byrk.f167488a = i3;
            int i4 = this.f167459f;
            byrk.f167488a = 2 | i3;
            byrk.f167490c = i4;
            return ((byrk) da.mo74062i()).mo73642k();
        } else if (i2 == 3) {
            byte[] c = m125182c(new byte[0]);
            this.f167460g = 5;
            return c;
        } else {
            String a2 = byrc.m125179a(i);
            StringBuilder sb = new StringBuilder(a2.length() + 34);
            sb.append("Cannot get next message in state: ");
            sb.append(a2);
            throw new byrq(sb.toString());
        }
    }
}
