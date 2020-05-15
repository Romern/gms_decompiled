package p000;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzy {

    /* renamed from: a */
    public acaj f59040a;

    /* renamed from: b */
    public final Map f59041b = new HashMap();

    /* renamed from: a */
    public final String mo32564a(ContentResolver contentResolver, Uri uri, String str, String[] strArr, String[] strArr2, long j, String str2) {
        acaj acaj;
        mo32571e();
        String[] strArr3 = {str, Long.toString(j), str2};
        try {
            ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
            if (acquireUnstableContentProviderClient == null) {
                absg.m48206e("Could not connect to content provider %s", uri);
                acaj = null;
            } else {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, strArr3, null);
                    if (query != null) {
                        acaj = new acaj(acquireUnstableContentProviderClient, query);
                    } else {
                        acquireUnstableContentProviderClient.release();
                        acaj = null;
                    }
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw new acai(th);
                }
            }
            this.f59040a = acaj;
            if (acaj != null) {
                try {
                    String a = fta.m12293a(acaj.f59105b);
                    acaj acaj2 = this.f59040a;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str3 = strArr[i];
                            int a2 = acaj2.mo32580a(str3);
                            if (a2 == -1) {
                                absg.m48192b("Column %s was not returned by client, refusing to index", str3);
                                mo32571e();
                                break;
                            }
                            this.f59041b.put(str3, Integer.valueOf(a2));
                            i++;
                        } else {
                            for (String str4 : strArr2) {
                                int a3 = acaj2.mo32580a(str4);
                                if (a3 != -1) {
                                    this.f59041b.put(str4, Integer.valueOf(a3));
                                }
                            }
                            mo32570d();
                        }
                    }
                    return a;
                } catch (Throwable th2) {
                    throw new acai(th2);
                }
            } else {
                absg.m48186a("Cursor for %s is null, %s", str, uri);
                return null;
            }
        } finally {
            acai acai = new acai(th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo32566a() {
        return this.f59040a == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo32567b() {
        return this.f59040a != null;
    }

    /* renamed from: c */
    public final long mo32569c() {
        Integer num;
        if (this.f59040a == null || (num = (Integer) this.f59041b.get("seqno")) == null) {
            return Long.MAX_VALUE;
        }
        return this.f59040a.mo32581a(num.intValue());
    }

    /* renamed from: d */
    public final boolean mo32570d() {
        acaj acaj = this.f59040a;
        if (acaj == null) {
            return false;
        }
        try {
            if (acaj.f59105b.moveToNext()) {
                return true;
            }
            mo32571e();
            return false;
        } catch (Throwable th) {
            throw new acai(th);
        }
    }

    /* renamed from: e */
    public final void mo32571e() {
        this.f59041b.clear();
        acaj acaj = this.f59040a;
        if (acaj != null) {
            try {
                acaj.f59105b.close();
                acaj.f59104a.release();
                this.f59040a = null;
            } catch (Throwable th) {
                acaj.f59104a.release();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final byte[] mo32568b(String str) {
        Integer num;
        if (this.f59040a == null || (num = (Integer) this.f59041b.get(str)) == null) {
            return null;
        }
        try {
            return this.f59040a.f59105b.getBlob(num.intValue());
        } catch (Throwable th) {
            throw new acai(th);
        }
    }

    /* renamed from: a */
    public final String mo32565a(String str) {
        Integer num;
        if (this.f59040a == null || (num = (Integer) this.f59041b.get(str)) == null) {
            return null;
        }
        try {
            return this.f59040a.f59105b.getString(num.intValue());
        } catch (Throwable th) {
            throw new acai(th);
        }
    }
}
