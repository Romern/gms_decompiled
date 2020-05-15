package p000;

import android.accounts.Account;
import android.widget.Toast;

/* renamed from: loh */
final /* synthetic */ class loh implements Runnable {

    /* renamed from: a */
    private final lop f26496a;

    public loh(lop lop) {
        this.f26496a = lop;
    }

    public final void run() {
        kdi kdi;
        lop lop = this.f26496a;
        krd v = lop.f26504d.mo14847v();
        Account account = null;
        if (v != null) {
            kdi = v.mo14822a();
        } else {
            kdi = null;
        }
        if (kdi != null) {
            account = kdi.f23888d;
        }
        if (account != null) {
            lop.f26504d.mo14830e().mo15101a(kdi.f23885a);
            lir lir = lop.f26159a;
            String str = account.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("Opted ");
            sb.append(str);
            sb.append(" out of Autofill");
            Toast.makeText(lir, sb.toString(), 1).show();
            return;
        }
        Toast.makeText(lop.f26159a, "Not opted in to Autofill! Navigate to the main settings page.", 1).show();
    }
}
