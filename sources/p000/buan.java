package p000;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* renamed from: buan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buan implements Map {

    /* renamed from: a */
    private buak f153155a;

    /* renamed from: c */
    public buat f153156c;

    /* renamed from: d */
    public buaq f153157d;

    /* renamed from: a */
    public static void m119156a(buan buan, buaq buaq, ByteBuffer byteBuffer) {
        buan.f153157d = buaq;
        if (buar.m119185a(byteBuffer, buan.mo72515c())) {
            buan.mo72512a(byteBuffer);
            return;
        }
        throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
    }

    /* renamed from: a */
    public abstract Object mo72511a(Object obj, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72512a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72514b(ByteBuffer byteBuffer);

    /* renamed from: b */
    public boolean mo72562b(Object obj) {
        if (!isEmpty()) {
            buai b = entrySet().iterator();
            while (b.hasNext()) {
                if (b.mo72550d().equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract byte mo72515c();

    /* renamed from: c */
    public void mo72534c(ByteBuffer byteBuffer) {
        this.f153157d.mo72527c(byteBuffer);
        int d = mo72516d() + 12;
        if (byteBuffer.position() + d <= byteBuffer.limit()) {
            int i = d - 12;
            byteBuffer.putInt(i);
            byteBuffer.position(byteBuffer.position() + 8);
            mo72514b(byteBuffer);
            buar.m119184a(byteBuffer, mo72515c(), i);
            return;
        }
        throw new BufferOverflowException();
    }

    public final void clear() {
        this.f153157d.clear();
    }

    public boolean containsKey(Object obj) {
        return mo72561a(obj);
    }

    public boolean containsValue(Object obj) {
        return mo72562b(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo72516d();

    /* renamed from: e */
    public abstract buaj entrySet();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == size()) {
                try {
                    buai b = entrySet().iterator();
                    while (b.hasNext()) {
                        if (!b.mo72502a().equals(map.get(b.mo72549c()))) {
                            return false;
                        }
                    }
                    return true;
                } catch (ClassCastException e) {
                } catch (NullPointerException e2) {
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract buam values();

    /* renamed from: g */
    public final int mo72567g() {
        return this.f153157d.mo72583g();
    }

    public Object get(Object obj) {
        return mo72511a(obj, true);
    }

    /* renamed from: h */
    public final int mo72569h() {
        return mo72516d() + 12 + this.f153157d.mo72584h();
    }

    public final int hashCode() {
        buai b = entrySet().iterator();
        int i = 0;
        while (b.hasNext()) {
            i += b.mo72549c().hashCode() ^ b.mo72502a().hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        if (this.f153155a == null) {
            this.f153155a = new buak(this);
        }
        return this.f153155a;
    }

    public abstract Object put(Object obj, Object obj2);

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public abstract Object remove(Object obj);

    public final int size() {
        return this.f153157d.size();
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        buai b = entrySet().iterator();
        while (true) {
            Object c = b.mo72549c();
            Object a = b.mo72502a();
            if (c == this) {
                c = "(this Map)";
            }
            sb.append(c);
            sb.append('=');
            if (a == this) {
                a = "(this Map)";
            }
            sb.append(a);
            if (b.hasNext()) {
                sb.append(", ");
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public boolean mo72561a(Object obj) {
        return this.f153157d.mo72489a(obj);
    }
}
