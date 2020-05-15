package p000;

import android.content.Context;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: aaag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaag implements LifecycleSynchronizer.Callback {

    /* renamed from: a */
    public static final List f27830a;

    /* renamed from: b */
    public static final List f27831b;

    /* renamed from: c */
    public static final bqgj f27832c;

    /* renamed from: d */
    public Context f27833d;

    /* renamed from: e */
    public LifecycleSynchronizer f27834e;

    /* renamed from: f */
    public List f27835f;

    /* renamed from: g */
    public List f27836g;

    /* renamed from: h */
    private ExecutorService f27837h;

    /* renamed from: i */
    private boolean f27838i;

    /* renamed from: j */
    private aaca f27839j;

    @Deprecated
    private aaag() {
        this.f27835f = bngx.m109376e();
        this.f27836g = bngx.m109376e();
        this.f27838i = false;
    }

    @Deprecated
    /* renamed from: a */
    public static aaag m21013a() {
        return new aaag();
    }

    public final void onServiceDestroy() {
        List list = this.f27835f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((adbp) list.get(i)).mo16662a();
        }
        for (aaak aaak : this.f27836g) {
            aaak.mo16662a();
        }
        if (!this.f27838i || !cdmx.m134116b()) {
            List list2 = f27830a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((adbp) list2.get(i2)).mo16662a();
            }
            List list3 = f27831b;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((aaak) list3.get(i3)).mo16662a();
            }
        }
    }

    static {
        bngx e = bngx.m109376e();
        bngx e2 = bngx.m109376e();
        bqgj a = sne.m35694a(4, 10);
        f27830a = e;
        f27831b = e2;
        f27832c = a;
    }

    /* renamed from: a */
    public static aaag m21014a(Context context, LifecycleSynchronizer lifecycleSynchronizer, ExecutorService executorService) {
        return new aaag(context, lifecycleSynchronizer, executorService);
    }

    public aaag(Context context, LifecycleSynchronizer lifecycleSynchronizer, ExecutorService executorService) {
        this.f27835f = bngx.m109376e();
        this.f27836g = bngx.m109376e();
        boolean z = false;
        this.f27838i = false;
        this.f27833d = context;
        this.f27834e = lifecycleSynchronizer;
        this.f27837h = executorService;
        lifecycleSynchronizer.registerCallback(this);
        int i = 1;
        if (context instanceof zzx) {
            this.f27838i = ((zzx) context).f56358i[0] == 40 ? true : z;
            i = 2;
        }
        this.f27839j = new aaca(context, context.getClass(), i);
    }

    /* renamed from: a */
    public final void mo16658a(aaab aaab) {
        ExecutorService j = aaab.mo16649j();
        if (j == null) {
            j = this.f27837h;
        }
        bmzi bmzi = aaad.f27824a;
        aaca aaca = this.f27839j;
        int i = aaab.f27821n;
        String str = aaab.f27820m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append("-");
        sb.append(str);
        blji a = aaca.mo16711a(sb.toString(), bmzi);
        try {
            j.execute(bljx.m107269a(new aaaf(this, aaab)));
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

    @Deprecated
    /* renamed from: a */
    public final void mo16659a(zzx zzx, aaab aaab) {
        this.f27833d = zzx;
        this.f27834e = zzx.f56354e;
        this.f27837h = zzx.f56355f;
        this.f27834e.registerCallback(this);
        List list = zzx.f56352c;
        if (list != null) {
            this.f27835f = list;
        }
        List list2 = zzx.f56353d;
        if (list2 != null) {
            this.f27836g = list2;
        }
        this.f27839j = new aaca(zzx, zzx.getClass(), 2);
        mo16658a(aaab);
    }
}
