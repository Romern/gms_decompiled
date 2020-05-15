package p000;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: azgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99286a;

    /* renamed from: b */
    final /* synthetic */ String f99287b;

    /* renamed from: c */
    final /* synthetic */ boolean f99288c;

    /* renamed from: d */
    final /* synthetic */ boolean f99289d;

    /* renamed from: e */
    final /* synthetic */ boolean f99290e;

    /* renamed from: f */
    final /* synthetic */ long f99291f;

    public azgp(Context context, String str, boolean z, boolean z2, boolean z3, long j) {
        this.f99286a = context;
        this.f99287b = str;
        this.f99288c = z;
        this.f99289d = z2;
        this.f99290e = z3;
        this.f99291f = j;
    }

    public final void run() {
        azph a = azph.m85998a(this.f99286a);
        aznz a2 = aznz.m85891a(this.f99287b);
        new Object[1][0] = this.f99287b;
        if (this.f99288c) {
            a.mo55137a(60, a2);
        } else if (!this.f99289d) {
            a.mo55137a(53, a2);
            if (this.f99290e) {
                a.mo55137a(63, a2);
            } else {
                a.mo55137a(64, a2);
            }
        } else {
            a.mo55137a(57, a2);
        }
        azcm a3 = azcm.m85300a(this.f99286a);
        String str = this.f99287b;
        long j = this.f99291f;
        if (!a3.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        a3.f98996b.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_dismissed_in_notification", Long.valueOf(j));
            Object[] objArr = {str, Integer.valueOf(a3.f98996b.update("conversations", contentValues, "conversation_id = ? AND last_dismissed_in_notification < ?", new String[]{str, Long.toString(j)}))};
            a3.f98996b.setTransactionSuccessful();
        } finally {
            a3.f98996b.endTransaction();
        }
    }
}
