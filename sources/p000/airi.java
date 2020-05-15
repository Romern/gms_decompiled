package p000;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: airi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class airi {

    /* renamed from: a */
    protected final String f69543a;

    /* renamed from: b */
    public final CountDownLatch f69544b = new CountDownLatch(1);

    /* renamed from: c */
    public final airj f69545c;

    /* renamed from: d */
    public final ExecutorService f69546d = ahhr.m55806b();

    /* renamed from: e */
    public final ExecutorService f69547e = ahhr.m55806b();

    /* renamed from: f */
    public blun f69548f;

    /* renamed from: g */
    public blux f69549g;

    /* renamed from: h */
    public aipk f69550h;

    /* renamed from: i */
    public final BluetoothSocket f69551i;

    /* renamed from: j */
    public final int f69552j;

    /* renamed from: k */
    private final Context f69553k;

    public airi(Context context, String str, blun blun, BluetoothSocket bluetoothSocket, airj airj, int i) {
        this.f69553k = context;
        this.f69543a = str;
        this.f69548f = blun;
        this.f69551i = bluetoothSocket;
        this.f69545c = airj;
        this.f69552j = i;
        if (blun instanceof blvp) {
            this.f69549g = new blvx(blun, new airh(this));
        }
        if (this.f69548f instanceof blvg) {
            this.f69549g = new blvv(blun, new airh(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37879a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37880a(aips aips);

    /* renamed from: a */
    public final void mo37891a(InputStream inputStream) {
        this.f69547e.execute(new airc(this, inputStream));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37893b(InputStream inputStream) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
            while (true) {
                int readInt = dataInputStream.readInt();
                int i = aips.f69458d;
                if (readInt > 3) {
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    mo37894b(bArr);
                } else {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                    bnsl.mo68432a("airi", "b", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68413a("PhysicalBleSocket get invalid BlePacket length(%s) from %s", readInt, (Object) this.f69543a);
                    this.f69545c.mo37590a();
                    return;
                }
            }
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("airi", "b", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("PhysicalBleSocket failed to read BlePacket from %s on L2CAP", this.f69543a);
            this.f69545c.mo37590a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo37884b(aips aips);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo37895c() {
        BluetoothSocket bluetoothSocket = this.f69551i;
        if (bluetoothSocket != null) {
            try {
                mo37891a(bluetoothSocket.getInputStream());
                return true;
            } catch (IOException e) {
                return false;
            }
        } else if (this.f69549g != null) {
            return mo37896d();
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo37896d() {
        try {
            if (this.f69544b.await(cfnv.m140786j(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airi", "d", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PhysicalBleSocket failed to initialize Weave protocol with %s because it never received a connection callback", this.f69543a);
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("airi", "d", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("PhysicalBleSocket failed to initialize Weave protocol with %s because it was interrupted while waiting for connection establishment", this.f69543a);
            return false;
        }
    }

    /* renamed from: e */
    public final blun mo37897e() {
        try {
            return (blun) new blvi(this.f69553k, null, new aird(), airk.f69554a, airk.f69556c, airk.f69557d, (int) cfnv.m140782f()).mo66750a(this.f69543a).get(cfnv.m140786j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("airi", "e", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PhysicalBleSocket failed to establish a GATT connection to server %s.", this.f69543a);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo37892a(Runnable runnable) {
        this.f69546d.execute(runnable);
    }

    /* renamed from: b */
    public final void mo37894b(byte[] bArr) {
        aips a = aips.m57682a(bArr);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airi", "b", 395, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PhysicalBleSocket connected to %s was unable to parse incoming data.", this.f69543a);
        } else if (mo37884b(a)) {
            mo37892a(new airb(this, a));
        } else {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("airi", "b", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("PhysicalBleSocket connected to %s but received unexpected packet with service ID hash %s, data %s", this.f69543a, ails.m57438a(a.f69459b), ails.m57438a(a.f69460c));
        }
    }
}
