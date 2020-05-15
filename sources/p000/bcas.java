package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bcas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcas implements bdal {

    /* renamed from: h */
    public static final /* synthetic */ int f103904h = 0;

    /* renamed from: i */
    private static final String f103905i;

    /* renamed from: a */
    public final Context f103906a;

    /* renamed from: b */
    public final bcnt f103907b;

    /* renamed from: c */
    public final bdae f103908c;

    /* renamed from: d */
    final long f103909d;

    /* renamed from: e */
    public final bngx f103910e = bngx.m109356a(bctk.f104859b);

    /* renamed from: f */
    public final bqgj f103911f = bboz.m88304a().f103024a;

    /* renamed from: g */
    public LruCache f103912g;

    /* renamed from: j */
    private final bbyv f103913j;

    static {
        String valueOf = String.valueOf(bcbc.m88745a("conversations", "id"));
        f103905i = valueOf.length() == 0 ? new String("messages INNER JOIN conversations ON conversation_row_id = ") : "messages INNER JOIN conversations ON conversation_row_id = ".concat(valueOf);
    }

    public bcas(Context context, bcnt bcnt, bbyv bbyv, bdae bdae, long j) {
        this.f103906a = context.getApplicationContext();
        this.f103907b = bcnt;
        this.f103913j = bbyv;
        this.f103908c = bdae;
        this.f103909d = j;
    }

    /* renamed from: a */
    private static final Pair m88647a(String str, ContactId contactId) {
        String str2;
        String a = bcbc.m88745a(str, "lighter_id_normalized_id");
        String a2 = bcbc.m88745a(str, "lighter_id_type");
        String a3 = bcbc.m88745a(str, "lighter_id_app_name");
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append(a);
        sb.append(" =? AND ");
        sb.append(a2);
        sb.append(" =? AND ");
        sb.append(a3);
        sb.append(" =? ");
        String sb2 = sb.toString();
        String[] strArr = {contactId.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(contactId.mo60492a()) : contactId.mo60492a(), Integer.toString(contactId.mo60494c().f111365f), contactId.mo60493b()};
        if (contactId.mo60495d().mo66813a()) {
            String valueOf = String.valueOf(sb2);
            String a4 = bcbc.m88745a(str, "lighter_handler_id");
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 9 + String.valueOf(a4).length());
            sb3.append(valueOf);
            sb3.append(" AND ");
            sb3.append(a4);
            sb3.append(" =? ");
            str2 = sb3.toString();
            strArr = (String[]) bnnw.m109888a(strArr, (String) contactId.mo60495d().mo66814b());
        } else {
            String valueOf2 = String.valueOf(sb2);
            String a5 = bcbc.m88745a(str, "lighter_handler_id");
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 14 + String.valueOf(a5).length());
            sb4.append(valueOf2);
            sb4.append(" AND ");
            sb4.append(a5);
            sb4.append(" is NULL ");
            str2 = sb4.toString();
        }
        return Pair.create(str2, strArr);
    }

    /* renamed from: b */
    private static final String m88654b(String str, String str2) {
        String a = bcbc.m88745a(str, "id");
        String a2 = bcbc.m88745a(str2, "id");
        int length = str.length();
        int length2 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 110 + length2 + str2.length() + String.valueOf(a2).length());
        sb.append("((conversations INNER JOIN contacts AS ");
        sb.append(str);
        sb.append(" ON owner_row_id = ");
        sb.append(a);
        sb.append(") LEFT JOIN contacts AS ");
        sb.append(str2);
        sb.append(" ON other_contact_row_id = ");
        sb.append(a2);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    private final long m88655c(bcsp bcsp) {
        return ((Long) bcbb.m88741a(this.f103908c, new bcag(this, bcsp))).longValue();
    }

    /* renamed from: e */
    private static final Pair m88657e(ContactId contactId) {
        return m88647a("contacts", contactId);
    }

    /* renamed from: d */
    public final long mo56654d(ConversationId conversationId) {
        String valueOf = String.valueOf(mo56650c(conversationId));
        String join = TextUtils.join(", ", new Integer[]{Integer.valueOf(bctk.f104862e.f104871m), Integer.valueOf(bctk.f104863f.f104871m), Integer.valueOf(bctk.f104864g.f104871m), Integer.valueOf(bctk.f104869l.f104871m)});
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 53);
        sb.append("conversation_row_id = ?  AND message_status NOT IN (");
        sb.append(join);
        sb.append(")");
        bdae bdae = this.f103908c;
        Uri d = mo56655d("messages");
        String[] strArr = {"server_timestamp_us"};
        Cursor a = bdae.mo54677a(d, strArr, sb.toString(), new String[]{valueOf}, "id DESC", "1");
        try {
            if (a.moveToFirst()) {
                long j = a.getLong(0);
                if (a != null) {
                    a.close();
                }
                return j;
            } else if (a == null) {
                return 0;
            } else {
                a.close();
                return 0;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo56659f(ConversationId conversationId) {
        bcdp.m88848a().mo56717a(bcdm.m88831a("participants", "REGISTRATION", String.valueOf(this.f103909d), "PARTICIPANTS_LIST_PATH", String.valueOf(conversationId.hashCode())));
    }

    /* renamed from: g */
    public final void mo56660g(ConversationId conversationId) {
        bcdp.m88848a().mo56717a(bcdm.m88829a(this.f103909d, conversationId));
    }

    /* renamed from: h */
    public final void mo56661h(ConversationId conversationId) {
        bcdp.m88848a().mo56717a(bcdm.m88834c(this.f103909d, conversationId));
    }

    /* renamed from: e */
    private final String[] m88658e() {
        ArrayList arrayList = new ArrayList();
        bnre i = this.f103910e.listIterator();
        while (i.hasNext()) {
            arrayList.add(Integer.toString(((bctk) i.next()).f104871m));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: c */
    public static final Pair m88656c(bdbe bdbe) {
        String[] strArr;
        String str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?";
        if (bdbe.mo57837b() == ConversationId.IdType.ONE_TO_ONE) {
            ContactId c = bdbe.mo57841c();
            strArr = new String[]{c.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(c.mo60492a()) : c.mo60492a(), Integer.toString(((bcbr) bcbs.f103946a.mo66855c(c.mo60494c())).f103945g), c.mo60493b()};
            if (c.mo60495d().mo66813a()) {
                strArr = (String[]) bnnw.m109888a(strArr, (String) c.mo60495d().mo66814b());
                str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =? AND lighter_handler_id =?";
            }
        } else {
            strArr = new String[]{bdbe.mo57836a().mo60503a(), Integer.toString(bcbr.GROUP.f103945g), bdbe.mo57836a().mo60504b()};
        }
        return Pair.create(str, strArr);
    }

    /* renamed from: b */
    public final long mo56637b(bcsj bcsj) {
        return ((Long) bcbb.m88741a(this.f103908c, new bcai(this, bcbv.m88773a(bcsj), bcsj))).longValue();
    }

    /* renamed from: b */
    public final long mo56638b(ContactId contactId) {
        return ((Long) bcbb.m88741a(this.f103908c, new bcaj(this, contactId))).longValue();
    }

    /* renamed from: e */
    public final void mo56658e(ConversationId conversationId) {
        bcdp.m88848a().mo56717a(bcdm.m88833b(this.f103909d, conversationId));
    }

    /* renamed from: b */
    public final bmxv mo56639b(String str) {
        return mo56615a(str, "server_timestamp_us");
    }

    /* renamed from: b */
    public final bnhe mo56640b(long j) {
        return (bnhe) bcbb.m88741a(this.f103908c, new bbzr(this, "needs_delivery_receipt = ? AND server_timestamp_us > ?", new String[]{"1", Long.toString(j)}));
    }

    /* renamed from: a */
    private final bcdo m88648a(String[] strArr, int i, int i2, bmxz bmxz) {
        bcdn i3 = bcdo.m88839i();
        i3.mo56715a(mo56655d(m88654b("o", "c")));
        i3.f104007a = bngx.m109370a((Object[]) bcbc.m88751a(bcbc.m88750a("conversations", strArr), bcbc.m88750a("o", bcdt.f104018a), bcbc.m88750a("c", bcdt.f104018a)));
        i3.f104008b = "update_timestamp_us <> ?";
        i3.f104009c = bngx.m109356a(Long.toString(0));
        i3.f104010d = "update_timestamp_us DESC";
        i3.mo56714a(i2);
        i3.mo56716b(i);
        i3.f104011e = bmxz;
        return i3.mo56713a();
    }

    /* renamed from: d */
    public final Uri mo56655d(String str) {
        return bcbc.m88743a(String.valueOf(this.f103906a.getPackageName()).concat(".lighter.data"), "MESSAGING", str, Long.toString(this.f103909d));
    }

    /* renamed from: b */
    public final void mo56641b() {
        bcdp.m88848a().mo56717a(bcdm.m88832b(this.f103909d));
    }

    /* renamed from: c */
    public final long mo56649c(ContactId contactId) {
        Pair e = m88657e(contactId);
        Cursor a = this.f103908c.mo54677a(mo56655d("contacts"), new String[]{"id"}, (String) e.first, (String[]) e.second, null, null);
        try {
            if (a.moveToFirst()) {
                long j = a.getLong(0);
                if (a != null) {
                    a.close();
                }
                return j;
            } else if (a == null) {
                return -1;
            } else {
                a.close();
                return -1;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo56642b(bcsp bcsp) {
        ((Long) bcbb.m88741a(this.f103908c, new bbzf(this, bcsp))).longValue();
    }

    /* renamed from: d */
    public final bdar mo56656d() {
        if (!((Boolean) bbqt.m88417a(this.f103906a).f103080B.mo58455c()).booleanValue()) {
            return new bdax();
        }
        bcdn i = bcdo.m88839i();
        i.mo56715a(mo56655d("notifications"));
        i.f104007a = bngx.m109370a((Object[]) bcdz.f104023a);
        i.f104008b = null;
        i.f104009c = null;
        i.f104010d = "notification_timestamp_received_ms DESC";
        i.mo56714a(-1);
        return m88650a(i.mo56713a(), this.f103906a, bcae.f103865a, bcdm.m88826a(this.f103909d));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcas.a(bctr, boolean):void
     arg types: [bctr, int]
     candidates:
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ContactId):android.util.Pair
      bcas.a(bcdo, java.util.concurrent.Callable):bdar
      bcas.a(bcdo, bdar):void
      bcas.a(bcsp, boolean):long
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, bmxv):long
      bcas.a(int, int):bdar
      bcas.a(int, bmxz):bdar
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bcas.a(java.lang.String, java.lang.String):bmxv
      bcas.a(long, java.lang.Long):void
      bcas.a(bctr, long):void
      bcas.a(bdbe, boolean):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bdal.a(int, int):bdar
      bdal.a(int, bmxz):bdar
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bdal.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bdal.a(bctr, long):void
      bdal.a(bdbe, boolean):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bcas.a(bctr, boolean):void */
    /* renamed from: b */
    public final void mo56643b(bctr bctr) {
        m88653a(bctr, true);
    }

    /* renamed from: b */
    public final void mo56644b(bdbe bdbe) {
        bcdp.m88848a().mo56717a(bcdm.m88827a(this.f103909d, bdbe));
    }

    /* renamed from: a */
    private final synchronized bdar m88649a(bcdo bcdo) {
        LruCache lruCache = this.f103912g;
        if (lruCache == null) {
            new bbqs(new bcak(this), bbqt.m88417a(this.f103906a).f103175q).execute(new Void[0]);
            return null;
        }
        return (bdar) lruCache.get(bcdo);
    }

    /* renamed from: b */
    public final void mo56645b(bngx bngx) {
        if (((Boolean) bbqt.m88417a(this.f103906a).f103080B.mo58455c()).booleanValue()) {
            bcbb.m88742a(this.f103908c, new bcad(this, bngx));
        }
    }

    /* renamed from: d */
    public final void mo56657d(ContactId contactId) {
        bcdp.m88848a().mo56717a(bcdm.m88828a(this.f103909d, contactId));
    }

    /* renamed from: b */
    public final void mo56646b(ConversationId conversationId) {
        bcbb.m88742a(this.f103908c, new bbzg(this, conversationId));
    }

    /* renamed from: c */
    public final long mo56650c(ConversationId conversationId) {
        String[] strArr;
        String str;
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            strArr = new String[]{conversationId.mo60557d().mo60503a(), conversationId.mo60557d().mo60504b()};
        } else {
            long c = mo56649c(conversationId.mo60558e());
            if (c == -1) {
                return -1;
            }
            strArr = new String[]{String.valueOf(c)};
            str = "other_contact_row_id = ?";
        }
        Cursor a = this.f103908c.mo54677a(mo56655d("conversations"), new String[]{"id"}, str, strArr, null, null);
        try {
            if (a.moveToFirst()) {
                long j = a.getLong(0);
                if (a != null) {
                    a.close();
                }
                return j;
            }
            if (a != null) {
                a.close();
            }
            return -1;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final bdar m88650a(bcdo bcdo, Context context, bmxj bmxj, Uri uri) {
        return m88651a(bcdo, new bcam(this, context, bmxj, uri, bcdo));
    }

    /* renamed from: b */
    public final void mo56647b(ConversationId conversationId, List list) {
        bcbb.m88742a(this.f103908c, new bcaa(this, conversationId, list));
    }

    /* renamed from: a */
    private final bdar m88651a(bcdo bcdo, Callable callable) {
        bdar a = m88649a(bcdo);
        if (a != null) {
            return a;
        }
        try {
            bdar bdar = (bdar) callable.call();
            try {
                m88652a(bcdo, bdar);
                return bdar;
            } catch (Exception e) {
                e = e;
                a = bdar;
                bbos.m88292b("SQLiteMessagingStore", "Error creating monitor", e);
                return a;
            }
        } catch (Exception e2) {
            e = e2;
            bbos.m88292b("SQLiteMessagingStore", "Error creating monitor", e);
            return a;
        }
    }

    /* renamed from: b */
    public final void mo56648b(List list) {
        bcbb.m88742a(this.f103908c, new bbzu(this, list));
    }

    /* renamed from: a */
    private final synchronized void m88652a(bcdo bcdo, bdar bdar) {
        LruCache lruCache = this.f103912g;
        if (lruCache == null) {
            new bbqs(new bcal(this, bcdo, bdar), bbqt.m88417a(this.f103906a).f103175q).execute(new Void[0]);
        } else {
            lruCache.put(bcdo, bdar);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    private final void m88653a(bctr bctr, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", bctr.mo57359a());
        int o = bctr.mo57375o();
        int i = o - 1;
        if (o != 0) {
            contentValues.put("message_type", Integer.valueOf(i));
            contentValues.put("message_status", Integer.valueOf(bctr.mo57366g().f104871m));
            contentValues.put("server_timestamp_us", bctr.mo57362d());
            contentValues.put("capability", Integer.valueOf(bctr.mo57370j()));
            contentValues.put("rendering_type", Integer.valueOf(bctr.mo57371k().mo57200a().f104888h));
            contentValues.put("filterable_flags", Integer.valueOf(bctr.mo57373m()));
            int o2 = bctr.mo57375o();
            if (o2 != 0) {
                if (o2 != 1 || !((Boolean) bbqt.m88417a(this.f103906a).f103085G.mo58455c()).booleanValue()) {
                    contentValues.put("needs_delivery_receipt", (Boolean) false);
                } else {
                    contentValues.put("needs_delivery_receipt", (Boolean) true);
                }
                try {
                    contentValues.put("message_properties", bbqu.m88422a((Serializable) bccf.m88796a(bctr)));
                    bcbb.m88742a(this.f103908c, new bcah(this, bctr, z, contentValues));
                } catch (IOException e) {
                    bbos.m88292b("SQLiteMessagingStore", "Failed to serialize message profile.", e);
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo56651c() {
        bcdp.m88848a().mo56717a(bcdm.m88826a(this.f103909d));
    }

    /* renamed from: c */
    public final void mo56652c(bcsj bcsj) {
        ((Long) bcbb.m88741a(this.f103908c, new bbzj(this, bcsj))).longValue();
    }

    /* renamed from: c */
    public final void mo56653c(String str) {
        bcdp.m88848a().mo56717a(bcdm.m88830a(this.f103909d, str));
    }

    /* renamed from: a */
    public final long mo56602a(bcsj bcsj) {
        return ((Long) bcbb.m88741a(this.f103908c, new bbzi(this, bcsj))).longValue();
    }

    /* renamed from: a */
    public final long mo56603a(bcsp bcsp, boolean z) {
        byte[] bArr;
        long c = mo56650c(bcsp.mo57317a());
        if (c == -1) {
            return m88655c(bcsp);
        }
        bmxv a = mo56614a(c);
        if (z && a.mo66813a() && ((bcsp) a.mo66814b()).mo57322f().longValue() != -1) {
            return c;
        }
        ContentValues contentValues = new ContentValues();
        if (a.mo66813a()) {
            try {
                HashMap a2 = bcbx.m88779a((bcsp) a.mo66814b());
                bcbx.m88781a(a2, bcsp);
                bArr = bbqu.m88422a((Serializable) a2);
            } catch (IOException e) {
                bbos.m88292b("ConversationCursors", "Failed to serialize conversation properties.", e);
                bArr = new byte[0];
            }
            contentValues.put("conversation_properties", bArr);
        } else {
            contentValues.put("conversation_properties", bcbx.m88783b(bcsp));
        }
        contentValues.put("conversation_app_data", bcbx.m88782a(bnmt.m109803b(bcsp.mo57325i())));
        if (this.f103908c.mo54674a(mo56655d("conversations"), contentValues, "id = ?", new String[]{String.valueOf(c)}) < 0) {
            bbos.m88294d("SQLiteMessagingStore", "Failed to update conversation.");
            return -1;
        }
        mo56658e(bcsp.mo57317a());
        mo56641b();
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo56604a(ConversationId conversationId, bmxv bmxv) {
        boolean z;
        long c = mo56650c(conversationId);
        if (c == -1) {
            bcso n = bcsp.m89835n();
            n.mo57461a(conversationId);
            n.mo57462a((Long) -1L);
            n.mo57464a(new HashMap());
            if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
                z = true;
            } else {
                z = false;
            }
            n.mo57465a(z);
            c = m88655c(n.mo57457a());
        }
        if (bmxv.mo66813a()) {
            mo56620a(c, (Long) bmxv.mo66814b());
        }
        return c;
    }

    /* renamed from: a */
    public final Pair mo56605a(bcuu bcuu) {
        return (Pair) bcbb.m88741a(this.f103908c, new bbzy(this, bcuu));
    }

    /* renamed from: a */
    public final bdar mo56606a(int i, int i2) {
        return m88650a(m88648a(bcdv.f104020b, i, i2, (bmxz) null), this.f103906a, new bcaq(this), bcdm.m88832b(this.f103909d));
    }

    /* renamed from: a */
    public final bdar mo56607a(int i, bmxz bmxz) {
        bcdo a = m88648a(bcdv.f104020b, 0, i, bmxz);
        return m88651a(a, new bcar(this, a));
    }

    /* renamed from: a */
    public final bdar mo56608a(bdbe bdbe) {
        Pair c = m88656c(bdbe);
        bcdn i = bcdo.m88839i();
        i.mo56715a(mo56655d("blocks"));
        i.f104007a = bngx.m109370a((Object[]) bcdr.f104017a);
        i.f104008b = (String) c.first;
        i.f104009c = bngx.m109370a((Object[]) ((String[]) c.second));
        i.f104010d = null;
        return m88650a(i.mo56713a(), this.f103906a, bbzw.f103844a, bcdm.m88827a(this.f103909d, bdbe));
    }

    /* renamed from: a */
    public final bdar mo56609a(ContactId contactId) {
        Pair e = m88657e(contactId);
        bcdn i = bcdo.m88839i();
        i.mo56715a(mo56655d("contacts"));
        i.f104007a = bngx.m109370a((Object[]) bcdt.f104018a);
        i.f104008b = (String) e.first;
        i.f104009c = bngx.m109370a((Object[]) ((String[]) e.second));
        i.f104010d = null;
        return m88650a(i.mo56713a(), this.f103906a, bbzh.f103795a, bcdm.m88828a(this.f103909d, contactId));
    }

    /* renamed from: a */
    public final bdar mo56610a(ConversationId conversationId) {
        String str;
        String[] strArr;
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            strArr = new String[]{String.valueOf(ConversationId.IdType.GROUP.f111369c), conversationId.mo60557d().mo60503a(), conversationId.mo60557d().mo60504b()};
            str = "conversation_type = ? AND conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            Pair a = m88647a("c", conversationId.mo60558e());
            String valueOf = String.valueOf((String) a.first);
            str = valueOf.length() == 0 ? new String("conversation_type = ?AND ") : "conversation_type = ?AND ".concat(valueOf);
            strArr = (String[]) bnnw.m109889a(new String[]{String.valueOf(ConversationId.IdType.ONE_TO_ONE.f111369c)}, (String[]) a.second, String.class);
        }
        Pair create = Pair.create(str, strArr);
        String b = m88654b("o", "c");
        String[] a2 = bcbc.m88751a(bcbc.m88750a("conversations", bcdv.f104020b), bcbc.m88750a("o", bcdt.f104018a), bcbc.m88750a("c", bcdt.f104018a));
        bcdn i = bcdo.m88839i();
        i.mo56715a(mo56655d(b));
        i.f104007a = bngx.m109370a((Object[]) a2);
        i.f104008b = (String) create.first;
        i.f104009c = bngx.m109370a((Object[]) ((String[]) create.second));
        i.f104010d = null;
        return m88650a(i.mo56713a(), this.f103906a, bbzd.f103788a, bcdm.m88833b(this.f103909d, conversationId));
    }

    /* renamed from: a */
    public final bdar mo56611a(ConversationId conversationId, int i) {
        String str;
        String[] strArr;
        String str2 = f103905i;
        String a = bcbc.m88744a(this.f103910e.size());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
        sb.append("message_status IN (");
        sb.append(a);
        sb.append(")");
        String sb2 = sb.toString();
        if (i > 0) {
            sb2 = String.valueOf(sb2).concat(" AND filterable_flags & 1 = 0");
        }
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            String valueOf = String.valueOf(sb2);
            int i2 = bctq.f104881b.f104888h;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 98);
            sb3.append(valueOf);
            sb3.append(" AND conversation_group_id =? AND conversation_group_app_name =? AND rendering_type <> ");
            sb3.append(i2);
            str = sb3.toString();
            strArr = (String[]) bnnw.m109889a(m88658e(), new String[]{conversationId.mo60557d().mo60503a(), conversationId.mo60557d().mo60504b()}, String.class);
        } else {
            Pair e = m88657e(conversationId.mo60558e());
            String valueOf2 = String.valueOf(str2);
            String a2 = bcbc.m88745a("contacts", "id");
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 47 + String.valueOf(a2).length());
            sb4.append(valueOf2);
            sb4.append(" INNER JOIN contacts ON other_contact_row_id = ");
            sb4.append(a2);
            str2 = sb4.toString();
            String valueOf3 = String.valueOf(sb2);
            String str3 = (String) e.first;
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 5 + String.valueOf(str3).length());
            sb5.append(valueOf3);
            sb5.append(" AND ");
            sb5.append(str3);
            String sb6 = sb5.toString();
            strArr = (String[]) bnnw.m109889a(m88658e(), (String[]) e.second, String.class);
            str = sb6;
        }
        bcdn i3 = bcdo.m88839i();
        i3.mo56715a(mo56655d(str2));
        i3.f104007a = bngx.m109356a(bcbc.m88745a("messages", "id"));
        i3.f104008b = str;
        i3.f104009c = bngx.m109370a((Object[]) strArr);
        i3.f104010d = null;
        return m88650a(i3.mo56713a(), this.f103906a, bbza.f103784a, bcdm.m88834c(this.f103909d, conversationId));
    }

    /* renamed from: a */
    public final bdar mo56612a(ConversationId conversationId, int i, int i2, bctq[] bctqArr) {
        String[] strArr;
        String str;
        String[] strArr2;
        String str2;
        String str3;
        ConversationId conversationId2 = conversationId;
        bctq[] bctqArr2 = bctqArr;
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            String str4 = f103905i;
            String a = bcbc.m88745a("contacts", "id");
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 51 + String.valueOf(a).length());
            sb.append("((");
            sb.append(str4);
            sb.append(") LEFT JOIN contacts ON sender_contact_row_id = ");
            sb.append(a);
            sb.append(")");
            str2 = sb.toString();
            strArr = new String[]{conversationId.mo60557d().mo60503a(), conversationId.mo60557d().mo60504b()};
            strArr2 = bcbc.m88751a(bcbc.m88750a("messages", bcdx.f104021a), bcbc.m88750a("contacts", bcdt.f104018a));
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            String str5 = f103905i;
            String a2 = bcbc.m88745a("s", "id");
            String a3 = bcbc.m88745a("o", "id");
            int length = String.valueOf(str5).length();
            StringBuilder sb2 = new StringBuilder(length + 109 + String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
            sb2.append("(((");
            sb2.append(str5);
            sb2.append(") LEFT JOIN contacts AS s ON sender_contact_row_id = ");
            sb2.append(a2);
            sb2.append(") INNER JOIN contacts AS o ON other_contact_row_id = ");
            sb2.append(a3);
            sb2.append(")");
            str2 = sb2.toString();
            Pair a4 = m88647a("o", conversationId.mo60558e());
            strArr = (String[]) a4.second;
            strArr2 = bcbc.m88751a(bcbc.m88750a("messages", bcdx.f104021a), bcbc.m88750a("s", bcdt.f104018a));
            str = (String) a4.first;
        }
        String valueOf = String.valueOf(str);
        int length2 = bctqArr2.length;
        String join = TextUtils.join(", ", Collections.nCopies(length2, '?'));
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(join).length());
        sb3.append(valueOf);
        sb3.append(" AND rendering_type IN (");
        sb3.append(join);
        sb3.append(")");
        String sb4 = sb3.toString();
        String[] strArr3 = (String[]) Arrays.copyOf(strArr, strArr.length + length2);
        for (int i3 = 0; i3 < bctqArr2.length; i3++) {
            strArr3[strArr.length + i3] = Integer.toString(bctqArr2[i3].f104888h);
        }
        bcdn i4 = bcdo.m88839i();
        i4.mo56715a(mo56655d(str2));
        i4.f104007a = bngx.m109370a((Object[]) strArr2);
        i4.f104008b = sb4;
        i4.f104009c = bngx.m109370a((Object[]) strArr3);
        if (i2 != 0) {
            str3 = null;
        } else {
            str3 = "server_timestamp_us DESC";
        }
        i4.f104010d = str3;
        i4.mo56714a(i);
        return m88650a(i4.mo56713a(), this.f103906a, new bbzb(this, conversationId2), bcdm.m88829a(this.f103909d, conversationId2));
    }

    /* renamed from: a */
    public final bdar mo56613a(String str, ConversationId conversationId) {
        String str2 = f103905i;
        String a = bcbc.m88745a("contacts", "id");
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(a).length());
        sb.append("((");
        sb.append(str2);
        sb.append(") LEFT JOIN contacts ON sender_contact_row_id = ");
        sb.append(a);
        sb.append(")");
        String sb2 = sb.toString();
        String[] a2 = bcbc.m88751a(bcbc.m88750a("messages", bcdx.f104021a), bcbc.m88750a("contacts", bcdt.f104018a));
        bcdn i = bcdo.m88839i();
        i.mo56715a(mo56655d(sb2));
        i.f104007a = bngx.m109370a((Object[]) a2);
        i.f104008b = "message_id =?";
        i.f104009c = bngx.m109370a((Object[]) new String[]{str});
        return m88650a(i.mo56713a(), this.f103906a, new bbzc(conversationId), bcdm.m88830a(this.f103909d, str));
    }

    /* renamed from: a */
    public final bmxv mo56614a(long j) {
        String[] strArr = {Long.toString(j)};
        String b = m88654b("o", "c");
        Cursor a = this.f103908c.mo54677a(mo56655d(b), bcbc.m88751a(bcbc.m88750a("conversations", bcdv.f104020b), bcbc.m88750a("o", bcdt.f104018a), bcbc.m88750a("c", bcdt.f104018a)), "conversations.id = ?", strArr, null, null);
        try {
            if (!a.moveToFirst()) {
                bbos.m88293c("SQLiteMessagingStore", "Conversation lookup failed");
                if (a != null) {
                    a.close();
                }
                return bmvz.f131120a;
            }
            bmxv a2 = bcbx.m88778a(a);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final bmxv mo56615a(String str, String str2) {
        Cursor a = this.f103908c.mo54677a(mo56655d("messages"), new String[]{str2}, "message_id = ?", new String[]{str}, null, null);
        try {
            if (a.moveToFirst()) {
                bmxv b = bmxv.m108566b(Long.valueOf(a.getLong(0)));
                if (a != null) {
                    a.close();
                }
                return b;
            }
            bmvz bmvz = bmvz.f131120a;
            if (a != null) {
                a.close();
            }
            return bmvz;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final bngx mo56616a(Cursor cursor) {
        bngx bngx;
        bngs j = bngx.m109377j();
        if (cursor.moveToFirst()) {
            do {
                try {
                    bmxv a = bcbx.m88778a(cursor);
                    if (!a.mo66813a()) {
                        bcnr q = bcns.m89409q();
                        q.mo57011b(10031);
                        j.mo67668c(bcbp.m88769a(q.mo57002a()));
                    } else {
                        j.mo67668c(bcbp.m88770a((bcsp) a.mo66814b()));
                    }
                } catch (Exception e) {
                    bcnr q2 = bcns.m89409q();
                    q2.mo57011b(10031);
                    j.mo67668c(bcbp.m88769a(q2.mo57002a()));
                }
            } while (cursor.moveToNext());
            bngx = j.mo67664a();
        } else {
            bngx = j.mo67664a();
        }
        bnre i = bcbz.m88785a(bngx).listIterator();
        while (i.hasNext()) {
            this.f103907b.mo56753a((bcns) i.next());
        }
        return bcbz.m88786b(bngx);
    }

    /* renamed from: a */
    public final bngx mo56617a(ConversationId conversationId, bctk bctk, long j) {
        return (bngx) bcbb.m88741a(this.f103908c, new bbzq(this, conversationId, bctk, j));
    }

    /* renamed from: a */
    public final bngx mo56618a(ConversationId conversationId, bctk bctk, bctk bctk2) {
        return (bngx) bcbb.m88741a(this.f103908c, new bbzm(this, bctk2, conversationId, bctk));
    }

    /* renamed from: a */
    public final void mo56619a() {
        SQLiteDatabase writableDatabase = this.f103913j.getWritableDatabase();
        writableDatabase.setForeignKeyConstraintsEnabled(false);
        bcaz bcaz = new bcaz(new bcaf(writableDatabase));
        bbov.m88299a();
        writableDatabase.beginTransaction();
        try {
            bcaz.call();
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.setForeignKeyConstraintsEnabled(true);
        } catch (Exception e) {
            throw new bcay("Error when executing transaction!!", e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo56620a(long j, Long l) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("update_timestamp_us", l);
        if (this.f103908c.mo54674a(mo56655d("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j)}) >= 0) {
            mo56641b();
            return;
        }
        throw new SQLiteException("Failed to update conversation.");
    }

    /* renamed from: a */
    public final void mo56621a(bcsp bcsp) {
        ((Long) bcbb.m88741a(this.f103908c, new bbze(this, bcsp))).longValue();
    }

    /* renamed from: a */
    public final void mo56622a(bctk bctk) {
        bcdp.m88848a().mo56717a(bcdm.m88831a("messages", "REGISTRATION", String.valueOf(this.f103909d), "MESSAGES_STATUS_COUNT_FOR_ACCOUNT_PATH", String.valueOf(bctk)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcas.a(bctr, boolean):void
     arg types: [bctr, int]
     candidates:
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ContactId):android.util.Pair
      bcas.a(bcdo, java.util.concurrent.Callable):bdar
      bcas.a(bcdo, bdar):void
      bcas.a(bcsp, boolean):long
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, bmxv):long
      bcas.a(int, int):bdar
      bcas.a(int, bmxz):bdar
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bcas.a(java.lang.String, java.lang.String):bmxv
      bcas.a(long, java.lang.Long):void
      bcas.a(bctr, long):void
      bcas.a(bdbe, boolean):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bdal.a(int, int):bdar
      bdal.a(int, bmxz):bdar
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bdal.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bdal.a(bctr, long):void
      bdal.a(bdbe, boolean):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bcas.a(bctr, boolean):void */
    /* renamed from: a */
    public final void mo56623a(bctr bctr) {
        m88653a(bctr, false);
    }

    /* renamed from: a */
    public final void mo56624a(bctr bctr, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp_us", Long.valueOf(j));
        bcbb.m88742a(this.f103908c, new bbzk(this, contentValues, bctr, j));
        bcrt bcrt = (bcrt) bctr;
        mo56653c(bcrt.f104743a);
        mo56660g(bcrt.f104745c);
    }

    /* renamed from: a */
    public final void mo56625a(bdbe bdbe, boolean z) {
        bcbb.m88742a(this.f103908c, new bbzv(this, z, bdbe));
    }

    /* renamed from: a */
    public final void mo56626a(bngx bngx) {
        if (!bngx.isEmpty()) {
            bnha h = bnhe.m109414h();
            HashSet hashSet = new HashSet();
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                bctr bctr = (bctr) i.next();
                ContentValues contentValues = new ContentValues();
                try {
                    byte[] a = bbqu.m88422a((Serializable) bccf.m88796a(bctr));
                    contentValues.put("rendering_type", Integer.valueOf(bctr.mo57371k().mo57200a().f104888h));
                    contentValues.put("message_properties", a);
                    contentValues.put("capability", Integer.valueOf(bctr.mo57370j()));
                    h.mo67695b(bctr.mo57359a(), contentValues);
                } catch (IOException e) {
                    bbos.m88294d("SQLiteMessagingStore", "Could not update message properties in database due to serialization error.");
                }
            }
            bcbb.m88742a(this.f103908c, new bbzp(this, bngx, h.mo67618b(), hashSet));
        }
    }

    /* renamed from: a */
    public final void mo56627a(ConversationId conversationId, long j) {
        String valueOf = String.valueOf(mo56650c(conversationId));
        Integer[] numArr = {Integer.valueOf(bctk.f104862e.f104871m), Integer.valueOf(bctk.f104863f.f104871m)};
        Integer[] numArr2 = {Integer.valueOf(bctk.f104864g.f104871m), Integer.valueOf(bctk.f104869l.f104871m)};
        String join = TextUtils.join(", ", numArr);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 82);
        sb.append("conversation_row_id = ?  AND server_timestamp_us <= ? AND message_status NOT IN (");
        sb.append(join);
        sb.append(")");
        String sb2 = sb.toString();
        String[] strArr = {valueOf, String.valueOf(j)};
        String join2 = TextUtils.join(", ", numArr2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(join2).length() + 51);
        sb3.append("conversation_row_id = ?  AND message_status IN ( ");
        sb3.append(join2);
        sb3.append(") ");
        bcbb.m88742a(this.f103908c, new bcap(this, sb2, strArr, sb3.toString(), new String[]{valueOf}, valueOf, j, conversationId));
    }

    /* renamed from: a */
    public final void mo56628a(ConversationId conversationId, long j, long j2) {
        bngx bngx = (bngx) bcbb.m88741a(this.f103908c, new bbzt(this, conversationId, j2, j));
    }

    /* renamed from: a */
    public final void mo56629a(ConversationId conversationId, long j, List list) {
        bcbb.m88742a(this.f103908c, new bbzz(this, list, j, conversationId));
    }

    /* renamed from: a */
    public final void mo56630a(ConversationId conversationId, List list) {
        bcbb.m88742a(this.f103908c, new bbzx(this, conversationId, list));
    }

    /* renamed from: a */
    public final void mo56631a(ConversationId conversationId, List list, List list2, bctk bctk) {
        bctk bctk2 = bctk;
        if (!list.isEmpty()) {
            HashSet<bctk> hashSet = new HashSet(list2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_status", Integer.valueOf(bctk2.f104871m));
            int size = (999 - hashSet.size()) - 1;
            int i = 0;
            while (i < list.size()) {
                int min = Math.min(i + size, list.size());
                List subList = list.subList(i, min);
                String[] strArr = new String[(subList.size() + hashSet.size())];
                String a = bcbc.m88744a(subList.size());
                String a2 = bcbc.m88744a(hashSet.size());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 41 + String.valueOf(a2).length());
                sb.append("message_id IN (");
                sb.append(a);
                sb.append(") AND message_status IN (");
                sb.append(a2);
                sb.append(")");
                String sb2 = sb.toString();
                subList.toArray(strArr);
                int i2 = 0;
                for (bctk bctk3 : hashSet) {
                    strArr[subList.size() + i2] = Integer.toString(bctk3.f104871m);
                    i2++;
                }
                bcbb.m88742a(this.f103908c, new bbzo(this, contentValues, sb2, strArr));
                i = min;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo56653c((String) it.next());
            }
            boolean contains = this.f103910e.contains(bctk2);
            for (bctk bctk4 : hashSet) {
                mo56622a(bctk4);
                contains = contains || this.f103910e.contains(bctk4);
            }
            mo56622a(bctk2);
            if (contains) {
                mo56661h(conversationId);
            }
            mo56660g(conversationId);
        }
    }

    /* renamed from: a */
    public final void mo56632a(Notification notification) {
        if (((Boolean) bbqt.m88417a(this.f103906a).f103080B.mo58455c()).booleanValue()) {
            bcbb.m88742a(this.f103908c, new bcac(this, notification));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    public final void mo56633a(List list) {
        ContentValues contentValues = new ContentValues();
        int i = 0;
        contentValues.put("needs_delivery_receipt", (Boolean) false);
        while (i < list.size()) {
            int min = Math.min(i + 998, list.size());
            List subList = list.subList(i, min);
            String[] strArr = new String[subList.size()];
            String a = bcbc.m88744a(subList.size());
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 16);
            sb.append("message_id IN (");
            sb.append(a);
            sb.append(")");
            String sb2 = sb.toString();
            subList.toArray(strArr);
            bcbb.m88742a(this.f103908c, new bbzs(this, contentValues, sb2, strArr));
            i = min;
        }
    }

    /* renamed from: a */
    public final void mo56634a(List list, bctk bctk, bctk bctk2) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((bctr) it.next()).mo57359a());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_status", Integer.valueOf(bctk2.f104871m));
            boolean z = false;
            int i = 0;
            while (i < arrayList.size()) {
                int min = Math.min(i + 997, arrayList.size());
                List subList = arrayList.subList(i, min);
                String[] strArr = new String[(subList.size() + 1)];
                subList.toArray(strArr);
                strArr[subList.size()] = Integer.toString(bctk.f104871m);
                bcbb.m88741a(this.f103908c, new bbzl(this, contentValues, subList, strArr));
                i = min;
            }
            HashSet<ConversationId> hashSet = new HashSet();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                bctr bctr = (bctr) it2.next();
                hashSet.add(bctr.mo57361c());
                mo56653c(bctr.mo57359a());
            }
            if (this.f103910e.contains(bctk2) || this.f103910e.contains(bctk)) {
                z = true;
            }
            for (ConversationId conversationId : hashSet) {
                mo56660g(conversationId);
                if (z) {
                    mo56661h(conversationId);
                }
            }
            mo56622a(bctk);
            mo56622a(bctk2);
        }
    }

    /* renamed from: a */
    public final boolean mo56635a(ConversationId conversationId, bngx bngx, long j) {
        return ((Boolean) bcbb.m88741a(this.f103908c, new bbzn(this, conversationId, bngx, j))).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo56636a(String str) {
        return ((Boolean) bcbb.m88741a(this.f103908c, new bbyz(this, str))).booleanValue();
    }
}
