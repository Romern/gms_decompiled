package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: qwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qwc {

    /* renamed from: a */
    public final acyr f42300a;

    /* renamed from: b */
    public final int f42301b;

    /* renamed from: c */
    public final boolean f42302c;

    /* renamed from: d */
    public final String f42303d;

    public qwc(acyr acyr, int i, boolean z, String str) {
        sdo.m34959a(acyr);
        this.f42300a = acyr;
        this.f42301b = i;
        this.f42302c = z;
        this.f42303d = str;
    }

    /* renamed from: a */
    public static bmxv m32987a(Context context, Bundle bundle) {
        qwb qwb = new qwb();
        if (!bundle.containsKey("SyncRequest.accountName") || !bundle.containsKey("SyncRequest.accountType")) {
            return bmvz.f131120a;
        }
        qwb.f42296a = acyr.m50017a(context, new Account(bundle.getString("SyncRequest.accountName"), bundle.getString("SyncRequest.accountType")));
        if (!bundle.containsKey("SyncRequest.eventType")) {
            return bmvz.f131120a;
        }
        qwb.f42297b = bundle.getInt("SyncRequest.eventType");
        if (bundle.containsKey("SyncRequest.waitForInitialization")) {
            qwb.f42298c = bundle.getBoolean("SyncRequest.waitForInitialization");
        }
        if (bundle.containsKey("SyncRequest.zipitVersionInfo")) {
            qwb.f42299d = bundle.getString("SyncRequest.zipitVersionInfo");
        }
        return bmxv.m108566b(qwb.mo24305a());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qwc) {
            qwc qwc = (qwc) obj;
            if (!this.f42300a.equals(qwc.f42300a) || this.f42301b != qwc.f42301b || this.f42302c != qwc.f42302c || !bmxi.m108538a(this.f42303d, qwc.f42303d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42300a, Integer.valueOf(this.f42301b), Boolean.valueOf(this.f42302c), this.f42303d});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("account", "<hide PII>");
        a.mo66883a("eventType", this.f42301b);
        a.mo66886a("waitForInitialization", this.f42302c);
        a.mo66885a("zipitVersionInfo", this.f42303d);
        return a.toString();
    }

    /* renamed from: a */
    public final Bundle mo24306a() {
        Bundle bundle = new Bundle();
        bundle.putString("SyncRequest.accountName", this.f42300a.f61088b);
        bundle.putString("SyncRequest.accountType", this.f42300a.f61089c);
        bundle.putInt("SyncRequest.eventType", this.f42301b);
        bundle.putBoolean("SyncRequest.waitForInitialization", this.f42302c);
        bundle.putString("SyncRequest.zipitVersionInfo", this.f42303d);
        return bundle;
    }
}
