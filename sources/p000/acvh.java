package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: acvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvh implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acvp f60881a;

    public acvh(acvp acvp) {
        this.f60881a = acvp;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acwh acwh = this.f60881a.f60898h;
        if (acwh != null && i >= 0 && i < acwh.getCount()) {
            acwf a = this.f60881a.f60898h.getItem(i);
            acvp acvp = this.f60881a;
            acwj acwj = new acwj();
            Bundle bundle = new Bundle();
            bundle.putString("actionType", a.f60956a);
            bundle.putParcelableArrayList("userActions", a.f60957b);
            acwj.setArguments(bundle);
            Activity activity = acvp.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acwj, "userActionsFragment").addToBackStack(null).commit();
            }
        }
    }
}
