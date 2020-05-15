package p000;

import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

/* renamed from: atna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atna {
    /* renamed from: a */
    public static ValuableInfo[] m76206a(PassInfo[] passInfoArr) {
        if (passInfoArr == null) {
            return null;
        }
        ValuableInfo[] valuableInfoArr = new ValuableInfo[passInfoArr.length];
        for (int i = 0; i < passInfoArr.length; i++) {
            PassInfo passInfo = passInfoArr[i];
            asph asph = new asph();
            asph.f89350g = 8;
            asph.f89354k = passInfo.f108416a;
            asph.f89355l = passInfo.f108417b;
            asph.f89348e = passInfo.f108418c;
            valuableInfoArr[i] = asph.mo49327a();
        }
        return valuableInfoArr;
    }
}
