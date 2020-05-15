package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: akh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akh {

    /* renamed from: a */
    final IntentFilter f762a;

    /* renamed from: b */
    final BroadcastReceiver f763b;

    /* renamed from: c */
    boolean f764c;

    /* renamed from: d */
    boolean f765d;

    public akh(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f762a = intentFilter;
        this.f763b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f763b);
        sb.append(" filter=");
        sb.append(this.f762a);
        if (this.f765d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
