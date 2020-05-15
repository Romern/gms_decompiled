package p000;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: bguu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguu {

    /* renamed from: a */
    public final qxq f117598a;

    /* renamed from: b */
    private final qws f117599b;

    /* renamed from: c */
    private final qws f117600c;

    /* renamed from: d */
    private final Context f117601d;

    /* renamed from: e */
    private long f117602e;

    /* renamed from: f */
    private long f117603f;

    /* renamed from: g */
    private Boolean f117604g;

    /* renamed from: h */
    private Boolean f117605h;

    /* renamed from: i */
    private long f117606i = SystemClock.elapsedRealtime();

    public bguu(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f117601d = applicationContext;
        this.f117599b = qws.m33019a(applicationContext, "LE");
        this.f117600c = new qws(this.f117601d, "ULR", null);
        this.f117598a = new qxq(this.f117599b, "LE_ULR_COUNTERS", 1024);
    }

    /* renamed from: a */
    private final void m100031a(Boolean bool, Boolean bool2) {
        int i;
        int i2;
        String valueOf = String.valueOf(bool);
        String valueOf2 = String.valueOf(bool2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("Clearcut event: reportingEnabled=");
        sb.append(valueOf);
        sb.append(" locationEnabled=");
        sb.append(valueOf2);
        sb.toString();
        bxvd da = bpsb.f138929d.mo74144da();
        boolean booleanValue = bool2.booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsb bpsb = (bpsb) da.f164949b;
        bpsb.f138931a |= 2;
        bpsb.f138933c = booleanValue;
        if (bool != null) {
            boolean booleanValue2 = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsb bpsb2 = (bpsb) da.f164949b;
            bpsb2.f138931a |= 1;
            bpsb2.f138932b = booleanValue2;
        }
        bxvd da2 = bpsa.f138925c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpsa bpsa = (bpsa) da2.f164949b;
        bpsb bpsb3 = (bpsb) da.mo74062i();
        bpsb3.getClass();
        bpsa.f138928b = bpsb3;
        bpsa.f138927a |= 1;
        qwo a = this.f117600c.mo24333a((bpsa) da2.mo74062i());
        if (!bool2.booleanValue()) {
            i = 21110004;
        } else {
            i = 21110003;
        }
        a.mo24322a(i);
        if (bool != null) {
            if (!bool.booleanValue()) {
                i2 = 21110002;
            } else {
                i2 = 21110001;
            }
            a.mo24322a(i2);
        }
        if (bool != null) {
            if (bool2.booleanValue() && bool.booleanValue()) {
                a.mo24322a(21110227);
            } else if (!bool2.booleanValue() && bool.booleanValue()) {
                a.mo24322a(21110228);
            } else if (!bool2.booleanValue() || bool.booleanValue()) {
                a.mo24322a(21110230);
            } else {
                a.mo24322a(21110229);
            }
        }
        a.mo24327b();
        this.f117604g = bool2;
        this.f117605h = bool;
        this.f117606i = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63231a() {
        this.f117603f++;
    }

    /* renamed from: b */
    public final synchronized void mo63233b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f117603f > chcs.f188354a.mo6606a().mo85109l() || elapsedRealtime - this.f117602e > chcs.f188354a.mo6606a().mo85108k()) {
            mo63235c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63235c() {
        long j = this.f117603f;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Clearcut uploadCounters numEvents=");
        sb.append(j);
        sb.toString();
        if (this.f117603f != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f117603f;
            long j3 = this.f117602e;
            StringBuilder sb2 = new StringBuilder(94);
            sb2.append("Clearcut sending ");
            sb2.append(j2);
            sb2.append(" Counter events ");
            sb2.append(elapsedRealtime - j3);
            sb2.append("ms since last upload.");
            sb2.toString();
            new bgut(this).start();
            this.f117602e = elapsedRealtime;
            this.f117603f = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo63234b(boolean z) {
        boolean z2;
        boolean b = aeri.m52437b(this.f117601d);
        Boolean bool = this.f117604g;
        boolean z3 = false;
        if (bool == null || bool.booleanValue() != b) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool2 = this.f117605h;
        if (bool2 == null || bool2.booleanValue() != z) {
            z3 = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f117606i;
        long n = chcs.f188354a.mo6606a().mo85111n();
        if (z3 || z2 || elapsedRealtime > n) {
            m100031a(Boolean.valueOf(z), Boolean.valueOf(b));
        }
    }

    /* renamed from: a */
    public final synchronized void mo63232a(boolean z) {
        m100031a(this.f117605h, Boolean.valueOf(z));
    }
}
