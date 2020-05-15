package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.p042v2.model.SetupParams;
import java.util.concurrent.TimeUnit;

/* renamed from: wml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wml extends whz {

    /* renamed from: b */
    private final wgh f50884b;

    /* renamed from: c */
    private final String f50885c;

    /* renamed from: d */
    private final wgj f50886d;

    /* renamed from: e */
    private final SetupParams f50887e;

    /* renamed from: f */
    private final byte[] f50888f;

    public wml(Context context, String str, wgh wgh, wgj wgj, SetupParams setupParams, byte[] bArr) {
        super(context);
        this.f50885c = str;
        this.f50886d = wgj;
        this.f50884b = wgh;
        this.f50887e = setupParams;
        this.f50888f = bArr;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str;
        bxvd da = brbi.f142262e.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50886d, this.f50884b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbi brbi = (brbi) da.f164949b;
        a.getClass();
        brbi.f142265b = a;
        brbi.f142264a |= 1;
        bxvd da2 = braq.f142171c.mo74144da();
        bxvd da3 = brap.f142167c.mo74144da();
        String b = sqd.m35968b(this.f50888f);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brap brap = (brap) da3.f164949b;
        b.getClass();
        brap.f142169a = 2;
        brap.f142170b = b;
        brap brap2 = (brap) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        braq braq = (braq) da2.f164949b;
        brap2.getClass();
        braq.f142174b = brap2;
        braq.f142173a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbi brbi2 = (brbi) da.f164949b;
        braq braq2 = (braq) da2.mo74062i();
        braq2.getClass();
        brbi2.f142267d = braq2;
        brbi2.f142264a |= 4;
        bxvd da4 = brcd.f142351c.mo74144da();
        SetupParams setupParams = this.f50887e;
        if (!(setupParams == null || (str = setupParams.f31465b) == null)) {
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            brcd brcd = (brcd) da4.f164949b;
            str.getClass();
            brcd.f142353a |= 1;
            brcd.f142354b = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbi brbi3 = (brbi) da.f164949b;
        brcd brcd2 = (brcd) da4.mo74062i();
        brcd2.getClass();
        brbi3.f142266c = brcd2;
        brbi3.f142264a |= 2;
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50885c);
            brbi brbi4 = (brbi) da.mo74062i();
            if (wih.f50713e == null) {
                wih.f50713e = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CreateFamily", ciie.m150370a(brbi.f142262e), ciie.m150370a(brbj.f142268b));
            }
            brbj brbj = (brbj) a2.f50732a.mo25553a(wih.f50713e, a3, brbi4, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50886d;
            bral bral = brbj.f142270a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brbj);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
