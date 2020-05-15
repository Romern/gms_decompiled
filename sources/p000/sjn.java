package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: sjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjn implements sjs {

    /* renamed from: a */
    public static final List f44579a;

    /* renamed from: b */
    public static final List f44580b;

    /* renamed from: c */
    public static final bqgj f44581c;

    /* renamed from: d */
    public Context f44582d;

    /* renamed from: e */
    public sjt f44583e;

    /* renamed from: f */
    public final List f44584f;

    /* renamed from: g */
    public List f44585g;

    /* renamed from: h */
    private ExecutorService f44586h;

    /* renamed from: i */
    private boolean f44587i;

    /* renamed from: j */
    private aaca f44588j;

    @Deprecated
    private sjn() {
        this.f44584f = bngx.m109376e();
        this.f44585g = bngx.m109376e();
        this.f44587i = false;
    }

    /* renamed from: a */
    public static sjn m35483a(Context context, sjt sjt, ExecutorService executorService) {
        return new sjn(context, sjt, executorService);
    }

    static {
        bngx e = bngx.m109376e();
        bngx e2 = bngx.m109376e();
        bqgj a = sne.m35694a(4, 10);
        f44579a = e;
        f44580b = e2;
        f44581c = a;
    }

    /* renamed from: a */
    public final void mo25648a() {
        List list = this.f44584f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((sjw) list.get(i)).mo25656a();
        }
        List list2 = this.f44585g;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((sjv) list2.get(i2)).mo25654a();
        }
        if (!this.f44587i || !cdmx.m134116b()) {
            List list3 = f44579a;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((sjw) list3.get(i3)).mo25656a();
            }
            List list4 = f44580b;
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((sjv) list4.get(i4)).mo25654a();
            }
        }
    }

    public sjn(Context context, sjt sjt, ExecutorService executorService) {
        this.f44584f = bngx.m109376e();
        this.f44585g = bngx.m109376e();
        boolean z = false;
        this.f44587i = false;
        this.f44582d = context;
        this.f44583e = sjt;
        this.f44586h = executorService;
        sjt.f44594e.mo66946a(this, true);
        this.f44587i = ((sjh) context).f44569g[0] == 40 ? true : z;
        this.f44588j = new aaca(context, context.getClass(), 2);
    }

    /* renamed from: a */
    public final void mo25649a(sji sji) {
        ExecutorService executorService = this.f44586h;
        bmzi bmzi = sjk.f44574a;
        aaca aaca = this.f44588j;
        int i = sji.f44572c;
        String str = sji.f44571b;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(i);
        sb.append("-");
        sb.append(str);
        blji a = aaca.mo16711a(sb.toString(), bmzi);
        try {
            executorService.execute(bljx.m107269a(new sjm(this, sji)));
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
