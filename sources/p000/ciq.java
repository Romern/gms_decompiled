package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ciq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciq implements cdt {

    /* renamed from: a */
    private final File f6913a;

    public ciq(File file) {
        this.f6913a = file;
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return ByteBuffer.class;
    }

    /* renamed from: b */
    public final void mo3753b() {
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        try {
            cds.mo3762a(cqp.m7363a(this.f6913a));
        } catch (IOException e) {
            cds.mo3761a((Exception) e);
        }
    }
}
