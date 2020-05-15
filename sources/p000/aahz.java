package p000;

import android.content.Context;
import android.util.Base64;
import com.google.ads.afma.proto2api.C0151b;
import com.google.ads.afma.proto2api.C0152c;
import com.google.ads.afma.proto2api.C0158i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aahz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahz implements aage {

    /* renamed from: a */
    public final aaia f28153a;

    /* renamed from: b */
    private final Object f28154b;

    /* renamed from: c */
    private final aagb f28155c;

    /* renamed from: d */
    private final dbu f28156d;

    public aahz(Object obj, aaia aaia, dbu dbu, aagb aagb) {
        this.f28154b = obj;
        this.f28153a = aaia;
        this.f28156d = dbu;
        this.f28155c = aagb;
    }

    /* renamed from: a */
    private static long m21280a(long j) {
        return System.currentTimeMillis() - j;
    }

    /* renamed from: b */
    public final synchronized void mo16886b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28154b.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f28154b, new Object[0]);
            this.f28155c.mo16842a(3001, m21280a(currentTimeMillis));
        } catch (Exception e) {
            throw new aaig(2003, e);
        }
    }

    /* renamed from: c */
    public final synchronized int mo16887c() {
        try {
        } catch (Exception e) {
            throw new aaig(2006, e);
        }
        return ((Integer) this.f28154b.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f28154b, new Object[0])).intValue();
    }

    /* renamed from: a */
    private final synchronized byte[] m21281a(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f28155c.mo16843a(2007, m21280a(currentTimeMillis), e);
            return null;
        }
        return (byte[]) this.f28154b.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f28154b, null, map);
    }

    /* renamed from: a */
    public final synchronized String mo16849a(Context context) {
        String str;
        dbu dbu = this.f28156d;
        HashMap hashMap = new HashMap();
        C0152c a = aahd.m21250a(dbu.f12750b.f28109e, aahc.f28104a);
        hashMap.put("v", ((aagg) dbu.f12749a).f28060a);
        hashMap.put("gms", Boolean.valueOf(((aagg) dbu.f12749a).f28062c));
        hashMap.put("int", a.f7532o);
        hashMap.put("up", Boolean.valueOf(dbu.f12751c.f12748a));
        hashMap.put("t", new Throwable());
        C0152c a2 = aahd.m21250a(dbu.f12750b.f28108d, aahb.f28103a);
        hashMap.put("gai", Boolean.valueOf(((aagg) dbu.f12749a).f28061b));
        hashMap.put("did", a2.f7513L);
        int a3 = C0151b.m4816a(a2.f7514M);
        if (a3 == 0) {
            a3 = 3;
        }
        hashMap.put("dst", Integer.valueOf(a3 - 1));
        hashMap.put("doo", Boolean.valueOf(a2.f7515N));
        hashMap.put("f", "q");
        hashMap.put("ctx", context);
        str = null;
        hashMap.put("aid", null);
        byte[] a4 = m21281a(hashMap);
        if (a4 != null) {
            bxvd da = C0158i.f7564e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0158i iVar = (C0158i) da.f164949b;
            iVar.f7569d = 4;
            iVar.f7566a = 4 | iVar.f7566a;
            da.mo74029b(bxtx.m123261a(a4));
            str = Base64.encodeToString(((C0158i) da.mo74062i()).mo73642k(), 11);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo16885a() {
        try {
        } catch (Exception e) {
            throw new aaig(2001, e);
        }
        return ((Boolean) this.f28154b.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f28154b, new Object[0])).booleanValue();
    }
}
