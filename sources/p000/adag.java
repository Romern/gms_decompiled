package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.api.Scope;
import java.util.UUID;

/* renamed from: adag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adag {

    /* renamed from: a */
    public static final bnic f61199a = bnic.m109491a(new Scope("email"), new Scope("profile"), new Scope("openid"));

    /* renamed from: b */
    public static final bnic f61200b;

    /* renamed from: c */
    public final bxvd f61201c = bsoa.f146351k.mo74144da();

    /* renamed from: d */
    private final TokenRequest f61202d;

    /* renamed from: e */
    private final Bundle f61203e = new Bundle();

    static {
        bnia j = bnic.m109500j();
        j.mo67752b((Iterable) f61199a);
        j.mo67629b(new Scope("https://www.googleapis.com/auth/userinfo.email"));
        j.mo67629b(new Scope("https://www.googleapis.com/auth/userinfo.profile"));
        f61200b = j.mo67751a();
    }

    private adag(Account account, String str) {
        this.f61202d = new TokenRequest(account, str);
    }

    /* renamed from: a */
    public static adag m50068a(Account account, Iterable iterable) {
        String valueOf = String.valueOf(TextUtils.join(" ", bnfi.m109235a(iterable).mo67501a(adae.f61197a).mo67503a(bnnt.f131877a)));
        return new adag(account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo33289b(String str) {
        bxvd bxvd = this.f61201c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsoa bsoa = (bsoa) bxvd.f164949b;
        bsoa bsoa2 = bsoa.f146351k;
        str.getClass();
        bsoa.f146353a |= 1024;
        bsoa.f146362j = str;
    }

    /* renamed from: a */
    public static adag m50069a(Account account, String str) {
        String valueOf = String.valueOf(str);
        return new adag(account, valueOf.length() == 0 ? new String("audience:server:client_id:") : "audience:server:client_id:".concat(valueOf));
    }

    /* renamed from: a */
    public static adag m50070a(Account account, String str, Iterable iterable) {
        return new adag(account, "oauth2:server:client_id:" + str + ":api_scope:" + TextUtils.join(" ", bnfi.m109235a(iterable).mo67501a(adaf.f61198a).mo67503a(bnnt.f131877a)));
    }

    /* renamed from: b */
    public final void mo33290b(boolean z) {
        if (!z) {
            this.f61203e.putString("oauth2_include_profile", "0");
        } else {
            this.f61203e.putString("oauth2_include_profile", "1");
        }
    }

    /* renamed from: a */
    public final TokenRequest mo33282a() {
        sdo.checkIfNull(this.f61202d.f10714j, "consumer should be set");
        int a = bsnw.m116023a(((bsoa) this.f61201c.f164949b).f146361i);
        boolean z = false;
        if (!(a == 0 || a == 1)) {
            z = true;
        }
        sdo.m34975b(z, "apiSurface should be set");
        this.f61203e.putBoolean("suppressProgressScreen", true);
        this.f61203e.putString("clientPackageName", "com.google.android.gms");
        Bundle bundle = this.f61203e;
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("keyTokenRequestOptionsWrapperBundle", ((bsoa) this.f61201c.mo74062i()).serializeToBytes());
        bundle.putBundle("keyTokenRequestOptionsAuthExtrasBundle", bundle2);
        TokenRequest tokenRequest = this.f61202d;
        tokenRequest.mo7638a(this.f61203e);
        tokenRequest.f10710f = new PACLConfig("", null);
        return tokenRequest;
    }

    /* renamed from: a */
    public final void mo33283a(int i) {
        bxvd bxvd = this.f61201c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsoa bsoa = (bsoa) bxvd.f164949b;
        bsoa bsoa2 = bsoa.f146351k;
        bsoa.f146361i = i - 1;
        bsoa.f146353a |= 512;
    }

    /* renamed from: a */
    public final void mo33284a(int i, int i2) {
        bxvd bxvd = this.f61201c;
        int a = bsoc.m116029a(i);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsoa bsoa = (bsoa) bxvd.f164949b;
        int i3 = a - 1;
        bsoa bsoa2 = bsoa.f146351k;
        if (a != 0) {
            bsoa.f146357e = i3;
            bsoa.f146353a |= 8;
            bxvd bxvd2 = this.f61201c;
            int a2 = bsoe.m116031a(i2);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bsoa bsoa3 = (bsoa) bxvd2.f164949b;
            int i4 = a2 - 1;
            if (a2 != 0) {
                bsoa3.f146358f = i4;
                bsoa3.f146353a |= 16;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo33285a(iyb iyb) {
        this.f61202d.mo7639a(iyb);
    }

    /* renamed from: a */
    public final void mo33286a(String str) {
        this.f61203e.putString("oauth2_prompt", str);
    }

    /* renamed from: a */
    public final void mo33287a(String str, int i) {
        this.f61203e.putString(gie.f18286b, str);
        this.f61203e.putInt(gie.f18285a, i);
        String uuid = UUID.randomUUID().toString();
        this.f61202d.f10714j = new AppDescription(str, i, uuid, uuid);
    }

    /* renamed from: a */
    public final void mo33288a(boolean z) {
        if (!z) {
            this.f61203e.putString("oauth2_include_email", "0");
        } else {
            this.f61203e.putString("oauth2_include_email", "1");
        }
    }
}
