package p000;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: acmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acmi {

    /* renamed from: a */
    public final Map f60152a;

    /* renamed from: b */
    public final Set f60153b;

    /* renamed from: c */
    public Cursor f60154c;

    /* renamed from: d */
    public int f60155d;

    public acmi(Resources resources) {
        HashMap hashMap = new HashMap();
        this.f60152a = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new acma(resources));
        this.f60152a.put("vnd.android.cursor.item/nickname", new acmb());
        this.f60152a.put("vnd.android.cursor.item/note", new acmc());
        this.f60152a.put("vnd.android.cursor.item/organization", new acmd());
        this.f60152a.put("vnd.android.cursor.item/phone_v2", new acme(resources));
        this.f60152a.put("vnd.android.cursor.item/postal-address_v2", new acmh(resources));
        this.f60152a.put("vnd.android.cursor.item/name", new acmg());
        HashSet hashSet = new HashSet();
        this.f60153b = hashSet;
        hashSet.add("mimetype");
        for (aclz aclz : this.f60152a.values()) {
            aclz.mo32879a(this.f60153b);
        }
    }
}
