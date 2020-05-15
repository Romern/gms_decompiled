package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ampi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampi {

    /* renamed from: a */
    public static final String[] f75661a = {"https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.circles.write", "https://www.googleapis.com/auth/plus.media.upload", "https://www.googleapis.com/auth/plus.pages.manage", "https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.profiles.read", "https://www.googleapis.com/auth/plus.profiles.write", "https://www.googleapis.com/auth/plus.stream.read", "https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/plus.applications.manage", "https://www.googleapis.com/auth/plus.settings"};

    /* renamed from: a */
    public static ClientContext m63122a(Context context, Account account) {
        ClientContext clientContext;
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82995bF()).booleanValue()) {
            int myUid = Process.myUid();
            String str = account.name;
            String str2 = account.name;
            String packageName = context.getPackageName();
            clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        } else {
            clientContext = new ClientContext();
            clientContext.f30212b = Process.myUid();
            clientContext.f30214d = account;
            clientContext.f30213c = account;
            clientContext.f30215e = context.getPackageName();
            clientContext.f30216f = context.getPackageName();
        }
        amig.m62939a();
        String[] a = m63124a(cfvk.f185780a.mo6606a().mo82989b());
        if (a.length > 0) {
            clientContext.mo17799a(a);
        }
        clientContext.mo17798a("social_client_app_id", "80");
        return clientContext;
    }

    @Deprecated
    /* renamed from: a */
    public static ClientContext m63123a(Context context, String str, String str2) {
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        clientContext.mo17799a(f75661a);
        clientContext.mo17798a("social_client_app_id", str2);
        return clientContext;
    }

    /* renamed from: a */
    public static String[] m63124a(String str) {
        return (String[]) bnjd.m109584a(bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) str), String.class);
    }
}
