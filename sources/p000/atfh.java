package p000;

/* renamed from: atfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfh extends Exception {

    /* renamed from: a */
    public final btnf f90231a;

    public atfh(btnf btnf) {
        bmxy.m108581a(btnf);
        this.f90231a = btnf;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f90231a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("TapAndPayApiException: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
