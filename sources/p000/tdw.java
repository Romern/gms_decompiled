package p000;

/* renamed from: tdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class tdw extends Exception {

    /* renamed from: a */
    public final boolean f45706a;

    /* renamed from: b */
    public final int f45707b;

    public tdw(int i, boolean z) {
        this.f45707b = i;
        this.f45706a = z;
    }

    public tdw(String str, int i, boolean z) {
        super(str);
        this.f45707b = i;
        this.f45706a = z;
    }

    public tdw(String str, int i, boolean z, Throwable th) {
        super(str, th);
        this.f45707b = i;
        this.f45706a = z;
    }

    public tdw(Throwable th) {
        super(th);
        this.f45706a = false;
        this.f45707b = 57;
    }
}
