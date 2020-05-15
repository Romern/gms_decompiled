package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: acvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvu implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acwa f60924a;

    public acvu(acwa acwa) {
        this.f60924a = acwa;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acvt acvt = this.f60924a.f60932a;
        if (acvt != null && i >= 0 && i < acvt.getCount()) {
            acvq a = this.f60924a.f60932a.getItem(i);
            acwa acwa = this.f60924a;
            acvp acvp = new acvp();
            Bundle bundle = new Bundle();
            bundle.putString("packageName", a.f60916b);
            bundle.putString("appName", a.f60915a);
            bundle.putBoolean("supportsRebuild", a.f60918d);
            acvp.setArguments(bundle);
            Activity activity = acwa.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acvp, "packageDetailsFragment").addToBackStack(null).commit();
            }
        }
    }
}
