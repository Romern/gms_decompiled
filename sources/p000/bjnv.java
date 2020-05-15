package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.security.SecureRandom;

/* renamed from: bjnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnv extends bjhy {

    /* renamed from: p */
    boolean f123035p;

    /* renamed from: q */
    bwpo f123036q;

    /* renamed from: r */
    final SecureRandom f123037r = bjrt.f123193a;

    public bjnv(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        bwdv bwdv;
        this.f123035p = false;
        if (i == 5478) {
            int a = bjfd.mo65080a();
            if (a == 0) {
                RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = (RetrieveInAppPaymentCredentialResponse) bjfd.f122613a.getParcelableExtra("retrieveInAppPaymentCredentialResponse");
                if (retrieveInAppPaymentCredentialResponse == null) {
                    bwdv = bwdv.f158938i;
                } else {
                    bxvd da = bwdv.f158938i.mo74144da();
                    String str = retrieveInAppPaymentCredentialResponse.f108425a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwdv bwdv2 = (bwdv) da.f164949b;
                    str.getClass();
                    bwdv2.f158940a |= 1;
                    bwdv2.f158941b = str;
                    byte[] bArr = retrieveInAppPaymentCredentialResponse.f108426b;
                    if (bArr != null) {
                        String encodeToString = Base64.encodeToString(bArr, 2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwdv bwdv3 = (bwdv) da.f164949b;
                        encodeToString.getClass();
                        int i2 = 2 | bwdv3.f158940a;
                        bwdv3.f158940a = i2;
                        bwdv3.f158942c = encodeToString;
                        bwdv3.f158947h = 1;
                        bwdv3.f158940a = i2 | 64;
                    }
                    int i3 = retrieveInAppPaymentCredentialResponse.f108427c;
                    bwdv bwdv4 = (bwdv) da.f164949b;
                    int i4 = bwdv4.f158940a | 4;
                    bwdv4.f158940a = i4;
                    bwdv4.f158943d = i3;
                    int i5 = retrieveInAppPaymentCredentialResponse.f108428d;
                    bwdv4.f158940a = i4 | 8;
                    bwdv4.f158944e = i5;
                    if (!TextUtils.isEmpty(retrieveInAppPaymentCredentialResponse.f108429e)) {
                        String str2 = retrieveInAppPaymentCredentialResponse.f108429e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwdv bwdv5 = (bwdv) da.f164949b;
                        str2.getClass();
                        bwdv5.f158940a |= 16;
                        bwdv5.f158945f = str2;
                    }
                    if (!TextUtils.isEmpty(retrieveInAppPaymentCredentialResponse.f108430f)) {
                        String str3 = retrieveInAppPaymentCredentialResponse.f108430f;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwdv bwdv6 = (bwdv) da.f164949b;
                        str3.getClass();
                        bwdv6.f158940a |= 32;
                        bwdv6.f158946g = str3;
                    }
                    bwdv = (bwdv) da.mo74062i();
                }
                bjnw bjnw = (bjnw) ((bjhy) this).f122754m;
                bjnw.f123038d = bwdv;
                bjnw.mo65244a((bjgf) null);
                mo65255r();
            } else if (a != 1) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjnw bjnw = (bjnw) ((bjhy) this).f122754m;
        return bjnw == null ? new bjnw() : bjnw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f123035p) {
            this.f123035p = true;
            WidgetConfig widgetConfig = this.f122639a.f122692a.f122724a;
            bwpo bwpo = this.f123036q;
            long nextLong = this.f123037r.nextLong();
            Intent a = bjfc.m103290a("TapAndPayVerification", widgetConfig);
            String a2 = widgetConfig.mo71762a();
            bwpn bwpn = bwpo.f160587c;
            if (bwpn == null) {
                bwpn = bwpn.f160575e;
            }
            aspb aspb = new aspb();
            aspb.f89334a = nextLong;
            aspb.f89338e = bngx.m109356a((Object) 1);
            aspb.f89335b = bwpn.f160579c;
            aspb.f89339f = bwpn.f160580d;
            aspb.f89337d = bwpn.f160577a;
            aspb.f89336c = bwpn.f160578b;
            asom asom = new asom();
            asom.f89311a = a2;
            asom.f89312b = bwpo.f160585a;
            asom.f89313c = aspb.mo49317a();
            asom.f89315e = bwpo.f160588d;
            asom.f89314d = new byte[0];
            a.putExtra("retrieveInAppPaymentCredentialRequest", asom.mo49293a());
            a.putExtra("skipLockScreen", bwpo.f160586b);
            mo65128n().mo65084a(5478, new bjfc(a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isWaitingForResult", this.f123035p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f123035p = bundle.getBoolean("isWaitingForResult", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwpo.f160583f;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123036q = (bwpo) b;
    }
}
