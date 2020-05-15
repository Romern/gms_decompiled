package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: jcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jcf {

    /* renamed from: a */
    public static final imn f22150a = new jce();

    /* renamed from: b */
    public final jdd f22151b;

    /* renamed from: c */
    public final belh f22152c;

    public jcf(jdd jdd) {
        this.f22151b = jdd;
        befh a = befi.m94962a(rpr.m34216b());
        a.mo60660a("folsom");
        a.mo60663b("FolsomKeyStore.pb");
        Uri a2 = a.mo60657a();
        bejq g = bejr.m95186g();
        g.mo60762a(a2);
        g.mo60764a(jbb.f22074b);
        this.f22152c = adzg.f62956a.mo60765a(g.mo60761a());
    }

    /* renamed from: a */
    public final Map mo13569a(String str) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        return Collections.unmodifiableMap(jbd.f22080a);
    }

    /* renamed from: b */
    public final List mo13574b(String str) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        return jbd.f22081b;
    }

    /* renamed from: c */
    public final int mo13576c(String str) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        return jbd.f22082c;
    }

    /* renamed from: b */
    public final boolean mo13575b(String str, String str2) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        jbh jbh = jbh.f22094d;
        str2.getClass();
        bxww bxww2 = jbd.f22080a;
        if (bxww2.containsKey(str2)) {
            jbh = (jbh) bxww2.get(str2);
        }
        return jbh.f22098c;
    }

    /* renamed from: c */
    public final List mo13577c(String str, String str2) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        jbh jbh = jbh.f22094d;
        str2.getClass();
        bxww bxww2 = jbd.f22080a;
        if (bxww2.containsKey(str2)) {
            jbh = (jbh) bxww2.get(str2);
        }
        return jbh.f22097b;
    }

    /* renamed from: a */
    public final void mo13570a(String str, String str2, List list) {
        bqfy.m112768a(this.f22152c.mo60777a(new jby(this.f22151b.mo13599a(str), str2, list), bqfb.INSTANCE), IOException.class);
    }

    /* renamed from: a */
    public final void mo13571a(String str, String str2, jbf jbf, int i) {
        bqfy.m112768a(this.f22152c.mo60777a(new jca(this.f22151b.mo13599a(str), jbf, str2, i), bqfb.INSTANCE), IOException.class);
    }

    /* renamed from: a */
    public final void mo13572a(String str, String str2, boolean z) {
        bqfy.m112768a(this.f22152c.mo60777a(new jbx(this.f22151b.mo13599a(str), str2, z), bqfb.INSTANCE), IOException.class);
    }

    /* renamed from: a */
    public final boolean mo13573a(String str, String str2) {
        String a = this.f22151b.mo13599a(str);
        jbd jbd = jbd.f22078d;
        a.getClass();
        bxww bxww = ((jbb) bqfy.m112768a(this.f22152c.mo60776a(), IOException.class)).f22076a;
        if (bxww.containsKey(a)) {
            jbd = (jbd) bxww.get(a);
        }
        jbh jbh = jbh.f22094d;
        str2.getClass();
        bxww bxww2 = jbd.f22080a;
        if (bxww2.containsKey(str2)) {
            jbh = (jbh) bxww2.get(str2);
        }
        return jbh.f22096a;
    }
}
