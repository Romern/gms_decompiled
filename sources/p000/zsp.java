package p000;

import java.util.Map;

/* renamed from: zsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zsp {
    /* renamed from: a */
    public abstract int mo31442a();

    /* renamed from: b */
    public abstract int mo31443b();

    /* renamed from: c */
    public abstract int mo31444c();

    /* renamed from: d */
    public abstract int mo31445d();

    /* renamed from: e */
    public abstract int mo31446e();

    /* renamed from: f */
    public abstract bnhe mo31448f();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tsyncs: ");
        sb.append(mo31442a());
        sb.append("\n\tuploaded: ");
        sb.append(mo31446e());
        sb.append("\n\tdownloaded: ");
        sb.append(mo31445d());
        sb.append("\n\tduration: ");
        sb.append(mo31444c());
        sb.append("\n\tRPCs: ");
        sb.append(mo31443b());
        sb.append("\n\ttriggers:\n");
        bnrd a = mo31448f().entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            sb.append(String.format("\t\t%s: %s\n", ((cadu) entry.getKey()).name(), entry.getValue()));
        }
        return sb.toString();
    }
}
