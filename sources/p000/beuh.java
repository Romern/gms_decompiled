package p000;

import java.util.Locale;

/* renamed from: beuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuh {

    /* renamed from: a */
    public final int f112477a;

    /* renamed from: b */
    public final boolean f112478b;

    /* renamed from: c */
    public final bfmj f112479c;

    public beuh(bfmj bfmj, boolean z) {
        this.f112479c = bfmj;
        this.f112478b = z;
        int i = 100;
        if (bfmj.mo61927e() == 1056) {
            Locale locale = Locale.US;
            new Object[1][0] = bfmj.mo61923a();
        } else {
            String[] strArr = {bfmj.mo61923a(), bfmj.mo61924b()};
            bnic bnic = beui.f112480a;
            int i2 = 0;
            while (true) {
                if (i2 < 2) {
                    if (beui.m95882a(strArr[i2], beui.f112480a, beui.f112481b)) {
                        Locale locale2 = Locale.US;
                        Object[] objArr = {bfmj.mo61923a(), bfmj.mo61924b()};
                        break;
                    }
                    i2++;
                } else if (!beui.m95883b(bfmj)) {
                    Locale locale3 = Locale.US;
                    Object[] objArr2 = {bfmj.mo61923a(), bfmj.mo61924b()};
                    i = 0;
                } else {
                    Locale locale4 = Locale.US;
                    new Object[1][0] = bfmj.mo61923a();
                    i = 50;
                }
            }
        }
        this.f112477a = i;
    }

    /* renamed from: a */
    public final boolean mo61151a() {
        return this.f112477a > 90;
    }

    /* renamed from: b */
    public final boolean mo61152b() {
        return this.f112477a >= 50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothDeviceParams [");
        sb.append("name=");
        sb.append(this.f112479c.mo61923a());
        sb.append(", alias=");
        sb.append(this.f112479c.mo61924b());
        sb.append(", deviceClass=");
        sb.append(this.f112479c.mo61927e());
        sb.append(", address=");
        sb.append(this.f112479c.mo61925c());
        sb.append(", isVehicle=");
        String str = "n";
        sb.append(!mo61151a() ? str : "y");
        sb.append("(static=");
        sb.append(this.f112477a);
        sb.append("), connected=");
        if (this.f112478b) {
            str = "y";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
