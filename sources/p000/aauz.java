package p000;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aauz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauz extends DialogFragment {

    /* renamed from: a */
    private boolean f56635a;

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        HelpConfig helpConfig = ((HelpChimeraActivity) getActivity()).f56986y;
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.gh_operation_hours_dialog, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.gh_operation_hours_items);
        for (bzps bzps : helpConfig.mo43246u()) {
            bzps a = aatw.m47000a(bzps, this.f56635a, helpConfig, getContext());
            if (a != bzps.UNKNOWN_CONTACT_MODE) {
                bzql a2 = aatw.m47001a(a, helpConfig);
                bzps a3 = bzps.m126020a(a2.f171026b);
                if (a3 == null) {
                    a3 = bzps.UNKNOWN_CONTACT_MODE;
                }
                bxvd bxvd = (bxvd) a2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a2);
                if (a2.f171029e || !helpConfig.mo43225b(a3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bzql bzql = (bzql) bxvd.f164949b;
                bzql bzql2 = bzql.f171023f;
                bzql.f171025a |= 4;
                bzql.f171029e = z;
                bzql bzql3 = (bzql) bxvd.mo74062i();
                if (aatw.m47005a(bzql3)) {
                    new aauw(bzql3, linearLayout, C0126R.C0128layout.gh_operation_hours_dialog_item, null);
                }
                if (a3 == bzps.PHONE || a3 == bzps.C2C) {
                    this.f56635a = true;
                }
            }
        }
        C1349sg sgVar = new C1349sg(getContext());
        sgVar.mo15907b(inflate);
        C1350sh b = sgVar.mo15904b();
        inflate.findViewById(C0126R.C0129id.gh_operation_hours_ok_button).setOnClickListener(new aaux(b));
        inflate.findViewById(C0126R.C0129id.gh_operation_hours_transparent_layout).setOnClickListener(new aauy(b));
        Window window = b.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return b;
    }
}
