package p000;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.wallet.p097ui.common.RegionCodeSelectorSpinner;

/* renamed from: bkex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkex implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ RegionCodeSelectorSpinner f124124a;

    public bkex(RegionCodeSelectorSpinner regionCodeSelectorSpinner) {
        this.f124124a = regionCodeSelectorSpinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        Integer num = (Integer) this.f124124a.getItemAtPosition(i);
        bkey bkey = this.f124124a.f152179v;
        if (bkey != null) {
            int intValue = num.intValue();
            int id = this.f124124a.getId();
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            bkey.mo52935a(intValue, id, z);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        Log.i("RegionCodeSelectorSpinn", "Listener fired for onNothingSelected; ignoring");
    }
}
