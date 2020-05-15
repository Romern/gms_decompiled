package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* renamed from: wxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxg {

    /* renamed from: a */
    private final Context f51535a;

    /* renamed from: b */
    private final Set f51536b = sqw.m36045b();

    /* renamed from: c */
    private String f51537c;

    /* renamed from: d */
    private final Set f51538d = sqw.m36045b();

    /* renamed from: e */
    private String f51539e;

    public wxg(Context context) {
        new wzh();
        this.f51535a = context;
    }

    /* renamed from: a */
    public static String m42445a(bylr bylr) {
        if ((bylr.f166919a & 128) == 0) {
            return null;
        }
        bymc bymc = bylr.f166927i;
        if (bymc == null) {
            bymc = bymc.f166997e;
        }
        return bymc.f167001c;
    }

    /* renamed from: b */
    public static String m42447b(bylr bylr) {
        if ((bylr.f166919a & 2) == 0) {
            return null;
        }
        byls byls = bylr.f166921c;
        if (byls == null) {
            byls = byls.f166935i;
        }
        return byls.f166944h;
    }

    /* renamed from: a */
    public static String m42446a(boolean z, int i, String str, String str2) {
        Uri.Builder builder;
        if (z && i == 1) {
            builder = Uri.parse(cdtr.f181715a.mo6606a().mo78327z()).buildUpon();
        } else {
            builder = Uri.parse(cdtr.f181715a.mo6606a().mo78295B()).buildUpon();
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("ct", str);
        }
        return builder.toString();
    }

    /* renamed from: a */
    public final boolean mo29532a(ErrorReport errorReport, HelpConfig helpConfig, bqgj bqgj) {
        try {
            File a = wyb.m42456a(this.f51535a, wyb.m42461b(errorReport, this.f51535a));
            try {
                if (mo29533a(errorReport.f31525P, errorReport.f31527R)) {
                    Log.w("gF_HttpHelper", "Dropped report.");
                    a.delete();
                    return true;
                }
                Context context = this.f51535a;
                sdo.m34973b("Must be called from a worker thread.");
                return wwz.m42432a(wwz.m42431a(context, helpConfig, bqgj, m42446a(errorReport.f31514E, errorReport.f31536a.type, errorReport.f31525P, errorReport.f31527R), wxf.m42444a(a), true));
            } catch (IOException e) {
                Log.w("gF_HttpHelper", e.getMessage() == null ? "Could not send report, IOException" : e.getMessage());
                return false;
            } finally {
                a.delete();
            }
        } catch (IOException e2) {
            Log.w("gF_HttpHelper", e2.getMessage() == null ? "Could not write report, IOException" : e2.getMessage());
            return false;
        } catch (wxv e3) {
            Log.w("gF_HttpHelper", e3.getMessage() == null ? "Could not write report, report packageName is null" : e3.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo29533a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String c = cdtr.f181715a.mo6606a().mo78304c();
            if (this.f51536b.isEmpty() || !TextUtils.equals(this.f51537c, c)) {
                this.f51536b.clear();
                Collections.addAll(this.f51536b, aayh.m47256a(c));
                this.f51537c = c;
            }
            if (this.f51536b.contains(str)) {
                String valueOf = String.valueOf(str);
                Log.i("gF_HttpHelper", valueOf.length() == 0 ? new String("Category tag blacklisted: ") : "Category tag blacklisted: ".concat(valueOf));
                return true;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String d = cdtr.f181715a.mo6606a().mo78305d();
        if (this.f51538d.isEmpty() || !TextUtils.equals(this.f51539e, d)) {
            this.f51538d.clear();
            Collections.addAll(this.f51538d, aayh.m47256a(d));
            this.f51539e = d;
        }
        if (!this.f51538d.contains(str2)) {
            return false;
        }
        String valueOf2 = String.valueOf(str2);
        Log.i("gF_HttpHelper", valueOf2.length() == 0 ? new String("Submitting package name blacklisted: ") : "Submitting package name blacklisted: ".concat(valueOf2));
        return true;
    }
}
