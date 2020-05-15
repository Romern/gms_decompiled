package p000;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.nearby.messages.Message;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: aizv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizv {

    /* renamed from: d */
    private static final ParcelUuid f70188d = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public final List f70189a;

    /* renamed from: b */
    public final Map f70190b;

    /* renamed from: c */
    public final byte[] f70191c;

    /* renamed from: e */
    private final int f70192e;

    /* renamed from: f */
    private final SparseArray f70193f;

    /* renamed from: g */
    private final int f70194g;

    /* renamed from: h */
    private final String f70195h;

    private aizv(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.f70189a = list;
        this.f70193f = sparseArray;
        this.f70190b = map;
        this.f70195h = str;
        this.f70192e = i;
        this.f70194g = i2;
        this.f70191c = bArr;
    }

    /* renamed from: a */
    public static aizv m58304a(Message message) {
        boolean a = message.mo44302a("__ble_record");
        String str = message.f80677c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("Message type '");
        sb.append(str);
        sb.append("' is not Message.MESSAGE_TYPE_BLE_RECORD.");
        sdo.m34975b(a, sb.toString());
        return m58305a(message.f80676b);
    }

    /* renamed from: b */
    private static ParcelUuid m58308b(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length != 2) {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16)) + ((long) ((bArr[3] & 255) << 24));
            } else {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
            }
            return new ParcelUuid(new UUID(f70188d.getUuid().getMostSignificantBits() + (j << 32), f70188d.getUuid().getLeastSignificantBits()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aizv) {
            return Arrays.equals(this.f70191c, ((aizv) obj).f70191c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f70191c);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f70192e;
        String valueOf = String.valueOf(this.f70189a);
        SparseArray sparseArray = this.f70193f;
        StringBuilder sb = new StringBuilder();
        String str4 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str4;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb.append(keyAt);
                sb.append('=');
                if (bArr != null) {
                    str3 = srv.m36164d(bArr);
                } else {
                    str3 = null;
                }
                sb.append(str3);
            }
            sb.append('}');
            str = sb.toString();
        }
        Map map = this.f70190b;
        StringBuilder sb2 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 != null) {
                    str2 = srv.m36164d(bArr2);
                } else {
                    str2 = null;
                }
                sb2.append(str2);
                i2++;
            }
            sb2.append('}');
            str4 = sb2.toString();
        }
        int i4 = this.f70194g;
        String str5 = this.f70195h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb3 = new StringBuilder(length + 139 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(valueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(str);
        sb3.append(", mServiceData=");
        sb3.append(str4);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str5);
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    public static aizv m58305a(byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        int i = 0;
        byte b = -1;
        String str = null;
        byte b2 = -2147483648;
        while (i < bArr.length) {
            try {
                int i2 = i + 1;
                byte b3 = bArr[i] & 255;
                if (b3 != 0) {
                    int i3 = b3 - 1;
                    int i4 = i2 + 1;
                    byte b4 = bArr[i2] & 255;
                    if (b4 == 22) {
                        hashMap.put(m58308b(m58307a(bArr, i4, 2)), m58307a(bArr, i4 + 2, i3 - 2));
                    } else if (b4 != 255) {
                        switch (b4) {
                            case 1:
                                b = bArr[i4] & 255;
                                continue;
                            case 2:
                            case 3:
                                m58306a(bArr, i4, i3, 2, arrayList2);
                                continue;
                            case 4:
                            case 5:
                                m58306a(bArr, i4, i3, 4, arrayList2);
                                continue;
                            case 6:
                            case 7:
                                m58306a(bArr, i4, i3, 16, arrayList2);
                                continue;
                            case 8:
                            case 9:
                                str = new String(m58307a(bArr, i4, i3));
                                continue;
                            case 10:
                                b2 = bArr[i4];
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        sparseArray.put(((bArr[i4 + 1] & 255) << 8) + (255 & bArr[i4]), m58307a(bArr, i4 + 2, i3 - 2));
                    }
                    i = i3 + i4;
                } else {
                    if (arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new aizv(arrayList, sparseArray, hashMap, b, b2, str, bArr);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(Arrays.toString(bArr));
                Log.w("BleRecord", valueOf.length() == 0 ? new String("Unable to parse scan record: ") : "Unable to parse scan record: ".concat(valueOf), e);
                return null;
            }
        }
        if (arrayList2.isEmpty()) {
        }
        return new aizv(arrayList, sparseArray, hashMap, b, b2, str, bArr);
    }

    /* renamed from: a */
    private static void m58306a(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(m58308b(m58307a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
    }

    /* renamed from: a */
    private static byte[] m58307a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo38346a(int i) {
        return (byte[]) this.f70193f.get(i);
    }
}
