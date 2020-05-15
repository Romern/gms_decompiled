package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: aszk */
public final /* synthetic */ class aszk implements rkl {

    /* renamed from: a */
    private final RequestTokenizeChimeraActivity f89918a;

    public aszk(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity) {
        this.f89918a = requestTokenizeChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity = this.f89918a;
        Status status = (Status) rkk;
        requestTokenizeChimeraActivity.findViewById(C0126R.C0129id.tp_request_tokenize_content).setVisibility(0);
        requestTokenizeChimeraActivity.findViewById(C0126R.C0129id.shade).setVisibility(8);
        if (status.mo17710c()) {
            requestTokenizeChimeraActivity.mo59371g();
            return;
        }
        Toast.makeText(requestTokenizeChimeraActivity, (int) C0126R.string.tp_switching_accounts_failed_text, 0).show();
        ((bnsl) RequestTokenizeChimeraActivity.f108577b.mo68387b()).mo68413a("setActiveAccount failed %s %s", status.f30115i, (Object) status.f30116j);
    }
}
