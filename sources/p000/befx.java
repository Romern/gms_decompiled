package p000;

import java.io.OutputStream;
import java.util.List;

/* renamed from: befx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befx implements beer {

    /* renamed from: a */
    private OutputStream f111523a;

    /* renamed from: b */
    private begx f111524b;

    /* renamed from: a */
    public final void mo60626a() {
        mo60681b();
    }

    /* renamed from: a */
    public final void mo60627a(List list) {
    }

    /* renamed from: b */
    public final void mo60681b() {
        if (this.f111524b != null) {
            this.f111523a.flush();
            this.f111524b.mo36257a();
            return;
        }
        throw new begy("Cannot sync underlying stream");
    }

    /* renamed from: b */
    public final void mo60628b(List list) {
        OutputStream outputStream = (OutputStream) bnjd.m109595d(list);
        if (outputStream instanceof begx) {
            this.f111524b = (begx) outputStream;
            this.f111523a = (OutputStream) list.iterator().next();
        }
    }
}
