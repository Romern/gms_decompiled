package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import java.io.IOException;

/* renamed from: atiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atiq extends atki {
    public atiq(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest, String str, aswm aswm) {
        super("FirstPartyTokenizePan", firstPartyTokenizePanRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        String str3;
        boolean z4;
        byte[] bArr2;
        CardInfo cardInfo;
        AccountInfo accountInfo;
        String str4;
        Context context2 = context;
        String str5 = this.f90413c;
        if (!"com.google.android.gms".equals(str5) || (str4 = ((FirstPartyTokenizePanRequest) this.f90410b).f108532f) == null) {
            str = str5;
        } else {
            str = str4;
        }
        askf b = askg.m74283b(context2, str);
        boolean z5 = false;
        if (b != null) {
            AccountInfo a = b.mo49209a();
            FirstPartyTokenizePanRequest firstPartyTokenizePanRequest = (FirstPartyTokenizePanRequest) this.f90410b;
            String str6 = firstPartyTokenizePanRequest.f108527a;
            boolean booleanValue = Boolean.valueOf(firstPartyTokenizePanRequest.f108528b).booleanValue();
            FirstPartyTokenizePanRequest firstPartyTokenizePanRequest2 = (FirstPartyTokenizePanRequest) this.f90410b;
            String str7 = firstPartyTokenizePanRequest2.f108529c;
            byte[] bArr3 = firstPartyTokenizePanRequest2.f108530d;
            boolean z6 = firstPartyTokenizePanRequest2.f108531e;
            boolean z7 = firstPartyTokenizePanRequest2.f108533g;
            boolean z8 = firstPartyTokenizePanRequest2.f108534h;
            boolean z9 = firstPartyTokenizePanRequest2.f108535i;
            String str8 = firstPartyTokenizePanRequest2.f108536j;
            if (TextUtils.isEmpty(str6)) {
                str2 = str8;
                z = z8;
                cardInfo = null;
                bArr2 = null;
                z3 = z6;
                accountInfo = a;
                z5 = z9;
                z2 = z7;
                bArr = bArr3;
                str3 = str7;
                z4 = booleanValue;
            } else {
                atds a2 = atds.m75666a(b);
                CardInfo b2 = a2.mo49853b(str6);
                if (b2 != null) {
                    str2 = str8;
                    cardInfo = b2;
                    bArr2 = null;
                    z = z8;
                    z3 = z6;
                    accountInfo = a;
                    z5 = z9;
                    z2 = z7;
                    bArr = bArr3;
                    str3 = str7;
                    z4 = booleanValue;
                } else {
                    try {
                        byte[] a3 = atds.m75668a(a2, str6);
                        str2 = str8;
                        cardInfo = b2;
                        bArr2 = a3;
                        z = z8;
                        z3 = z6;
                        accountInfo = a;
                        z5 = z9;
                        z2 = z7;
                        bArr = bArr3;
                        str3 = str7;
                        z4 = booleanValue;
                    } catch (atfh | IOException e) {
                        this.f90414d.mo49607a(new Status(15003), Bundle.EMPTY);
                        return;
                    }
                }
            }
        } else {
            accountInfo = null;
            cardInfo = null;
            bArr2 = null;
            str3 = null;
            bArr = null;
            str2 = null;
            z4 = false;
            z3 = false;
            z2 = false;
            z = false;
        }
        this.f90414d.mo49607a(new Status(6, null, atrq.m76258a(context2, atrq.m76260a(str, accountInfo, cardInfo, bArr2, z4, str3, null, bArr, z3, z2, z, z5, str2))), Bundle.EMPTY);
    }
}
