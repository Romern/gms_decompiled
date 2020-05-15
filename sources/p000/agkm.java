package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agkm extends agcu {

    /* renamed from: b */
    protected agkl f65808b;

    /* renamed from: c */
    public final AtomicReference f65809c = new AtomicReference();

    /* renamed from: d */
    final agcx f65810d;

    /* renamed from: e */
    private final Set f65811e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f65812f;

    public agkm(agje agje) {
        super(agje);
        this.f65810d = new agcx(agje);
    }

    /* renamed from: a */
    public final ArrayList mo35563a(String str, String str2, String str3) {
        if (mo35498F().mo35495c()) {
            mo35497E().f65564c.mo35435a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        mo35537u();
        if (agde.m54034a()) {
            mo35497E().f65564c.mo35435a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f65756y.mo35498F().mo35493a(atomicReference, "get conditional user properties", new agki(this, atomicReference, str, str2, str3));
        List<ConditionalUserPropertyParcel> list = (List) atomicReference.get();
        if (list == null) {
            mo35497E().f65564c.mo35436a("Timed out waiting for get conditional user properties", str);
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.f80120a);
            bundle.putString("origin", conditionalUserPropertyParcel.f80121b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.f80123d);
            bundle.putString("name", conditionalUserPropertyParcel.f80122c.f80139b);
            agjx.m54403a(bundle, conditionalUserPropertyParcel.f80122c.mo44016a());
            bundle.putBoolean("active", conditionalUserPropertyParcel.f80124e);
            String str4 = conditionalUserPropertyParcel.f80125f;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.f80126g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.f80132a);
                EventParams eventParams = conditionalUserPropertyParcel.f80126g.f80133b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.mo44007a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.f80127h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.f80128i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.f80132a);
                EventParams eventParams2 = conditionalUserPropertyParcel.f80128i.f80133b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.mo44007a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.f80122c.f80140c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.f80129j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.f80130k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.f80132a);
                EventParams eventParams3 = conditionalUserPropertyParcel.f80130k.f80133b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.mo44007a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35575b(String str, String str2, long j, Bundle bundle, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        mo35498F().mo35492a(new agke(this, str, str2, j, bundle2, str3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo35247n() {
        return false;
    }

    /* renamed from: a */
    public final Map mo35564a(String str, String str2, String str3, boolean z) {
        if (mo35498F().mo35495c()) {
            mo35497E().f65564c.mo35435a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        mo35537u();
        if (agde.m54034a()) {
            mo35497E().f65564c.mo35435a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f65756y.mo35498F().mo35493a(atomicReference, "get user properties", new agkj(this, atomicReference, str, str2, str3, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            mo35497E().f65564c.mo35436a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C1223np npVar = new C1223np(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            npVar.put(userAttributeParcel.f80139b, userAttributeParcel.mo44016a());
        }
        return npVar;
    }

    /* renamed from: a */
    public final void mo35565a(Bundle bundle, long j) {
        sdo.m34959a(bundle);
        agjx.m54402a(bundle, "app_id", String.class, null);
        agjx.m54402a(bundle, "origin", String.class, null);
        agjx.m54402a(bundle, "name", String.class, null);
        agjx.m54402a(bundle, "value", Object.class, null);
        agjx.m54402a(bundle, "trigger_event_name", String.class, null);
        agjx.m54402a(bundle, "trigger_timeout", Long.class, 0L);
        agjx.m54402a(bundle, "timed_out_event_name", String.class, null);
        agjx.m54402a(bundle, "timed_out_event_params", Bundle.class, null);
        agjx.m54402a(bundle, "triggered_event_name", String.class, null);
        agjx.m54402a(bundle, "triggered_event_params", Bundle.class, null);
        agjx.m54402a(bundle, "time_to_live", Long.class, 0L);
        agjx.m54402a(bundle, "expired_event_name", String.class, null);
        agjx.m54402a(bundle, "expired_event_params", Bundle.class, null);
        sdo.m34977c(bundle.getString("name"));
        sdo.m34977c(bundle.getString("origin"));
        sdo.m34959a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (mo35540x().mo35746c(string) != 0) {
            mo35497E().f65564c.mo35436a("Invalid conditional user property name", mo35541y().mo35426c(string));
        } else if (mo35540x().mo35744b(string, obj) != 0) {
            mo35497E().f65564c.mo35437a("Invalid conditional user property value", mo35541y().mo35426c(string), obj);
        } else {
            Object c = mo35540x().mo35747c(string, obj);
            if (c == null) {
                mo35497E().f65564c.mo35437a("Unable to normalize conditional user property value", mo35541y().mo35426c(string), obj);
                return;
            }
            agjx.m54403a(bundle, c);
            long j2 = bundle.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle.getString("trigger_event_name"))) {
                mo35538v();
                if (j2 > 15552000000L || j2 < 1) {
                    mo35497E().f65564c.mo35437a("Invalid conditional user property timeout", mo35541y().mo35426c(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle.getLong("time_to_live");
            mo35538v();
            if (j3 <= 15552000000L && j3 >= 1) {
                mo35498F().mo35492a(new agkg(this, bundle));
            } else {
                mo35497E().f65564c.mo35437a("Invalid conditional user property time to live", mo35541y().mo35426c(string), Long.valueOf(j3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35566a(String str) {
        this.f65809c.set(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35567a(String str, String str2, long j, Bundle bundle) {
        mo35242i();
        mo35241h();
        mo35568a(str, str2, j, bundle, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, int, boolean):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(java.lang.String, int, boolean):java.lang.String */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, android.os.Bundle, java.util.List, int]
     candidates:
      agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.lang.String, long):com.google.android.gms.measurement.internal.EventParcel
      agms.a(java.lang.String, int, java.lang.String, java.lang.String, int):void
      agms.a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List):void
      agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04e8 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo35568a(String str, String str2, long j, Bundle bundle, String str3) {
        agkt agkt;
        long j2;
        long j3;
        int i;
        boolean z;
        String[] strArr;
        int i2;
        long j4;
        int length;
        String str4;
        int i3;
        String str5;
        Class<?> cls;
        List list;
        String str6 = str;
        String str7 = str2;
        long j5 = j;
        Bundle bundle2 = bundle;
        sdo.m34977c(str);
        sdo.m34959a(bundle);
        mo35241h();
        mo35245l();
        if (!this.f65756y.mo35513q()) {
            mo35497E().f65571j.mo35435a("Event not sent since app measurement is disabled");
        } else if (!mo35538v().mo35314a(aghn.f65468X) || (list = mo35238e().f65535h) == null || list.contains(str7)) {
            if (!this.f65812f) {
                this.f65812f = true;
                try {
                    if (this.f65756y.f65689e) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, mo35542z().getClassLoader());
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, mo35542z());
                    } catch (Exception e) {
                        mo35497E().f65567f.mo35436a("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException e2) {
                    mo35497E().f65570i.mo35435a("Tag Manager is not found and thus will not be used");
                }
            }
            if (mo35538v().mo35314a(aghn.f65476ab) && "_cmp".equals(str7) && bundle2.containsKey("gclid")) {
                mo35573a("auto", "_lgclid", bundle2.getString("gclid"), mo35534A().mo20505a());
            }
            if (mo35537u().f65291a) {
                agkw c = mo35236c();
                synchronized (c) {
                    if (c.f65835f != null && (str5 = c.f65836g) != null) {
                        if (str5.equals(str3)) {
                            agkt = c.f65835f;
                        }
                    }
                    agkt = null;
                }
            } else {
                agkt = mo35236c().mo35597o();
                if (agkt != null && !bundle2.containsKey("_sc")) {
                    agkt.f65824d = true;
                }
            }
            agkw.m54438a(agkt, bundle2, false);
            boolean equals = "am".equals(str6);
            agms.m54596f(str2);
            if (this.f65756y.mo35518v()) {
                int b = mo35540x().mo35743b(str7);
                if (b != 0) {
                    mo35497E().f65566e.mo35436a("Invalid event name. Event will not be logged (FE)", mo35541y().mo35422a(str7));
                    agms x = mo35540x();
                    mo35538v();
                    String a = x.mo35727a(str7, 40, true);
                    if (str7 != null) {
                        i3 = str2.length();
                    } else {
                        i3 = 0;
                    }
                    this.f65756y.mo35502f().mo35732a(str3, b, "_ev", a, i3);
                    return;
                }
                List a2 = sqw.m36034a((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
                Bundle a3 = mo35540x().mo35724a(str3, str2, bundle, a2, true);
                agkt agkt2 = (a3 == null || !a3.containsKey("_sc") || !a3.containsKey("_si")) ? null : new agkt(a3.getString("_sn"), a3.getString("_sc"), Long.valueOf(a3.getLong("_si")).longValue());
                if (agkt2 != null) {
                    agkt = agkt2;
                }
                if (mo35538v().mo35314a(aghn.f65459O) && !mo35537u().f65291a && mo35236c().mo35597o() != null && "_ae".equals(str7)) {
                    long a4 = mo35234a().f65921d.mo35646a();
                    if (a4 > 0) {
                        agms x2 = mo35540x();
                        long j6 = a3.getLong("_et");
                        if (j6 != 0) {
                            x2.mo35497E().f65567f.mo35436a("Params already contained engagement", Long.valueOf(j6));
                        }
                        a3.putLong("_et", a4 + j6);
                    }
                }
                if (cfit.m139801b() && mo35538v().mo35314a(aghn.f65486al)) {
                    if (!"auto".equals(str6) && "_ssr".equals(str7)) {
                        agms x3 = mo35540x();
                        String string = a3.getString("_ffr");
                        if (!stm.m36302d(string)) {
                            str4 = string.trim();
                        } else {
                            str4 = null;
                        }
                        if (agms.m54594b(str4, x3.mo35539w().f65637v.mo35462a())) {
                            x3.mo35497E().f65571j.mo35435a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                        x3.mo35539w().f65637v.mo35463a(str4);
                    } else if ("_ae".equals(str7)) {
                        String a5 = mo35540x().mo35539w().f65637v.mo35462a();
                        if (!TextUtils.isEmpty(a5)) {
                            a3.putString("_ffr", a5);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(a3);
                long nextLong = mo35540x().mo35751e().nextLong();
                if (mo35539w().f65632q.mo35458a() <= 0) {
                    j2 = nextLong;
                    j3 = 0;
                } else if (!mo35539w().mo35466a(j5)) {
                    j2 = nextLong;
                    j3 = 0;
                } else if (mo35539w().f65634s.mo35457a()) {
                    mo35497E().f65572k.mo35435a("Current session is expired, remove the session number, ID, and engagement time");
                    j2 = nextLong;
                    j3 = 0;
                    mo35573a("auto", "_sid", (Object) null, mo35534A().mo20505a());
                    mo35573a("auto", "_sno", (Object) null, mo35534A().mo20505a());
                    mo35573a("auto", "_se", (Object) null, mo35534A().mo20505a());
                } else {
                    j2 = nextLong;
                    j3 = 0;
                }
                if (a3.getLong("extend_session", j3) == 1) {
                    mo35497E().f65572k.mo35435a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f65756y.mo35500d().f65920c.mo35649a(j5, true);
                }
                String[] strArr2 = (String[]) a3.keySet().toArray(new String[a3.size()]);
                Arrays.sort(strArr2);
                if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65496av) || !mo35538v().mo35314a(aghn.f65495au)) {
                    int length2 = strArr2.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        String str8 = strArr2[i4];
                        Bundle[] a6 = mo35540x().mo35742a(a3.get(str8));
                        if (a6 == null) {
                            strArr = strArr2;
                            i2 = length2;
                            j4 = j2;
                        } else {
                            a3.putInt(str8, a6.length);
                            int i6 = 0;
                            while (true) {
                                length = a6.length;
                                if (i6 >= length) {
                                    break;
                                }
                                Bundle bundle3 = a6[i6];
                                agkw.m54438a(agkt, bundle3, true);
                                Bundle a7 = mo35540x().mo35724a(str3, "_ep", bundle3, a2, false);
                                a7.putString("_en", str7);
                                a7.putLong("_eid", j2);
                                a7.putString("_gn", str8);
                                a7.putInt("_ll", length);
                                a7.putInt("_i", i6);
                                arrayList.add(a7);
                                i6++;
                                strArr2 = strArr2;
                                length2 = length2;
                            }
                            strArr = strArr2;
                            i2 = length2;
                            j4 = j2;
                            i5 += length;
                        }
                        i4++;
                        strArr2 = strArr;
                        j2 = j4;
                        length2 = i2;
                    }
                    long j7 = j2;
                    if (i5 != 0) {
                        a3.putLong("_eid", j7);
                        a3.putInt("_epc", i5);
                        i = 0;
                    } else {
                        i = 0;
                    }
                } else {
                    for (String str9 : strArr2) {
                        Bundle[] a8 = mo35540x().mo35742a(a3.get(str9));
                        if (a8 != null) {
                            a3.putParcelableArray(str9, a8);
                        }
                    }
                    i = 0;
                }
                while (i < arrayList.size()) {
                    Bundle bundle4 = (Bundle) arrayList.get(i);
                    String str10 = i != 0 ? "_ep" : str7;
                    bundle4.putString("_o", str6);
                    Bundle a9 = mo35540x().mo35723a(bundle4);
                    EventParcel eventParcel = new EventParcel(str10, new EventParams(a9), str, j);
                    agln d = mo35237d();
                    sdo.m34959a(eventParcel);
                    d.mo35241h();
                    d.mo35245l();
                    boolean p = d.mo35623p();
                    if (p) {
                        aght b2 = d.mo35235b();
                        Parcel obtain = Parcel.obtain();
                        agdu.m54111a(eventParcel, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            b2.mo35497E().f65565d.mo35435a("Event is too long for local database. Sending event directly to service");
                            z = false;
                        } else if (b2.mo35415a(0, marshall)) {
                            z = true;
                        }
                        d.mo35621a(new agld(d, p, z, eventParcel, d.mo35615a(true), str3));
                        if (equals) {
                            for (agkb agkb : this.f65811e) {
                                new Bundle(a9);
                                agkb.mo35547a();
                            }
                        }
                        i++;
                    }
                    z = false;
                    d.mo35621a(new agld(d, p, z, eventParcel, d.mo35615a(true), str3));
                    if (equals) {
                    }
                    i++;
                }
                if (!mo35537u().f65291a && mo35236c().mo35597o() != null && "_ae".equals(str7)) {
                    mo35234a().mo35651a(true, true, mo35534A().mo20506b());
                }
            }
        } else {
            mo35497E().f65571j.mo35437a("Dropping non-safelisted event. event name, origin", str7, str6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35569a(String str, String str2, long j, Object obj) {
        mo35498F().mo35492a(new agkf(this, str, str2, obj, j));
    }

    /* renamed from: a */
    public final void mo35570a(String str, String str2, Bundle bundle) {
        Bundle bundle2;
        long a = mo35534A().mo20505a();
        mo35242i();
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        mo35575b(str3, str2, a, bundle2, null);
    }

    /* renamed from: a */
    public final void mo35571a(String str, String str2, Bundle bundle, String str3) {
        mo35243j();
        mo35575b(str, str2, mo35534A().mo20505a(), bundle, str3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, int, boolean):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(java.lang.String, int, boolean):java.lang.String */
    /* renamed from: a */
    public final void mo35572a(String str, String str2, Object obj) {
        long a = mo35534A().mo20505a();
        int c = mo35540x().mo35746c(str2);
        if (c != 0) {
            agms x = mo35540x();
            mo35538v();
            this.f65756y.mo35502f().mo35729a(c, "_ev", x.mo35727a(str2, 24, true), str2.length());
        } else if (obj != null) {
            int b = mo35540x().mo35744b(str2, obj);
            if (b != 0) {
                agms x2 = mo35540x();
                mo35538v();
                this.f65756y.mo35502f().mo35729a(b, "_ev", x2.mo35727a(str2, 24, true), ((String) obj).length());
                return;
            }
            Object c2 = mo35540x().mo35747c(str2, obj);
            if (c2 != null) {
                mo35569a(str, str2, a, c2);
            }
        } else {
            mo35569a(str, str2, a, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* renamed from: a */
    public final void mo35573a(String str, String str2, Object obj, long j) {
        Long l;
        String str3;
        long j2;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35242i();
        mo35245l();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = "false";
                    if (!str5.equals(str4.toLowerCase(Locale.ENGLISH))) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    Long valueOf = Long.valueOf(j2);
                    agip agip = mo35539w().f65629n;
                    if (valueOf.longValue() == 1) {
                        str5 = "true";
                    }
                    agip.mo35463a(str5);
                    l = valueOf;
                    str3 = "_npa";
                    if (!this.f65756y.mo35513q()) {
                        mo35497E().f65572k.mo35435a("User property not set since app measurement is disabled");
                        return;
                    } else if (this.f65756y.mo35518v()) {
                        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(str3, j, l, str);
                        agln d = mo35237d();
                        d.mo35241h();
                        d.mo35245l();
                        boolean z = false;
                        if (d.mo35623p()) {
                            aght b = d.mo35235b();
                            Parcel obtain = Parcel.obtain();
                            agmq.m54587a(userAttributeParcel, obtain);
                            byte[] marshall = obtain.marshall();
                            obtain.recycle();
                            if (marshall.length > 131072) {
                                b.mo35497E().f65565d.mo35435a("User property too long for local database. Sending directly to service");
                            } else if (b.mo35415a(1, marshall)) {
                                z = true;
                            }
                        }
                        d.mo35621a(new agkx(d, z, userAttributeParcel, d.mo35615a(true)));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (obj == null) {
                mo35539w().f65629n.mo35463a("unset");
                l = obj;
                str3 = "_npa";
                if (!this.f65756y.mo35513q()) {
                }
            }
        }
        str3 = str2;
        l = obj;
        if (!this.f65756y.mo35513q()) {
        }
    }

    /* renamed from: a */
    public final void mo35574a(String str, String str2, String str3, Bundle bundle) {
        long a = mo35534A().mo20505a();
        sdo.m34977c(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo35498F().mo35492a(new agkh(this, bundle2));
    }
}
