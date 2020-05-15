package p000;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: nek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nek {

    /* renamed from: f */
    private static final ParcelUuid f35397f = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public final List f35398a;

    /* renamed from: b */
    public final Map f35399b;

    /* renamed from: c */
    public final int f35400c;

    /* renamed from: d */
    public final String f35401d;

    /* renamed from: e */
    public final byte[] f35402e;

    /* renamed from: g */
    private final int f35403g;

    /* renamed from: h */
    private final SparseArray f35404h;

    private nek(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.f35398a = list;
        this.f35404h = sparseArray;
        this.f35399b = map;
        this.f35401d = str;
        this.f35403g = i;
        this.f35400c = i2;
        this.f35402e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    public static nek m26028a(byte[] bArr) {
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
                        hashMap.put(m26031b(m26030a(bArr, i4, 2)), m26030a(bArr, i4 + 2, i3 - 2));
                    } else if (b4 != 255) {
                        switch (b4) {
                            case 1:
                                b = bArr[i4] & 255;
                                continue;
                            case 2:
                            case 3:
                                m26029a(bArr, i4, i3, 2, arrayList2);
                                continue;
                            case 4:
                            case 5:
                                m26029a(bArr, i4, i3, 4, arrayList2);
                                continue;
                            case 6:
                            case 7:
                                m26029a(bArr, i4, i3, 16, arrayList2);
                                continue;
                            case 8:
                            case 9:
                                str = new String(m26030a(bArr, i4, i3));
                                continue;
                            case 10:
                                b2 = bArr[i4];
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        sparseArray.put(((bArr[i4 + 1] & 255) << 8) + (255 & bArr[i4]), m26030a(bArr, i4 + 2, i3 - 2));
                    }
                    i = i3 + i4;
                } else {
                    if (arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new nek(arrayList, sparseArray, hashMap, b, b2, str, bArr);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(Arrays.toString(bArr));
                Log.w("BleRecord", valueOf.length() == 0 ? new String("Unable to parse scan record: ") : "Unable to parse scan record: ".concat(valueOf), e);
                return new nek(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
        }
        return new nek(arrayList, sparseArray, hashMap, b, b2, str, bArr);
    }

    /* renamed from: b */
    private static ParcelUuid m26031b(byte[] bArr) {
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
            return new ParcelUuid(new UUID(f35397f.getUuid().getMostSignificantBits() + (j << 32), f35397f.getUuid().getLeastSignificantBits()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nek) {
            return Arrays.equals(this.f35402e, ((nek) obj).f35402e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35402e);
    }

    public final String toString() {
        String str;
        int i = this.f35403g;
        String valueOf = String.valueOf(this.f35398a);
        SparseArray sparseArray = this.f35404h;
        String str2 = "{}";
        if (sparseArray == null) {
            str = "null";
        } else if (sparseArray.size() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sb.append(sparseArray.keyAt(i2));
                sb.append("=");
                sb.append(Arrays.toString((byte[]) sparseArray.valueAt(i2)));
            }
            sb.append('}');
            str = sb.toString();
        } else {
            str = str2;
        }
        Map map = this.f35399b;
        if (map == null) {
            str2 = "null";
        } else if (!map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('{');
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Object key = ((Map.Entry) it.next()).getKey();
                sb2.append(key);
                sb2.append("=");
                sb2.append(Arrays.toString((byte[]) map.get(key)));
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            str2 = sb2.toString();
        }
        int i3 = this.f35400c;
        String str3 = this.f35401d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 133 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("BleRecord [advertiseFlags=");
        sb3.append(i);
        sb3.append(", serviceUuids=");
        sb3.append(valueOf);
        sb3.append(", manufacturerSpecificData=");
        sb3.append(str);
        sb3.append(", serviceData=");
        sb3.append(str2);
        sb3.append(", txPowerLevel=");
        sb3.append(i3);
        sb3.append(", deviceName=");
        sb3.append(str3);
        sb3.append("]");
        return sb3.toString();
    }

    /* renamed from: a */
    private static void m26029a(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(m26031b(m26030a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
    }

    /* renamed from: a */
    private static byte[] m26030a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo20525a(int i) {
        SparseArray sparseArray = this.f35404h;
        if (sparseArray != null) {
            return (byte[]) sparseArray.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final byte[] mo20526a(ParcelUuid parcelUuid) {
        Map map;
        if (parcelUuid == null || (map = this.f35399b) == null) {
            return null;
        }
        return (byte[]) map.get(parcelUuid);
    }
}
