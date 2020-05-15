package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.family.widget.DateSpinner;

/* renamed from: wrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrq implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ Spinner f51203a;

    /* renamed from: b */
    final /* synthetic */ DateSpinner f51204b;

    public wrq(DateSpinner dateSpinner, Spinner spinner) {
        this.f51204b = dateSpinner;
        this.f51203a = spinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DateSpinner.m23337a(this.f51203a, this.f51204b.f31478b);
        DateSpinner dateSpinner = this.f51204b;
        wim wim = dateSpinner.f31480d;
        if (wim != null) {
            wim.mo29127a(dateSpinner.mo18572b());
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
