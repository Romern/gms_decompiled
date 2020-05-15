package p000;

/* renamed from: sqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sqs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f44993a;

    /* renamed from: b */
    final /* synthetic */ squ f44994b;

    public sqs(squ squ, String str) {
        this.f44994b = squ;
        this.f44993a = str;
    }

    public final void run() {
        boolean z;
        squ squ = this.f44994b;
        String str = this.f44993a;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        int i = squ.f44997c.f26809h;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (z) {
                    break;
                }
                if (str.equals(((sqt) squ.f44997c.mo15621c(i2)).mo9758k())) {
                    z = true;
                }
                i2++;
            } else if (!z) {
                return;
            }
        }
        squ.mo25987a(false);
    }
}
