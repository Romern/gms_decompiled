package p000;

import com.google.android.gms.audiomodem.DecodedToken;
import java.util.List;

/* renamed from: phg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f39103a;

    /* renamed from: b */
    final /* synthetic */ phh f39104b;

    public phg(phh phh, List list) {
        this.f39104b = phh;
        this.f39103a = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: phj.a(java.lang.String, boolean, boolean):void
     arg types: [java.lang.String, int, int]
     candidates:
      phs.a(int, int, android.content.Intent):void
      phj.a(java.lang.String, boolean, boolean):void */
    public final void run() {
        phj phj = this.f39104b.f39105a;
        if (!phj.f39116e) {
            phj.f39114c.mo23670a("Number of tokens received: %d", Integer.valueOf(this.f39103a.size()));
            List list = this.f39103a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = ((DecodedToken) list.get(i)).f9857a;
                if (bArr != null && bArr.length == 2) {
                    String a = phj.m30329a(bArr);
                    this.f39104b.f39105a.f39114c.mo23856a("Decoded pincode = %s", a);
                    if (!phj.m30330a(a)) {
                        this.f39104b.f39105a.f39114c.mo23675c("Invalid audio token received", new Object[0]);
                    } else {
                        phj phj2 = this.f39104b.f39105a;
                        phj2.f39115d.removeCallbacks(phj2.f39121j);
                        this.f39104b.f39105a.f39119h.mo23108a(bpen.DECODE_SUCCESS);
                        this.f39104b.f39105a.mo23083f();
                        this.f39104b.f39105a.mo23078a(a, false, false);
                        this.f39104b.f39105a.f39114c.mo23670a("Valid audio token received - closing dialog", new Object[0]);
                        this.f39104b.f39105a.mo23084g();
                        return;
                    }
                }
            }
        }
    }
}
