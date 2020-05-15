package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: arza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arza extends Fragment {

    /* renamed from: a */
    public static final Logger f88493a = ascp.m73787a("Setup", "UI", "FingerprintFragment");

    /* renamed from: b */
    public aryz f88494b;

    /* renamed from: c */
    private FingerprintManager f88495c;

    /* renamed from: d */
    private String f88496d;

    /* renamed from: e */
    private String f88497e;

    /* renamed from: f */
    private String f88498f;

    /* renamed from: g */
    private Boolean f88499g;

    /* renamed from: h */
    private TextView f88500h;

    /* renamed from: i */
    private CancellationSignal f88501i;

    /* renamed from: j */
    private final FingerprintManager.AuthenticationCallback f88502j = new aryx(this);

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88494b = (aryz) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implementFingerprintFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.title");
        sdo.m34977c(string);
        this.f88496d = string;
        String string2 = arguments.getString("smartdevice.message");
        sdo.m34977c(string2);
        this.f88497e = string2;
        this.f88499g = Boolean.valueOf(arguments.getBoolean("isMagicWand"));
        Activity activity = getActivity();
        if (activity != null) {
            this.f88495c = (FingerprintManager) activity.getSystemService("fingerprint");
        }
        this.f88501i = new CancellationSignal();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!this.f88499g.booleanValue()) {
            i = C0126R.C0128layout.smartdevice_setup_fingerprint;
        } else {
            i = C0126R.C0128layout.magicwand_fingerprint;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        if (!this.f88499g.booleanValue()) {
            biyo biyo = new biyo(glifLayout.getContext());
            biyo.mo64883a(C0126R.string.common_skip_fingerprint);
            biyo.f122328c = 7;
            biyo.f122329d = 2132018230;
            ((biyn) glifLayout.mo71342a(biyn.class)).mo52735b(biyo.mo64882a());
        }
        return glifLayout;
    }

    public final void onPause() {
        super.onPause();
        f88493a.mo25412b("onPause", new Object[0]);
        f88493a.mo25412b("stopAuthentication", new Object[0]);
        this.f88501i.cancel();
    }

    public final void onResume() {
        super.onResume();
        f88493a.mo25412b("onResume", new Object[0]);
        f88493a.mo25412b("startAuthentication", new Object[0]);
        this.f88495c.authenticate(null, this.f88501i, 0, this.f88502j, null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("smartdevice.detailedMessage", this.f88498f);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GlifLayout glifLayout = (GlifLayout) view.findViewById(C0126R.C0129id.glif_layout);
        glifLayout.mo71363a(this.f88496d);
        ((TextView) view.findViewById(C0126R.C0129id.message)).setText(this.f88497e);
        if (this.f88499g.booleanValue()) {
            view.findViewById(C0126R.C0129id.skip_fingerprint).setOnClickListener(new aryv(this));
            view.findViewById(C0126R.C0129id.cancel_fingerprint).setOnClickListener(new aryy(this));
        } else {
            ((biyn) glifLayout.mo71342a(biyn.class)).f122315g.f122336f = new aryw(this);
        }
        this.f88500h = (TextView) view.findViewById(C0126R.C0129id.error_message);
        if (bundle != null) {
            mo48959a(bundle.getString("smartdevice.detailedMessage"));
        }
    }

    /* renamed from: a */
    public static arza m73698a(String str, String str2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        arza arza = new arza();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", str);
        bundle.putString("smartdevice.message", str2);
        bundle.putBoolean("isMagicWand", z);
        arza.setArguments(bundle);
        return arza;
    }

    /* renamed from: a */
    public static boolean m73699a(Context context) {
        FingerprintManager fingerprintManager = (FingerprintManager) context.getApplicationContext().getSystemService("fingerprint");
        return fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints();
    }

    /* renamed from: a */
    public final void mo48959a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f88498f = str;
            this.f88500h.setVisibility(0);
            this.f88500h.setText(str);
        }
    }
}
