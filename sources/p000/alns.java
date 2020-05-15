package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.io.PrintWriter;

/* renamed from: alns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alns extends alna {

    /* renamed from: c */
    private final Bundle f73861c;

    public alns(String str, int i, alzm alzm, Bundle bundle) {
        super(str, i, alzm, null, "InternalCall");
        this.f73861c = bundle;
    }

    /* renamed from: c */
    public final Pair mo40604c(Context context) {
        amqv amqv = amqv.f75777c;
        Bundle bundle = this.f73861c;
        Bundle bundle2 = new Bundle();
        String string = bundle.getString("internal_call_method");
        if ("GET_SHOW_SYNC_NOTIFICATION_ERROR".equals(string)) {
            bundle2.putInt("internal_call_result", alsj.m61651a(context).mo40693c());
        } else if ("SET_SHOW_SYNC_NOTIFICATION_ERROR".equals(string)) {
            alsj a = alsj.m61651a(context);
            int i = bundle.getInt("internal_call_arg_1", 0);
            sdo.m34973b((String) null);
            amdk.m62654a("PeoplePreferences", "setShowSyncErrorNotification: %d", i);
            a.f74200a.edit().putInt("show_sync_error_notification", i).commit();
        } else if ("LOAD_LOG".equals(string)) {
            alnr alnr = new alnr();
            altr.m61836a(context, new PrintWriter(alnr), null);
            bundle2.putString("log_text", alnr.f73860a.toString());
        } else if ("GET_FORCE_VERBOSE_LOG".equals(string)) {
            bundle2.putBoolean("internal_call_result", alsj.m61651a(context).f74200a.getBoolean("force_verbose_log", false));
        } else if ("SET_FORCE_VERBOSE_LOG".equals(string)) {
            alsj.m61651a(context).mo40697c(bundle.getBoolean("internal_call_arg_1", false));
        }
        return new Pair(amqv, bundle2);
    }
}
