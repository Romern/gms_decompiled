package p000;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: adrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrm extends adrn {

    /* renamed from: a */
    protected static final String[] f62569a = {"_id", "date_modified", "date_added", "_display_name", "title", "media_type", "mime_type", "_data"};

    /* renamed from: b */
    static final String[] f62570b = {"_id", "date_modified", "media_type"};

    public adrm(adrq adrq) {
        this.f62572d = adrq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo33743a() {
        return MediaStore.Files.getContentUri("external");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo33744b() {
        return f62569a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String[] mo33745c() {
        return f62570b;
    }
}
