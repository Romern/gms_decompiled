package p000;

import android.util.SparseArray;

/* renamed from: airm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class airm {

    /* renamed from: b */
    private static final int[] f69564b = new int[0];

    /* renamed from: a */
    public final SparseArray f69565a = new SparseArray();

    public airm() {
        int[] iArr = f69564b;
        m57797a(2, iArr, iArr, iArr, new int[]{1, 23, 24, 36, 37, 38});
        int[] iArr2 = f69564b;
        m57797a(1, iArr2, iArr2, iArr2, iArr2);
        m57797a(21, new int[]{1, 2}, new int[]{1}, new int[]{2}, f69564b);
        m57797a(22, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, f69564b);
        int[] iArr3 = f69564b;
        m57797a(23, iArr3, iArr3, new int[]{2, 36, 37}, new int[]{1});
        int[] iArr4 = f69564b;
        m57797a(24, iArr4, iArr4, iArr4, new int[]{1});
        m57797a(31, new int[]{1, 2}, new int[]{1}, new int[]{2}, f69564b);
        m57797a(35, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, f69564b);
        m57797a(32, new int[]{1, 2}, new int[]{1}, new int[]{2}, f69564b);
        m57797a(33, new int[]{1, 2}, new int[]{1}, new int[]{2}, f69564b);
        m57797a(34, new int[]{1, 2}, new int[]{1}, new int[]{2}, f69564b);
        int[] iArr5 = f69564b;
        m57797a(36, iArr5, iArr5, new int[]{2, 23, 37}, new int[]{1});
        int[] iArr6 = f69564b;
        m57797a(37, iArr6, iArr6, new int[]{2, 23, 36}, new int[]{1});
        int[] iArr7 = f69564b;
        m57797a(38, iArr7, iArr7, iArr7, new int[]{1});
        int[] iArr8 = f69564b;
        m57797a(12, iArr8, iArr8, iArr8, new int[]{11, 43, 44, 53, 54, 63, 61, 62, 64, 65, 71, 72, 73});
        int[] iArr9 = f69564b;
        m57797a(11, iArr9, iArr9, iArr9, iArr9);
        m57797a(41, new int[]{11, 12, 63, 62, 64}, new int[]{11}, new int[]{12}, f69564b);
        m57797a(42, new int[]{11, 12, 63, 62, 64}, new int[]{11}, new int[]{12}, f69564b);
        int[] iArr10 = f69564b;
        m57797a(43, iArr10, iArr10, new int[]{12}, new int[]{11, 63, 62, 64, 65});
        int[] iArr11 = f69564b;
        m57797a(44, iArr11, iArr11, iArr11, new int[]{11});
        m57797a(51, new int[]{11, 12, 63, 61, 62, 71, 72, 73}, new int[]{11}, new int[]{12}, f69564b);
        m57797a(52, new int[]{11, 12, 63, 61, 62, 71, 72, 73}, new int[]{11}, new int[]{12}, f69564b);
        int[] iArr12 = f69564b;
        m57797a(53, iArr12, iArr12, new int[]{12}, new int[]{11, 63, 61, 62, 71, 72, 73});
        int[] iArr13 = f69564b;
        m57797a(54, iArr13, iArr13, iArr13, new int[]{11});
        int[] iArr14 = f69564b;
        m57797a(63, iArr14, iArr14, new int[]{12}, new int[]{43, 44, 53, 54, 61, 62, 64, 65, 71, 72, 73});
        int[] iArr15 = f69564b;
        m57797a(61, iArr15, iArr15, new int[]{12}, new int[]{11, 53, 54, 63, 62});
        int[] iArr16 = f69564b;
        m57797a(62, iArr16, iArr16, new int[]{12}, new int[]{43, 44, 53, 54, 63, 61, 64, 65});
        int[] iArr17 = f69564b;
        m57797a(64, iArr17, iArr17, new int[]{12}, new int[]{11, 43, 44, 63, 62});
        int[] iArr18 = f69564b;
        m57797a(65, iArr18, iArr18, iArr18, iArr18);
        int[] iArr19 = f69564b;
        m57797a(71, iArr19, iArr19, new int[]{12}, new int[]{11, 53, 54});
        int[] iArr20 = f69564b;
        m57797a(72, iArr20, iArr20, new int[]{12}, new int[]{11, 53, 54, 63, 61, 62});
        int[] iArr21 = f69564b;
        m57797a(73, iArr21, iArr21, new int[]{12}, new int[]{11, 53, 54, 63, 61, 62});
    }

    /* renamed from: a */
    private final void m57797a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.f69565a.put(i, new airl(iArr, iArr2, iArr3, iArr4));
    }

    /* renamed from: a */
    public static final boolean m57798a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo37898a(airo airo, airo airo2) {
        return m57798a(((airl) this.f69565a.get(airo.f69571g)).f69560a, airo2.f69571g);
    }
}
