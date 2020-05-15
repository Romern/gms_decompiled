package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: acuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acuy implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acve f60853a;

    public acuy(acve acve) {
        this.f60853a = acve;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acuv acuv = this.f60853a.f60867a;
        if (acuv != null && i >= 0 && i < acuv.getCount()) {
            acut a = this.f60853a.f60867a.getItem(i);
            acve acve = this.f60853a;
            acur acur = new acur();
            Bundle bundle = new Bundle();
            bundle.putString("indexableName", a.f60839a);
            bundle.putString("indexableUrl", a.f60840b);
            bundle.putLong("createdTimestamp", a.f60841c);
            bundle.putLong("accessedTimestamp", a.f60842d);
            bundle.putString("packageName", a.f60843e);
            bundle.putString("corpusName", a.f60844f);
            bundle.putString("indexableType", a.f60845g);
            acur.setArguments(bundle);
            acve.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acur, "indexableInfoFragment").addToBackStack(null).commit();
        }
    }
}
