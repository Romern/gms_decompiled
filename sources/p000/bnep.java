package p000;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bnep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnep extends bnel {

    /* renamed from: h */
    transient long[] f131540h;

    /* renamed from: i */
    private transient int f131541i;

    /* renamed from: j */
    private transient int f131542j;

    /* renamed from: c */
    private final void m109168c(int i, int i2) {
        if (i != -2) {
            long[] jArr = this.f131540h;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) (i2 + 1)) & 4294967295L);
        } else {
            this.f131541i = i2;
        }
        if (i2 != -2) {
            long[] jArr2 = this.f131540h;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) (i + 1)) << 32);
            return;
        }
        this.f131542j = i;
    }

    /* renamed from: f */
    private final int m109169f(int i) {
        return ((int) (this.f131540h[i] >>> 32)) - 1;
    }

    /* renamed from: a */
    public final void mo67422a(int i, int i2) {
        int size = size() - 1;
        super.mo67422a(i, i2);
        m109168c(m109169f(i), mo67435e(i));
        if (i < size) {
            m109168c(m109169f(size), i);
            m109168c(i, mo67435e(size));
        }
        this.f131540h[size] = 0;
    }

    /* renamed from: b */
    public final int mo67424b(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], int, int, long):void}
     arg types: [long[], int, int, int]
     candidates:
      ClspMth{java.util.Arrays.fill(java.lang.Object[], int, int, java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int, int, int):void}
      ClspMth{java.util.Arrays.fill(char[], int, int, char):void}
      ClspMth{java.util.Arrays.fill(boolean[], int, int, boolean):void}
      ClspMth{java.util.Arrays.fill(byte[], int, int, byte):void}
      ClspMth{java.util.Arrays.fill(double[], int, int, double):void}
      ClspMth{java.util.Arrays.fill(float[], int, int, float):void}
      ClspMth{java.util.Arrays.fill(short[], int, int, short):void}
      ClspMth{java.util.Arrays.fill(long[], int, int, long):void} */
    public final void clear() {
        if (!mo67427b()) {
            this.f131541i = -2;
            this.f131542j = -2;
            long[] jArr = this.f131540h;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0L);
            }
            super.clear();
        }
    }

    /* renamed from: d */
    public final void mo67434d(int i) {
        super.mo67434d(i);
        this.f131540h = Arrays.copyOf(this.f131540h, i);
    }

    /* renamed from: e */
    public final int mo67435e(int i) {
        return ((int) this.f131540h[i]) - 1;
    }

    /* renamed from: h */
    public final int mo67441h() {
        return this.f131541i;
    }

    public bnep() {
        super(3);
    }

    /* renamed from: b */
    public final void mo67426b(int i) {
        super.mo67426b(i);
        this.f131541i = -2;
        this.f131542j = -2;
    }

    /* renamed from: e */
    public final Map mo67436e() {
        Map e = super.mo67436e();
        this.f131540h = null;
        return e;
    }

    public bnep(int i) {
        super(i);
    }

    /* renamed from: c */
    public final int mo67428c() {
        int c = super.mo67428c();
        this.f131540h = new long[c];
        return c;
    }

    /* renamed from: a */
    public final void mo67423a(int i, Object obj, Object obj2, int i2, int i3) {
        super.mo67423a(i, obj, obj2, i2, i3);
        m109168c(this.f131542j, i);
        m109168c(i, -2);
    }

    /* renamed from: c */
    public final Map mo67429c(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }
}
