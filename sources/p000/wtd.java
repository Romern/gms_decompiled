package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.SwitchCompat;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: wtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wtd extends Fragment {

    /* renamed from: a */
    public buru f51278a;

    /* renamed from: b */
    public List f51279b;

    /* renamed from: c */
    public Spinner f51280c;

    /* renamed from: d */
    public SwitchCompat f51281d;

    /* renamed from: e */
    public View f51282e;

    /* renamed from: f */
    public ProgressBar f51283f;

    /* renamed from: g */
    public RecyclerView f51284g;

    /* renamed from: h */
    public wsp f51285h;

    /* renamed from: i */
    private final List f51286i = new ArrayList();

    /* renamed from: j */
    private Executor f51287j;

    /* renamed from: k */
    private wta f51288k;

    /* renamed from: l */
    private TextView f51289l;

    /* renamed from: m */
    private final AdapterView.OnItemSelectedListener f51290m = new wsz(this);

    /* renamed from: d */
    private final void m42228d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) this.f51278a.mo73055a((Account) this.f51279b.get(this.f51280c.getSelectedItemPosition())).get());
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wtd", "d", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error getting devices from Footprints.");
        }
        if (getActivity() != null) {
            getActivity().runOnUiThread(new wsw(this, arrayList));
        }
    }

    /* renamed from: a */
    public final void mo29379a() {
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wtd", "a", 204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("FastPairAccountSettingsFragment: updateAccountSelection");
        Account b = mo29380b();
        try {
            this.f51289l.setText(getString(C0126R.string.fast_pair_saved_to_account, b.name));
        } catch (NullPointerException e) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("wtd", "a", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Fast Pair resource string not found.");
        }
        this.f51283f.setVisibility(0);
        this.f51285h.mo29359a(bngx.m109376e());
        this.f51281d.setEnabled(false);
        if (getContext() != null) {
            wtv.m42254a(getContext(), bvin.FAST_PAIR_ACCOUNT_SETTINGS_SWITCHED);
        }
        mo29381c().execute(new wsv(this, b));
    }

    /* renamed from: b */
    public final Account mo29380b() {
        return (Account) this.f51279b.get(this.f51280c.getSelectedItemPosition());
    }

    /* renamed from: c */
    public final Executor mo29381c() {
        if (this.f51287j == null) {
            this.f51287j = snp.m35704b(9);
        }
        return this.f51287j;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List d = soz.m35801d(getContext(), getContext().getPackageName());
        this.f51279b = d;
        if (d.isEmpty()) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wtd", "onCreate", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No accounts on device, we shouldn't be here!");
            getActivity().getSupportFragmentManager().popBackStackImmediate();
        }
        this.f51278a = new buru(getContext(), buqh.m120234a("FastPair").mo72986c());
        wtv.m42254a(getContext(), bvin.FAST_PAIR_ACCOUNT_SETTINGS_LAUNCHED);
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fast_pair_fragment_account_settings, viewGroup, false);
        deu deu = (deu) getActivity();
        Toolbar toolbar = (Toolbar) inflate.findViewById(C0126R.C0129id.toolbar);
        deu.mo8626a(toolbar);
        deu.mo8628aW().mo15855c((int) C0126R.string.fast_pair_account_settings_title);
        deu.mo8628aW().mo15853b(true);
        deu.mo8628aW().mo15846a(true);
        setHasOptionsMenu(true);
        toolbar.mo1678a(new wsq(this));
        SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(C0126R.C0129id.save_devices);
        this.f51281d = switchCompat;
        switchCompat.setOnCheckedChangeListener(new wsr(this));
        inflate.findViewById(C0126R.C0129id.save_devices_preference).setOnClickListener(new wss(this));
        this.f51280c = (Spinner) inflate.findViewById(C0126R.C0129id.account_spinner);
        wta wta = new wta(deu, this.f51279b);
        this.f51288k = wta;
        this.f51280c.setAdapter((SpinnerAdapter) wta);
        this.f51280c.setOnItemSelectedListener(this.f51290m);
        this.f51282e = inflate.findViewById(C0126R.C0129id.list_title_holder);
        this.f51289l = (TextView) inflate.findViewById(C0126R.C0129id.saved_to_account);
        this.f51283f = (ProgressBar) inflate.findViewById(C0126R.C0129id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.list);
        this.f51284g = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new aah());
        wsp wsp = new wsp(getActivity(), this.f51284g);
        this.f51285h = wsp;
        this.f51284g.setAdapter(wsp);
        mo29379a();
        for (Account account : this.f51279b) {
            wtc wtc = new wtc(account, this);
            this.f51286i.add(wtc);
            this.f51278a.mo73056a(wtc, account);
        }
        return inflate;
    }

    public final void onDestroyView() {
        this.f51278a.mo73065c();
        List list = this.f51286i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wtc wtc = (wtc) list.get(i);
            wtc.f51276a = null;
            wtc.f51277b = null;
        }
        this.f51286i.clear();
        super.onDestroyView();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        wsd.m42208a(getActivity());
        wtv.m42254a(getContext(), bvin.FAST_PAIR_ACCOUNT_SETTINGS_ACTION_BAR_HELP_LINK_CLICKED);
        return true;
    }

    public final void onResume() {
        super.onResume();
        ((wse) getActivity()).mo29348a((int) C0126R.string.fast_pair_account_settings_title);
    }
}
