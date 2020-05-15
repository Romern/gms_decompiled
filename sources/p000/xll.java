package p000;

import java.util.concurrent.Callable;

/* renamed from: xll */
final /* synthetic */ class xll implements Callable {

    /* renamed from: a */
    private final xlm f52663a;

    /* renamed from: b */
    private final xmf f52664b;

    /* renamed from: c */
    private final byte[] f52665c;

    public xll(xlm xlm, xmf xmf, byte[] bArr) {
        this.f52663a = xlm;
        this.f52664b = xmf;
        this.f52665c = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        p000.xlm.f52666d.mo25412b("WINK transaction failed, reinitializing device and retrying", new java.lang.Object[0]);
        r0.f52668b.set(r0.f52667a.mo29945b());
        r0.f52667a.mo29944a(r3);
        r0.f52667a.mo29943a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    public final Object call() {
        xmj xmj;
        xmf xmf;
        xlm xlm = this.f52663a;
        xmf xmf2 = this.f52664b;
        byte[] bArr = this.f52665c;
        if ((xlm.f52667a.f52739d & 1) == 1) {
            xmj xmj2 = new xmj(xlm.f52668b.get(), xmf.CMD_WINK, new byte[0]);
            try {
                xlm.f52667a.mo29944a(xmj2);
                xlm.f52667a.mo29943a();
            } catch (xml | xmm e) {
            }
        }
        xmj xmj3 = new xmj(xlm.f52668b.get(), xmf2, bArr);
        xlm.f52667a.mo29944a(xmj3);
        do {
            try {
                xmj = xlm.f52667a.mo29943a();
            } catch (xmm e2) {
                xlm.f52666d.mo25412b("transaction failed, reinitializing device and retrying", new Object[0]);
                xlm.f52668b.set(xlm.f52667a.mo29945b());
                xlm.f52667a.mo29944a(xmj3);
                xmj = xlm.f52667a.mo29943a();
            }
            byte b = ((xmi) xmj.mo29947b().get(0)).f52742a;
            xmf[] values = xmf.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                xmf = values[i];
                if (xmf.f52733i != b) {
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Encountered unknown HID command with byte value: ");
            sb.append((int) b);
            throw new xme(sb.toString());
        } while (xmf.equals(xmf.CMD_KEEPALIVE));
        if (xmf2.equals(xmf)) {
            return xmj.mo29948c();
        }
        adbd a = adbe.m50105a();
        a.f61234c = 13;
        String valueOf = String.valueOf(xmf.name());
        a.f61232a = valueOf.length() == 0 ? new String("Encountered a invalid command type HID message in response to a request: ") : "Encountered a invalid command type HID message in response to a request: ".concat(valueOf);
        throw a.mo33301a().mo33303c();
    }
}
