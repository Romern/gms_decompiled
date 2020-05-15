package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: lid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lid implements lif {

    /* renamed from: a */
    private final Context f26142a;

    /* renamed from: b */
    private final befa f26143b;

    public lid(Context context, befa befa) {
        this.f26142a = context;
        this.f26143b = befa;
    }

    /* renamed from: a */
    private static Uri m19161a(Context context, lie lie, String str) {
        String a = boan.f132471e.mo68794a(lie.f26144a.getBytes(StandardCharsets.UTF_8));
        String str2 = lie.f26145b;
        Account account = lie.f26146c;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (a != null) {
            sb.append("/");
            sb.append(a);
        }
        sb.append("/");
        sb.append(str);
        befh a2 = befi.m94962a(context);
        a2.mo60662b();
        a2.mo60660a("autofill");
        a2.mo60663b(sb.toString());
        if (account != null) {
            a2.mo60658a(account);
        }
        return a2.mo60657a();
    }

    /* renamed from: b */
    public final InputStream mo15159b(String str, lie lie) {
        return (InputStream) this.f26143b.mo60643a(m19161a(this.f26142a, lie, str), behs.m95063a(), new beer[0]);
    }

    /* renamed from: a */
    public final OutputStream mo15158a(String str, lie lie) {
        return (OutputStream) this.f26143b.mo60643a(m19161a(this.f26142a, lie, str), behw.m95072a(), new beer[0]);
    }
}
