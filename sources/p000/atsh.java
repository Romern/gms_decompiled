package p000;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;

/* renamed from: atsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsh extends C0034at {

    /* renamed from: a */
    public static final srn f90764a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: g */
    private final AccountInfo f90765g;

    /* renamed from: h */
    private final Context f90766h;

    /* renamed from: i */
    private final awkh f90767i;

    public atsh(Context context, awkh awkh, String str, String str2) {
        this.f90766h = context;
        this.f90767i = awkh;
        this.f90765g = new AccountInfo(str2, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2443a() {
        aucb a = this.f90767i.mo52198a(new GetClientTokenRequest(atvh.m76455a(this.f90766h)));
        a.mo50373a(new atsd(this));
        a.mo50372a(new atse(this));
    }

    /* renamed from: a */
    public final void mo50151a(ByteString bxtx) {
        askf askf = new askf(this.f90765g, askc.m74272b(), this.f90766h);
        bxvd da = bzty.f171383c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxtx.getClass();
        ((bzty) da.f164949b).f171386b = bxtx;
        bxvd da2 = bztq.f171359c.mo74144da();
        String str = (String) askd.f89109a.mo58455c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((bztq) da2.f164949b).f171361a = str;
        int i = !asjw.m74255a() ? 4 : 3;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bztq) da2.f164949b).f171362b = i - 2;
        bztq bztq = (bztq) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bztq.getClass();
        ((bzty) da.f164949b).f171385a = bztq;
        atff.m75770b(askf, "g/oobe/getoobeflow", da.mo74062i(), bztz.f171387c, new atsf(this), new atsg(this), atsh.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50152a(VolleyError volleyError) {
        bnsl bnsl = (bnsl) f90764a.mo68388c();
        bnsl.mo68437a(volleyError.getCause());
        bnsl.mo68432a("atsh", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        NetworkResponse networkResponse = volleyError.networkResponse;
        bnsl.mo68409a("Could not complete GetOobeFlow RPC. response code %d", networkResponse != null ? networkResponse.statusCode : -1);
        mo2453l(null);
    }
}
