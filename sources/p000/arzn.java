package p000;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: arzn */
final /* synthetic */ class arzn implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final arzy f88533a;

    public arzn(arzy arzy) {
        this.f88533a = arzy;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1350sh shVar;
        arzy arzy = this.f88533a;
        Account account = (Account) arzy.f88558e.get(i);
        if (cgou.m146378c() && arzy.f88563j == aqzm.AUTO && arzy.f88559f.contains(account)) {
            arzy.f88565l = true;
            String string = arzy.getResources().getString(C0126R.string.smartdevice_auto_selectaccount_unsupported_account, account.name);
            Activity activity = arzy.getActivity();
            if (activity == null) {
                arzy.f88554a.mo25416d("Activity was unexpectedly null", new Object[0]);
                shVar = null;
            } else {
                C1349sg a = arqh.m73304a((Context) activity);
                a.mo15902a(true);
                a.mo15900a(string);
                a.mo15906b((int) C0126R.string.common_ok, arzs.f88541a);
                shVar = a.mo15904b();
            }
            if (shVar != null) {
                shVar.show();
                return;
            }
        }
        if (arzy.f88556c) {
            arzy.f88557d.mo71364b(true);
        }
        arzy.f88564k = true;
        arzy.f88555b.mo48978a(arzy.mo48983a(account));
    }
}
