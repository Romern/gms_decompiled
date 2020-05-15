package p000;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import java.lang.reflect.Constructor;

/* renamed from: dhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dhj {

    /* renamed from: a */
    public final String f13126a;

    /* renamed from: b */
    public final Class f13127b;

    /* renamed from: c */
    public final Object f13128c = new Object();

    /* renamed from: d */
    public IntentOperation f13129d = null;

    /* renamed from: e */
    public int f13130e = 0;

    /* renamed from: f */
    final /* synthetic */ dhm f13131f;

    /* renamed from: g */
    private final Context f13132g;

    /* renamed from: h */
    private Constructor f13133h;

    public dhj(dhm dhm, Context context, String str, String str2) {
        this.f13131f = dhm;
        this.f13132g = context;
        this.f13126a = str;
        this.f13127b = context.getClassLoader().loadClass(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = r9.f13128c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r9.f13133h != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r9.f13133h = r9.f13127b.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r4 = r9.f13131f.f13149l.mo9006a(r9.f13133h, r9.f13132g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5 = r9.f13127b.getName();
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 78);
        r7.append("Chimera module-intent-operation ");
        r7.append(r5);
        r7.append(" is not an IntentOperation, dropping operation");
        android.util.Log.e("IntentOperationExec", r7.toString());
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r6 = r9.f13127b.getName();
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 65);
        r8.append("Failed to instantiate Chimera operation impl ");
        r8.append(r6);
        r8.append(", dropping operation");
        android.util.Log.e("IntentOperationExec", r8.toString(), r4);
        r4 = null;
     */
    /* renamed from: a */
    public final IntentOperation mo9015a() {
        boolean z;
        Object obj;
        IntentOperation intentOperation;
        bmzs.m108698a(!this.f13131f.f13143f.isHeldByCurrentThread());
        synchronized (this) {
            z = false;
            if (this.f13129d != null) {
                if (this.f13130e > 0) {
                    z = true;
                }
                bmzs.m108698a(z);
                this.f13130e++;
                IntentOperation intentOperation2 = this.f13129d;
                return intentOperation2;
            }
        }
        if (intentOperation != null) {
            synchronized (this) {
                if (this.f13129d == null && this.f13130e == 0) {
                    z = true;
                }
                bmzs.m108698a(z);
                this.f13129d = intentOperation;
                this.f13130e++;
            }
            this.f13131f.f13149l.mo9009a(intentOperation, this.f13132g);
            return intentOperation;
        }
        return null;
    }
}
