package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper;
import java.io.IOException;
import java.security.SecureRandom;

/* renamed from: aije */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aije extends airo {

    /* renamed from: a */
    public final String f68944a;

    /* renamed from: b */
    public aipa f68945b;

    /* renamed from: c */
    private final BluetoothClassic$BluetoothPairingDialogZapper f68946c;

    /* renamed from: d */
    private final BluetoothDevice f68947d;

    /* renamed from: e */
    private final String f68948e;

    /* renamed from: f */
    private final ahfk f68949f;

    /* renamed from: i */
    private final SecureRandom f68950i = new SecureRandom();

    public aije(BluetoothClassic$BluetoothPairingDialogZapper bluetoothClassic$BluetoothPairingDialogZapper, BluetoothDevice bluetoothDevice, String str, ahfk ahfk) {
        super(23, ahfk);
        this.f68946c = bluetoothClassic$BluetoothPairingDialogZapper;
        this.f68947d = bluetoothDevice;
        this.f68948e = str;
        this.f68944a = String.format("{%s:%s}", bluetoothDevice.getName(), str);
        this.f68949f = ahfk;
    }

    /* renamed from: b */
    public final int mo37568b() {
        aijc aijc = new aijc(this);
        butj butj = new butj(cfnv.f184625a.mo6606a().mo81853u() + ((long) this.f68950i.nextInt((int) cfnv.f184625a.mo6606a().mo81852t())));
        butj.f154849a = this.f68949f.mo36402c();
        aipa aipa = (aipa) butl.m120433a(aijc, "ConnectToBluetoothDevice", butj.mo73110a());
        this.f68945b = aipa;
        if (aipa == null) {
            return 3;
        }
        srn srn = ailf.f69111a;
        return mo37899a(24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[SYNTHETIC, Splitter:B:16:0x0038] */
    /* renamed from: c */
    public final aipa mo37571c() {
        IOException e;
        BluetoothSocket bluetoothSocket;
        String str;
        try {
            this.f68946c.mo44289a();
            bluetoothSocket = this.f68947d.createInsecureRfcommSocketToServiceRecord(aijh.m57292a(this.f68948e));
            try {
                bluetoothSocket.connect();
                aipa aipa = new aipa(bluetoothSocket);
                this.f68946c.mo44290b();
                return aipa;
            } catch (IOException e2) {
                e = e2;
                try {
                    str = this.f68944a;
                    if (bluetoothSocket != null) {
                    }
                } catch (IOException e3) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                    bnsl.mo68437a(e3);
                    bnsl.mo68432a("ails", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("Failed to close %sSocket %s", "Bluetooth", str);
                } catch (Throwable th) {
                    this.f68946c.mo44290b();
                    throw th;
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aije", "c", 1105, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to connect via insecure Rfcomm BluetoothSocket to %s", this.f68944a);
                this.f68946c.mo44290b();
                return null;
            }
        } catch (IOException e4) {
            e = e4;
            bluetoothSocket = null;
            str = this.f68944a;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
                srn srn = ailf.f69111a;
            }
            bnsl bnsl22 = (bnsl) ailf.f69111a.mo68390d();
            bnsl22.mo68437a(e);
            bnsl22.mo68432a("aije", "c", 1105, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl22.mo68420a("Failed to connect via insecure Rfcomm BluetoothSocket to %s", this.f68944a);
            this.f68946c.mo44290b();
            return null;
        }
    }
}
