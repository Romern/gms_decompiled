package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;

/* renamed from: acum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acum implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acun f60818a;

    public acum(acun acun) {
        this.f60818a = acun;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acui acui = this.f60818a.f60819a;
        if (acui != null && i >= 0 && i < acui.getCount()) {
            AppIndexingErrorInfo a = this.f60818a.f60819a.getItem(i);
            acun acun = this.f60818a;
            acug acug = new acug();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error", a);
            acug.setArguments(bundle);
            acun.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acug, "errorDetailsFragment").addToBackStack(null).commit();
        }
    }
}
