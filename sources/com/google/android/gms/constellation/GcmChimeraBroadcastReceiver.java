package com.google.android.gms.constellation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    public static final sek f30470b = tea.m36798a("gcm_receiver");

    /* renamed from: c */
    public tds f30471c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onReceive(Context context, Intent intent) {
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            if (cdfw.f180710a.mo6606a().mo77451f()) {
                this.f30471c = tds.m36774a(context);
                f30470b.mo25412b("Received tickle", new Object[0]);
                UUID randomUUID = UUID.randomUUID();
                String stringExtra = intent.getStringExtra("event");
                sxv sxv = new sxv(this, new snr(new sns(10)), randomUUID);
                this.f30471c.mo26401a(randomUUID, 9);
                if ("sync".equals(stringExtra)) {
                    sxt.m36563a();
                    sxt.m36568b(context.getApplicationContext(), randomUUID, 9, sxv);
                } else if ("sync_if_mismatch".equals(stringExtra)) {
                    sxt.m36563a();
                    sxt.m36566a(context.getApplicationContext(), randomUUID, 9, sxv);
                }
            } else {
                f30470b.mo25414c("Received push but receiver disabled", new Object[0]);
            }
        } else {
            sxt.m36563a();
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS");
            startIntent.putExtra("eventmanager.generate_iid_token", true);
            startIntent.putExtra("eventmanager.force_refresh", true);
            context.startService(startIntent);
        }
    }
}
