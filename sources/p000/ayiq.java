package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.service.WearableChimeraService;

/* renamed from: ayiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayiq extends ayfu {

    /* renamed from: c */
    final /* synthetic */ AncsNotificationParcelable f97691c;

    /* renamed from: d */
    final /* synthetic */ axrs f97692d;

    /* renamed from: e */
    final /* synthetic */ ayja f97693e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayiq(ayja ayja, String str, AncsNotificationParcelable ancsNotificationParcelable, axrs axrs) {
        super(str);
        this.f97693e = ayja;
        this.f97691c = ancsNotificationParcelable;
        this.f97692d = axrs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        r2 = java.lang.String.valueOf(r8.f97691c);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 63);
        r4.append("injectAncsNotificationForTesting: exception during processing: ");
        r4.append(r2);
        android.util.Log.e("WearableService", r4.toString(), r0);
        r8.f97692d.mo53437a(new com.google.android.gms.common.api.Status(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    public final void mo53991a() {
        axue axue;
        axpc axpc = this.f97693e.f97736o;
        AncsNotificationParcelable ancsNotificationParcelable = this.f97691c;
        if (Log.isLoggable("AncsService", 3)) {
            String valueOf = String.valueOf(ancsNotificationParcelable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onNotificationReceived ");
            sb.append(valueOf);
            Log.d("AncsService", sb.toString());
        }
        aygn aygn = axpc.f96235b;
        if (aygn != null) {
            if (Log.isLoggable("WearableService", 2)) {
                String valueOf2 = String.valueOf(ancsNotificationParcelable);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("onNotificationReceived: ");
                sb2.append(valueOf2);
                Log.v("WearableService", sb2.toString());
            }
            String str = ancsNotificationParcelable.f110896k;
            if (str != null) {
                axue = axug.m83241a(aygn.f97540a, str);
            } else {
                str = "com.google.android.wearable.app";
                axue = WearableChimeraService.f110999u;
            }
            if (axue != null) {
                aygn.f97540a.mo60325a(axue, new aygm("onNotificationReceived", new Intent("com.google.android.gms.wearable.ANCS_NOTIFICATION", ayao.f96960a).setPackage(str), ancsNotificationParcelable));
            } else if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb3 = new StringBuilder(str.length() + 40);
                sb3.append("Dropping ANCS event since ");
                sb3.append(str);
                sb3.append(" was not found");
                Log.d("WearableService", sb3.toString());
            }
        }
        this.f97692d.mo53437a(new Status(0));
    }
}
