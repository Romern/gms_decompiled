package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: butf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butf {
    /* renamed from: a */
    public static boolean m120430a(Context context, String str, String str2) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = str;
        clientContext.f30212b = spn.m35897i(context, str);
        return m120431a(sfr.m35174a(context, clientContext), str2);
    }

    /* renamed from: a */
    public static boolean m120431a(sfr sfr, String str) {
        return sfr.mo25481a(str) == 0;
    }
}
