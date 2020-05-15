package p000;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: bxrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrb {

    /* renamed from: a */
    public final String f164540a = "";

    /* renamed from: b */
    public final Map f164541b;

    /* renamed from: c */
    public final Map f164542c;

    public bxrb() {
        EnumMap enumMap = new EnumMap(bxqy.class);
        this.f164541b = enumMap;
        this.f164542c = new EnumMap(bxqy.class);
    }

    /* renamed from: a */
    public final void mo73611a(bxqy bxqy) {
        Map map = this.f164541b;
        Map map2 = this.f164542c;
        if (map2.containsKey(bxqy)) {
            Object obj = ((bxrc) map2.get(bxqy)).f164543a;
        } else {
            map.containsKey(bxqy);
        }
        Map map3 = this.f164541b;
        Map map4 = this.f164542c;
        if (map4.containsKey(bxqy)) {
            if (((bxrc) map4.get(bxqy)).f164543a != null) {
                boolean z = ((bxrc) map4.get(bxqy)).f164544b;
            }
        } else if (map3.containsKey(bxqy)) {
            boolean z2 = ((bxqz) map3.get(bxqy)).f164537c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (((java.lang.Long) r8).longValue() < 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (((java.lang.Integer) r8).intValue() >= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (((java.lang.String) r8).isEmpty() == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r0.isInfinite() == false) goto L_0x0071;
     */
    /* renamed from: a */
    public final void mo73612a(bxqy bxqy, Object obj) {
        int i = bxqy.f164534aQ;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                case 6:
                    this.f164542c.put(bxqy, new bxrc(obj));
                    return;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Float f = (Float) obj;
                    if (!f.isNaN()) {
                        break;
                    }
                    this.f164542c.put(bxqy, new bxrc(null));
                    return;
                default:
                    String a = bxqx.m123025a(i);
                    StringBuilder sb = new StringBuilder(a.length() + 24);
                    sb.append("Unexpected option type: ");
                    sb.append(a);
                    throw new RuntimeException(sb.toString());
            }
        } else {
            throw null;
        }
    }
}
