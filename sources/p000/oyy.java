package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: oyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyy extends ozg {

    /* renamed from: a */
    pbv f38641a;

    /* renamed from: a */
    public static oyy m30025a(boolean z, boolean z2) {
        oyy oyy = new oyy();
        Bundle bundle = new Bundle();
        bundle.putBoolean("PreSetupIntroFragment.isKeyguardLocked", z);
        bundle.putBoolean("PreSetupIntroFragment.showRetryMessage", z2);
        oyy.setArguments(bundle);
        return oyy;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f38641a == null) {
            Activity activity = getActivity();
            sdo.m34959a(activity);
            oyz oyz = mo22803b().f38656b;
            oyz.getClass();
            this.f38641a = new pbv(activity, new oyx(oyz));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Activity activity = getActivity();
        sdo.m34959a(activity);
        View a = mo22802a(activity, layoutInflater, viewGroup, true);
        m30034a(activity, a, (int) C0126R.C0127drawable.car_bottom_sheet_apps_illustration, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_title, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_body);
        Button button = (Button) a.findViewById(C0126R.C0129id.bs_accept_button);
        Button button2 = (Button) a.findViewById(C0126R.C0129id.bs_decline_button);
        Bundle arguments = getArguments();
        sdo.m34959a(arguments);
        boolean z = arguments.getBoolean("PreSetupIntroFragment.isKeyguardLocked", false);
        int b = oyh.f38613a.mo22781b(activity);
        if (!z) {
            i = b == 3 ? C0126R.string.common_install : C0126R.string.common_update;
        } else {
            i = C0126R.string.car_setup_unlock_to_proceed_sentence_case;
        }
        button.setVisibility(0);
        button.setText(i);
        button.setOnClickListener(new oyv(this, z));
        button2.setVisibility(8);
        button2.setText((int) C0126R.string.common_no_thanks);
        button2.setOnClickListener(new oyw(this));
        return a;
    }

    public final void onStart() {
        super.onStart();
        pbv pbv = this.f38641a;
        sdo.m34959a(pbv);
        pbv.mo22891a(mo22789a());
        Bundle arguments = getArguments();
        sdo.m34959a(arguments);
        if (arguments.getBoolean("PreSetupIntroFragment.showRetryMessage", false)) {
            View view = getView();
            sdo.m34959a(view);
            bhnh.m101201a(view, (int) C0126R.string.car_welcome_download_retry_toast_message, 0).mo64020c();
        }
    }

    /* renamed from: a */
    public final bpeb mo22789a() {
        Bundle arguments = getArguments();
        sdo.m34959a(arguments);
        if (arguments.getBoolean("PreSetupIntroFragment.isKeyguardLocked", false)) {
            return bpeb.FRX_PRESETUP_INTRO_LOCKED;
        }
        Bundle arguments2 = getArguments();
        sdo.m34959a(arguments2);
        if (arguments2.getBoolean("PreSetupIntroFragment.showRetryMessage", false)) {
            return bpeb.FRX_PRESETUP_INTRO_DOWNLOAD_RETRY;
        }
        return bpeb.FRX_PRESETUP_INTRO;
    }
}
