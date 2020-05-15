package p000;

import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.Locale;
import java.util.Set;

/* renamed from: xzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzz {

    /* renamed from: c */
    public static final Logger f53506c = new Logger(new String[]{"ViewController"}, (short[]) null);

    /* renamed from: a */
    public ViewOptions f53507a;

    /* renamed from: b */
    public int f53508b;

    /* renamed from: d */
    private final xwj f53509d;

    /* renamed from: e */
    private final yas f53510e;

    /* renamed from: f */
    private final xwg f53511f;

    /* renamed from: g */
    private final Set f53512g;

    public xzz(xwj xwj, yas yas, xwg xwg, Set set) {
        bmxy.m108581a(xwj);
        this.f53509d = xwj;
        bmxy.m108581a(yas);
        this.f53510e = yas;
        bmxy.m108581a(xwg);
        this.f53511f = xwg;
        bmxy.m108581a(set);
        this.f53512g = bnpf.m110049a((Iterable) set);
    }

    /* renamed from: a */
    public final void mo30294a() {
        f53506c.mo25412b("disallowFingerprintOption", new Object[0]);
        this.f53510e.mo14325a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo30296b(int i, ViewOptions viewOptions) {
        f53506c.mo25412b("switchToView %s", viewOptions);
        this.f53508b = i;
        Set set = this.f53512g;
        if (viewOptions.mo18854b() != null) {
            set = bnpf.m110057c(this.f53512g, bnpf.m110050a(viewOptions.mo18854b()));
        }
        if (!set.isEmpty()) {
            viewOptions.mo18875a(set);
        }
        this.f53507a = viewOptions;
        this.f53511f.mo30183a(this.f53509d, viewOptions);
        this.f53510e.mo14326a(viewOptions);
    }

    /* renamed from: a */
    public final void mo30295a(int i, ViewOptions viewOptions) {
        int i2;
        if (this.f53508b == 0 || xyz.m43670a(i) > xyz.m43670a(this.f53508b)) {
            Logger Logger = f53506c;
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = viewOptions;
            objArr[1] = Integer.valueOf(xyz.m43670a(i));
            int i3 = this.f53508b;
            if (i3 != 0) {
                i2 = xyz.m43670a(i3);
            } else {
                i2 = -1;
            }
            objArr[2] = Integer.valueOf(i2);
            Logger.mo25414c(String.format(locale, "Accepting proposed view %s: outranks current (%d > %d)", objArr), new Object[0]);
            mo30296b(i, viewOptions);
        } else if (i == 3) {
            f53506c.mo25414c(String.format("Accepting proposed view %s: comes from explicit user action", viewOptions), new Object[0]);
            mo30296b(3, viewOptions);
        } else {
            ViewOptions viewOptions2 = this.f53507a;
            if (viewOptions2 != null && viewOptions2.equals(viewOptions)) {
                f53506c.mo25414c(String.format("Ignoring proposed view %s: is the same as current view", viewOptions), new Object[0]);
            } else if (viewOptions.mo18854b() == null || this.f53507a == null || !viewOptions.mo18854b().equals(this.f53507a.mo18854b())) {
                f53506c.mo25414c("Ignoring proposed view %s: less than or equal rank %d, different transport", viewOptions, Integer.valueOf(xyz.m43670a(i)));
            } else {
                f53506c.mo25414c(String.format("Accepting proposed view %s: matches current transport", viewOptions), new Object[0]);
                mo30296b(i, viewOptions);
            }
        }
    }
}
