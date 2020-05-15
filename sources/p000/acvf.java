package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.search.administration.CorpusConfigParcelable;

/* renamed from: acvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvf implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acvp f60879a;

    public acvf(acvp acvp) {
        this.f60879a = acvp;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acue acue = this.f60879a.f60892b;
        if (acue != null && i >= 0 && i < acue.getCount()) {
            acuc a = this.f60879a.f60892b.getItem(i);
            acvp acvp = this.f60879a;
            acve acve = new acve();
            CorpusConfigParcelable corpusConfigParcelable = a.f60786a;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", corpusConfigParcelable.f107359a);
            bundle.putString("corpusName", corpusConfigParcelable.f107360b);
            bundle.putString("indexableType", acua.m49853a(corpusConfigParcelable.f107361c));
            acve.setArguments(bundle);
            Activity activity = acvp.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acve, "indexablesFragment").addToBackStack(null).commit();
            }
        }
    }
}
