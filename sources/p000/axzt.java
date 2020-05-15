package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.Semaphore;

/* renamed from: axzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzt implements ayjh {

    /* renamed from: a */
    private final Context f96858a;

    /* renamed from: b */
    private volatile axzf f96859b;

    /* renamed from: c */
    private final Semaphore f96860c = new Semaphore(0, true);

    /* renamed from: d */
    private final Random f96861d;

    public axzt(Context context) {
        SecureRandom secureRandom = new SecureRandom();
        this.f96858a = context;
        this.f96861d = secureRandom;
    }

    /* renamed from: a */
    public final void mo53580a() {
        this.f96860c.acquireUninterruptibly();
        try {
            this.f96858a.getSharedPreferences("cw_node", 0).edit().clear().commit();
            mo53809c();
        } finally {
            this.f96860c.release();
        }
    }

    /* renamed from: b */
    public final axzf mo53808b() {
        this.f96860c.acquireUninterruptibly();
        try {
            if (this.f96859b != null) {
                return this.f96859b;
            }
            throw new IllegalStateException("this should never be null");
        } finally {
            this.f96860c.release();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo53809c() {
        String str;
        SharedPreferences sharedPreferences = this.f96858a.getSharedPreferences("cw_node", 0);
        String string = sharedPreferences.getString("node_id", null);
        if (string == null) {
            string = Integer.toHexString(this.f96861d.nextInt());
            sharedPreferences.edit().putString("node_id", string).apply();
            if (Log.isLoggable("WearableNode", 3)) {
                String valueOf = String.valueOf(string);
                Log.d("WearableNode", valueOf.length() == 0 ? new String("created new node id and saved to preference: ") : "created new node id and saved to preference: ".concat(valueOf));
            }
        } else if (Log.isLoggable("WearableNode", 3)) {
            Log.d("WearableNode", string.length() == 0 ? new String("loaded node id from preference: ") : "loaded node id from preference: ".concat(string));
        }
        int i = Build.VERSION.SDK_INT;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (str = defaultAdapter.getName()) == null) {
            str = string;
        }
        this.f96859b = new axzf(string, str);
        this.f96860c.release();
    }
}
