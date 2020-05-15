package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Executor;

/* renamed from: khu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class khu extends keo {

    /* renamed from: b */
    private static final srn f24169b = srn.m36124a();

    /* renamed from: a */
    public final kra f24170a;

    /* renamed from: c */
    private final Context f24171c;

    /* renamed from: d */
    private final Account f24172d;

    /* renamed from: e */
    private final bqgj f24173e;

    /* renamed from: f */
    private final cijl f24174f;

    /* renamed from: b */
    private final bqgg m17871b() {
        if (!ccip.m129868h() || !ccip.f179070a.mo6606a().mo76049l()) {
            return this.f24173e.mo25819b(new khs(this));
        }
        return ((aeeh) this.f24174f.mo6445a()).mo34082c(kbb.SYNC_ID_PEOPLE_DATA_DOWNLOAD, this.f24172d).mo34066a(new khr(this), 1, this.f24173e);
    }

    /* renamed from: a */
    public final bmxv mo14478a() {
        sdo.m34960a();
        ampl ampl = new ampl(new shl(this.f24171c, ccip.f179070a.mo6606a().mo76062y(), (int) ccip.f179070a.mo6606a().mo76063z(), this.f24171c.getApplicationInfo().uid, 18688));
        int myUid = Process.myUid();
        String str = this.f24172d.name;
        String str2 = this.f24172d.name;
        String packageName = this.f24171c.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        clientContext.mo17806d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
        try {
            btcy btcy = (btcy) btcz.f148362g.mo74144da();
            btcy.mo70740a("me");
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            ((btcz) btcy.f164949b).f148368e = btcx.m116436a(4);
            if (cciw.f179109a.mo6606a().mo76083p()) {
                bxvd da = btea.f148482d.mo74144da();
                bxvd da2 = btcb.f148246c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                "GMS AUTOFILL".getClass();
                ((btcb) da2.f164949b).f148248a = "GMS AUTOFILL";
                String f = spn.m35885f(rpr.m34216b());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                f.getClass();
                ((btcb) da2.f164949b).f148249b = f;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcb btcb = (btcb) da2.mo74062i();
                btcb.getClass();
                ((btea) da.f164949b).f148484a = btcb;
                if (btcy.f164950c) {
                    btcy.mo74035c();
                    btcy.f164950c = false;
                }
                btea btea = (btea) da.mo74062i();
                btea.getClass();
                ((btcz) btcy.f164949b).f148367d = btea;
            }
            btdb a = ampl.mo41247a(clientContext, (btcz) btcy.mo74062i());
            if (a != null) {
                if (!(a.f148372a.size() == 0 || ((btec) a.f148372a.get(0)).f148492a == null)) {
                    bler bler = ((btec) a.f148372a.get(0)).f148492a;
                    if (bler == null) {
                        bler = bler.f126245D;
                    }
                    return bmxv.m108566b(bler);
                }
            }
            ((bnsl) f24169b.mo68388c()).mo68405a("No person returned in GetPeopleResponse.");
            return bmvz.f131120a;
        } catch (chuw | gid e) {
            bnsl bnsl = (bnsl) f24169b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error calling GetPeopleRequest.");
            return bmvz.f131120a;
        }
    }

    public khu(Context context, Account account, kra kra, bqgj bqgj, cijl cijl) {
        this.f24171c = context;
        this.f24172d = account;
        this.f24170a = kra;
        this.f24173e = bqgj;
        this.f24174f = cijl;
    }

    /* renamed from: a */
    public final bqgg mo14431a(Executor executor) {
        return bqdx.m112673a(m17871b(), new kht(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        return bqdx.m112673a(m17871b(), new khq(this), bqfb.INSTANCE);
    }
}
