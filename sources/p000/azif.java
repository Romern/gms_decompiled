package p000;

import android.database.Cursor;
import android.view.View;

/* renamed from: azif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azif extends soa {

    /* renamed from: a */
    final /* synthetic */ View f99467a;

    /* renamed from: b */
    final /* synthetic */ azik f99468b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azif(azik azik, View view) {
        super(9);
        this.f99468b = azik;
        this.f99467a = view;
    }

    public final void run() {
        azoj.m85933c("test", "app: %s", this.f99468b.f99478b);
        Cursor a = azcd.m85250a(this.f99468b.getContext().getContentResolver(), this.f99468b.f99478b, azcc.f98959a);
        if (a != null) {
            while (a.moveToNext()) {
                if (a.getString(a.getColumnIndex("sid")).equals(this.f99468b.f99478b)) {
                    this.f99468b.f99481e = azcb.m85239a(a);
                }
            }
        }
        if (a != null) {
            a.close();
        }
        stq.m36309a(new azie(this));
    }
}
