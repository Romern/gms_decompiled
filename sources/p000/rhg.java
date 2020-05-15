package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.OriginalSimpleAccountPickerChimeraActivity;

/* renamed from: rhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rhg implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1350sh f42978a;

    /* renamed from: b */
    final /* synthetic */ OriginalSimpleAccountPickerChimeraActivity f42979b;

    public rhg(OriginalSimpleAccountPickerChimeraActivity originalSimpleAccountPickerChimeraActivity, C1350sh shVar) {
        this.f42979b = originalSimpleAccountPickerChimeraActivity;
        this.f42978a = shVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f42979b.f42963e = i;
        this.f42978a.mo15913a(-1).setEnabled(true);
    }
}
