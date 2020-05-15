package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: aysa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysa extends aysr {

    /* renamed from: a */
    final /* synthetic */ aysc f98391a;

    public aysa(aysc aysc) {
        this.f98391a = aysc;
    }

    /* renamed from: a */
    public final void mo54339a(int i, BluetoothGattService bluetoothGattService) {
        this.f98391a.f98400e.mo54411a(new aysz(aysb.ADD_SERVICE, bluetoothGattService), i);
    }

    /* renamed from: a */
    public final void mo54340a(aysl aysl, int i) {
        String str = aysc.f98396a;
        Object[] objArr = {aysl, Integer.valueOf(i)};
        try {
            this.f98391a.mo54346a(aysl).f98382c.mo54411a(new aysz(ayrw.SEND_NOTIFICATION), i);
        } catch (BluetoothGattException e) {
            Log.e(aysc.f98396a, String.format("An error occurred when receiving onNotificationSent", new Object[0]), e);
        }
    }

    /* renamed from: a */
    public final void mo54341a(aysl aysl, int i, int i2) {
        ayrr ayrr = this.f98391a.f98404i;
        aysp aysp = this.f98391a.f98405j;
        if (ayrr != null && aysp != null) {
            if (i2 == 0) {
                if (i != 0) {
                    Log.w(aysc.f98396a, String.format("Disconnection from %s error: %s. Proceeding anyway.", aysl, aysx.m84754a(i)));
                }
                ayrx ayrx = (ayrx) this.f98391a.f98406k.remove(aysl);
                if (ayrx != null) {
                    aysp.mo54383a(aysl);
                    synchronized (ayrx.f98380a) {
                        for (ayru ayru : ayrx.f98380a) {
                            ayru.mo54336a();
                        }
                    }
                }
                this.f98391a.f98400e.mo54411a(new aysz(aysb.CLOSE_CONNECTION), i);
            } else if (i2 != 2) {
                Log.e(aysc.f98396a, String.format("Unexpected connection state: %d", Integer.valueOf(i2)));
            } else if (i == 0) {
                Log.i(aysc.f98396a, String.format("Connected to device %s.", aysl));
                if (this.f98391a.f98406k.containsKey(aysl)) {
                    Log.w(aysc.f98396a, String.format("A connection is already open with device %s. Keeping existing one.", aysl));
                    return;
                }
                this.f98391a.f98406k.put(aysl, new ayrx(this.f98391a, aysl, ayrr));
                aysj aysj = this.f98391a.f98403h;
                int i3 = Build.VERSION.SDK_INT;
                if (!aysp.mo54386b(aysl)) {
                    Log.w(aysc.f98396a, String.format("Keeping connection open on stop advertising failed for device %s.", aysl));
                }
            } else {
                Log.e(aysc.f98396a, String.format("Connection to %s failed: %s", aysl, aysx.m84754a(i)));
            }
        }
    }

    /* renamed from: a */
    public final void mo13807a(aysl aysl, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        aysp aysp = this.f98391a.f98405j;
        if (aysp != null) {
            try {
                aysc aysc = this.f98391a;
                String str = aysc.f98396a;
                aysp.mo54384a(aysl, i, 0, i2, aysc.mo54346a(aysl).mo54337a(bluetoothGattCharacteristic).mo37594a(i2));
            } catch (BluetoothGattException e) {
                Log.e(aysc.f98396a, String.format("Could not read  %s on device %s at offset %d", aysx.m84755b(bluetoothGattCharacteristic), aysl, Integer.valueOf(i2)), e);
                aysp.mo54384a(aysl, i, e.f111041a, i2, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo54342a(aysl aysl, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        aysp aysp = this.f98391a.f98405j;
        if (aysp != null) {
            try {
                aysc aysc = this.f98391a;
                String str = aysc.f98396a;
                ayrx a = aysc.mo54346a(aysl);
                BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
                if (characteristic == null) {
                    throw new BluetoothGattException(String.format("Descriptor %s not associated with a characteristics!", aysx.m84756b(bluetoothGattDescriptor)), 257);
                } else {
                    a.mo54337a(characteristic);
                    throw new BluetoothGattException("Read not supported.", 6);
                }
            } catch (BluetoothGattException e) {
                Log.e(aysc.f98396a, String.format("Could not read %s on device %s at %d", aysx.m84756b(bluetoothGattDescriptor), aysl, Integer.valueOf(i2)), e);
                aysp.mo54384a(aysl, i, e.f111041a, i2, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo54343a(aysl aysl, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        aysl aysl2 = aysl;
        byte[] bArr2 = bArr;
        aysp aysp = this.f98391a.f98405j;
        if (aysp != null) {
            try {
                aysc aysc = this.f98391a;
                String str = aysc.f98396a;
                ayrx a = aysc.mo54346a(aysl2);
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = {Integer.valueOf(bArr2.length), valueOf, aysx.m84755b(bluetoothGattCharacteristic), a.f98381b, Boolean.valueOf(z)};
                try {
                    aysd a2 = a.mo54337a(bluetoothGattCharacteristic);
                    if (z) {
                        SortedMap sortedMap = (SortedMap) a.f98383d.get(a2);
                        if (sortedMap == null) {
                            sortedMap = new TreeMap();
                            a.f98383d.put(a2, sortedMap);
                        }
                        sortedMap.put(valueOf, bArr2);
                    } else {
                        a2.toString();
                        aysd.m84695b();
                    }
                    if (z2) {
                        aysp.mo54384a(aysl, i, 0, i2, null);
                    }
                } catch (BluetoothGattException e) {
                    e = e;
                    Log.e(aysc.f98396a, String.format("Could not write %s on device %s at offset %d", aysx.m84755b(bluetoothGattCharacteristic), aysl2, Integer.valueOf(i2)), e);
                    aysp.mo54384a(aysl, i, e.f111041a, i2, null);
                }
            } catch (BluetoothGattException e2) {
                e = e2;
                Log.e(aysc.f98396a, String.format("Could not write %s on device %s at offset %d", aysx.m84755b(bluetoothGattCharacteristic), aysl2, Integer.valueOf(i2)), e);
                aysp.mo54384a(aysl, i, e.f111041a, i2, null);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo54344a(aysl aysl, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        aysl aysl2 = aysl;
        byte[] bArr2 = bArr;
        aysp aysp = this.f98391a.f98405j;
        if (aysp != null) {
            try {
                aysc aysc = this.f98391a;
                String str = aysc.f98396a;
                ayrx a = aysc.mo54346a(aysl2);
                int length = bArr2.length;
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = {Integer.valueOf(length), valueOf, aysx.m84756b(bluetoothGattDescriptor), a.f98381b, Boolean.valueOf(z)};
                if (!z) {
                    BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
                    if (characteristic != null) {
                        a.mo54337a(characteristic);
                        if (!bluetoothGattDescriptor.getUuid().equals(aynb.f98002a)) {
                            throw new BluetoothGattException("Write not supported.", 6);
                        } else if (i2 != 0) {
                            throw new BluetoothGattException(String.format("Offset should be 0 when changing the client characteristic config: %d.", valueOf), 7);
                        } else if (length == 2) {
                            boolean containsKey = a.f98384e.containsKey(characteristic);
                            bmxy.m108581a(bArr);
                            bmxy.m108589a(true, (Object) "Length should be 2 bytes.");
                            short s = (short) ((bArr2[0] & 255) | (bArr2[1] << 8));
                            if (s != 0) {
                                if (s != 1) {
                                    if (s != 2) {
                                        throw new BluetoothGattException(String.format("Value 0x%s is undefined for the client characteristic config", boan.f132472f.mo68794a(bArr2)), 6);
                                    } else if (!containsKey) {
                                        a.f98384e.put(characteristic, new ayrt());
                                        aysd.m84694a();
                                    }
                                } else if (!containsKey) {
                                    a.f98384e.put(characteristic, new ayrs());
                                    aysd.m84694a();
                                }
                            } else if (containsKey) {
                                if (((ayrv) a.f98384e.remove(characteristic)) != null) {
                                    throw new BluetoothGattException("Notification not supported.", 6);
                                }
                            }
                            if (z2) {
                                aysp.mo54384a(aysl, i, 0, 0, null);
                            }
                        } else {
                            throw new BluetoothGattException(String.format("Value 0x%s is undefined for the client characteristic config", boan.f132472f.mo68794a(bArr2)), 13);
                        }
                    } else {
                        throw new BluetoothGattException(String.format("Descriptor %s not associated with a characteristics!", aysx.m84756b(bluetoothGattDescriptor)), 257);
                    }
                } else {
                    throw new BluetoothGattException(String.format("Prepare write not supported for descriptor %s.", bluetoothGattDescriptor), 6);
                }
            } catch (BluetoothGattException e) {
                Log.e(aysc.f98396a, String.format("Could not write %s on device %s at %d", aysx.m84756b(bluetoothGattDescriptor), aysl2, Integer.valueOf(i2)), e);
                aysp.mo54384a(aysl, i, e.f111041a, i2, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo54345a(aysl aysl, int i, boolean z) {
        aysp aysp = this.f98391a.f98405j;
        if (aysp != null) {
            try {
                aysc aysc = this.f98391a;
                String str = aysc.f98396a;
                ayrx a = aysc.mo54346a(aysl);
                if (z) {
                    try {
                        for (Map.Entry entry : a.f98383d.entrySet()) {
                            aysd aysd = (aysd) entry.getKey();
                            SortedMap sortedMap = (SortedMap) entry.getValue();
                            if (aysd == null || sortedMap == null) {
                                throw new IllegalStateException();
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Integer num = 0;
                            while (!sortedMap.isEmpty()) {
                                Integer num2 = (Integer) sortedMap.firstKey();
                                if (num2.intValue() >= num.intValue() + byteArrayOutputStream.size()) {
                                    if (num2.intValue() > num.intValue() + byteArrayOutputStream.size()) {
                                        num.intValue();
                                        byteArrayOutputStream.toByteArray();
                                        aysd.m84695b();
                                        byteArrayOutputStream.reset();
                                        num = num2;
                                    }
                                    byte[] bArr = (byte[]) sortedMap.remove(num2);
                                    if (bArr != null) {
                                        byteArrayOutputStream.write(bArr);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    int size = byteArrayOutputStream.size();
                                    String valueOf = String.valueOf(num2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                                    sb.append("Expected offset of at least ");
                                    sb.append(size);
                                    sb.append(", but got offset ");
                                    sb.append(valueOf);
                                    throw new BluetoothGattException(sb.toString(), 7);
                                }
                            }
                            if (byteArrayOutputStream.size() > 0) {
                                bmxy.m108581a(num);
                                num.intValue();
                                byteArrayOutputStream.toByteArray();
                                aysd.m84695b();
                            }
                        }
                        a.f98383d.clear();
                    } catch (IOException e) {
                        throw new BluetoothGattException("Error assembling request", 257);
                    } catch (Throwable th) {
                        a.f98383d.clear();
                        throw th;
                    }
                } else {
                    a.f98383d.clear();
                }
                aysp.mo54384a(aysl, i, 0, 0, null);
            } catch (BluetoothGattException e2) {
                Log.e(aysc.f98396a, "Could not execute write.", e2);
                aysp.mo54384a(aysl, i, e2.f111041a, 0, null);
            }
        }
    }
}
