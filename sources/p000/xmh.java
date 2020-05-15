package p000;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: xmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmh {

    /* renamed from: a */
    static final byte[] f52735a = {6, -48, -15};

    /* renamed from: g */
    private static final Logger f52736g = new Logger(new String[]{"HidFidoDevice"}, (short[]) null);

    /* renamed from: b */
    public final UsbDevice f52737b;

    /* renamed from: c */
    public final int f52738c;

    /* renamed from: d */
    public byte f52739d = 0;

    /* renamed from: e */
    public UsbDeviceConnection f52740e;

    /* renamed from: f */
    private final UsbManager f52741f;

    private xmh(UsbDevice usbDevice, UsbManager usbManager, int i) {
        this.f52737b = usbDevice;
        this.f52741f = usbManager;
        this.f52738c = i;
    }

    /* renamed from: a */
    private static UsbDeviceConnection m43168a(UsbManager usbManager, UsbDevice usbDevice, int i) {
        UsbDeviceConnection usbDeviceConnection = null;
        for (int i2 = 0; i2 < 5 && usbDeviceConnection == null; i2++) {
            usbDeviceConnection = usbManager.openDevice(usbDevice);
        }
        if (usbDeviceConnection == null) {
            int deviceId = usbDevice.getDeviceId();
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unable to open device (");
            sb.append(deviceId);
            sb.append(")");
            throw new xmm(sb.toString());
        } else if (m43171a(usbDeviceConnection, usbDevice.getInterface(i))) {
            return usbDeviceConnection;
        } else {
            int deviceId2 = usbDevice.getDeviceId();
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Unable to claim interface for device (");
            sb2.append(deviceId2);
            sb2.append(")");
            throw new xmm(sb2.toString());
        }
    }

    /* renamed from: b */
    public final int mo29945b() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        try {
            mo29944a(new xmj(-1, xmf.CMD_INIT, bArr));
            xmj a = mo29943a();
            if (a.mo29948c().length == 17) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.mo29948c());
                byte[] bArr2 = new byte[8];
                byteArrayInputStream.read(bArr2);
                if (Arrays.equals(bArr, bArr2)) {
                    byte[] bArr3 = new byte[4];
                    byteArrayInputStream.read(bArr3);
                    byteArrayInputStream.skip(4);
                    this.f52739d = (byte) byteArrayInputStream.read();
                    return ByteBuffer.wrap(bArr3).getInt();
                }
                throw new xmm("Nonce did not match");
            }
            throw new xmm("Init response payload is incorrect size");
        } catch (IOException e) {
            throw new xmm("Error during init message transaction", e);
        }
    }

    /* renamed from: a */
    public static xmh m43169a(UsbDevice usbDevice, UsbManager usbManager) {
        UsbDevice usbDevice2 = usbDevice;
        UsbManager usbManager2 = usbManager;
        sdo.m34959a(usbDevice);
        sdo.m34959a(usbManager);
        try {
            TreeMap treeMap = new TreeMap();
            for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
                UsbInterface usbInterface = usbDevice2.getInterface(i);
                if (usbInterface.getInterfaceClass() == 3) {
                    treeMap.put(Integer.valueOf(i), usbInterface);
                }
            }
            if (!treeMap.isEmpty()) {
                UsbDeviceConnection openDevice = usbManager2.openDevice(usbDevice2);
                if (openDevice != null) {
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            if (m43171a(openDevice, (UsbInterface) entry.getValue())) {
                                byte[] bArr = new byte[34];
                                int i2 = -1;
                                int i3 = 0;
                                while (i3 < 5 && i2 != 34) {
                                    int i4 = i3;
                                    byte[] bArr2 = bArr;
                                    i2 = openDevice.controlTransfer(129, 6, 8704, ((Integer) entry.getKey()).intValue(), bArr, 34, 1000);
                                    if (i2 != 34 || !Arrays.equals(f52735a, Arrays.copyOf(bArr2, f52735a.length))) {
                                        i3 = i4 + 1;
                                        bArr = bArr2;
                                    } else {
                                        Logger Logger = f52736g;
                                        int deviceId = usbDevice.getDeviceId();
                                        StringBuilder sb = new StringBuilder(48);
                                        sb.append("Device (");
                                        sb.append(deviceId);
                                        sb.append(") has a valid FIDO descriptor");
                                        Logger.mo25414c(sb.toString(), new Object[0]);
                                        xmh xmh = new xmh(usbDevice2, usbManager2, ((Integer) entry.getKey()).intValue());
                                        openDevice.releaseInterface((UsbInterface) entry.getValue());
                                        openDevice.close();
                                        return xmh;
                                    }
                                }
                                openDevice.releaseInterface((UsbInterface) entry.getValue());
                            }
                        }
                        openDevice.close();
                        int deviceId2 = usbDevice.getDeviceId();
                        StringBuilder sb2 = new StringBuilder(49);
                        sb2.append("Device (");
                        sb2.append(deviceId2);
                        sb2.append(") is not a U2F or CTAP2 device");
                        throw new xmm(sb2.toString());
                    } catch (Throwable th) {
                        openDevice.close();
                        throw th;
                    }
                } else {
                    int deviceId3 = usbDevice.getDeviceId();
                    StringBuilder sb3 = new StringBuilder(35);
                    sb3.append("Unable to open device (");
                    sb3.append(deviceId3);
                    sb3.append(")");
                    throw new xmm(sb3.toString());
                }
            } else {
                throw new xmm("No HID interfaces");
            }
        } catch (xmm e) {
            int deviceId4 = usbDevice.getDeviceId();
            StringBuilder sb4 = new StringBuilder(41);
            sb4.append("Device (");
            sb4.append(deviceId4);
            sb4.append(") is not an HID device");
            throw new xmm(sb4.toString(), e);
        }
    }

    /* renamed from: a */
    static final void m43170a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, byte[] bArr) {
        int i = 0;
        while (i < 5) {
            int length = bArr.length;
            int bulkTransfer = usbDeviceConnection.bulkTransfer(usbEndpoint, bArr, length, 1000);
            if (bulkTransfer != length) {
                f52736g.mo25418e("Transferred (%d) bytes instead of (%d), retrying.", Integer.valueOf(bulkTransfer), Integer.valueOf(length));
                i++;
            } else {
                f52736g.mo25412b("Transferred (%d bytes): %s", Integer.valueOf(length), boan.f132472f.mo68794a(bArr));
                return;
            }
        }
        throw new xmm("Error during message transfer");
    }

    /* renamed from: a */
    private static boolean m43171a(UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface) {
        for (int i = 0; i < 5; i++) {
            if (usbDeviceConnection.claimInterface(usbInterface, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final xmj mo29943a() {
        UsbDeviceConnection usbDeviceConnection = this.f52740e;
        if (usbDeviceConnection == null) {
            usbDeviceConnection = m43168a(this.f52741f, this.f52737b, this.f52738c);
            this.f52740e = usbDeviceConnection;
        }
        UsbInterface usbInterface = this.f52737b.getInterface(this.f52738c);
        for (int i = 0; i < usbInterface.getEndpointCount(); i++) {
            if (usbInterface.getEndpoint(i).getDirection() == 128) {
                UsbEndpoint endpoint = usbInterface.getEndpoint(i);
                byte[] bArr = new byte[64];
                m43170a(usbDeviceConnection, endpoint, bArr);
                xmj xmj = new xmj(bArr);
                while (!xmj.mo29946a()) {
                    m43170a(usbDeviceConnection, endpoint, bArr);
                    try {
                        if (!xmj.mo29946a()) {
                            int min = Math.min(59, xmj.f52745b - xmj.f52747d);
                            int i2 = ByteBuffer.wrap(Arrays.copyOf(bArr, 4)).getInt();
                            byte b = bArr[4];
                            int i3 = xmj.f52746c;
                            if (i2 == i3) {
                                byte b2 = xmj.f52748e;
                                if (b == b2) {
                                    xmj.f52748e = (byte) (b2 + 1);
                                    xmj.f52744a.add(new xmg(i3, b2, Arrays.copyOfRange(bArr, 5, min + 5)));
                                    xmj.f52747d += min;
                                } else {
                                    throw new xml("Provided packet's sequence is not the next sequence in the message");
                                }
                            } else {
                                throw new xml("Provided packet's channel id does not match message's channel id");
                            }
                        } else {
                            throw new xml("Message already complete");
                        }
                    } catch (xml e) {
                    }
                }
                return xmj;
            }
        }
        throw new xmm("No IN endpoint");
    }

    /* renamed from: a */
    public final void mo29944a(xmj xmj) {
        sdo.m34959a(xmj);
        UsbDeviceConnection usbDeviceConnection = this.f52740e;
        if (usbDeviceConnection == null) {
            usbDeviceConnection = m43168a(this.f52741f, this.f52737b, this.f52738c);
            this.f52740e = usbDeviceConnection;
        }
        UsbInterface usbInterface = this.f52737b.getInterface(this.f52738c);
        for (int i = 0; i < usbInterface.getEndpointCount(); i++) {
            if (usbInterface.getEndpoint(i).getDirection() == 0) {
                UsbEndpoint endpoint = usbInterface.getEndpoint(i);
                List b = xmj.mo29947b();
                int size = b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m43170a(usbDeviceConnection, endpoint, ((xmk) b.get(i2)).mo29940a());
                }
                return;
            }
        }
        throw new xmm("No OUT endpoint");
    }
}
