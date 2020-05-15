package p000;

import android.net.Uri;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: axxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxz implements axyu, axxg, ayjm {

    /* renamed from: a */
    public axxv f96741a;

    /* renamed from: b */
    public axzt f96742b;

    /* renamed from: c */
    private final Map f96743c = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo53588a(axyv axyv) {
        String str = this.f96742b.mo53808b().f96814a;
        String str2 = ((ayan) axyv).f96942b.f96814a;
        axxy axxy = (axxy) this.f96743c.get(str2);
        if (axxy == null) {
            axxy = new axxy(str, str2, this.f96741a);
            this.f96743c.put(str2, axxy);
        }
        synchronized (axxy.f96733e) {
            if (axxy.f96736h != null) {
                axxy.mo53753a();
            }
            axxy.f96734f = false;
            axxy.f96735g = false;
            axxy.f96736h = axyv;
            axxy.f96737i = new axxw();
            axxy.f96737i.mo53751a(true);
        }
        bxvd da = ayev.f97376n.mo74144da();
        bxvd da2 = ayfe.f97466e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ayfe ayfe = (ayfe) da2.f164949b;
        ayfe.f97468a |= 2;
        ayfe.f97471d = 2;
        Map f = axxy.f96731c.mo53748f();
        for (Map.Entry entry : f.entrySet()) {
            bxvd da3 = ayfd.f97461d.mo74144da();
            String str3 = (String) entry.getKey();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ayfd ayfd = (ayfd) da3.f164949b;
            str3.getClass();
            ayfd.f97463a |= 1;
            ayfd.f97464b = str3;
            long longValue = ((Long) entry.getValue()).longValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ayfd ayfd2 = (ayfd) da3.f164949b;
            ayfd2.f97463a |= 2;
            ayfd2.f97465c = longValue;
            ayfd ayfd3 = (ayfd) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayfe ayfe2 = (ayfe) da2.f164949b;
            ayfd3.getClass();
            if (!ayfe2.f97470c.mo73666a()) {
                ayfe2.f97470c = GeneratedMessageLite.m124021a(ayfe2.f97470c);
            }
            ayfe2.f97470c.add(ayfd3);
        }
        long longValue2 = f.containsKey(axxy.f96730b) ? ((Long) f.get(axxy.f96730b)).longValue() : -1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ayfe ayfe3 = (ayfe) da2.f164949b;
        ayfe3.f97468a = 1 | ayfe3.f97468a;
        ayfe3.f97469b = longValue2;
        if (axxy.m83539b()) {
            String str4 = axxy.f96729a;
            String str5 = axxy.f96730b;
            long j = ((ayfe) da2.f164949b).f97469b;
            String valueOf = String.valueOf(f);
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 71 + String.valueOf(str5).length() + String.valueOf(valueOf).length());
            sb.append("onConnect: node=");
            sb.append(str4);
            sb.append(", peer=");
            sb.append(str5);
            sb.append(", receivedSeqId=");
            sb.append(j);
            sb.append(", syncTable=");
            sb.append(valueOf);
            Log.v("datatransport", sb.toString());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayev ayev = (ayev) da.f164949b;
        ayfe ayfe4 = (ayfe) da2.mo74062i();
        ayfe4.getClass();
        ayev.f97384g = ayfe4;
        ayev.f97378a |= 32;
        try {
            axyv.mo53700a(3, 0, (ayev) da.mo74062i(), null);
        } catch (IOException e) {
            Log.d("datatransport", "  exception while sending syncStart to peer", e);
        } catch (InterruptedException e2) {
            Log.d("datatransport", "  exception while sending syncStart to peer", e2);
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public final void mo53589a(String str) {
        axxy axxy = (axxy) this.f96743c.get(str);
        if (axxy != null) {
            axxy.mo53753a();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, boolean, java.lang.String):axxr
     arg types: [axxi, int, java.lang.String]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void
      axxv.a(android.database.sqlite.SQLiteDatabase, axue, java.lang.String):boolean
      axxv.a(axue, android.net.Uri, boolean):com.google.android.gms.common.data.DataHolder
      axxv.a(ssb, boolean, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axxv.a(axxi, boolean, java.lang.String):axxr */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0318, code lost:
        if (r5 > r8.longValue()) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bd, code lost:
        if (r2.f96739k != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        r4 = new java.util.HashMap(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c4, code lost:
        r3 = r2.f96731c.mo53733a(r4).entrySet().iterator();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d7, code lost:
        if (r3.hasNext() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d9, code lost:
        r6 = (java.util.Map.Entry) r3.next();
        r8 = (java.lang.String) r6.getKey();
        r11 = ((java.lang.Long) r6.getValue()).longValue();
        r6 = r4.containsKey(r8);
        r15 = new p000.axxx(r2, r0);
        r2.f96731c.mo53738a(r8, r11, -1, !r6, r15);
        r9 = r15.f96724a;
        r5 = r5 + r15.f96726c;
        r4.put(r8, java.lang.Long.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0113, code lost:
        if (p000.axxy.m83539b() == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0115, code lost:
        r3 = r2.f96729a;
        r6 = r2.f96730b;
        r8 = java.lang.String.valueOf(r4);
        r12 = new java.lang.StringBuilder(((java.lang.String.valueOf(r3).length() + 67) + java.lang.String.valueOf(r6).length()) + java.lang.String.valueOf(r8).length());
        r12.append("handleSyncStart: node=");
        r12.append(r3);
        r12.append(", peer=");
        r12.append(r6);
        r12.append(", version=2, sent=");
        r12.append(r5);
        r12.append(", synced=");
        r12.append(r8);
        android.util.Log.v("datatransport", r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0167, code lost:
        r3 = r2.f96733e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0169, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x016c, code lost:
        if (r2.f96735g == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016e, code lost:
        r2.f96735g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0171, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0174, code lost:
        r2.f96734f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0176, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0177, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017f, code lost:
        if (r9 != -1) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0181, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0183, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0185, code lost:
        r4 = new p000.axxx(r2, r0);
        r5 = r2.f96731c;
        r6 = r2.f96730b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0195, code lost:
        if (android.util.Log.isLoggable("DataItems", 3) == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0197, code lost:
        r11 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 133);
        r11.append("getDataItemsByV1SeqIdAndNonMatchingSourceNodeId: sourceNodeId=");
        r11.append(r6);
        r11.append(", v1SeqId=");
        r11.append(r9);
        r11.append(", limit=-1, excludeDeleted=");
        r11.append(r3);
        android.util.Log.d("DataItems", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c7, code lost:
        r5 = r5.f96695c.getReadableDatabase();
        r5.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d0, code lost:
        if (r3 != false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d2, code lost:
        r14 = "v1SeqId >? AND v1SourceNode != ?";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d6, code lost:
        r14 = "v1SeqId >? AND v1SourceNode != ? AND deleted=0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        p000.axxv.m83497a(r5.query("dataItemsAndAssets", p000.axyx.f96804a, r14, new java.lang.String[]{java.lang.Long.toString(r9), r6}, null, null, "v1SeqId", null), r4);
        r5.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fc, code lost:
        r5.endTransaction();
        r9 = r4.f96725b;
        r4 = r4.f96726c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0207, code lost:
        if (p000.axxy.m83539b() == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        r5 = r2.f96729a;
        r6 = r2.f96730b;
        r12 = new java.lang.StringBuilder((java.lang.String.valueOf(r5).length() + 90) + java.lang.String.valueOf(r6).length());
        r12.append("handleSyncStart: node=");
        r12.append(r5);
        r12.append(", peer=");
        r12.append(r6);
        r12.append(", version=1, sent=");
        r12.append(r4);
        r12.append(", lastSeqId=");
        r12.append(r9);
        android.util.Log.v("datatransport", r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x024e, code lost:
        r4 = r2.f96733e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0250, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0253, code lost:
        if (r2.f96735g == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0255, code lost:
        r2.f96735g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0258, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0259, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x025c, code lost:
        r2.f96734f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x025e, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0263, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0264, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0267, code lost:
        throw r0;
     */
    /* renamed from: a */
    public final void mo53590a(String str, ayev ayev, axyt axyt) {
        ayev ayev2 = ayev;
        axxy axxy = (axxy) this.f96743c.get(str);
        if (axxy != null) {
            int i = ayev2.f97378a;
            if ((i & 32) != 0) {
                ayfe ayfe = ayev2.f97384g;
                if (ayfe == null) {
                    ayfe = ayfe.f97466e;
                }
                axxy.f96739k = ayfe.f97471d < 2;
                long j = ayfe.f97469b;
                HashMap hashMap = new HashMap();
                bxwc bxwc = ayfe.f97470c;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ayfd ayfd = (ayfd) bxwc.get(i2);
                    hashMap.put(ayfd.f97464b, Long.valueOf(ayfd.f97465c));
                }
                if (axxy.m83539b()) {
                    String str2 = axxy.f96729a;
                    String str3 = axxy.f96730b;
                    int i3 = ayfe.f97471d;
                    long j2 = ayfe.f97469b;
                    String valueOf = String.valueOf(hashMap);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 98 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
                    sb.append("handleSyncStart: node=");
                    sb.append(str2);
                    sb.append(", peer=");
                    sb.append(str3);
                    sb.append(", version=");
                    sb.append(i3);
                    sb.append(", receivedSeqId=");
                    sb.append(j2);
                    sb.append(", syncTable=");
                    sb.append(valueOf);
                    Log.v("datatransport", sb.toString());
                }
                synchronized (axxy.f96733e) {
                    axxy.f96738j = hashMap;
                    axyv axyv = axxy.f96736h;
                    if (axyv == null) {
                    }
                }
            } else if ((i & 64) != 0) {
                ayfc ayfc = ayev2.f97385h;
                if (ayfc == null) {
                    ayfc = ayfc.f97448k;
                }
                if (axxy.m83539b()) {
                    String str4 = axxy.f96729a;
                    String str5 = axxy.f96730b;
                    String str6 = ayfc.f97453d;
                    String str7 = ayfc.f97457h;
                    long j3 = ayfc.f97455f;
                    long j4 = ayfc.f97459j;
                    boolean z = ayfc.f97456g;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 124 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length());
                    sb2.append("handleSetDataItem: node=");
                    sb2.append(str4);
                    sb2.append(", peer=");
                    sb2.append(str5);
                    sb2.append(", ");
                    sb2.append(str6);
                    sb2.append(", sourceNode=");
                    sb2.append(str7);
                    sb2.append(", seqId=");
                    sb2.append(j3);
                    sb2.append(", lastModified=");
                    sb2.append(j4);
                    sb2.append(", deleted=");
                    sb2.append(z);
                    Log.d("datatransport", sb2.toString());
                }
                String str8 = !axxy.f96739k ? ayfc.f97457h : axxy.f96730b;
                synchronized (axxy.f96733e) {
                    long j5 = ayfc.f97455f;
                    Long l = (Long) axxy.f96738j.get(str8);
                    if (l == null) {
                    }
                    l = Long.valueOf(j5);
                    axxy.f96738j.put(str8, l);
                    l.longValue();
                }
                axxv axxv = axxy.f96731c;
                axxi axxi = new axxi(axue.m83239a(ayfc.f97451b, ayfc.f97452c));
                axxi.f96651f = ayfc.f97455f;
                axxi.f96652g = -1;
                axxi.f96650e = str8;
                axxi.f96648c = ayfc.f97456g;
                axxi.f96653h = ayfc.f97459j;
                Uri parse = Uri.parse(ayfc.f97453d);
                axxi.f96647b = new axxf(parse.getHost(), parse.getPath());
                axxi.f96647b.f96642d = ayfc.f97454e.getKey();
                axxf axxf = axxi.f96647b;
                if (ayfc.f97458i.size() != 0) {
                    bxwc bxwc2 = ayfc.f97458i;
                    int size2 = bxwc2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ayef ayef = (ayef) bxwc2.get(i4);
                        String str9 = ayef.f97294b;
                        ayee ayee = ayef.f97295c;
                        if (ayee == null) {
                            ayee = ayee.f97286c;
                        }
                        axxf.mo53711a(str9, axuh.m83243a(ayee.f97289b));
                    }
                }
                axxv.mo53729a(axxi, true, axxy.f96730b);
                synchronized (axxy.f96733e) {
                    axxw axxw = axxy.f96737i;
                    if (axxw != null) {
                        axxw.mo53752b();
                    }
                    axxy.f96732d.mo53752b();
                }
                if (axxy.m83539b()) {
                    String valueOf2 = String.valueOf(axxy.f96730b);
                    Log.d("datatransport", valueOf2.length() == 0 ? new String("handleSetDataItem is done: peer=") : "handleSetDataItem is done: peer=".concat(valueOf2));
                }
            }
        } else {
            Log.e("datatransport", "Received message from a disconnected node. What?");
        }
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        long j;
        String str;
        int i;
        Iterator it;
        if (Log.isLoggable("datatransport", 2)) {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(31);
            sb.append("onDataItemsChanged: ");
            sb.append(size);
            Log.v("datatransport", sb.toString());
        }
        Iterator it2 = this.f96743c.values().iterator();
        while (it2.hasNext()) {
            axxy axxy = (axxy) it2.next();
            int i2 = 0;
            for (int size2 = arrayList.size(); i2 < size2; size2 = i) {
                axxi axxi = (axxi) arrayList.get(i2);
                synchronized (axxy.f96733e) {
                    String str2 = axxi.f96650e;
                    Long l = (Long) axxy.f96738j.get(str2);
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = -1;
                    }
                    axyv axyv = axxy.f96736h;
                    if (axyv == null) {
                        str = "there is no message writer";
                    } else if (axxy.f96739k && axxi.f96650e.equals(axxy.f96730b)) {
                        str = "this item came from this peer";
                    } else if (!axxy.f96739k && axxi.f96651f <= j) {
                        str = "the peer is already at this seqId for this source";
                    } else if (!axxy.f96734f) {
                        str = "initial sync is in progress";
                        axxy.f96735g = true;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        it = it2;
                        i = size2;
                        axxy.mo53754a(axyv, axxi);
                    } else if (axxy.m83539b()) {
                        String str3 = axxy.f96729a;
                        String str4 = axxy.f96730b;
                        it = it2;
                        long j2 = axxi.f96651f;
                        String valueOf = String.valueOf(axxi);
                        i = size2;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + MfiClientException.TYPE_MFICLIENT_STARTED + String.valueOf(str4).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(str).length());
                        sb2.append("sendDataItemRecord: not sending data item, node=");
                        sb2.append(str3);
                        sb2.append(", peer=");
                        sb2.append(str4);
                        sb2.append(", peerSeqId=");
                        sb2.append(j);
                        sb2.append(", sourceNode=");
                        sb2.append(str2);
                        sb2.append(", dataSeqId=");
                        sb2.append(j2);
                        sb2.append(", dataItem=");
                        sb2.append(valueOf);
                        sb2.append(", because ");
                        sb2.append(str);
                        Log.v("datatransport", sb2.toString());
                    } else {
                        it = it2;
                        i = size2;
                    }
                }
                i2++;
                it2 = it;
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.mo26034a();
        String valueOf = String.valueOf(this.f96742b.mo53808b().f96814a);
        ssb.println(valueOf.length() == 0 ? new String("local: ") : "local: ".concat(valueOf));
        for (axxy axxy : this.f96743c.values()) {
            axxy.mo53558a(ssb, z, z2);
            ssb.println("======");
            ssb.println();
        }
        ssb.mo26035b();
    }
}
