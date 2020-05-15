package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgx {

    /* renamed from: a */
    private final cgw f6830a = new cgw(null);

    /* renamed from: b */
    private final Map f6831b = new HashMap();

    /* renamed from: a */
    private static void m4236a(cgw cgw) {
        cgw.f6828c.f6829d = cgw;
        cgw.f6829d.f6828c = cgw;
    }

    /* renamed from: b */
    private static void m4237b(cgw cgw) {
        cgw cgw2 = cgw.f6829d;
        cgw2.f6828c = cgw.f6828c;
        cgw.f6828c.f6829d = cgw2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        cgw cgw = this.f6830a.f6828c;
        boolean z = false;
        while (!cgw.equals(this.f6830a)) {
            sb.append('{');
            sb.append(cgw.f6826a);
            sb.append(':');
            sb.append(cgw.mo3884b());
            sb.append("}, ");
            cgw = cgw.f6828c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [che, java.lang.Object], assign insn: 0x001c: IGET  (r1v4 ? I:java.lang.Object) = (r0v2 cgw) cgw.a java.lang.Object */
    /* renamed from: a */
    public final Object mo3885a() {
        for (cgw cgw = this.f6830a.f6829d; !cgw.equals(this.f6830a); cgw = cgw.f6829d) {
            Object a = cgw.mo3883a();
            if (a != null) {
                return a;
            }
            m4237b(cgw);
            this.f6831b.remove(cgw.f6826a);
            cgw.f6826a.mo3889a();
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo3886a(che che) {
        cgw cgw = (cgw) this.f6831b.get(che);
        if (cgw == null) {
            cgw = new cgw(che);
            this.f6831b.put(che, cgw);
        } else {
            che.mo3889a();
        }
        m4237b(cgw);
        cgw cgw2 = this.f6830a;
        cgw.f6829d = cgw2;
        cgw.f6828c = cgw2.f6828c;
        m4236a(cgw);
        return cgw.mo3883a();
    }

    /* renamed from: a */
    public final void mo3887a(che che, Object obj) {
        cgw cgw = (cgw) this.f6831b.get(che);
        if (cgw == null) {
            cgw = new cgw(che);
            m4237b(cgw);
            cgw cgw2 = this.f6830a;
            cgw.f6829d = cgw2.f6829d;
            cgw.f6828c = cgw2;
            m4236a(cgw);
            this.f6831b.put(che, cgw);
        } else {
            che.mo3889a();
        }
        if (cgw.f6827b == null) {
            cgw.f6827b = new ArrayList();
        }
        cgw.f6827b.add(obj);
    }
}
