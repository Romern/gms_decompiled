package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: xjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjl {

    /* renamed from: a */
    private static final Logger f52425a = new Logger(new String[]{"CableAdvertiserUtil"}, (short[]) null);

    /* renamed from: a */
    public static BluetoothLeScanner m43047a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getBluetoothLeScanner();
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m43053b(ScanRecord scanRecord, ParcelUuid parcelUuid) {
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        if (serviceUuids != null && serviceUuids.size() == 2 && serviceUuids.contains(parcelUuid)) {
            UUID uuid = null;
            for (ParcelUuid parcelUuid2 : serviceUuids) {
                if (!parcelUuid2.equals(parcelUuid)) {
                    uuid = parcelUuid2.getUuid();
                }
            }
            if (uuid != null) {
                return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ScanSettings m43048a(int i) {
        return new ScanSettings.Builder().setScanMode(i).build();
    }

    /* renamed from: a */
    public static List m43049a(ParcelUuid parcelUuid) {
        return Arrays.asList(new ScanFilter.Builder().setServiceData(parcelUuid, new byte[]{32, 1}).build(), new ScanFilter.Builder().setManufacturerData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, new byte[]{0, 21, 32, 1}, new byte[]{0, -1, -1, -1}).build(), new ScanFilter.Builder().setServiceUuid(parcelUuid).build());
    }

    /* renamed from: a */
    public static byte[] m43050a(ScanRecord scanRecord) {
        int length;
        byte[] manufacturerSpecificData = scanRecord.getManufacturerSpecificData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        if (manufacturerSpecificData == null || (length = manufacturerSpecificData.length) < 2 || manufacturerSpecificData[1] != 21) {
            return null;
        }
        return m43052a(Arrays.copyOfRange(manufacturerSpecificData, 2, length));
    }

    /* renamed from: a */
    public static byte[] m43051a(ScanRecord scanRecord, ParcelUuid parcelUuid) {
        try {
            byte[] serviceData = scanRecord.getServiceData(parcelUuid);
            if (serviceData != null) {
                return m43052a(serviceData);
            }
            return null;
        } catch (NullPointerException e) {
            f52425a.mo25417e("Error when getting the service data", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m43052a(byte[] bArr) {
        int length = bArr.length;
        if (length < 18) {
            Logger Logger = f52425a;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Service data too short: ");
            sb.append(length);
            Logger.mo25418e(sb.toString(), new Object[0]);
            return null;
        } else if (bArr[0] != 32) {
            return null;
        } else {
            if (bArr[1] == 1) {
                return Arrays.copyOfRange(bArr, 2, 18);
            }
            Logger logger2 = f52425a;
            byte b = bArr[0];
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Unexpected protocol version: ");
            sb2.append((int) b);
            logger2.mo25418e(sb2.toString(), new Object[0]);
            return null;
        }
    }
}
