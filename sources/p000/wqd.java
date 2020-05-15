package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqd extends whz {

    /* renamed from: b */
    private final wgh f51130b;

    /* renamed from: c */
    private final String f51131c;

    /* renamed from: d */
    private final wgj f51132d;

    public wqd(Context context, String str, wgh wgh, wgj wgj) {
        super(context);
        this.f51131c = str;
        this.f51132d = wgj;
        this.f51130b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brbm.f142286c.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51132d, this.f51130b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbm brbm = (brbm) da.f164949b;
        a.getClass();
        brbm.f142289b = a;
        brbm.f142288a |= 1;
        brbm brbm2 = (brbm) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51131c);
            if (wih.f50718j == null) {
                wih.f50718j = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteFamily", ciie.m150370a(brbm.f142286c), ciie.m150370a(brbn.f142290d));
            }
            brbn brbn = (brbn) a2.f50732a.mo25553a(wih.f50718j, a3, brbm2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f51132d;
            bral bral = brbn.f142293b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brbn);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
