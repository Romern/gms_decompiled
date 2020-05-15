package p000;

import java.nio.ByteBuffer;

/* renamed from: buad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buad extends buan {

    /* renamed from: a */
    public buaz f153143a;

    /* renamed from: b */
    public Object[] f153144b;

    /* renamed from: e */
    private buaa f153145e;

    /* renamed from: f */
    private btzz f153146f;

    public buad(buat buat) {
        this.f153156c = new buac(this, buat);
    }

    /* renamed from: a */
    public final int mo72531a(Object obj, Object obj2) {
        if (obj2 != null) {
            int b = ((btzw) this.f153157d).mo72525b(obj);
            if (b < 0) {
                this.f153144b[b ^ -1] = obj2;
            } else {
                this.f153144b[b] = obj2;
            }
            return b;
        }
        throw new NullPointerException("The value must not be null.");
    }

    /* renamed from: b */
    public final btzz entrySet() {
        if (this.f153146f == null) {
            this.f153146f = new btzz(this);
        }
        return this.f153146f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        return buba.m119277a(this.f153143a, this.f153144b);
    }

    public final Object put(Object obj, Object obj2) {
        Object obj3;
        if (obj2 != null) {
            int b = ((btzw) this.f153157d).mo72525b(obj);
            if (b >= 0) {
                obj3 = this.f153144b[b];
            } else {
                b ^= -1;
                obj3 = null;
            }
            this.f153144b[b] = obj2;
            return obj3;
        }
        throw new NullPointerException("The value must not be null.");
    }

    public final Object remove(Object obj) {
        try {
            int c = ((btzw) this.f153157d).mo72526c(obj);
            if (c == -1) {
                return null;
            }
            Object[] objArr = this.f153144b;
            Object obj2 = objArr[c];
            objArr[c] = null;
            return obj2;
        } catch (ClassCastException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo72534c(ByteBuffer byteBuffer) {
        if (this.f153143a != null) {
            super.mo72534c(byteBuffer);
            return;
        }
        throw new IllegalStateException("The value protocol was not previously specified.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        buba.m119278a(byteBuffer, this.f153143a, this.f153144b);
    }

    /* renamed from: a */
    public final buaa values() {
        if (this.f153145e == null) {
            this.f153145e = new buaa(this);
        }
        return this.f153145e;
    }

    /* renamed from: a */
    public final Object mo72511a(Object obj, boolean z) {
        int a = ((btzw) this.f153157d).mo72523a(obj, z);
        if (a >= 0) {
            return this.f153144b[a];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        buaz buaz = this.f153143a;
        Object[] objArr = this.f153144b;
        buba.m119279b(byteBuffer, buaz, objArr);
        this.f153144b = objArr;
    }
}
