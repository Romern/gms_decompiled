package p000;

import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: xfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfl extends xft {

    /* renamed from: a */
    public static final byte[] f52126a = {-31, 4};

    /* renamed from: b */
    public static final byte[] f52127b = {0, 1, -48};

    /* renamed from: c */
    public static final Logger f52128c = new Logger(new String[]{"NfcSecurityKey"}, (short[]) null);

    public xfl(xwj xwj, xlc xlc, xws xws) {
        super(xwj, xlc, xws);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29692a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ProtocolVersion mo29693a(ByteString bxtx) {
        ProtocolVersion protocolVersion;
        try {
            if (!bmxi.m108538a(xft.f52144d, bxtx)) {
                xlg xlg = new xlg(1);
                xle a = xle.m43131a((byte) 0, (byte) -92, xlg.f52660d);
                a.mo29894a((byte) 4);
                a.mo29895a(xlg.f52657a);
                a.mo29897b(xlg.f52659c);
                xlf xlf = (xlf) this.f52146f.mo29827a(a).get();
                short s = xlf.f52655a;
                if (s == 27266 || s == 27904) {
                    xlf = (xlf) this.f52146f.mo29827a(xlg.mo29903a()).get();
                    if (xlf.f52655a != -28672) {
                        throw new xli();
                    }
                }
                protocolVersion = ProtocolVersion.m23586a(xlf.mo29900a());
            } else {
                xlg xlg2 = new xlg(1);
                xle a2 = xle.m43131a((byte) 0, (byte) -92, xlg2.f52660d);
                a2.mo29894a((byte) 4);
                a2.mo29895a(xlg.f52658b);
                a2.mo29897b(xlg2.f52659c);
                if (((xlf) this.f52146f.mo29827a(a2).get()).f52655a == -28672) {
                    xlf xlf2 = (xlf) this.f52146f.mo29827a(xlg2.mo29903a()).get();
                    short s2 = xlf2.f52655a;
                    if (s2 == -28672) {
                        protocolVersion = ProtocolVersion.m23586a(xlf2.mo29900a());
                    } else if (s2 == 27904) {
                        protocolVersion = ProtocolVersion.V1;
                    } else {
                        throw new xli();
                    }
                } else {
                    throw new xli();
                }
            }
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                Logger Logger = f52128c;
                String valueOf = String.valueOf(protocolVersion);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                sb.append("Got version ");
                sb.append(valueOf);
                Logger.mo25414c(sb.toString(), new Object[0]);
            }
            return protocolVersion;
        } catch (IOException | InterruptedException | ExecutionException e) {
            this.f52147g.mo30186a(this.f52148h, xag.TYPE_NFC_APPLET_SELECT_FAILED);
            throw xfv.m42835a(28416, e);
        } catch (xli | xyg e2) {
            this.f52147g.mo30186a(this.f52148h, xag.TYPE_NFC_APPLET_SELECT_FAILED);
            throw xfv.m42835a(27904, e2);
        }
    }
}
