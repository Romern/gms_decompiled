package p000;

import android.content.AbstractThreadedSyncAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: slp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slp {
    /* renamed from: a */
    public static String m35590a(AbstractThreadedSyncAdapter abstractThreadedSyncAdapter, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(abstractThreadedSyncAdapter))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static String m35591a(Context context, Intent intent) {
        return String.valueOf(((long) System.identityHashCode(intent)) | (((long) System.identityHashCode(context)) << 32));
    }

    /* renamed from: a */
    public static String m35592a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static List m35593a(List list) {
        if (list == null || list.size() != 1 || !"com.google.android.gms".equals(list.get(0))) {
            return list;
        }
        return null;
    }
}
