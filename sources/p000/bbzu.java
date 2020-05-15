package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bbzu */
final /* synthetic */ class bbzu implements Runnable {

    /* renamed from: a */
    private final bcas f103839a;

    /* renamed from: b */
    private final List f103840b;

    public bbzu(bcas bcas, List list) {
        this.f103839a = bcas;
        this.f103840b = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcas.a(bdbe, boolean):void
     arg types: [bdbe, int]
     candidates:
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ContactId):android.util.Pair
      bcas.a(bcdo, java.util.concurrent.Callable):bdar
      bcas.a(bcdo, bdar):void
      bcas.a(bctr, boolean):void
      bcas.a(bcsp, boolean):long
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, bmxv):long
      bcas.a(int, int):bdar
      bcas.a(int, bmxz):bdar
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bcas.a(java.lang.String, java.lang.String):bmxv
      bcas.a(long, java.lang.Long):void
      bcas.a(bctr, long):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bdal.a(int, int):bdar
      bdal.a(int, bmxz):bdar
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bdal.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bdal.a(bctr, long):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bcas.a(bdbe, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r3 != null) goto L_0x0033;
     */
    public final void run() {
        Throwable th;
        Throwable th2;
        bdbe bdbe;
        bcas bcas = this.f103839a;
        List<bdbe> list = this.f103840b;
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("blocks"), new String[]{"id"}, null, null, "id DESC", Integer.toString(1));
        try {
            long j = 0;
            if (a.moveToFirst()) {
                j = a.getLong(0);
            }
            a.close();
            for (bdbe bdbe2 : list) {
                bcas.mo56625a(bdbe2, true);
            }
            Cursor a2 = bcas.f103908c.mo54677a(bcas.mo56655d("blocks"), bcdr.f104017a, "id <= ?", new String[]{Long.toString(j)}, null, null);
            while (a2.moveToNext()) {
                try {
                    if (bcbr.m88772a(a2.getInt(bcdq.m88851a(2))) == bcbr.GROUP) {
                        bcsr c = ConversationId.GroupId.m94847c();
                        c.mo57478b(a2.getString(bcdq.m88851a(3)));
                        c.mo57477a(a2.getString(bcdq.m88851a(5)));
                        bdbe = bdbc.m90522a(c.mo57476a());
                    } else {
                        bcsk f = ContactId.m94830f();
                        f.mo57453b(a2.getString(bcdq.m88851a(3)));
                        f.mo57451a((ContactId.ContactType) bcbs.f103946a.mo66854a().mo66855c(bcbr.m88772a(a2.getInt(bcdq.m88851a(2)))));
                        f.mo57454c(a2.getString(bcdq.m88851a(5)));
                        String string = a2.getString(bcdq.m88851a(4));
                        if (!TextUtils.isEmpty(string)) {
                            f.mo57452a(string);
                        }
                        bdbe = bdbc.m90521a(f.mo57450a());
                    }
                    bcas.mo56625a(bdbe, false);
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
            throw th;
            throw th2;
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
