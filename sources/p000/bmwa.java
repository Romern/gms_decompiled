package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bmwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bmwa implements Iterator {

    /* renamed from: a */
    public int f131121a = 2;

    /* renamed from: b */
    final CharSequence f131122b;

    /* renamed from: c */
    final bmwx f131123c;

    /* renamed from: d */
    final boolean f131124d;

    /* renamed from: e */
    int f131125e = 0;

    /* renamed from: f */
    int f131126f;

    /* renamed from: g */
    private Object f131127g;

    /* renamed from: a */
    public abstract int mo66819a(int i);

    /* renamed from: b */
    public abstract int mo66820b(int i);

    public final boolean hasNext() {
        String str;
        int i;
        int i2;
        bmxy.m108600b(this.f131121a != 4);
        int i3 = this.f131121a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        } else if (i4 == 0) {
            return true;
        } else {
            if (i4 == 2) {
                return false;
            }
            this.f131121a = 4;
            int i5 = this.f131125e;
            while (true) {
                int i6 = this.f131125e;
                if (i6 == -1) {
                    this.f131121a = 3;
                    str = null;
                    break;
                }
                int a = mo66819a(i6);
                if (a == -1) {
                    a = this.f131122b.length();
                    this.f131125e = -1;
                    i = -1;
                } else {
                    i = mo66820b(a);
                    this.f131125e = i;
                }
                if (i == i5) {
                    int i7 = i + 1;
                    this.f131125e = i7;
                    if (i7 > this.f131122b.length()) {
                        this.f131125e = -1;
                    }
                } else {
                    while (i5 < a && this.f131123c.mo66828a(this.f131122b.charAt(i5))) {
                        i5++;
                    }
                    while (i2 > i5) {
                        int i8 = i2 - 1;
                        if (!this.f131123c.mo66828a(this.f131122b.charAt(i8))) {
                            break;
                        }
                        a = i8;
                    }
                    if (this.f131124d && i5 == i2) {
                        i5 = this.f131125e;
                    }
                }
            }
            int i9 = this.f131126f;
            if (i9 == 1) {
                i2 = this.f131122b.length();
                this.f131125e = -1;
                while (i2 > i5) {
                    int i10 = i2 - 1;
                    if (!this.f131123c.mo66828a(this.f131122b.charAt(i10))) {
                        break;
                    }
                    i2 = i10;
                }
            } else {
                this.f131126f = i9 - 1;
            }
            str = this.f131122b.subSequence(i5, i2).toString();
            this.f131127g = str;
            if (this.f131121a == 3) {
                return false;
            }
            this.f131121a = 1;
            return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f131121a = 2;
            Object obj = this.f131127g;
            this.f131127g = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected bmwa(bmyx bmyx, CharSequence charSequence) {
        this.f131123c = bmyx.f131216a;
        this.f131124d = bmyx.f131217b;
        this.f131126f = bmyx.f131218c;
        this.f131122b = charSequence;
    }
}
