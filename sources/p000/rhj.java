package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rhj */
public final /* synthetic */ class rhj implements C0038ax {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42982a;

    public rhj(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.f42982a = simpleDialogAccountPickerChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, float):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      ps.f(android.view.View, int):void
      ps.f(android.view.View, float):void */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        String str;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.f42982a;
        List list = (List) obj;
        if (list != null) {
            if (soz.m35813i(simpleDialogAccountPickerChimeraActivity)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(aczd.m50036a());
                list = arrayList;
            }
            Account account = simpleDialogAccountPickerChimeraActivity.f30100e.f43018e;
            if (simpleDialogAccountPickerChimeraActivity.f30103h == -1 && account != null) {
                simpleDialogAccountPickerChimeraActivity.f30103h = bnjd.m109601g(list, new rhk(account));
            }
            boolean z = true;
            if (TextUtils.isEmpty(simpleDialogAccountPickerChimeraActivity.f30100e.f43019f)) {
                str = simpleDialogAccountPickerChimeraActivity.getString(C0126R.string.common_account_choose_account_for_app_label, new Object[]{simpleDialogAccountPickerChimeraActivity.f30098c});
            } else {
                str = simpleDialogAccountPickerChimeraActivity.f30100e.f43019f;
            }
            C1349sg sgVar = new C1349sg(simpleDialogAccountPickerChimeraActivity);
            sgVar.mo15908b(str);
            sgVar.mo15906b(17039370, new rhl(simpleDialogAccountPickerChimeraActivity, list));
            sgVar.mo15892a(17039360, new rhm(simpleDialogAccountPickerChimeraActivity));
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                aczd aczd = (aczd) list.get(i);
                int i2 = aczd.f61127a;
                if (i2 == 0) {
                    String str2 = aczd.f61129c;
                    bmxy.m108581a(str2);
                    strArr[i] = str2;
                } else if (i2 == 2) {
                    strArr[i] = simpleDialogAccountPickerChimeraActivity.getResources().getString(C0126R.string.common_add_account);
                }
            }
            sgVar.mo15903a(strArr, simpleDialogAccountPickerChimeraActivity.f30103h, rhn.f42987a);
            C1350sh b = sgVar.mo15904b();
            try {
                Method declaredMethod = b.getClass().getDeclaredMethod("onCreate", Bundle.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(b, null);
                Button a = b.mo15913a(-1);
                if (simpleDialogAccountPickerChimeraActivity.f30103h < 0) {
                    z = false;
                }
                a.setEnabled(z);
                simpleDialogAccountPickerChimeraActivity.f30102g = b.mo15914a();
                simpleDialogAccountPickerChimeraActivity.f30102g.setOnItemClickListener(new rho(simpleDialogAccountPickerChimeraActivity, b));
                Window window = b.getWindow();
                if (window != null) {
                    ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                    ViewGroup viewGroup2 = (ViewGroup) simpleDialogAccountPickerChimeraActivity.getWindow().getDecorView();
                    C1280ps.m19918f(viewGroup2, C1280ps.m19933o(viewGroup));
                    C1280ps.m19918f((View) viewGroup, 0.0f);
                    viewGroup2.setBackground(viewGroup.getBackground());
                    viewGroup.setBackground(null);
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeViewAt(0);
                    simpleDialogAccountPickerChimeraActivity.setContentView(childAt);
                }
            } catch (Exception e) {
                SimpleDialogAccountPickerChimeraActivity.f30097b.mo25417e("Cannot call onCreate on Dialog", e, new Object[0]);
                simpleDialogAccountPickerChimeraActivity.setResult(0);
                simpleDialogAccountPickerChimeraActivity.finish();
            }
        }
    }
}
