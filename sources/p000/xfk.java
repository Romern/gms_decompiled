package p000;

import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.concurrent.ExecutionException;

/* renamed from: xfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfk extends xft {
    public xfk(xwj xwj, xjg xjg, xws xws) {
        super(xwj, xjg, xws);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29692a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ProtocolVersion mo29693a(ByteString bxtx) {
        try {
            xlf xlf = (xlf) this.f52146f.mo29827a(new xlg(2).mo29903a()).get();
            byte[] a = xlf.mo29900a();
            if (xlf.f52655a == -28672) {
                return ProtocolVersion.m23586a(a);
            }
            this.f52147g.mo30186a(this.f52148h, xag.TYPE_BLUETOOTH_APPLET_SELECT_FAILED);
            throw xfv.m42834a(27904);
        } catch (InterruptedException | ExecutionException e) {
            throw xfv.m42835a(28416, e);
        } catch (xyg e2) {
            throw xfv.m42835a(27904, e2);
        }
    }
}
