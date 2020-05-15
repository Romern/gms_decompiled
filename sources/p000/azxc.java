package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: azxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxc {

    /* renamed from: a */
    public final CopyOnWriteArrayList f100156a;

    /* renamed from: b */
    public final C1245ok f100157b;

    /* renamed from: c */
    public int f100158c;

    /* renamed from: d */
    public long f100159d;

    /* renamed from: e */
    public boolean f100160e;

    /* renamed from: f */
    private boolean f100161f;

    /* renamed from: g */
    private final azwv f100162g = new azxb(this);

    /* renamed from: h */
    private final azxd f100163h = new azxa(this);

    public azxc(azwz... azwzArr) {
        this.f100156a = new CopyOnWriteArrayList(azwzArr);
        this.f100157b = new C1245ok(1);
        this.f100158c = 1;
        azwzArr[0].mo55347a(this.f100163h);
        this.f100157b.put(azwzArr[0], true);
    }

    /* renamed from: a */
    public final void mo55352a() {
        if (!this.f100161f) {
            this.f100161f = true;
            this.f100159d = -1;
            mo55354c();
        }
    }

    /* renamed from: b */
    public final void mo55353b() {
        if (this.f100161f) {
            if (this.f100160e) {
                this.f100160e = false;
                azwx.m86308a().mo55345b(this.f100162g);
            }
            this.f100161f = false;
        }
    }

    /* renamed from: c */
    public final void mo55354c() {
        if (!this.f100160e && this.f100161f && this.f100158c != 0) {
            this.f100160e = true;
            azwx.m86308a().mo55344a(this.f100162g);
        }
    }
}
