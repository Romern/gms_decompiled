package p000;

import android.content.Context;
import android.provider.Settings;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bjbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbq {

    /* renamed from: a */
    private static final bjbu f122485a = new bjbu("LogsUploader");

    /* renamed from: b */
    private final Context f122486b;

    /* renamed from: c */
    private final String f122487c;

    public bjbq(Context context, String str) {
        this.f122486b = context;
        this.f122487c = str;
    }

    /* renamed from: a */
    public static boolean m103166a(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) == 1;
    }

    /* renamed from: a */
    public final boolean mo64978a(String str) {
        File file;
        List<byte[]> list;
        String str2;
        if (!m103166a(this.f122486b)) {
            f122485a.mo64983b("User setup isn't completed yet.");
            return false;
        }
        bjbp a = bjbp.m103161a(this.f122486b);
        if (new bjbl(this.f122486b).mo64973a()) {
            if (str != null) {
                file = new File(a.f122482c, str);
                bjbp.m103163a(file);
            } else {
                file = a.f122482c;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || (r3 = listFiles.length) == 0) {
                bjbp.f122479a.mo64981a("No events available for subdirectory");
                list = Collections.emptyList();
            } else {
                list = new ArrayList();
                for (File file2 : listFiles) {
                    byte[] a2 = bjbk.m103157a(file2);
                    if (a2 != null) {
                        list.add(a2);
                    }
                }
            }
            if (list != null && !list.isEmpty()) {
                bjbu bjbu = f122485a;
                int size = list.size();
                String str3 = "root";
                if (str == null) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
                StringBuilder sb = new StringBuilder(str2.length() + 57);
                sb.append("Publishing ");
                sb.append(size);
                sb.append(" logs under ");
                sb.append(str2);
                sb.append(" directory to clearcut.");
                bjbu.mo64981a(sb.toString());
                qws qws = new qws(this.f122486b, this.f122487c, null);
                for (byte[] bArr : list) {
                    if (bArr != null) {
                        qws.mo24335a(bArr).mo24327b();
                    }
                }
                bjbu bjbu2 = f122485a;
                if (str != null) {
                    str3 = str;
                }
                StringBuilder sb2 = new StringBuilder(str3.length() + 31);
                sb2.append("Logs of ");
                sb2.append(str3);
                sb2.append(" published and cleared.");
                bjbu2.mo64981a(sb2.toString());
                a.mo64977a(str);
                return true;
            }
            f122485a.mo64981a("No persisted metrics found.");
            return false;
        }
        f122485a.mo64981a("User did not optin for usage reporting.");
        bjbk.m103158b(a.f122482c);
        return false;
    }
}
