package p000;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: alpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpy {

    /* renamed from: a */
    public final Map f74044a;

    /* renamed from: b */
    public final Set f74045b;

    /* renamed from: c */
    public Cursor f74046c;

    /* renamed from: d */
    public int f74047d;

    public alpy(Resources resources) {
        HashMap hashMap = new HashMap();
        this.f74044a = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new alpq(resources));
        this.f74044a.put("vnd.android.cursor.item/nickname", new alpr());
        this.f74044a.put("vnd.android.cursor.item/note", new alps());
        this.f74044a.put("vnd.android.cursor.item/organization", new alpt());
        this.f74044a.put("vnd.android.cursor.item/phone_v2", new alpu(resources));
        this.f74044a.put("vnd.android.cursor.item/postal-address_v2", new alpx(resources));
        this.f74044a.put("vnd.android.cursor.item/name", new alpw());
        HashSet hashSet = new HashSet();
        this.f74045b = hashSet;
        hashSet.add("mimetype");
        for (alpp alpp : this.f74044a.values()) {
            alpp.mo40635a(this.f74045b);
        }
    }
}
