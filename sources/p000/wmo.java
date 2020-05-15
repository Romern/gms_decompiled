package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmo extends whz {

    /* renamed from: b */
    private final wgh f50899b;

    /* renamed from: c */
    private final String f50900c;

    /* renamed from: d */
    private final wgj f50901d;

    /* renamed from: e */
    private final String f50902e;

    /* renamed from: f */
    private final int f50903f;

    public wmo(Context context, String str, wgh wgh, wgj wgj, String str2, int i) {
        super(context);
        this.f50900c = str;
        this.f50901d = wgj;
        this.f50899b = wgh;
        this.f50902e = str2;
        this.f50903f = i;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brdd.f142487e.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50901d, this.f50899b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brdd brdd = (brdd) da.f164949b;
        a.getClass();
        brdd.f142490b = a;
        int i = brdd.f142489a | 1;
        brdd.f142489a = i;
        String str = this.f50902e;
        if (str != null) {
            str.getClass();
            i |= 4;
            brdd.f142489a = i;
            brdd.f142492d = str;
        }
        int i2 = this.f50903f;
        if (i2 != 0) {
            brdd.f142491c = i2 - 1;
            brdd.f142489a = i | 2;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50900c);
            brdd brdd2 = (brdd) da.mo74062i();
            if (wih.f50712d == null) {
                wih.f50712d = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilySetupParams", ciie.m150370a(brdd.f142487e), ciie.m150370a(brde.f142493e));
            }
            brde brde = (brde) a2.f50732a.mo25553a(wih.f50712d, a3, brdd2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50901d;
            bral bral = brde.f142495a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brde);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
