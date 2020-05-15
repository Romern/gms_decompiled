package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

/* renamed from: apfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfh extends aaab {

    /* renamed from: a */
    private static final Set f84314a = new HashSet();

    /* renamed from: b */
    private final aoyh f84315b = aoyh.m69805a("RestoreGmsContactsOp");

    /* renamed from: c */
    private final apbn f84316c;

    /* renamed from: d */
    private final String f84317d;

    /* renamed from: e */
    private final String f84318e;

    /* renamed from: f */
    private final String f84319f;

    /* renamed from: g */
    private final String f84320g;

    /* renamed from: h */
    private final String[] f84321h;

    public apfh(apbn apbn, String str, String str2, String str3, String str4, String[] strArr) {
        super(135, "RestoreContacts");
        this.f84316c = apbn;
        this.f84317d = str;
        this.f84318e = str2;
        this.f84319f = str3;
        this.f84320g = str4;
        this.f84321h = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0.mo47147a() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r1 = p000.apfd.m70140a().mo47152a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r6 = new p000.aoyo(r13);
        r2 = p000.apfa.f84284a.mo47145a(r12.f84318e, r12.f84319f, r12.f84321h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2.mo66813a() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r3 = p000.apfg.m70152a(r1, r13, r6, (p000.btem) r2.mo66814b(), r12.f84317d, r12.f84318e, r12.f84319f, r12.f84315b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        p000.apfg.m70151a(7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r1 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r3 != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r1.mo47151b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r1.mo47148a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r13 = r12.f84316c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r3 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        p000.apfg.m70151a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r3 != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r0 = com.google.android.gms.common.api.Status.f30109c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r0 = com.google.android.gms.common.api.Status.f30107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r13.mo46970a(r0);
        r13 = p000.apfh.f84314a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        p000.apfh.f84314a.remove(r12.f84319f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        apfb a = apfb.m70132a(context);
        synchronized (f84314a) {
            boolean z = false;
            if (f84314a.contains(this.f84319f)) {
                new Object[1][0] = this.f84320g;
                apfg.m70151a(6, a);
                this.f84316c.mo46970a(Status.f30111e);
                return;
            }
            f84314a.add(this.f84319f);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84316c.mo46970a(status);
    }
}
