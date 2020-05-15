package p000;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: wys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wys extends DialogFragment {

    /* renamed from: a */
    public final wwk f51583a;

    /* renamed from: b */
    private final ErrorReport f51584b;

    public wys(wwk wwk, ErrorReport errorReport) {
        this.f51583a = wwk;
        this.f51584b = errorReport;
    }

    /* renamed from: a */
    public final void mo9306a() {
        String str = this.f51584b.f31527R;
        try {
            String valueOf = String.valueOf(ceeg.m136415t());
            String valueOf2 = String.valueOf(str);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2))));
            this.f51583a.mo29482a(122, this.f51584b);
            getActivity().finish();
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
            sb.append("Can't view ");
            sb.append(str);
            sb.append(" in Play Store");
            Log.w("UpdateDialogFragment", sb.toString(), e);
            this.f51583a.mo29482a(124, this.f51584b);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f51583a.mo29481a();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C1349sg sgVar = new C1349sg(getActivity());
        sgVar.mo15905b((int) C0126R.string.gf_upgrade_title);
        sgVar.mo15912d(C0126R.string.gf_upgrade_message);
        sgVar.mo15906b((int) C0126R.string.common_update, new wyp(this));
        sgVar.mo15892a((int) C0126R.string.common_no_thanks, new wyq(this));
        sgVar.mo15895a(new wyr(this));
        return sgVar.mo15904b();
    }
}
