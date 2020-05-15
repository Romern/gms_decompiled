package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Set;

/* renamed from: uoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uoo {

    /* renamed from: a */
    public static final Set f48417a = new C1225nr();

    /* renamed from: b */
    private final uon f48418b = new uon(cdqm.f181559a.mo6606a().mo78181d(), cdqm.f181559a.mo6606a().mo78188k(), true, false, true);

    /* renamed from: c */
    private final uon f48419c = new uon(cdqm.f181559a.mo6606a().mo78178a(), cdqm.f181559a.mo6606a().mo78186i(), true, true, true);

    /* renamed from: d */
    private final uon f48420d = new uon(cdqm.f181559a.mo6606a().mo78179b(), cdqm.f181559a.mo6606a().mo78187j(), false, false, false);

    /* renamed from: e */
    private final uon f48421e = new uon(cdqm.f181559a.mo6606a().mo78183f(), cdqm.f181559a.mo6606a().mo78190m(), false, false, true);

    /* renamed from: f */
    private final uon f48422f = new uon(cdqm.f181559a.mo6606a().mo78182e(), cdqm.f181559a.mo6606a().mo78189l(), true, true, false);

    /* renamed from: a */
    public static String m39099a(String str, Context context) {
        try {
            return svr.m36484b(context).mo26177b(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final uon mo27774a(String str) {
        char c;
        switch (str.hashCode()) {
            case -543674259:
                if (str.equals("com.google.android.gm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1111774:
                if (str.equals("com.google.android.apps.classroom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 40819247:
                if (str.equals("com.google.android.apps.plus")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 578428293:
                if (str.equals("com.google.android.calendar")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1515161932:
                if (str.equals("com.google.android.keep")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return this.f48418b;
        }
        if (c == 1) {
            return this.f48419c;
        }
        if (c == 2) {
            return this.f48420d;
        }
        if (c == 3) {
            return this.f48421e;
        }
        if (c != 4) {
            return null;
        }
        return this.f48422f;
    }
}
