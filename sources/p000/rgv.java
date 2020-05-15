package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;

/* renamed from: rgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rgv implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AccountTypePickerChimeraActivity f42942a;

    public rgv(AccountTypePickerChimeraActivity accountTypePickerChimeraActivity) {
        this.f42942a = accountTypePickerChimeraActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AccountTypePickerChimeraActivity accountTypePickerChimeraActivity = this.f42942a;
        accountTypePickerChimeraActivity.mo17690a(((rgx) accountTypePickerChimeraActivity.f30091a.get(i)).f42945a.type);
    }
}
