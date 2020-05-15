package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.data.RegistrationEntity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: azcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcv {

    /* renamed from: b */
    public static final LocalEntityId f99014b = new LocalEntityId("anonymous", 8, "MS");

    /* renamed from: c */
    private static WeakReference f99015c = new WeakReference(null);

    /* renamed from: a */
    public final Context f99016a;

    public azcv(Context context) {
        this.f99016a = context;
    }

    /* renamed from: a */
    public static synchronized azcv m85357a(Context context) {
        azcv azcv;
        synchronized (azcv.class) {
            azcv = (azcv) f99015c.get();
            if (azcv == null) {
                azcv = new azcv(context.getApplicationContext());
                f99015c = new WeakReference(azcv);
            }
        }
        return azcv;
    }

    /* renamed from: b */
    static final LocalEntityId m85359b(azct azct) {
        LocalEntityId localEntityId = null;
        if (azct != null) {
            List<LocalEntityId> list = azct.f99010g;
            if (!list.isEmpty()) {
                for (LocalEntityId localEntityId2 : list) {
                    if (localEntityId == null || localEntityId.f111075b != 7) {
                        localEntityId = localEntityId2;
                    }
                }
            }
        }
        return localEntityId;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azcv.a(android.net.Uri, boolean):void
     arg types: [android.net.Uri, int]
     candidates:
      azcv.a(byte[], java.util.List):void
      azcv.a(android.net.Uri, boolean):void */
    /* renamed from: c */
    public final azct mo54699c(LocalEntityId localEntityId) {
        if (localEntityId == null) {
            return null;
        }
        azct d = mo54701d(localEntityId);
        if (d != null) {
            return d;
        }
        if (localEntityId.mo60372c()) {
            Uri b = DatabaseProvider.m94533b(localEntityId);
            try {
                m85358a(b, true);
                Cursor query = this.f99016a.getContentResolver().query(b, null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    azct a = azcm.m85301a(query);
                    query.close();
                    Uri a2 = DatabaseProvider.m94520a(a.f99004a);
                    try {
                        m85358a(a2, true);
                        Cursor query2 = this.f99016a.getContentResolver().query(a2, null, null, null, null);
                        if (query2 != null && query2.moveToFirst()) {
                            azcm.m85305a(a.f99010g, query2);
                            query2.close();
                            return a;
                        }
                    } catch (IllegalArgumentException e) {
                        azoj.m85931a("AccountMngr", e, "got exception while reading users", new Object[0]);
                    } finally {
                        m85358a(a2, false);
                    }
                }
            } catch (IllegalArgumentException e2) {
                new Object[1][0] = e2;
            } finally {
                m85358a(b, false);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final azct mo54701d(LocalEntityId localEntityId) {
        if (bmxi.m108538a(localEntityId, f99014b)) {
            azct azct = new azct();
            azct.f99004a = null;
            azct.f99005b = azdl.m85412a(this.f99016a).mo54804z();
            azct.f99006c = azdl.m85412a(this.f99016a).f99088a.getLong("anonymous_registration_auth_expiration_timestamp_ms", 0);
            azdl.m85412a(this.f99016a).mo54791m();
            azct.f99008e = azdl.m85412a(this.f99016a).mo54729C();
            azct.f99007d = azdl.m85412a(this.f99016a).mo54728B();
            azeg.m85519a();
            azct.f99009f = azeg.m85520b(this.f99016a);
            azct.f99011h = 1;
            azct.f99012i = 0;
            azct.f99010g = Collections.singletonList(localEntityId);
            return azct;
        }
        azdl.m85412a(this.f99016a);
        if (!azdl.m85420h(this.f99016a) || localEntityId.f111075b != 1 || !TextUtils.equals(localEntityId.f111074a, azdl.m85412a(this.f99016a).mo54738a())) {
            return null;
        }
        azct azct2 = new azct();
        azct2.f99004a = null;
        azct2.f99005b = azdl.m85412a(this.f99016a).mo54760c();
        azct2.f99006c = azdl.m85412a(this.f99016a).mo54761d();
        azdl.m85412a(this.f99016a).mo54791m();
        azct2.f99008e = azdl.m85412a(this.f99016a).mo54789k();
        azct2.f99007d = azdl.m85412a(this.f99016a).mo54790l();
        azeg.m85519a();
        azct2.f99009f = azeg.m85520b(this.f99016a);
        azct2.f99011h = 2;
        azct2.f99012i = azdl.m85412a(this.f99016a).mo54779h();
        azct2.f99010g = Collections.singletonList(localEntityId);
        return azct2;
    }

    /* renamed from: e */
    public final int mo54703e(LocalEntityId localEntityId) {
        if (localEntityId.f111075b != 1) {
            azcm a = azcm.m85300a(this.f99016a);
            int i = -1;
            if (a.mo54658b()) {
                byte[] a2 = a.mo54654a(localEntityId);
                if (a2 == null) {
                    i = 0;
                } else if (a.mo54658b()) {
                    a.f98996b.beginTransaction();
                    try {
                        a.f98996b.delete("user", "registration_id = ?", new String[]{azpi.m86066a(a2)});
                        i = a.f98996b.delete("registration", "server_registration_id = ?", new String[]{azpi.m86066a(a2)});
                        a.f98996b.setTransactionSuccessful();
                    } finally {
                        a.f98996b.endTransaction();
                    }
                }
            }
            Object[] objArr = {Integer.valueOf(i), localEntityId};
            if (i > 0) {
                mo54705f(localEntityId);
                mo54697b();
            }
            return i;
        } else if (!azdl.m85412a(this.f99016a).mo54775f() || !TextUtils.equals(azdl.m85412a(this.f99016a).mo54738a(), localEntityId.f111074a)) {
            return 0;
        } else {
            new Object[1][0] = localEntityId;
            azdl.m85412a(this.f99016a).mo54763d((String) null);
            azdl.m85412a(this.f99016a).mo54741a((cblx) null);
            azdl.m85412a(this.f99016a).mo54744a((Set) null);
            azdl.m85412a(this.f99016a).mo54772f((String) null);
            azdl.m85412a(this.f99016a).mo54747a((int[]) null);
            azdl.m85412a(this.f99016a).mo54745a(false);
            mo54705f(localEntityId);
            mo54697b();
            return 1;
        }
    }

    /* renamed from: f */
    public final void mo54705f(LocalEntityId localEntityId) {
        azqf.m86130a(this.f99016a);
        if (!azqf.m86149c() || azdl.m85412a(this.f99016a).mo54735I()) {
            azqf.m86130a(this.f99016a);
            Object[] objArr = {Boolean.valueOf(azqf.m86149c()), Boolean.valueOf(azdl.m85412a(this.f99016a).mo54735I())};
        } else if (!TextUtils.isEmpty(localEntityId.f111074a)) {
            bbps c = azbj.m85193a(this.f99016a).mo54563c();
            try {
                azqf.m86130a(this.f99016a);
                bmxv bmxv = (bmxv) c.mo56342c(azqf.m86135a(localEntityId)).get();
                if (bmxv.mo66813a()) {
                    bqgg a = c.mo56340a((bcoh) bmxv.mo66814b());
                    azpw.m86109a(this.f99016a).mo55196a((bcoh) bmxv.mo66814b());
                    if (((bbpr) a.get()).mo56293a() == 2) {
                        azoj.m85933c("AccountMngr", "Failed to delete registration from Lighter", new Object[0]);
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                azoj.m85933c("AccountMngr", "Failed to delete registration from Lighter", new Object[0]);
            }
        }
    }

    /* renamed from: g */
    public final LocalEntityId mo54706g(LocalEntityId localEntityId) {
        LocalEntityId b = m85359b(mo54699c(localEntityId));
        return b != null ? b : localEntityId;
    }

    /* renamed from: h */
    public final String mo54707h(LocalEntityId localEntityId) {
        int i = localEntityId.f111075b;
        if (i == 1) {
            Cursor query = this.f99016a.getContentResolver().query(DatabaseProvider.m94537c(localEntityId), null, null, null, null);
            if (query == null || !query.moveToFirst()) {
                return null;
            }
            String string = query.getString(query.getColumnIndex("id"));
            query.close();
            return string;
        } else if (i != 7) {
            return null;
        } else {
            return localEntityId.f111074a;
        }
    }

    /* renamed from: a */
    private final void m85358a(Uri uri, boolean z) {
        String nameForUid = this.f99016a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid == null) {
            return;
        }
        if (!z) {
            this.f99016a.revokeUriPermission(uri, 1);
        } else {
            this.f99016a.grantUriPermission(nameForUid, uri, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54697b() {
        Executor executor = azox.f99803a;
        int size = azcm.m85300a(this.f99016a).mo54669g().size();
        azdl a = azdl.m85412a(this.f99016a);
        int i = 0;
        boolean z = size != 0;
        SharedPreferences.Editor edit = a.f99088a.edit();
        edit.putBoolean("tachyon_gaia_registration_status", z);
        edit.apply();
        SharedPreferences.Editor edit2 = azdl.m85412a(this.f99016a).f99088a.edit();
        edit2.putInt("num_gaia_registrations", size);
        edit2.apply();
        new Object[1][0] = Integer.valueOf(size);
        if (!azdl.m85412a(this.f99016a).mo54770e()) {
            azdl.m85412a(this.f99016a).mo54754b((byte[]) null);
            azdl.m85412a(this.f99016a).mo54746a((byte[]) null);
            if (cfeo.m138846C()) {
                azbx.m85232a(this.f99016a).mo54585b();
            }
        }
        azdl.m85412a(this.f99016a);
        String d = azdl.m85416d(this.f99016a);
        azdl.m85412a(this.f99016a);
        int e = azdl.m85417e(this.f99016a);
        List f = azcm.m85300a(this.f99016a).mo54667f();
        azdl.m85412a(this.f99016a);
        if (azdl.m85420h(this.f99016a)) {
            azdl.m85412a(this.f99016a);
            f.add(new LocalEntityId(azdl.m85414b(this.f99016a), 1, "MS"));
        }
        Collections.sort(f, azcq.f99001a);
        if (!TextUtils.isEmpty(d) && e != 0) {
            int size2 = f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                LocalEntityId localEntityId = (LocalEntityId) f.get(i2);
                if (bmxi.m108538a(localEntityId.f111074a, d) && bmxi.m108538a(Integer.valueOf(localEntityId.f111075b), Integer.valueOf(e))) {
                    break;
                }
                i2++;
            }
        }
        int size3 = f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                azdl.m85412a(this.f99016a).mo54752b((String) null);
                azdl.m85412a(this.f99016a).mo54739a(0);
                break;
            }
            LocalEntityId localEntityId2 = (LocalEntityId) f.get(i3);
            i3++;
            if (localEntityId2.f111075b == 1) {
                azdl.m85412a(this.f99016a).mo54752b(localEntityId2.f111074a);
                azdl.m85412a(this.f99016a).mo54739a(1);
                break;
            }
        }
        azdl.m85412a(this.f99016a);
        String c = azdl.m85415c(this.f99016a);
        List f2 = azcm.m85300a(this.f99016a).mo54667f();
        if (!TextUtils.isEmpty(c)) {
            int size4 = f2.size();
            int i4 = 0;
            while (i4 < size4) {
                LocalEntityId localEntityId3 = (LocalEntityId) f2.get(i4);
                if (!bmxi.m108538a(localEntityId3.f111074a, c) || localEntityId3.f111075b != 7) {
                    i4++;
                } else {
                    return;
                }
            }
        }
        int size5 = f2.size();
        while (i < size5) {
            LocalEntityId localEntityId4 = (LocalEntityId) f2.get(i);
            i++;
            if (localEntityId4.f111075b == 7) {
                azdl.m85412a(this.f99016a).mo54757c(localEntityId4.f111074a);
                return;
            }
        }
        azdl.m85412a(this.f99016a).mo54757c((String) null);
    }

    /* renamed from: a */
    public final azcs mo54689a(LocalEntityId localEntityId) {
        azox.m85982b();
        if (localEntityId != null && localEntityId.mo60372c()) {
            if (bmxi.m108538a(localEntityId, f99014b)) {
                byte[] z = azdl.m85412a(this.f99016a).mo54804z();
                if (azfn.m85587b(z)) {
                    return new azcs(z, 1);
                }
                return null;
            } else if (azdl.m85412a(this.f99016a).mo54775f() && bmxi.m108538a(localEntityId.f111074a, azdl.m85412a(this.f99016a).mo54738a()) && localEntityId.f111075b == 1) {
                return new azcs(azdl.m85412a(this.f99016a).mo54760c(), 2);
            } else {
                try {
                    Cursor query = this.f99016a.getContentResolver().query(DatabaseProvider.m94518a(localEntityId), null, null, null, null);
                    if (query == null || !query.moveToFirst()) {
                        return null;
                    }
                    azpi.m86073a(query.getString(query.getColumnIndex("server_registration_id")));
                    azcs azcs = new azcs(query.getBlob(query.getColumnIndex("auth_token")), query.getInt(query.getColumnIndex("account_type")));
                    query.close();
                    return azcs;
                } catch (IllegalArgumentException e) {
                    new Object[1][0] = e;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final LocalEntityId mo54700c() {
        azct a;
        azox.m85982b();
        List g = azcm.m85300a(this.f99016a).mo54669g();
        int size = g.size();
        LocalEntityId localEntityId = null;
        long j = 0;
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) g.get(i);
            if (!(bArr == null || (a = mo54690a(bArr)) == null || a.f99011h == 1 || a.f99006c <= j || a.f99010g.isEmpty())) {
                j = a.f99006c;
                localEntityId = (LocalEntityId) a.f99010g.get(0);
            }
        }
        if (azdl.m85412a(this.f99016a).mo54775f() && azdl.m85412a(this.f99016a).mo54761d() > j) {
            localEntityId = new LocalEntityId(azdl.m85412a(this.f99016a).mo54738a(), 1, "MS");
        }
        return localEntityId == null ? f99014b : localEntityId;
    }

    /* renamed from: d */
    public final List mo54702d() {
        ArrayList arrayList = new ArrayList();
        List g = azcm.m85300a(this.f99016a).mo54669g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            LocalEntityId b = m85359b(mo54690a((byte[]) g.get(i)));
            if (b != null) {
                arrayList.add(b);
            }
        }
        azdl.m85412a(this.f99016a);
        if (azdl.m85420h(this.f99016a)) {
            azdl.m85412a(this.f99016a);
            String b2 = azdl.m85414b(this.f99016a);
            if (b2 != null) {
                arrayList.add(new LocalEntityId(b2, 1, "MS"));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a7 A[LOOP:1: B:14:0x00a5->B:15:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x006d  */
    /* renamed from: e */
    public final List mo54704e() {
        int size;
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f99016a.getContentResolver().query(DatabaseProvider.m94544h("user"), new String[]{"id", "type", "app_id", "registration_id"}, null, null, null);
        if (query == null || !query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            Collections.sort(arrayList, new azcr());
            ArrayList arrayList2 = new ArrayList();
            azdl.m85412a(this.f99016a);
            if (azdl.m85420h(this.f99016a)) {
                azdl.m85412a(this.f99016a);
                String b = azdl.m85414b(this.f99016a);
                if (b != null) {
                    arrayList2.add(new LocalEntityId(b, 1, "MS"));
                }
            }
            size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add((LocalEntityId) ((Pair) arrayList.get(i)).first);
            }
            return arrayList2;
        }
        do {
            arrayList.add(new Pair(new LocalEntityId(query.getString(query.getColumnIndex("id")), query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("app_id"))), query.getString(query.getColumnIndex("registration_id"))));
        } while (query.moveToNext());
        if (query != null) {
        }
        Collections.sort(arrayList, new azcr());
        ArrayList arrayList22 = new ArrayList();
        azdl.m85412a(this.f99016a);
        if (azdl.m85420h(this.f99016a)) {
        }
        size = arrayList.size();
        while (i < size) {
        }
        return arrayList22;
    }

    /* renamed from: a */
    public final azct mo54690a(byte[] bArr) {
        return azcm.m85300a(this.f99016a).mo54656b(bArr);
    }

    /* renamed from: a */
    public final LocalEntityId mo54691a() {
        azdl.m85412a(this.f99016a);
        if (!azdl.m85418f(this.f99016a)) {
            return null;
        }
        azdl.m85412a(this.f99016a);
        String c = azdl.m85415c(this.f99016a);
        if (!TextUtils.isEmpty(c)) {
            return new LocalEntityId(c, 7, "MS");
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo54698b(LocalEntityId localEntityId) {
        azct c;
        if (cfec.m138765b()) {
            return localEntityId == null || (c = mo54699c(localEntityId)) == null || !c.mo54688a();
        }
        azdl a = azdl.m85412a(this.f99016a);
        return !a.mo54770e() || TextUtils.isEmpty(a.mo54738a()) || a.mo54790l() == null || a.mo54789k() == null || a.mo54760c() == null;
    }

    /* renamed from: a */
    public final LocalEntityId mo54692a(boolean z) {
        azdl.m85412a(this.f99016a);
        if (azdl.m85418f(this.f99016a)) {
            azdl.m85412a(this.f99016a);
            String d = azdl.m85416d(this.f99016a);
            if (!TextUtils.isEmpty(d)) {
                azdl.m85412a(this.f99016a);
                return new LocalEntityId(d, azdl.m85417e(this.f99016a), "MS");
            } else if (z) {
                return f99014b;
            } else {
                return null;
            }
        } else {
            azdl.m85412a(this.f99016a);
            if (azdl.m85420h(this.f99016a)) {
                azdl.m85412a(this.f99016a);
                return new LocalEntityId(azdl.m85414b(this.f99016a), 1, "MS");
            } else if (z) {
                return f99014b;
            } else {
                return null;
            }
        }
    }

    /* renamed from: a */
    public final void mo54693a(azct azct) {
        azqf.m86130a(this.f99016a);
        if (!azqf.m86149c() || azdl.m85412a(this.f99016a).mo54735I()) {
            azqf.m86130a(this.f99016a);
            Object[] objArr = {Boolean.valueOf(azqf.m86149c()), Boolean.valueOf(azdl.m85412a(this.f99016a).mo54735I())};
        } else if (azct != null) {
            azbr.m85217a(this.f99016a, azct);
        }
    }

    /* renamed from: a */
    public final void mo54694a(ArrayList arrayList) {
        azdl.m85412a(this.f99016a);
        String b = azdl.m85414b(this.f99016a);
        if (!TextUtils.isEmpty(b)) {
            RegistrationEntity registrationEntity = new RegistrationEntity();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new LocalEntityId(b, 1, "MS"));
            registrationEntity.f111078b = arrayList2;
            arrayList.add(registrationEntity);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo54695a(List list, String str, cblx cblx, long j, int i, civt civt, List list2, byte[] bArr, afiv afiv, long j2) {
        SQLiteDatabase sQLiteDatabase;
        List list3 = list;
        cblx cblx2 = cblx;
        civt civt2 = civt;
        byte[] bArr2 = bArr;
        long j3 = j2;
        int i2 = 2;
        if (i == 2) {
            azdl.m85412a(this.f99016a).mo54763d(((LocalEntityId) list3.get(0)).f111074a);
            azdl.m85412a(this.f99016a).mo54742a("466216207879");
            azdl.m85412a(this.f99016a).mo54741a(cblx2);
            azdl.m85412a(this.f99016a).mo54754b(civt2.f191541b.f191538a);
            azdl.m85412a(this.f99016a).mo54746a(civt2.f191540a.mo86595a());
            azdl.m85412a(this.f99016a).mo54749b(1);
            azdl.m85412a(this.f99016a).mo54750b(j3);
            azdl.m85412a(this.f99016a).mo54747a(bqcn.m112584a(list2));
            azdl.m85412a(this.f99016a).mo54745a(true);
            mo54693a(mo54701d((LocalEntityId) list3.get(0)));
            mo54697b();
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            LocalEntityId localEntityId = (LocalEntityId) list3.get(i3);
            if (localEntityId.f111075b == 1 && azdl.m85412a(this.f99016a).mo54775f() && TextUtils.equals(azdl.m85412a(this.f99016a).mo54738a(), localEntityId.f111074a)) {
                mo54703e(localEntityId);
            }
            i3++;
            i2 = 2;
        }
        azdl.m85412a(this.f99016a).mo54754b(civt2.f191541b.f191538a);
        azdl.m85412a(this.f99016a).mo54746a(civt2.f191540a.mo86595a());
        azdl.m85412a(this.f99016a).mo54749b(1);
        azcm a = azcm.m85300a(this.f99016a);
        byte[] k = cblx2.f177577a.mo73780k();
        byte[] a2 = civt2.f191540a.mo86595a();
        byte[] bArr3 = civt2.f191541b.f191538a;
        int[] a3 = bqcn.m112584a(list2);
        long micros = TimeUnit.MILLISECONDS.toMicros(j3);
        if (a.mo54658b()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id_key_type", (Integer) 1);
            contentValues.put("id_key_public", a2);
            contentValues.put("id_key_private", bArr3);
            contentValues.put("capabilities", azpi.m86067a(a3));
            contentValues.put("gcm_token", str);
            contentValues.put("account_type", (Integer) 3);
            contentValues.put("status", Integer.valueOf(i2));
            contentValues.put("auth_token", k);
            contentValues.put("auth_token_expiration_timestamp_ms", Long.valueOf(j));
            contentValues.put("last_token_refresh_timestamp_us", Long.valueOf(micros));
            if (afiv != null) {
                contentValues.put("deletion_policy", afiv.mo73642k());
            }
            a.f98996b.beginTransaction();
            try {
                if (!a.mo54653a(bArr2, contentValues)) {
                    a.f98996b.endTransaction();
                    contentValues.put("server_registration_id", azpi.m86066a(bArr));
                    a.f98996b.beginTransaction();
                    try {
                        if (a.f98996b.insert("registration", null, contentValues) == -1) {
                            azoj.m85933c("DatabaseOperations", "Failed to add new registration", new Object[0]);
                            sQLiteDatabase = a.f98996b;
                            sQLiteDatabase.endTransaction();
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            a.mo54648a((LocalEntityId) it.next(), bArr2);
                        }
                        a.f98996b.setTransactionSuccessful();
                    } catch (Exception e) {
                        azoj.m85931a("DatabaseOperations", e, "Failed to insert new registration and corresponding users into database.", new Object[0]);
                        sQLiteDatabase = a.f98996b;
                    } catch (Throwable th) {
                        a.f98996b.endTransaction();
                        throw th;
                    }
                } else {
                    a.mo54650a(bArr2, list3);
                    a.f98996b.setTransactionSuccessful();
                    a.f98996b.endTransaction();
                }
                mo54693a(azcm.m85300a(this.f99016a).mo54656b(bArr2));
                mo54697b();
            } catch (Exception e2) {
                azoj.m85931a("DatabaseOperations", e2, "Failed to update existing registration corresponding users.", new Object[0]);
            } finally {
                a.f98996b.endTransaction();
            }
        }
    }

    /* renamed from: a */
    public final void mo54696a(byte[] bArr, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LocalEntityId localEntityId = (LocalEntityId) list.get(i);
            if (localEntityId.f111075b == 1 && azdl.m85412a(this.f99016a).mo54775f() && TextUtils.equals(azdl.m85412a(this.f99016a).mo54738a(), localEntityId.f111074a)) {
                mo54703e(localEntityId);
            }
        }
        azcm.m85300a(this.f99016a).mo54650a(bArr, list);
        mo54693a(azcm.m85300a(this.f99016a).mo54656b(bArr));
        mo54697b();
        azbv.m85222a(this.f99016a);
    }
}
