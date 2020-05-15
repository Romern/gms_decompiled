package p000;

import android.content.DialogInterface;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.util.List;

/* renamed from: rhl */
final /* synthetic */ class rhl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42984a;

    /* renamed from: b */
    private final List f42985b;

    public rhl(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity, List list) {
        this.f42984a = simpleDialogAccountPickerChimeraActivity;
        this.f42985b = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.f42984a;
        simpleDialogAccountPickerChimeraActivity.f30101f.mo12331a((aczd) this.f42985b.get(simpleDialogAccountPickerChimeraActivity.f30103h));
    }
}
