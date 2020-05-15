package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxt implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ wxu f51552a;

    public wxt(wxu wxu) {
        this.f51552a = wxu;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        wxu wxu = this.f51552a;
        if (i == 0) {
            ((CheckBox) wxu.mo29553a((int) C0126R.C0129id.gf_include_screenshot)).setChecked(false);
            ((CheckBox) wxu.mo29553a((int) C0126R.C0129id.gf_include_logs)).setChecked(false);
        }
        if (wxu.getActivity() instanceof wws) {
            ((wws) wxu.getActivity()).mo18592a(i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
