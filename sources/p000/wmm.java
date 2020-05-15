package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmm extends whz {

    /* renamed from: b */
    private final brcm f50889b;

    /* renamed from: c */
    private final wgh f50890c;

    /* renamed from: d */
    private final boolean f50891d;

    /* renamed from: e */
    private final String f50892e;

    /* renamed from: f */
    private final wgj f50893f;

    public wmm(Context context, String str, wgh wgh, wgj wgj, brcm brcm, boolean z) {
        super(context);
        this.f50892e = str;
        this.f50893f = wgj;
        this.f50890c = wgh;
        this.f50889b = brcm;
        this.f50891d = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brco.f142400e.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50893f, this.f50890c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brco brco = (brco) da.f164949b;
        a.getClass();
        brco.f142403b = a;
        int i = brco.f142402a | 1;
        brco.f142402a = i;
        boolean z = this.f50891d;
        int i2 = i | 4;
        brco.f142402a = i2;
        brco.f142405d = z;
        brcm brcm = this.f50889b;
        if (brcm != null) {
            brco.f142404c = brcm.f142395g;
            brco.f142402a = i2 | 2;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50892e);
            brco brco2 = (brco) da.mo74062i();
            if (wih.f50727s == null) {
                wih.f50727s = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyInvitationFlowConfig", ciie.m150370a(brco.f142400e), ciie.m150370a(brcp.f142406g));
            }
            brcp brcp = (brcp) a2.f50732a.mo25553a(wih.f50727s, a3, brco2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50893f;
            bral bral = brcp.f142409b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brcp);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
