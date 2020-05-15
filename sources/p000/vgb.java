package p000;

import android.database.DatabaseUtils;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgb {

    /* renamed from: a */
    public static final Pattern f49216a = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");

    /* renamed from: a */
    public static uog m40377a(List list) {
        sdo.m34959a(list);
        sdo.m34970a(!list.isEmpty());
        StringBuilder sb = new StringBuilder();
        sb.append(ujr.RESOURCE_ID.f47814c.mo27700a());
        sb.append(" IN (");
        DatabaseUtils.appendEscapedSQLString(sb, (String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(",");
            DatabaseUtils.appendEscapedSQLString(sb, (String) list.get(i));
        }
        sb.append(')');
        return uoh.m39060a(sb.toString());
    }
}
