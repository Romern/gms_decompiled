package p000;

import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: xfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfw extends xft {

    /* renamed from: b */
    private static final byte[] f52150b = {65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65};

    /* renamed from: c */
    private static final Logger f52151c = new Logger(new String[]{"UsbSecurityKey"}, (short[]) null);

    /* renamed from: a */
    public boolean f52152a = false;

    public xfw(xwj xwj, xlm xlm, xws xws) {
        super(xwj, xlm, xws);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29692a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RegisterResponseData mo29709b() {
        xlg xlg = new xlg(2);
        mo29705a(xlg, xlg.mo29904a(f52150b, f52145e.getKey(), false), ProtocolVersion.V2, bmxv.m108566b(""));
        f52151c.mo25414c("Security key already registered", new Object[0]);
        this.f52147g.mo30184a(this.f52148h, new Exception("Security key already registered"));
        throw xfv.m42834a(27264);
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
            throw xfv.m42834a(27904);
        } catch (xyg e) {
            throw xfv.m42835a(27904, e);
        } catch (InterruptedException | ExecutionException e2) {
            throw xfv.m42835a(28416, e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RegisterResponseData mo29705a(xlg xlg, xle xle, ProtocolVersion protocolVersion, bmxv bmxv) {
        while (!this.f52152a) {
            try {
                return mo29710b(xlg, xle, protocolVersion, bmxv);
            } catch (xfv e) {
                if (e.f52149a == 27013) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e2) {
                    }
                } else {
                    throw e;
                }
            }
        }
        throw xfv.m42834a(27013);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SignResponseData mo29707a(ProtocolVersion protocolVersion, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            xfr xfr = (xfr) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(xfr);
            try {
                return mo29711b(protocolVersion, arrayList2);
            } catch (xfv e) {
                if (e.f52149a == 27013) {
                    arrayList.add(xfr);
                }
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            while (!this.f52152a) {
                try {
                    return mo29711b(protocolVersion, list);
                } catch (xfv e2) {
                    if (e2.f52149a == 27013) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e3) {
                        }
                    } else {
                        throw e2;
                    }
                }
            }
            throw xfv.m42834a(27013);
        }
        xlg xlg = new xlg(2);
        mo29705a(xlg, xlg.mo29904a(f52150b, f52145e.getKey(), false), protocolVersion, bmxv.m108566b(""));
        throw xfv.m42834a(27264);
    }
}
