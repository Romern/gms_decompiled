package p000;

/* renamed from: bacc */
final /* synthetic */ class bacc implements bqeh {

    /* renamed from: a */
    private final bacd f100459a;

    /* renamed from: b */
    private final String f100460b;

    /* renamed from: c */
    private final bxvd f100461c;

    public bacc(bacd bacd, bxvd bxvd, String str) {
        this.f100459a = bacd;
        this.f100461c = bxvd;
        this.f100460b = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bacd bacd = this.f100459a;
        bxvd bxvd = this.f100461c;
        String str = this.f100460b;
        Exception exc = (Exception) obj;
        bqak a = bace.m86560a(exc);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxw bpxw = (bpxw) bxvd.f164949b;
        bpxw bpxw2 = bpxw.f139795c;
        bpxw.f139798b = a.mo3214a();
        bpxw.f139797a |= 8;
        ((bads) bacd.f100463b.mo16713a()).mo32745a((bpxw) bxvd.mo74062i());
        ((achw) bacd.f100462a.mo16713a()).mo25418e("[Auth] Failed to get token with scope [%s]", str);
        if (((Boolean) acaw.f59249F.mo32596a()).booleanValue()) {
            boolean booleanValue = ((Boolean) acaw.f59248E.mo32596a()).booleanValue();
            bqak a2 = bace.m86560a(exc);
            if (!bace.f100466a.contains(a2) || (!booleanValue && a2.equals(bqak.AUTH_INTERNAL_ERROR))) {
                throw exc;
            }
            throw new babw(exc);
        }
        throw exc;
    }
}
