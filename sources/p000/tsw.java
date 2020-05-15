package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: tsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsw extends adcf {

    /* renamed from: a */
    public tsf f46615a;

    /* renamed from: b */
    private trz f46616b;

    /* renamed from: a */
    public static tsw m37457a(String str, boolean z) {
        tsw tsw = new tsw();
        Bundle bundle = new Bundle();
        bundle.putString("pwm.DataFieldNames.accountName", str);
        bundle.putBoolean("pwm.PasswordListFragment.isSearch", z);
        tsw.setArguments(bundle);
        return tsw;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        this.f46615a = (tsf) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string)).mo3444a(tsf.class);
        this.f46616b = (trz) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string)).mo3444a(trz.class);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_password_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.password_list_recycler_view);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(new tsv(this.f46615a, this.f46616b, getArguments().getBoolean("pwm.PasswordListFragment.isSearch"), this));
        return inflate;
    }
}
