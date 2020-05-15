package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: auuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auuj {
    /* renamed from: a */
    public static String m77854a(BluetoothDevice bluetoothDevice) {
        String str;
        try {
            str = (String) BluetoothDevice.class.getDeclaredMethod("getAliasName", null).invoke(bluetoothDevice, null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("Coffee-DevicePreferencesUtils", "Failed to retrieve Bluetooth device alias name.", e);
            int i = Build.VERSION.SDK_INT;
            str = bluetoothDevice.getName();
        }
        return TextUtils.isEmpty(str) ? bluetoothDevice.getAddress() : str;
    }

    /* renamed from: b */
    public static String m77858b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_bluetooth_address") : "auth_trust_agent_pref_trusted_bluetooth_address".concat(valueOf);
    }

    /* renamed from: c */
    public static String m77861c(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_device_capability_") : "auth_trust_agent_pref_trusted_device_capability_".concat(valueOf);
    }

    /* renamed from: d */
    public static String m77863d(BluetoothDevice bluetoothDevice) {
        return m77858b(bluetoothDevice.getAddress());
    }

    /* renamed from: e */
    public static String m77865e(BluetoothDevice bluetoothDevice) {
        return m77869h(bluetoothDevice.getAddress());
    }

    /* renamed from: f */
    public static String m77867f(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_bluetooth_device_eid_time_stamp_key_") : "auth_trust_agent_pref_bluetooth_device_eid_time_stamp_key_".concat(valueOf);
    }

    /* renamed from: g */
    public static String m77868g(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_bluetooth_device_eid_received_time_") : "auth_trust_agent_pref_bluetooth_device_eid_received_time_".concat(valueOf);
    }

    /* renamed from: h */
    public static String m77869h(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_bluetooth_title") : "auth_trust_agent_pref_trusted_bluetooth_title".concat(valueOf);
    }

    /* renamed from: i */
    public static String m77870i(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_") : "auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_".concat(valueOf);
    }

    /* renamed from: j */
    public static String m77871j(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("no_notification_for_device_") : "no_notification_for_device_".concat(valueOf);
    }

    /* renamed from: k */
    public static String m77872k(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("is_bluetooth_device_connection_secure_") : "is_bluetooth_device_connection_secure_".concat(valueOf);
    }

    /* renamed from: b */
    public static String m77859b(String str, String str2) {
        String upperCase = str.toUpperCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 56 + String.valueOf(str2).length());
        sb.append("auth_trust_agent_pref_bluetooth_device_is_user_present_");
        sb.append(upperCase);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m77862c(BluetoothDevice bluetoothDevice) {
        Method method;
        try {
            method = BluetoothDevice.class.getMethod("isConnected", null);
        } catch (NoSuchMethodException e) {
            Log.e("Coffee-DevicePreferencesUtils", "Failed to find BluetoothDevice.isConnected private API.");
            method = null;
        }
        if (bluetoothDevice.getBondState() != 12 || method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(bluetoothDevice, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.e("Coffee-DevicePreferencesUtils", "Error calling BluetoothDevice.isConnected()", e2);
            return false;
        }
    }

    /* renamed from: d */
    public static String m77864d(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_bluetooth_device_eik_provision_key_") : "auth_trust_agent_pref_bluetooth_device_eik_provision_key_".concat(valueOf);
    }

    /* renamed from: e */
    public static String m77866e(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_bluetooth_device_eid_session_counter_") : "auth_trust_agent_pref_bluetooth_device_eid_session_counter_".concat(valueOf);
    }

    /* renamed from: b */
    public static boolean m77860b(BluetoothDevice bluetoothDevice) {
        Method method;
        try {
            method = BluetoothDevice.class.getMethod("isEncrypted", null);
        } catch (NoSuchMethodException e) {
            Log.i("Coffee-DevicePreferencesUtils", "Failed to find BluetoothDevice.isEncrypted private API.");
            method = null;
        }
        if (method == null) {
            return false;
        }
        try {
            if (!((Boolean) method.invoke(bluetoothDevice, null)).booleanValue() || !m77862c(bluetoothDevice)) {
                return false;
            }
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.e("Coffee-DevicePreferencesUtils", "Error calling BluetoothDevice.isEncrypted()", e2);
            return false;
        }
    }

    /* renamed from: a */
    public static String m77855a(String str) {
        if (str.startsWith("auth_trust_agent_pref_trusted_bluetooth_address")) {
            return str.substring(47);
        }
        return null;
    }

    /* renamed from: a */
    public static String m77856a(String str, String str2) {
        String upperCase = str.toUpperCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 58 + String.valueOf(str2).length());
        sb.append("auth_trust_agent_pref_bluetooth_device_eid_on_body_state_");
        sb.append(upperCase);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m77857a() {
        boolean z;
        boolean b = cgzq.m147772b();
        try {
            if (BluetoothDevice.class.getMethod("isEncrypted", null) != null) {
                z = true;
                return !b || z;
            }
        } catch (NoSuchMethodException e) {
        }
        z = false;
        if (!b) {
        }
    }
}
