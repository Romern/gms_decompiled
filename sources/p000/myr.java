package p000;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.util.List;

/* renamed from: myr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myr {

    /* renamed from: a */
    public static final lvn f34962a = new lvn("CacheRestoreHelper");

    /* renamed from: b */
    public final Context f34963b;

    /* renamed from: c */
    public final mbx f34964c;

    /* renamed from: d */
    public List f34965d;

    /* renamed from: e */
    public int f34966e;

    /* renamed from: f */
    public final mcb f34967f;

    /* renamed from: g */
    public BufferedInputStream f34968g;

    public myr(Context context, mbx mbx) {
        this.f34963b = context;
        this.f34964c = mbx;
        this.f34967f = new mcb(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20328a() {
        File b = this.f34967f.mo19847b("@pm@");
        if (b.exists() && System.currentTimeMillis() - b.lastModified() > 604800000) {
            f34962a.mo25414c("Old D2D data deleted.", new Object[0]);
            srj.m36120a(this.f34967f.f33397b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20329b() {
        File b = this.f34967f.mo19847b((String) this.f34965d.get(this.f34966e));
        srz.m36171a((Closeable) this.f34968g);
        b.delete();
        this.f34968g = null;
    }
}
