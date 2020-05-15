package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.EnumSet;

/* renamed from: orb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class orb {

    /* renamed from: a */
    public final SharedPreferences f38267a;

    static {
        odk.m28481a("CAR.CarBTStore");
    }

    public orb(Context context, String str) {
        this.f38267a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public static String m29638b(String str) {
        return String.format("AndroidAutoBluetooth_%s", str);
    }

    /* renamed from: a */
    public final EnumSet mo22530a(String str) {
        EnumSet noneOf = EnumSet.noneOf(oqz.class);
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            if (this.f38267a.getStringSet("AndroidAutoBluetooth", bnon.f131923a).contains(str)) {
                noneOf.add(oqz.USB);
            }
            for (String str2 : this.f38267a.getStringSet(m29638b(str), bnon.f131923a)) {
                try {
                    noneOf.add(oqz.m29637a(str2));
                } catch (IllegalArgumentException e) {
                }
            }
        }
        return noneOf;
    }
}
