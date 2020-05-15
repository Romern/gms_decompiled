package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agcz {

    /* renamed from: a */
    final /* synthetic */ agdd f65273a;

    /* renamed from: b */
    private agni f65274b;

    /* renamed from: c */
    private Long f65275c;

    /* renamed from: d */
    private long f65276d;

    public agcz(agdd agdd) {
        this.f65273a = agdd;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxxb, byte[]):bxxb
     arg types: [bxvd, byte[]]
     candidates:
      agmp.a(bxvd, java.lang.String):int
      agmp.a(java.lang.StringBuilder, int):void
      agmp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):boolean
      agmp.a(java.util.List, int):boolean
      agmp.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable
      agmp.a(agni, java.lang.String):java.lang.Object
      agmp.a(java.util.List, java.util.List):java.util.List
      agmp.a(bxvd, java.lang.Object):void
      agmp.a(long, long):boolean
      agmp.a(bxxb, byte[]):bxxb */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        if (r14 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r14 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0238  */
    /* renamed from: a */
    public final agni mo35300a(String str, agni agni) {
        bxvd bxvd;
        long j;
        List arrayList;
        int size;
        int i;
        Cursor cursor;
        Pair pair;
        Cursor cursor2;
        String str2 = str;
        agni agni2 = agni;
        String str3 = agni2.f66068c;
        List list = agni2.f66067b;
        Long l = (Long) this.f65273a.mo35657o().mo35709a(agni2, "_eid");
        if (l != null) {
            if (str3.equals("_ep")) {
                String str4 = (String) this.f65273a.mo35657o().mo35709a(agni2, "_en");
                if (TextUtils.isEmpty(str4)) {
                    this.f65273a.mo35497E().f65565d.mo35436a("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.f65274b == null || this.f65275c == null || l.longValue() != this.f65275c.longValue()) {
                    agdl n = this.f65273a.mo35656n();
                    n.mo35241h();
                    n.mo35659q();
                    try {
                        cursor2 = n.mo35360e().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str2, String.valueOf(l)});
                        try {
                            if (cursor2.moveToFirst()) {
                                try {
                                    pair = Pair.create((agni) ((bxvd) agmp.m54563a((bxxb) agni.f66064g.mo74144da(), cursor2.getBlob(0))).mo74062i(), Long.valueOf(cursor2.getLong(1)));
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } catch (IOException e) {
                                    n.mo35497E().f65564c.mo35438a("Failed to merge main event. appId, eventId", agid.m54288a(str), l, e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                        pair = null;
                                        if (pair == null) {
                                            this.f65274b = (agni) pair.first;
                                            this.f65276d = ((Long) pair.second).longValue();
                                            this.f65275c = (Long) this.f65273a.mo35657o().mo35709a(this.f65274b, "_eid");
                                            j = this.f65276d - 1;
                                            this.f65276d = j;
                                            if (j > 0) {
                                            }
                                            arrayList = new ArrayList();
                                            bxwc bxwc = this.f65274b.f66067b;
                                            size = bxwc.size();
                                            while (i < size) {
                                            }
                                            if (arrayList.isEmpty()) {
                                            }
                                            str3 = str4;
                                            bxvd = (bxvd) agni2.mo74142c(5);
                                            bxvd.mo73625a((bxvk) agni2);
                                            if (bxvd.f164950c) {
                                            }
                                            agni agni3 = (agni) bxvd.f164949b;
                                            agni agni4 = agni.f66064g;
                                            str3.getClass();
                                            agni3.f66066a |= 1;
                                            agni3.f66068c = str3;
                                            agni3.f66067b = bxvk.m124030de();
                                            if (bxvd.f164950c) {
                                            }
                                            agni agni5 = (agni) bxvd.f164949b;
                                            agni5.mo35756a();
                                            bxsy.m123078a(list, agni5.f66067b);
                                            return (agni) bxvd.mo74062i();
                                        }
                                        this.f65273a.mo35497E().f65565d.mo35437a("Extra parameter without existing main event. eventName, eventId", str4, l);
                                        return null;
                                    }
                                    pair = null;
                                    if (pair == null) {
                                    }
                                    this.f65273a.mo35497E().f65565d.mo35437a("Extra parameter without existing main event. eventName, eventId", str4, l);
                                    return null;
                                }
                                if (pair == null || pair.first == null) {
                                    this.f65273a.mo35497E().f65565d.mo35437a("Extra parameter without existing main event. eventName, eventId", str4, l);
                                    return null;
                                }
                                this.f65274b = (agni) pair.first;
                                this.f65276d = ((Long) pair.second).longValue();
                                this.f65275c = (Long) this.f65273a.mo35657o().mo35709a(this.f65274b, "_eid");
                            } else {
                                n.mo35497E().f65572k.mo35435a("Main event not found");
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            try {
                                n.mo35497E().f65564c.mo35436a("Error selecting main event", e);
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursor2;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursor2;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursor2 = null;
                        n.mo35497E().f65564c.mo35436a("Error selecting main event", e);
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                j = this.f65276d - 1;
                this.f65276d = j;
                if (j > 0) {
                    agdl n2 = this.f65273a.mo35656n();
                    n2.mo35241h();
                    n2.mo35497E().f65572k.mo35436a("Clearing complex main event info. appId", str2);
                    try {
                        n2.mo35360e().execSQL("delete from main_event_params where app_id=?", new String[]{str2});
                    } catch (SQLiteException e4) {
                        n2.mo35497E().f65564c.mo35436a("Error clearing complex main event", e4);
                    }
                } else {
                    this.f65273a.mo35656n().mo35345a(str, l, this.f65276d, this.f65274b);
                }
                arrayList = new ArrayList();
                bxwc bxwc2 = this.f65274b.f66067b;
                size = bxwc2.size();
                for (i = 0; i < size; i++) {
                    agnk agnk = (agnk) bxwc2.get(i);
                    this.f65273a.mo35657o();
                    if (agmp.m54574b(agni2, agnk.f66080b) == null) {
                        arrayList.add(agnk);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(list);
                    list = arrayList;
                } else {
                    this.f65273a.mo35497E().f65565d.mo35436a("No unique parameters in main event. eventName", str4);
                }
                str3 = str4;
            } else {
                this.f65275c = l;
                this.f65274b = agni2;
                long j2 = 0L;
                Object a = this.f65273a.mo35657o().mo35709a(agni2, "_epc");
                if (a != null) {
                    j2 = a;
                }
                long longValue = ((Long) j2).longValue();
                this.f65276d = longValue;
                if (longValue <= 0) {
                    this.f65273a.mo35497E().f65565d.mo35436a("Complex event with zero extra param count. eventName", str3);
                } else {
                    this.f65273a.mo35656n().mo35345a(str, l, this.f65276d, agni);
                }
            }
        }
        bxvd = (bxvd) agni2.mo74142c(5);
        bxvd.mo73625a((bxvk) agni2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agni agni32 = (agni) bxvd.f164949b;
        agni agni42 = agni.f66064g;
        str3.getClass();
        agni32.f66066a |= 1;
        agni32.f66068c = str3;
        agni32.f66067b = bxvk.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agni agni52 = (agni) bxvd.f164949b;
        agni52.mo35756a();
        bxsy.m123078a(list, agni52.f66067b);
        return (agni) bxvd.mo74062i();
    }
}
