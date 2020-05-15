package p000;

import android.content.Intent;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: rhi */
public final /* synthetic */ class rhi implements C0038ax {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42981a;

    public rhi(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.f42981a = simpleDialogAccountPickerChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Intent intent;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.f42981a;
        aczk aczk = (aczk) obj;
        if (aczk != null) {
            int i = aczk.f61148a;
            if (i == 1) {
                intent = AccountTypePickerChimeraActivity.m22472a(simpleDialogAccountPickerChimeraActivity, simpleDialogAccountPickerChimeraActivity.f30100e);
            } else {
                intent = i == 2 ? aczk.f61149b : null;
            }
            if (intent != null) {
                simpleDialogAccountPickerChimeraActivity.startActivityForResult(intent, aczk.f61148a);
            }
        }
    }
}
