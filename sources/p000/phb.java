package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;

/* renamed from: phb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phb extends Fragment {

    /* renamed from: a */
    public final Handler f39094a = new adzt();

    /* renamed from: b */
    public final Runnable f39095b = new pgz(this);

    /* renamed from: c */
    public phy f39096c;

    /* renamed from: d */
    private pes f39097d;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getActivity().getApplicationContext();
        this.f39097d = pes.m30267a(applicationContext, "ConnectingFragment");
        this.f39096c = new phy(applicationContext, this.f39097d.f38981e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.cast_nearby_fragment_connecting, viewGroup, false);
        phj phj = (phj) ((CastNearbyPinChimeraActivity) getActivity()).f29865b;
        phj.f39114c.mo23673b("START Listening for audio pin.", new Object[0]);
        phj.f39119h.mo23104a();
        new phi(phj, "playaudio", phj.f39139m.getIntent().getStringArrayListExtra("BSSID_LIST"), phj.f39139m.getIntent().getStringArrayListExtra("BLE_TOKENS")).start();
        phj.f39116e = false;
        if (phj.f39118g == null) {
            phj.f39118g = new qae(phj.f39139m);
        }
        qae qae = phj.f39118g;
        qae.f40779b.mo11651a(phj.f39123l, phj.f39122k).mo50371a(qac.f40776a);
        phj.f39115d.postDelayed(phj.f39121j, phj.f39111b);
        inflate.findViewById(C0126R.C0129id.skip_button).setOnClickListener(new pha(this));
        return inflate;
    }

    public final void onDestroy() {
        this.f39094a.removeCallbacksAndMessages(null);
        this.f39096c = null;
        pes pes = this.f39097d;
        if (pes != null) {
            pes.mo22984a("ConnectingFragment");
            this.f39097d = null;
        }
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        this.f39094a.postDelayed(this.f39095b, phj.f39111b);
    }
}
