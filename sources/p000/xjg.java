package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import com.felicanetworks.mfc.Felica;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjg implements xjb {

    /* renamed from: i */
    private static final sek f52402i = new sek(new String[]{"BleChannel"}, (short[]) null);

    /* renamed from: a */
    private final Context f52403a;

    /* renamed from: b */
    private final bqgj f52404b;

    /* renamed from: c */
    private final xig f52405c;

    /* renamed from: d */
    private final AtomicReference f52406d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f52407e = new AtomicReference();

    /* renamed from: f */
    private final xjf f52408f;

    /* renamed from: g */
    private final AtomicBoolean f52409g;

    /* renamed from: h */
    private final AtomicInteger f52410h;

    public xjg(Context context, bqgj bqgj, xig xig, xjf xjf) {
        this.f52403a = context;
        sdo.m34959a(bqgj);
        this.f52404b = bqgj;
        this.f52405c = xig;
        this.f52408f = xjf;
        this.f52409g = new AtomicBoolean(false);
        this.f52410h = new AtomicInteger(509);
    }

    /* renamed from: a */
    private static bqhh m43030a(Exception exc) {
        adbd a = adbe.m50105a();
        a.f61234c = 8;
        a.f61233b = exc;
        return a.mo33301a().mo33303c();
    }

    /* renamed from: b */
    private final bqgg m43031b(byte[] bArr) {
        sdo.m34970a(mo29828a());
        return this.f52404b.mo25819b(new xje(this, bArr));
    }

    /* renamed from: f */
    private final void m43032f() {
        try {
            BluetoothGattCharacteristic a = this.f52405c.mo29800a(xiv.f52382c, xiv.f52381b);
            xig xig = this.f52405c;
            xig.f52339h.mo25412b("Reading characteristic %s", a.getUuid());
            xig.f52342c.mo29808a(xif.READ_CHARACTERISTIC, new xiu(a));
            if (xig.f52344e.readCharacteristic(a)) {
                xig.f52342c.mo29806a((int) Felica.MAX_TIMEOUT);
                byte[] a2 = xig.f52343d.mo29820a(new xiu(a), 60000);
                this.f52410h.set((a2[1] & 255) | ((a2[0] & 255) << 8));
                f52402i.mo25414c("read control point length: %s", this.f52410h);
                if (this.f52410h.get() < 17) {
                    adbd a3 = adbe.m50105a();
                    a3.f61234c = 8;
                    a3.f61232a = String.format(Locale.US, "Fragment length: %d octets, min: %d", Integer.valueOf(this.f52410h.get()), 17);
                    throw a3.mo33301a().mo33303c();
                } else if (this.f52410h.get() > 509) {
                    adbd a4 = adbe.m50105a();
                    a4.f61234c = 8;
                    a4.f61232a = String.format(Locale.US, "Fragment length: %d octets, max: %d", Integer.valueOf(this.f52410h.get()), 509);
                    throw a4.mo33301a().mo33303c();
                }
            } else {
                throw new xij(String.format("Failed to initiate read characteristic operation for characteristic %s", a.getUuid()), xig.f52342c.f52357a, a);
            }
        } catch (TimeoutException | xij e) {
            throw m43030a(e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw m43030a(e2);
        }
    }

    /* renamed from: c */
    public final bqgg mo29834c() {
        sdo.m34970a(mo29828a());
        return this.f52404b.mo25813a(new xjd(this), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo29835d() {
        try {
            xig xig = this.f52405c;
            if (xig.f52344e != null) {
                xig.f52339h.mo25412b("Disconnecting from device %s", xig.f52340a);
                xig.f52342c.mo29807a(xif.DISCONNECT);
                xig.f52344e.disconnect();
                xig.f52344e.close();
                xig.f52344e = null;
            } else {
                xig.f52339h.mo25418e("BluetoothGatt is null in disconnect()", new Object[0]);
            }
            this.f52409g.set(false);
        } catch (xij e) {
            e = e;
            throw m43030a(e);
        } catch (TimeoutException e2) {
            e = e2;
            throw m43030a(e);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw m43030a(e3);
        } catch (Throwable th) {
            this.f52409g.set(false);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo29836e() {
        try {
            xig xig = this.f52405c;
            Context context = this.f52403a;
            xig.f52339h.mo25412b("Connecting to Bluetooth device %s with %d milliseconds timeout", xig.f52340a, 40000);
            xig.f52342c.mo29807a(xif.CONNECT);
            synchronized (xig.f52341b) {
                xig.f52344e = xig.f52340a.connectGatt(context, false, xig.f52346g);
            }
            xig.f52342c.mo29806a(40000);
            xig xig2 = this.f52405c;
            xig.f52339h.mo25412b("Requesting a new MTU size %d", 512);
            xig2.f52342c.mo29807a(xif.CHANGE_MTU);
            if (xig2.f52344e.requestMtu(512)) {
                xig.f52339h.mo25412b("Requesting new MTU size %d successfully", 512);
                xig2.f52342c.mo29806a((int) Felica.MAX_TIMEOUT);
                try {
                    this.f52406d.set(this.f52405c.mo29800a(xiv.f52382c, xiv.f52383d));
                    this.f52407e.set(this.f52405c.mo29800a(xiv.f52382c, xiv.f52380a));
                    m43032f();
                    try {
                        xig xig3 = this.f52405c;
                        BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) this.f52406d.get();
                        if ((bluetoothGattCharacteristic.getProperties() & 16) != 0) {
                            xig.f52339h.mo25412b("%s notification for characteristic %s", "Enabling", bluetoothGattCharacteristic.getUuid());
                            if (xig3.f52344e.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
                                xig.f52339h.mo25412b("Notification %s successfully", "enabled");
                                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(xix.f52388a);
                                if (descriptor != null) {
                                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                                    xig.f52339h.mo25412b("Writing descriptor %s", descriptor.getUuid());
                                    xig3.f52342c.mo29807a(xif.WRITE_DESCRIPTOR);
                                    if (xig3.f52344e.writeDescriptor(descriptor)) {
                                        xig3.f52342c.mo29806a((int) Felica.MAX_TIMEOUT);
                                        this.f52409g.set(true);
                                        return;
                                    }
                                    throw new xij(String.format(Locale.US, "Write descriptor %s failed", descriptor.getUuid()), xig3.f52342c.f52357a, descriptor);
                                }
                                throw new xij(String.format(Locale.US, "%s on device %s is missing client config descriptor.", xig.m42998a(bluetoothGattCharacteristic), xig3.f52344e.getDevice()), xig3.f52342c.f52357a, bluetoothGattCharacteristic);
                            }
                            throw new xij(String.format(Locale.US, "%s notification for characteristic %s failed", "Enabling", bluetoothGattCharacteristic.getUuid()), xig3.f52342c.f52357a, bluetoothGattCharacteristic);
                        }
                        throw new xij(String.format(Locale.US, "%s on device %s does not support notification", xig.m42998a(bluetoothGattCharacteristic), xig3.f52344e.getDevice()), xig3.f52342c.f52357a, bluetoothGattCharacteristic);
                    } catch (TimeoutException | xij e) {
                        throw m43030a(e);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw m43030a(e2);
                    }
                } catch (xij e3) {
                    throw m43030a(e3);
                }
            } else {
                String format = String.format(Locale.US, "Requesting a new MTU size %d failed", 512);
                xig.f52339h.mo25418e(format, new Object[0]);
                throw new xij(format, xig2.f52342c.f52357a);
            }
        } catch (TimeoutException | xij e4) {
            throw m43030a(e4);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            throw m43030a(e5);
        }
    }

    /* renamed from: b */
    public final bqgg mo29833b() {
        sdo.m34970a(!mo29828a());
        return this.f52404b.mo25813a(new xjc(this), null);
    }

    /* renamed from: a */
    public final bqgg mo29826a(xkf xkf) {
        try {
            return bqdx.m112673a(m43031b(xkf.mo29862c()), new xkw(xkf), this.f52404b);
        } catch (bypr e) {
            adbd a = adbe.m50105a();
            a.f61233b = e;
            a.f61234c = 8;
            return bqga.m112777a((Throwable) a.mo33301a());
        }
    }

    /* renamed from: a */
    public final bqgg mo29827a(xle xle) {
        return bqdx.m112673a(m43031b(xle.mo29896a()), new xlh(), this.f52404b);
    }

    /* renamed from: a */
    public final boolean mo29828a() {
        return this.f52409g.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ byte[] mo29832a(byte[] bArr) {
        int i;
        if (((BluetoothGattCharacteristic) this.f52407e.get()).getWriteType() != 1) {
            i = this.f52410h.get();
        } else {
            i = Math.min(this.f52410h.get(), this.f52405c.f52345f - 3);
        }
        List a = new xjk(i).mo29841a(-125, bArr);
        int size = a.size();
        int i2 = 0;
        while (i2 < size) {
            byte[] bArr2 = (byte[]) a.get(i2);
            try {
                xig xig = this.f52405c;
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) this.f52407e.get();
                xig.f52342c.mo29808a(xif.WRITE_CHARACTERISTIC, new xiu(bluetoothGattCharacteristic));
                xig.f52339h.mo25412b("Writing %d bytes on %s on device %s.", Integer.valueOf(bArr2.length), bluetoothGattCharacteristic.getUuid(), xig.f52340a.toString());
                bluetoothGattCharacteristic.setValue(bArr2);
                if (xig.f52344e.writeCharacteristic(bluetoothGattCharacteristic)) {
                    xig.f52342c.mo29806a((int) Felica.MAX_TIMEOUT);
                    i2++;
                } else {
                    throw new xij(String.format("Failed to initiate write characteristic operation for characteristic %s", bluetoothGattCharacteristic.getUuid()), xig.f52342c.f52357a, bluetoothGattCharacteristic);
                }
            } catch (TimeoutException | xij e) {
                throw m43030a(e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw m43030a(e2);
            }
        }
        xji xji = new xji(this.f52410h.get(), this.f52408f);
        do {
            try {
                xig xig2 = this.f52405c;
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) this.f52406d.get();
                int i3 = xji.f52412a;
                bmxy.m108582a(bluetoothGattCharacteristic2, "BluetoothGattCharacteristic is null for receiveNotification");
                xig.f52339h.mo25412b("Polling notification for characteristic %s with %d millis timeout", bluetoothGattCharacteristic2.getUuid(), Integer.valueOf(i3));
                byte[] a2 = xig2.f52343d.mo29820a(new xiu(bluetoothGattCharacteristic2), 0);
                if (a2 != null) {
                    xig.f52339h.mo25412b("Return immediately since we find notification for the characteristic.", new Object[0]);
                } else {
                    xig2.f52342c.mo29808a(xif.CHARACTERISTIC_CHANGED, new xiu(bluetoothGattCharacteristic2));
                    xig2.f52342c.mo29806a(i3);
                    a2 = xig2.f52343d.mo29820a(new xiu(bluetoothGattCharacteristic2), (long) i3);
                }
                if (a2 != null) {
                    f52402i.mo25414c("Fragment from security key (%d bytes): %s", Integer.valueOf(a2.length), boan.f132472f.mo68794a(a2));
                    if (xji.f52414c.mo29839a(a2)) {
                        byte b = xji.f52414c.f52417a;
                        if (b == -126) {
                            xji.f52411e.mo25414c("Received keepalive message: %s", boan.f132472f.mo68794a(a2));
                            xji.f52412a = bqcn.m112578a(cdvb.f181794a.mo6606a().mo78361a());
                            byte b2 = a2[3];
                            xjf xjf = xji.f52413b;
                            if (xjf != null) {
                                if (b2 == 2) {
                                    xjf.mo29720a();
                                }
                            }
                            xji.f52414c = new xjj(xji.f52415d);
                        } else if (b != -125) {
                            throw new xjh(String.format(Locale.US, "Received non message command. Command code: %d", Byte.valueOf(xji.f52414c.f52417a)));
                        }
                    } else {
                        throw new xjh(String.format(Locale.US, "Failed to add fragment. Error code: %x. Src: %s", xji.f52414c.f52418b, boan.f132472f.mo68794a(a2)));
                    }
                } else {
                    f52402i.mo25412b("The received notification fragment is null", new Object[0]);
                }
            } catch (TimeoutException | xij | xjh e3) {
                throw m43030a(e3);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw m43030a(e4);
            }
        } while (!xji.mo29837a());
        sdo.m34970a(xji.mo29837a());
        return xji.f52414c.mo29840b();
    }
}
