package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: acmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acmt implements acmp {

    /* renamed from: a */
    private final ContentResolver f60179a;

    /* renamed from: b */
    private final List f60180b;

    /* renamed from: c */
    private final acmi f60181c;

    /* renamed from: d */
    private final String[] f60182d;

    /* renamed from: e */
    private final String f60183e;

    /* renamed from: f */
    private acmp f60184f;

    /* renamed from: g */
    private boolean f60185g;

    /* renamed from: h */
    private int f60186h;

    /* renamed from: i */
    private int f60187i = 0;

    /* renamed from: j */
    private long f60188j = Long.MAX_VALUE;

    /* renamed from: k */
    private long f60189k;

    /* renamed from: l */
    private long f60190l;

    public acmt(ContentResolver contentResolver, Resources resources, List list) {
        this.f60179a = contentResolver;
        this.f60180b = list;
        this.f60181c = new acmi(resources);
        this.f60184f = new acna();
        Set set = this.f60181c.f60153b;
        set.add("contact_id");
        set.add("lookup");
        set.add("photo_thumb_uri");
        set.add("display_name");
        set.add("phonetic_name");
        set.add("times_contacted");
        set.add("last_time_contacted");
        set.add("raw_contact_id");
        this.f60182d = (String[]) set.toArray(new String[set.size()]);
        this.f60183e = "contact_id,is_super_primary DESC,is_primary DESC,raw_contact_id";
        this.f60185g = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final void m49477d() {
        Cursor cursor;
        if (!this.f60184f.hasNext() && this.f60186h < this.f60180b.size()) {
            try {
                if (acnv.m49545a()) {
                    if (this.f60187i > 0) {
                        long b = this.f60184f.mo32888b();
                        this.f60188j = Math.min(this.f60188j, b);
                        this.f60189k = Math.max(this.f60189k, b);
                        this.f60190l += b;
                        String valueOf = String.valueOf(acov.m49641a(b));
                        acnv.m49554d(valueOf.length() == 0 ? new String("Closing cursor of size ") : "Closing cursor of size ".concat(valueOf));
                    }
                }
                acnv.m49554d("Closing current iterator");
                this.f60184f.mo32887a();
                int min = Math.min(this.f60186h + 25, this.f60180b.size());
                List subList = this.f60180b.subList(this.f60186h, min);
                String format = String.format("contact_id IN (%s)", TextUtils.join(",", subList));
                this.f60186h = min;
                String valueOf2 = String.valueOf(subList);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 13);
                sb.append("Reading IDs: ");
                sb.append(valueOf2);
                acnv.m49554d(sb.toString());
                try {
                    cursor = this.f60179a.query(ContactsContract.Data.CONTENT_URI, this.f60182d, format, null, this.f60183e);
                } catch (SQLiteException e) {
                    acnv.m49544a(e, "ContentResolver.query threw an exception", new Object[0]);
                    this.f60185g = false;
                    cursor = null;
                }
                this.f60187i++;
                if (cursor == null) {
                    acnv.m49556e("Could not query ContactsProvider; disabled? Give up.");
                    this.f60184f = new acna();
                    this.f60186h = this.f60180b.size();
                    return;
                }
                this.f60184f = new acnb(cursor, this.f60181c);
            } catch (Throwable th) {
                acnv.m49554d("Closing current iterator");
                this.f60184f.mo32887a();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo32887a() {
        acnv.m49554d("BatchingIterator.close()");
        try {
            if (acnv.m49545a() && this.f60187i > 0) {
                this.f60190l += this.f60184f.mo32888b();
                String a = acov.m49641a(this.f60188j);
                String a2 = acov.m49641a(this.f60189k);
                String a3 = acov.m49641a(this.f60190l / ((long) this.f60187i));
                String a4 = acov.m49641a(this.f60190l);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 42 + String.valueOf(a2).length() + String.valueOf(a3).length() + String.valueOf(a4).length());
                sb.append("Cursor size stats:  min=");
                sb.append(a);
                sb.append(", max=");
                sb.append(a2);
                sb.append(", avg=");
                sb.append(a3);
                sb.append(", tot=");
                sb.append(a4);
                acnv.m49541a(sb.toString());
            }
        } finally {
            this.f60184f.mo32887a();
        }
    }

    /* renamed from: b */
    public final long mo32888b() {
        return this.f60190l;
    }

    /* renamed from: c */
    public final boolean mo32889c() {
        return this.f60185g && this.f60184f.mo32889c();
    }

    public final boolean hasNext() {
        m49477d();
        return this.f60184f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        m49477d();
        return (acmo) this.f60184f.next();
    }
}
