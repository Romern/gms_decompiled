package p000;

import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: ails */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ails {
    /* renamed from: a */
    public static String m57437a(int i) {
        return srv.m36164d(m57448b(i));
    }

    /* renamed from: b */
    public static void m57447b() {
        if (cfnv.m140802z()) {
            shr.m35312a();
        }
    }

    /* renamed from: c */
    public static InetAddress m57449c(int i) {
        return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
    }

    /* renamed from: b */
    public static byte[] m57448b(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static String m57438a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", Byte.valueOf(bArr[i])));
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m57439a() {
        if (cfnv.m140802z()) {
            shr.m35316b(9728);
        }
    }

    /* renamed from: a */
    public static void m57440a(ailj ailj, String str, String str2) {
        if (ailj != null) {
            try {
                ailj.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    static void m57441a(aiqb aiqb, String str, String str2) {
        if (aiqb != null) {
            try {
                aiqb.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    static void m57442a(BluetoothServerSocket bluetoothServerSocket, String str, String str2) {
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    static void m57443a(BluetoothSocket bluetoothSocket, String str, String str2) {
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m57444a(ServerSocket serverSocket, String str, String str2) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m57445a(Socket socket, String str, String str2) {
        if (socket != null) {
            try {
                socket.close();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ails", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Failed to close %sSocket %s", str, str2);
            }
        }
    }

    /* renamed from: a */
    public static byte[] m57446a(byte[] bArr, int i) {
        return Arrays.copyOf(spn.m35863a(bArr, "SHA-256"), i);
    }
}
