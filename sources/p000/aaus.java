package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: aaus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaus implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ aauu f56623a;

    public aaus(aauu aauu) {
        this.f56623a = aauu;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aave aave = this.f56623a.f56625a;
        if (aave != null) {
            aave.mo31824a();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
