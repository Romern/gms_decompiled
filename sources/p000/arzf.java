package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: arzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arzf extends arze implements arok {

    /* renamed from: b */
    private String f88512b;

    /* renamed from: c */
    private String f88513c;

    /* renamed from: d */
    private String f88514d;

    /* renamed from: e */
    private int f88515e;

    /* renamed from: f */
    private Boolean f88516f;

    /* renamed from: a */
    public static arzf m73710a(String str, String str2, String str3, String str4, int i, boolean z) {
        arzf arzf = new arzf();
        Bundle bundle = new Bundle();
        bundle.putString("verifyTitle", str);
        bundle.putString("verifyText", str2);
        bundle.putString("lockScreenText", str3);
        bundle.putString("nextButtonText", str4);
        bundle.putInt("iconId", i);
        bundle.putBoolean("showCancelButton", z);
        arzf.setArguments(bundle);
        return arzf;
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i == 1) {
            mo48964a();
        } else if (i == 2) {
            this.f88509a.mo48962i();
        } else {
            StringBuilder sb = new StringBuilder(27);
            sb.append("Unknown action: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.f88512b = arguments.getString("verifyTitle", getString(C0126R.string.common_confirm_screen_lock_title));
        this.f88513c = arguments.getString("verifyText", getString(C0126R.string.smartdevice_d2d_lockscreen_verification_text));
        this.f88514d = arguments.getString("nextButtonText", getString(C0126R.string.common_next));
        this.f88515e = arguments.getInt("iconId");
        this.f88516f = Boolean.valueOf(arguments.getBoolean("showCancelButton"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_fragment_container, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        arpg arpg = new arpg();
        arpg.f88058b = this.f88512b;
        arpg.f88059c = this.f88513c;
        arpg.mo48733a(this.f88514d, 1);
        arpg.f88057a = this.f88515e;
        if (this.f88516f.booleanValue()) {
            arpg.mo48735b(getString(C0126R.string.smartdevice_magicwand_cancel_signin), 2);
            arpg.f88062f = true;
        }
        beginTransaction.replace(C0126R.C0129id.fragment_container, arpg.mo48731a());
        beginTransaction.commit();
    }
}
