package p000;

/* renamed from: beqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqb implements bepx {

    /* renamed from: a */
    private final bepx f112027a;

    public beqb(bepx bepx) {
        this.f112027a = bepx;
    }

    /* renamed from: a */
    public static final int m95431a(String str) {
        if (str != null) {
            return beqa.f112026a[Math.abs(str.hashCode()) % beqa.f112026a.length];
        }
        return beqa.f112026a[0];
    }

    /* renamed from: a */
    public final CharSequence mo60925a(bddb bddb) {
        String str;
        bepx bepx = this.f112027a;
        if (bddb == null) {
            return null;
        }
        String[] strArr = bddb.f105353a;
        for (String str2 : strArr) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                beqf beqf = ((bepz) bepx).f112025a;
                bmxy.m108600b(beqf.f112037e);
                C1245ok okVar = (C1245ok) beqf.f112036d.get();
                if (okVar != null) {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && okVar != null; i++) {
                        beqe beqe = (beqe) okVar.get(Character.valueOf(str2.charAt(i)));
                        if (beqe == null) {
                            break;
                        }
                        String str3 = beqe.f112031a;
                        if (str3 != null) {
                            str = str3;
                        }
                        okVar = beqe.f112032b;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString();
                } else {
                    str2 = str;
                }
            }
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }
}
