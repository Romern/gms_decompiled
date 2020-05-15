package p000;

/* renamed from: zyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyv {

    /* renamed from: a */
    public final zxe f56231a;

    public zyv(zxe zxe) {
        sdo.checkIfNull(zxe, "directory");
        this.f56231a = zxe;
    }

    /* renamed from: a */
    public final zxi mo31609a(String str) {
        zxe zxe = this.f56231a;
        int size = zxe.f56081a.size();
        int i = 0;
        while (i < size) {
            int i2 = ((size - i) / 2) + i;
            zxi zxi = (zxi) zxe.f56081a.get(i2);
            int compareTo = str.compareTo(zxi.f56105b);
            if (compareTo > 0) {
                i = i2 + 1;
            } else if (compareTo >= 0) {
                return zxi;
            } else {
                size = i2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo31610a() {
        zxe zxe = this.f56231a;
        return zxe.f56082b == 0 && zxe.f56081a.size() == 0;
    }
}
