package p000;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: amus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amus {

    /* renamed from: a */
    private final sfr f75973a;

    /* renamed from: b */
    private final Context f75974b;

    public amus(Context context, String str, int i) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = str;
        clientContext.f30212b = i;
        sfr a = sfr.m35174a(context, clientContext);
        this.f75974b = context;
        this.f75973a = a;
    }

    /* renamed from: a */
    public static boolean m63325a(Context context) {
        if (cgbe.m144175d()) {
            return amur.m63322a(context).mo41356a();
        }
        return m63326a(context, "android.permission.READ_CONTACTS");
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m63326a(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = context.getPackageName();
        clientContext.f30212b = Process.myUid();
        return sfr.m35174a(context, clientContext).mo25481a(str) == 0;
    }

    /* renamed from: a */
    public final boolean mo41358a() {
        int i = Build.VERSION.SDK_INT;
        return this.f75973a.mo25481a("android.permission.READ_CONTACTS") == 0 && m63325a(this.f75974b);
    }
}
