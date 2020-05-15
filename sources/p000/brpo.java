package p000;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: brpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface brpo {

    /* renamed from: a */
    public static final Logger f143138a = new Logger("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: a */
    Uri.Builder mo69768a(Intent intent, String str, String str2);

    /* renamed from: a */
    String mo69769a();

    /* renamed from: a */
    HttpURLConnection mo69770a(URL url);

    /* renamed from: a */
    void mo69771a(Uri uri, String str);

    /* renamed from: a */
    void mo69772a(String str, Status status);
}
