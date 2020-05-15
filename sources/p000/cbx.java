package p000;

/* renamed from: cbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbx extends cbt {
    /* JADX WARNING: Illegal instructions before constructor call */
    public cbx(Class cls) {
        super(r1.toString());
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Failed to find source encoder for data class: ");
        sb.append(valueOf);
    }
}
