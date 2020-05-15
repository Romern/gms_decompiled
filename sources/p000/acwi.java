package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* renamed from: acwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acwi implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acwj f60962a;

    public acwi(acwj acwj) {
        this.f60962a = acwj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acwc acwc = this.f60962a.f60963a;
        if (acwc != null && i >= 0 && i < acwc.getCount()) {
            AppIndexingUserActionInfo a = this.f60962a.f60963a.getItem(i);
            acwj acwj = this.f60962a;
            acwe acwe = new acwe();
            Bundle bundle = new Bundle();
            bundle.putParcelable("userAction", a);
            acwe.setArguments(bundle);
            acwj.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acwe, "userActionDetailsFragment").addToBackStack(null).commit();
        }
    }
}
