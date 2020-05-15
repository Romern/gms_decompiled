package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmj extends whz {

    /* renamed from: b */
    private final wgh f50878b;

    /* renamed from: c */
    private final String f50879c;

    /* renamed from: d */
    private final wgj f50880d;

    public wmj(Context context, String str, wgh wgh, wgj wgj) {
        super(context);
        this.f50879c = str;
        this.f50880d = wgj;
        this.f50878b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brau.f142188c.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50880d, this.f50878b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brau brau = (brau) da.f164949b;
        a.getClass();
        brau.f142191b = a;
        brau.f142190a |= 1;
        brau brau2 = (brau) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50879c);
            if (wih.f50711c == null) {
                wih.f50711c = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CanCreateFamily", ciie.m150370a(brau.f142188c), ciie.m150370a(braw.f142193g));
            }
            braw braw = (braw) a2.f50732a.mo25553a(wih.f50711c, a3, brau2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            String valueOf = String.valueOf(braw);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Can Create Family response: ");
            sb.append(valueOf);
            sb.toString();
            sbw sbw = wgn.f50624a;
            wgj wgj = this.f50880d;
            bral bral = braw.f142196b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, braw);
        } catch (chuw | gid e) {
            sbw sbw2 = wgn.f50624a;
            return new why(false, null);
        }
    }
}
