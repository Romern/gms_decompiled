package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.scheduler.standalone.ContentTaskController$UserStartingReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: apkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apkr implements apib {

    /* renamed from: a */
    final ContentTaskController$UserStartingReceiver f84624a = new ContentTaskController$UserStartingReceiver(this);

    /* renamed from: b */
    private final ContentResolver f84625b;

    /* renamed from: c */
    private Handler f84626c;

    /* renamed from: d */
    private final Context f84627d;

    /* renamed from: e */
    private final apln f84628e;

    /* renamed from: f */
    private final C1223np f84629f = new C1223np();

    /* renamed from: g */
    private final SparseArray f84630g = new SparseArray();

    public apkr(Context context, apln apln) {
        this.f84627d = context;
        this.f84625b = context.getContentResolver();
        this.f84628e = apln;
    }

    /* renamed from: a */
    private final void m70541a(int i, Collection collection, int i2) {
        Intent intent = new Intent();
        intent.setClassName(this.f84627d, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        intent.putExtra("OP_CODE", i2);
        int[] iArr = new int[collection.size()];
        Uri[] uriArr = new Uri[collection.size()];
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < collection.size() && it.hasNext(); i3++) {
            aeab aeab = (aeab) it.next();
            iArr[i3] = aeab.f62978b;
            uriArr[i3] = aeab.f62977a;
        }
        intent.putExtra("content_uri_flags_array", iArr);
        intent.putExtra("content_uri_array", uriArr);
        aajg.m21336a(this.f84627d, i, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, null);
    }

    /* renamed from: b */
    private final synchronized C1223np m70547b(int i) {
        C1223np npVar;
        npVar = (C1223np) this.f84630g.get(i);
        if (npVar == null) {
            if (this.f84630g.size() == 0) {
                this.f84627d.registerReceiver(this.f84624a, new IntentFilter("android.intent.action.USER_STARTING"));
            }
            npVar = new C1223np();
            this.f84630g.put(i, npVar);
        }
        return npVar;
    }

    /* renamed from: a */
    public final synchronized void mo47255a(Handler handler) {
        if (this.f84626c == null) {
            this.f84626c = handler;
        }
    }

    /* renamed from: b */
    private final void m70548b(int i, Collection collection, int i2) {
        if (sqw.m36041a(collection)) {
            return;
        }
        if (collection.size() <= 100) {
            m70541a(i, collection, i2);
            return;
        }
        ArrayList arrayList = new ArrayList(100);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((aeab) it.next());
            if (arrayList.size() >= 100) {
                m70541a(i, arrayList, i2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            m70541a(i, arrayList, i2);
        }
    }

    /* renamed from: a */
    private final synchronized void m70542a(apid apid, int i, aead aead) {
        C1223np npVar = (C1223np) this.f84630g.get(i);
        if (npVar != null) {
            C1225nr nrVar = new C1225nr();
            for (aeab aeab : aead.f62980a) {
                Set set = (Set) npVar.get(aeab);
                if (set != null) {
                    set.remove(apid);
                    if (set.isEmpty()) {
                        npVar.remove(aeab);
                        nrVar.add(aeab);
                    }
                }
            }
            m70548b(i, nrVar, 2);
            if (npVar.isEmpty()) {
                this.f84630g.remove(i);
                if (this.f84630g.size() == 0) {
                    this.f84627d.unregisterReceiver(this.f84624a);
                }
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m70543a(apid apid, int i, boolean z) {
        Set set;
        C1223np b = m70547b(i);
        Set<aeab> set2 = ((aead) apid.f84444n).f62980a;
        ArrayList arrayList = new ArrayList();
        for (aeab aeab : set2) {
            if (b.containsKey(aeab)) {
                set = (Set) b.get(aeab);
            } else {
                if (z) {
                    Log.w("NetworkScheduler", String.format(Locale.US, "%s should already be observed.", aeab));
                }
                C1225nr nrVar = new C1225nr();
                arrayList.add(aeab);
                b.put(aeab, nrVar);
                set = nrVar;
            }
            if (set != null) {
                m70546a(apid, z, set);
            }
        }
        if (!z) {
            m70548b(i, arrayList, 1);
        }
    }

    /* renamed from: a */
    private final synchronized void m70544a(apid apid, aead aead) {
        for (aeab aeab : aead.f62980a) {
            aplc aplc = (aplc) this.f84629f.get(aeab);
            if (aplc != null) {
                Set set = aplc.f84681a;
                set.remove(apid);
                if (set.isEmpty()) {
                    this.f84625b.unregisterContentObserver(aplc);
                    this.f84629f.remove(aeab);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x000b A[SYNTHETIC] */
    /* renamed from: a */
    private final synchronized void m70545a(apid apid, boolean z) {
        aplc aplc;
        for (aeab aeab : ((aead) apid.f84444n).f62980a) {
            if (this.f84629f.containsKey(aeab)) {
                aplc = (aplc) this.f84629f.get(aeab);
            } else {
                if (z) {
                    Log.w("NetworkScheduler", String.format(Locale.US, "%s should already be observed.", aeab));
                }
                aplc aplc2 = new aplc(this.f84626c, aeab, this);
                try {
                    this.f84625b.registerContentObserver(aeab.f62977a, aeab.mo33968a(), aplc2);
                    this.f84629f.put(aeab, aplc2);
                    aplc = aplc2;
                } catch (SecurityException e) {
                    e = e;
                    String valueOf = String.valueOf(aeab);
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
                    sb.append("Failed to register content observer for ");
                    sb.append(valueOf);
                    sb.append(": ");
                    sb.append(valueOf2);
                    Log.w("NetworkScheduler", sb.toString());
                    aplc = null;
                    if (aplc != null) {
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    String valueOf3 = String.valueOf(aeab);
                    String valueOf22 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 42 + String.valueOf(valueOf22).length());
                    sb2.append("Failed to register content observer for ");
                    sb2.append(valueOf3);
                    sb2.append(": ");
                    sb2.append(valueOf22);
                    Log.w("NetworkScheduler", sb2.toString());
                    aplc = null;
                    if (aplc != null) {
                    }
                }
            }
            if (aplc != null) {
                m70546a(apid, z, aplc.f84681a);
            }
        }
    }

    /* renamed from: a */
    private static final void m70546a(apid apid, boolean z, Set set) {
        if (z) {
            set.remove(apid);
        }
        set.add(apid);
    }

    /* renamed from: a */
    public final synchronized void mo47373a(int i) {
        C1223np npVar = (C1223np) this.f84630g.get(i);
        if (!sqw.m36042a((Map) npVar)) {
            m70548b(i, npVar.keySet(), 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0010 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* renamed from: a */
    public final synchronized void mo47374a(aeab aeab, Uri uri, int i) {
        Set<apid> set;
        if (aeab.mo33968a()) {
            if (uri != null) {
                if (i == 0) {
                    C1223np npVar = (C1223np) this.f84630g.get(i);
                    set = (npVar == null || !npVar.containsKey(aeab)) ? null : (Set) npVar.get(aeab);
                } else {
                    aplc aplc = (aplc) this.f84629f.get(aeab);
                    set = aplc != null ? aplc.f84681a : null;
                }
                if (set != null) {
                    for (apid apid : set) {
                        if (uri != null) {
                            apid.mo47259a(uri);
                            this.f84628e.mo47399a(apid, null);
                        }
                    }
                    aphm aphm = apht.m70315a().f84401a;
                    if (aphm != null) {
                        bljb a = blkh.m107281a("NetworkScheduler_contentUriTriggered");
                        try {
                            aphm.f84391b.execute(bljx.m107269a(aphk.m70299a(aphm.f84390a, aapx.CONTENT_URI_UPDATED)));
                            if (a != null) {
                                a.close();
                            }
                        } catch (Throwable th) {
                            bqye.m113761a(th, th);
                        }
                    }
                }
            }
        }
        uri = aeab.f62977a;
        if (i == 0) {
        }
        if (set != null) {
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo47256a(apid apid) {
        if (apid != null) {
            if (apid.f84445o == 2) {
                int i = (int) apid.f84431a.f28809e;
                aead aead = (aead) apid.f84444n;
                if (i == 0) {
                    m70544a(apid, aead);
                    return;
                }
                m70542a(apid, i, aead);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[Catch:{ all -> 0x000d }] */
    /* renamed from: a */
    public final synchronized void mo47257a(apid apid, apid apid2, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (apid != null) {
            try {
                if (apid.mo47280q()) {
                    z = true;
                    if (i == 1 || apid2 != null) {
                        if (apid2 != null && apid2.mo47280q()) {
                            if (!apid.equals(apid2)) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z && z2) {
                        if (this.f84626c == null) {
                            z3 = false;
                        }
                        sdo.m34971a(z3, (Object) "Handler should be populated.");
                        if (apid2 != null) {
                            z4 = ((aead) apid.f84444n).f62980a.equals(((aead) apid2.f84444n).f62980a);
                            if (!z4) {
                                mo47256a(apid2);
                            } else {
                                if (i == 3) {
                                    apid.mo47260a(apid2.mo47265d());
                                }
                                apid.mo47260a(apid2.mo47263b());
                            }
                        }
                        int i2 = (int) apid.f84431a.f28809e;
                        if (i2 != 0) {
                            m70543a(apid, i2, z4);
                            return;
                        } else {
                            m70545a(apid, z4);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        if (i == 1) {
        }
        if (!apid.equals(apid2)) {
        }
    }
}
