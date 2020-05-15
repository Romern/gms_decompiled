package p000;

import java.nio.ByteBuffer;

/* renamed from: btzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzw extends buaq {

    /* renamed from: a */
    public buaz f153135a;

    /* renamed from: b */
    public Object[] f153136b;

    public btzw(buat buat) {
        this.f153165d = new btzv(this, buat);
    }

    /* renamed from: a */
    public final int mo72523a(Object obj, boolean z) {
        if (obj != null && !isEmpty()) {
            int a = this.f153164c.mo72587a(obj.hashCode());
            while (a != -1) {
                if (!obj.equals(this.f153136b[a])) {
                    a = this.f153164c.mo72592b(a);
                } else {
                    if (z) {
                        this.f153164c.mo72599e(a);
                    }
                    return a;
                }
            }
        }
        return -1;
    }

    public final boolean add(Object obj) {
        return mo72525b(obj) < 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte mo72491b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo72495c() {
        return buba.m119277a(this.f153135a, this.f153136b);
    }

    public final boolean remove(Object obj) {
        try {
            int c = mo72526c(obj);
            if (c == -1) {
                return false;
            }
            this.f153165d.mo72586d(c);
            return true;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: btzw.a(java.lang.Object, boolean):int
     arg types: [java.lang.Object, int]
     candidates:
      buaq.a(buaq, java.nio.ByteBuffer):void
      btzw.a(java.lang.Object, boolean):int */
    /* renamed from: b */
    public final int mo72525b(Object obj) {
        if (obj != null) {
            int a = mo72523a(obj, true);
            if (a != -1) {
                return a;
            }
            int g = this.f153164c.mo72606g();
            this.f153164c.mo72589a(g, obj.hashCode());
            this.f153136b[g] = obj;
            return g ^ -1;
        }
        throw new NullPointerException("The specified element cannot be null");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: btzw.a(java.lang.Object, boolean):int
     arg types: [java.lang.Object, int]
     candidates:
      buaq.a(buaq, java.nio.ByteBuffer):void
      btzw.a(java.lang.Object, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buav.a(int, boolean):int
     arg types: [int, int]
     candidates:
      buav.a(int, int):void
      buav.a(int, boolean):int */
    /* renamed from: c */
    public final int mo72526c(Object obj) {
        int a = mo72523a(obj, false);
        if (a == -1) {
            return -1;
        }
        int a2 = this.f153164c.mo72603a(a, true);
        this.f153136b[a2] = null;
        return a2;
    }

    /* renamed from: c */
    public final void mo72527c(ByteBuffer byteBuffer) {
        if (this.f153135a != null) {
            super.mo72527c(byteBuffer);
            return;
        }
        throw new IllegalStateException("The element protocol was not previously specified.");
    }

    /* renamed from: a */
    public final btzu iterator() {
        return new btzu(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72494b(ByteBuffer byteBuffer) {
        buba.m119278a(byteBuffer, this.f153135a, this.f153136b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72486a(ByteBuffer byteBuffer) {
        buaz buaz = this.f153135a;
        Object[] objArr = this.f153136b;
        buba.m119279b(byteBuffer, buaz, objArr);
        this.f153136b = objArr;
    }

    /* renamed from: a */
    public final boolean mo72489a(Object obj) {
        try {
            return mo72523a(obj, false) != -1;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }
}
