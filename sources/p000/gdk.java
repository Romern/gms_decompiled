package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: gdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gdk {

    /* renamed from: a */
    public final AudioManager f17956a;

    /* renamed from: b */
    public volatile BluetoothHeadset f17957b;

    /* renamed from: c */
    public final Object f17958c = new Object();

    public gdk(Context context) {
        this.f17956a = (AudioManager) context.getSystemService("audio");
        int i = Build.VERSION.SDK_INT;
        Context applicationContext = context.getApplicationContext();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(applicationContext, new gdj(this), 1);
        }
    }
}
