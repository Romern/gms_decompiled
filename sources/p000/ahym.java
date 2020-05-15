package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallChimeraActivity;
import com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments.DevicePairingFragment$1;

/* renamed from: ahym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahym extends ahyn {

    /* renamed from: a */
    public Button f68354a;

    /* renamed from: b */
    public Button f68355b;

    /* renamed from: c */
    public TextView f68356c;

    /* renamed from: d */
    public ahyw f68357d;

    /* renamed from: e */
    private View f68358e;

    /* renamed from: f */
    private final BroadcastReceiver f68359f = new DevicePairingFragment$1(this, "HalfSheetStateChange");

    /* renamed from: a */
    public final Intent mo37295a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ahvd.m56713a(str, getActivity())) {
            return CompanionAppInstallChimeraActivity.m67323a(getActivity(), str);
        }
        Intent launchIntentForPackage = getActivity().getPackageManager().getLaunchIntentForPackage(str);
        if (cfoj.m141555e() && str2 != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(launchIntentForPackage == null || defaultAdapter == null)) {
                launchIntentForPackage.putExtra("android.bluetooth.device.extra.DEVICE", defaultAdapter.getRemoteDevice(str2));
            }
        }
        return launchIntentForPackage;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f68358e = layoutInflater.inflate((int) C0126R.C0128layout.fast_pair_device_pairing_fragment, viewGroup, false);
        if (getActivity() == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DevicePairingFragment: can't find the attached activity");
            return this.f68358e;
        }
        byte[] byteArray = getArguments().getByteArray("com.google.android.gms.nearby.discovery.HALF_SHEET");
        boolean z = getArguments().getBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE");
        this.f68354a = (Button) this.f68358e.findViewById(C0126R.C0129id.connect_btn);
        this.f68355b = (Button) this.f68358e.findViewById(C0126R.C0129id.setup_btn);
        this.f68356c = (TextView) this.f68358e.findViewById(C0126R.C0129id.header_subtitle);
        this.f68355b.setVisibility(4);
        ((Button) this.f68358e.findViewById(C0126R.C0129id.cancel_btn)).setOnClickListener(new ahyi(this));
        this.f68355b.setOnClickListener(new ahyj(this));
        ImageView imageView = (ImageView) this.f68358e.findViewById(C0126R.C0129id.pairing_pic);
        if (byteArray != null) {
            try {
                this.f68357d = (ahyw) GeneratedMessageLite.m124016a(ahyw.f68389A, byteArray, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("DevicePairingFragment: error happens when pass info to half sheet");
            }
        }
        this.f68356c.setText(getActivity().getString(C0126R.string.common_download));
        if (z) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DevicePairingFragment: retroactive");
            getActivity().setTitle(getArguments().getString("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME"));
            this.f68354a.setOnClickListener(new ahyk(this, (Intent) getArguments().getParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT")));
        } else {
            getActivity().setTitle(this.f68357d.f68397f);
            this.f68354a.setOnClickListener(new ahyl(this));
        }
        imageView.setImageBitmap(ahys.m56885a(getActivity(), this.f68357d));
        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("DevicePairingFragment: Check the passing info %s", this.f68357d.f68396e.mo73744a());
        return this.f68358e;
    }

    public final void onStart() {
        super.onStart();
        if (getActivity() != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE");
            ahhd.m55767a(getActivity(), this.f68359f, intentFilter);
        }
    }

    public final void onStop() {
        super.onStop();
        if (getActivity() != null) {
            ahhd.m55766a(getActivity(), this.f68359f);
        }
    }
}
