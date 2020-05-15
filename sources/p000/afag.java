package p000;

import android.content.DialogInterface;
import android.os.ResultReceiver;
import com.google.android.gms.magictether.host.HotspotEnablerIntentOperation;

/* renamed from: afag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afag implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f64085a;

    /* renamed from: b */
    final /* synthetic */ afah f64086b;

    public afag(afah afah, ResultReceiver resultReceiver) {
        this.f64086b = afah;
        this.f64085a = resultReceiver;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.magictether.host.HotspotEnablerIntentOperation.a(android.content.Context, boolean, android.os.ResultReceiver):android.content.Intent
     arg types: [android.content.Context, int, android.os.ResultReceiver]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.magictether.host.HotspotEnablerIntentOperation.a(android.content.Context, boolean, android.os.ResultReceiver):android.content.Intent */
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f64086b.getContext().startService(HotspotEnablerIntentOperation.m67139a(this.f64086b.getContext(), true, this.f64085a));
        afba a = afaz.m52798a();
        if (cfcm.m138682b()) {
            a.f64113b.mo24383c("magictether_setup_dialog_continue_tapped_count").mo24359a();
            a.f64113b.mo24388e();
        }
    }
}
