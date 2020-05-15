package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vav implements vcf {

    /* renamed from: a */
    public static final van f48881a = new vas();

    /* renamed from: c */
    private static volatile vav f48882c;

    /* renamed from: b */
    public final Set f48883b;

    /* renamed from: d */
    private final van[] f48884d;

    /* renamed from: e */
    private final Map f48885e = new HashMap();

    /* renamed from: f */
    private final vcg f48886f;

    /* renamed from: g */
    private final vff f48887g;

    /* renamed from: h */
    private final vcz f48888h;

    /* renamed from: i */
    private final long f48889i;

    /* renamed from: j */
    private final Map f48890j = new HashMap();

    private vav(Set set, vcg vcg, vff vff, vcz vcz, long j, van[] vanArr) {
        this.f48883b = set;
        this.f48886f = vcg;
        this.f48887g = vff;
        this.f48888h = vcz;
        this.f48889i = j;
        this.f48884d = vanArr;
        this.f48885e.put("IDLE", f48881a);
        van[] vanArr2 = this.f48884d;
        int length = vanArr2.length;
        for (int i = 0; i < 2; i++) {
            van van = vanArr2[i];
            if (this.f48885e.put(van.mo28169a(), van) != null) {
                String valueOf = String.valueOf(van.mo28169a());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate level name ") : "Duplicate level name ".concat(valueOf));
            }
        }
    }

    /* renamed from: a */
    public static boolean m39898a() {
        return ((Boolean) twy.f46808S.mo58455c()).booleanValue();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    public static synchronized void m39899b() {
        synchronized (vav.class) {
            if (f48882c == null) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(Arrays.asList(uct.class, ucw.class, ucx.class, ucy.class, ucz.class, udh.class, udk.class, udp.class, uds.class, udu.class, udw.class, ueb.class, uee.class, uej.class, uek.class, uel.class, ueo.class));
                Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
                van[] vanArr = {new vat("HIGH", ((Long) twy.f46885l.mo58455c()).longValue(), ((Integer) twy.f46884k.mo58455c()).intValue(), ((Long) twy.f46886m.mo58455c()).longValue()), new vax("LOW", ((Long) twy.f46882i.mo58455c()).longValue(), ((Integer) twy.f46881h.mo58455c()).intValue(), ((Long) twy.f46883j.mo58455c()).longValue())};
                vpu a = vpu.m41034a();
                vcg vcg = a.f49763j;
                vav vav = new vav(unmodifiableSet, vcg, a.f49760g, a.f49777x, Math.max(0L, Math.max(((Long) twy.f46886m.mo58455c()).longValue(), ((Long) twy.f46883j.mo58455c()).longValue())), vanArr);
                vcg.f49020f = vav;
                f48882c = vav;
            }
        }
    }

    /* renamed from: c */
    public static vav m39900c() {
        vav vav = f48882c;
        sdo.checkIfNull(vav, "Must be inited before get");
        return vav;
    }

    /* renamed from: d */
    public final synchronized void mo28182d() {
        for (var var : this.f48890j.values()) {
            var.mo28179e();
        }
    }

    /* renamed from: a */
    public final synchronized var mo28181a(String str) {
        long j;
        String str2 = str;
        synchronized (this) {
            var var = (var) this.f48890j.get(str2);
            if (var != null) {
                return var;
            }
            vao vao = null;
            String string = ((vfg) this.f48887g).mo28388d().getString(vfg.m40285b(str), null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("activeLevel");
                    JSONArray jSONArray = jSONObject.getJSONArray("activityHistory");
                    int length = jSONArray.length();
                    long[] jArr = new long[length];
                    long optLong = jSONObject.optLong("lastActivityLevelChangeTimestamp", -1);
                    long optLong2 = jSONObject.optLong("numPendingPushNotifications", 0);
                    for (int i = 0; i < length; i++) {
                        jArr[i] = jSONArray.getLong(i);
                    }
                    vao = new vao(string2, jArr, optLong, optLong2);
                } catch (JSONException e) {
                }
            }
            vaw vaw = new vaw();
            van van = f48881a;
            if (vao != null) {
                van[] vanArr = this.f48884d;
                int length2 = vanArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    }
                    van van2 = vanArr[i2];
                    if (van2.mo28169a().equals(vao.f48853a)) {
                        van = van2;
                        break;
                    }
                    i2++;
                }
                for (long j2 : vao.f48854b) {
                    vaw.mo28184a(j2);
                }
                j = vao.f48856d;
            } else {
                j = 0;
            }
            var var2 = new var(vpu.m41034a().f49755b, str, this.f48886f, this.f48887g, this.f48884d, vaw, this.f48888h, j, this.f48889i);
            var2.mo28174a(van);
            this.f48890j.put(str2, var2);
            return var2;
        }
    }
}
