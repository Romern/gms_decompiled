package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.fastpair.devices.DevicesListFragment$1;

/* renamed from: wsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wsl extends Fragment {

    /* renamed from: a */
    public wsc f51244a;

    /* renamed from: b */
    public wtu f51245b;

    /* renamed from: c */
    public final Handler f51246c = new adzt();

    /* renamed from: d */
    public burh f51247d;

    /* renamed from: e */
    private burf f51248e;

    /* renamed from: f */
    private final BroadcastReceiver f51249f = new DevicesListFragment$1(this, "nearby");

    /* renamed from: g */
    private View f51250g;

    /* renamed from: h */
    private TextView f51251h;

    /* renamed from: c */
    private final void m42212c() {
        this.f51246c.removeCallbacksAndMessages(null);
        this.f51250g.setVisibility(8);
        wtu wtu = this.f51245b;
        wtu.f51328b.clear();
        wtu.f51329c.clear();
        wtu.mo29406a();
    }

    /* renamed from: b */
    public final boolean mo29355b() {
        return this.f51250g.getVisibility() == 0;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.devices_menu, menu);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.devices_fragment_devices_list, viewGroup, false);
        wse wse = (wse) getActivity();
        wse.mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.toolbar));
        wse.mo8628aW().mo15853b(true);
        wse.mo8628aW().mo15846a(true);
        setHasOptionsMenu(true);
        this.f51247d = new burh(getContext());
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(C0126R.C0129id.show_notifications);
        compoundButton.setChecked(this.f51247d.mo73041e());
        ((LinearLayout) inflate.findViewById(C0126R.C0129id.notifications)).setOnClickListener(new wsf(compoundButton));
        compoundButton.setOnCheckedChangeListener(new wsg(this));
        View findViewById = inflate.findViewById(C0126R.C0129id.fast_pair_devices);
        if (soz.m35801d(getContext(), getContext().getPackageName()).isEmpty()) {
            inflate.findViewById(C0126R.C0129id.save_devices).setEnabled(false);
            inflate.findViewById(C0126R.C0129id.no_accounts_error).setVisibility(0);
        } else {
            findViewById.setOnClickListener(new wsh(wse));
        }
        this.f51250g = inflate.findViewById(C0126R.C0129id.scanning_indicator);
        this.f51251h = (TextView) inflate.findViewById(C0126R.C0129id.error);
        wsc wsc = new wsc(getContext());
        this.f51244a = wsc;
        TextView textView = this.f51251h;
        View view = wsc.f51233e;
        if (view != null) {
            view.setVisibility(8);
        }
        wsc.f51233e = textView;
        wsc.mo29347c();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.list);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setAdapter(this.f51244a);
        wtu wtu = new wtu(getContext());
        this.f51245b = wtu;
        wtu.f51330d = new wsi(this);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        wsd.m42208a(getActivity());
        wtv.m42254a(getContext(), bvin.DEVICES_LIST_VIEW_ACTION_BAR_HELP_LINK_CLICKED);
        return true;
    }

    public final void onResume() {
        super.onResume();
        ((wse) getActivity()).mo29348a((int) C0126R.string.common_devices);
    }

    public final void onStart() {
        super.onStart();
        if (this.f51248e == null) {
            this.f51248e = new burf(getContext(), "com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY", new wsj(this));
        }
        this.f51248e.mo73028a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.f51249f, intentFilter);
        mo29354a();
    }

    public final void onStop() {
        m42212c();
        getContext().unregisterReceiver(this.f51249f);
        this.f51248e.mo73029b();
        wtv.m42254a(getContext(), bvin.DEVICES_LIST_VIEW_EXIT);
        super.onStop();
    }

    /* renamed from: a */
    public final void mo29354a() {
        if (burl.m120293a(getContext()) || cfod.m141146f()) {
            this.f51251h.setText((CharSequence) null);
        } else {
            this.f51251h.setText((int) C0126R.string.devices_no_loc);
        }
        if (!burl.m120294a(getContext(), ahfl.m55644a(getContext()))) {
            m42212c();
        } else if (!mo29355b()) {
            getContext().startService(butb.m120413a(getContext()));
            this.f51250g.setVisibility(0);
            this.f51246c.postDelayed(new wsk(this), 12000);
        }
    }
}
