package p000;

import android.content.Context;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: rwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rwt extends qdi {
    public rwt(qdu qdu) {
        super(qdu);
    }

    /* renamed from: a */
    public final String mo23923a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(23);
        sb.append("id-");
        sb.append(currentTimeMillis);
        return sb.toString();
    }

    /* renamed from: a */
    public final HttpURLConnection mo23924a(String str) {
        return new cauh(new cauf()).mo74899a(new URL(str));
    }
}
