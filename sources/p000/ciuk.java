package p000;

import java.util.List;
import org.webrtc.PeerConnection;

/* renamed from: ciuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuk {

    /* renamed from: a */
    public String f191487a = "";

    /* renamed from: b */
    public String f191488b = "";

    /* renamed from: c */
    private final List f191489c;

    /* renamed from: d */
    private final PeerConnection.TlsCertPolicy f191490d = PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE;

    /* renamed from: e */
    private final String f191491e = "";

    public ciuk(List list) {
        if (list == null || list.isEmpty()) {
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("urls == null || urls.isEmpty(): ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f191489c = list;
    }

    /* renamed from: a */
    public final PeerConnection.IceServer mo86580a() {
        return new PeerConnection.IceServer((String) this.f191489c.get(0), this.f191489c, this.f191487a, this.f191488b, this.f191490d, this.f191491e);
    }
}
