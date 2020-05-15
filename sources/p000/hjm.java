package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: hjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hjm implements hep {

    /* renamed from: a */
    private static final sek f19896a = ght.m13172b("CompleteSaveAccountLinkingTokenOperation");

    /* renamed from: b */
    private static final bnhe f19897b;

    /* renamed from: c */
    private final String f19898c;

    /* renamed from: d */
    private final Account f19899d;

    /* renamed from: e */
    private final SaveAccountLinkingTokenRequest f19900e;

    /* renamed from: f */
    private final String f19901f;

    /* renamed from: g */
    private final Context f19902g;

    /* renamed from: h */
    private final bmzi f19903h;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("auth_code", bsjn.OAUTH2_ACCESS_TOKEN);
        f19897b = h.mo67618b();
    }

    public hjm(Context context, String str, Account account, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str2) {
        sdo.m34959a(context);
        this.f19902g = context.getApplicationContext();
        sdo.m34977c(str);
        this.f19898c = str;
        sdo.m34959a(account);
        this.f19899d = account;
        sdo.m34959a(saveAccountLinkingTokenRequest);
        this.f19900e = saveAccountLinkingTokenRequest;
        sdo.m34977c(str2);
        this.f19901f = str2;
        this.f19903h = new hjl(context);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SAVE_ACCOUNT_LINKING_TOKEN;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bsjn bsjn = (bsjn) f19897b.get(this.f19900e.f10240b);
        String valueOf = String.valueOf(this.f19900e.f10240b);
        sdo.m34966a(bsjn, valueOf.length() == 0 ? new String("Invalid type for token: ") : "Invalid type for token: ".concat(valueOf));
        try {
            String b = spn.m35867b(rpr.m34216b(), this.f19898c, "SHA1");
            if (b != null) {
                bxvd da = bsjt.f144845c.mo74144da();
                bxvd da2 = bsjo.f144827c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsjo bsjo = (bsjo) da2.f164949b;
                b.getClass();
                bsjo.f144830b = b;
                String str = this.f19898c;
                str.getClass();
                bsjo.f144829a = str;
                bsjo bsjo2 = (bsjo) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsjt bsjt = (bsjt) da.f164949b;
                bsjo2.getClass();
                bsjt.f144848b = bsjo2;
                bsjt.f144847a = 1;
                bsjt bsjt2 = (bsjt) da.mo74062i();
                bxvd da3 = bsjq.f144834d.mo74144da();
                bxvd da4 = bsjp.f144831b.mo74144da();
                String str2 = this.f19901f;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                str2.getClass();
                ((bsjp) da4.f164949b).f144833a = str2;
                bsjp bsjp = (bsjp) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsjp.getClass();
                ((bsjq) da3.f164949b).f144838c = bsjp;
                bxvd da5 = bsjs.f144842b.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bsjt2.getClass();
                ((bsjs) da5.f164949b).f144844a = bsjt2;
                bsjs bsjs = (bsjs) da5.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsjs.getClass();
                ((bsjq) da3.f164949b).f144836a = bsjs;
                bxvd da6 = bsjr.f144839b.mo74144da();
                String str3 = this.f19900e.f10241c;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                str3.getClass();
                ((bsjr) da6.f164949b).f144841a = str3;
                bsjr bsjr = (bsjr) da6.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsjr.getClass();
                ((bsjq) da3.f164949b).f144837b = bsjr;
                bsjq bsjq = (bsjq) da3.mo74062i();
                hjk hjk = (hjk) this.f19903h.mo6606a();
                int i = this.f19902g.getApplicationInfo().uid;
                Account account = this.f19899d;
                String packageName = this.f19902g.getPackageName();
                ClientContext clientContext = new ClientContext(i, account, account, packageName, packageName);
                clientContext.mo17806d("https://www.googleapis.com/auth/oauth_integrations");
                if (hjk.f19893b == null) {
                    hjk.f19893b = chtv.m149566a(chtu.UNARY, "google.internal.identity.accountlinking.v1.AccountLinkingService/CreateLink", ciie.m150370a(bsjq.f144834d), ciie.m150370a(bsjr.f144839b));
                }
                bsjr bsjr2 = (bsjr) hjk.f19894a.mo25553a(hjk.f19893b, clientContext, bsjq, 10000, TimeUnit.MILLISECONDS);
                return bqga.m112775a((Object) null);
            }
            throw adbe.m50106a(28442);
        } catch (PackageManager.NameNotFoundException e) {
            throw adbe.m50106a(28442);
        } catch (gid e2) {
            f19896a.mo25417e("Failed to save token", e2, new Object[0]);
            throw adbe.m50106a(23002);
        } catch (chuw e3) {
            f19896a.mo25417e("Failed to save token", e3, new Object[0]);
            chuv chuv = e3.f189236a;
            if (chuv != null) {
                chus chus = chuv.f189233s;
                if (chus == chus.DEADLINE_EXCEEDED || chus == chus.UNAVAILABLE) {
                    throw adbe.m50106a(7);
                }
                throw adbe.m50106a(8);
            }
        }
    }
}
