package p000;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.List;

/* renamed from: brnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brnw implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpu f143045a;

    /* renamed from: b */
    final /* synthetic */ String f143046b;

    /* renamed from: c */
    final /* synthetic */ String f143047c;

    /* renamed from: d */
    final /* synthetic */ Boolean f143048d;

    /* renamed from: e */
    final /* synthetic */ DefaultOAuthCredential f143049e;

    /* renamed from: f */
    final /* synthetic */ brpj f143050f;

    /* renamed from: g */
    final /* synthetic */ GetTokenResponse f143051g;

    public brnw(brpu brpu, String str, String str2, Boolean bool, DefaultOAuthCredential defaultOAuthCredential, brpj brpj, GetTokenResponse getTokenResponse) {
        this.f143045a = brpu;
        this.f143046b = str;
        this.f143047c = str2;
        this.f143048d = bool;
        this.f143049e = defaultOAuthCredential;
        this.f143050f = brpj;
        this.f143051g = getTokenResponse;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        List list;
        List b = ((GetAccountInfoResponse) obj).mo72410b();
        if (b == null || b.isEmpty()) {
            this.f143045a.mo69750a("No users.");
            return;
        }
        int i = 0;
        GetAccountInfoUser getAccountInfoUser = (GetAccountInfoUser) b.get(0);
        ProviderUserInfoList providerUserInfoList = getAccountInfoUser.f152517f;
        if (providerUserInfoList != null) {
            list = providerUserInfoList.f152543a;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (TextUtils.isEmpty(this.f143046b)) {
                ((ProviderUserInfo) list.get(0)).f152540e = this.f143047c;
            } else {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (((ProviderUserInfo) list.get(i)).f152539d.equals(this.f143046b)) {
                        ((ProviderUserInfo) list.get(i)).f152540e = this.f143047c;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        getAccountInfoUser.f152522k = this.f143048d.booleanValue();
        getAccountInfoUser.f152523l = this.f143049e;
        this.f143050f.mo69761a(this.f143051g, getAccountInfoUser);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143045a.mo69750a(str);
    }
}
