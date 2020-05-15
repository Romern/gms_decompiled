package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;

/* renamed from: hjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hjn implements hep {

    /* renamed from: a */
    private final Context f19904a;

    /* renamed from: b */
    private final String f19905b;

    /* renamed from: c */
    private final BeginSignInRequest f19906c;

    /* renamed from: d */
    private final InternalSignInCredentialWrapper f19907d;

    public hjn(Context context, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        sdo.m34959a(context);
        this.f19904a = context;
        sdo.m34977c(str);
        this.f19905b = str;
        sdo.m34959a(beginSignInRequest);
        this.f19906c = beginSignInRequest;
        sdo.m34959a(internalSignInCredentialWrapper);
        this.f19907d = internalSignInCredentialWrapper;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SIGN_IN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        boolean z;
        boolean z2;
        String str;
        TokenResponse a;
        TokenData tokenData;
        if (!TextUtils.isEmpty(this.f19907d.f10233g.f10253f)) {
            return bqga.m112775a(new CompleteSignInResult(this.f19907d.f10233g));
        }
        int i = spn.m35897i(this.f19904a, this.f19905b);
        if (i != -1) {
            ixl a2 = aczw.m50063a(this.f19904a);
            if (this.f19907d.mo7477a()) {
                InternalSignInCredentialWrapper internalSignInCredentialWrapper = this.f19907d;
                if (!internalSignInCredentialWrapper.f10234h.contains(InternalSignInCredentialWrapper.f10230d)) {
                    z = internalSignInCredentialWrapper.f10234h.contains(InternalSignInCredentialWrapper.f10227a);
                    if (this.f19907d.mo7477a()) {
                        InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = this.f19907d;
                        if (!internalSignInCredentialWrapper2.f10235i && !internalSignInCredentialWrapper2.f10234h.contains(InternalSignInCredentialWrapper.f10231e)) {
                            z2 = internalSignInCredentialWrapper2.f10234h.contains(InternalSignInCredentialWrapper.f10228b);
                            Account account = this.f19907d.f10232f;
                            String str2 = this.f19906c.f10213b.f10217b;
                            sdo.m34959a((Object) str2);
                            str = this.f19906c.f10213b.f10218c;
                            adag a3 = adag.m50069a(account, str2);
                            if (str != null) {
                                bxvd bxvd = a3.f61201c;
                                bxvd da = bsny.f146346c.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bsny bsny = (bsny) da.f164949b;
                                str.getClass();
                                bsny.f146348a = 1 | bsny.f146348a;
                                bsny.f146349b = str;
                                bsny bsny2 = (bsny) da.mo74062i();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bsoa bsoa = (bsoa) bxvd.f164949b;
                                bsoa bsoa2 = bsoa.f146351k;
                                bsny2.getClass();
                                bsoa.f146360h = bsny2;
                                bsoa.f146353a |= 128;
                            }
                            a3.mo33283a(5);
                            a3.mo33285a(iyb.GRANTED);
                            a3.mo33287a(this.f19905b, i);
                            a3.mo33288a(z2);
                            a3.mo33290b(z);
                            a = a2.mo13425a(a3.mo33282a());
                            if (izj.SUCCESS.equals(a.mo7647b()) || (tokenData = a.f10746w) == null) {
                                adbd a4 = adbe.m50105a();
                                a4.f61234c = 28404;
                                a4.f61232a = "Failed to retrieve an ID token";
                                throw a4.mo33301a();
                            }
                            sdo.m34959a(tokenData);
                            String str3 = tokenData.f9944b;
                            bmxv a5 = adad.m50067a(str3);
                            if (a5.mo66813a()) {
                                adac adac = (adac) a5.mo66814b();
                                return bqga.m112775a(new CompleteSignInResult(new SignInCredential(z2 ? (String) adac.f61194e.mo66812a("Anonymous google account") : adac.f61190a, (String) adac.f61191b.mo66815c(), (String) adac.f61192c.mo66815c(), (String) adac.f61193d.mo66815c(), (Uri) adac.f61195f.mo66815c(), null, str3)));
                            }
                            throw adbe.m50108a("Parsing the ID token failed", 8);
                        }
                    }
                    z2 = true;
                    Account account2 = this.f19907d.f10232f;
                    String str22 = this.f19906c.f10213b.f10217b;
                    sdo.m34959a((Object) str22);
                    str = this.f19906c.f10213b.f10218c;
                    adag a32 = adag.m50069a(account2, str22);
                    if (str != null) {
                    }
                    a32.mo33283a(5);
                    a32.mo33285a(iyb.GRANTED);
                    a32.mo33287a(this.f19905b, i);
                    a32.mo33288a(z2);
                    a32.mo33290b(z);
                    a = a2.mo13425a(a32.mo33282a());
                    if (izj.SUCCESS.equals(a.mo7647b())) {
                    }
                    adbd a42 = adbe.m50105a();
                    a42.f61234c = 28404;
                    a42.f61232a = "Failed to retrieve an ID token";
                    throw a42.mo33301a();
                }
            }
            z = true;
            if (this.f19907d.mo7477a()) {
            }
            z2 = true;
            Account account22 = this.f19907d.f10232f;
            String str222 = this.f19906c.f10213b.f10217b;
            sdo.m34959a((Object) str222);
            str = this.f19906c.f10213b.f10218c;
            adag a322 = adag.m50069a(account22, str222);
            if (str != null) {
            }
            a322.mo33283a(5);
            a322.mo33285a(iyb.GRANTED);
            a322.mo33287a(this.f19905b, i);
            a322.mo33288a(z2);
            a322.mo33290b(z);
            a = a2.mo13425a(a322.mo33282a());
            if (izj.SUCCESS.equals(a.mo7647b())) {
            }
            adbd a422 = adbe.m50105a();
            a422.f61234c = 28404;
            a422.f61232a = "Failed to retrieve an ID token";
            throw a422.mo33301a();
        }
        throw adbe.m50106a(28442);
    }
}
