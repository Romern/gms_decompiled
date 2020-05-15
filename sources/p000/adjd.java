package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: adjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjd implements adjn {

    /* renamed from: a */
    public final adfs f61870a = new adfs("DevManHashPrefixFilterImpl");

    /* renamed from: b */
    public final adjo f61871b;

    /* renamed from: c */
    private final Context f61872c;

    /* renamed from: d */
    private ContentProviderClient f61873d;

    public adjd(Context context, adjo adjo, ExecutorService executorService) {
        this.f61872c = context;
        this.f61871b = adjo;
        executorService.submit(new adjc(this));
    }

    /* renamed from: a */
    public static void m50585a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public final List mo33569a(int[] iArr) {
        throw null;
    }

    /* renamed from: a */
    public final synchronized ContentProviderClient mo33571a() {
        if (this.f61873d == null) {
            this.f61873d = this.f61872c.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient("instantapp-dev-manager");
        }
        return this.f61873d;
    }
}
