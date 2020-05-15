package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqc extends whz {

    /* renamed from: b */
    private final String f51125b;

    /* renamed from: c */
    private final wgj f51126c;

    /* renamed from: d */
    private final wgh f51127d;

    /* renamed from: e */
    private final String f51128e;

    /* renamed from: f */
    private final brcm f51129f;

    public wqc(Context context, String str, wgh wgh, wgj wgj, String str2, brcm brcm) {
        super(context);
        this.f51125b = str;
        this.f51127d = wgh;
        this.f51126c = wgj;
        this.f51128e = str2;
        this.f51129f = brcm;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brax.f142200f.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f51126c, this.f51127d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brax brax = (brax) da.f164949b;
        a.getClass();
        brax.f142203b = a;
        int i = brax.f142202a | 1;
        brax.f142202a = i;
        int i2 = i | 8;
        brax.f142202a = i2;
        brax.f142206e = true;
        brcm brcm = this.f51129f;
        if (brcm != null) {
            brax.f142205d = brcm.f142395g;
            i2 |= 4;
            brax.f142202a = i2;
        }
        String str = this.f51128e;
        if (str != null) {
            str.getClass();
            brax.f142202a = i2 | 2;
            brax.f142204c = str;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f51125b);
            brax brax2 = (brax) da.mo74062i();
            if (wih.f50720l == null) {
                wih.f50720l = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CanUpdateMemberRole", ciie.m150370a(brax.f142200f), ciie.m150370a(bray.f142207d));
            }
            return new why(true, (bray) a2.f50732a.mo25553a(wih.f50720l, a3, brax2, (long) wih.f50710b, TimeUnit.MILLISECONDS));
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
