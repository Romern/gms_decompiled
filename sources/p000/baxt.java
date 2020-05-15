package p000;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: baxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxt implements cayy {

    /* renamed from: a */
    private final cijl f102065a;

    /* renamed from: b */
    private final cijl f102066b;

    /* renamed from: c */
    private final cijl f102067c;

    /* renamed from: d */
    private final cijl f102068d;

    /* renamed from: e */
    private final cijl f102069e;

    /* renamed from: f */
    private final cijl f102070f;

    public baxt(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6) {
        this.f102065a = cijl;
        this.f102066b = cijl2;
        this.f102067c = cijl3;
        this.f102068d = cijl4;
        this.f102069e = cijl5;
        this.f102070f = cijl6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) this.f102065a.mo6445a();
        baxs baxs = new baxs((bmxv) this.f102069e.mo6445a(), (ScheduledExecutorService) this.f102066b.mo6445a(), context, (bmxv) this.f102070f.mo6445a(), (befa) this.f102067c.mo6445a(), (bmxv) ((cayz) this.f102068d).f176439a);
        cazf.m127593a(baxs, "Cannot return null from a non-@Nullable @Provides method");
        return baxs;
    }
}
