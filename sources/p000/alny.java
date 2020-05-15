package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: alny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alny {

    /* renamed from: a */
    static final bngx f73886a;

    /* renamed from: b */
    private static final bngx f73887b;

    /* renamed from: c */
    private static final String f73888c = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", "mq", "item_id", "item_id", "ac_email_exact_index_view", "owner_id", "value", "value");

    /* renamed from: d */
    private static final String f73889d = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", "mq", "item_id", "item_id", "ac_email_normalized_index_view", "owner_id", "value", "value");

    /* renamed from: e */
    private static final String f73890e;

    /* renamed from: f */
    private static final String f73891f;

    /* renamed from: g */
    private static final String f73892g = String.format(" AND (%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s=?)))", "mq", "item_id", "item_id", "ac_email_exact_index_view", "owner_id", "value");

    static {
        bngx a = bngx.m109367a("v2_id", "container_type", "profile_type", "gaia_id", "contact_id", "has_cp2_avatar", "display_name", "compressed_avatar_url", "person_affinity1", "person_affinity2", "person_affinity3", "person_affinity4", "person_affinity5", "person_logging_id1", "person_logging_id2", "person_logging_id3", "person_logging_id4", "person_logging_id5", "item_type", "value", "value2", "value_type", "custom_label", "item_affinity1", "item_affinity2", "item_affinity3", "item_affinity4", "item_affinity5", "item_logging_id1", "item_logging_id2", "item_logging_id3", "item_logging_id4", "item_logging_id5", "item_certificate_expiration_millis", "item_certificate_status");
        f73887b = a;
        ArrayList arrayList = new ArrayList(a.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) a.get(i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
            sb.append("mq.");
            sb.append(str);
            arrayList.add(sb.toString());
        }
        f73886a = bngx.m109368a((Collection) arrayList);
        String format = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", "mq", "item_id", "item_id", "ac_name_search_index_view", "owner_id", "value", "value");
        f73890e = format;
        f73891f = String.format("(%s) OR (%s) OR (%s)", f73888c, f73889d, format);
    }

    /* renamed from: a */
    public static String m61410a(String str, int i, String[] strArr, List list, int i2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        amig.m62939a();
        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83434de()).booleanValue()) {
            str2 = "ac_main_query_view";
        } else {
            str2 = "ac_main_query_view_legacy";
        }
        sb.append("SELECT ");
        sb.append(TextUtils.join(",", f73886a));
        sb.append(" FROM ");
        sb.append(str2);
        sb.append(" AS mq WHERE (mq.owner_id=?)");
        list.add(str);
        if (i == 0) {
            for (String str3 : strArr) {
                sb.append(" AND (");
                list.add(str);
                list.add(str3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append(65535);
                list.add(sb2.toString());
                String c = altv.m61851c(str3);
                list.add(str);
                list.add(c);
                StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 1);
                sb3.append(c);
                sb3.append(65535);
                list.add(sb3.toString());
                list.add(str);
                list.add(c);
                StringBuilder sb4 = new StringBuilder(String.valueOf(c).length() + 1);
                sb4.append(c);
                sb4.append(65535);
                list.add(sb4.toString());
                sb.append(f73891f);
                sb.append(")");
            }
        } else if (i != 1) {
            sdo.m34970a(false);
        } else {
            if (strArr.length > 1) {
                Log.w("LoadFromAutocompleteSql", "Multiple tokens for EMAIL_EXACT, using only first token.");
            }
            String str4 = strArr[0];
            sb.append(f73892g);
            list.add(str);
            list.add(str4);
        }
        amig.m62939a();
        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83276aF()).booleanValue()) {
            sb.append(" ORDER BY mq.item_affinity1 DESC,mq.person_affinity1 DESC,mq.display_name,mq.container_type,mq.item_id");
        } else {
            bngs j = bngx.m109377j();
            amig.m62939a();
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83278aH()).booleanValue()) {
                j.mo67668c("mq.item_affinity1 DESC");
            }
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83279aI()).booleanValue()) {
                j.mo67668c("mq.person_affinity1 DESC");
            }
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83277aG()).booleanValue()) {
                j.mo67668c("mq.display_name");
            }
            sb.append(" ORDER BY ");
            sb.append(TextUtils.join(",", j.mo67664a()));
        }
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83274aD()).booleanValue() && i2 >= 0) {
            sb.append(" LIMIT ");
            sb.append(i2 * Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83275aE()).intValue());
        }
        sb.append(";");
        return sb.toString();
    }
}
