package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bfdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdv implements bfew {

    /* renamed from: a */
    public final bfec f113517a;

    /* renamed from: b */
    final /* synthetic */ bfdw f113518b;

    /* renamed from: c */
    private final bfdp f113519c;

    /* renamed from: d */
    private volatile boolean f113520d = false;

    /* renamed from: e */
    private volatile List f113521e = bfib.m96839a();

    public bfdv(bfdw bfdw, bfdp bfdp, bfec bfec) {
        this.f113518b = bfdw;
        this.f113519c = bfdp;
        this.f113517a = bfec;
    }

    /* renamed from: a */
    private final synchronized void m96451a(String str, int i) {
        mo61495a(str, this.f113519c.mo61479c(i));
    }

    /* renamed from: b */
    private final synchronized void m96452b(String str) {
        if (!this.f113520d && this.f113519c.mo61476b() != null) {
            this.f113520d = true;
            this.f113518b.f113535m.countDown();
            if (this.f113517a != null) {
                this.f113518b.f113527e.post(new bfdu(this, str));
            }
        }
    }

    /* renamed from: a */
    public final void mo61486a() {
    }

    /* renamed from: a */
    public final void mo61487a(int i) {
    }

    /* renamed from: a */
    public final void mo61488a(int i, bsax bsax) {
    }

    /* renamed from: a */
    public final void mo61489a(int i, String str) {
    }

    /* renamed from: a */
    public final void mo61490a(int i, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo61491a(bfhd bfhd) {
    }

    /* renamed from: a */
    public final void mo61492a(bsax bsax) {
    }

    /* renamed from: a */
    public final void mo60954a(String str) {
    }

    /* renamed from: a */
    public final void mo60955a(Map map) {
    }

    /* renamed from: b */
    public final void mo61496b() {
    }

    /* renamed from: c */
    public final void mo61497c() {
    }

    /* renamed from: d */
    public final void mo61498d() {
    }

    /* renamed from: e */
    public final void mo61499e() {
    }

    /* renamed from: f */
    public final void mo61500f() {
    }

    /* renamed from: g */
    public final void mo61501g() {
    }

    /* renamed from: h */
    public final void mo61502h() {
    }

    /* renamed from: i */
    public final void mo61503i() {
    }

    /* renamed from: j */
    public final void mo61504j() {
    }

    /* renamed from: k */
    public final synchronized void mo61505k() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfdp.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bfdp.a(java.lang.String, int):void
      bfdp.a(java.lang.String, bfdq):void
      bfdp.a(int, boolean):void */
    /* renamed from: a */
    public final synchronized void mo61493a(String str, int i, bsax bsax) {
        this.f113519c.mo61473a(i, true);
        if (this.f113517a != null) {
            this.f113518b.f113527e.post(new bfds(this));
        }
        if (!this.f113518b.f113532j && !bfib.m96840a(str)) {
            this.f113519c.mo61481c(str);
            if (this.f113518b.mo61512c(str)) {
                this.f113518b.f113532j = true;
            }
        }
        m96451a(str, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfdp.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bfdp.a(java.lang.String, int):void
      bfdp.a(java.lang.String, bfdq):void
      bfdp.a(int, boolean):void */
    /* renamed from: a */
    public final synchronized void mo61494a(String str, int i, String str2) {
        this.f113519c.mo61473a(i, false);
        if (this.f113517a != null) {
            this.f113518b.f113527e.post(new bfdr(this));
        }
        m96451a(str, i);
    }

    /* renamed from: a */
    public final synchronized void mo61495a(String str, String str2) {
        if (!this.f113521e.contains(str2)) {
            this.f113519c.f113496a.size();
            bfia a = this.f113519c.mo61470a(str2);
            if (a != null) {
                String b = this.f113519c.mo61477b(str2);
                String valueOf = String.valueOf(b);
                if (valueOf.length() == 0) {
                    new String("Finished uploading GLocRequests in file: ");
                } else {
                    "Finished uploading GLocRequests in file: ".concat(valueOf);
                }
                this.f113521e.add(str2);
                if (this.f113517a != null) {
                    this.f113518b.f113527e.post(new bfdt(this, b, a));
                }
            }
        }
        m96452b(str);
    }
}
