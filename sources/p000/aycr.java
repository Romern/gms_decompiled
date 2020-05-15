package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: aycr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycr extends Thread implements Closeable {

    /* renamed from: a */
    final /* synthetic */ aycs f97168a;

    /* renamed from: b */
    private final ConnectionConfiguration f97169b;

    /* renamed from: c */
    private final BluetoothAdapter f97170c = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: d */
    private final Method f97171d;

    /* renamed from: e */
    private BluetoothServerSocket f97172e;

    /* renamed from: f */
    private volatile BluetoothSocket f97173f;

    /* renamed from: g */
    private volatile boolean f97174g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aycr(aycs aycs, ConnectionConfiguration connectionConfiguration) {
        super("WearableBtServerThread");
        this.f97168a = aycs;
        sdo.m34967a("close");
        this.f97169b = connectionConfiguration;
        if (chmf.f188775a.mo6606a().mo85350c()) {
            int b = (int) chmf.f188775a.mo6606a().mo85349b();
            int i = 0;
            while (i < b) {
                try {
                    this.f97172e = this.f97170c.listenUsingRfcommWithServiceRecord("WearableBt", aycp.f97166a);
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Failed to listen on server socket: ");
                    sb.append(valueOf);
                    Log.e("WearableBluetooth", sb.toString());
                    bqhi.m112839a(chmf.f188775a.mo6606a().mo85348a(), TimeUnit.MILLISECONDS);
                    i++;
                }
            }
            StringBuilder sb2 = new StringBuilder(63);
            sb2.append("Failed to listen on server socket ");
            sb2.append(b);
            sb2.append(" times. Giving up.");
            Log.e("WearableBluetooth", sb2.toString());
            throw new IllegalStateException("Unable to listen for RFCOMM sockets.");
        }
        try {
            this.f97172e = this.f97170c.listenUsingRfcommWithServiceRecord("WearableBt", aycp.f97166a);
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to listen for RFCOMM sockets.", e2);
        }
        try {
            this.f97171d = BluetoothAdapter.class.getMethod("setScanMode", Integer.TYPE, Integer.TYPE);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("BluetoothAdapter#setScanMode must be available.");
        }
    }

    /* renamed from: a */
    private final void m83832a(boolean z) {
        int i;
        String str;
        if (!z) {
            i = 20;
        } else {
            i = 21;
        }
        if (!z) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        String sb2 = sb.toString();
        try {
            this.f97171d.invoke(this.f97170c, Integer.valueOf(i), 0);
            if (Log.isLoggable("WearableBluetooth", 3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 28);
                sb3.append("set scan mode to ");
                sb3.append(i);
                sb3.append(sb2);
                Log.d("WearableBluetooth", sb3.toString());
            }
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 38);
            sb4.append("error setting scan mode to ");
            sb4.append(i);
            sb4.append(sb2);
            Log.e("WearableBluetooth", sb4.toString());
        }
    }

    public final void close() {
        sdo.m34967a("close");
        if (Log.isLoggable("WearableBluetooth", 3)) {
            Log.d("WearableBluetooth", "Signaling thread termination.");
        }
        this.f97174g = true;
        ayjn.m84115a(this.f97173f);
        ayjn.m84115a(this.f97172e);
        interrupt();
        bqhi.m112840a(this);
    }

    public final void run() {
        adzt adzt;
        aycq aycq;
        try {
            m83832a(true);
            this.f97173f = this.f97172e.accept();
            m83832a(false);
            if (!this.f97174g) {
                if (Log.isLoggable("WearableBluetooth", 4)) {
                    String valueOf = String.valueOf(this.f97173f.getRemoteDevice());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                    sb.append("Connected to ");
                    sb.append(valueOf);
                    sb.append(".");
                    Log.i("WearableBluetooth", sb.toString());
                }
                ayha.m83994a().mo53853a(this.f97173f.getInputStream(), this.f97173f.getOutputStream(), this.f97169b);
                if (Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Thread terminated.");
                }
                adzt = new adzt(Looper.getMainLooper());
                aycq = new aycq(this);
            } else {
                if (Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Thread terminated.");
                }
                adzt = new adzt(Looper.getMainLooper());
                aycq = new aycq(this);
            }
        } catch (aybe e) {
            Log.w("WearableBluetooth", "Unsupported protocol version sent by peer node.", e);
            if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Thread terminated.");
            }
            adzt = new adzt(Looper.getMainLooper());
            aycq = new aycq(this);
        } catch (axwa e2) {
            Log.w("WearableBluetooth", "Invalid client attempted to connect to us.", e2);
            if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Thread terminated.");
            }
            adzt = new adzt(Looper.getMainLooper());
            aycq = new aycq(this);
        } catch (IOException e3) {
            if (Log.isLoggable("WearableBluetooth", 3)) {
                String valueOf2 = String.valueOf(e3.getMessage());
                Log.d("WearableBluetooth", valueOf2.length() == 0 ? new String("Terminating thread with message: ") : "Terminating thread with message: ".concat(valueOf2));
            }
            if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Thread terminated.");
            }
            adzt = new adzt(Looper.getMainLooper());
            aycq = new aycq(this);
        } catch (Exception e4) {
            Log.e("WearableBluetooth", "Unexpected error while handling incoming BT socket.", e4);
            if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Thread terminated.");
            }
            adzt = new adzt(Looper.getMainLooper());
            aycq = new aycq(this);
        } catch (Throwable th) {
            if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Thread terminated.");
            }
            new adzt(Looper.getMainLooper()).post(new aycq(this));
            throw th;
        }
        adzt.post(aycq);
    }
}
