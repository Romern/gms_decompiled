package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azis implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ azit f99491a;

    public azis(azit azit) {
        this.f99491a = azit;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f99491a.f99496e.mo55125a(279);
        new azir(this).start();
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.erase_all_messages"), this.f99491a.f99493b);
        azqf.m86130a(this.f99491a.f99493b);
        if (azqf.m86149c()) {
            MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.ERASE_ALL_LIGHTER_MESSAGES"), this.f99491a.f99493b);
        }
        Context context = this.f99491a.f99493b;
        azpi.m86068a(context, context.getString(C0126R.string.ms_erase_all_messages_done));
        this.f99491a.f99494c.dismiss();
    }
}
