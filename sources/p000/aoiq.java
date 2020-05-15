package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import java.util.Formatter;
import java.util.List;

/* renamed from: aoiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoiq extends shd {

    /* renamed from: a */
    public final shj f78352a;

    public aoiq(shj shj) {
        this.f78352a = shj;
    }

    /* renamed from: a */
    public final PeopleList mo42823a(ClientContext clientContext, String str, String str2, String str3, Boolean bool, List list, Boolean bool2, Integer num, String str4, String str5, String str6, String str7, shc shc) {
        List list2 = list;
        shc shc2 = shc;
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s/people/%2$s", shd.m35267a(str), shd.m35267a(str2));
        if (shc2 != null) {
            shc2.mo25531a(sb);
        }
        if (str3 != null) {
            shd.m35269a(sb, "customResponseMaskingType", shd.m35267a(str3));
        }
        if (bool != null) {
            shd.m35269a(sb, "delayFullSync", String.valueOf(bool));
        }
        if (list2 != null) {
            shd.m35269a(sb, "includeAffinity", TextUtils.join("&includeAffinity=", list));
        }
        shd.m35269a(sb, "includeOthers", String.valueOf(bool2));
        shd.m35269a(sb, "maxResults", String.valueOf(num));
        if (str4 != null) {
            shd.m35269a(sb, "onBehalfOf", shd.m35267a(str4));
        }
        if (str5 != null) {
            shd.m35269a(sb, "orderBy", shd.m35267a(str5));
        }
        if (str6 != null) {
            shd.m35269a(sb, "pageToken", shd.m35267a(str6));
        }
        if (str7 != null) {
            shd.m35269a(sb, "syncToken", shd.m35267a(str7));
        }
        return (PeopleList) this.f78352a.mo25536a(clientContext, 0, sb.toString(), (Object) null, PeopleList.class);
    }
}
