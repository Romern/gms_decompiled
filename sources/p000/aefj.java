package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aefj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aefj implements cayy {

    /* renamed from: a */
    private final cijl f63323a;

    /* renamed from: b */
    private final cijl f63324b;

    /* renamed from: c */
    private final cijl f63325c;

    /* renamed from: d */
    private final cijl f63326d;

    public aefj(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f63323a = cijl;
        this.f63324b = cijl2;
        this.f63325c = cijl3;
        this.f63326d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) ((cayz) this.f63323a).f176439a;
        Executor executor = (Executor) ((cayz) this.f63324b).f176439a;
        ayte b = aytf.m84780b();
        cijl cijl = this.f63326d;
        brud p = brue.m114687p();
        p.mo69974a(context);
        p.f143399a = b;
        p.mo69976a(new aefg(context, cijl));
        p.mo69979c(executor);
        p.mo69977a(executor);
        p.mo69978b(executor);
        p.f143400b = (brux) this.f63325c.mo6445a();
        p.mo69975a(aefh.f63318a);
        cazf.m127593a(p, "Cannot return null from a non-@Nullable @Provides method");
        return p;
    }
}
