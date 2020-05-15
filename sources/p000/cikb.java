package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikb implements brgm {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190497a;

    /* renamed from: b */
    final /* synthetic */ cikh f190498b;

    public cikb(cikh cikh, CountDownLatch countDownLatch) {
        this.f190498b = cikh;
        this.f190497a = countDownLatch;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        int i = cikh.f190511g;
        try {
            felica.getKeyVersion(13760);
            return false;
        } catch (FelicaException e) {
            if (e.getType() == 11) {
                int type = e.getType();
                StringBuilder sb = new StringBuilder(57);
                sb.append("executeConfirmDeleteCard chip Empty (type = ");
                sb.append(type);
                sb.append(").");
                sb.toString();
                return true;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo69521a(bret bret) {
        int i = cikh.f190511g;
        this.f190498b.f190514c.f190484a = new bres(bret);
        this.f190497a.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        int i = cikh.f190511g;
        this.f190498b.f190514c.f190485b = (Boolean) obj;
        this.f190497a.countDown();
    }
}
