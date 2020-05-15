package p000;

import android.content.DialogInterface;
import com.google.android.gms.common.account.OriginalSimpleAccountPickerChimeraActivity;

/* renamed from: rhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rhe implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OriginalSimpleAccountPickerChimeraActivity f42976a;

    public rhe(OriginalSimpleAccountPickerChimeraActivity originalSimpleAccountPickerChimeraActivity) {
        this.f42976a = originalSimpleAccountPickerChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f42976a.onBackPressed();
    }
}
