package p000;

import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;

/* renamed from: xhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xhi {

    /* renamed from: d */
    private static final Logger f52295d = new Logger(new String[]{"ViewSelector"}, (short[]) null);

    /* renamed from: a */
    public ViewOptions f52296a;

    /* renamed from: b */
    public int f52297b;

    /* renamed from: c */
    private final bnic f52298c;

    public xhi(Set set) {
        bmxy.m108581a(set);
        this.f52298c = bnic.m109495a((Collection) set);
    }

    /* renamed from: a */
    private final ViewOptions m42941a(ViewOptions viewOptions) {
        HashSet a = bnpf.m110049a((Iterable) this.f52298c);
        if (viewOptions.mo18758b() != null) {
            a.remove(viewOptions.mo18758b());
        }
        try {
            ViewOptions a2 = ViewOptions.m23543a(viewOptions.mo18664a());
            a2.f31837d.clear();
            a2.f31837d.addAll(a);
            return a2;
        } catch (JSONException e) {
            return viewOptions;
        }
    }

    /* renamed from: a */
    public final bmxv mo29745a(int i, ViewOptions viewOptions) {
        int i2;
        if (this.f52297b == 0 || xhh.m42940a(i) > xhh.m42940a(this.f52297b)) {
            Logger Logger = f52295d;
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = viewOptions;
            objArr[1] = Integer.valueOf(xhh.m42940a(i));
            int i3 = this.f52297b;
            if (i3 != 0) {
                i2 = xhh.m42940a(i3);
            } else {
                i2 = -1;
            }
            objArr[2] = Integer.valueOf(i2);
            Logger.mo25414c(String.format(locale, "Accepting proposed view %s: outranks current (%d > %d)", objArr), new Object[0]);
            this.f52297b = i;
            ViewOptions a = m42941a(viewOptions);
            this.f52296a = a;
            return bmxv.m108566b(a);
        } else if (i == 3) {
            f52295d.mo25414c(String.format("Accepting proposed view %s: comes from explicit user action", viewOptions), new Object[0]);
            this.f52297b = 3;
            ViewOptions a2 = m42941a(viewOptions);
            this.f52296a = a2;
            return bmxv.m108566b(a2);
        } else {
            ViewOptions viewOptions2 = this.f52296a;
            if (viewOptions2 != null && viewOptions2.equals(viewOptions)) {
                f52295d.mo25414c(String.format("Ignoring proposed view %s: is the same as current view", viewOptions), new Object[0]);
                return bmvz.f131120a;
            } else if (viewOptions.mo18758b() == null || this.f52296a == null || !viewOptions.mo18758b().equals(this.f52296a.mo18758b())) {
                f52295d.mo25414c("Ignoring proposed view %s: less than or equal rank %d, different transport", viewOptions, Integer.valueOf(xhh.m42940a(i)));
                return bmvz.f131120a;
            } else {
                f52295d.mo25414c(String.format("Accepting proposed view %s: matches current transport", viewOptions), new Object[0]);
                this.f52297b = i;
                ViewOptions a3 = m42941a(viewOptions);
                this.f52296a = a3;
                return bmxv.m108566b(a3);
            }
        }
    }

    /* renamed from: a */
    public final ViewOptions mo29746a() {
        try {
            return ViewOptions.m23543a(this.f52296a.mo18664a());
        } catch (JSONException e) {
            return this.f52296a;
        }
    }
}
