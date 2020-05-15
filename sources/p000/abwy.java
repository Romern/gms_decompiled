package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: abwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwy extends acpn {

    /* renamed from: a */
    private final abrv f58664a;

    public abwy(abrv abrv) {
        super(bqbd.CLEAR_APP_INDEXING_SEQUENCE_TABLES_TASK, 1);
        this.f58664a = abrv;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long
     arg types: [int, int]
     candidates:
      com.google.android.gms.icing.nativeindex.NativeIndex.a(java.lang.String[], abud):abuh
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, long):bqaw
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long */
    /* renamed from: a */
    public static void m48422a(abrv abrv) {
        Context context = abrv.f58066b;
        abvo a = abvo.m48335a(context);
        abzo a2 = abrv.mo32298a();
        abxt b = abxt.m48507b();
        if (cemz.m137436b()) {
            abrv.f58071g.mo33021a(true);
        }
        SQLiteDatabase writableDatabase = a.getWritableDatabase();
        bnre i = a2.mo32541c().listIterator();
        while (true) {
            boolean z = false;
            if (!i.hasNext()) {
                break;
            }
            absr absr = (absr) i.next();
            if (abzm.m48657e(absr)) {
                long a3 = abrv.f58078n.mo43391a(absr.f58137b, true);
                if (a3 > 0) {
                    abww a4 = abww.m48411a(absr.f58138c, absr.f58140e, b);
                    if (a4 == null) {
                        absg.m48207e("Failed to find appIndexingCorpusConfig for corpus %s, package %s", absr.f58138c, absr.f58140e);
                    } else {
                        writableDatabase.beginTransaction();
                        try {
                            if (fua.m12404c(writableDatabase, a4.mo32394a())) {
                                abvo.m48341a(writableDatabase, a4, a3);
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            String str = a4.f58662b;
                            if (cemz.m137436b()) {
                                acpl acpl = abrv.f58067c;
                                apos apos = new apos(abrv.f58066b, abrv, abxu.m48512a(a4), abrv.f58077m.mo32499a(a4.f58662b));
                                acpl.mo32995d(apos);
                                boolean z2 = ((RegisterCorpusInfoCall$Response) apos.mo32295h()).f107404b;
                                if (z2) {
                                    abym abym = abrv.f58083s;
                                    bpwv bpwv = (bpwv) bpww.f139580b.mo74144da();
                                    bxvd da = bpyl.f139877i.mo74144da();
                                    String str2 = absr.f58140e;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bpyl bpyl = (bpyl) da.f164949b;
                                    str2.getClass();
                                    int i2 = bpyl.f139879a | 16;
                                    bpyl.f139879a = i2;
                                    bpyl.f139884f = str2;
                                    String str3 = absr.f58138c;
                                    str3.getClass();
                                    bpyl.f139879a = i2 | 32;
                                    bpyl.f139885g = str3;
                                    bpwv.mo68991a(da);
                                    abym.mo32437a(6015, (bpww) bpwv.mo74062i());
                                }
                                z = z2;
                            }
                            if (a.mo32363a(abrv, abrv.f58077m.mo32499a(str), b) || z) {
                                OneoffRebuildIndexChimeraService.m66670a(context, str, bpzu.ONE_OFF_REASON_REBUILD);
                            }
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                }
            }
        }
        if (cemz.m137436b()) {
            abxt.m48506a(context, b, abrv.f58083s);
            abrv.f58071g.mo33021a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        if (!((Boolean) abzt.f58862aC.mo58455c()).booleanValue()) {
            return null;
        }
        try {
            m48422a(this.f58664a);
            return null;
        } catch (Exception e) {
            this.f58664a.mo32331n().mo32456a("AppIndexingMaintenanceTask", e, cema.m137239f());
            return null;
        }
    }
}
