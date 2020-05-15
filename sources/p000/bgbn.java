package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: bgbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgbn implements bugo {

    /* renamed from: a */
    public final Context f115999a;

    public bgbn(Context context) {
        this.f115999a = context;
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        long id = Thread.currentThread().getId();
        int hashCode = hashCode();
        StringBuilder sb = new StringBuilder(83);
        sb.append("ContextHub receiver thread ID is ");
        sb.append(id);
        sb.append(", callback hash is ");
        sb.append(hashCode);
        sb.toString();
        if (ceze.m138467l()) {
            byte[] bArr = buhd.f153833c;
            int length = bArr.length;
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Received nanohub message, length ");
            sb2.append(length);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Message to NLP is length ");
            sb3.append(length);
            sb3.toString();
            bxbi bxbi = new bxbi("com.google.android.gms");
            bxbi.mo73552a(stx.m36335a(this.f115999a, "com.google.android.gms"));
            Intent intent = bxbi.f161815a;
            intent.putExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO", bArr);
            intent.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", PendingIntent.getBroadcast(this.f115999a, 0, new Intent("c.g.a.l.i.s.CacheSeverContextHubBridge"), 0));
            this.f115999a.startService(intent);
        }
    }
}
