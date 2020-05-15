package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnn extends whz {

    /* renamed from: b */
    private final String f50980b;

    /* renamed from: c */
    private final wgj f50981c;

    /* renamed from: d */
    private final wgh f50982d;

    public wnn(Context context, String str, wgh wgh, wgj wgj) {
        super(context);
        this.f50980b = str;
        this.f50981c = wgj;
        this.f50982d = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brdb.f142468f.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50981c, this.f50982d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brdb brdb = (brdb) da.f164949b;
        a.getClass();
        brdb.f142471b = a;
        int i = brdb.f142470a | 1;
        brdb.f142470a = i;
        brdb.f142470a = i | 2;
        brdb.f142472c = true;
        if (cdst.f181659a.mo6606a().mo78258d()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdb brdb2 = (brdb) da.f164949b;
            brdb2.f142470a |= 8;
            brdb2.f142473d = true;
        }
        if (cdst.f181659a.mo6606a().mo78259e()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdb brdb3 = (brdb) da.f164949b;
            brdb3.f142470a |= 16;
            brdb3.f142474e = true;
        }
        brdb brdb4 = (brdb) da.mo74062i();
        String valueOf = String.valueOf(brdb4);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("GetFamily request: ");
        sb.append(valueOf);
        sb.toString();
        sbw sbw = wgn.f50624a;
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50980b);
            if (wih.f50717i == null) {
                wih.f50717i = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamily", ciie.m150370a(brdb.f142468f), ciie.m150370a(brdc.f142475j));
            }
            brdc brdc = (brdc) a2.f50732a.mo25553a(wih.f50717i, a3, brdb4, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            String valueOf2 = String.valueOf(brdc);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("GetFamily response: ");
            sb2.append(valueOf2);
            sb2.toString();
            return new why(true, brdc);
        } catch (chuw | gid e) {
            wgn.m41923c("FamilyDataLoader", "GetFamily request failed", e);
            return new why(false, null);
        }
    }
}
