package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: alqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alqe implements alqb {

    /* renamed from: a */
    private final ContentResolver f74068a;

    /* renamed from: b */
    private final List f74069b;

    /* renamed from: c */
    private final alpy f74070c;

    /* renamed from: d */
    private final String[] f74071d;

    /* renamed from: e */
    private final String f74072e;

    /* renamed from: f */
    private alqb f74073f;

    /* renamed from: g */
    private boolean f74074g;

    /* renamed from: h */
    private int f74075h;

    /* renamed from: i */
    private int f74076i = 0;

    public alqe(ContentResolver contentResolver, Resources resources, List list) {
        this.f74068a = contentResolver;
        this.f74069b = list;
        this.f74070c = new alpy(resources);
        this.f74073f = new alql();
        Set set = this.f74070c.f74045b;
        set.add("contact_id");
        set.add("lookup");
        set.add("photo_thumb_uri");
        set.add("display_name");
        set.add("phonetic_name");
        set.add("times_contacted");
        set.add("last_time_contacted");
        set.add("raw_contact_id");
        this.f74071d = (String[]) set.toArray(new String[0]);
        this.f74072e = "contact_id,is_super_primary DESC,is_primary DESC,raw_contact_id";
        this.f74074g = true;
    }

    /* renamed from: c */
    private final void m61510c() {
        Cursor cursor;
        if (!this.f74073f.hasNext() && this.f74075h < this.f74069b.size()) {
            this.f74073f.mo40640a();
            int min = Math.min(this.f74075h + 25, this.f74069b.size());
            String format = String.format("contact_id IN (%s)", TextUtils.join(",", this.f74069b.subList(this.f74075h, min)));
            this.f74075h = min;
            try {
                cursor = this.f74068a.query(ContactsContract.Data.CONTENT_URI, this.f74071d, format, null, this.f74072e);
            } catch (SQLiteException e) {
                Log.e("ContactsProviderHelper", "ContentResolver.query threw an exception", e);
                this.f74074g = false;
                cursor = null;
            }
            this.f74076i++;
            if (cursor == null) {
                Log.w("ContactsProviderHelper", "Could not query ContactsProvider; disabled? Give up.");
                this.f74073f = new alql();
                this.f74075h = this.f74069b.size();
                return;
            }
            this.f74073f = new alqc(cursor, this.f74070c);
        }
    }

    /* renamed from: a */
    public final void mo40640a() {
        this.f74073f.mo40640a();
    }

    /* renamed from: b */
    public final boolean mo40641b() {
        return this.f74074g && this.f74073f.mo40641b();
    }

    public final boolean hasNext() {
        m61510c();
        return this.f74073f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        m61510c();
        return (alqa) this.f74073f.next();
    }
}
