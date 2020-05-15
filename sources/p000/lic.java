package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.autofill.smsretriever.TracingSmsBroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lic {

    /* renamed from: c */
    public static final /* synthetic */ int f26135c = 0;

    /* renamed from: d */
    private static final srn f26136d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final bqgy f26137a;

    /* renamed from: b */
    public final hxu f26138b;

    /* renamed from: e */
    private final Context f26139e;

    /* renamed from: f */
    private final BroadcastReceiver f26140f;

    /* renamed from: g */
    private final AtomicBoolean f26141g = new AtomicBoolean(false);

    public lic(Context context) {
        bqgy c = bqgy.m112818c();
        hze hze = new hze(context);
        this.f26139e = context;
        this.f26137a = c;
        TracingSmsBroadcastReceiver tracingSmsBroadcastReceiver = new TracingSmsBroadcastReceiver(c);
        this.f26140f = tracingSmsBroadcastReceiver;
        this.f26139e.registerReceiver(tracingSmsBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED"));
        this.f26138b = hze;
    }

    /* renamed from: a */
    public final void mo15157a() {
        if (this.f26141g.compareAndSet(false, true)) {
            try {
                this.f26139e.unregisterReceiver(this.f26140f);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f26136d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lic", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("unregistering broadcast receiver failed");
            }
        }
    }
}
