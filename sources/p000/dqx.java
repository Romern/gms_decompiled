package p000;

import android.os.SystemClock;
import android.os.WorkSource;

/* renamed from: dqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqx {

    /* renamed from: a */
    public String f13840a;

    /* renamed from: b */
    public final WorkSource f13841b;

    /* renamed from: c */
    public long f13842c;

    /* renamed from: d */
    public boolean f13843d;

    /* renamed from: e */
    public boolean f13844e;

    /* renamed from: f */
    public int f13845f;

    /* renamed from: g */
    public String f13846g;

    /* renamed from: h */
    private long f13847h;

    /* renamed from: i */
    private long f13848i;

    public dqx(String str, WorkSource workSource, long j, long j2, long j3, String str2) {
        this.f13840a = str;
        this.f13841b = workSource;
        this.f13842c = j;
        this.f13847h = j2;
        this.f13848i = j3;
        this.f13845f = 0;
        this.f13846g = str2;
        this.f13843d = false;
        this.f13844e = false;
    }

    /* renamed from: a */
    public final void mo9462a() {
        if (this.f13842c > this.f13847h) {
            dst.m9254a("WorkInfo", "Attribution was already enqueued %s.", toString());
            this.f13845f |= 8;
        }
        this.f13842c = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final void mo9463b() {
        if (this.f13847h > this.f13848i) {
            dst.m9254a("WorkInfo", "Attribution was already started %s.", toString());
            this.f13845f |= 1;
        }
        this.f13847h = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo9464c() {
        if (this.f13847h == -1) {
            dst.m9254a("WorkInfo", "Attribution was never started %s.", toString());
            this.f13845f |= 2;
        }
        if (this.f13848i > this.f13847h) {
            dst.m9254a("WorkInfo", "Attribution was already stopped %s.", toString());
            this.f13845f |= 4;
        }
        this.f13848i = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final long mo9465d() {
        return this.f13848i - this.f13847h;
    }

    /* renamed from: e */
    public final long mo9466e() {
        return this.f13847h - this.f13842c;
    }

    /* renamed from: f */
    public final void mo9467f() {
        this.f13843d = true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f13845f != 0) {
            sb.append("errorCode=");
            sb.append(this.f13845f);
            sb.append(", ");
        }
        sb.append("pkg=");
        sb.append(this.f13846g);
        sb.append(", lbl=");
        sb.append(this.f13840a);
        sb.append(", start=");
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        long j = this.f13847h;
        String str2 = "unspec";
        if (j != -1) {
            str = egc.m10349a(j + currentTimeMillis);
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(", stop=");
        long j2 = this.f13848i;
        if (j2 != -1) {
            str2 = egc.m10349a(j2 + currentTimeMillis);
        }
        sb.append(str2);
        if (!(this.f13847h == -1 || this.f13848i == -1)) {
            sb.append(", durtn=");
            sb.append(mo9465d());
            sb.append("ms");
        }
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public dqx(String str, String str2, WorkSource workSource) {
        this(str, workSource, -1, -1, -1, str2);
        sdo.m34977c(str);
    }
}
