package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: ozk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ozk extends ozg {
    /* renamed from: a */
    public final bpeb mo22789a() {
        return bpeb.FRX_PRESETUP_UNPLUG_REPLUG;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        sdo.m34959a(activity);
        View a = mo22802a(activity, layoutInflater, viewGroup, false);
        m30034a(activity, a, (int) C0126R.C0127drawable.car_bottom_sheet_apps_illustration, (int) C0126R.string.car_setup_bottom_sheet_update_complete_title, (int) C0126R.string.car_setup_bottom_sheet_update_complete_description);
        return a;
    }
}
