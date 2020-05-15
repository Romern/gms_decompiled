package p000;

/* renamed from: bacb */
final /* synthetic */ class bacb implements bmxj {

    /* renamed from: a */
    private final bacd f100457a;

    /* renamed from: b */
    private final bxvd f100458b;

    public bacb(bacd bacd, bxvd bxvd) {
        this.f100457a = bacd;
        this.f100458b = bxvd;
    }

    public final Object apply(Object obj) {
        bacd bacd = this.f100457a;
        bxvd bxvd = this.f100458b;
        String str = (String) obj;
        bqak bqak = bqak.AUTHENTICATED;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxw bpxw = (bpxw) bxvd.f164949b;
        bpxw bpxw2 = bpxw.f139795c;
        bpxw.f139798b = bqak.mo3214a();
        bpxw.f139797a |= 8;
        ((bads) bacd.f100463b.mo16713a()).mo32745a((bpxw) bxvd.mo74062i());
        return str;
    }
}
