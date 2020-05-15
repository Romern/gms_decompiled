package p000;

/* renamed from: bknn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknn extends Exception {

    /* renamed from: a */
    public final boolean f124947a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public bknn(int i) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(44);
        sb.append("Request failed with status code: ");
        sb.append(i);
        this.f124947a = bkne.m106189a(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bknn(int i, Throwable th) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder(44);
        sb.append("Request failed with status code: ");
        sb.append(i);
        this.f124947a = bkne.m106189a(i);
    }
}
