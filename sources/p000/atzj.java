package p000;

import android.os.Bundle;
import android.util.SparseArray;

/* renamed from: atzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzj implements atze {

    /* renamed from: a */
    private static final srn f91226a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final String f91227b;

    /* renamed from: c */
    private final SparseArray f91228c;

    /* renamed from: d */
    private int f91229d = 1;

    /* renamed from: e */
    private int f91230e = -1;

    /* renamed from: f */
    private asin f91231f;

    /* renamed from: g */
    private final boolean f91232g;

    /* renamed from: h */
    private final rjx f91233h;

    public atzj(rjx rjx, String str, boolean z) {
        this.f91233h = rjx;
        this.f91227b = str;
        this.f91228c = new SparseArray();
        this.f91232g = z;
    }

    /* renamed from: a */
    public final rke mo50329a() {
        return mo50330a("getAllCards", null, auaa.f91307b.mo66854a());
    }

    /* renamed from: b */
    public final void mo50332b(asin asin) {
        if (this.f91231f == asin) {
            this.f91231f = null;
            this.f91230e = -1;
            int i = this.f91229d;
            this.f91229d = i + 1;
            this.f91233h.mo24694a(this.f91227b, "/tapandpay/proxy", auai.m76649a(auaa.m76631a("removeListener", i, (Bundle) null), this.f91232g));
        }
    }

    /* renamed from: a */
    public final rke mo50330a(String str, Bundle bundle, bmxe bmxe) {
        atzg atzg = new atzg(bmxe);
        int i = this.f91229d;
        this.f91229d = i + 1;
        this.f91228c.put(i, atzg);
        this.f91233h.mo24694a(this.f91227b, "/tapandpay/proxy", auai.m76649a(auaa.m76631a(str, i, bundle), this.f91232g));
        return atzg;
    }

    /* renamed from: a */
    public final void mo50331a(asin asin) {
        int i = this.f91229d;
        this.f91229d = i + 1;
        this.f91231f = asin;
        this.f91230e = i;
        this.f91233h.mo24694a(this.f91227b, "/tapandpay/proxy", auai.m76649a(auaa.m76631a("registerListener", i, (Bundle) null), this.f91232g));
    }

    /* renamed from: a */
    public final void mo50326a(String str, Bundle bundle) {
        asin asin;
        rkl rkl;
        auai.m76648a(bundle);
        if ("apiResponse".equals(str)) {
            int i = bundle.getInt("requestId");
            atzg atzg = (atzg) this.f91228c.get(i);
            if (atzg != null) {
                rkk rkk = (rkk) atzg.f91219a.mo66855c(bundle.getBundle("data"));
                if (!(rkk == null || (rkl = atzg.f91220b) == null)) {
                    rkl.mo9454a(rkk);
                }
                this.f91228c.remove(i);
            } else if (i == this.f91230e && (asin = this.f91231f) != null) {
                asin.mo49193a();
            } else {
                ((bnsl) f91226a.mo68387b()).mo68409a("No pending request for id %s", i);
            }
        }
    }
}
