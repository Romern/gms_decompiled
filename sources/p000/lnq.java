package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: lnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnq extends Fragment {

    /* renamed from: a */
    private final lqe f26464a = new lqe();

    /* renamed from: b */
    private View f26465b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.autofill_recyclerview_activity, viewGroup, false);
        this.f26465b = inflate;
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f26465b.findViewById(16908301).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26465b.findViewById(16908298);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f26464a);
        lqg f = lql.m19524f();
        f.mo15376b("Info Title");
        f.mo15374a("insert valuable information here");
        this.f26464a.mo15371a(bngx.m109356a(f.mo15372a()));
    }
}
