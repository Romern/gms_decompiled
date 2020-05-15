package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: acou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acou implements Callable {

    /* renamed from: a */
    private final acot f60376a;

    public acou(SharedPreferences sharedPreferences, acne acne, String str, String[] strArr) {
        this.f60376a = new acot(acne, sharedPreferences, str, strArr);
    }

    /* renamed from: a */
    public final void mo32967a() {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean booleanValue = this.f60376a.call().booleanValue();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (booleanValue) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("updated contacts [took ");
            sb.append(elapsedRealtime2);
            sb.append(" ms]");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
        sb2.append("UpdateCorporaTask done [took ");
        sb2.append(elapsedRealtime2);
        sb2.append(" ms] ");
        sb2.append(str);
        acnv.m49541a(sb2.toString());
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo32967a();
        return null;
    }
}
