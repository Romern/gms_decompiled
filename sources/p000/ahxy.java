package p000;

import android.bluetooth.BluetoothSocket;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ahxy */
final /* synthetic */ class ahxy implements Runnable {

    /* renamed from: a */
    private final ahye f68318a;

    public ahxy(ahye ahye) {
        this.f68318a = ahye;
    }

    public final void run() {
        ahye ahye = this.f68318a;
        BluetoothSocket bluetoothSocket = ahye.f68334d;
        boolean z = false;
        try {
            if (cfoj.m141561k()) {
                ahye.mo37283b(bluetoothSocket);
            }
            DataInputStream dataInputStream = new DataInputStream(bluetoothSocket.getInputStream());
            byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE];
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Start read loop", ahye.f68333c);
            while (bluetoothSocket.isConnected()) {
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                int i = 0;
                while (i < readUnsignedShort) {
                    i += dataInputStream.read(bArr, i, readUnsignedShort - i);
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68427a("RfcommEventStreamMedium: [%s] Received EventGroup=%d, EventCode=%d, AdditionalDataLength=%d, BytesRead=%d", ahye.f68333c, Integer.valueOf(readUnsignedByte), Integer.valueOf(readUnsignedByte2), Integer.valueOf(readUnsignedShort), Integer.valueOf(i));
                ahye.mo37280a(new ahya(ahye, readUnsignedByte, readUnsignedByte2, Arrays.copyOf(bArr, readUnsignedShort)));
            }
            if (cfom.m141867b()) {
                throw new IOException();
            }
        } catch (IOException e) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68424a("RfcommEventStreamMedium: [%s] Failed to read from socket. Retry times remaining %s", ahye.f68333c, ahye.f68335e);
            if (cfom.m141867b()) {
                if (!cfoj.f184966a.mo6606a().mo82065P() || bluetoothSocket.isConnected()) {
                    z = true;
                }
                if (ahye.f68335e.get() > 0 && z) {
                    ahye.mo37279a(new ahxp(ahye), ahye.m56855a(ahye.f68335e.decrementAndGet()));
                } else {
                    ahye.mo37278a(new ahxq(ahye, bluetoothSocket));
                }
            } else if (ahye.f68335e.get() > 0) {
                ahye.mo37279a(new ahxr(ahye), ahye.m56855a(ahye.f68335e.decrementAndGet()));
            } else {
                ahye.mo37278a(new ahxs(ahye, bluetoothSocket));
            }
        }
    }
}
