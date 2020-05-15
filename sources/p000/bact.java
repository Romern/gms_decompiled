package p000;

/* renamed from: bact */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bact {

    /* renamed from: a */
    public Integer f100497a;

    /* renamed from: b */
    private Integer f100498b;

    /* renamed from: c */
    private bacx f100499c;

    /* renamed from: d */
    private bacx f100500d;

    /* renamed from: e */
    private bacx f100501e;

    /* renamed from: f */
    private bacx f100502f;

    /* renamed from: g */
    private Boolean f100503g;

    /* renamed from: h */
    private Boolean f100504h;

    /* renamed from: a */
    public final bacu mo55592a() {
        String str = this.f100498b == null ? " syncType" : "";
        if (this.f100499c == null) {
            str = str.concat(" upSyncPolicy");
        }
        if (this.f100500d == null) {
            str = String.valueOf(str).concat(" upSyncWithListenerPolicy");
        }
        if (this.f100501e == null) {
            str = String.valueOf(str).concat(" downSyncPolicy");
        }
        if (this.f100502f == null) {
            str = String.valueOf(str).concat(" downSyncWithListenerPolicy");
        }
        if (this.f100503g == null) {
            str = String.valueOf(str).concat(" requiresCharging");
        }
        if (this.f100504h == null) {
            str = String.valueOf(str).concat(" requiresUnmetered");
        }
        if (str.isEmpty()) {
            return new bacq(this.f100498b.intValue(), this.f100499c, this.f100500d, this.f100501e, this.f100502f, this.f100497a, this.f100503g.booleanValue(), this.f100504h.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo55596b(bacx bacx) {
        if (bacx != null) {
            this.f100502f = bacx;
            return;
        }
        throw new NullPointerException("Null downSyncWithListenerPolicy");
    }

    /* renamed from: c */
    public final void mo55598c(bacx bacx) {
        if (bacx != null) {
            this.f100499c = bacx;
            return;
        }
        throw new NullPointerException("Null upSyncPolicy");
    }

    /* renamed from: d */
    public final void mo55599d(bacx bacx) {
        if (bacx != null) {
            this.f100500d = bacx;
            return;
        }
        throw new NullPointerException("Null upSyncWithListenerPolicy");
    }

    /* renamed from: b */
    public final void mo55597b(boolean z) {
        this.f100504h = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo55593a(int i) {
        this.f100498b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo55594a(bacx bacx) {
        if (bacx != null) {
            this.f100501e = bacx;
            return;
        }
        throw new NullPointerException("Null downSyncPolicy");
    }

    /* renamed from: a */
    public final void mo55595a(boolean z) {
        this.f100503g = Boolean.valueOf(z);
    }
}
