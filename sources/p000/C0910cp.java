package p000;

import java.util.concurrent.Executor;

/* renamed from: cp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0910cp {

    /* renamed from: a */
    public final C0077cf f11756a;

    /* renamed from: b */
    public final C0913cs f11757b;

    /* renamed from: c */
    public Executor f11758c;

    /* renamed from: d */
    public Executor f11759d;

    public C0910cp(C0077cf cfVar, C0913cs csVar) {
        if (cfVar == null) {
            throw new IllegalArgumentException("DataSource may not be null");
        } else if (csVar != null) {
            this.f11756a = cfVar;
            this.f11757b = csVar;
        } else {
            throw new IllegalArgumentException("Config may not be null");
        }
    }
}
