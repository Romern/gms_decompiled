package p000;

import android.content.Context;

/* renamed from: lww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lww {

    /* renamed from: a */
    public final lwx f33131a;

    private lww(lwx lwx) {
        this.f33131a = lwx;
    }

    /* renamed from: a */
    public static lww m24581a(Context context) {
        lwx lwx = new lwx(context);
        lwx.setWriteAheadLoggingEnabled(true);
        return new lww(lwx);
    }

    /* renamed from: b */
    public final void mo19715b() {
        if (ccno.f179554a.mo6606a().mo76471c()) {
            this.f33131a.close();
        }
    }

    /* renamed from: a */
    public final lxa mo19714a() {
        return new lxa(this.f33131a);
    }
}
