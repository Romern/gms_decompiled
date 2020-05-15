package p000;

import java.nio.ByteBuffer;

/* renamed from: btzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzs extends buan {

    /* renamed from: a */
    public Object[] f153129a;

    /* renamed from: b */
    private btzp f153130b;

    /* renamed from: e */
    private btzo f153131e;

    public btzs() {
        this.f153156c = new btzr(this);
    }

    /* renamed from: a */
    public final btzp values() {
        if (this.f153130b == null) {
            this.f153130b = new btzp(this);
        }
        return this.f153130b;
    }

    /* renamed from: b */
    public final btzo entrySet() {
        if (this.f153131e == null) {
            this.f153131e = new btzo(this);
        }
        return this.f153131e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        return buba.m119277a(null, this.f153129a);
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return mo72509a(((Long) obj).longValue(), obj2);
    }

    public final Object remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = ((btzl) this.f153157d).mo72496c(((Long) obj).longValue())) == -1) {
            return null;
        }
        Object[] objArr = this.f153129a;
        Object obj2 = objArr[c];
        objArr[c] = null;
        return obj2;
    }

    /* renamed from: a */
    public final Object mo72509a(long j, Object obj) {
        Object obj2;
        if (obj != null) {
            int b = ((btzl) this.f153157d).mo72492b(j);
            if (b >= 0) {
                obj2 = this.f153129a[b];
            } else {
                b ^= -1;
                obj2 = null;
            }
            this.f153129a[b] = obj;
            return obj2;
        }
        throw new NullPointerException("The value must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        buba.m119278a(byteBuffer, null, this.f153129a);
    }

    /* renamed from: a */
    public final Object mo72510a(long j, boolean z) {
        int b = ((btzl) this.f153157d).mo72493b(j, z);
        if (b >= 0) {
            return this.f153129a[b];
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo72511a(Object obj, boolean z) {
        if (obj instanceof Long) {
            return mo72510a(((Long) obj).longValue(), z);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        Object[] objArr = this.f153129a;
        buba.m119279b(byteBuffer, null, objArr);
        this.f153129a = objArr;
    }
}
