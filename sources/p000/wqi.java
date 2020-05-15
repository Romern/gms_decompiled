package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqi extends whz {

    /* renamed from: b */
    private final String f51147b;

    /* renamed from: c */
    private final wgj f51148c;

    /* renamed from: d */
    private final wgh f51149d;

    /* renamed from: e */
    private final String f51150e;

    /* renamed from: f */
    private final brcm f51151f;

    public wqi(Context context, String str, wgh wgh, wgj wgj, String str2, brcm brcm) {
        super(context);
        this.f51147b = str;
        this.f51149d = wgh;
        this.f51148c = wgj;
        this.f51150e = str2;
        this.f51151f = brcm;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brem.f142677f.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51148c, this.f51149d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brem brem = (brem) da.f164949b;
        a.getClass();
        brem.f142680b = a;
        int i = brem.f142679a | 1;
        brem.f142679a = i;
        int i2 = i | 8;
        brem.f142679a = i2;
        brem.f142683e = true;
        brcm brcm = this.f51151f;
        if (brcm != null) {
            brem.f142682d = brcm.f142395g;
            i2 |= 4;
            brem.f142679a = i2;
        }
        String str = this.f51150e;
        if (str != null) {
            str.getClass();
            brem.f142679a = i2 | 2;
            brem.f142681c = str;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51147b);
            brem brem2 = (brem) da.mo74062i();
            if (wih.f50721m == null) {
                wih.f50721m = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/UpdateMemberRole", ciie.m150370a(brem.f142677f), ciie.m150370a(bren.f142684b));
            }
            bren bren = (bren) a2.f50732a.mo25553a(wih.f50721m, a3, brem2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f51148c;
            bral bral = bren.f142686a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, bren);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
