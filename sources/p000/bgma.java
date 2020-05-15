package p000;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: bgma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgma extends bfmj {

    /* renamed from: b */
    protected final BluetoothDevice f116806b;

    public bgma(BluetoothDevice bluetoothDevice) {
        super(bupz.m120219a(bluetoothDevice.getAddress()));
        this.f116806b = bluetoothDevice;
    }

    /* renamed from: a */
    public final String mo61923a() {
        return this.f116806b.getName();
    }

    /* renamed from: b */
    public final String mo61924b() {
        try {
            Method method = this.f116806b.getClass().getMethod("getAlias", new Class[0]);
            if (method == null) {
                return null;
            }
            String str = (String) method.invoke(this.f116806b, new Object[0]);
            Object[] objArr = {mo61923a(), str};
            return str;
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: c */
    public final String mo61925c() {
        return this.f116806b.getAddress();
    }

    /* renamed from: d */
    public final int mo61926d() {
        return this.f116806b.getBondState();
    }

    /* renamed from: e */
    public final int mo61927e() {
        BluetoothClass i = mo63001i();
        if (i != null) {
            return i.getDeviceClass();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgma) {
            return this.f116806b.equals(((bgma) obj).f116806b);
        }
        return false;
    }

    /* renamed from: f */
    public final int mo61929f() {
        BluetoothClass i = mo63001i();
        if (i != null) {
            return i.getMajorDeviceClass();
        }
        return 0;
    }

    /* renamed from: g */
    public final String[] mo61930g() {
        UUID uuid;
        ParcelUuid[] j = mo63002j();
        if (j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ParcelUuid parcelUuid : j) {
            if (!(parcelUuid == null || (uuid = parcelUuid.getUuid()) == null)) {
                arrayList.add(uuid.toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: h */
    public int mo61931h() {
        return 0;
    }

    public final int hashCode() {
        return this.f116806b.hashCode();
    }

    /* renamed from: i */
    public final BluetoothClass mo63001i() {
        return this.f116806b.getBluetoothClass();
    }

    /* renamed from: j */
    public ParcelUuid[] mo63002j() {
        return null;
    }
}
