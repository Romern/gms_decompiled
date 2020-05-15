package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wno extends whz {

    /* renamed from: b */
    private final wgh f50983b;

    /* renamed from: c */
    private final String f50984c;

    /* renamed from: d */
    private final wgj f50985d;

    /* renamed from: e */
    private final boolean f50986e = true;

    /* renamed from: f */
    private final boolean f50987f;

    public wno(Context context, String str, wgh wgh, wgj wgj, boolean z) {
        super(context);
        this.f50984c = str;
        this.f50985d = wgj;
        this.f50983b = wgh;
        this.f50987f = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brcq.f142414f.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50985d, this.f50983b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brcq brcq = (brcq) da.f164949b;
        a.getClass();
        brcq.f142417b = a;
        int i = brcq.f142416a | 1;
        brcq.f142416a = i;
        if (this.f50986e) {
            i |= 2;
            brcq.f142416a = i;
            brcq.f142418c = true;
        }
        int i2 = i | 4;
        brcq.f142416a = i2;
        brcq.f142419d = true;
        boolean z = this.f50987f;
        brcq.f142416a = i2 | 8;
        brcq.f142420e = z;
        brcq brcq2 = (brcq) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50984c);
            if (wih.f50725q == null) {
                wih.f50725q = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyManagementConfig", ciie.m150370a(brcq.f142414f), ciie.m150370a(brcr.f142421d));
            }
            brcr brcr = (brcr) a2.f50732a.mo25553a(wih.f50725q, a3, brcq2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50985d;
            bral bral = brcr.f142424b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            if (brcr != null && (brcr.f142423a & 2) != 0) {
                return new why(true, brcr);
            }
            String valueOf = String.valueOf(brcr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unexpected null AppConfig ");
            sb.append(valueOf);
            sb.toString();
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        } catch (chuw | gid e) {
            sbw sbw2 = wgn.f50624a;
            return new why(false, null);
        }
    }
}
