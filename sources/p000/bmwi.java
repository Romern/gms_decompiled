package p000;

import java.util.Arrays;

/* renamed from: bmwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwi extends bmws {

    /* renamed from: a */
    static final bmwi f131138a = new bmwi();

    private bmwi() {
        super("CharMatcher.any()");
    }

    /* renamed from: a */
    public final int mo66830a(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return true;
    }

    /* renamed from: b */
    public final bmwx mo66834b(bmwx bmwx) {
        bmxy.m108581a(bmwx);
        return this;
    }

    /* renamed from: c */
    public final boolean mo66836c(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    /* renamed from: d */
    public final String mo66837d(CharSequence charSequence) {
        bmxy.m108581a(charSequence);
        return "";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [char[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* renamed from: e */
    public final String mo66838e(CharSequence charSequence) {
        char[] cArr = new char[charSequence.length()];
        Arrays.fill(cArr, '.');
        return new String(cArr);
    }

    /* renamed from: a */
    public final int mo66831a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        bmxy.m108599b(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    /* renamed from: b */
    public final boolean mo66835b(CharSequence charSequence) {
        bmxy.m108581a(charSequence);
        return true;
    }

    /* renamed from: a */
    public final bmwx mo66832a() {
        return bmwu.f131151a;
    }

    /* renamed from: a */
    public final bmwx mo66833a(bmwx bmwx) {
        bmxy.m108581a(bmwx);
        return bmwx;
    }
}
