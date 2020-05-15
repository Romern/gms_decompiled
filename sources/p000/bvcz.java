package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bvcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvcz implements bvbw {

    /* renamed from: a */
    private static final bvcl f155620a = bvcl.m120913b();

    /* renamed from: b */
    private static final byte[] f155621b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private final String f155622c = ((bvci) f155620a).mo73313a();

    /* renamed from: d */
    private final bvbw f155623d;

    /* renamed from: e */
    private final byte[] f155624e;

    /* renamed from: f */
    private byre f155625f = null;

    /* renamed from: g */
    private byqy f155626g = null;

    /* renamed from: h */
    private boolean f155627h;

    /* renamed from: i */
    private int f155628i;

    public bvcz(bvbw bvbw, byte[] bArr) {
        this.f155623d = bvbw;
        this.f155624e = (byte[]) sdo.m34959a(bArr);
        this.f155628i = 1;
        this.f155627h = false;
    }

    /* renamed from: a */
    private final void m120960a(Exception exc) {
        String str;
        m120963g();
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("bvcz", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (this.f155628i != 2) {
            str = "responder";
        } else {
            str = "initiator";
        }
        bnsl.mo68420a("SecureConnectionSpake: Fail to authenticate as %s", str);
        this.f155623d.mo73142a(new byte[0]);
        throw new IOException(exc);
    }

    /* renamed from: b */
    private final byte[] m120961b(byte[] bArr) {
        try {
            byqy byqy = this.f155626g;
            if (byqy != null) {
                return byqy.mo74478b(bArr);
            }
            throw new IOException("Not connected");
        } catch (SignatureException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: c */
    private static final void m120962c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("Connection torn down");
        }
    }

    /* renamed from: g */
    private final void m120963g() {
        this.f155625f = null;
        this.f155626g = null;
        this.f155627h = false;
    }

    /* renamed from: h */
    private final void m120964h() {
        if (this.f155625f.mo74487c()) {
            byrg byrg = (byrg) this.f155625f;
            if (byrg.f167465e == 10) {
                throw new byrq("Cannot reuse handshake context; is has already been used");
            } else if (byrg.mo74487c()) {
                byrg.f167465e = 10;
                this.f155626g = new byqz(new SecretKeySpec(byrg.f167464d, "AES"), 1);
                this.f155625f = null;
            } else {
                throw new byrq("Handshake is not complete; cannot create connection context");
            }
        } else {
            throw new IOException("Expected handshake to be complete, but it's not");
        }
    }

    /* renamed from: a */
    public final String mo73141a() {
        return this.f155622c;
    }

    public final void close() {
        this.f155628i = 1;
        m120963g();
        this.f155623d.close();
    }

    /* renamed from: d */
    public final boolean mo73146d() {
        return this.f155623d.mo73146d() && this.f155627h;
    }

    /* renamed from: e */
    public final buzo mo73147e() {
        bxvd da = buzo.f155407d.mo74144da();
        String str = this.f155622c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo = (buzo) da.f164949b;
        str.getClass();
        buzo.f155409a |= 1;
        buzo.f155410b = str;
        bxvf bxvf = (bxvf) buzp.f155413c.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buzp buzp = (buzp) bxvf.f164949b;
        buzp.f155416b = 1;
        buzp.f155415a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo2 = (buzo) da.f164949b;
        buzp buzp2 = (buzp) bxvf.mo74062i();
        buzp2.getClass();
        buzo2.f155411c = buzp2;
        buzo2.f155409a |= 2;
        return (buzo) da.mo74062i();
    }

    /* renamed from: f */
    public final boolean mo73148f() {
        return this.f155623d.mo73148f();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byrg.a(boolean, byte[]):byte[]
     arg types: [int, byte[]]
     candidates:
      byrg.a(byte[], boolean):byte[]
      byrg.a(boolean, byte[]):byte[] */
    /* renamed from: c */
    public final void mo73144c() {
        if (!mo73146d()) {
            if (!this.f155623d.mo73146d()) {
                this.f155623d.mo73144c();
            }
            if (this.f155623d.mo73148f()) {
                this.f155628i = 2;
                byte[] bArr = this.f155624e;
                m120963g();
                this.f155628i = 2;
                try {
                    byrg byrg = new byrg(1, bArr);
                    this.f155625f = byrg;
                    this.f155623d.mo73142a(byrg.mo74488d());
                    byre byre = this.f155625f;
                    byte[] b = this.f155623d.mo73143b();
                    m120962c(b);
                    byre.mo74486b(b);
                    this.f155623d.mo73142a(this.f155625f.mo74488d());
                    byte[] bArr2 = f155621b;
                    byre byre2 = this.f155625f;
                    byte[] b2 = this.f155623d.mo73143b();
                    m120962c(b2);
                    if (Arrays.equals(bArr2, byre2.mo74486b(b2))) {
                        m120964h();
                        this.f155627h = true;
                        return;
                    }
                    throw new IOException("Could not get connection confirmation from responder");
                } catch (IllegalStateException e) {
                    m120960a(e);
                } catch (byrq e2) {
                    m120960a(e2);
                }
            } else {
                this.f155628i = 3;
                byte[] bArr3 = this.f155624e;
                m120963g();
                this.f155628i = 3;
                try {
                    byrg byrg2 = new byrg(5, bArr3);
                    this.f155625f = byrg2;
                    byte[] b3 = this.f155623d.mo73143b();
                    m120962c(b3);
                    byrg2.mo74486b(b3);
                    this.f155623d.mo73142a(this.f155625f.mo74488d());
                    byre byre3 = this.f155625f;
                    byte[] b4 = this.f155623d.mo73143b();
                    m120962c(b4);
                    byre3.mo74486b(b4);
                    bvbw bvbw = this.f155623d;
                    byre byre4 = this.f155625f;
                    byte[] bArr4 = f155621b;
                    int i = ((byrg) byre4).f167465e;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 7) {
                        byte[] a = ((byrg) byre4).mo74490a(false, bArr4);
                        ((byrg) byre4).f167465e = 9;
                        bvbw.mo73142a(a);
                        m120964h();
                        this.f155627h = true;
                    } else {
                        String a2 = byrf.m125195a(i);
                        StringBuilder sb = new StringBuilder(a2.length() + 53);
                        sb.append("Cannot send handshake message with payload in state: ");
                        sb.append(a2);
                        throw new byrq(sb.toString());
                    }
                } catch (IllegalStateException e3) {
                    m120960a(e3);
                } catch (byrq e4) {
                    m120960a(e4);
                }
            }
        }
    }

    /* renamed from: b */
    public final byte[] mo73143b() {
        if (this.f155627h) {
            return m120961b(this.f155623d.mo73143b());
        }
        throw new IOException("Connection is not authenticated");
    }

    /* renamed from: a */
    public final void mo73142a(byte[] bArr) {
        if (this.f155627h) {
            bvbw bvbw = this.f155623d;
            byqy byqy = this.f155626g;
            if (byqy != null) {
                bvbw.mo73142a(byqy.mo74476a(bArr));
                return;
            }
            throw new IOException("Not connected");
        }
        throw new IOException("Connection is not authenticated");
    }
}
