package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqe extends whz {

    /* renamed from: b */
    private final wgh f51133b;

    /* renamed from: c */
    private final String f51134c;

    /* renamed from: d */
    private final wgj f51135d;

    /* renamed from: e */
    private final String f51136e;

    public wqe(Context context, String str, wgh wgh, wgj wgj, String str2) {
        super(context);
        this.f51134c = str;
        this.f51135d = wgj;
        this.f51136e = str2;
        this.f51133b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brbo.f142295d.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51135d, this.f51133b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbo brbo = (brbo) da.f164949b;
        a.getClass();
        brbo.f142298b = a;
        int i = brbo.f142297a | 1;
        brbo.f142297a = i;
        String str = this.f51136e;
        if (str != null) {
            str.getClass();
            brbo.f142297a = i | 2;
            brbo.f142299c = str;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51134c);
            brbo brbo2 = (brbo) da.mo74062i();
            if (wih.f50723o == null) {
                wih.f50723o = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteInvitation", ciie.m150370a(brbo.f142295d), ciie.m150370a(brbp.f142300b));
            }
            brbp brbp = (brbp) a2.f50732a.mo25553a(wih.f50723o, a3, brbo2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f51135d;
            bral bral = brbp.f142302a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return true;
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return false;
        }
    }
}
