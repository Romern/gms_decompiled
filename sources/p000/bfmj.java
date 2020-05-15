package p000;

import java.util.Arrays;

/* renamed from: bfmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfmj {

    /* renamed from: a */
    public final long f114403a;

    protected bfmj(long j) {
        this.f114403a = j;
    }

    /* renamed from: a */
    private static boolean m97233a(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    /* renamed from: a */
    public abstract String mo61923a();

    /* renamed from: b */
    public abstract String mo61924b();

    /* renamed from: c */
    public abstract String mo61925c();

    /* renamed from: d */
    public abstract int mo61926d();

    /* renamed from: e */
    public abstract int mo61927e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfmj) {
            bfmj bfmj = (bfmj) obj;
            return m97233a(mo61923a(), bfmj.mo61923a()) && m97233a(mo61924b(), bfmj.mo61924b()) && mo61925c().equals(bfmj.mo61925c()) && mo61926d() == bfmj.mo61926d() && mo61927e() == bfmj.mo61927e() && mo61929f() == bfmj.mo61929f() && Arrays.equals(mo61930g(), bfmj.mo61930g()) && mo61931h() == bfmj.mo61931h();
        }
    }

    /* renamed from: f */
    public abstract int mo61929f();

    /* renamed from: g */
    public abstract String[] mo61930g();

    /* renamed from: h */
    public abstract int mo61931h();

    public int hashCode() {
        String a = mo61923a();
        Object[] objArr = new Object[7];
        objArr[0] = mo61925c();
        objArr[1] = Integer.valueOf(mo61927e());
        objArr[2] = Integer.valueOf(mo61929f());
        objArr[3] = Integer.valueOf(mo61926d());
        if (a == null) {
            a = "";
        }
        objArr[4] = a;
        objArr[5] = Integer.valueOf(mo61931h());
        objArr[6] = Integer.valueOf(Arrays.hashCode(mo61930g()));
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothDeviceGetter [");
        sb.append("name=");
        sb.append(mo61923a());
        sb.append(", alias=");
        sb.append(mo61924b());
        sb.append(", deviceClass=");
        sb.append(mo61927e());
        sb.append(", majorDeviceClass=");
        sb.append(mo61929f());
        sb.append(", bondState=");
        sb.append(mo61926d());
        sb.append(", address=");
        sb.append(mo61925c());
        sb.append(", type=");
        sb.append(mo61931h());
        sb.append(", uuids=[");
        String[] g = mo61930g();
        if (g != null) {
            int length = g.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                String str = g[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                i++;
                z = false;
            }
        }
        sb.append("]]");
        return sb.toString();
    }
}
