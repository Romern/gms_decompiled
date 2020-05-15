package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.provider.Settings;
import java.util.Locale;

/* renamed from: aynj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynj {

    /* renamed from: a */
    private static final boan f98066a = boan.f132472f.mo68787b().mo68784a(":", 2);

    /* renamed from: a */
    public static String m84357a(byte[] bArr) {
        return f98066a.mo68794a(bArr);
    }

    /* renamed from: a */
    public static byte[] m84358a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
        if (string == null || !BluetoothAdapter.checkBluetoothAddress(string)) {
            return null;
        }
        return m84359a(string);
    }

    /* renamed from: a */
    public static byte[] m84359a(String str) {
        return f98066a.mo68796b(str.toUpperCase(Locale.US));
    }
}
