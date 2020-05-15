package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: bumg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumg {

    /* renamed from: a */
    public Object[] f154233a;

    /* renamed from: b */
    public int f154234b = 0;

    /* renamed from: c */
    private final Class f154235c;

    public bumg(Class cls) {
        this.f154235c = cls;
        this.f154233a = (Object[]) Array.newInstance(cls, 0);
    }

    /* renamed from: a */
    public final void mo72847a() {
        this.f154234b = 0;
    }

    /* renamed from: b */
    public final int mo72851b() {
        mo72848a(this.f154234b + 1);
        return this.f154234b - 1;
    }

    /* renamed from: a */
    public final void mo72848a(int i) {
        mo72852b(i);
        this.f154234b = i;
    }

    /* renamed from: b */
    public final void mo72852b(int i) {
        if (this.f154233a.length < i) {
            Object[] objArr = (Object[]) Array.newInstance(this.f154235c, i);
            Object[] objArr2 = this.f154233a;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            try {
                for (int length = this.f154233a.length; length < i; length++) {
                    objArr[length] = this.f154235c.newInstance();
                }
                this.f154233a = objArr;
            } catch (InstantiationException e) {
                String name = this.f154235c.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 82);
                sb.append("Instantiation exception thrown in grow for class ");
                sb.append(name);
                sb.append(". Keeping original growing array.");
                sb.toString();
            } catch (IllegalAccessException e2) {
                String name2 = this.f154235c.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 83);
                sb2.append("Illegal access exception thrown in grow for class ");
                sb2.append(name2);
                sb2.append(". Keeping original growing array.");
                sb2.toString();
            }
        }
    }

    /* renamed from: a */
    public final void mo72849a(int i, String str) {
        if (i < 0 || i >= this.f154234b) {
            StringBuilder sb = new StringBuilder(str.length() + 24);
            sb.append("Index out of bounds on ");
            sb.append(str);
            sb.append(".");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo72850a(Comparator comparator) {
        Arrays.sort(this.f154233a, 0, this.f154234b, comparator);
    }
}
