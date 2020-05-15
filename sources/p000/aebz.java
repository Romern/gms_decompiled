package p000;

import android.net.Uri;
import android.os.Bundle;
import java.util.Set;

/* renamed from: aebz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aebz {

    /* renamed from: c */
    public int f63091c = 0;

    /* renamed from: d */
    public int f63092d = -1;

    /* renamed from: e */
    public int f63093e = 0;

    /* renamed from: f */
    public int f63094f = -1;

    /* renamed from: g */
    public int f63095g;

    /* renamed from: h */
    public int f63096h = 0;

    /* renamed from: i */
    public String f63097i;

    /* renamed from: j */
    public int f63098j;

    /* renamed from: k */
    public String f63099k;

    /* renamed from: l */
    public boolean f63100l;

    /* renamed from: m */
    public int f63101m;

    /* renamed from: n */
    public boolean f63102n;

    /* renamed from: o */
    public boolean f63103o;

    /* renamed from: p */
    public boolean f63104p;

    /* renamed from: q */
    public Set f63105q = bnon.f131923a;

    /* renamed from: r */
    public aebo f63106r = aebo.f63077a;

    /* renamed from: s */
    public Bundle f63107s;

    /* renamed from: a */
    private final aecl mo33971a() {
        aeck aeck = new aeck();
        aeck.f63141d = this.f63097i;
        aeck.f63142e = this.f63099k;
        return aeck.mo34036a();
    }

    /* renamed from: a */
    public final void mo34023a(int i) {
        this.f63091c = i;
        this.f63092d = i;
    }

    /* renamed from: a */
    public final void mo34024a(int i, int i2) {
        this.f63093e = i;
        this.f63094f = i2;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f63103o = z;
    }

    /* renamed from: a */
    public final void mo34026a(boolean z) {
        this.f63104p = z;
        this.f63095g = z ? 1 : 0;
        this.f63096h = z;
    }

    /* renamed from: b */
    public abstract aeca mo33974b();

    /* renamed from: b */
    public final void mo34027b(int i) {
        this.f63101m = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f63100l = z;
    }

    /* renamed from: b */
    public final void mo34028b(int i, int i2) {
        this.f63091c = i;
        this.f63092d = i2;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo34029b(boolean z) {
        this.f63101m = z ? 1 : 0;
        this.f63100l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo34030c() {
        int i;
        int i2 = 1;
        if (this.f63094f == -1) {
            if (!cdnj.f181319a.mo6606a().mo78010n() || !aeca.f63108c.mo6527a(mo33971a())) {
                i = this.f63093e;
            } else {
                i = 1;
            }
            this.f63094f = i;
        }
        if (this.f63092d == -1) {
            if (!cdnj.f181319a.mo6606a().mo78011o() || !aeca.f63109d.mo6527a(mo33971a())) {
                i2 = this.f63091c;
            }
            this.f63092d = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo34031d() {
        boolean z;
        if (this.f63097i != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Must provide an endpoint for this task by calling setService(ComponentName).");
        aeat.m51535b(this.f63099k);
        aebo aebo = this.f63106r;
        aecm aecm = aeca.f63108c;
        if (aebo != null) {
            int i = aebo.f63078b;
            if (i == 1 || i == 0) {
                int i2 = aebo.f63079c;
                int i3 = aebo.f63080d;
                if (i == 0 && i2 < 0) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("InitialBackoffSeconds can't be negative: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                } else if (i == 1 && i2 < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (i3 < i2) {
                    StringBuilder sb2 = new StringBuilder(77);
                    sb2.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                    sb2.append(i3);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(45);
                sb3.append("Must provide a valid RetryPolicy: ");
                sb3.append(i);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        if (this.f63102n) {
            aeca.m51621b(this.f63107s);
        }
        if (!this.f63105q.isEmpty() && this.f63091c == 2) {
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
        for (Uri uri : this.f63105q) {
            aeca.m51620a(uri);
        }
    }

    /* renamed from: e */
    public final void mo34032e() {
        this.f63093e = 0;
        this.f63094f = 0;
        this.f63103o = false;
    }

    /* renamed from: a */
    public final void mo34025a(Set set) {
        this.f63105q = new C1225nr(set);
    }
}
