package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.net.Socket;

/* renamed from: osc */
public final /* synthetic */ class osc implements Runnable {

    /* renamed from: a */
    private final CarSetupServiceImpl f38308a;

    /* renamed from: b */
    private final Socket f38309b;

    public osc(CarSetupServiceImpl carSetupServiceImpl, Socket socket) {
        this.f38308a = carSetupServiceImpl;
        this.f38309b = socket;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.io.Closeable, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, boolean):void
     arg types: [osi, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.io.Closeable, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, boolean):void */
    public final void run() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38308a;
        Socket socket = this.f38309b;
        ParcelFileDescriptor fromSocket = ParcelFileDescriptor.fromSocket(socket);
        carSetupServiceImpl.mo17414a((Closeable) new osi(socket, fromSocket, fromSocket), fromSocket, fromSocket, (ParcelFileDescriptor) null, true);
    }
}
