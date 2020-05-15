package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: bjzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzv implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ bkaf f123714a;

    public bjzv(bkaf bkaf) {
        this.f123714a = bkaf;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        bkaf bkaf = this.f123714a;
        bjwk bjwk = bkaf.f123752P;
        if (bjwk != null) {
            bjwl.m104781a(bjwk, bkaf.f123769f);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
