package p000;

import android.bluetooth.BluetoothAdapter;

/* renamed from: bvau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvau {
    /* renamed from: a */
    public static String m120845a(byte[] bArr) {
        int length = bArr.length;
        if (length == 6) {
            return srv.m36162b(bArr);
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Bluetooth macs are 6 bytes long, not ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m120846a(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Not a valid bluetooth mac hex string: ") : "Not a valid bluetooth mac hex string: ".concat(valueOf));
        }
        byte[] bArr = new byte[6];
        String[] split = str.split(":");
        for (int i = 0; i < 6; i++) {
            String valueOf2 = String.valueOf(split[i]);
            bArr[i] = Integer.decode(valueOf2.length() == 0 ? new String("0x") : "0x".concat(valueOf2)).byteValue();
        }
        return bArr;
    }
}
