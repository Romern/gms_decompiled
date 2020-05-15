package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* renamed from: airk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airk {

    /* renamed from: a */
    public static final UUID f69554a = UUID.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    public static final UUID f69555b = UUID.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");

    /* renamed from: c */
    static final UUID f69556c = UUID.fromString("00000100-0004-1000-8000-001A11000101");

    /* renamed from: d */
    static final UUID f69557d;

    /* renamed from: e */
    static final UUID f69558e;

    /* renamed from: f */
    static final UUID f69559f = f69556c;

    static {
        UUID fromString = UUID.fromString("00000100-0004-1000-8000-001A11000102");
        f69557d = fromString;
        f69558e = fromString;
    }

    /* renamed from: a */
    public static int m57793a(byte[] bArr) {
        if (bArr.length != 2) {
            return 0;
        }
        return bqct.m112601a(bArr);
    }

    /* renamed from: b */
    public static byte[] m57796b(int i) {
        if (i == -1) {
            i = 0;
        }
        return bqct.m112602a((short) i);
    }

    /* renamed from: a */
    static BluetoothDevice m57794a(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airk", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to retrieve BluetoothAdapter.");
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(str);
        } catch (IllegalArgumentException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("airk", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("%s not recognized as a valid Bluetooth MAC address.", str);
            return null;
        }
    }

    /* renamed from: a */
    public static UUID m57795a(int i) {
        return new UUID(12288, ((long) i) | Long.MIN_VALUE);
    }
}
