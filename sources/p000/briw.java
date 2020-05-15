package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.firebase.appindexing.GetOptions;
import com.google.firebase.appindexing.Query;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: briw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class briw extends dck implements brix {

    /* renamed from: a */
    public final acri f142885a;

    /* renamed from: b */
    public final abym f142886b;

    /* renamed from: c */
    public final abyp f142887c;

    /* renamed from: d */
    public final abxp f142888d;

    /* renamed from: e */
    public final String f142889e;

    /* renamed from: f */
    public final abyy f142890f;

    /* renamed from: g */
    private final int f142891g;

    /* renamed from: h */
    private final abwp f142892h;

    public briw() {
        super("com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    /* renamed from: a */
    private static int m114079a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: b */
    private static int m114087b(MutateRequest mutateRequest) {
        int i = mutateRequest.f152362a;
        if (i == 1 || i == 2) {
            return m114079a(mutateRequest.f152363b);
        }
        if (i == 3) {
            return m114079a(mutateRequest.f152364c);
        }
        if (i != 6) {
            return (i == 7 && mutateRequest.f152366e != null) ? 1 : 0;
        }
        return m114079a(mutateRequest.f152365d);
    }

    /* renamed from: a */
    private static acpn m114080a(String str, bqbd bqbd, abxm abxm) {
        return new abwb(bqbd, str, abxm);
    }

    public briw(acri acri, abym abym, abyp abyp, abxp abxp, String str, int i, abwp abwp, abyy abyy) {
        super("com.google.firebase.appindexing.internal.IAppIndexingService");
        this.f142885a = acri;
        this.f142886b = abym;
        this.f142887c = abyp;
        this.f142888d = abxp;
        this.f142889e = str;
        this.f142891g = i;
        this.f142892h = abwp;
        this.f142890f = abyy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2 A[Catch:{ all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0157 A[Catch:{ all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0191  */
    /* renamed from: a */
    private final CallStatus m114081a(bqbd bqbd, rnt rnt, MutateRequest mutateRequest, boolean z) {
        abwu abwu;
        bpzo bpzo;
        bnic bnic;
        abwu abwu2;
        rnt rnt2 = rnt;
        MutateRequest mutateRequest2 = mutateRequest;
        String name = bqbd.name();
        try {
            abxt a = abxt.m48504a(this.f142885a.f60609b);
            String str = this.f142889e;
            int i = this.f142891g;
            switch (mutateRequest2.f152362a) {
                case 1:
                    bpzo = bpzo.CONTENT_UPDATE;
                    break;
                case 2:
                    bpzo = bpzo.CONTENT_PATCH;
                    break;
                case 3:
                    bpzo = bpzo.CONTENT_REMOVE;
                    break;
                case 4:
                    bpzo = bpzo.CONTENT_REMOVE_ALL;
                    break;
                case 5:
                    bpzo = bpzo.CONTENT_UPDATE_TAGS;
                    break;
                case 6:
                    bpzo = bpzo.CONTENT_REMOVE_TYPES;
                    break;
                case 7:
                    if (mutateRequest2.f152366e.f152345e.f152348a == 1) {
                        bpzo = bpzo.ACTION_START;
                        break;
                    } else {
                        bpzo = bpzo.ACTION_END;
                        break;
                    }
                default:
                    bpzo = bpzo.CONTENT_MUTATE_REQUEST_INVALID;
                    break;
            }
            int b = m114087b(mutateRequest);
            if (acaw.m48795l()) {
                int i2 = mutateRequest2.f152362a;
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 6) {
                        bnic = null;
                    } else if (mutateRequest2.f152365d != null) {
                        bnia j = bnic.m109500j();
                        for (String str2 : mutateRequest2.f152365d) {
                            j.mo67629b(abvp.m48355a(str2, a));
                        }
                        bnic = j.mo67751a();
                    } else {
                        bnic = null;
                    }
                    abwu2 = r8;
                    abwu abwu3 = new abwu(str, i, bqbd, bpzo, b, bnic);
                    if (mutateRequest2.f152362a == 0) {
                    }
                } else if (mutateRequest2.f152363b != null) {
                    bnia j2 = bnic.m109500j();
                    Thing[] thingArr = mutateRequest2.f152363b;
                    for (Thing thing : thingArr) {
                        if (thing != null) {
                            j2.mo67629b(abvp.m48355a(thing.f152373e, a));
                        }
                    }
                    bnic = j2.mo67751a();
                    abwu2 = abwu3;
                    abwu abwu32 = new abwu(str, i, bqbd, bpzo, b, bnic);
                    if (mutateRequest2.f152362a == 0) {
                        abwu2.mo32393a(this.f142886b, bpzq.INVALID_REQUEST);
                        return CallStatus.f152355b;
                    } else if (!abzt.m48729c(this.f142889e)) {
                        m114085a(rnt2, name, Status.f30107a);
                        abwu2.mo32393a(this.f142886b, bpzq.NOT_ALLOWED);
                        return CallStatus.f152354a;
                    } else if (mutateRequest2.f152362a == 2 && !acaw.m48791h()) {
                        abwu2.mo32393a(this.f142886b, bpzq.FEATURE_OFF);
                        String a2 = m114082a(mutateRequest);
                        m114085a(rnt2, name, new Status(17513, a2.length() == 0 ? new String("Feature off: ") : "Feature off: ".concat(a2)));
                        return CallStatus.f152354a;
                    } else {
                        if (Log.isLoggable("Icing", 3)) {
                            absg.m48186a("Requested %s (%d things).", m114082a(mutateRequest), Integer.valueOf(m114087b(mutateRequest)));
                        }
                        if (this.f142892h.mo32391a(bqbd, new abwe(this, this.f142885a.f60609b, abwu2, rnt, mutateRequest, abvo.m48335a(this.f142885a.f60609b), this.f142885a.mo33016b().f58081q, a), z)) {
                            return CallStatus.f152354a;
                        }
                        absg.m48184a("AppIndexing call rejected: too many calls in progress.");
                        abwu2.mo32393a(this.f142886b, bpzq.CALL_IN_PROGRESS);
                        return CallStatus.f152356c;
                    }
                }
            }
            bnic = null;
            abwu2 = abwu32;
            abwu abwu322 = new abwu(str, i, bqbd, bpzo, b, bnic);
            try {
                if (mutateRequest2.f152362a == 0) {
                }
            } catch (Throwable th) {
                th = th;
                abwu = abwu2;
                String format = String.format("%s[%s]", name, this.f142889e);
                absg.m48200c(th, "Error performing: %s", format);
                m114083a(abwu, th);
                if (!sre.m36079a()) {
                    m114085a(rnt2, format, Status.f30109c);
                    return CallStatus.f152354a;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abwu = null;
            String format2 = String.format("%s[%s]", name, this.f142889e);
            absg.m48200c(th, "Error performing: %s", format2);
            m114083a(abwu, th);
            if (!sre.m36079a()) {
            }
        }
    }

    /* renamed from: a */
    private static String m114082a(MutateRequest mutateRequest) {
        int i = mutateRequest.f152362a;
        if (i == 1) {
            return "update";
        }
        if (i == 2) {
            return "patch";
        }
        if (i == 3) {
            return "remove";
        }
        if (i == 4) {
            return "remove all";
        }
        if (i != 6) {
            return i != 7 ? "(unknown)" : "report user action";
        }
        return "remove types";
    }

    /* renamed from: a */
    private final void m114083a(abwu abwu, Throwable th) {
        if (abwu != null) {
            abwu.mo32393a(this.f142886b, bpzq.INTERNAL_ERROR);
        }
        this.f142887c.mo32456a("AppIndexingService INTERNAL_ERROR", th, cema.m137239f());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: briw.a(bqbd, rnt, com.google.firebase.appindexing.internal.MutateRequest, boolean):com.google.firebase.appindexing.internal.CallStatus
     arg types: [bqbd, rnt, com.google.firebase.appindexing.internal.MutateRequest, int]
     candidates:
      briw.a(abvo, java.util.List, java.lang.String, java.lang.String):com.google.firebase.appindexing.internal.Thing
      briw.a(bqbd, rnt, com.google.firebase.appindexing.internal.MutateRequest, boolean):com.google.firebase.appindexing.internal.CallStatus */
    /* renamed from: a */
    private final void m114084a(bqbd bqbd, rnt rnt, MutateRequest mutateRequest) {
        Status status;
        absg.m48185a("Dispatching legacy %s call.", bqbd.name());
        int i = m114081a(bqbd, rnt, mutateRequest, false).f152357d;
        if (i != 1) {
            if (i != 3) {
                status = new Status(17512, "Invalid request");
            } else {
                status = new Status(17601, "Call in progress");
            }
            try {
                rnt.mo11797a(status);
            } catch (RemoteException e) {
                absg.m48200c(e, "Client died during %s", bqbd.name());
            }
        }
    }

    /* renamed from: a */
    private static void m114085a(rnt rnt, String str, Status status) {
        try {
            rnt.mo11797a(status);
        } catch (Throwable th) {
            absg.m48200c(th, "Client died while providing callback for: %s", str);
        }
    }

    /* renamed from: a */
    public static boolean m114086a(abwe abwe) {
        return abwe.f58614a instanceof abxc;
    }

    /* renamed from: a */
    public final CallStatus mo69574a(rnt rnt, MutateRequest mutateRequest) {
        return m114081a(bqbd.APP_INDEXING_MUTATE, rnt, mutateRequest, ((Boolean) acaw.f59323b.mo58455c()).booleanValue());
    }

    /* renamed from: a */
    public final Thing mo69576a(abvo abvo, List list, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        List list2 = list;
        if (!((Boolean) abzt.f58861aB.mo58455c()).booleanValue()) {
            return null;
        }
        abxt a = abxt.m48504a(this.f142885a.f60609b);
        HashMap hashMap = new HashMap();
        String[] strArr = {str2};
        String[] strArr2 = {"action", "section_thing_proto"};
        SQLiteDatabase readableDatabase = abvo.getReadableDatabase();
        readableDatabase.beginTransactionNonExclusive();
        try {
            for (abww abww : abvn.m48330a(readableDatabase, str, a)) {
                abww abww2 = abww;
                sQLiteDatabase = readableDatabase;
                String[] strArr3 = strArr2;
                try {
                    Cursor query = readableDatabase.query(abxu.m48513a(abww.mo32394a()), strArr2, "uri=? AND tag IS NULL AND action IN ('add','del','mod')", strArr, null, null, "seqno DESC", "1");
                    try {
                        if (query.moveToFirst()) {
                            if ("add".equals(query.getString(0))) {
                                hashMap.put(abww2, abyd.m48527a((caef) bxvk.m124012a(caef.f172809f, ByteBuffer.wrap(query.getBlob(1)))));
                            } else if ("del".equals(query.getString(0))) {
                                hashMap.put(abww2, null);
                            }
                        }
                        if (query != null) {
                            query.close();
                            readableDatabase = sQLiteDatabase;
                            strArr2 = strArr3;
                        } else {
                            readableDatabase = sQLiteDatabase;
                            strArr2 = strArr3;
                        }
                    } catch (bxwf e) {
                        throw new IllegalArgumentException("Failed to deserialize bytes", e);
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            readableDatabase.endTransaction();
            for (int size = list.size() - 1; size >= 0; size--) {
                abww a2 = abww.m48411a(((absr) list2.get(size)).f58138c, ((absr) list2.get(size)).f58140e, abxt.m48504a(this.f142885a.f60609b));
                Thing thing = (Thing) hashMap.get(a2);
                if (thing != null) {
                    return thing;
                }
                if (hashMap.containsKey(a2)) {
                    list2.remove(size);
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = readableDatabase;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final List mo69577a(String str) {
        ArrayList arrayList = new ArrayList();
        abzo a = this.f142885a.mo33016b().mo32298a();
        synchronized (a.mo32525a()) {
            for (acak acak : a.mo32528a(this.f142890f, null, true, str)) {
                absr d = a.mo32543d(acak);
                if (abww.m48413a(d.f58138c)) {
                    arrayList.add(d);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo69578a(List list, String[] strArr) {
        List a = abvo.m48337a(this.f142885a.mo33016b(), list, strArr);
        ArrayList arrayList = new ArrayList(a.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(abyd.m48527a((caef) a.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo69579a(abvo abvo, abxt abxt) {
        if (abvo.mo32363a(this.f142885a.mo33016b(), this.f142890f, abxt)) {
            OneoffRebuildIndexChimeraService.m66670a(this.f142885a.f60609b, this.f142889e, bpzu.ONE_OFF_REASON_REBUILD);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9 A[SYNTHETIC, Splitter:B:21:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* renamed from: a */
    public final void mo69575a(briu briu, GetIndexableRequest getIndexableRequest) {
        abwu abwu;
        briu briu2 = briu;
        GetIndexableRequest getIndexableRequest2 = getIndexableRequest;
        try {
            bqbd bqbd = bqbd.APP_INDEXING_GET;
            abwu = new abwu(this.f142889e, this.f142891g, bqbd, bpzo.CONTENT_GET, 1, null);
            try {
                sdo.m34959a(getIndexableRequest);
                abvo a = abvo.m48336a(this.f142885a.f60609b, getIndexableRequest2.f152359b);
                if (a == null || !abzt.m48729c(this.f142889e)) {
                    abwu.mo32393a(this.f142886b, bpzq.NOT_ALLOWED);
                    briu2.mo69567a(new GetIndexableResponse(Status.f30107a, null));
                    return;
                }
                String valueOf = String.valueOf(getIndexableRequest2.f152358a);
                absg.m48184a(valueOf.length() == 0 ? new String("Requested to get Indexable for: ") : "Requested to get Indexable for: ".concat(valueOf));
                this.f142885a.f60610c.mo32995d(m114080a(this.f142889e, bqbd, new abvz(this, this.f142887c, abwu, this.f142886b, this.f142888d, getIndexableRequest, a, briu)));
            } catch (Throwable th) {
                th = th;
                String str = this.f142889e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
                sb.append("GetIndexable[");
                sb.append(str);
                sb.append("]");
                String sb2 = sb.toString();
                absg.m48200c(th, "Error performing: %s", sb2);
                m114083a(abwu, th);
                if (!sre.m36079a()) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            abwu = null;
            String str2 = this.f142889e;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 14);
            sb3.append("GetIndexable[");
            sb3.append(str2);
            sb3.append("]");
            String sb22 = sb3.toString();
            absg.m48200c(th, "Error performing: %s", sb22);
            m114083a(abwu, th);
            if (!sre.m36079a()) {
                try {
                    briu2.mo69567a(new GetIndexableResponse(Status.f30109c, null));
                } catch (Throwable th3) {
                    absg.m48200c(th3, "Client died while providing callback for: %s", sb22);
                }
            } else {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x017a A[SYNTHETIC, Splitter:B:67:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0192  */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        rnt rnt2;
        rnt rnt3;
        briu briu;
        bris bris;
        rnt rnt4;
        rnt rnt5;
        rnt rnt6;
        bris bris2;
        String str;
        String str2;
        String[] strArr;
        bris bris3;
        briw briw;
        abwu abwu;
        bris bris4;
        abwu abwu2;
        abwa abwa;
        Parcel parcel3 = parcel;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
                } else {
                    rnt = null;
                }
                m114084a(bqbd.APP_INDEXING_UPDATE, rnt, MutateRequest.m118866a((Thing[]) parcel3.createTypedArray(Thing.CREATOR)));
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt2 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                } else {
                    rnt2 = null;
                }
                m114084a(bqbd.APP_INDEXING_REMOVE, rnt2, MutateRequest.m118867a(parcel.createStringArray()));
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt3 = queryLocalInterface3 instanceof rnt ? (rnt) queryLocalInterface3 : new rnr(readStrongBinder3);
                } else {
                    rnt3 = null;
                }
                m114084a(bqbd.APP_INDEXING_REMOVE_ALL, rnt3, new MutateRequest(4, null, null, null, null, null, null));
                parcel2.writeNoException();
                return true;
            case 4:
            default:
                return false;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
                    briu = queryLocalInterface4 instanceof briu ? (briu) queryLocalInterface4 : new bris(readStrongBinder4);
                } else {
                    briu = null;
                }
                mo69575a(briu, (GetIndexableRequest) dcl.m8163a(parcel3, GetIndexableRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
                    bris = queryLocalInterface5 instanceof briu ? (briu) queryLocalInterface5 : new bris(readStrongBinder5);
                } else {
                    bris = null;
                }
                Query[] queryArr = (Query[]) parcel3.createTypedArray(Query.CREATOR);
                abwu abwu3 = new abwu(this.f142889e, this.f142891g, bqbd.APP_INDEXING_SEARCH, bpzo.CONTENT_SEARCH, queryArr.length, null);
                try {
                    if (!abzt.m48729c(this.f142889e)) {
                        abwu3.mo32393a(this.f142886b, bpzq.NOT_ALLOWED);
                        bris.mo69573a(Status.f30107a, (ResultSet[]) null);
                    } else if (((Boolean) acaw.f59396p.mo58455c()).booleanValue()) {
                        this.f142885a.f60610c.mo32995d(m114080a(this.f142889e, bqbd.APP_INDEXING_SEARCH, new abxv(this.f142885a.mo33016b(), abwu3, this.f142890f, bris, queryArr)));
                    } else {
                        abwu3.mo32393a(this.f142886b, bpzq.FEATURE_OFF);
                        bris.mo69573a(new Status(17513, "search"), (ResultSet[]) null);
                    }
                } catch (Throwable th) {
                    absg.m48200c(th, "Client died while providing callback for query", new Object[0]);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt4 = queryLocalInterface6 instanceof rnt ? (rnt) queryLocalInterface6 : new rnr(readStrongBinder6);
                } else {
                    rnt4 = null;
                }
                m114084a(bqbd.APP_INDEXING_PATCH, rnt4, MutateRequest.m118868b((Thing[]) parcel3.createTypedArray(Thing.CREATOR)));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt5 = queryLocalInterface7 instanceof rnt ? (rnt) queryLocalInterface7 : new rnr(readStrongBinder7);
                } else {
                    rnt5 = null;
                }
                CallStatus a = mo69574a(rnt5, (MutateRequest) dcl.m8163a(parcel3, MutateRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt6 = queryLocalInterface8 instanceof rnt ? (rnt) queryLocalInterface8 : new rnr(readStrongBinder8);
                } else {
                    rnt6 = null;
                }
                m114084a(bqbd.APP_INDEXING_REMOVE_TYPES, rnt6, MutateRequest.m118869b(parcel.createStringArray()));
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
                    bris2 = queryLocalInterface9 instanceof briu ? (briu) queryLocalInterface9 : new bris(readStrongBinder9);
                } else {
                    bris2 = null;
                }
                String[] createStringArray = parcel.createStringArray();
                GetOptions getOptions = (GetOptions) dcl.m8163a(parcel3, GetOptions.CREATOR);
                String str3 = getOptions.f152335a;
                if (str3 != null && !str3.isEmpty()) {
                    str = getOptions.f152335a;
                } else {
                    str = this.f142889e;
                }
                String str4 = this.f142889e;
                int i2 = this.f142891g;
                bqbd bqbd = bqbd.APP_INDEXING_GET;
                bpzo bpzo = bpzo.CONTENT_GET;
                int length = createStringArray.length;
                int i3 = length;
                abwu abwu4 = new abwu(str4, i2, bqbd, bpzo, length, null);
                try {
                    abvo a2 = abvo.m48336a(this.f142885a.f60609b, str);
                    if (a2 != null) {
                        try {
                            if (!abzt.m48729c(this.f142889e)) {
                                abwu2 = abwu4;
                                str2 = str;
                                strArr = createStringArray;
                                bris4 = bris2;
                            } else if (getOptions.f152336b && i3 > 1) {
                                abwu4.mo32393a(this.f142886b, bpzq.INVALID_ARGUMENT_CHECK_SEQUENCE_TABLE);
                                bris2.mo69572a(new Status(17511, "Can only check one url in the sequence table at a time."), Collections.emptyList());
                                parcel2.writeNoException();
                                return true;
                            } else {
                                String valueOf = String.valueOf(Arrays.toString(createStringArray));
                                absg.m48184a(valueOf.length() == 0 ? new String("Requested to get Indexables for: ") : "Requested to get Indexables for: ".concat(valueOf));
                                acpl acpl = this.f142885a.f60610c;
                                String str5 = this.f142889e;
                                bqbd bqbd2 = bqbd.APP_INDEXING_GET;
                                abyp abyp = this.f142887c;
                                abym abym = this.f142886b;
                                abxp abxp = this.f142888d;
                                abwa abwa2 = abwa;
                                bqbd bqbd3 = bqbd2;
                                String str6 = str5;
                                abwu2 = abwu4;
                                str2 = str;
                                strArr = createStringArray;
                                bris4 = bris2;
                                try {
                                    abwa = new abwa(this, abyp, abwu4, abym, abxp, str, getOptions, a2, createStringArray, bris2);
                                    acpl.mo32995d(m114080a(str6, bqbd3, abwa2));
                                } catch (Throwable th2) {
                                    th = th2;
                                    briw = this;
                                    bris3 = bris4;
                                    abwu = abwu2;
                                    String arrays = Arrays.toString(strArr);
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(arrays).length());
                                    sb.append("get(");
                                    sb.append(str2);
                                    sb.append(", ");
                                    sb.append(arrays);
                                    sb.append("]");
                                    String sb2 = sb.toString();
                                    absg.m48200c(th, "Error performing: %s", sb2);
                                    briw.m114083a(abwu, th);
                                    if (!sre.m36079a()) {
                                    }
                                }
                                parcel2.writeNoException();
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = str;
                            strArr = createStringArray;
                            briw = this;
                            abwu = abwu4;
                            bris3 = bris2;
                            String arrays2 = Arrays.toString(strArr);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(arrays2).length());
                            sb3.append("get(");
                            sb3.append(str2);
                            sb3.append(", ");
                            sb3.append(arrays2);
                            sb3.append("]");
                            String sb22 = sb3.toString();
                            absg.m48200c(th, "Error performing: %s", sb22);
                            briw.m114083a(abwu, th);
                            if (!sre.m36079a()) {
                                try {
                                    bris3.mo69572a(Status.f30109c, (List) null);
                                } catch (Throwable th4) {
                                    absg.m48200c(th4, "Client died while providing callback for: %s", sb22);
                                }
                                parcel2.writeNoException();
                                return true;
                            }
                            throw th;
                        }
                    } else {
                        abwu2 = abwu4;
                        str2 = str;
                        strArr = createStringArray;
                        bris4 = bris2;
                    }
                    briw = this;
                    try {
                        abwu = abwu2;
                        try {
                            abwu.mo32393a(briw.f142886b, bpzq.NOT_ALLOWED);
                            bris3 = bris4;
                            try {
                                bris3.mo69572a(Status.f30107a, Collections.emptyList());
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bris3 = bris4;
                            String arrays22 = Arrays.toString(strArr);
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(arrays22).length());
                            sb32.append("get(");
                            sb32.append(str2);
                            sb32.append(", ");
                            sb32.append(arrays22);
                            sb32.append("]");
                            String sb222 = sb32.toString();
                            absg.m48200c(th, "Error performing: %s", sb222);
                            briw.m114083a(abwu, th);
                            if (!sre.m36079a()) {
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        bris3 = bris4;
                        abwu = abwu2;
                        String arrays222 = Arrays.toString(strArr);
                        StringBuilder sb322 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(arrays222).length());
                        sb322.append("get(");
                        sb322.append(str2);
                        sb322.append(", ");
                        sb322.append(arrays222);
                        sb322.append("]");
                        String sb2222 = sb322.toString();
                        absg.m48200c(th, "Error performing: %s", sb2222);
                        briw.m114083a(abwu, th);
                        if (!sre.m36079a()) {
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    abwu = abwu4;
                    str2 = str;
                    strArr = createStringArray;
                    bris3 = bris2;
                    briw = this;
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
