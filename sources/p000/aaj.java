package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: aaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaj implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ aap f50a;

    public aaj(aap aap) {
        this.f50a = aap;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1543zl zlVar;
        if (i != -1 && (zlVar = this.f50a.f60e) != null) {
            zlVar.f27742a = false;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
