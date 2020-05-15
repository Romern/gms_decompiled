package p000;

import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: aiyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyn {

    /* renamed from: a */
    public final ajcd f70080a;

    /* renamed from: b */
    public final PendingIntent f70081b;

    /* renamed from: c */
    public int f70082c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aiyn(ajcd ajcd) {
        this(ajcd, null);
        sdo.m34959a(ajcd);
    }

    /* renamed from: a */
    private final boolean m58214a(Context context, Intent intent) {
        int e;
        try {
            if (this.f70081b != null) {
                int i = Build.VERSION.SDK_INT;
                String a = ajcp.m58515a(this.f70081b);
                UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                if (usageStatsManager != null && usageStatsManager.isAppInactive(a) && (e = (int) cfop.f185115a.mo6606a().mo82226e()) > 0) {
                    usageStatsManager.whitelistAppTemporarily(a, (long) e, Process.myUserHandle());
                }
                this.f70081b.send(context, 0, intent);
                return true;
            }
        } catch (PendingIntent.CanceledException e2) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("aiyn", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s Tried sending %s, but client canceled PendingIntent.", "Subscription", intent.getExtras());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiyn)) {
            return false;
        }
        aiyn aiyn = (aiyn) obj;
        ajcd ajcd = this.f70080a;
        ajcd ajcd2 = aiyn.f70080a;
        return (ajcd == ajcd2 || !(ajcd == null || ajcd2 == null || ajcd.asBinder() != ajcd2.asBinder())) && sdg.m34949a(this.f70081b, aiyn.f70081b);
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[2];
        ajcd ajcd = this.f70080a;
        if (ajcd != null) {
            iBinder = ajcd.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        objArr[1] = this.f70081b;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        ajcd ajcd = this.f70080a;
        if (ajcd != null) {
            String valueOf = String.valueOf(ajcd.asBinder());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("foreground MessageListener=");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            String valueOf2 = String.valueOf(this.f70081b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("background PendingIntent=");
            sb2.append(valueOf2);
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 23);
        sb3.append("Subscription.Listener{");
        sb3.append(str);
        sb3.append("}");
        return sb3.toString();
    }

    private aiyn(ajcd ajcd, PendingIntent pendingIntent) {
        this.f70082c = 19;
        this.f70080a = ajcd;
        this.f70081b = pendingIntent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aiyn(PendingIntent pendingIntent) {
        this(null, pendingIntent);
        sdo.m34959a(pendingIntent);
    }

    /* renamed from: a */
    public final boolean mo38276a(Context context, Update update) {
        srn srn = ahfq.f67120a;
        if (this.f70080a != null) {
            try {
                if (update.mo44364a(1)) {
                    this.f70080a.mo38478a(MessageWrapper.m67407a(update.f80795c));
                }
                if (update.mo44364a(2)) {
                    this.f70080a.mo38480b(MessageWrapper.m67407a(update.f80795c));
                }
                this.f70080a.mo38479a(Collections.singletonList(update));
                return true;
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aiyn", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s RemoteException for callback: %s", "Subscription", update);
            } catch (Exception e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aiyn", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("%s Client code threw an exception in callback: %s", "Subscription", update);
            }
        } else {
            if (context != null) {
                if (!update.mo44364a(this.f70082c)) {
                    return true;
                }
                if ((this.f70082c ^ update.f80794b) != 0) {
                    ajdv ajdv = new ajdv();
                    ajdv.f70402b = update.f80795c;
                    if (Update.m67408a(this.f70082c, 1) && update.mo44364a(1)) {
                        ajdv.mo38532c();
                    }
                    if (Update.m67408a(this.f70082c, 2) && update.mo44364a(2)) {
                        ajdv.mo38533d();
                    }
                    if (Update.m67408a(this.f70082c, 4) && update.mo44364a(4)) {
                        ajdv.mo38529a(update.f80796d);
                    }
                    if (Update.m67408a(this.f70082c, 8) && update.mo44364a(8)) {
                        ajdv.mo38528a(update.f80797e);
                    }
                    if (Update.m67408a(this.f70082c, 16) && update.mo44364a(16)) {
                        ajdv.mo38527a(update.f80798f);
                    }
                    if (Update.m67408a(this.f70082c, 32) && update.mo44364a(32)) {
                        ajdv.mo38530a(update.f80799g);
                    }
                    update = ajdv.mo38525a();
                }
                Intent intent = new Intent();
                ArrayList a = sqc.m35955a(new Update[]{update});
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES", a);
                intent.putExtra("com.google.android.gms.nearby.messages.UPDATES", bundle);
                if (update.mo44364a(1)) {
                    ajcp.m58516a(intent, "com.google.android.gms.nearby.messages.MESSAGES", update.f80795c);
                }
                if (update.mo44364a(2)) {
                    ajcp.m58516a(intent, "com.google.android.gms.nearby.messages.LOST_MESSAGE", update.f80795c);
                }
                return m58214a(context, intent);
            }
            return false;
        }
    }
}
