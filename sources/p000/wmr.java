package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: wmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmr extends whz {

    /* renamed from: b */
    private final wgh f50912b;

    /* renamed from: c */
    private final String f50913c;

    /* renamed from: d */
    private final wgj f50914d;

    /* renamed from: e */
    private final Calendar f50915e;

    public wmr(Context context, String str, wgh wgh, wgj wgj, Calendar calendar) {
        super(context);
        this.f50913c = str;
        this.f50914d = wgj;
        this.f50915e = calendar;
        this.f50912b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = bref.f142597f.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50914d, this.f50912b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bref bref = (bref) da.f164949b;
        a.getClass();
        bref.f142600b = a;
        bref.f142599a |= 1;
        int i = this.f50915e.get(2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bref bref2 = (bref) da.f164949b;
        bref2.f142599a |= 4;
        bref2.f142602d = i;
        int i2 = this.f50915e.get(5);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bref bref3 = (bref) da.f164949b;
        bref3.f142599a = 2 | bref3.f142599a;
        bref3.f142601c = i2;
        int i3 = this.f50915e.get(1);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bref bref4 = (bref) da.f164949b;
        bref4.f142599a |= 8;
        bref4.f142603e = i3;
        bref bref5 = (bref) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50913c);
            if (wih.f50729u == null) {
                wih.f50729u = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/SetBirthday", ciie.m150370a(bref.f142597f), ciie.m150370a(breg.f142604g));
            }
            breg breg = (breg) a2.f50732a.mo25553a(wih.f50729u, a3, bref5, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50914d;
            bral bral = breg.f142607b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, breg);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
