package p000;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: adrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrk extends adrn {

    /* renamed from: a */
    static final String f62563a = String.format("(%s=1 OR %s=1) AND %s IS NOT NULL", "is_music", "is_podcast", "title");

    /* renamed from: b */
    static final String[] f62564b = {"_id", "date_modified", "title", "album", "album_id", "artist", "artist_id"};

    public adrk(adrq adrq) {
        this.f62572d = adrq;
    }

    /* renamed from: a */
    public final adru mo33742a(Long l, Long l2) {
        boolean z;
        String str;
        if (l2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (ceqm.f183265a.mo6606a().mo79632q()) {
            str = f62563a;
        } else {
            str = null;
        }
        Cursor a = this.f62572d.mo33749a(mo33746a(z, false, l, l2, str));
        if (a != null) {
            return new adru(a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo33744b() {
        return f62564b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo33743a() {
        return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    }
}
