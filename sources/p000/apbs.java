package p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: apbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbs {
    /* renamed from: a */
    public static ClientContext m70036a(Context context, String str) {
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        if (cgjy.f187097a.mo6606a().mo83960x()) {
            clientContext.mo17799a((String[]) bnjd.m109584a(bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) cgjy.f187097a.mo6606a().mo83938b()), String.class));
        } else {
            clientContext.mo17806d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
        }
        clientContext.mo17798a("social_client_app_id", "80");
        return clientContext;
    }
}
