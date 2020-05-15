package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: azdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdq extends soa {

    /* renamed from: a */
    public final int f99102a;

    /* renamed from: b */
    public WeakReference f99103b = new WeakReference(null);

    /* renamed from: c */
    private final azdp f99104c;

    /* renamed from: d */
    private final Handler f99105d;

    /* renamed from: h */
    private final Context f99106h;

    public final void run() {
        boolean z = false;
        try {
            ContentResolver contentResolver = this.f99106h.getContentResolver();
            azdp azdp = this.f99104c;
            if (contentResolver.update(azdp.f99098a, azdp.f99099b, azdp.f99100c, azdp.f99101d) > 0) {
                z = true;
            }
        } catch (SQLiteException e) {
        }
        this.f99105d.post(new azdn(this, z));
    }

    public azdq(Handler handler, Context context, azdo azdo, int i, azdp azdp) {
        super(9, null);
        this.f99105d = handler;
        this.f99103b = new WeakReference(azdo);
        this.f99106h = context.getApplicationContext();
        this.f99102a = i;
        this.f99104c = azdp;
    }
}
