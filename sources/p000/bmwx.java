package p000;

/* renamed from: bmwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bmwx implements bmxz {
    protected bmwx() {
    }

    /* renamed from: a */
    public static bmwx m108500a(char c, char c2) {
        return new bmwn(c, c2);
    }

    /* renamed from: b */
    public static bmwx m108501b(char c) {
        return new bmwo(c);
    }

    /* renamed from: c */
    public static bmwx m108502c(char c) {
        return new bmwq(c);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    public static String m108503d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: f */
    public static bmwx m108504f(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return bmwu.f131151a;
        }
        if (length == 1) {
            return m108501b(charSequence.charAt(0));
        }
        if (length != 2) {
            return new bmwj(charSequence);
        }
        return new bmwp(charSequence.charAt(0), charSequence.charAt(1));
    }

    /* renamed from: g */
    public static bmwx m108505g(CharSequence charSequence) {
        return m108504f(charSequence).mo66832a();
    }

    /* renamed from: a */
    public abstract boolean mo66828a(char c);

    /* renamed from: e */
    public String mo66838e(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int a = mo66830a((CharSequence) charSequence2);
        if (a == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[a] = '.';
        while (true) {
            a++;
            if (a >= charArray.length) {
                return new String(charArray);
            }
            if (mo66828a(charArray[a])) {
                charArray[a] = '.';
            }
        }
    }

    /* renamed from: h */
    public final String mo66848h(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo66828a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && mo66828a(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    /* renamed from: a */
    public int mo66830a(CharSequence charSequence) {
        return mo66831a(charSequence, 0);
    }

    /* renamed from: b */
    public bmwx mo66834b(bmwx bmwx) {
        return new bmwv(this, bmwx);
    }

    /* renamed from: c */
    public boolean mo66836c(CharSequence charSequence) {
        return mo66830a(charSequence) == -1;
    }

    /* renamed from: a */
    public int mo66831a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        bmxy.m108599b(i, length);
        while (i < length) {
            if (mo66828a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public boolean mo66835b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo66828a(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public String mo66837d(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int a = mo66830a((CharSequence) charSequence2);
        if (a == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            a++;
            while (a != charArray.length) {
                if (!mo66828a(charArray[a])) {
                    charArray[a - i] = charArray[a];
                    a++;
                } else {
                    i++;
                }
            }
            return new String(charArray, 0, a - i);
        }
    }

    /* renamed from: a */
    public bmwx mo66832a() {
        return new bmwt(this);
    }

    /* renamed from: a */
    public bmwx mo66833a(bmwx bmwx) {
        return new bmwh(this, bmwx);
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6527a(Object obj) {
        return mo66828a(((Character) obj).charValue());
    }
}
