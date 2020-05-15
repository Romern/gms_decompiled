package p000;

import android.view.InputDevice;
import java.util.HashSet;

/* renamed from: tvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tvq extends adzt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ tvp f46736a;

    /* renamed from: b */
    private final long f46737b = ((Long) tvr.f46740c.mo25081c()).longValue();

    public tvq(tvp tvp) {
        this.f46736a = tvp;
    }

    public final void run() {
        String[] a;
        try {
            tvp tvp = this.f46736a;
            int i = tvp.f46729c;
            tvo tvo = tvp.f46732a;
            int[] inputDeviceIds = tvp.f46733b.getInputDeviceIds();
            HashSet hashSet = new HashSet();
            for (int i2 : inputDeviceIds) {
                InputDevice inputDevice = tvp.f46733b.getInputDevice(i2);
                if (inputDevice != null) {
                    for (String str : tvp.mo26825a(inputDevice)) {
                        hashSet.add(str);
                    }
                }
            }
            tvo.mo26823a((String[]) hashSet.toArray(new String[0]));
        } finally {
            postDelayed(this, this.f46737b);
        }
    }
}
