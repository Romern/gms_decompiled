package p000;

import android.os.ParcelUuid;
import com.google.android.gms.nearby.messages.ble.BleFilter;

/* renamed from: aizt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizt {

    /* renamed from: a */
    public ParcelUuid f70184a;

    /* renamed from: b */
    public int f70185b = -1;

    /* renamed from: c */
    public byte[] f70186c;

    /* renamed from: d */
    public byte[] f70187d;

    /* renamed from: a */
    public final BleFilter mo38343a() {
        return new BleFilter(1, this.f70184a, null, null, null, null, this.f70185b, this.f70186c, this.f70187d);
    }
}
