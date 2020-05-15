package p000;

import android.content.Context;

/* renamed from: aqjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqjp {

    /* renamed from: a */
    private boolean f86223a;

    /* renamed from: b */
    private boolean f86224b = false;

    /* renamed from: c */
    private aqis f86225c = null;

    /* renamed from: g */
    public final Context f86226g;

    protected aqjp(Context context, boolean z) {
        this.f86226g = context;
        this.f86223a = z;
    }

    /* renamed from: a */
    public final void mo47924a(aqis aqis) {
        this.f86224b = true;
        this.f86225c = aqis;
        mo47919d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47913a(boolean z);

    /* renamed from: c */
    public final void mo47925c(boolean z) {
        if (z != this.f86223a) {
            this.f86223a = z;
            aqis aqis = this.f86225c;
            if (aqis != null) {
                aqis.mo47894a(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo47919d() {
        aqis aqis = this.f86225c;
        if (aqis != null) {
            aqis.mo47894a(this.f86223a);
            this.f86225c.f86178a.mo71396b(true);
        }
    }

    /* renamed from: f */
    public final void mo47926f() {
        if (this.f86224b) {
            mo47913a(this.f86223a);
            return;
        }
        String valueOf = String.valueOf(getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 110);
        sb.append(valueOf);
        sb.append(": onAccept was called before attachItem! Make sure that attachItem is called before the services are accepted!");
        throw new IllegalStateException(sb.toString());
    }
}
