package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifRecyclerLayout;
import com.google.android.setupdesign.items.ItemGroup;
import java.util.List;
import java.util.Map;

/* renamed from: aryp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aryp extends Fragment implements bizt {

    /* renamed from: a */
    public static final Logger f88459a = ascp.m73787a("Setup", "UI", "RecyclerLayoutDiscoveryFragment");

    /* renamed from: b */
    public aryn f88460b;

    /* renamed from: c */
    public Handler f88461c;

    /* renamed from: d */
    public GlifRecyclerLayout f88462d;

    /* renamed from: e */
    public biyp f88463e;

    /* renamed from: f */
    public bizv f88464f;

    /* renamed from: g */
    public ItemGroup f88465g;

    /* renamed from: h */
    final Map f88466h = new C1223np();

    /* renamed from: i */
    public boolean f88467i = false;

    /* renamed from: j */
    public boolean f88468j = false;

    /* renamed from: k */
    public final Runnable f88469k = new aryi(this);

    /* renamed from: l */
    private arba f88470l;

    /* renamed from: m */
    private View f88471m;

    /* renamed from: n */
    private boolean f88472n = false;

    /* renamed from: o */
    private final ardt f88473o = new aryh(this);

    /* renamed from: p */
    private final Runnable f88474p = new aryj(this);

    /* renamed from: q */
    private final Runnable f88475q = new aryk(this);

    /* renamed from: a */
    public final void mo48940a() {
        f88459a.mo25412b("startSearching", new Object[0]);
        this.f88472n = false;
        this.f88462d.mo71365c(C0126R.string.smartdevice_searching_for_devices);
        mo48941a(true);
        this.f88463e.mo64885a(8);
        mo48943c();
        this.f88461c.removeCallbacks(this.f88469k);
        this.f88461c.postDelayed(this.f88475q, 25000);
    }

    /* renamed from: b */
    public final void mo48942b() {
        if (!this.f88472n) {
            this.f88472n = true;
            this.f88462d.mo71365c(C0126R.string.smartdevice_choose_device);
            this.f88461c.removeCallbacks(this.f88475q);
            if (cgqs.f187523a.mo6606a().mo84308U()) {
                this.f88461c.postDelayed(this.f88469k, 5000);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48943c() {
        if (!this.f88468j) {
            ardt ardt = this.f88473o;
            long a = cgox.f187423a.mo6606a().mo84205a();
            if (a > 0 && !this.f88467i) {
                ardt = new aqxw(new adzt(Looper.getMainLooper()), a, ardt, new arym(this));
            }
            this.f88470l.mo48361a(ardt);
            this.f88468j = true;
            this.f88460b.mo48938g();
        }
    }

    /* renamed from: d */
    public final void mo48944d() {
        f88459a.mo25412b("Stopping scan", new Object[0]);
        this.f88470l.mo48363b();
        this.f88468j = false;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88460b = (aryn) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement DiscoveryFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        f88459a.mo25412b("onCreate", new Object[0]);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f88467i = bundle.getBoolean("didAutoConnect");
        }
        if (getActivity() != null) {
            Context context = getContext();
            sdo.m34959a(context);
            this.f88470l = aqxc.m72189b(context);
        }
        this.f88461c = new adzt();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f88459a.mo25412b("onCreateView", new Object[0]);
        GlifRecyclerLayout glifRecyclerLayout = (GlifRecyclerLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_setup_discovery_recycler_layout, viewGroup, false);
        this.f88462d = glifRecyclerLayout;
        biyo biyo = new biyo(this.f88462d.getContext());
        biyo.mo64883a(C0126R.string.smartdevice_search_again);
        biyo.f122327b = new aryl(this);
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyp a = biyo.mo64882a();
        this.f88463e = a;
        ((biyn) glifRecyclerLayout.mo71342a(biyn.class)).mo52733a(a);
        this.f88463e.mo64885a(8);
        bize bize = new bize();
        bize.mo64898a(new ColorDrawable(this.f88462d.getResources().getColor(17170445)));
        bjaj bjaj = this.f88462d.f151484a;
        bjaj.f122420a.removeItemDecoration(bjaj.f122422c);
        bjaj.f122422c = bize;
        bjaj.f122420a.addItemDecoration(bjaj.f122422c);
        bjaj.mo64956b();
        return this.f88462d;
    }

    public final void onPause() {
        f88459a.mo25412b("onPause", new Object[0]);
        this.f88461c.removeCallbacks(this.f88469k);
        this.f88461c.removeCallbacks(this.f88474p);
        this.f88461c.removeCallbacks(this.f88475q);
        mo48944d();
        super.onPause();
    }

    public final void onResume() {
        f88459a.mo25412b("onResume", new Object[0]);
        super.onResume();
        ItemGroup itemGroup = this.f88465g;
        if (!itemGroup.f151508a.isEmpty()) {
            int g = itemGroup.mo64923g();
            List list = itemGroup.f151508a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bizp) list.get(i)).mo64922b(itemGroup);
            }
            itemGroup.f151509b = true;
            itemGroup.f151508a.clear();
            itemGroup.mo71386b(0, g);
        }
        this.f88466h.clear();
        this.f88461c.postDelayed(this.f88474p, 300);
        this.f88461c.postDelayed(this.f88475q, 25000);
        mo48940a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didAutoConnect", this.f88467i);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        f88459a.mo25412b("onViewCreated", new Object[0]);
        super.onViewCreated(view, bundle);
        this.f88462d.mo71364b(true);
        this.f88471m = this.f88462d.mo71370i();
        abh adapter = this.f88462d.f151484a.f122420a.getAdapter();
        if (adapter instanceof bjbf) {
            adapter = ((bjbf) adapter).f122465a;
        }
        bizv bizv = (bizv) adapter;
        this.f88464f = bizv;
        bizv.f122397e = this;
        this.f88465g = (ItemGroup) bizv.f122395a.mo64921b((int) C0126R.C0129id.target_device_item_group);
    }

    /* renamed from: a */
    public final void mo47885a(bizl bizl) {
        if (bizl instanceof aryo) {
            this.f88460b.mo48936a(((aryo) bizl).f88458a, this.f88464f.mo161a(), false);
            return;
        }
        f88459a.mo25418e("Unknown item in the target devices list, type: %s.", bizl.getClass().getSimpleName());
    }

    /* renamed from: a */
    public final void mo48941a(boolean z) {
        if (!z) {
            this.f88471m.setVisibility(4);
        } else {
            this.f88471m.setVisibility(0);
        }
    }
}
