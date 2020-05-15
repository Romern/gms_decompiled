package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: asat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asat extends Fragment {

    /* renamed from: a */
    public int f88623a;

    /* renamed from: b */
    Drawable f88624b;

    /* renamed from: c */
    public asas f88625c;

    /* renamed from: d */
    private GlifLayout f88626d;

    /* renamed from: e */
    private String f88627e;

    /* renamed from: f */
    private String f88628f;

    /* renamed from: g */
    private String f88629g;

    /* renamed from: h */
    private boolean f88630h;

    /* renamed from: i */
    private boolean f88631i;

    /* renamed from: a */
    public static asat m73743a(int i, String str, String str2, String str3, Integer num, boolean z, boolean z2) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        sdo.m34959a((Object) str3);
        asat asat = new asat();
        Bundle bundle = new Bundle();
        bundle.putInt("smartdevice.id", i);
        bundle.putString("smartdevice.title", str);
        bundle.putString("smartdevice.message", str2);
        bundle.putString("smartdevice.nextButtonText", str3);
        bundle.putBoolean("isMagicWand", z);
        bundle.putBoolean("showButton", z2);
        if (num != null) {
            bundle.putInt("icon", num.intValue());
        }
        asat.setArguments(bundle);
        return asat;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            try {
                this.f88625c = (asas) parentFragment;
            } catch (ClassCastException e) {
                throw new RuntimeException("Containing fragment must implement WifiPasswordFragment.Listener", e);
            }
        } else {
            try {
                this.f88625c = (asas) activity;
            } catch (ClassCastException e2) {
                throw new RuntimeException("Containing activity must implement WifiPasswordFragment.Listener", e2);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.f88623a = arguments.getInt("smartdevice.id");
        String string = arguments.getString("smartdevice.title");
        sdo.m34959a((Object) string);
        this.f88627e = string;
        String string2 = arguments.getString("smartdevice.message");
        sdo.m34959a((Object) string2);
        this.f88628f = string2;
        this.f88629g = arguments.getString("smartdevice.nextButtonText");
        this.f88630h = arguments.getBoolean("isMagicWand");
        this.f88631i = arguments.getBoolean("showButton");
        if (arguments.containsKey("icon")) {
            Activity activity = getActivity();
            sdo.m34959a(activity);
            this.f88624b = activity.getDrawable(arguments.getInt("icon"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!this.f88630h) {
            i = C0126R.C0128layout.smartdevice_glif_text_confirmation;
        } else {
            i = C0126R.C0128layout.magicwand_text_confirmation;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        this.f88626d = glifLayout;
        if (!this.f88630h) {
            biyo biyo = new biyo(this.f88626d.getContext());
            biyo.mo64883a(C0126R.string.sud_next_button_label);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            ((biyn) glifLayout.mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
        }
        return this.f88626d;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f88626d.mo71363a(this.f88627e);
        Drawable drawable = this.f88624b;
        if (drawable != null) {
            this.f88626d.mo71362a(drawable);
        }
        ((TextView) view.findViewById(C0126R.C0129id.confirmation_text)).setText(this.f88628f);
        if (this.f88630h) {
            Button button = (Button) view.findViewById(C0126R.C0129id.text_confirmation_fragment_next_button);
            button.setText(this.f88629g);
            button.setOnClickListener(new asaq(this));
            if (!this.f88631i) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        biyp biyp = ((biyn) this.f88626d.mo71342a(biyn.class)).f122314f;
        biyp.mo64887a((CharSequence) this.f88629g);
        biyp.f122336f = new asar(this);
    }

    /* renamed from: a */
    public static asat m73744a(int i, String str, String str2, String str3, boolean z) {
        return m73743a(i, str, str2, str3, null, true, z);
    }

    /* renamed from: a */
    public static asat m73745a(String str, String str2, String str3) {
        return m73743a(0, str, str2, str3, null, false, true);
    }
}
