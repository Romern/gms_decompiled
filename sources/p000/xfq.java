package p000;

import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;

/* renamed from: xfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfq {

    /* renamed from: a */
    public final ProtocolVersion f52134a;

    /* renamed from: b */
    public final ByteString f52135b;

    /* renamed from: c */
    public final ByteString f52136c;

    /* renamed from: d */
    public final bmxv f52137d;

    public xfq(ProtocolVersion protocolVersion, ByteString bxtx, ByteString bxtx2, bmxv bmxv) {
        boolean z;
        bmxy.m108581a(protocolVersion);
        this.f52134a = protocolVersion;
        bmxy.m108581a(bxtx);
        this.f52135b = bxtx;
        boolean z2 = false;
        if (bxtx.mo73744a() == 32) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bmxy.m108581a(bxtx2);
        this.f52136c = bxtx2;
        ProtocolVersion protocolVersion2 = ProtocolVersion.UNKNOWN;
        int ordinal = protocolVersion.ordinal();
        if (ordinal == 1) {
            bmxy.m108588a(bxtx2.mo73744a() == 65 ? true : z2);
        } else if (ordinal == 2) {
            bmxy.m108588a(bxtx2.mo73744a() == 32 ? true : z2);
        } else {
            String valueOf = String.valueOf(protocolVersion);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unsupported version: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f52137d = bmxv;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xfq) {
            xfq xfq = (xfq) obj;
            if (!bmxi.m108538a(this.f52134a, xfq.f52134a) || !bmxi.m108538a(this.f52135b, xfq.f52135b) || !bmxi.m108538a(this.f52136c, xfq.f52136c) || !bmxi.m108538a(this.f52137d, xfq.f52137d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52134a, this.f52135b, this.f52136c, this.f52137d});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("protocolVersion", this.f52134a);
        a.mo66885a("application", boan.f132472f.mo68794a(this.f52135b.getKey()));
        a.mo66885a("challenge", boan.f132472f.mo68794a(this.f52136c.getKey()));
        if (this.f52137d.mo66813a()) {
            a.mo66885a("clientData", this.f52137d.mo66814b());
        }
        return a.toString();
    }
}
