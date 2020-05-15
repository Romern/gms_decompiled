package p000;

import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import java.util.List;

/* renamed from: amdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdo implements amuw {

    /* renamed from: i */
    private static final shc f74752i;

    /* renamed from: a */
    private final aoiq f74753a;

    /* renamed from: b */
    private final amph f74754b;

    /* renamed from: c */
    private final List f74755c;

    /* renamed from: d */
    private final String f74756d;

    /* renamed from: e */
    private final int f74757e;

    /* renamed from: f */
    private final String f74758f;

    /* renamed from: g */
    private final String f74759g;

    /* renamed from: h */
    private final Boolean f74760h;

    static {
        shc shc = new shc();
        shc.mo25530a("items(etag,id,names,nicknames,images,urls,sortKeys,taglines,emails,phoneNumbers,addresses,metadata,memberships,legacyFields/mobileOwnerId)");
        shc.mo25530a("nextPageToken");
        shc.mo25530a("nextSyncToken");
        f74752i = shc;
    }

    public amdo(aoiq aoiq, amph amph, List list, String str, int i, String str2, String str3, Boolean bool) {
        this.f74753a = aoiq;
        this.f74754b = amph;
        this.f74755c = list;
        this.f74756d = str;
        this.f74757e = i;
        this.f74758f = str2;
        this.f74759g = str3;
        this.f74760h = bool;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo41126a(String str) {
        return this.f74753a.mo42823a(this.f74754b.f75659a, "me", "all", this.f74756d, this.f74760h, this.f74755c, true, Integer.valueOf(this.f74757e), this.f74754b.f75660b, this.f74758f, str, this.f74759g, f74752i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo41127a(Object obj) {
        return ((PeopleList) obj).f83135d;
    }
}
