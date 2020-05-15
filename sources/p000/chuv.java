package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: chuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chuv {

    /* renamed from: a */
    public static final List f189214a;

    /* renamed from: b */
    public static final chuv f189215b = chus.OK.mo85686a();

    /* renamed from: c */
    public static final chuv f189216c = chus.CANCELLED.mo85686a();

    /* renamed from: d */
    public static final chuv f189217d = chus.UNKNOWN.mo85686a();

    /* renamed from: e */
    public static final chuv f189218e = chus.INVALID_ARGUMENT.mo85686a();

    /* renamed from: f */
    public static final chuv f189219f = chus.DEADLINE_EXCEEDED.mo85686a();

    /* renamed from: g */
    public static final chuv f189220g = chus.NOT_FOUND.mo85686a();

    /* renamed from: h */
    public static final chuv f189221h = chus.ALREADY_EXISTS.mo85686a();

    /* renamed from: i */
    public static final chuv f189222i = chus.PERMISSION_DENIED.mo85686a();

    /* renamed from: j */
    public static final chuv f189223j = chus.UNAUTHENTICATED.mo85686a();

    /* renamed from: k */
    public static final chuv f189224k = chus.RESOURCE_EXHAUSTED.mo85686a();

    /* renamed from: l */
    public static final chuv f189225l = chus.FAILED_PRECONDITION.mo85686a();

    /* renamed from: m */
    public static final chuv f189226m = chus.ABORTED.mo85686a();

    /* renamed from: n */
    public static final chuv f189227n = chus.OUT_OF_RANGE.mo85686a();

    /* renamed from: o */
    public static final chuv f189228o = chus.INTERNAL.mo85686a();

    /* renamed from: p */
    public static final chuv f189229p = chus.UNAVAILABLE.mo85686a();

    /* renamed from: q */
    static final chtn f189230q = chtn.m149537a("grpc-status", false, new chut());

    /* renamed from: r */
    static final chtn f189231r;

    /* renamed from: v */
    private static final chtq f189232v;

    /* renamed from: s */
    public final chus f189233s;

    /* renamed from: t */
    public final String f189234t;

    /* renamed from: u */
    public final Throwable f189235u;

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        chus[] values = chus.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            chus chus = values[i];
            chuv chuv = (chuv) treeMap.put(Integer.valueOf(chus.f189211r), new chuv(chus, null, null));
            if (chuv == null) {
                i++;
            } else {
                String name = chuv.f189233s.name();
                String name2 = chus.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length());
                sb.append("Code value duplication between ");
                sb.append(name);
                sb.append(" & ");
                sb.append(name2);
                throw new IllegalStateException(sb.toString());
            }
        }
        f189214a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        chus.UNIMPLEMENTED.mo85686a();
        chus.DATA_LOSS.mo85686a();
        chuu chuu = new chuu();
        f189232v = chuu;
        f189231r = chtn.m149537a("grpc-message", false, chuu);
    }

    private chuv(chus chus, String str, Throwable th) {
        bmxy.m108582a(chus, "code");
        this.f189233s = chus;
        this.f189234t = str;
        this.f189235u = th;
    }

    /* renamed from: a */
    public static chuv m149607a(chus chus) {
        return chus.mo85686a();
    }

    /* renamed from: b */
    public static chtr m149610b(Throwable th) {
        bmxy.m108582a(th, "t");
        while (true) {
            if (th != null) {
                if (th instanceof chuw) {
                    chuw chuw = (chuw) th;
                    break;
                } else if (th instanceof chux) {
                    return ((chux) th).f189239b;
                } else {
                    th = th.getCause();
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final chuv mo85692c(Throwable th) {
        return !bmxi.m108538a(this.f189235u, th) ? new chuv(this.f189233s, this.f189234t, th) : this;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("code", this.f189233s.name());
        a.mo66885a("description", this.f189234t);
        Throwable th = this.f189235u;
        Object obj = th;
        if (th != null) {
            obj = bmzo.m108692d(th);
        }
        a.mo66885a("cause", obj);
        return a.toString();
    }

    /* renamed from: a */
    public static chuv m149608a(Throwable th) {
        bmxy.m108582a(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof chuw) {
                return ((chuw) th2).f189236a;
            }
            if (th2 instanceof chux) {
                return ((chux) th2).f189238a;
            }
        }
        return f189217d.mo85692c(th);
    }

    /* renamed from: c */
    public final chuw mo85693c() {
        return new chuw(this);
    }

    /* renamed from: b */
    public final chuv mo85690b(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.f189234t;
        if (str2 == null) {
            return new chuv(this.f189233s, str, this.f189235u);
        }
        chus chus = this.f189233s;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        return new chuv(chus, sb.toString(), this.f189235u);
    }

    /* renamed from: a */
    static String m149609a(chuv chuv) {
        if (chuv.f189234t == null) {
            return chuv.f189233s.toString();
        }
        String valueOf = String.valueOf(chuv.f189233s);
        String str = chuv.f189234t;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final chux mo85691b() {
        return new chux(this);
    }

    /* renamed from: a */
    public final chuv mo85687a(String str) {
        return !bmxi.m108538a(this.f189234t, str) ? new chuv(this.f189233s, str, this.f189235u) : this;
    }

    /* renamed from: a */
    public final chux mo85688a(chtr chtr) {
        return new chux(this, chtr);
    }

    /* renamed from: a */
    public final boolean mo85689a() {
        return chus.OK == this.f189233s;
    }
}
