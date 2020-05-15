package p000;

import java.util.logging.Logger;

/* renamed from: chrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrk {

    /* renamed from: a */
    static final Logger f189036a = Logger.getLogger(chrk.class.getName());

    /* renamed from: b */
    public static final chrk f189037b = new chrk();

    private chrk() {
    }

    /* renamed from: a */
    public static chrk m149453a() {
        chrk a = chri.f189035a.mo85563a();
        return a == null ? f189037b : a;
    }

    /* renamed from: b */
    public final chrk mo85567b() {
        chrk a = chri.f189035a.mo85564a(this);
        return a == null ? f189037b : a;
    }

    /* renamed from: a */
    public static void m149454a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* renamed from: a */
    public final void mo85566a(chrk chrk) {
        m149454a(chrk, "toAttach");
        chri.f189035a.mo85565a(this, chrk);
    }
}
