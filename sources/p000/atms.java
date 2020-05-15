package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.List;

/* renamed from: atms */
final /* synthetic */ class atms implements aubw {

    /* renamed from: a */
    private final atmu f90506a;

    /* renamed from: b */
    private final CardInfo f90507b;

    public atms(atmu atmu, CardInfo cardInfo) {
        this.f90506a = atmu;
        this.f90507b = cardInfo;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        atmu atmu = this.f90506a;
        CardInfo cardInfo = this.f90507b;
        Void voidR = (Void) obj;
        atmt atmt = atmu.f90511d;
        String str = cardInfo.f108340a;
        atme atme = (atme) atmt;
        List list = atme.f90476i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CardInfo cardInfo2 = (CardInfo) list.get(i);
            if (atme.f90478k.containsKey(cardInfo2.f108340a)) {
                ((atmu) atme.f90478k.get(cardInfo2.f108340a)).mo50045a(cardInfo2, str);
            }
        }
    }
}
