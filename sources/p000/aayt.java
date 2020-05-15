package p000;

import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aayt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayt implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56845a;

    /* renamed from: b */
    final /* synthetic */ Spinner f56846b;

    public aayt(HelpChimeraActivity helpChimeraActivity, Spinner spinner) {
        this.f56845a = helpChimeraActivity;
        this.f56846b = spinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        HelpChimeraActivity helpChimeraActivity = this.f56845a;
        String str = (String) this.f56846b.getItemAtPosition(i);
        if (helpChimeraActivity.mo43340a(str)) {
            for (Account account : aasd.m46847a(helpChimeraActivity)) {
                if (str.equals(account.name)) {
                    abcx.m47478a(helpChimeraActivity, account);
                }
            }
            helpChimeraActivity.mo43348e();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
