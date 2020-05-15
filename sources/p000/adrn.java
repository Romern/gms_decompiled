package p000;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: adrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adrn {

    /* renamed from: c */
    static final String[] f62571c = {"_id", "date_modified"};

    /* renamed from: d */
    protected adrq f62572d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final adrp mo33746a(boolean z, boolean z2, Long l, Long l2, String str) {
        int i;
        if (!ceqm.m137877h()) {
            i = z ? 4 : 2;
        } else {
            i = z ? 3 : 1;
        }
        adro a = adrp.m51071a();
        a.f62578f = i;
        a.f62575c = mo33743a();
        a.f62576d = !z2 ? mo33744b() : mo33745c();
        a.f62573a = l;
        if (l2 != null) {
            a.f62574b = l2;
        }
        if (str != null) {
            a.f62577e = str;
        }
        return a.mo33748a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Uri mo33743a();

    /* renamed from: b */
    public final adrw mo33747b(Long l, Long l2) {
        boolean z;
        if (l2 != null) {
            z = true;
        } else {
            z = false;
        }
        Cursor a = this.f62572d.mo33749a(mo33746a(z, true, l, l2, null));
        if (a != null) {
            return new adrw(a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo33744b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String[] mo33745c() {
        return f62571c;
    }
}
