package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: apaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apaq implements apac {

    /* renamed from: a */
    private final ContentResolver f84046a;

    /* renamed from: b */
    private final List f84047b;

    /* renamed from: c */
    private final aozy f84048c;

    /* renamed from: d */
    private final String[] f84049d;

    /* renamed from: e */
    private final String f84050e;

    /* renamed from: f */
    private apac f84051f;

    /* renamed from: g */
    private boolean f84052g;

    /* renamed from: h */
    private int f84053h;

    /* renamed from: i */
    private int f84054i = 0;

    public apaq(ContentResolver contentResolver, Resources resources, List list) {
        this.f84046a = contentResolver;
        this.f84047b = list;
        this.f84048c = new aozy(resources);
        this.f84051f = new apax();
        Set set = this.f84048c.f83963c;
        set.add("contact_id");
        set.add("lookup");
        set.add("photo_thumb_uri");
        set.add("display_name");
        set.add("phonetic_name");
        set.add("times_contacted");
        set.add("last_time_contacted");
        set.add("raw_contact_id");
        this.f84049d = (String[]) set.toArray(new String[0]);
        this.f84050e = "contact_id,is_super_primary DESC,is_primary DESC,raw_contact_id";
        this.f84052g = true;
    }

    /* renamed from: c */
    private final void m69970c() {
        Cursor cursor;
        if (!this.f84051f.hasNext() && this.f84053h < this.f84047b.size()) {
            aoyh aoyh = apay.f84079a;
            this.f84051f.mo47049a();
            int min = Math.min(this.f84053h + 25, this.f84047b.size());
            List subList = this.f84047b.subList(this.f84053h, min);
            String format = String.format("contact_id IN (%s)", TextUtils.join(",", subList));
            this.f84053h = min;
            new Object[1][0] = subList;
            try {
                cursor = this.f84046a.query(ContactsContract.Data.CONTENT_URI, this.f84049d, format, null, this.f84050e);
            } catch (SQLiteException e) {
                if (cgjy.m145760g()) {
                    apay.f84079a.mo46980a(e, "ContentResolver.query threw an exception");
                } else {
                    apay.f84079a.mo46987e("ContentResolver.query threw an exception", e);
                }
                this.f84052g = false;
                cursor = null;
            }
            this.f84054i++;
            if (cursor == null) {
                apay.f84079a.mo46983c("Could not query ContactsProvider; disabled? Give up.");
                this.f84051f = new apax();
                this.f84053h = this.f84047b.size();
                return;
            }
            this.f84051f = new apad(cursor, this.f84048c);
        }
    }

    /* renamed from: a */
    public final void mo47049a() {
        aoyh aoyh = apay.f84079a;
        this.f84051f.mo47049a();
    }

    /* renamed from: b */
    public final boolean mo47050b() {
        return this.f84052g && this.f84051f.mo47050b();
    }

    public final boolean hasNext() {
        m69970c();
        return this.f84051f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        m69970c();
        return (apab) this.f84051f.next();
    }
}
