package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: befh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befh {

    /* renamed from: a */
    private final Context f111488a;

    /* renamed from: b */
    private final String f111489b;

    /* renamed from: c */
    private String f111490c = "files";

    /* renamed from: d */
    private String f111491d = "common";

    /* renamed from: e */
    private Account f111492e = befi.f111496b;

    /* renamed from: f */
    private String f111493f = "";

    /* renamed from: g */
    private final bngs f111494g = bngx.m109377j();

    public befh(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        behg.m95044a(z, "Context cannot be null", new Object[0]);
        this.f111488a = context;
        this.f111489b = context.getPackageName();
    }

    /* renamed from: c */
    private final void m94953c(String str) {
        behg.m95044a(befi.f111498d.contains(str), "The only supported locations are %s: %s", befi.f111498d, str);
        this.f111490c = str;
    }

    /* renamed from: a */
    public final Uri mo60657a() {
        String format = String.format("/%s/%s/%s/%s", this.f111490c, this.f111491d, befd.m94936a(this.f111492e), this.f111493f);
        return new Uri.Builder().scheme("android").authority(this.f111489b).path(format).encodedFragment(behf.m95043a(this.f111494g.mo67664a())).build();
    }

    /* renamed from: b */
    public final void mo60662b() {
        m94953c("files");
    }

    /* renamed from: b */
    public final void mo60663b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = befi.f111495a;
        this.f111493f = str;
    }

    /* renamed from: c */
    public final void mo60664c() {
        m94953c("managed");
    }

    /* renamed from: a */
    public final void mo60658a(Account account) {
        befd.m94936a(account);
        this.f111492e = account;
    }

    /* renamed from: a */
    public final void mo60659a(File file) {
        mo60661a(file.getAbsolutePath(), null);
    }

    /* renamed from: a */
    public final void mo60660a(String str) {
        behg.m95044a(befi.f111495a.matcher(str).matches(), "Module must be non-empty and [a-z]: %s", str);
        Object[] objArr = {str};
        behg.m95044a(!befi.f111497c.contains(str), "Module name is reserved and cannot be used: %s", objArr);
        this.f111491d = str;
    }

    /* renamed from: a */
    public final void mo60661a(String str, befb befb) {
        String str2;
        File a = befg.m94951a(this.f111488a);
        String absolutePath = a.getAbsolutePath();
        String absolutePath2 = this.f111488a.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(a, "managed").getAbsolutePath();
        String str3 = null;
        if (this.f111488a.getExternalFilesDir(null) != null) {
            str3 = this.f111488a.getExternalFilesDir(null).getAbsolutePath();
        }
        int i = Build.VERSION.SDK_INT;
        File b = befg.m94952b(this.f111488a);
        String absolutePath4 = new File(b, "files").getAbsolutePath();
        String absolutePath5 = new File(b, "cache").getAbsolutePath();
        if (str.startsWith(absolutePath3)) {
            m94953c("managed");
            str2 = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            m94953c("files");
            str2 = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            m94953c("cache");
            str2 = str.substring(absolutePath2.length());
        } else if (str3 != null && str.startsWith(str3)) {
            m94953c("external");
            str2 = str.substring(str3.length());
        } else if (absolutePath4 != null && str.startsWith(absolutePath4)) {
            m94953c("directboot-files");
            str2 = str.substring(absolutePath4.length());
        } else if (absolutePath5 != null && str.startsWith(absolutePath5)) {
            m94953c("directboot-cache");
            str2 = str.substring(absolutePath5.length());
        } else {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Path must be in app-private files dir or external files dir: ") : "Path must be in app-private files dir or external files dir: ".concat(valueOf));
        }
        List asList = Arrays.asList(str2.split(File.separator));
        boolean z = true;
        behg.m95044a(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        mo60660a((String) asList.get(1));
        String str4 = (String) asList.get(2);
        if (!"managed".equals(this.f111490c) || befd.m94938b(str4)) {
            mo60658a(befd.m94935a(str4));
        } else {
            try {
                int parseInt = Integer.parseInt(str4);
                if (befb == null) {
                    z = false;
                }
                behg.m95044a(z, "AccountManager cannot be null", new Object[0]);
                try {
                    mo60658a((Account) bqfy.m112768a(bqdx.m112674a(((befp) befb).f111511a.mo60776a(), new befo(parseInt), bqfb.INSTANCE), begt.class));
                } catch (begt e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        mo60663b(str2.substring(this.f111491d.length() + str4.length() + 2));
    }
}
