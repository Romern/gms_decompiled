package p000;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: rhh */
public final /* synthetic */ class rhh implements C0038ax {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42980a;

    public rhh(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.f42980a = simpleDialogAccountPickerChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Bundle extras;
        String string;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.f42980a;
        aczk aczk = (aczk) obj;
        if (aczk != null) {
            Intent intent = aczk.f61149b;
            int i = aczk.f61148a;
            if (i == 10) {
                Toast.makeText(simpleDialogAccountPickerChimeraActivity, (int) C0126R.string.common_account_restricted_no_accounts, 0).show();
                i = 0;
            } else if (!(i != -1 || intent == null || !simpleDialogAccountPickerChimeraActivity.f30100e.f43016c || (extras = intent.getExtras()) == null || (string = extras.getString("authAccount")) == null)) {
                sbv.m34874a(simpleDialogAccountPickerChimeraActivity, string, simpleDialogAccountPickerChimeraActivity.f30099d);
            }
            if (intent != null) {
                simpleDialogAccountPickerChimeraActivity.setResult(i, intent);
            } else {
                simpleDialogAccountPickerChimeraActivity.setResult(i);
            }
            simpleDialogAccountPickerChimeraActivity.finish();
        }
    }
}
