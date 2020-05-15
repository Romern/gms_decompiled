package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqf extends whz {

    /* renamed from: b */
    private final wgh f51137b;

    /* renamed from: c */
    private final String f51138c;

    /* renamed from: d */
    private final wgj f51139d;

    /* renamed from: e */
    private final String f51140e;

    public wqf(Context context, String str, wgh wgh, wgj wgj, String str2) {
        super(context);
        this.f51138c = str;
        this.f51139d = wgj;
        this.f51140e = str2;
        this.f51137b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brbq.f142304d.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51139d, this.f51137b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbq brbq = (brbq) da.f164949b;
        a.getClass();
        brbq.f142307b = a;
        int i = brbq.f142306a | 1;
        brbq.f142306a = i;
        String str = this.f51140e;
        str.getClass();
        brbq.f142306a = i | 2;
        brbq.f142308c = str;
        brbq brbq2 = (brbq) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51138c);
            if (wih.f50724p == null) {
                wih.f50724p = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteMember", ciie.m150370a(brbq.f142304d), ciie.m150370a(brbr.f142309b));
            }
            brbr brbr = (brbr) a2.f50732a.mo25553a(wih.f50724p, a3, brbq2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f51139d;
            bral bral = brbr.f142311a;
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
