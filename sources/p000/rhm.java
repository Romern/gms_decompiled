package p000;

import android.content.DialogInterface;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: rhm */
final /* synthetic */ class rhm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42986a;

    public rhm(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.f42986a = simpleDialogAccountPickerChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f42986a.onBackPressed();
    }
}
