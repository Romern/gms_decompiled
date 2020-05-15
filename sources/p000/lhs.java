package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.sharedpreferences.Change;

/* renamed from: lhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhs implements lht, lhu {

    /* renamed from: a */
    private static final srn f26116a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final Context f26117b;

    public lhs(Context context) {
        this.f26117b = context;
    }

    /* renamed from: a */
    private final void m19135a(String str, String str2, Change change) {
        Intent startIntent = IntentOperation.getStartIntent(this.f26117b, "com.google.android.gms.autofill.sharedpreferences.RemoteIntentOperation", str);
        if (startIntent == null) {
            ((bnsl) f26116a.mo68388c()).mo68405a("IntentOperation.getStartIntent() failed.");
            return;
        }
        startIntent.putExtra("method", str2);
        if (change != null) {
            startIntent.putExtra("change", change);
        }
        this.f26117b.startService(startIntent);
    }

    /* renamed from: b */
    public final void mo15122b(Change change) {
        m19135a("com.google.android.gms.autofill.sharedpreferences.MASTER", "request_change", change);
    }

    /* renamed from: c */
    public final void mo15123c(Change change) {
        m19135a("com.google.android.gms.autofill.sharedpreferences.SLAVE", "sync", change);
    }

    /* renamed from: a */
    public final void mo15120a() {
        m19135a("com.google.android.gms.autofill.sharedpreferences.MASTER", "request_sync", null);
    }
}
