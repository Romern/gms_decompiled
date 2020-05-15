package p000;

import android.text.TextUtils;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: brnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brnv implements brpv {

    /* renamed from: a */
    final /* synthetic */ brra f143040a;

    /* renamed from: b */
    final /* synthetic */ GetAccountInfoUser f143041b;

    /* renamed from: c */
    final /* synthetic */ brpj f143042c;

    /* renamed from: d */
    final /* synthetic */ GetTokenResponse f143043d;

    /* renamed from: e */
    final /* synthetic */ brpu f143044e;

    public brnv(brra brra, GetAccountInfoUser getAccountInfoUser, brpj brpj, GetTokenResponse getTokenResponse, brpu brpu) {
        this.f143040a = brra;
        this.f143041b = getAccountInfoUser;
        this.f143042c = brpj;
        this.f143043d = getTokenResponse;
        this.f143044e = brpu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrb brrb = (brrb) obj;
        List list = null;
        if (!this.f143040a.mo69810a("EMAIL")) {
            String str = this.f143040a.f143203a;
            if (str != null) {
                this.f143041b.f152513b = str;
            }
        } else {
            this.f143041b.f152513b = null;
        }
        if (!this.f143040a.mo69810a("DISPLAY_NAME")) {
            String str2 = this.f143040a.f143205c;
            if (str2 != null) {
                this.f143041b.f152515d = str2;
            }
        } else {
            this.f143041b.f152515d = null;
        }
        if (!this.f143040a.mo69810a("PHOTO_URL")) {
            String str3 = this.f143040a.f143206d;
            if (str3 != null) {
                this.f143041b.f152516e = str3;
            }
        } else {
            this.f143041b.f152516e = null;
        }
        if (!TextUtils.isEmpty(this.f143040a.f143204b)) {
            GetAccountInfoUser getAccountInfoUser = this.f143041b;
            String b = sqd.m35968b("redacted".getBytes());
            sdo.m34977c(b);
            getAccountInfoUser.f152518g = b;
        }
        ProviderUserInfoList providerUserInfoList = brrb.f143213b;
        if (providerUserInfoList != null) {
            list = providerUserInfoList.f152543a;
        }
        if (list == null) {
            list = new ArrayList();
        }
        GetAccountInfoUser getAccountInfoUser2 = this.f143041b;
        sdo.m34959a(list);
        getAccountInfoUser2.f152517f = new ProviderUserInfoList();
        getAccountInfoUser2.f152517f.f152543a.addAll(list);
        brpj brpj = this.f143042c;
        GetTokenResponse getTokenResponse = this.f143043d;
        sdo.m34959a(getTokenResponse);
        sdo.m34959a(brrb);
        String str4 = brrb.f143214c;
        String str5 = brrb.f143215d;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            getTokenResponse = new GetTokenResponse(str5, str4, Long.valueOf(brrb.f143216e), getTokenResponse.f152529d);
        }
        brpj.mo69761a(getTokenResponse, this.f143041b);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143044e.mo69750a(str);
    }
}
