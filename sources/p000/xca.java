package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.autoenroll.UserPresenceBroadcastReceiver$1;

/* renamed from: xca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xca {

    /* renamed from: a */
    public static final Logger f51907a = new Logger(new String[]{"UserPresenceBroadcastReceiver"}, (short[]) null);

    /* renamed from: b */
    private final Context f51908b;

    /* renamed from: c */
    private final aacn f51909c;

    public xca(Context context, xbz xbz) {
        this.f51908b = context;
        this.f51909c = new UserPresenceBroadcastReceiver$1("fido", xbz);
    }

    /* renamed from: a */
    public final void mo29625a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f51908b.registerReceiver(this.f51909c, intentFilter);
    }

    /* renamed from: b */
    public final void mo29626b() {
        this.f51908b.unregisterReceiver(this.f51909c);
    }
}
