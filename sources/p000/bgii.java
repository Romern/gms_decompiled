package p000;

import android.os.Build;
import android.os.RemoteException;
import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionProvider;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

@Deprecated
/* renamed from: bgii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgii implements bgmw {

    /* renamed from: b */
    public static final Map f116507b;

    /* renamed from: c */
    public static final Map f116508c;

    /* renamed from: d */
    private static bgis f116509d = null;

    /* renamed from: e */
    private static final List f116510e = Arrays.asList("angler", "bullhead", "marlin", "sailfish", "swordfish");

    /* renamed from: a */
    public final bgns f116511a;

    /* renamed from: f */
    private ActivityRecognitionProvider f116512f = null;

    /* renamed from: g */
    private final bgih f116513g = new bgih(this);

    /* renamed from: h */
    private boolean f116514h = false;

    /* renamed from: i */
    private Boolean f116515i;

    /* renamed from: j */
    private final bfor f116516j;

    /* renamed from: k */
    private final Map f116517k = new TreeMap(ActivityTransitionRequest.f79310a);

    static {
        HashMap hashMap = new HashMap();
        f116507b = hashMap;
        hashMap.put("android.activity_recognition.in_vehicle", 0);
        f116507b.put("android.activity_recognition.on_bicycle", 1);
        f116507b.put("android.activity_recognition.still", 3);
        f116507b.put("android.activity_recognition.tilting", 5);
        f116507b.put("android.activity_recognition.walking", 7);
        f116507b.put("android.activity_recognition.running", 8);
        HashMap hashMap2 = new HashMap();
        f116508c = hashMap2;
        hashMap2.put(1, 0);
        f116508c.put(2, 1);
    }

    public bgii(bgns bgns, bfor bfor) {
        this.f116511a = bgns;
        this.f116516j = bfor;
    }

    /* renamed from: a */
    public static synchronized bgis m98997a() {
        bgis bgis;
        synchronized (bgii.class) {
            if (f116509d == null) {
                bgis a = bgkx.f116729g.mo62949a();
                f116509d = a;
                String valueOf = String.valueOf(a.getClass().getName());
                if (valueOf.length() == 0) {
                    new String("create ");
                } else {
                    "create ".concat(valueOf);
                }
            }
            bgis = f116509d;
        }
        return bgis;
    }

    /* renamed from: b */
    private static final Integer m98999b(int i) {
        for (Map.Entry entry : f116508c.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo62856a(Boolean bool, Boolean bool2) {
    }

    /* renamed from: c */
    public final void mo62859c() {
        if (cety.m138244e()) {
            this.f116514h = false;
        } else if (cety.m138241b()) {
            boolean b = cety.m138241b();
            StringBuilder sb = new StringBuilder(76);
            sb.append("Ignore CHRE Disable as it is not enabled. chreArDisallowDisable flag = ");
            sb.append(b);
            sb.toString();
        } else {
            this.f116516j.mo62048a(bfos.HARDWARE_AR_DISABLED);
            ActivityRecognitionProvider activityRecognitionProvider = this.f116512f;
            if (activityRecognitionProvider != null) {
                if (this.f116514h) {
                    activityRecognitionProvider.unregisterSink(this.f116513g);
                    this.f116514h = false;
                }
                this.f116517k.clear();
                for (String str : f116507b.keySet()) {
                    for (Integer num : f116508c.keySet()) {
                        int intValue = num.intValue();
                        try {
                            boolean disableActivityEvent = this.f116512f.disableActivityEvent(str, intValue);
                            Locale locale = Locale.US;
                            Object[] objArr = {Boolean.valueOf(disableActivityEvent), str, Integer.valueOf(intValue)};
                        } catch (RemoteException e) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo62860d() {
        if (!cety.m138244e()) {
            return this.f116514h;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo62861e() {
        return true;
    }

    /* renamed from: f */
    public final int mo62862f() {
        return -1;
    }

    /* renamed from: g */
    public final void mo62863g() {
        if (cety.m138244e()) {
            return;
        }
        if (cese.f183399a.mo6606a().emulateHardwareActivityRecognitionFlush()) {
            this.f116513g.onActivityChanged(new ActivityChangedEvent(Collections.emptyList()));
            return;
        }
        try {
            this.f116512f.flush();
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    private static final String m98998a(int i) {
        for (Map.Entry entry : f116507b.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m99000b(bgmr bgmr) {
        TreeMap treeMap = new TreeMap(ActivityTransitionRequest.f79310a);
        int[] iArr = bgmw.f116831n;
        for (int i = 0; i < iArr.length; i++) {
            if (f116507b.containsValue(Integer.valueOf(iArr[i]))) {
                for (int i2 = 0; i2 <= 1; i2++) {
                    aegc aegc = new aegc();
                    aegc.f63352a = iArr[i];
                    aegc.mo34122a(i2);
                    ActivityTransition a = aegc.mo34121a();
                    Map map = bgmr.f116820a;
                    if (map == null || !map.containsKey(a)) {
                        treeMap.put(a, Integer.MAX_VALUE);
                    } else {
                        treeMap.put(a, (Integer) bgmr.f116820a.get(a));
                    }
                }
            }
        }
        String valueOf = String.valueOf(treeMap);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("setReportLatencyMs ");
        sb.append(valueOf);
        sb.toString();
        if (!this.f116514h) {
            return false;
        }
        if (!this.f116517k.equals(treeMap)) {
            this.f116517k.keySet().removeAll(treeMap.keySet());
            if (!this.f116517k.isEmpty()) {
                for (ActivityTransition activityTransition : this.f116517k.keySet()) {
                    String a2 = m98998a(activityTransition.f79305a);
                    Integer b = m98999b(activityTransition.f79306b);
                    if (a2 == null || b == null) {
                        String valueOf2 = String.valueOf(activityTransition);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 56);
                        sb2.append("Ignoring transition ");
                        sb2.append(valueOf2);
                        sb2.append(" because the H/W doesn't support it.");
                        sb2.toString();
                    } else {
                        try {
                            this.f116512f.disableActivityEvent(a2, b.intValue());
                        } catch (RemoteException e) {
                            mo62859c();
                            return false;
                        }
                    }
                }
            }
            this.f116517k.clear();
            this.f116517k.putAll(treeMap);
            for (Map.Entry entry : this.f116517k.entrySet()) {
                try {
                    ActivityTransition activityTransition2 = (ActivityTransition) entry.getKey();
                    String a3 = m98998a(activityTransition2.f79305a);
                    Integer b2 = m98999b(activityTransition2.f79306b);
                    if (a3 != null) {
                        if (b2 != null) {
                            long intValue = ((long) ((Integer) entry.getValue()).intValue()) * 1000000;
                            boolean enableActivityEvent = this.f116512f.enableActivityEvent(a3, b2.intValue(), intValue);
                            Locale locale = Locale.US;
                            Object[] objArr = {Boolean.valueOf(enableActivityEvent), a3, b2, Long.valueOf(intValue)};
                            if (!enableActivityEvent) {
                                mo62859c();
                                return false;
                            }
                        }
                    }
                    String valueOf3 = String.valueOf(entry.getKey());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 56);
                    sb3.append("Ignoring transition ");
                    sb3.append(valueOf3);
                    sb3.append(" because the H/W doesn't support it.");
                    sb3.toString();
                } catch (RemoteException e2) {
                    mo62859c();
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo62855a(bgmq bgmq) {
        if (!cety.m138244e()) {
            bgih bgih = this.f116513g;
            if (!bgih.f116504a.contains(bgmq)) {
                bgih.f116504a.add(bgmq);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62857a(bgmr bgmr) {
        ActivityRecognitionProvider activityRecognitionProvider;
        if (cety.m138244e() || (activityRecognitionProvider = this.f116512f) == null) {
            this.f116514h = false;
            return false;
        } else if (!this.f116514h) {
            activityRecognitionProvider.registerSink(this.f116513g);
            this.f116517k.clear();
            if (m99000b(bgmr)) {
                this.f116516j.mo62048a(bfos.HARDWARE_AR_ENABLED);
                this.f116514h = true;
                return true;
            }
            this.f116514h = false;
            return false;
        } else {
            boolean b = m99000b(bgmr);
            this.f116514h = b;
            return b;
        }
    }

    /* renamed from: b */
    public final boolean mo62858b() {
        if (cety.m138244e()) {
            return false;
        }
        Boolean bool = this.f116515i;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!cers.f183391a.mo6606a().hardwareActivityRecognitionEnabledV5() || !f116510e.contains(Build.DEVICE)) {
            return false;
        }
        if (this.f116512f == null) {
            ActivityRecognitionProvider b = m98997a().mo62871b();
            this.f116512f = b;
            if (b == null) {
                return false;
            }
        }
        try {
            for (String str : f116507b.keySet()) {
                if (!this.f116512f.isActivitySupported(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
                    sb.append("Hardware AR dosen't support ");
                    sb.append(str);
                    sb.append(".");
                    sb.toString();
                    this.f116515i = false;
                    return false;
                }
            }
            this.f116515i = true;
            return true;
        } catch (RemoteException e) {
            return false;
        }
    }
}
