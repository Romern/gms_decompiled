package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bcav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcav implements bdaw {

    /* renamed from: a */
    public final bdae f103920a;

    /* renamed from: b */
    private final Context f103921b;

    public bcav(Context context, bdae bdae) {
        this.f103921b = context;
        this.f103920a = bdae;
    }

    /* renamed from: a */
    private final Cursor m88719a(String[] strArr, String str, String[] strArr2) {
        bdae bdae = this.f103920a;
        String a = bcbc.m88745a("reachability", "registration_id");
        String a2 = bcbc.m88745a("registration", "registration_id");
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 43 + String.valueOf(a2).length());
        sb.append("reachability INNER JOIN registration ON ");
        sb.append(a);
        sb.append(" = ");
        sb.append(a2);
        return bdae.mo54677a(mo56666a(sb.toString()), strArr, str, strArr2, null, null);
    }

    /* renamed from: b */
    public final Cursor mo56672b(ContactId contactId) {
        String[] strArr = new String[3];
        strArr[0] = contactId.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(contactId.mo60492a()) : contactId.mo60492a();
        strArr[1] = String.valueOf(contactId.mo60494c().f111365f);
        strArr[2] = contactId.mo60493b();
        return m88719a(bcbc.m88750a("registration", bcee.f104026a), "reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?", strArr);
    }

    /* renamed from: b */
    public final boolean mo56673b(bcoh bcoh) {
        ContactId e = bcoh.mo57058b().mo57074e();
        try {
            bdae bdae = this.f103920a;
            Uri a = mo56666a("registration");
            String a2 = bcbc.m88745a("reachability", "registration_id");
            String a3 = bcbc.m88745a("registration", "registration_id");
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 203 + String.valueOf(a3).length());
            sb.append("registration.registration_id IN (SELECT registration.registration_id FROM reachability INNER JOIN registration ON ");
            sb.append(a2);
            sb.append(" = ");
            sb.append(a3);
            sb.append(" WHERE ");
            sb.append("reachability_normalized_id");
            sb.append(" =? AND ");
            sb.append("reachability_type");
            sb.append(" =? AND ");
            sb.append("tachyon_app_name");
            sb.append(" =?)");
            String sb2 = sb.toString();
            String[] strArr = new String[3];
            strArr[0] = e.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(e.mo60492a()) : e.mo60492a();
            strArr[1] = String.valueOf(e.mo60494c().f111365f);
            strArr[2] = e.mo60493b();
            bdae.mo54675a(a, sb2, strArr);
            return true;
        } catch (SQLException e2) {
            bbos.m88292b("SQLiteRegStore", "Failed to delete Registration.", e2);
            return false;
        }
    }

    /* renamed from: a */
    private final void m88720a(long j, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ContactId contactId = (ContactId) it.next();
            try {
                bdae bdae = this.f103920a;
                Uri a = mo56666a("reachability");
                String[] strArr = new String[2];
                strArr[0] = Long.toString(j);
                strArr[1] = contactId.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(contactId.mo60492a()) : contactId.mo60492a();
                bdae.mo54675a(a, "registration_id =? AND reachability_normalized_id =? ", strArr);
            } catch (SQLException e) {
                bbos.m88292b("SQLiteRegStore", "Failed to delete Registration.", e);
            }
        }
    }

    /* renamed from: a */
    public final long mo56664a(bcoh bcoh, bcoz bcoz) {
        return ((Long) bcbb.m88741a(this.f103920a, new bcat(this, bcoh, bcoz))).longValue();
    }

    /* renamed from: a */
    public final Cursor mo56665a(bcol bcol) {
        Cursor b = mo56672b(bcol.mo57074e());
        bnre i = bcol.mo57075f().listIterator();
        while (i.hasNext()) {
            ContactId contactId = (ContactId) i.next();
            if (b.moveToFirst()) {
                break;
            }
            b = mo56672b(contactId);
        }
        return b;
    }

    /* renamed from: a */
    public final Uri mo56666a(String str) {
        return bcbc.m88743a(String.valueOf(this.f103921b.getPackageName()).concat(".lighter.data"), "REGISTRATION", str, new String[0]);
    }

    /* renamed from: a */
    public final bmxv mo56667a(long j) {
        bmxy.m108600b(this.f103920a.mo54680c());
        Cursor a = m88719a(bcbc.m88751a(bcbc.m88750a("registration", bcee.f104026a), bcbc.m88750a("reachability", bcec.f104025a)), "registration.registration_id =? ", new String[]{Long.toString(j)});
        try {
            if (a.moveToFirst()) {
                String string = a.getString(a.getColumnIndex("tachyon_app_name"));
                long j2 = a.getLong(a.getColumnIndex("registration_id"));
                byte[] blob = a.getBlob(a.getColumnIndex("server_registration_id"));
                int i = a.getInt(a.getColumnIndex("server_registration_status"));
                bcok g = bcol.m89477g();
                g.mo57068c(string);
                HashSet hashSet = new HashSet();
                do {
                    String string2 = a.getString(a.getColumnIndex("reachability_id"));
                    int ordinal = ContactId.ContactType.m94837a(a.getInt(a.getColumnIndex("reachability_type"))).ordinal();
                    if (ordinal == 1) {
                        hashSet.add(string2);
                    } else if (ordinal == 2) {
                        g.mo57067b(string2);
                    } else if (ordinal == 4) {
                        g.mo57065a(string2);
                    }
                } while (a.moveToNext());
                g.mo57066a(hashSet);
                bcoe f = bcoh.m89462f();
                f.mo57052a(j2);
                f.mo57056a(ByteString.m123261a(blob));
                f.mo57054a(g);
                f.mo57053a(bcog.m89460a(i));
                bmxv b = bmxv.m108566b(f.mo57051a());
                if (a != null) {
                    a.close();
                }
                return b;
            }
            if (a != null) {
                a.close();
            }
            return bmvz.f131120a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final bmxv mo56668a(bcoh bcoh) {
        Cursor a = mo56665a(bcoh.mo57058b());
        try {
            if (a.moveToFirst()) {
                bcow f = bcoz.m89553f();
                f.f104648a = Long.valueOf(a.getLong(bced.m88857a(4)));
                f.f104649b = Long.valueOf(a.getLong(bced.m88857a(10)));
                f.mo57126a(bbou.m88297a(a.getBlob(bced.m88857a(3))));
                bmxv a2 = bccg.m88799a(a.getBlob(bced.m88857a(6)), a.getBlob(bced.m88857a(7)));
                if (a2.mo66813a()) {
                    f.mo57127a((KeyPair) a2.mo66814b());
                }
                bmxv b = bmxv.m108566b(f.mo57125a());
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
    public final bmxv mo56669a(ContactId contactId) {
        Cursor b;
        this.f103920a.mo54678a();
        try {
            bmxv bmxv = bmvz.f131120a;
            b = mo56672b(contactId);
            if (b.moveToFirst()) {
                bmxv = mo56667a((long) b.getInt(bced.m88857a(1)));
            }
            if (b != null) {
                b.close();
            }
            this.f103920a.mo54681d();
            this.f103920a.mo54679b();
            return bmxv;
        } catch (Exception e) {
            try {
                throw new SQLException("Error when executing transaction!!", e);
            } catch (Throwable th) {
                this.f103920a.mo54679b();
                throw th;
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo56670a(long j, bcol bcol) {
        bmxv a = mo56667a(j);
        HashSet<ContactId> a2 = bnpf.m110049a(bcol.mo57075f());
        if (a.mo66813a()) {
            HashSet a3 = bnpf.m110049a(((bcoh) a.mo66814b()).mo57058b().mo57075f());
            a3.removeAll(a2);
            m88720a(j, a3);
        }
        for (ContactId contactId : a2) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("reachability_id", contactId.mo60492a());
            contentValues.put("reachability_normalized_id", contactId.mo60494c() == ContactId.ContactType.EMAIL ? bboo.m88285a(contactId.mo60492a()) : contactId.mo60492a());
            contentValues.put("reachability_type", Integer.valueOf(contactId.mo60494c().f111365f));
            contentValues.put("registration_id", Long.valueOf(j));
            this.f103920a.mo54676a(mo56666a("reachability"), contentValues, 5);
        }
    }

    /* renamed from: a */
    public final boolean mo56671a(ContactId contactId, ContentValues contentValues) {
        return ((Boolean) bcbb.m88741a(this.f103920a, new bcau(this, contactId, contentValues))).booleanValue();
    }
}
