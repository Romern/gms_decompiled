package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnl extends whz {

    /* renamed from: b */
    private final String f50967b;

    /* renamed from: c */
    private final awkh f50968c;

    /* renamed from: d */
    private final WalletCustomTheme f50969d;

    /* renamed from: e */
    private final wgj f50970e;

    /* renamed from: f */
    private final wgh f50971f;

    /* renamed from: g */
    private final brcm f50972g;

    public wnl(Context context, String str, wgh wgh, awkh awkh, WalletCustomTheme walletCustomTheme, wgj wgj, brcm brcm) {
        super(context);
        this.f50967b = str;
        this.f50968c = awkh;
        this.f50969d = walletCustomTheme;
        this.f50970e = wgj;
        this.f50971f = wgh;
        this.f50972g = brcm;
    }

    /* renamed from: a */
    public final why loadInBackground() {
        try {
            byte[] bArr = (byte[]) aucu.m76783a(this.f50968c.mo52198a(new GetClientTokenRequest(this.f50969d)), 2, TimeUnit.SECONDS);
            bxvd da = brar.f142175e.mo74144da();
            brak a = wgy.m41937a(getContext(), this.f50970e, this.f50971f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brar brar = (brar) da.f164949b;
            a.getClass();
            brar.f142178b = a;
            brar.f142177a |= 1;
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brar brar2 = (brar) da.f164949b;
            a2.getClass();
            int i = brar2.f142177a | 4;
            brar2.f142177a = i;
            brar2.f142180d = a2;
            brcm brcm = this.f50972g;
            if (brcm != null) {
                brar2.f142179c = brcm.f142395g;
                brar2.f142177a = i | 2;
            }
            try {
                wih a3 = whc.m41943a();
                ClientContext a4 = whc.m41942a(this.f50967b);
                brar brar3 = (brar) da.mo74062i();
                if (wih.f50716h == null) {
                    wih.f50716h = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CanAddMember", ciie.m150370a(brar.f142175e), ciie.m150370a(brat.f142182e));
                }
                return new why(true, (brat) a3.f50732a.mo25553a(wih.f50716h, a4, brar3, (long) wih.f50710b, TimeUnit.MILLISECONDS));
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
