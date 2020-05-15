package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveTokensForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenInfo;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveTokensForAccountRequest;
import java.util.ArrayList;

/* renamed from: atit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atit extends atki {
    public atit(GetActiveTokensForAccountRequest getActiveTokensForAccountRequest, String str, aswm aswm) {
        super("GetActiveTokensTokensForAccount", getActiveTokensForAccountRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49609a(status, (GetActiveTokensForAccountResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        Uri uri;
        boolean z;
        atdz atdz = atds.m75666a(askg.m74284b(((GetActiveTokensForAccountRequest) this.f90410b).f108538a, context, this.f90413c)).f90151a;
        ArrayList arrayList = new ArrayList();
        for (atdt atdt : atdz.mo49870a(atdz.mo49886d())) {
            if (atdt.mo49864b() == 5) {
                btjk btjk = atdt.f90155a;
                boolean a = atdt.mo49863a();
                int b = atdt.mo49864b();
                OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = new OnlineAccountCardLinkInfo[btjk.f149146x.size()];
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i >= btjk.f149146x.size()) {
                        break;
                    }
                    asog asog = new asog();
                    int a2 = btji.m116838a(((btjj) btjk.f149146x.get(i)).f149117a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    asog.f89308a = atyj.m76567d(a2);
                    int a3 = btjh.m116837a(((btjj) btjk.f149146x.get(i)).f149118b);
                    if (a3 != 0) {
                        i2 = a3;
                    }
                    asog.f89309b = atyj.m76568e(i2);
                    onlineAccountCardLinkInfoArr[i] = asog.mo49284a();
                    i++;
                }
                asov asov = new asov();
                btiy btiy = btjk.f149123a;
                if (btiy == null) {
                    btiy = btiy.f149054c;
                }
                asov.f89320a = btiy.f149056a;
                asov.f89321b = btjk.f149129g;
                int a4 = btjl.m116841a(btjk.f149127e);
                if (a4 == 0) {
                    a4 = 1;
                }
                asov.f89322c = atyj.m76565b(a4);
                asoz asoz = new asoz();
                asox asox = new asox();
                btof a5 = btof.m116979a(btjk.f149135m);
                if (a5 == null) {
                    a5 = btof.UNRECOGNIZED;
                }
                asox.f89330b = atyj.m76559a(a5);
                asoz.f89331a = asox.mo49311a();
                asoz.f89333c = a;
                asoz.f89332b = b;
                asov.f89323d = asoz.mo49314a();
                asov.f89324e = btjk.f149128f;
                if (!bmxx.m108577a(btjk.f149131i)) {
                    uri = Uri.parse(btjk.f149131i);
                } else {
                    uri = null;
                }
                asov.f89325f = uri;
                asov.f89326g = btjk.f149142t.mo73780k();
                asov.f89327h = onlineAccountCardLinkInfoArr;
                int a6 = btog.m116982a(btjk.f149145w);
                if (a6 == 0) {
                    a6 = 1;
                }
                asov.f89328i = atyj.m76566c(a6);
                int a7 = btjl.m116841a(btjk.f149127e);
                if (a7 == 0) {
                    a7 = 1;
                }
                int i3 = a7 - 2;
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new TokenInfo(asov.f89320a, asov.f89321b, asov.f89322c, asov.f89323d, asov.f89324e, asov.f89325f, asov.f89326g, asov.f89327h, asov.f89328i, z));
            }
        }
        this.f90414d.mo49609a(Status.f30107a, new GetActiveTokensForAccountResponse((TokenInfo[]) arrayList.toArray(new TokenInfo[0])));
    }
}
