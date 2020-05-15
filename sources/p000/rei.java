package p000;

import android.content.Context;
import com.google.android.gms.net.GmsCoreCronetProvider;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: rei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rei implements reh {

    /* renamed from: a */
    private final Context f42801a;

    public rei(Context context) {
        this.f42801a = context;
    }

    /* renamed from: a */
    public final HttpURLConnection mo24556a(String str) {
        return (HttpURLConnection) new GmsCoreCronetProvider(this.f42801a).createBuilder().build().openConnection(new URL(str));
    }
}
