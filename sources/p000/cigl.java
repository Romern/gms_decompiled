package p000;

import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: cigl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigl extends cigm {

    /* renamed from: d */
    private static final ciha f190142d = new ciha(null, "setUseSessionTickets", Boolean.TYPE);

    /* renamed from: e */
    private static final ciha f190143e = new ciha(null, "setHostname", String.class);

    /* renamed from: f */
    private static final ciha f190144f = new ciha(byte[].class, "getAlpnSelectedProtocol", new Class[0]);

    /* renamed from: g */
    private static final ciha f190145g = new ciha(null, "setAlpnProtocols", byte[].class);

    /* renamed from: h */
    private static final ciha f190146h = new ciha(byte[].class, "getNpnSelectedProtocol", new Class[0]);

    /* renamed from: i */
    private static final ciha f190147i = new ciha(null, "setNpnProtocols", byte[].class);

    public cigl(cihi cihi) {
        super(cihi);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public final String mo86074a(SSLSocket sSLSocket) {
        if (this.f190151c.mo86107a() == 1) {
            try {
                byte[] bArr = (byte[]) f190144f.mo86101a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, cihl.f190322b);
                }
            } catch (Exception e) {
                cigm.f190148a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e);
            }
        }
        if (this.f190151c.mo86107a() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) f190146h.mo86101a(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, cihl.f190322b);
            }
            return null;
        } catch (Exception e2) {
            cigm.f190148a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86076b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            f190142d.mo86103b(sSLSocket, true);
            f190143e.mo86103b(sSLSocket, str);
        }
        Object[] objArr = {cihi.m150305a(list)};
        if (this.f190151c.mo86107a() == 1) {
            f190145g.mo86101a(sSLSocket, objArr);
        }
        if (this.f190151c.mo86107a() != 3) {
            f190147i.mo86101a(sSLSocket, objArr);
            return;
        }
        throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }

    /* renamed from: a */
    public final String mo86075a(SSLSocket sSLSocket, String str, List list) {
        String a = mo86074a(sSLSocket);
        return a == null ? super.mo86075a(sSLSocket, str, list) : a;
    }
}
