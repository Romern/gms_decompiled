package p000;

import android.bluetooth.BluetoothSocket;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;

/* renamed from: aiqo */
public final /* synthetic */ class aiqo {
    /* renamed from: a */
    public static aiqp m57733a(blvp blvp, airj airj, aiqm aiqm) {
        if (!cfnv.m140746H()) {
            byte[] bArr = aiqy.f69521a;
            String c = blvp.mo66756c();
            aiqy aiqy = new aiqy(c, blvp, airj, aiqm);
            try {
                aiqy.mo37877b();
                return aiqy;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aiqy", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("MultiplexBleSocketV1 failed to connect to client %s.", c);
                aiqy.mo37872a();
                return null;
            }
        } else {
            aira aira = new aira(blvp.mo66756c(), blvp, null, airj, aiqm);
            if (aira.mo37895c()) {
                return aira;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aira", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("MultiplexBleSocketV2 failed to init on GATT for client %s.", blvp.mo66756c());
            aira.mo37883b();
            return null;
        }
    }

    /* renamed from: a */
    public static aira m57734a(String str, BluetoothSocket bluetoothSocket, airj airj, aiqm aiqm) {
        if (!cfnv.m140746H()) {
            return null;
        }
        aira aira = new aira(str, null, bluetoothSocket, airj, aiqm);
        if (aira.mo37895c()) {
            return aira;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aira", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("MultiplexBleSocketV2 failed to init on L2CAP.");
        aira.mo37883b();
        return null;
    }
}
