package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ListFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aulh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aulh extends ListFragment {

    /* renamed from: a */
    public static final Long f92028a = 604800000L;

    /* renamed from: c */
    private static final aunx f92029c = new aunx("TrustAgent", "TrustStatusMonitorFragment");

    /* renamed from: b */
    public aukz f92030b;

    /* renamed from: d */
    private List f92031d;

    /* renamed from: e */
    private aumr f92032e;

    /* renamed from: f */
    private aumq f92033f;

    /* renamed from: a */
    public final void mo50649a() {
        try {
            List a = this.f92032e.mo50675a(aumt.class, auox.m77527b("SmartLock_status_model"));
            this.f92031d.clear();
            for (int i = 0; i < a.size() && this.f92031d.size() <= 500; i++) {
                aumt aumt = (aumt) a.get(i);
                Long valueOf = Long.valueOf(aumt.f92085d);
                if (aupp.f92273a.contains(aumt.mo50671a(aumt.f92097c))) {
                    if (System.currentTimeMillis() - valueOf.longValue() <= f92028a.longValue()) {
                        this.f92031d.add(aumt);
                    }
                }
            }
        } catch (aumn e) {
            f92029c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f92032e = aumr.m77322a(getActivity());
        aulg aulg = new aulg(this);
        this.f92033f = aulg;
        try {
            this.f92032e.mo50677a(aumt.class, aulg);
        } catch (aumn e) {
            f92029c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
        }
        this.f92031d = new ArrayList();
        aukz aukz = new aukz(getActivity(), this.f92031d, getResources());
        this.f92030b = aukz;
        setListAdapter(aukz);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.auth_trust_status_monitor_history_list_view, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        try {
            this.f92032e.mo50678b(aumt.class, this.f92033f);
        } catch (aumn e) {
            f92029c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
        }
    }

    public final void onListItemClick(ListView listView, View view, int i, long j) {
        aukx aukx = new aukx();
        Bundle bundle = new Bundle();
        bundle.putString("status_model_id", ((aumt) this.f92031d.get(i)).f92085d);
        aukx.setArguments(bundle);
        aukx.show(getFragmentManager(), "auth_trust_status_monitor_smart_lock_status_detail_dialog_tag");
    }

    public final void onResume() {
        super.onResume();
        mo50649a();
        this.f92030b.notifyDataSetChanged();
    }
}
