package p000;

import java.lang.reflect.Array;

/* renamed from: ggg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggg {

    /* renamed from: a */
    public volatile transient Object[] f18130a;

    /* renamed from: b */
    private final Class f18131b;

    public ggg(Class cls) {
        this.f18131b = cls;
        this.f18130a = (Object[]) Array.newInstance(cls, 0);
    }

    /* renamed from: c */
    private final int m13097c(Object obj) {
        Object[] objArr = this.f18130a;
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final synchronized void mo11788a(int i) {
        Object obj = this.f18130a[i];
        int i2 = i + 1;
        Object[] objArr = (Object[]) Array.newInstance(this.f18131b, this.f18130a.length - (i2 - i));
        System.arraycopy(this.f18130a, 0, objArr, 0, i);
        System.arraycopy(this.f18130a, i2, objArr, i, this.f18130a.length - i2);
        this.f18130a = objArr;
    }

    /* renamed from: b */
    public final synchronized boolean mo11791b(Object obj) {
        boolean z;
        int c = m13097c(obj);
        if (c != -1) {
            mo11788a(c);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo11789a() {
        return this.f18130a.length == 0;
    }

    /* renamed from: a */
    public final synchronized boolean mo11790a(Object obj) {
        if (obj == null) {
            throw null;
        } else if (m13097c(obj) != -1) {
            return false;
        } else {
            Object[] objArr = (Object[]) Array.newInstance(this.f18131b, this.f18130a.length + 1);
            System.arraycopy(this.f18130a, 0, objArr, 0, this.f18130a.length);
            objArr[this.f18130a.length] = obj;
            this.f18130a = objArr;
            return true;
        }
    }
}
