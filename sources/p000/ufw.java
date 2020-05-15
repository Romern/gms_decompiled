package p000;

/* renamed from: ufw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufw extends Exception {

    /* renamed from: a */
    public final int f47485a;

    /* renamed from: b */
    public final boolean f47486b;

    public ufw(int i) {
        this.f47485a = i;
        this.f47486b = true;
    }

    public ufw(Exception exc, boolean z) {
        super(exc);
        this.f47485a = -1;
        this.f47486b = z;
    }

    public ufw(String str, boolean z) {
        super(str);
        this.f47485a = -1;
        this.f47486b = z;
    }
}
