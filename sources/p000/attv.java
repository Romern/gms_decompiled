package p000;

import android.content.Intent;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: attv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class attv implements atfd {

    /* renamed from: a */
    final /* synthetic */ askf f90886a;

    /* renamed from: b */
    final /* synthetic */ atsy f90887b;

    /* renamed from: c */
    final /* synthetic */ byte[] f90888c;

    /* renamed from: d */
    final /* synthetic */ attw f90889d;

    public attv(attw attw, askf askf, atsy atsy, byte[] bArr) {
        this.f90889d = attw;
        this.f90886a = askf;
        this.f90887b = atsy;
        this.f90888c = bArr;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        atey.m75752a(this.f90886a, new attu(this));
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btjg btjg = (btjg) obj;
        this.f90887b.f90813E = btjg.f149112b.mo73780k();
        byte[] bArr = this.f90887b.f90813E;
        if (bArr == null || bArr.length <= 0) {
            srn srn = attw.f90890a;
            attw attw = this.f90889d;
            attw.mo50184a(attw.mo50186b(C0126R.string.common_something_went_wrong), this.f90889d.mo50186b(C0126R.string.tp_generic_error_content));
        }
        attw attw2 = this.f90889d;
        atsy atsy = this.f90887b;
        btjq[] btjqArr = (btjq[]) btjg.f149111a.toArray(new btjq[0]);
        byte[] bArr2 = this.f90888c;
        boolean z = btjg.f149113c;
        byte[] k = btjg.f149114d.mo73780k();
        if ((z || btjqArr.length > 0) && !atsy.mo50163a()) {
            Intent putExtra = new Intent().setClassName(attw2.f90898f, "com.google.android.gms.tapandpay.settings.SelectUntokenizedCardActivity").putExtra("extra_account_info", atsy.f90857t).putExtra("EXTRA_USE_SUW_UI", atsy.f90824P);
            bnha h = bnhe.m109414h();
            int length = btjqArr.length;
            btjq[] btjqArr2 = new btjq[length];
            for (int i = 0; i < btjqArr.length; i++) {
                btjq btjq = btjqArr[i];
                h.mo67695b(btjq.f149164a, btjq.f149166c.mo73780k());
                bxvd bxvd = (bxvd) btjq.mo74142c(5);
                bxvd.mo73625a((bxvk) btjq);
                bxtx bxtx = bxtx.f164797b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                btjq btjq2 = btjq.f149162e;
                bxtx.getClass();
                ((btjq) bxvd.f164949b).f149166c = bxtx;
                btjqArr2[i] = (btjq) bxvd.mo74062i();
            }
            atsy.f90818J = h.mo67618b();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(btjqArr2[i2].mo73642k());
            }
            putExtra.putExtra("extra_card_list", arrayList);
            putExtra.putExtra("extra_should_show_customer_selector", z);
            putExtra.putExtra("extra_customer_selector_params", k);
            putExtra.putExtra("extra_client_token", bArr2);
            attw2.mo50181a(putExtra, 8);
            atam c = attw2.mo50188c(atsy);
            c.mo49741a(c.mo49734a(7));
            return;
        }
        atsy.f90812D = null;
        attw2.mo50175a(atsy, 6);
    }
}
