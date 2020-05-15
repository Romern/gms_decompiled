package p000;

import android.database.Cursor;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkb extends soa {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azkb(CardChimeraActivity cardChimeraActivity) {
        super(9);
        this.f99547a = cardChimeraActivity;
    }

    public final void run() {
        Cursor query = this.f99547a.getApplicationContext().getContentResolver().query(DatabaseProvider.m94519a(this.f99547a.f111219c.f99774a), null, null, null, null);
        if (query != null && query.moveToFirst()) {
            azdd a = azdd.m85387a(query);
            query.close();
            CardChimeraActivity cardChimeraActivity = this.f99547a;
            int i = CardChimeraActivity.f111167L;
            cardChimeraActivity.f111193a.post(new azka(this, a));
        } else if (query != null) {
            query.close();
        }
    }
}
