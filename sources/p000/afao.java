package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;

/* renamed from: afao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afao extends afce {

    /* renamed from: a */
    private CheckBox f64096a;

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.provisioning_failed_view, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(C0126R.C0129id.message)).setText(arguments.getString("dialog_content_message"));
        this.f64096a = (CheckBox) linearLayout.findViewById(C0126R.C0129id.disable_magictether_checkbox);
        AlertDialog.Builder view = new AlertDialog.Builder(getActivity()).setTitle(arguments.getString("dialog_content_title")).setPositiveButton((int) C0126R.string.common_ok, (DialogInterface.OnClickListener) null).setView(linearLayout);
        if (cfcs.m138695b()) {
            this.f64096a.setChecked(false);
            this.f64096a.setVisibility(8);
        }
        return view.create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f64096a.isChecked() && !cfcs.m138695b()) {
            aezv a = afaj.m52782a(getActivity());
            boolean b = a.mo34695b();
            a.mo34694b("com.google.android.gms.magictether.IS_HOST_TETHERING_ENABLED", false);
            if (b) {
                a.f64055a.stopService(TetherListenerChimeraService.m67140a(a.f64055a));
                afal.m52785a(a.f64055a).mo34712a();
            }
        }
    }
}
