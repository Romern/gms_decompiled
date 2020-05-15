package p000;

import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;

/* renamed from: bvcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvcy implements bvbw {

    /* renamed from: a */
    private static final bvcl f155611a = bvcl.m120913b();

    /* renamed from: b */
    private static final byte[] f155612b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final byte[] f155613c = "CONFIRM".getBytes(Charset.forName("UTF-8"));

    /* renamed from: d */
    private final String f155614d = ((bvci) f155611a).mo73313a();

    /* renamed from: e */
    private final bvbw f155615e;

    /* renamed from: f */
    private byre f155616f = null;

    /* renamed from: g */
    private byqy f155617g = null;

    /* renamed from: h */
    private int f155618h = 1;

    /* renamed from: i */
    private int f155619i = 1;

    public bvcy(bvbw bvbw) {
        this.f155615e = bvbw;
    }

    /* renamed from: a */
    private final void m120941a(Exception exc) {
        String str;
        m120945l();
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("bvcy", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (this.f155618h != 2) {
            str = "responder";
        } else {
            str = "initiator";
        }
        bnsl.mo68420a("SecureConnectionEcdh: Fail to authenticate as %s", str);
        this.f155615e.mo73142a(new byte[0]);
        throw new IOException(exc);
    }

    /* renamed from: b */
    private final byte[] m120942b(byte[] bArr) {
        try {
            byqy byqy = this.f155617g;
            if (byqy != null) {
                return byqy.mo74478b(bArr);
            }
            throw new IOException("Not connected");
        } catch (SignatureException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: c */
    private final byte[] m120943c(byte[] bArr) {
        byqy byqy = this.f155617g;
        if (byqy != null) {
            return byqy.mo74476a(bArr);
        }
        throw new IOException("Not connected");
    }

    /* renamed from: d */
    private static final void m120944d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("Connection torn down");
        }
    }

    /* renamed from: l */
    private final void m120945l() {
        this.f155616f = null;
        this.f155617g = null;
        this.f155619i = 1;
    }

    /* renamed from: m */
    private final void m120946m() {
        if (this.f155616f.mo74487c()) {
            int i = this.f155619i;
            if (i == 2) {
                this.f155617g = this.f155616f.mo74489e();
                this.f155616f = null;
                return;
            }
            String a = bvcx.m120940a(i);
            StringBuilder sb = new StringBuilder(a.length() + 40);
            sb.append("Cannot upgrade conneciton; wrong state: ");
            sb.append(a);
            throw new IOException(sb.toString());
        }
        throw new IOException("Expected handshake to be complete, but it's not");
    }

    /* renamed from: n */
    private final boolean m120947n() {
        return this.f155619i == 3;
    }

    /* renamed from: a */
    public final String mo73141a() {
        return this.f155614d;
    }

    public final void close() {
        this.f155618h = 1;
        m120945l();
        this.f155615e.close();
    }

    /* renamed from: e */
    public final buzo mo73147e() {
        bxvd da = buzo.f155407d.mo74144da();
        String str = this.f155614d;
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
        buzp.f155416b = 2;
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
        return this.f155615e.mo73148f();
    }

    /* renamed from: g */
    public final boolean mo73328g() {
        return Arrays.equals(f155613c, m120942b(this.f155615e.mo73143b()));
    }

    /* renamed from: h */
    public final void mo73329h() {
        this.f155615e.mo73142a(m120943c(f155613c));
    }

    /* renamed from: i */
    public final String mo73330i() {
        byqy byqy = this.f155617g;
        if (byqy != null) {
            int i = this.f155619i;
            if (i == 2) {
                try {
                    return Base64.encodeToString(byqy.mo74475a(), 3);
                } catch (NoSuchAlgorithmException e) {
                    throw new IOException(e);
                }
            } else {
                String a = bvcx.m120940a(i);
                StringBuilder sb = new StringBuilder(a.length() + 43);
                sb.append("Cannot get verification code; wrong state: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Cannot get verification code; no connection");
        }
    }

    /* renamed from: j */
    public final void mo73331j() {
        if (this.f155617g != null) {
            int i = this.f155619i;
            if (i == 2) {
                this.f155619i = 3;
                return;
            }
            String a = bvcx.m120940a(i);
            StringBuilder sb = new StringBuilder(a.length() + 44);
            sb.append("Cannot verify connection code; wrong state: ");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Cannot set connection as verified; null connection");
    }

    /* renamed from: k */
    public final boolean mo73332k() {
        return this.f155615e.mo73146d() && this.f155619i == 2;
    }

    /* renamed from: d */
    public final boolean mo73146d() {
        return this.f155615e.mo73146d() && m120947n();
    }

    /* renamed from: c */
    public final void mo73144c() {
        if (!mo73146d()) {
            if (!this.f155615e.mo73146d()) {
                this.f155615e.mo73144c();
            }
            if (this.f155615e.mo73148f()) {
                this.f155618h = 2;
                m120945l();
                this.f155618h = 2;
                try {
                    byrd a = byrd.m125180a();
                    this.f155616f = a;
                    this.f155615e.mo73142a(a.mo74488d());
                    byte[] bArr = f155612b;
                    byre byre = this.f155616f;
                    byte[] b = this.f155615e.mo73143b();
                    m120944d(b);
                    if (Arrays.equals(bArr, byre.mo74486b(b))) {
                        this.f155619i = 2;
                        m120946m();
                        return;
                    }
                    throw new IOException("Could not get connection confirmation from responder");
                } catch (IllegalStateException e) {
                    m120941a(e);
                } catch (byrq e2) {
                    m120941a(e2);
                }
            } else {
                this.f155618h = 3;
                m120945l();
                this.f155618h = 3;
                try {
                    byrd b2 = byrd.m125181b();
                    this.f155616f = b2;
                    byte[] b3 = this.f155615e.mo73143b();
                    m120944d(b3);
                    b2.mo74486b(b3);
                    this.f155615e.mo73142a(this.f155616f.mo74485a(f155612b));
                    this.f155619i = 2;
                    m120946m();
                } catch (IllegalStateException e3) {
                    m120941a(e3);
                } catch (byrq e4) {
                    m120941a(e4);
                }
            }
        }
    }

    /* renamed from: b */
    public final byte[] mo73143b() {
        if (m120947n()) {
            return m120942b(this.f155615e.mo73143b());
        }
        throw new IOException("Connection is not authenticated");
    }

    /* renamed from: a */
    public final void mo73142a(byte[] bArr) {
        if (m120947n()) {
            this.f155615e.mo73142a(m120943c(bArr));
            return;
        }
        throw new IOException("Connection is not authenticated");
    }
}
