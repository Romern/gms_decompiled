package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: shv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shv {

    /* renamed from: a */
    public static volatile shv f44506a;

    /* renamed from: a */
    public static final chqp m35322a(Context context, chqp chqp, String str, String str2, chtr chtr, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new chvt(context, str, z));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new chvl(str2));
        }
        if (chtr != null) {
            arrayList.add(ciiu.m150402a(chtr));
        }
        return !arrayList.isEmpty() ? chqx.m149438a(chqp, arrayList) : chqp;
    }

    /* renamed from: a */
    public static final Object m35323a(chqp chqp, chtv chtv, Object obj, chqo chqo) {
        chqs a;
        try {
            a = chqp.mo70053a(chtv, chqo);
            sht sht = new sht();
            a.mo56351a(sht, new chtr());
            a.mo70029a(2);
            a.mo70030a(obj);
            a.mo70032b();
            sht.f44503c.await();
            if (sht.f44501a.mo85689a()) {
                return sht.f44502b;
            }
            throw sht.f44501a.mo85691b();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (Throwable th) {
            a.mo70031a("send failed", th);
            throw th;
        }
    }
}
