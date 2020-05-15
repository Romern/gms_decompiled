package p000;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aozy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aozy {

    /* renamed from: a */
    public static final aoyh f83961a = aoyh.m69805a("ContactsDataHandler");

    /* renamed from: b */
    public final Map f83962b;

    /* renamed from: c */
    public final Set f83963c;

    /* renamed from: d */
    public Cursor f83964d;

    /* renamed from: e */
    public int f83965e;

    public aozy(Resources resources) {
        HashMap hashMap = new HashMap();
        this.f83962b = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new aozq(resources));
        this.f83962b.put("vnd.android.cursor.item/nickname", new aozr());
        this.f83962b.put("vnd.android.cursor.item/note", new aozs());
        this.f83962b.put("vnd.android.cursor.item/organization", new aozt());
        this.f83962b.put("vnd.android.cursor.item/phone_v2", new aozu(resources));
        this.f83962b.put("vnd.android.cursor.item/postal-address_v2", new aozx(resources));
        this.f83962b.put("vnd.android.cursor.item/name", new aozw());
        HashSet hashSet = new HashSet();
        this.f83963c = hashSet;
        hashSet.add("mimetype");
        for (aozp aozp : this.f83962b.values()) {
            aozp.mo47043a(this.f83963c);
        }
    }
}
