package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: var */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class var implements vam {

    /* renamed from: i */
    private static final sbw f48860i = new sbw("PushNotificationControl", "");

    /* renamed from: a */
    public final Set f48861a = new HashSet();

    /* renamed from: b */
    public final vaw f48862b;

    /* renamed from: c */
    public final AtomicLong f48863c = new AtomicLong();

    /* renamed from: d */
    public van f48864d;

    /* renamed from: e */
    public boolean f48865e;

    /* renamed from: f */
    public boolean f48866f;

    /* renamed from: g */
    public boolean f48867g;

    /* renamed from: h */
    public final Map f48868h = new C1223np();

    /* renamed from: j */
    private final String f48869j;

    /* renamed from: k */
    private final vcg f48870k;

    /* renamed from: l */
    private final vff f48871l;

    /* renamed from: m */
    private final van[] f48872m;

    /* renamed from: n */
    private final vcz f48873n;

    /* renamed from: o */
    private final long f48874o;

    /* renamed from: p */
    private long f48875p = 0;

    /* renamed from: q */
    private long f48876q = -1;

    /* renamed from: r */
    private final vap f48877r;

    /* renamed from: s */
    private final vaq f48878s;

    public var(Context context, String str, vcg vcg, vff vff, van[] vanArr, vaw vaw, vcz vcz, long j, long j2) {
        vap vap = new vap(context, str);
        vaq vaq = new vaq(context);
        this.f48869j = str;
        this.f48870k = vcg;
        this.f48871l = vff;
        this.f48872m = vanArr;
        this.f48862b = vaw;
        this.f48873n = vcz;
        this.f48874o = j2;
        this.f48877r = vap;
        this.f48863c.set(j);
        this.f48878s = vaq;
    }

    /* renamed from: b */
    private final void m39885b(van van) {
        if (this.f48864d == vav.f48881a) {
            this.f48877r.mo28172a(false);
        } else {
            this.f48877r.mo28172a(true);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (van != null) {
            vcy c = this.f48873n.mo28312c();
            c.mo28300c(1, 37);
            c.mo28289a(this.f48864d);
            c.mo28290a(van, currentTimeMillis - this.f48876q);
            c.mo28309j();
            c.mo28274a();
        }
        this.f48876q = currentTimeMillis;
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
    /* renamed from: a */
    public final synchronized void mo28173a() {
        sdo.m34971a(this.f48864d != null, (Object) "Not initialized yet");
        this.f48866f = true;
        this.f48867g = false;
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
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo28177c() {
        boolean z;
        if (this.f48864d != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Not initialized yet");
        van van = vav.f48881a;
        long currentTimeMillis = System.currentTimeMillis();
        van[] vanArr = this.f48872m;
        int length = vanArr.length;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            van van2 = vanArr[i];
            if (van2.mo28171a(this, currentTimeMillis)) {
                van = van2;
                break;
            }
            i++;
        }
        van van3 = this.f48864d;
        if (van == van3) {
            return false;
        }
        this.f48864d = van;
        m39885b(van3);
        mo28179e();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return false;
     */
    /* renamed from: d */
    public final synchronized boolean mo28178d() {
        boolean c = mo28177c();
        if (this.f48865e) {
            vaq vaq = this.f48878s;
            int intValue = ((Integer) twy.f46851ai.mo58455c()).intValue();
            if (intValue <= 0 || srf.m36096e(vaq.f48859a) * 100.0f >= ((float) intValue) || vop.m40939a(vaq.f48859a)) {
                if (c) {
                    if (this.f48864d == vav.f48881a) {
                        return true;
                    }
                }
                if (!this.f48864d.mo28170a(System.currentTimeMillis() - this.f48875p)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo28179e() {
        van van = this.f48864d;
        vaw vaw = this.f48862b;
        long j = this.f48876q;
        long j2 = this.f48863c.get();
        int length = vaw.f48891a.length;
        long[] jArr = new long[length];
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            jArr[i] = vaw.mo28183a(i2);
            i++;
        }
        vao vao = new vao(van.mo28169a(), jArr, j, j2);
        vff vff = this.f48871l;
        String str = this.f48869j;
        try {
            SharedPreferences.Editor edit = ((vfg) vff).mo28388d().edit();
            String b = vfg.m40285b(str);
            JSONArray jSONArray = new JSONArray();
            for (long j3 : vao.f48854b) {
                jSONArray.put(j3);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeLevel", vao.f48853a);
            jSONObject.put("activityHistory", jSONArray);
            jSONObject.put("lastActivityLevelChangeTimestamp", vao.f48855c);
            if (!edit.putString(b, jSONObject.toString()).commit()) {
                f48860i.mo25372b("PushNotificationControl", "persistActivityState failed to persist state");
            }
        } catch (JSONException e) {
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
    /* renamed from: a */
    public final synchronized void mo28174a(van van) {
        boolean z;
        if (this.f48864d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Initial level has been set");
        this.f48864d = van;
        m39885b(null);
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
    /* renamed from: a */
    public final synchronized void mo28175a(boolean z) {
        boolean z2;
        if (this.f48864d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "Not initialized yet");
        if (z) {
            this.f48865e = this.f48867g;
            this.f48875p = System.currentTimeMillis();
        }
        this.f48866f = false;
    }

    /* renamed from: b */
    public final void mo28176b() {
        vcg vcg = this.f48870k;
        String str = this.f48869j;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(((C1245ok) this.f48868h).f26809h);
        synchronized (this) {
            Iterator it = this.f48868h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) entry.getValue()).longValue() <= this.f48874o) {
                    arrayList.add((String) entry.getKey());
                } else {
                    it.remove();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("com.google.android.gms");
        }
        vcg.mo28218a(str, (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 3, arrayList);
    }
}
