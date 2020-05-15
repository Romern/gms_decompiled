package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: fkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkh extends fkj {

    /* renamed from: a */
    public final flb f16778a;

    public fkh(fkm fkm, fkn fkn) {
        super(fkm);
        sdo.m34959a(fkn);
        this.f16778a = new flb(fkm, fkn);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
     arg types: [java.lang.String, long]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0149  */
    /* renamed from: a */
    public final long mo10919a(fko fko) {
        long j;
        long j2;
        fko fko2 = fko;
        mo10954t();
        sdo.m34959a(fko);
        fje.m11804a();
        flb flb = this.f16778a;
        sdo.m34959a(fko);
        flb.mo10954t();
        fje.m11804a();
        String str = null;
        try {
            flb.f16836b.mo10981b();
            fkv fkv = flb.f16836b;
            String str2 = fko2.f16802a;
            sdo.m34977c(str2);
            fkv.mo10954t();
            fje.m11804a();
            int delete = fkv.mo10986w().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", str2});
            if (delete > 0) {
                fkv.mo10926a("Deleted property records", Integer.valueOf(delete));
            }
            fkv fkv2 = flb.f16836b;
            String str3 = fko2.f16802a;
            String str4 = fko2.f16803b;
            sdo.m34977c(str3);
            sdo.m34977c(str4);
            fkv2.mo10954t();
            fje.m11804a();
            j = fkv2.mo10978a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str3, str4});
            fko2.f16805d = 1 + j;
            fkv fkv3 = flb.f16836b;
            sdo.m34959a(fko);
            fkv3.mo10954t();
            fje.m11804a();
            SQLiteDatabase w = fkv3.mo10986w();
            Map map = fko2.f16806e;
            sdo.m34959a(map);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", (Long) 0L);
            contentValues.put("cid", fko2.f16802a);
            contentValues.put("tid", fko2.f16803b);
            contentValues.put("adid", Integer.valueOf(fko2.f16804c ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(fko2.f16805d));
            contentValues.put("params", encodedQuery);
            try {
                long insertWithOnConflict = w.insertWithOnConflict("properties", null, contentValues, 5);
                j2 = -1;
                if (insertWithOnConflict == -1) {
                    try {
                        fkv3.mo10942g("Failed to insert/update a property (got -1)");
                    } catch (SQLiteException e) {
                        e = e;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                j2 = -1;
                try {
                    fkv3.mo10938e("Error storing a property", e);
                    flb.f16836b.mo10982c();
                    flb.f16836b.mo10984d();
                } catch (SQLiteException e3) {
                    e = e3;
                    try {
                        flb.mo10938e("Failed to update Analytics property", e);
                        try {
                            flb.f16836b.mo10984d();
                            j = j2;
                        } catch (SQLiteException e4) {
                            flb.mo10938e("Failed to end transaction", e4);
                            j = j2;
                        }
                        if (j == 0) {
                        }
                        return j;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        try {
                            flb.f16836b.mo10984d();
                        } catch (SQLiteException e5) {
                            flb.mo10938e("Failed to end transaction", e5);
                        }
                        throw th2;
                    }
                }
                if (j == 0) {
                }
                return j;
            }
            flb.f16836b.mo10982c();
            try {
                flb.f16836b.mo10984d();
            } catch (SQLiteException e6) {
                flb.mo10938e("Failed to end transaction", e6);
            }
        } catch (SQLiteException e7) {
            e = e7;
            j2 = -1;
            flb.mo10938e("Failed to update Analytics property", e);
            flb.f16836b.mo10984d();
            j = j2;
            if (j == 0) {
            }
            return j;
        }
        if (j == 0) {
            flb flb2 = this.f16778a;
            fje.m11804a();
            flb2.mo10929b("Sending first hit to property", fko2.f16803b);
            fny n = flb2.mo10949n();
            fof fof = new fof(n.mo10936e(), n.mo11050b());
            flb2.mo10943h();
            if (!fof.mo11060a(((Long) fni.f16915A.mo11021a()).longValue())) {
                fny n2 = flb2.mo10949n();
                fje.m11804a();
                n2.mo10954t();
                String string = n2.f16989a.getString("installation_campaign", null);
                if (!TextUtils.isEmpty(string)) {
                    str = string;
                }
                if (!TextUtils.isEmpty(str)) {
                    fjm a = fog.m12072a(flb2.mo10941g(), str);
                    flb2.mo10929b("Found relevant installation campaign", a);
                    sdo.m34959a(fko);
                    sdo.m34959a(a);
                    fik fik = new fik(flb2.f16779d);
                    String str5 = fko2.f16803b;
                    sdo.m34977c(str5);
                    Uri a2 = fil.m11754a(str5);
                    ListIterator listIterator = fik.mo10878d().listIterator();
                    while (listIterator.hasNext()) {
                        if (a2.equals(((fjg) listIterator.next()).mo10851a())) {
                            listIterator.remove();
                        }
                    }
                    fik.mo10878d().add(new fil(fik.f16658a, str5));
                    fik.f16659b = fko2.f16804c;
                    fiv a3 = fik.f16694g.mo10872a();
                    a3.mo10874a(fik.f16658a.mo10964h().mo10988b());
                    a3.mo10874a(fik.f16658a.f16792h.mo11012b());
                    List list = fik.f16695h;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((fiw) list.get(i)).mo10876a();
                    }
                    fju fju = (fju) a3.mo10875b(fju.class);
                    fju.f16750a = "data";
                    fju.f16755f = true;
                    a3.mo10874a(a);
                    fjp fjp = (fjp) a3.mo10875b(fjp.class);
                    fjl fjl = (fjl) a3.mo10875b(fjl.class);
                    for (Map.Entry entry2 : fko2.f16806e.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        String str7 = (String) entry2.getValue();
                        if ("an".equals(str6)) {
                            fjl.f16727a = str7;
                        } else if ("av".equals(str6)) {
                            fjl.f16728b = str7;
                        } else if ("aid".equals(str6)) {
                            fjl.f16729c = str7;
                        } else if ("aiid".equals(str6)) {
                            fjl.f16730d = str7;
                        } else if (!"uid".equals(str6)) {
                            sdo.m34977c(str6);
                            if (str6 != null && str6.startsWith("&")) {
                                str6 = str6.substring(1);
                            }
                            sdo.m34969a(str6, (Object) "Name can not be empty or \"&\"");
                            fjp.f16743a.put(str6, str7);
                        } else {
                            fju.f16752c = str7;
                        }
                    }
                    flb2.mo10930b("Sending installation campaign to", fko2.f16803b, a);
                    a3.f16686e = flb2.mo10949n().mo11050b();
                    fje fje = a3.f16682a.f16693f;
                    if (a3.f16688g) {
                        throw new IllegalStateException("Measurement prototype can't be submitted");
                    } else if (!a3.f16684c) {
                        fiv a4 = a3.mo10872a();
                        a4.f16687f = SystemClock.elapsedRealtime();
                        long j3 = a4.f16686e;
                        if (j3 == 0) {
                            a4.f16685d = System.currentTimeMillis();
                        } else {
                            a4.f16685d = j3;
                        }
                        a4.f16684c = true;
                        fje.f16709d.execute(new fiz(fje, a4));
                    } else {
                        throw new IllegalStateException("Measurement can only be submitted once");
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public final void mo10922b() {
        boolean z;
        mo10954t();
        Context f = mo10939f();
        sdo.m34959a(f);
        if (foa.f16997c != null) {
            z = foa.f16997c.booleanValue();
        } else {
            try {
                ActivityInfo receiverInfo = f.getPackageManager().getReceiverInfo(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    z = true;
                    foa.f16997c = Boolean.valueOf(z);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            z = false;
            foa.f16997c = Boolean.valueOf(z);
        }
        if (!z || !foe.m12065a(f)) {
            mo10920a((fln) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsService"));
        f.startService(intent);
    }

    /* renamed from: d */
    public final void mo10924d() {
        mo10954t();
        try {
            mo10944i().mo10885a(new fkg(this)).get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            mo10934d("syncDispatchLocalHits interrupted", e);
        } catch (ExecutionException e2) {
            mo10938e("syncDispatchLocalHits failed", e2);
        } catch (TimeoutException e3) {
            mo10934d("syncDispatchLocalHits timed out", e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10923c() {
        fje.m11804a();
        flb flb = this.f16778a;
        fje.m11804a();
        flb.f16841h = flb.mo10936e().mo20505a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        this.f16778a.mo10955u();
    }

    /* renamed from: a */
    public final void mo10920a(fln fln) {
        mo10954t();
        mo10944i().mo10886a(new fkf(this, fln));
    }

    /* renamed from: a */
    public final void mo10921a(fnl fnl) {
        sdo.m34959a(fnl);
        mo10954t();
        mo10929b("Hit delivery requested", fnl);
        mo10944i().mo10886a(new fkc(this, fnl));
    }
}
