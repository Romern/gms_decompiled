package p000;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.setupdesign.GlifListLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: asai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asai extends Fragment implements asdb, asba {

    /* renamed from: a */
    public static final sek f88581a = ascp.m73787a("Setup", "UI", "SelectWifiFragment");

    /* renamed from: f */
    private static final Pattern f88582f = Pattern.compile(".*");

    /* renamed from: g */
    private static final LocationRequest f88583g = LocationRequest.m66854a();

    /* renamed from: b */
    public arwm f88584b;

    /* renamed from: c */
    public asah f88585c;

    /* renamed from: d */
    public final Object f88586d = new Object();

    /* renamed from: e */
    public ascz f88587e;

    /* renamed from: h */
    private final Map f88588h = new HashMap();

    /* renamed from: i */
    private final Set f88589i = new HashSet();

    /* renamed from: j */
    private asdc f88590j;

    /* renamed from: k */
    private WifiManager f88591k;

    /* renamed from: l */
    private String f88592l;

    /* renamed from: m */
    private boolean f88593m;

    /* renamed from: n */
    private GlifListLayout f88594n;

    /* renamed from: o */
    private ListView f88595o;

    /* renamed from: p */
    private View f88596p;

    /* renamed from: q */
    private View f88597q;

    /* renamed from: r */
    private Button f88598r;

    /* renamed from: s */
    private rjx f88599s;

    /* renamed from: b */
    public static asai m73729b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", str);
        bundle.putBoolean("smartdevice.isWifiOptional", false);
        asai asai = new asai();
        asai.setArguments(bundle);
        return asai;
    }

    /* renamed from: a */
    public final void mo48993a() {
        if (cgrn.m146752b() && !this.f88591k.isWifiEnabled()) {
            this.f88591k.setWifiEnabled(true);
        }
    }

    /* renamed from: c */
    public final void mo49000c() {
        aeig aeig = new aeig();
        aeig.f63417b = true;
        aeig.mo34172a(f88583g);
        rjx rjx = this.f88599s;
        LocationSettingsRequest a = aeig.mo34171a();
        roz b = rpa.m34196b();
        b.f43472a = new aeiq(a, "com.google.android.gms");
        aucb a2 = rjx.mo24701a(b.mo24977a());
        a2.mo50373a(arzz.f88572a);
        a2.mo50372a(new asaa(this));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 4) {
            sek sek = f88581a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i);
            sek.mo25416d(sb.toString(), new Object[0]);
        } else if (i2 == -1) {
            f88581a.mo25409a("Location enabled successfully.", new Object[0]);
        } else if (i2 == 0) {
            f88581a.mo25418e("Enabling location was canceled by user.", new Object[0]);
            mo48998a(true);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88585c = (asah) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement SelectWifiFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activity activity = getActivity();
        if (activity != null) {
            this.f88599s = aeie.m51877b(activity);
            this.f88590j = new asdc(activity, f88582f, this);
            this.f88587e = new ascz(activity);
            this.f88591k = (WifiManager) activity.getApplicationContext().getSystemService("wifi");
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f88592l = arguments.getString("smartdevice.title");
                this.f88593m = arguments.getBoolean("smartdevice.isWifiOptional");
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f88594n = (GlifListLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_wifi_list, viewGroup, false);
        this.f88597q = layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_wifi_enable_location_services, viewGroup, false);
        return this.f88594n;
    }

    public final void onPause() {
        this.f88590j.mo49060b();
        this.f88588h.clear();
        super.onPause();
    }

    public final void onResume() {
        boolean z;
        int i;
        super.onResume();
        Activity activity = getActivity();
        if (activity != null) {
            LocationManager locationManager = (LocationManager) activity.getSystemService("location");
            if (locationManager == null || (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network"))) {
                int i2 = Build.VERSION.SDK_INT;
                z = true;
            } else {
                z = false;
            }
            if (cgrn.m146752b() ? z || !this.f88591k.isWifiEnabled() : z) {
                if (!cgrn.m146752b()) {
                    i = C0126R.string.smartdevice_wifi_unavailable_due_to_location_text;
                } else {
                    i = C0126R.string.smartdevice_wifi_unavailable_text;
                }
                new AlertDialog.Builder(activity.getContainerActivity()).setTitle((int) C0126R.string.smartdevice_wifi_unavailable_due_to_location_title).setMessage(i).setPositiveButton((int) C0126R.string.common_turn_on, new asaf(this)).setNegativeButton((int) C0126R.string.common_cancel, new asae(this)).setCancelable(false).show();
                return;
            }
            mo48999b();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TextUtils.isEmpty(this.f88592l)) {
            this.f88594n.mo71363a(this.f88592l);
        }
        this.f88584b = new arwm(view.getContext());
        ListView a = this.f88594n.mo7880a();
        this.f88595o = a;
        a.setAdapter((ListAdapter) this.f88584b);
        this.f88595o.setOnItemClickListener(new asab(this));
        View view2 = new View(view.getContext());
        this.f88596p = view2;
        view2.setLayoutParams(new AbsListView.LayoutParams(-2, getResources().getDimensionPixelSize(C0126R.dimen.sud_items_padding_vertical)));
        Button button = (Button) this.f88597q.findViewById(C0126R.C0129id.enable_location);
        this.f88598r = button;
        button.setOnClickListener(new asac(this));
        mo48998a(false);
        if (this.f88593m) {
            throw new UnsupportedOperationException("Skipping wifi is not implemented yet");
        }
    }

    /* renamed from: a */
    public final void mo48994a(Exception exc) {
        if (!(exc instanceof rki)) {
            f88581a.mo25415d("Unresolvable exception", exc, new Object[0]);
            return;
        }
        Activity activity = getActivity();
        if (activity == null) {
            f88581a.mo25420f("Activity not available", new Object[0]);
            return;
        }
        try {
            ((rki) exc).mo24808a(activity.getContainerActivity(), 4);
        } catch (IntentSender.SendIntentException e) {
            f88581a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: b */
    public final void mo48999b() {
        List<WifiConfiguration> a = this.f88587e.mo49055a();
        sdo.m34959a(a);
        for (WifiConfiguration wifiConfiguration : a) {
            if (wifiConfiguration.hiddenSSID) {
                this.f88589i.add(ascr.m73791b(wifiConfiguration.SSID));
            } else {
                this.f88588h.put(ascr.m73791b(wifiConfiguration.SSID), wifiConfiguration);
            }
        }
        this.f88590j.mo49058a();
    }

    /* renamed from: a */
    public final void mo48995a(String str) {
        asbb.m73747a(str, false).show(getChildFragmentManager(), "dialog");
    }

    /* renamed from: a */
    public final void mo48996a(String str, String str2) {
        this.f88585c.mo48992a(str, str2, 5, 10, this.f88584b.getCount());
    }

    /* renamed from: a */
    public final void mo48997a(Set set) {
        String str;
        int i;
        WifiInfo connectionInfo = this.f88587e.f88721b.getConnectionInfo();
        if (connectionInfo != null) {
            str = bmxx.m108578b(ascr.m73791b(connectionInfo.getSSID()));
        } else {
            str = "";
        }
        synchronized (this.f88586d) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (!TextUtils.isEmpty(scanResult.SSID) && !this.f88589i.contains(scanResult.SSID)) {
                    if (!str.equals(scanResult.SSID)) {
                        i = this.f88588h.keySet().contains(scanResult.SSID) ? 11 : 10;
                    } else {
                        i = 12;
                    }
                    arwm arwm = this.f88584b;
                    asbk asbk = new asbk(scanResult, i);
                    synchronized (arwm.f88366a) {
                        arwm.f88367b.put(asbk.f88665a, asbk);
                    }
                }
            }
        }
        this.f88584b.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo48998a(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (z) {
            TextView textView = (TextView) this.f88597q.findViewById(C0126R.C0129id.body);
            Button button = (Button) this.f88597q.findViewById(C0126R.C0129id.enable_location);
            if (cgrn.m146752b()) {
                textView.setText((int) C0126R.string.smartdevice_wifi_unavailable_text);
                button.setText((int) C0126R.string.common_turn_on);
            } else {
                textView.setText((int) C0126R.string.smartdevice_wifi_unavailable_due_to_location_text);
                button.setText((int) C0126R.string.smartdevice_action_turn_on_location);
            }
            this.f88595o.setHeaderDividersEnabled(false);
            this.f88595o.addHeaderView(this.f88597q);
            this.f88595o.removeHeaderView(this.f88596p);
        } else {
            this.f88595o.setHeaderDividersEnabled(true);
            this.f88595o.removeHeaderView(this.f88597q);
            this.f88595o.addHeaderView(this.f88596p);
        }
        int i2 = Build.VERSION.SDK_INT;
    }
}
