package p000;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: bujy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujy extends buan {

    /* renamed from: a */
    public long[] f154055a;

    /* renamed from: b */
    public long[] f154056b;

    /* renamed from: e */
    private bujw f154057e;

    public bujy() {
        this.f153156c = new bujx(this);
    }

    /* renamed from: a */
    public final bujw entrySet() {
        if (this.f154057e == null) {
            this.f154057e = new bujw(this);
        }
        return this.f154057e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154055a);
        asLongBuffer.put(this.f154056b);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 1;
    }

    @Deprecated
    public final boolean containsKey(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    @Deprecated
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        return (this.f154055a.length * 8) + (this.f154056b.length * 8);
    }

    /* renamed from: f */
    public final buam values() {
        throw new UnsupportedOperationException("Inherited values is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Long l = (Long) obj2;
        throw new UnsupportedOperationException("Inherited put is not supported.");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited remove is not supported.");
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo72562b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154055a);
        asLongBuffer.get(this.f154056b);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* renamed from: a */
    public final void mo72750a(short s, short s2, long j, long j2) {
        int a = ((bulm) this.f153157d).mo72816a(s, s2);
        if (a < 0) {
            a ^= -1;
        }
        this.f154055a[a] = j;
        this.f154056b[a] = j2;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo72561a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }
}
