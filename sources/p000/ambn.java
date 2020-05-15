package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ambn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ambn {

    /* renamed from: l */
    public static volatile boolean f74652l = true;

    /* renamed from: a */
    public final Object f74653a = new Object();

    /* renamed from: b */
    protected final Context f74654b;

    /* renamed from: c */
    protected final Bundle f74655c;

    /* renamed from: d */
    public final boolean f74656d;

    /* renamed from: e */
    public final anct f74657e;

    /* renamed from: f */
    public boolean f74658f;

    /* renamed from: g */
    public ConnectionResult f74659g;

    /* renamed from: h */
    public DataHolder f74660h;

    /* renamed from: i */
    public DataHolder f74661i;

    /* renamed from: j */
    public boolean f74662j;

    /* renamed from: k */
    public Cursor f74663k;

    /* renamed from: m */
    public final Collator f74664m = Collator.getInstance();

    /* renamed from: n */
    public final amaw f74665n;

    /* renamed from: o */
    private boolean f74666o;

    protected ambn(Context context, amaw amaw, Bundle bundle) {
        this.f74654b = context;
        this.f74665n = amaw;
        this.f74655c = bundle;
        this.f74656d = !TextUtils.isEmpty(null);
        this.f74657e = ancs.f76643a;
    }

    /* renamed from: a */
    protected static void m62540a(ambm ambm, HashMap hashMap) {
        ambm.f74651c = -1;
        while (ambm.mo41110a()) {
            String a = ambm.mo41109a("gaia_id");
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(a, Integer.valueOf(ambm.f74651c));
            }
        }
    }

    /* renamed from: b */
    protected static final void m62542b(ambm ambm, HashMap hashMap) {
        ambm.f74651c = -1;
        while (ambm.mo41110a()) {
            hashMap.put(ambm.mo41109a("value"), ambm.mo41109a("gaia_id"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ambg mo41111a(ambm ambm, ambm ambm2, Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Cursor mo41114b();

    /* renamed from: c */
    public final void mo41115c() {
        synchronized (this.f74653a) {
            sdo.m34974b(this.f74658f);
            sdo.m34974b(this.f74662j);
            DataHolder dataHolder = this.f74660h;
            if (dataHolder != null) {
                dataHolder.close();
            }
            DataHolder dataHolder2 = this.f74661i;
            if (dataHolder2 != null) {
                dataHolder2.close();
            }
            Cursor cursor = this.f74663k;
            if (cursor != null) {
                cursor.close();
            }
            if (!this.f74666o) {
                this.f74666o = true;
                this.f74665n.mo41075a(8, null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        new p000.ambk(r3).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        android.util.Log.e("PeopleAggregator", "Unable to start thread", r0);
        mo41115c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo41115c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r3.f74659g.mo17671b() == false) goto L_0x0029;
     */
    /* renamed from: d */
    public final void mo41116d() {
        synchronized (this.f74653a) {
            if (!this.f74658f || !this.f74662j) {
            }
        }
    }

    /* renamed from: a */
    protected static final void m62541a(Cursor cursor, ancu ancu, ancg ancg, HashMap hashMap) {
        int i = -1;
        cursor.moveToPosition(-1);
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(6);
        long j = -1;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            if (j2 != j) {
                arrayList.clear();
                arrayList2.clear();
                i = cursor.getPosition();
                j = j2;
            }
            String string = cursor.getString(2);
            if ("vnd.android.cursor.item/email_v2".equals(string) || "vnd.android.cursor.item/phone_v2".equals(string)) {
                String string2 = cursor.getString(3);
                if (!TextUtils.isEmpty(string2) && !arrayList2.contains(string2)) {
                    arrayList2.add(string2);
                    String str = (String) hashMap.get(string2);
                    if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                        arrayList.add(str);
                        ancv ancv = ancu.f76646a;
                        Integer valueOf = Integer.valueOf(i);
                        sdo.m34959a((Object) str);
                        Object obj = ancv.f76647a.get(str);
                        if (obj == null) {
                            ancv.f76647a.put(str, valueOf);
                        } else if (obj instanceof ArrayList) {
                            ((ArrayList) obj).add(valueOf);
                        } else {
                            ArrayList arrayList3 = new ArrayList(4);
                            arrayList3.add(obj);
                            arrayList3.add(valueOf);
                            ancv.f76647a.put(str, arrayList3);
                        }
                        sdo.m34959a(valueOf);
                        Object obj2 = ancg.f76621a.get(valueOf);
                        if (obj2 == null) {
                            ancg.f76621a.put(valueOf, str);
                        } else if (obj2 instanceof String) {
                            ArrayList arrayList4 = new ArrayList(4);
                            arrayList4.add((String) obj2);
                            arrayList4.add(str);
                            ancg.f76621a.put(valueOf, arrayList4);
                        } else {
                            ((ArrayList) obj2).add(str);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41112a() {
        try {
            new ambl(this).start();
        } catch (Exception e) {
            Log.e("PeopleAggregator", "Unable to start thread", e);
            mo41113a(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41113a(Cursor cursor) {
        if (cursor == null) {
            this.f74657e.mo41711a("contacts load failure");
        } else {
            this.f74657e.mo41711a("contacts loaded");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        synchronized (this.f74653a) {
            this.f74662j = true;
            this.f74663k = cursor;
        }
        mo41116d();
    }
}
