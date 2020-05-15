package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: lnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnu extends Fragment {

    /* renamed from: a */
    private final lqe f26471a = new lqe();

    /* renamed from: b */
    private View f26472b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.autofill_recyclerview_activity, viewGroup, false);
        this.f26472b = inflate;
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f26472b.findViewById(16908301).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26472b.findViewById(16908298);
        getContext();
        recyclerView.setLayoutManager(new aah());
        int i = 0;
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f26471a);
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        bmxv c = kwe.m18646a(getContext()).mo14892c(arguments.getInt("position"));
        if (c.mo66813a()) {
            kwq kwq = ((kwh) c.mo66814b()).f25263a;
            if (kwq == null) {
                kwq = kwq.f25305l;
            }
            bngs bngs = new bngs();
            lqg f = lql.m19524f();
            f.mo15376b("Session Id");
            kwk kwk = kwq.f25316j;
            if (kwk == null) {
                kwk = kwk.f25275d;
            }
            f.mo15374a(String.valueOf(kwk.f25277a));
            f.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f.mo15372a());
            lqg f2 = lql.m19524f();
            f2.mo15376b("App Id");
            kwk kwk2 = kwq.f25316j;
            if (kwk2 == null) {
                kwk2 = kwk.f25275d;
            }
            kwg kwg = kwk2.f25278b;
            if (kwg == null) {
                kwg = kwg.f25257c;
            }
            f2.mo15374a(kwg.f25259a);
            f2.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f2.mo15372a());
            lqg f3 = lql.m19524f();
            f3.mo15376b("App Version");
            kwk kwk3 = kwq.f25316j;
            if (kwk3 == null) {
                kwk3 = kwk.f25275d;
            }
            kwg kwg2 = kwk3.f25278b;
            if (kwg2 == null) {
                kwg2 = kwg.f25257c;
            }
            f3.mo15374a(String.valueOf(kwg2.f25260b));
            f3.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f3.mo15372a());
            lqg f4 = lql.m19524f();
            f4.mo15376b("Screen Id");
            kwk kwk4 = kwq.f25316j;
            if (kwk4 == null) {
                kwk4 = kwk.f25275d;
            }
            kws kws = kwk4.f25279c;
            if (kws == null) {
                kws = kws.f25323b;
            }
            f4.mo15374a(kws.f25325a);
            f4.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f4.mo15372a());
            lqg f5 = lql.m19524f();
            f5.mo15376b("Trigger Method");
            f5.mo15374a(!kwq.f25308b ? "Long press" : "Single press");
            f5.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f5.mo15372a());
            lqg f6 = lql.m19524f();
            f6.mo15376b("Flags");
            f6.mo15374a(String.valueOf(kwq.f25309c));
            f6.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f6.mo15372a());
            lqg f7 = lql.m19524f();
            f7.mo15376b("Duration Milliseconds");
            f7.mo15374a(String.valueOf(kwq.f25310d));
            f7.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f7.mo15372a());
            lqg f8 = lql.m19524f();
            f8.mo15376b("Was Successful");
            f8.mo15374a(String.valueOf(kwq.f25311e));
            f8.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f8.mo15372a());
            lqg f9 = lql.m19524f();
            f9.mo15376b("Save Data Type");
            f9.mo15374a(String.valueOf(kwq.f25312f));
            f9.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
            bngs.mo67668c(f9.mo15372a());
            lqg f10 = lql.m19524f();
            f10.mo15376b("Opt In Status");
            int i2 = kwq.f25313g;
            if (i2 == 0) {
                i = 2;
            } else if (i2 == 1) {
                i = 3;
            } else if (i2 == 2) {
                i = 4;
            } else if (i2 == 3) {
                i = 5;
            }
            if (i == 0) {
                i = 1;
            }
            if (i != 1) {
                f10.mo15374a(String.valueOf(i - 2));
                f10.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
                bngs.mo67668c(f10.mo15372a());
                lqg f11 = lql.m19524f();
                f11.mo15376b("Was App Excluded");
                f11.mo15374a(String.valueOf(kwq.f25314h));
                f11.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
                bngs.mo67668c(f11.mo15372a());
                lqg f12 = lql.m19524f();
                f12.mo15376b("Was Save Delayed");
                f12.mo15374a(String.valueOf(kwq.f25315i));
                f12.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
                bngs.mo67668c(f12.mo15372a());
                lqg f13 = lql.m19524f();
                f13.mo15376b("Assist Structure");
                kbu kbu = kwq.f25307a;
                if (kbu == null) {
                    kbu = kbu.f23718f;
                }
                f13.mo15374a(lqq.m19540a(kbu));
                f13.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_touch_app_grey600_24));
                bngs.mo67668c(f13.mo15372a());
                this.f26471a.mo15371a(bngs.mo67664a());
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        Toast.makeText(getActivity(), "Instrumentation Session Not Found!", 1).show();
    }
}
