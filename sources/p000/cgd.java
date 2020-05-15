package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgd extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f6780a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final List f6781b;

    /* renamed from: c */
    private cdg f6782c;

    /* renamed from: d */
    private Class f6783d;

    /* renamed from: e */
    private String f6784e;

    /* renamed from: f */
    private int f6785f;

    public cgd(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private final void m4174a(Appendable appendable) {
        m4175a(this, appendable);
        List list = this.f6781b;
        cgc cgc = new cgc(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                cgc.append("Cause (");
                int i2 = i + 1;
                cgc.append(String.valueOf(i2));
                cgc.append(" of ");
                cgc.append(String.valueOf(size));
                cgc.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof cgd) {
                    ((cgd) th).m4174a(cgc);
                } else {
                    m4175a(th, cgc);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3852a(cdg cdg, int i, Class cls) {
        this.f6782c = cdg;
        this.f6785f = i;
        this.f6783d = cls;
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f6784e);
        Class cls = this.f6783d;
        String str3 = "";
        if (cls != null) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        int i = this.f6785f;
        if (i != 0) {
            String a = C0074cct.m3975a(i);
            StringBuilder sb3 = new StringBuilder(a.length() + 2);
            sb3.append(", ");
            sb3.append(a);
            str2 = sb3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        cdg cdg = this.f6782c;
        if (cdg != null) {
            String valueOf2 = String.valueOf(cdg);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List a2 = mo3851a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" causes:");
        }
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Throwable th = (Throwable) a2.get(i2);
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        bqye.m113759a(this, System.err);
    }

    public cgd(String str, List list) {
        this.f6784e = str;
        setStackTrace(f6780a);
        this.f6781b = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        m4174a(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m4174a(printWriter);
    }

    /* renamed from: a */
    private static void m4175a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private final void m4176a(Throwable th, List list) {
        if (th instanceof cgd) {
            for (Throwable th2 : ((cgd) th).f6781b) {
                m4176a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    public final List mo3851a() {
        ArrayList arrayList = new ArrayList();
        m4176a(this, arrayList);
        return arrayList;
    }
}
