package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: aysx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysx {
    /* renamed from: a */
    public static BluetoothGattCharacteristic m84752a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), bluetoothGattCharacteristic.getPermissions());
        try {
            Field declaredField = BluetoothGattCharacteristic.class.getDeclaredField("mInstance");
            Field declaredField2 = BluetoothGattCharacteristic.class.getDeclaredField("mService");
            Field declaredField3 = BluetoothGattCharacteristic.class.getDeclaredField("mDescriptors");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
            declaredField.set(bluetoothGattCharacteristic2, declaredField.get(bluetoothGattCharacteristic));
            declaredField2.set(bluetoothGattCharacteristic2, declaredField2.get(bluetoothGattCharacteristic));
            declaredField3.set(bluetoothGattCharacteristic2, declaredField3.get(bluetoothGattCharacteristic));
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value != null) {
                bluetoothGattCharacteristic2.setValue(Arrays.copyOf(value, value.length));
            }
            bluetoothGattCharacteristic2.setWriteType(bluetoothGattCharacteristic.getWriteType());
            return bluetoothGattCharacteristic2;
        } catch (NoSuchFieldException e) {
            throw new BluetoothException("Cannot clone characteristic.", e);
        } catch (IllegalAccessException e2) {
            throw new BluetoothException("Cannot clone characteristic.", e2);
        } catch (IllegalArgumentException e3) {
            throw new BluetoothException("Cannot clone characteristic.", e3);
        }
    }

    /* renamed from: a */
    public static String m84754a(int i) {
        return i != 0 ? i != 13 ? i != 15 ? i != 143 ? i != 257 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "Unknown error code" : "GATT_INVALID_OFFSET" : "GATT_REQUEST_NOT_SUPPORTED" : "GATT_INSUFFICIENT_AUTHENTICATION" : "GATT_WRITE_NOT_PERMITTED" : "GATT_READ_NOT_PERMITTED" : "GATT_FAILURE" : "GATT_CONNECTION_CONGESTED" : "GATT_INSUFFICIENT_ENCRYPTION" : "GATT_INVALID_ATTRIBUTE_LENGTH" : "GATT_SUCCESS";
    }

    /* renamed from: b */
    public static String m84755b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        if (bluetoothGattCharacteristic == null) {
            return "null characteristic";
        }
        Object[] objArr = new Object[2];
        objArr[0] = bluetoothGattCharacteristic.getUuid();
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service != null) {
            str = String.format("service %s", service.getUuid());
        } else {
            str = "null service";
        }
        objArr[1] = str;
        return String.format("characteristic %s on %s", objArr);
    }

    /* renamed from: b */
    public static String m84756b(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor == null) {
            return "null descriptor";
        }
        return String.format("descriptor %s on %s", bluetoothGattDescriptor.getUuid(), m84755b(bluetoothGattDescriptor.getCharacteristic()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException("Cannot clone descriptor.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException("Cannot clone descriptor.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0023 A[ExcHandler: IllegalArgumentException (r5v5 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:1:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0025 A[ExcHandler: IllegalAccessException (r5v4 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:1:0x0014] */
    /* renamed from: a */
    public static BluetoothGattDescriptor m84753a(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGattDescriptor bluetoothGattDescriptor2 = new BluetoothGattDescriptor(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getPermissions());
        try {
            Field declaredField = BluetoothGattDescriptor.class.getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            declaredField.set(bluetoothGattDescriptor2, declaredField.get(bluetoothGattDescriptor));
            Field declaredField2 = BluetoothGattDescriptor.class.getDeclaredField("mCharacteristic");
            declaredField2.setAccessible(true);
            declaredField2.set(bluetoothGattDescriptor2, declaredField2.get(bluetoothGattDescriptor));
            byte[] value = bluetoothGattDescriptor.getValue();
            if (value != null) {
                bluetoothGattDescriptor2.setValue(Arrays.copyOf(value, value.length));
            }
            return bluetoothGattDescriptor2;
        } catch (NoSuchFieldException e) {
            throw new BluetoothException("Cannot clone descriptor.", e);
        } catch (IllegalAccessException e2) {
        } catch (IllegalArgumentException e3) {
        }
    }
}
