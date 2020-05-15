package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: acpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpg {

    /* renamed from: a */
    public static final acpg f60408a = new acpg();

    /* renamed from: b */
    public final abyo f60409b = new abyo();

    /* renamed from: c */
    int f60410c = 0;

    /* renamed from: d */
    int f60411d = 0;

    /* renamed from: e */
    long f60412e = 0;

    /* renamed from: a */
    public static int m49653a(Context context, int i) {
        if (((Boolean) abzt.f58881aV.mo58455c()).booleanValue()) {
            acnv.m49550c("Clearing calendar data because emergency flag is set.");
            return 3;
        } else if (C1145kt.m18540a(context, "android.permission.READ_CALENDAR") == 0) {
            return i;
        } else {
            acnv.m49550c("Clearing calendar data because permission was denied.");
            return 3;
        }
    }

    /* renamed from: a */
    public static abym m49654a(Context context) {
        return new abym(context);
    }

    /* renamed from: a */
    static String m49655a(int i) {
        if (i == 0) {
            return "ACTION_NONE";
        }
        if (i == 1) {
            return "ACTION_INCREMENTAL_UPDATE";
        }
        if (i != 2) {
            return i != 3 ? Integer.toString(i) : "ACTION_CLEAR_DATA";
        }
        return "ACTION_FULL_UPDATE";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m49656a(acpf acpf, int i) {
        if (this.f60410c == 0 && this.f60411d != 0) {
            this.f60410c = 1;
            if (i != 0) {
                long max = Math.max(((Long) abzt.f58882aW.mo58455c()).longValue(), (this.f60412e + ((Long) abzt.f58883aX.mo58455c()).longValue()) - System.currentTimeMillis());
                acoe a = acoe.m49588a();
                snl.m35700a(a.f60325a.mo25814a(acpf, max, TimeUnit.MILLISECONDS));
                return;
            }
            acpf.run();
        }
    }

    /* renamed from: a */
    public final synchronized int mo32981a() {
        boolean z;
        int i;
        boolean z2 = true;
        if (this.f60410c == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f60411d == 0) {
            z2 = false;
        }
        sdo.m34970a(z2);
        i = this.f60411d;
        this.f60411d = 0;
        this.f60410c = 2;
        if (acnv.m49545a()) {
            acnv.m49542a("IndexingScheduler.onTaskStarted() -> %s", m49655a(i));
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo32982a(acpf acpf) {
        boolean z;
        acnv.m49541a("IndexingScheduler.onTaskFinished()");
        if (this.f60410c == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f60412e = System.currentTimeMillis();
        this.f60410c = 0;
        m49656a(acpf, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 > 1) goto L_0x0041;
     */
    /* renamed from: a */
    public final synchronized void mo32983a(Context context, int i, int i2) {
        String str;
        if (acnv.m49545a()) {
            String a = m49655a(i);
            if (i2 != 0) {
                str = "RUN_DEFERRED";
            } else {
                str = "RUN_IMMEDIATELY";
            }
            acnv.m49543a("IndexingScheduler.schedule(%s, %s)", a, str);
        }
        brhj a2 = brhj.m114016a(context);
        int max = Math.max(1, ((Integer) abzt.f58941bc.mo58455c()).intValue());
        int max2 = Math.max(1, ((Integer) abzt.f58942bd.mo58455c()).intValue());
        if (max > 1) {
        }
        a2 = new aclv(a2, max, max2);
        mo32984a(context, new acos(a2, Math.max(1, ((Integer) abzt.f58940bb.mo58455c()).intValue())), i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo32984a(Context context, brhj brhj, int i, int i2) {
        if (!cemq.m137366c()) {
            acnv.m49550c("Not scheduling calendar indexing task because the feature is disabled.");
            return;
        }
        this.f60411d = Math.max(this.f60411d, m49653a(context, i));
        m49656a(new acpf(this, context, brhj), i2);
    }
}
