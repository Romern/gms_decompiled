package p000;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: amqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqt {
    /* renamed from: a */
    public static ClientContext m63194a(Context context, String str) {
        String[] strArr;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83260Q()).booleanValue()) {
            amig.m62939a();
            String aa = cgbe.f186279a.mo6606a().mo83297aa();
            if (!TextUtils.isEmpty(aa)) {
                strArr = (String[]) bnjd.m109584a(bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) aa), String.class);
            } else {
                strArr = new String[0];
            }
            if (strArr.length > 0) {
                clientContext.mo17799a(strArr);
            }
        } else {
            clientContext.mo17806d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
        }
        clientContext.mo17798a("social_client_app_id", "80");
        return clientContext;
    }
}
