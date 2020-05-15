package p000;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: cihe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihe extends cihi {

    /* renamed from: d */
    private final ciha f190289d;

    /* renamed from: e */
    private final ciha f190290e;

    /* renamed from: f */
    private final ciha f190291f;

    /* renamed from: g */
    private final ciha f190292g;

    /* renamed from: h */
    private final int f190293h;

    public cihe(ciha ciha, ciha ciha2, ciha ciha3, ciha ciha4, Provider provider, int i) {
        super(provider);
        this.f190289d = ciha;
        this.f190290e = ciha2;
        this.f190291f = ciha3;
        this.f190292g = ciha4;
        this.f190293h = i;
    }

    /* renamed from: a */
    public final int mo86107a() {
        return this.f190293h;
    }

    /* renamed from: a */
    public final String mo86108a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (!this.f190291f.mo86102a(sSLSocket) || (bArr = (byte[]) this.f190291f.mo86101a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, cihl.f190322b);
    }

    /* renamed from: a */
    public final void mo86109a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f190289d.mo86103b(sSLSocket, true);
            this.f190290e.mo86103b(sSLSocket, str);
        }
        if (this.f190292g.mo86102a(sSLSocket)) {
            this.f190292g.mo86101a(sSLSocket, cihi.m150305a(list));
        }
    }
}
