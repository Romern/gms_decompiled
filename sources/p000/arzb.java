package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: arzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arzb extends Fragment {

    /* renamed from: a */
    private GlifLayout f88503a;

    /* renamed from: b */
    private String f88504b;

    /* renamed from: c */
    private String f88505c;

    /* renamed from: a */
    public static arzb m73701a(String str) {
        return m73702a(str, null);
    }

    /* renamed from: b */
    public static Bundle m73703b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", str);
        if (str2 != null) {
            bundle.putString("smartdevice.message", str2);
        }
        return bundle;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("smartdevice.title");
            sdo.m34959a((Object) string);
            this.f88504b = string;
            if (arguments.containsKey("smartdevice.message")) {
                String string2 = arguments.getString("smartdevice.message");
                sdo.m34959a((Object) string2);
                this.f88505c = string2;
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
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_glif_setup_info, viewGroup, false);
        this.f88503a = glifLayout;
        return glifLayout;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f88503a.mo71363a(this.f88504b);
        if (this.f88505c != null) {
            ((TextView) view.findViewById(C0126R.C0129id.setup_info_text)).setText(this.f88505c);
        }
        this.f88503a.mo71364b(true);
    }

    /* renamed from: a */
    public static arzb m73702a(String str, String str2) {
        sdo.m34959a((Object) str);
        arzb arzb = new arzb();
        arzb.setArguments(m73703b(str, str2));
        return arzb;
    }
}
