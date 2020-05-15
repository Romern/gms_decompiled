package p000;

import java.util.Map;

/* renamed from: avtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtf extends avti {

    /* renamed from: c */
    private static final sek f93883c = avpq.m79021h("EntrySetKey");

    public avtf(String str) {
        super(str, avte.m79305a(new avtc[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51590a(String str) {
        try {
            return avte.m79304a(str);
        } catch (IllegalArgumentException e) {
            f93883c.mo25416d("Unable to decode string: %s, return empty entry set as default value.", str);
            return avte.m79305a(new avtc[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51591a(Object obj) {
        StringBuilder sb = new StringBuilder();
        bnrd a = ((avte) obj).f93882a.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(sqd.m35968b(((String) entry.getKey()).getBytes()));
            sb.append(':');
            sb.append(sqd.m35968b(((String) entry.getValue()).getBytes()));
        }
        return sb.toString();
    }
}
