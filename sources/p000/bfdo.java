package p000;

/* renamed from: bfdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfdo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f113494a;

    /* renamed from: b */
    final /* synthetic */ bfdw f113495b;

    public bfdo(bfdw bfdw, String str) {
        this.f113495b = bfdw;
        this.f113494a = str;
    }

    public final void run() {
        bfec bfec = this.f113495b.f113528f;
        String valueOf = String.valueOf(this.f113494a);
        if (valueOf.length() == 0) {
            new String("Failed to batch upload: ");
        } else {
            "Failed to batch upload: ".concat(valueOf);
        }
        bgpf bgpf = (bgpf) bfec;
        bgpf.f117182h++;
        bgpf.mo63065b();
    }
}
