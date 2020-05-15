package p000;

/* renamed from: bfdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfdt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f113512a;

    /* renamed from: b */
    final /* synthetic */ bfia f113513b;

    /* renamed from: c */
    final /* synthetic */ bfdv f113514c;

    public bfdt(bfdv bfdv, String str, bfia bfia) {
        this.f113514c = bfdv;
        this.f113512a = str;
        this.f113513b = bfia;
    }

    public final void run() {
        bfec bfec = this.f113514c.f113517a;
        String str = this.f113512a;
        String bfia = this.f113513b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(bfia).length());
        sb.append("File complete: ");
        sb.append(str);
        sb.append(" summary: ");
        sb.append(bfia);
        sb.toString();
        ((bgpf) bfec).f117181g++;
    }
}
