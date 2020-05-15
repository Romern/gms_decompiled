package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;

/* renamed from: tpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tpt extends adcf {

    /* renamed from: a */
    public tpp f46463a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_blacklist, viewGroup, false);
        tsa tsa = (tsa) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsa.class);
        tsa.mo26752a().mo2445a(this, new tpq(this, inflate));
        tuw.m37506a((TextView) inflate.findViewById(C0126R.C0129id.blacklist_description), C0126R.string.pwm_never_save_description, tuw.f46703a);
        ((MaterialButton) inflate.findViewById(C0126R.C0129id.add_to_blacklist_button)).setOnClickListener(new tpr(this, tsa));
        this.f46463a = new tpp(tsa, this);
        tpm tpm = new tpm(tsa, this.f46463a, this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.blacklist_recycler_view);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(tpm);
        return inflate;
    }
}
