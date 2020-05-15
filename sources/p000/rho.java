package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: rho */
final /* synthetic */ class rho implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final SimpleDialogAccountPickerChimeraActivity f42988a;

    /* renamed from: b */
    private final C1350sh f42989b;

    public rho(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity, C1350sh shVar) {
        this.f42988a = simpleDialogAccountPickerChimeraActivity;
        this.f42989b = shVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.f42988a;
        C1350sh shVar = this.f42989b;
        simpleDialogAccountPickerChimeraActivity.f30103h = i;
        shVar.mo15913a(-1).setEnabled(true);
    }
}
