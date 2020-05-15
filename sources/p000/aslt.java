package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: aslt */
final /* synthetic */ class aslt implements rkl {

    /* renamed from: a */
    private final aslv f89189a;

    public aslt(aslv aslv) {
        this.f89189a = aslv;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        aslv aslv = this.f89189a;
        asmj asmj = (asmj) rkk;
        if (!asmj.mo7183bo().mo17710c()) {
            aslv.mo2450b(aslx.INCORRECT);
            return;
        }
        CardInfo[] cardInfoArr = asmj.mo49241b().f108369a;
        int length = cardInfoArr.length;
        int i = 0;
        while (i < length) {
            if (cardInfoArr[i].f108345f.f108459b != 5) {
                i++;
            } else {
                aslv.mo2450b(aslx.CORRECT);
                return;
            }
        }
        aslv.mo2450b(aslx.INCORRECT);
    }
}
