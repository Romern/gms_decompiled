package p000;

import android.os.Message;

/* renamed from: bgtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtc extends bgtf {

    /* renamed from: a */
    private int f117475a = 0;

    /* renamed from: b */
    private final bgtb f117476b;

    static {
        srn.m36125a("QStage");
    }

    public bgtc(String str, bgtb bgtb) {
        super(str);
        this.f117476b = bgtb;
    }

    /* renamed from: a */
    public final void mo63111a() {
        this.f117476b.mo63068b();
        this.f117476b.f117474g.mo63137a();
    }

    /* renamed from: b */
    public final void mo63113b() {
        this.f117476b.mo63069c();
        this.f117475a = 0;
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        int i = message.what;
        bgtb bgtb = this.f117476b;
        if (i != bgtb.f117474g.f117449a) {
            return false;
        }
        int a = bgtb.mo63067a();
        if (a != this.f117475a) {
            if (a == 1) {
                this.f117482h.mo63154b();
            } else if (a == 2) {
                this.f117482h.mo63153a(this);
            } else if (a == 3) {
                mo63145e();
            }
            this.f117475a = a;
        }
        return true;
    }
}
