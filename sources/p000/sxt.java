package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: sxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxt {

    /* renamed from: a */
    private static WeakReference f45397a = new WeakReference(null);

    private sxt() {
    }

    /* renamed from: a */
    public static sxt m36563a() {
        sxt sxt = (sxt) f45397a.get();
        if (sxt != null) {
            return sxt;
        }
        sxt sxt2 = new sxt();
        f45397a = new WeakReference(sxt2);
        return sxt2;
    }

    /* renamed from: b */
    public static final void m36568b(Context context, UUID uuid, int i, tdl tdl) {
        m36565a(context, uuid, i, Bundle.EMPTY, tdl);
    }

    /* renamed from: a */
    public static final void m36564a(Context context, UUID uuid, int i, Bundle bundle, ArrayList arrayList, String str, tdl tdl) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION");
        startIntent.putExtra("eventmanager.session_id", uuid.toString());
        startIntent.putExtra("eventmanager.trigger_type", i);
        startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
        startIntent.putExtra("eventmanager.extra_param", bundle);
        startIntent.putStringArrayListExtra("gaia_tokens", arrayList);
        startIntent.putExtra("iid_token", str);
        context.startService(startIntent);
    }

    /* renamed from: a */
    public static final void m36565a(Context context, UUID uuid, int i, Bundle bundle, tdl tdl) {
        m36564a(context, uuid, i, bundle, null, null, tdl);
    }

    /* renamed from: a */
    public static final void m36566a(Context context, UUID uuid, int i, tdl tdl) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH");
        startIntent.putExtra("eventmanager.session_id", uuid.toString());
        startIntent.putExtra("eventmanager.trigger_type", i);
        startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
        context.startService(startIntent);
    }

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
    /* renamed from: a */
    public static final void m36567a(Context context, UUID uuid, tdl tdl) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS");
        startIntent.putExtra("eventmanager.session_id", uuid.toString());
        startIntent.putExtra("eventmanager.generate_iid_token", true);
        startIntent.putExtra("eventmanager.generate_gaia_tokens", true);
        startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
        context.startService(startIntent);
    }
}
