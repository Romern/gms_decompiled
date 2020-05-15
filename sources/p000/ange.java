package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ange */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ange {

    /* renamed from: a */
    public static final Set f76800a = new HashSet(Arrays.asList("com.google.android.apps.internal.mobdog", "com.google.android.apps.mobileutilities"));

    /* renamed from: b */
    public static final bdyx f76801b;

    /* renamed from: c */
    private static final bdyw f76802c;

    static {
        bdyw bdyw = new bdyw("direct_boot:com.google.android.gms.phenotype");
        f76802c = bdyw;
        f76801b = bdyx.m91609a(bdyw, "__phenotype_server_token", "");
    }

    /* renamed from: a */
    public static boolean m64198a(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(str2, i);
                if (indexOf == -1) {
                    break;
                } else if (!((indexOf == 0 || str.charAt(indexOf - 1) == ',') && (str2.length() + indexOf == str.length() || str.charAt(str2.length() + indexOf) == ','))) {
                    i = indexOf + str2.length() + 1;
                }
            }
            return true;
        }
        return false;
    }
}
