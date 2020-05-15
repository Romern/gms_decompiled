package p000;

/* renamed from: aiwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwh extends aixy {

    /* renamed from: a */
    public final ByteString f69930a;

    /* renamed from: b */
    public final int f69931b;

    /* renamed from: c */
    public final int f69932c;

    /* renamed from: d */
    public final double f69933d;

    /* renamed from: e */
    public final String f69934e;

    /* renamed from: f */
    public final int f69935f;

    public aiwh(ByteString bxtx, int i, int i2, double d, String str, int i3) {
        this.f69930a = bxtx;
        this.f69931b = i;
        this.f69932c = i2;
        this.f69933d = d;
        this.f69934e = str;
        this.f69935f = i3;
    }

    /* renamed from: a */
    public final ByteString mo38150a() {
        return this.f69930a;
    }

    /* renamed from: b */
    public final int mo38151b() {
        return this.f69931b;
    }

    /* renamed from: c */
    public final int mo38152c() {
        return this.f69932c;
    }

    /* renamed from: d */
    public final double mo38153d() {
        return this.f69933d;
    }

    /* renamed from: e */
    public final String mo38154e() {
        return this.f69934e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aixy) {
            aixy aixy = (aixy) obj;
            if (this.f69930a.equals(aixy.mo38150a()) && this.f69931b == aixy.mo38151b() && this.f69932c == aixy.mo38152c() && Double.doubleToLongBits(this.f69933d) == Double.doubleToLongBits(aixy.mo38153d()) && this.f69934e.equals(aixy.mo38154e())) {
                int i = this.f69935f;
                int f = aixy.mo38156f();
                if (i == 0) {
                    throw null;
                } else if (i == f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo38156f() {
        return this.f69935f;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f69930a.hashCode() ^ 1000003) * 1000003) ^ this.f69931b) * 1000003) ^ this.f69932c) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f69933d) >>> 32) ^ Double.doubleToLongBits(this.f69933d)))) * 1000003) ^ this.f69934e.hashCode()) * 1000003;
        int i = this.f69935f;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f69930a);
        int i = this.f69931b;
        int i2 = this.f69932c;
        double d = this.f69933d;
        String str2 = this.f69934e;
        int i3 = this.f69935f;
        if (i3 == 0) {
            str = "null";
        } else if (i3 == 0) {
            throw null;
        } else if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        } else {
            throw null;
        }
        String valueOf2 = String.valueOf(str);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 133 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("FastPairBleDeviceCache{modelId=");
        sb.append(valueOf);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append(", distance=");
        sb.append(d);
        sb.append(", macAddress=");
        sb.append(str2);
        sb.append(", bleScanMode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
