package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmp extends whz {

    /* renamed from: b */
    private final wgh f50904b;

    /* renamed from: c */
    private final String f50905c;

    /* renamed from: d */
    private final awkh f50906d;

    /* renamed from: e */
    private final WalletCustomTheme f50907e;

    /* renamed from: f */
    private final wgj f50908f;

    /* renamed from: g */
    private final String f50909g;

    /* renamed from: h */
    private final int f50910h;

    public wmp(Context context, String str, wgh wgh, awkh awkh, WalletCustomTheme walletCustomTheme, wgj wgj, String str2, int i) {
        super(context);
        this.f50905c = str;
        this.f50906d = awkh;
        this.f50907e = walletCustomTheme;
        this.f50908f = wgj;
        this.f50904b = wgh;
        this.f50909g = str2;
        this.f50910h = i;
    }

    /* renamed from: a */
    public final why loadInBackground() {
        try {
            byte[] bArr = (byte[]) aucu.m76783a(this.f50906d.mo52198a(new GetClientTokenRequest(this.f50907e)), 2, TimeUnit.SECONDS);
            bxvd da = brdf.f142500f.mo74144da();
            brak a = wgy.m41937a(getContext(), this.f50908f, this.f50904b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdf brdf = (brdf) da.f164949b;
            a.getClass();
            brdf.f142503b = a;
            brdf.f142502a |= 1;
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdf brdf2 = (brdf) da.f164949b;
            encodeToString.getClass();
            int i = brdf2.f142502a | 8;
            brdf2.f142502a = i;
            brdf2.f142506e = encodeToString;
            String str = this.f50909g;
            if (str != null) {
                str.getClass();
                i |= 4;
                brdf2.f142502a = i;
                brdf2.f142505d = str;
            }
            int i2 = this.f50910h;
            if (i2 != 0) {
                brdf2.f142504c = i2 - 1;
                brdf2.f142502a = i | 2;
            }
            try {
                wih a2 = whc.m41943a();
                ClientContext a3 = whc.m41942a(this.f50905c);
                brdf brdf3 = (brdf) da.mo74062i();
                if (wih.f50715g == null) {
                    wih.f50715g = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyUpgradeParams", ciie.m150370a(brdf.f142500f), ciie.m150370a(brdg.f142507d));
                }
                brdg brdg = (brdg) a2.f50732a.mo25553a(wih.f50715g, a3, brdf3, (long) wih.f50710b, TimeUnit.MILLISECONDS);
                wgj wgj = this.f50908f;
                bral bral = brdg.f142509a;
                if (bral == null) {
                    bral = bral.f142158c;
                }
                wgy.m41938a(wgj, bral);
                return new why(true, brdg);
            } catch (chuw | gid e) {
                sbw sbw = wgn.f50624a;
                return new why(false, null);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            sbw sbw2 = wgn.f50624a;
            return new why(false, null);
        }
    }
}
