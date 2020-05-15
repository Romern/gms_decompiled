package p000;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;

/* renamed from: xit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xit {

    /* renamed from: a */
    private static final sek f52377a = new sek(new String[]{"BleUtil"}, (short[]) null);

    /* renamed from: a */
    public static boolean m43015a(ScanResult scanResult) {
        bmxy.m108581a(scanResult);
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            f52377a.mo25412b("Scanned device %s is discarded since scan record is null", scanResult.getDevice());
            return false;
        }
        int advertiseFlags = scanRecord.getAdvertiseFlags();
        if (advertiseFlags == -1) {
            f52377a.mo25412b("Scanned device %s is discarded since ad flags are not set", scanResult.getDevice());
            return false;
        }
        int i = advertiseFlags & 2;
        int i2 = advertiseFlags & 1;
        if (i == 0 && i2 == 0) {
            f52377a.mo25412b("Scanned device %s discarded since the advertise flag is %d", scanResult.getDevice(), Integer.valueOf(advertiseFlags));
            return false;
        } else if (i == 0 || i2 == 0) {
            f52377a.mo25412b("Scanned device %s is in pairing mode since the advertise flag is %d", scanResult.getDevice(), Integer.valueOf(advertiseFlags));
            return true;
        } else {
            f52377a.mo25418e("Advertise flag %d for device %s is impossible", Integer.valueOf(advertiseFlags), scanResult.getDevice());
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m43016b(ScanResult scanResult) {
        bmxy.m108581a(scanResult);
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            f52377a.mo25412b("Scanned device %s does not require PIN pairing since scan record is null", scanResult.getDevice());
            return false;
        }
        byte[] serviceData = scanRecord.getServiceData(new ParcelUuid(xiv.f52382c));
        if (serviceData == null) {
            f52377a.mo25412b("Service data for scanned device %s is null", scanResult.getDevice());
            return false;
        } else if (serviceData.length <= 0) {
            f52377a.mo25412b("Service data length is zero for scanned device %s", scanResult.getDevice());
            return false;
        } else if ((serviceData[0] & 64) != 0) {
            f52377a.mo25412b("Scanned device %s requires PIN pairing", scanResult.getDevice());
            return true;
        } else {
            f52377a.mo25412b("Scanned device %s does not require PIN pairing", scanResult.getDevice());
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m43017c(ScanResult scanResult) {
        bmxy.m108581a(scanResult);
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            f52377a.mo25412b("Scanned device %s is discarded since scan record is null", scanResult.getDevice());
            return false;
        } else if (scanRecord.getAdvertiseFlags() != -1) {
            return true;
        } else {
            f52377a.mo25412b("Scanned device %s is discarded since advertise flags are not set", scanResult.getDevice());
            return false;
        }
    }
}
