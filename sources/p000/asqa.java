package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.Comparator;

/* renamed from: asqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asqa implements Comparator {

    /* renamed from: a */
    private final String f89370a;

    public asqa(String str) {
        this.f89370a = str;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        CardInfo cardInfo = (CardInfo) obj;
        CardInfo cardInfo2 = (CardInfo) obj2;
        if (cardInfo.f108340a.equals(this.f89370a)) {
            return -1;
        }
        if (cardInfo2.f108340a.equals(this.f89370a)) {
            return 1;
        }
        long j = cardInfo2.f108335B;
        long j2 = cardInfo.f108335B;
        return j == j2 ? cardInfo.f108340a.compareTo(cardInfo2.f108340a) : (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
