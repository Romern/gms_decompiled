package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_Event;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: ayou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayou {

    /* renamed from: a */
    public Short f98133a;

    /* renamed from: b */
    public BluetoothDevice f98134b;

    /* renamed from: c */
    public Exception f98135c;

    /* renamed from: d */
    private bvjc f98136d;

    /* renamed from: e */
    private Long f98137e;

    /* renamed from: a */
    public final Event mo54173a() {
        String str = this.f98136d == null ? " eventCode" : "";
        if (this.f98137e == null) {
            str = str.concat(" timestamp");
        }
        if (str.isEmpty()) {
            return new AutoValue_Event(this.f98136d, this.f98137e.longValue(), this.f98133a, this.f98134b, this.f98135c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo54174a(long j) {
        this.f98137e = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo54175a(bvjc bvjc) {
        if (bvjc != null) {
            this.f98136d = bvjc;
            return;
        }
        throw new NullPointerException("Null eventCode");
    }
}
