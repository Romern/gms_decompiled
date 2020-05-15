package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.family.widget.DateSpinner;

/* renamed from: wrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrp implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ Spinner f51201a;

    /* renamed from: b */
    final /* synthetic */ DateSpinner f51202b;

    public wrp(DateSpinner dateSpinner, Spinner spinner) {
        this.f51202b = dateSpinner;
        this.f51201a = spinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DateSpinner.m23337a(this.f51201a, this.f51202b.f31477a);
        this.f51202b.mo18570a();
        DateSpinner dateSpinner = this.f51202b;
        wim wim = dateSpinner.f31480d;
        if (wim != null) {
            wim.mo29127a(dateSpinner.mo18572b());
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
