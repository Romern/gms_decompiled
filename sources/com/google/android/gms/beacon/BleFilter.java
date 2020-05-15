package com.google.android.gms.beacon;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nei();

    /* renamed from: a */
    public final String f29254a;

    /* renamed from: b */
    public final String f29255b;

    /* renamed from: c */
    public final ParcelUuid f29256c;

    /* renamed from: d */
    public final ParcelUuid f29257d;

    /* renamed from: e */
    public final ParcelUuid f29258e;

    /* renamed from: f */
    public final byte[] f29259f;

    /* renamed from: g */
    public final byte[] f29260g;

    /* renamed from: h */
    public final int f29261h;

    /* renamed from: i */
    public final byte[] f29262i;

    /* renamed from: j */
    public final byte[] f29263j;

    public BleFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.f29254a = str;
        this.f29256c = parcelUuid;
        this.f29257d = parcelUuid2;
        this.f29255b = str2;
        this.f29258e = parcelUuid3;
        this.f29259f = bArr;
        this.f29260g = bArr2;
        this.f29261h = i;
        this.f29262i = bArr3;
        this.f29263j = bArr4;
    }

    /* renamed from: a */
    private static boolean m22037a(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        UUID uuid;
        if (list != null) {
            if (parcelUuid2 != null) {
                uuid = parcelUuid2.getUuid();
            } else {
                uuid = null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UUID uuid2 = parcelUuid.getUuid();
                UUID uuid3 = ((ParcelUuid) it.next()).getUuid();
                if (uuid == null) {
                    if (uuid2.equals(uuid3)) {
                        return true;
                    }
                } else if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleFilter bleFilter = (BleFilter) obj;
            return sdg.m34949a(this.f29254a, bleFilter.f29254a) && sdg.m34949a(this.f29255b, bleFilter.f29255b) && this.f29261h == bleFilter.f29261h && Arrays.equals(this.f29262i, bleFilter.f29262i) && Arrays.equals(this.f29263j, bleFilter.f29263j) && sdg.m34949a(this.f29258e, bleFilter.f29258e) && Arrays.equals(this.f29259f, bleFilter.f29259f) && Arrays.equals(this.f29260g, bleFilter.f29260g) && sdg.m34949a(this.f29256c, bleFilter.f29256c) && sdg.m34949a(this.f29257d, bleFilter.f29257d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29254a, this.f29255b, Integer.valueOf(this.f29261h), Integer.valueOf(Arrays.hashCode(this.f29262i)), Integer.valueOf(Arrays.hashCode(this.f29263j)), this.f29258e, Integer.valueOf(Arrays.hashCode(this.f29259f)), Integer.valueOf(Arrays.hashCode(this.f29260g)), this.f29256c, this.f29257d});
    }

    public final String toString() {
        String str = this.f29254a;
        String str2 = this.f29255b;
        String valueOf = String.valueOf(this.f29256c);
        String valueOf2 = String.valueOf(this.f29257d);
        String valueOf3 = String.valueOf(this.f29258e);
        String arrays = Arrays.toString(this.f29259f);
        String arrays2 = Arrays.toString(this.f29260g);
        int i = this.f29261h;
        String arrays3 = Arrays.toString(this.f29262i);
        String arrays4 = Arrays.toString(this.f29263j);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(arrays).length();
        int length7 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 177 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("BleFilter [deviceName=");
        sb.append(str);
        sb.append(", deviceAddress=");
        sb.append(str2);
        sb.append(", uuid=");
        sb.append(valueOf);
        sb.append(", uuidMask=");
        sb.append(valueOf2);
        sb.append(", serviceDataUuid=");
        sb.append(valueOf3);
        sb.append(", serviceData=");
        sb.append(arrays);
        sb.append(", serviceDataMask=");
        sb.append(arrays2);
        sb.append(", manufacturerId=");
        sb.append(i);
        sb.append(", manufacturerData=");
        sb.append(arrays3);
        sb.append(", manufacturerDataMask=");
        sb.append(arrays4);
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f29254a, false);
        see.m35046a(parcel, 3, this.f29255b, false);
        see.m35040a(parcel, 4, this.f29256c, i, false);
        see.m35040a(parcel, 5, this.f29257d, i, false);
        see.m35040a(parcel, 6, this.f29258e, i, false);
        see.m35052a(parcel, 7, this.f29259f, false);
        see.m35052a(parcel, 8, this.f29260g, false);
        see.m35063b(parcel, 9, this.f29261h);
        see.m35052a(parcel, 10, this.f29262i, false);
        see.m35052a(parcel, 11, this.f29263j, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    static boolean m22038a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr2[i2];
            if ((bArr3[i2] & b) != (b & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m22039a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if ((Arrays.equals(bArr, bArr3) && Arrays.equals(bArr2, bArr4)) || bArr == null) {
            return true;
        }
        if (bArr3 == null) {
            return false;
        }
        if (!(bArr2 == null || bArr4 == null)) {
            int i = 0;
            int i2 = 0;
            while (i < bArr2.length && i2 < bArr4.length) {
                byte b = bArr2[i];
                if ((bArr4[i2] & b) != b) {
                    return false;
                }
                i++;
                i2++;
            }
        }
        return m22038a(bArr, bArr2, bArr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r1.equals(r4) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if ((r8 & r12) == r8) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (m22037a(r1, r3, java.util.Arrays.asList(r4)) == false) goto L_0x0076;
     */
    /* renamed from: a */
    public final boolean mo17291a(BleFilter bleFilter) {
        if (bleFilter == null) {
            return false;
        }
        if (equals(bleFilter)) {
            return true;
        }
        String str = this.f29255b;
        if (str != null && !str.equals(bleFilter.f29255b)) {
            return false;
        }
        String str2 = this.f29254a;
        if (str2 != null && !str2.equals(bleFilter.f29254a)) {
            return false;
        }
        ParcelUuid parcelUuid = this.f29256c;
        if (parcelUuid != null) {
            ParcelUuid parcelUuid2 = this.f29257d;
            ParcelUuid parcelUuid3 = bleFilter.f29256c;
            ParcelUuid parcelUuid4 = bleFilter.f29257d;
            if (parcelUuid3 != null) {
                if (parcelUuid2 != null) {
                    if (parcelUuid4 != null) {
                        long mostSignificantBits = parcelUuid2.getUuid().getMostSignificantBits();
                        long leastSignificantBits = parcelUuid2.getUuid().getLeastSignificantBits();
                        long mostSignificantBits2 = parcelUuid4.getUuid().getMostSignificantBits();
                        long leastSignificantBits2 = parcelUuid4.getUuid().getLeastSignificantBits();
                        if ((mostSignificantBits2 & mostSignificantBits) == mostSignificantBits) {
                        }
                    }
                }
            }
            return false;
        }
        ParcelUuid parcelUuid5 = this.f29258e;
        if (parcelUuid5 != null && (!parcelUuid5.equals(bleFilter.f29258e) || !m22039a(this.f29259f, this.f29260g, bleFilter.f29259f, bleFilter.f29260g))) {
            return false;
        }
        int i = this.f29261h;
        return i < 0 || (i == bleFilter.f29261h && m22039a(this.f29262i, this.f29263j, bleFilter.f29262i, bleFilter.f29263j));
    }

    /* renamed from: a */
    public final boolean mo17292a(BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice = bleSighting.f29271a;
        String str = this.f29255b;
        if (str != null && (bluetoothDevice == null || !str.equals(bluetoothDevice.getAddress()))) {
            return false;
        }
        nek nek = bleSighting.f29272b;
        if (nek == null && (this.f29254a != null || this.f29256c != null || this.f29262i != null || this.f29259f != null)) {
            return false;
        }
        String str2 = this.f29254a;
        if (str2 != null && !str2.equals(nek.f35401d)) {
            return false;
        }
        ParcelUuid parcelUuid = this.f29256c;
        if (parcelUuid != null && !m22037a(parcelUuid, this.f29257d, nek.f35398a)) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f29258e;
        if (parcelUuid2 != null && !m22038a(this.f29259f, this.f29260g, nek.mo20526a(parcelUuid2))) {
            return false;
        }
        int i = this.f29261h;
        return i < 0 || m22038a(this.f29262i, this.f29263j, nek.mo20525a(i));
    }
}
