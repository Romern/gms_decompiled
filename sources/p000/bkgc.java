package p000;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: bkgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgc extends bkbq implements DialogInterface.OnClickListener, bjxu {
    /* renamed from: d */
    private final void m105657d() {
        bkgb bkgb;
        if (getTargetFragment() instanceof bkgb) {
            bkgb = (bkgb) getTargetFragment();
        } else {
            bkgb = getActivity() instanceof bkgb ? (bkgb) getActivity() : null;
        }
        if (bkgb != null) {
            getArguments().getInt("errorAction", 1);
            getArguments().getParcelable("tag");
            bkgb.mo65977a();
        }
    }

    /* renamed from: a */
    public final Dialog mo9306a() {
        Bundle arguments = getArguments();
        bkbj bkbj = new bkbj(mo65815b());
        bkbj.mo65780a(arguments.getString("title"));
        View inflate = mo65816c().inflate((int) C0126R.C0128layout.view_wallet_dialog, (ViewGroup) null);
        InfoMessageView infoMessageView = (InfoMessageView) inflate.findViewById(C0126R.C0129id.info_message);
        infoMessageView.f152081e = arguments.getBoolean("linkifyMessage", true);
        infoMessageView.mo72003a((bmnr) bjvp.m104730a(arguments, "infoMessage", (bxxk) bmnr.f130153o.mo74142c(7)));
        infoMessageView.setVisibility(0);
        infoMessageView.f152084h = this;
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.details);
        String string = arguments.getString("details");
        if (TextUtils.isEmpty(string)) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
        }
        bkbj.mo65783b(inflate);
        bkbj.mo65784b(arguments.getString("positiveButtonText"), this);
        String string2 = arguments.getString("negativeButtonText");
        if (!TextUtils.isEmpty(string2)) {
            bkbj.mo65781a(string2, this);
        }
        return bkbj.mo65776a();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m105657d();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m105657d();
        dismiss();
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        Activity activity = getActivity();
        Intent a = bkfr.m105546a(activity, str);
        try {
            activity.startActivity(a);
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(a.toString());
            Log.w("WalletDialogFragment", valueOf.length() == 0 ? new String("Actvity was not found for intent, ") : "Actvity was not found for intent, ".concat(valueOf));
        }
    }
}
