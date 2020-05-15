package p000;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import java.util.Date;
import java.util.Locale;

/* renamed from: qpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpe extends Fragment {

    /* renamed from: a */
    public qpp f41912a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Activity activity2 = getActivity();
        if (activity2 instanceof qpp) {
            this.f41912a = (qpp) activity2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.fragment_module_details, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.f41912a = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        if (activity != null) {
            sre.m36089i(activity);
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("chimera_module_item_key")) {
            qpp qpp = this.f41912a;
            if (qpp != null) {
                qpp.mo17639a(getString(C0126R.string.unexpected_err_msg));
                return;
            }
            return;
        }
        ModuleItem moduleItem = (ModuleItem) arguments.getParcelable("chimera_module_item_key");
        if (moduleItem != null) {
            String valueOf = String.valueOf(DateUtils.getRelativeTimeSpanString(moduleItem.f30000f, System.currentTimeMillis(), 1000));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("updated ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            ((TextView) view.findViewById(C0126R.C0129id.module_id)).setText(qpr.m32629a(moduleItem.f29996b));
            ((TextView) view.findViewById(C0126R.C0129id.module_set_variant)).setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(moduleItem.f29997c)));
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.container_apk_type);
            int i = moduleItem.f29999e;
            if (i != 1) {
                str = i != 2 ? i != 3 ? i != 4 ? "Unknown APK" : "Split APK" : "File APK" : "Installed APK";
            } else {
                str = "Container APK";
            }
            textView.setText(str);
            ((TextView) view.findViewById(C0126R.C0129id.container_apk_path)).setText(moduleItem.f29998d);
            ((TextView) view.findViewById(C0126R.C0129id.apk_version_name)).setText(moduleItem.f30001g);
            ((TextView) view.findViewById(C0126R.C0129id.apk_version_code)).setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(moduleItem.f30002h)));
            ((TextView) view.findViewById(C0126R.C0129id.last_updated_date)).setText(new Date(moduleItem.f30000f).toString());
            ((TextView) view.findViewById(C0126R.C0129id.last_updated_elapsed)).setText(sb2);
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.star_image);
            if (moduleItem.f30003i) {
                imageView.setImageResource(17301516);
            } else {
                imageView.setImageResource(17301515);
            }
            imageView.setOnClickListener(new qpd(this, arguments));
        }
    }
}
