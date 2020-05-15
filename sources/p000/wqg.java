package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqg extends whz {

    /* renamed from: b */
    private final wgh f51141b;

    /* renamed from: c */
    private final String f51142c;

    /* renamed from: d */
    private final wgj f51143d;

    /* renamed from: e */
    private final String f51144e;

    /* renamed from: f */
    private final int f51145f;

    public wqg(Context context, String str, wgh wgh, wgj wgj, int i, String str2) {
        super(context);
        this.f51142c = str;
        this.f51143d = wgj;
        this.f51141b = wgh;
        this.f51145f = i;
        this.f51144e = str2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brcv.f142434g.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51143d, this.f51141b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brcv brcv = (brcv) da.f164949b;
        a.getClass();
        brcv.f142437b = a;
        int i = brcv.f142436a | 1;
        brcv.f142436a = i;
        int i2 = this.f51145f;
        if (i2 != 0) {
            brcv.f142438c = i2 - 1;
            brcv.f142436a = i | 2;
        }
        if (i2 == 11) {
            bxvd da2 = brcu.f142430c.mo74144da();
            String str = this.f51144e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brcu brcu = (brcu) da2.f164949b;
            str.getClass();
            brcu.f142432a |= 1;
            brcu.f142433b = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brcv brcv2 = (brcv) da.f164949b;
            brcu brcu2 = (brcu) da2.mo74062i();
            brcu2.getClass();
            brcv2.f142441f = brcu2;
            brcv2.f142436a |= 16;
        } else if (i2 == 10) {
            brcs brcs = brcs.f142426a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brcv brcv3 = (brcv) da.f164949b;
            brcs.getClass();
            brcv3.f142440e = brcs;
            brcv3.f142436a |= 8;
        } else if (i2 == 12) {
            brct brct = brct.f142428a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brcv brcv4 = (brcv) da.f164949b;
            brct.getClass();
            brcv4.f142439d = brct;
            brcv4.f142436a |= 4;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51142c);
            brcv brcv5 = (brcv) da.mo74062i();
            if (wih.f50728t == null) {
                wih.f50728t = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyManagementPageContent", ciie.m150370a(brcv.f142434g), ciie.m150370a(brcw.f142442d));
            }
            brcw brcw = (brcw) a2.f50732a.mo25553a(wih.f50728t, a3, brcv5, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f51143d;
            bral bral = brcw.f142445b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brcw);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
