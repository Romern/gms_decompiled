package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arxy extends Fragment {

    /* renamed from: a */
    public static final Logger f88430a = ascp.m73787a("Setup", "UI", "D2DConnectionFragment");

    /* renamed from: b */
    public final arxx f88431b = new arxx();

    /* renamed from: c */
    public arba f88432c;

    /* renamed from: d */
    public D2DDevice f88433d;

    /* renamed from: e */
    public int f88434e;

    /* renamed from: f */
    public String f88435f;

    /* renamed from: g */
    public BootstrapOptions f88436g;

    /* renamed from: h */
    public final arar f88437h = new arxk(this);

    /* renamed from: i */
    public final ardt f88438i = new arxm(this);

    /* renamed from: j */
    private final arao f88439j = new arxl(this);

    /* renamed from: a */
    public final void mo48922a() {
        f88430a.logVerbose(String.format("Connecting to target: %s", this.f88433d.f107874c), new Object[0]);
        if (cgql.m146579d()) {
            this.f88432c.mo48360a(new ConnectionRequest(this.f88433d, this.f88435f, null, null, null, this.f88434e), this.f88437h).mo50372a(new arxd(this));
            return;
        }
        arba arba = this.f88432c;
        D2DDevice d2DDevice = this.f88433d;
        String str = this.f88435f;
        arar arar = this.f88437h;
        roz b = rpa.m34196b();
        b.f43472a = new arkl(arba, d2DDevice, str, arar);
        aucb b2 = arba.mo24732b(b.mo24977a());
        b2.mo50373a(new arkm(arba));
        b2.mo50372a(new arxe(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        f88430a.logVerbose("onDestroy", new Object[0]);
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        this.f88431b.mo48921a((arxn) null);
    }

    public final void onResume() {
        super.onResume();
        try {
            this.f88431b.mo48921a((arxn) getActivity());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Containing activity must implement D2DConnectionFragment.Listener", e);
        }
    }

    /* renamed from: a */
    public final void mo48923a(Bundle bundle) {
        arba arba = this.f88432c;
        roz b = rpa.m34196b();
        b.f43472a = new arkq(bundle);
        arba.mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo48924a(BootstrapConfigurations bootstrapConfigurations) {
        arba arba = this.f88432c;
        D2DDevice d2DDevice = this.f88433d;
        arao arao = this.f88439j;
        roz b = rpa.m34196b();
        b.f43472a = new arkp(arba, d2DDevice, bootstrapConfigurations, arao);
        arba.mo24732b(b.mo24977a());
    }
}
