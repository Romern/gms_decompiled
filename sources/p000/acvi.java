package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: acvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvi implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ acvp f60882a;

    public acvi(acvp acvp) {
        this.f60882a = acvp;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        acul acul = this.f60882a.f60901k;
        if (acul != null && i >= 0 && i < acul.getCount()) {
            acuj a = this.f60882a.f60901k.getItem(i);
            acvp acvp = this.f60882a;
            acun acun = new acun();
            Bundle bundle = new Bundle();
            bundle.putString("callType", a.mo33101a());
            bundle.putInt("errorCode", a.mo33102b());
            bundle.putParcelableArrayList("errors", a.f60810b);
            acun.setArguments(bundle);
            Activity activity = acvp.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.debug_container, acun, "errorsFragment").addToBackStack(null).commit();
            }
        }
    }
}
