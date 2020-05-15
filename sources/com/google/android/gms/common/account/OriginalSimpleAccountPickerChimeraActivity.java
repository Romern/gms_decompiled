package com.google.android.gms.common.account;

import android.accounts.Account;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OriginalSimpleAccountPickerChimeraActivity extends rhc {

    /* renamed from: b */
    Button f30096b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, float):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      ps.f(android.view.View, int):void
      ps.f(android.view.View, float):void */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17696e() {
        C1349sg sgVar = new C1349sg(this);
        boolean z = true;
        sgVar.mo15908b(getString(C0126R.string.common_account_choose_account_for_app_label, new Object[]{mo24628l()}));
        sgVar.mo15906b(17039370, new rhf(this));
        sgVar.mo15892a(17039360, new rhe(this));
        ArrayList g = mo24625g();
        String[] strArr = new String[(g.size() + (this.f42964f ? 1 : 0))];
        for (int i = 0; i < g.size(); i++) {
            strArr[i] = ((Account) g.get(i)).name;
        }
        if (this.f42964f) {
            strArr[g.size()] = getResources().getString(C0126R.string.common_add_account);
        }
        sgVar.mo15903a(strArr, this.f42963e, (DialogInterface.OnClickListener) null);
        C1350sh b = sgVar.mo15904b();
        try {
            Method declaredMethod = b.getClass().getDeclaredMethod("onCreate", Bundle.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(b, null);
            Button a = b.mo15913a(-1);
            this.f30096b = a;
            if (this.f42963e == -1) {
                z = false;
            }
            a.setEnabled(z);
            this.f42967i = b.mo15914a();
            this.f42967i.setOnItemClickListener(new rhg(this, b));
            Window window = b.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                ViewGroup viewGroup2 = (ViewGroup) getWindow().getDecorView();
                C1280ps.m19918f(viewGroup2, C1280ps.m19933o(viewGroup));
                C1280ps.m19918f((View) viewGroup, 0.0f);
                viewGroup2.setBackground(viewGroup.getBackground());
                viewGroup.setBackground(null);
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeViewAt(0);
                setContentView(childAt);
            }
        } catch (Exception e) {
            Log.wtf("Cannot call onCreate on Dialog", e);
            setResult(0);
            finish();
        }
    }
}
