package p000;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: adjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjz {

    /* renamed from: a */
    public static final /* synthetic */ int f61965a = 0;

    static {
        new adfs("SecondPhaseIntentFilterFetcher");
    }

    /* renamed from: a */
    public static final void m50680a(Collection collection, Collection collection2, adje adje) {
        if (ceqj.m137858b()) {
            Object[] objArr = {TextUtils.join(",", collection), TextUtils.join(",", collection2)};
            adje.mo33563a(collection, collection2);
            if (!collection.isEmpty()) {
                aeat a = aeat.m51532a(rpr.m34216b());
                int hashCode = collection.hashCode();
                int hashCode2 = collection2.hashCode();
                StringBuilder sb = new StringBuilder(58);
                sb.append("instantapps.ScheduleGetIntentFilters");
                sb.append(hashCode);
                sb.append(hashCode2);
                String sb2 = sb.toString();
                long d = ceqj.f183258a.mo6606a().mo79585d();
                long c = ceqj.f183258a.mo6606a().mo79584c();
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
                aebi.f63099k = sb2;
                aebi.mo34023a(0);
                aebi.mo34004a(d, c + d);
                aebi.f63102n = true;
                aebi.mo34027b(0);
                a.mo33984a(aebi.mo33974b());
            }
        }
    }
}
