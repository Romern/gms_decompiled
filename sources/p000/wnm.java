package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnm extends whz {

    /* renamed from: b */
    private final wgh f50973b;

    /* renamed from: c */
    private final String f50974c;

    /* renamed from: d */
    private final awkh f50975d;

    /* renamed from: e */
    private final WalletCustomTheme f50976e;

    /* renamed from: f */
    private final wgj f50977f;

    /* renamed from: g */
    private final String f50978g;

    /* renamed from: h */
    private final int f50979h;

    public wnm(Context context, String str, wgh wgh, awkh awkh, WalletCustomTheme walletCustomTheme, wgj wgj, String str2, int i) {
        super(context);
        this.f50974c = str;
        this.f50975d = awkh;
        this.f50976e = walletCustomTheme;
        this.f50977f = wgj;
        this.f50973b = wgh;
        this.f50978g = str2;
        this.f50979h = i;
    }

    /* renamed from: a */
    public final why loadInBackground() {
        try {
            byte[] bArr = (byte[]) aucu.m76783a(this.f50975d.mo52198a(new GetClientTokenRequest(this.f50976e)), 2, TimeUnit.SECONDS);
            bxvd da = braz.f142213f.mo74144da();
            brak a = wgy.m41937a(getContext(), this.f50977f, this.f50973b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            braz braz = (braz) da.f164949b;
            a.getClass();
            braz.f142216b = a;
            braz.f142215a |= 1;
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            braz braz2 = (braz) da.f164949b;
            a2.getClass();
            int i = braz2.f142215a | 8;
            braz2.f142215a = i;
            braz2.f142219e = a2;
            String str = this.f50978g;
            if (str != null) {
                str.getClass();
                i |= 4;
                braz2.f142215a = i;
                braz2.f142218d = str;
            }
            int i2 = this.f50979h;
            if (i2 != 0) {
                braz2.f142217c = i2 - 1;
                braz2.f142215a = i | 2;
            }
            try {
                wih a3 = whc.m41943a();
                ClientContext a4 = whc.m41942a(this.f50974c);
                braz braz3 = (braz) da.mo74062i();
                if (wih.f50714f == null) {
                    wih.f50714f = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CanUpgradeFamily", ciie.m150370a(braz.f142213f), ciie.m150370a(brbb.f142221g));
                }
                brbb brbb = (brbb) a3.f50732a.mo25553a(wih.f50714f, a4, braz3, (long) wih.f50710b, TimeUnit.MILLISECONDS);
                wgj wgj = this.f50977f;
                bral bral = brbb.f142223a;
                if (bral == null) {
                    bral = bral.f142158c;
                }
                wgy.m41938a(wgj, bral);
                return new why(true, brbb);
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
