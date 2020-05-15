package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: cko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cko implements cjr, ckp {

    /* renamed from: a */
    private final ContentResolver f6984a;

    public cko(ContentResolver contentResolver) {
        this.f6984a = contentResolver;
    }

    /* renamed from: a */
    public final cdt mo3958a(Uri uri) {
        return new ceb(this.f6984a, uri);
    }

    /* renamed from: a */
    public final cjq mo3929a(cjz cjz) {
        return new ckr(this);
    }
}
