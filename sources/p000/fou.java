package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/* renamed from: fou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fou implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ fov f17044a;

    public fou(fov fov) {
        this.f17044a = fov;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TextView) adapterView.getChildAt(0)).setTextColor(-1);
        this.f17044a.f17045a.f9494d.mo2143b(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
