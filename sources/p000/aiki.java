package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiki extends airo {

    /* renamed from: a */
    public final BluetoothAdapter f69033a;

    /* renamed from: b */
    public final aysl f69034b;

    /* renamed from: c */
    public final ayrl f69035c;

    /* renamed from: d */
    public final Context f69036d;

    /* renamed from: e */
    ayri f69037e;

    /* renamed from: f */
    aipk f69038f;

    /* renamed from: i */
    private final aipe f69039i;

    /* renamed from: j */
    private final int f69040j;

    /* renamed from: k */
    private final Set f69041k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    public aiki(Context context, BluetoothAdapter bluetoothAdapter, aysl aysl, ayrl ayrl, int i, aipe aipe, ahfk ahfk, int i2, Set set) {
        super(36, ahfk);
        aipk aipk;
        this.f69036d = context;
        this.f69033a = bluetoothAdapter;
        this.f69034b = aysl;
        this.f69035c = ayrl;
        this.f69040j = i;
        this.f69039i = aipe;
        this.f69041k = set;
        if (i2 > 0 && aikx.m57354f()) {
            BluetoothDevice bluetoothDevice = this.f69034b.f98419a;
            try {
                aipk = new aipk(bluetoothDevice, i2);
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aipk", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68422a("Failed to create BleL2capClient with address %s and psm %s", (Object) bluetoothDevice.getAddress(), i2);
                aipk = null;
            }
            this.f69038f = aipk;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, aysl]
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
    /* renamed from: a */
    private static boolean m57327a(ayri ayri, int i) {
        try {
            ayri.mo54310a(airk.f69554a, airk.m57795a(i));
            return true;
        } catch (BluetoothException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiki", "a", 3189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i, (Object) ayri.f98336d.mo54358a());
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m57328c() {
        if (!cfnv.f184625a.mo6606a().mo81845m()) {
            try {
                ayri a = new ayrp(this.f69036d, aysk.m84700a(this.f69033a)).mo54335a(this.f69034b, this.f69035c);
                this.f69037e = a;
                a.mo54312a(cfnv.m140790n());
                return true;
            } catch (BluetoothException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aiki", "g", 3131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Can't connect to an advertisement GATT server for peripheral %s.(legacy)", this.f69034b);
                return false;
            }
        } else {
            bqgy c = bqgy.m112818c();
            try {
                new aikh(this, c).start();
                this.f69037e = (ayri) c.get(cfnv.m140790n(), TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aiki", "c", 3080, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to create GATT connection to peripheral %s.", this.f69034b);
                if (e2 instanceof InterruptedException) {
                    c.cancel(true);
                    Thread.currentThread().interrupt();
                }
                return false;
            }
        }
    }

    /* renamed from: g */
    private final boolean m57329g() {
        try {
            ayri a = new ayrp(this.f69036d, aysk.m84700a(this.f69033a)).mo54335a(this.f69034b, this.f69035c);
            this.f69037e = a;
            a.mo54312a(cfnv.m140790n());
            return true;
        } catch (BluetoothException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiki", "g", 3131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can't connect to an advertisement GATT server for peripheral %s.(legacy)", this.f69034b);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, aysl]
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
    /* renamed from: h */
    private final boolean m57330h() {
        boolean z = true;
        for (int i = 0; i < this.f69040j; i++) {
            if (!this.f69039i.mo37802a(i)) {
                ayri ayri = this.f69037e;
                try {
                    ayri.mo54310a(airk.f69554a, airk.m57795a(i));
                    try {
                        this.f69039i.mo37800a(i, this.f69037e.mo54315b(airk.f69554a, airk.m57795a(i)));
                        srn srn = ailf.f69111a;
                    } catch (BluetoothException e) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("aiki", "h", 3166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68413a("Can't read advertisement for slot %d on peripheral %s.", i, (Object) this.f69034b);
                        z = false;
                    }
                } catch (BluetoothException e2) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("aiki", "a", 3189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68413a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i, (Object) ayri.f98336d.mo54358a());
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, aysl]
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
    /* renamed from: b */
    public final int mo37568b() {
        boolean z;
        int i;
        boolean z2;
        ahfi d;
        byte[] bArr;
        if (m57328c()) {
            aipk aipk = this.f69038f;
            if (aipk != null) {
                Set<String> set = this.f69041k;
                aipe aipe = this.f69039i;
                try {
                    if (aipk.mo37816a()) {
                        d = aipk.mo37820d();
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(aipk.f69436c.getInputStream()));
                            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(aipk.f69436c.getOutputStream()));
                            ArrayList arrayList = new ArrayList();
                            for (String str : set) {
                                if (TextUtils.isEmpty(str)) {
                                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                                    bnsl.mo68432a("aipl", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
                                    bArr = null;
                                } else {
                                    bArr = aipl.m57666a(1, aipl.m57669b(str));
                                }
                                if (bArr != null) {
                                    aipk.m57654a(dataOutputStream, bArr);
                                    aipl a = aipk.m57653a(dataInputStream);
                                    int i2 = a.f69438a;
                                    if (i2 == 21) {
                                        arrayList.add(a.f69440c);
                                    } else if (i2 == 22) {
                                        srn srn = ailf.f69111a;
                                    }
                                }
                            }
                            aipk.m57654a(dataOutputStream, aipl.m57666a(2, null));
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                aipe.mo37800a(i3, (byte[]) arrayList.get(i3));
                            }
                            d.mo36396b();
                            aipk.mo37819c();
                            this.f69039i.mo37801a(true);
                            return 2;
                        } catch (IOException e) {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68432a("aipk", "a", 282, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Failed to fetch advertisement on L2CAP socket!");
                            d.mo36396b();
                        }
                    }
                    aipk.mo37819c();
                    i = 0;
                    z = true;
                } catch (Throwable th) {
                    aipk.mo37819c();
                    throw th;
                }
            } else {
                i = 0;
                z = true;
            }
            while (i < this.f69040j) {
                if (!this.f69039i.mo37802a(i)) {
                    ayri ayri = this.f69037e;
                    try {
                        ayri.mo54310a(airk.f69554a, airk.m57795a(i));
                        try {
                            this.f69039i.mo37800a(i, this.f69037e.mo54315b(airk.f69554a, airk.m57795a(i)));
                            srn srn2 = ailf.f69111a;
                        } catch (BluetoothException e2) {
                            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl3.mo68437a(e2);
                            bnsl3.mo68432a("aiki", "h", 3166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68413a("Can't read advertisement for slot %d on peripheral %s.", i, (Object) this.f69034b);
                            z = false;
                        }
                    } catch (BluetoothException e3) {
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl4.mo68437a(e3);
                        bnsl4.mo68432a("aiki", "a", 3189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68413a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i, (Object) ayri.f98336d.mo54358a());
                    }
                }
                i++;
            }
            aipe aipe2 = this.f69039i;
            if (aipe2.mo37799a().isEmpty()) {
                z2 = false;
            } else {
                z2 = z;
            }
            aipe2.mo37801a(z2);
            return 2;
        }
        this.f69039i.mo37801a(false);
        return 2;
    }

    /* renamed from: a */
    public final void mo37566a() {
        try {
            ayri ayri = this.f69037e;
            if (ayri != null) {
                ayri.close();
                this.f69037e = null;
            }
        } catch (BluetoothException e) {
        }
    }
}
