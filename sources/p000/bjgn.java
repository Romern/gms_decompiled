package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjgn extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public bjgm f122670a;

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        bmxy.m108582a(this.f122670a, "Listener is not provided");
        this.f122670a.mo65149a(-2);
        dismiss();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bmxy.m108582a(this.f122670a, "Listener is not provided.");
        this.f122670a.mo65149a(i);
        dismiss();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.bender3.framework.client.WidgetConfig]
     candidates:
      bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void
      bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void
     arg types: [ut, com.google.android.wallet.bender3.framework.client.WidgetConfig]
     candidates:
      bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean
      bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void */
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        WidgetConfig widgetConfig = (WidgetConfig) arguments.getParcelable("widgetConfig");
        bmxy.m108582a(widgetConfig, "widgetConfig is not provided.");
        Activity activity = getActivity();
        C1416ut utVar = new C1416ut(activity, 0);
        bjhf.m103484a((Context) activity, widgetConfig);
        bjhf.m103483a((ContextWrapper) utVar, widgetConfig);
        bhia bhia = new bhia(utVar);
        bhia.mo63788d(arguments.getString("title"));
        String string = arguments.getString("message");
        if (!TextUtils.isEmpty(string)) {
            bhia.mo63783c(string);
        }
        bhia.mo63789d(arguments.getString("positiveButtonText"), this);
        String string2 = arguments.getString("negativeButtonText");
        if (!TextUtils.isEmpty(string2)) {
            bhia.mo63784c(string2, this);
        }
        return bhia.mo15904b();
    }
}
