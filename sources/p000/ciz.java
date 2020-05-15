package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: ciz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciz implements cdt {

    /* renamed from: a */
    private final File f6918a;

    /* renamed from: b */
    private final cja f6919b;

    /* renamed from: c */
    private Object f6920c;

    public ciz(File file, cja cja) {
        this.f6918a = file;
        this.f6919b = cja;
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return this.f6919b.mo3934a();
    }

    /* renamed from: b */
    public final void mo3753b() {
        Object obj = this.f6920c;
        if (obj != null) {
            try {
                this.f6919b.mo3936a(obj);
            } catch (IOException e) {
            }
        }
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
            Object a = this.f6919b.mo3935a(this.f6918a);
            this.f6920c = a;
            cds.mo3762a(a);
        } catch (FileNotFoundException e) {
            cds.mo3761a((Exception) e);
        }
    }
}
