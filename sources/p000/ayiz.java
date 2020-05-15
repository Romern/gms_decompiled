package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.util.StringBuilderPrinter;

/* renamed from: ayiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayiz implements IBinder.DeathRecipient {

    /* renamed from: a */
    final axrv f97716a;

    /* renamed from: b */
    final IntentFilter[] f97717b;

    /* renamed from: c */
    final String f97718c;

    /* renamed from: d */
    final boolean f97719d;

    /* renamed from: e */
    public final String f97720e;

    /* renamed from: f */
    final /* synthetic */ ayja f97721f;

    public ayiz(ayja ayja, axrv axrv, IntentFilter[] intentFilterArr, String str, boolean z, String str2) {
        this.f97721f = ayja;
        sdo.m34959a(axrv);
        this.f97716a = axrv;
        this.f97717b = intentFilterArr;
        this.f97718c = str;
        this.f97719d = z;
        this.f97720e = str2;
    }

    public final void binderDied() {
        if (Log.isLoggable("WearableService", 3)) {
            String hexString = Integer.toHexString(this.f97716a.hashCode());
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37);
            sb.append("Binder died for listener: ");
            sb.append(hexString);
            sb.append(". Removing.");
            Log.d("WearableService", sb.toString());
        }
        this.f97716a.asBinder().unlinkToDeath(this, 0);
        this.f97721f.f97723b.remove(this.f97716a.asBinder());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListenerRecord[");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(", listener=");
        sb.append(Integer.toHexString(this.f97716a.hashCode()));
        sb.append(", listenerAsBinder=");
        sb.append(Integer.toHexString(this.f97716a.asBinder().hashCode()));
        sb.append(", channelTokenString=");
        sb.append(this.f97718c);
        sb.append(", alive=");
        sb.append(this.f97716a.asBinder().isBinderAlive());
        sb.append(", firstParty=");
        sb.append(this.f97719d);
        IntentFilter[] intentFilterArr = this.f97717b;
        if (intentFilterArr != null && intentFilterArr.length > 0) {
            sb.append("\n");
            StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
            for (IntentFilter intentFilter : this.f97717b) {
                intentFilter.dump(stringBuilderPrinter, "  ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
