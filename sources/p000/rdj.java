package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: rdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdj {

    /* renamed from: a */
    public long f42730a;

    /* renamed from: b */
    public long f42731b;

    /* renamed from: c */
    public long f42732c;

    /* renamed from: d */
    public long f42733d;

    /* renamed from: e */
    public long f42734e;

    /* renamed from: f */
    public long f42735f;

    /* renamed from: g */
    public long f42736g;

    /* renamed from: h */
    public long f42737h;

    /* renamed from: i */
    public final Map f42738i = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder("flat file ttl debug info: ");
        for (Map.Entry entry : this.f42738i.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" count: ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        long j = this.f42733d;
        long j2 = this.f42735f;
        long j3 = this.f42731b;
        long j4 = this.f42734e;
        long j5 = this.f42730a;
        long j6 = this.f42736g;
        long j7 = this.f42732c;
        long j8 = this.f42737h;
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 686);
        sb2.append("Cleanup Results\nNum corrupted LogEvents deleted: 0\nNum corrupted PlayLoggerContexts deleted: ");
        sb2.append(j);
        sb2.append("\nNum of recycled PlayLoggerContexts: 0\nNum of log events deleted due to over size: ");
        sb2.append(j2);
        sb2.append("\nBytes of LogEvents deleted due to over size: ");
        sb2.append(j3);
        sb2.append("\nNum of log events deleted due to too old: ");
        sb2.append(j4);
        sb2.append("\nBytes of logEvents deleted due to too old: ");
        sb2.append(j5);
        sb2.append("\nNum of log events deleted due to corrupted PlayLoggerContexts: ");
        sb2.append(j6);
        sb2.append("\nBytes of logEvents deleted due to corrupted PlayLoggerContexts: ");
        sb2.append(j7);
        sb2.append("\nNum of log files deleted due to corrupted name: ");
        sb2.append(j8);
        sb2.append("\n");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
