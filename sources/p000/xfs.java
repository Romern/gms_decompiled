package p000;

import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;

/* renamed from: xfs */
final /* synthetic */ class xfs implements bmxz {

    /* renamed from: a */
    private final ProtocolVersion f52142a;

    public xfs(ProtocolVersion protocolVersion) {
        this.f52142a = protocolVersion;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        ProtocolVersion protocolVersion = this.f52142a;
        ByteString bxtx = xft.f52144d;
        return ((xfq) obj).f52134a.equals(protocolVersion);
    }
}
