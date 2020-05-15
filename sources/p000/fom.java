package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: fom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fom extends Fragment {

    /* renamed from: a */
    public fot f17016a;

    /* renamed from: b */
    public TextView f17017b;

    /* renamed from: c */
    private RecyclerView f17018c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11067a() {
        getLoaderManager().restartLoader(0, null, this.f17016a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17016a = new fot(getActivity(), smh.m35658c(System.currentTimeMillis()).longValue());
        getLoaderManager().initLoader(0, null, this.f17016a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.common_detailed_network_usage_breakage, viewGroup, false);
        this.f17017b = (TextView) inflate.findViewById(C0126R.C0129id.network_time_range_text);
        Spinner spinner = (Spinner) inflate.findViewById(C0126R.C0129id.network_time_range_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367048, new String[]{"Today", "Last 7 days", "Last 30 days"});
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new fol(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.network_usage_recycler_view);
        this.f17018c = recyclerView;
        fot fot = this.f17016a;
        WeakReference weakReference = fot.f17042f;
        if (weakReference != null) {
            weakReference.clear();
        }
        fot.f17042f = new WeakReference(recyclerView);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setAdapter(fot);
        return inflate;
    }
}
