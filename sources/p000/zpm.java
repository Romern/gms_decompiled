package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: zpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zpm implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ zpn f55659a;

    public zpm(zpn zpn) {
        this.f55659a = zpn;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        suo suo = this.f55659a.f55660b;
        if (suo != null) {
            String b = suo.getItem(i);
            this.f55659a.getSharedPreferences("PREFS_NAME", 0).edit().putString("PREFS_KEY_ACCOUNT_NAME", b).apply();
            this.f55659a.mo19186a(b);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
