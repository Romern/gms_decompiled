package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aupq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupq {

    /* renamed from: j */
    private static aupq f92274j;

    /* renamed from: a */
    public boolean f92275a = true;

    /* renamed from: b */
    public boolean f92276b = true;

    /* renamed from: c */
    public boolean f92277c = true;

    /* renamed from: d */
    public boolean f92278d = true;

    /* renamed from: e */
    public boolean f92279e = true;

    /* renamed from: f */
    public boolean f92280f = true;

    /* renamed from: g */
    public boolean f92281g = true;

    /* renamed from: h */
    public Set f92282h;

    /* renamed from: i */
    public int f92283i;

    /* renamed from: k */
    private final auph f92284k;

    /* renamed from: l */
    private final Context f92285l;

    private aupq(Context context) {
        auph a = auph.m77555a(context);
        this.f92284k = a;
        this.f92285l = context;
    }

    /* renamed from: a */
    public static synchronized aupq m77579a() {
        aupq aupq;
        synchronized (aupq.class) {
            if (f92274j == null) {
                aupq aupq2 = new aupq(rpr.m34216b());
                f92274j = aupq2;
                aupq2.mo50792b();
            }
            aupq = f92274j;
        }
        return aupq;
    }

    /* renamed from: b */
    public final boolean mo50792b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f92276b = true;
        this.f92275a = true;
        this.f92277c = true;
        this.f92278d = true;
        this.f92279e = true;
        this.f92280f = true;
        this.f92281g = true;
        this.f92282h = new HashSet();
        this.f92283i = 240;
        List<PersistableBundle> list = null;
        boolean z7 = (this.f92284k.f92269a.getKeyguardDisabledFeatures(null) & 16) == 16;
        if (z7) {
            try {
                list = (List) DevicePolicyManager.class.getMethod("getTrustAgentConfiguration", ComponentName.class, ComponentName.class).invoke(this.f92284k.f92269a, null, new ComponentName(this.f92285l, "com.google.android.gms.auth.trustagent.GoogleTrustAgent"));
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            }
            if (list != null && !list.isEmpty()) {
                for (PersistableBundle persistableBundle : list) {
                    if (!this.f92276b || !m77580a("google.trustagent.faceunlock", persistableBundle)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f92276b = z;
                    if (!this.f92275a || !m77580a("google.trustagent.bluetoothunlock", persistableBundle)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.f92275a = z2;
                    if (!this.f92277c || !m77580a("google.trustagent.onbodyunlock", persistableBundle)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    this.f92277c = z3;
                    if (!this.f92278d || !m77580a("google.trustagent.placesunlock", persistableBundle)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    this.f92278d = z4;
                    this.f92279e = (!this.f92279e || !m77580a("google.trustagent.placesunlock", persistableBundle)) ? false : !persistableBundle.containsKey("google.trustagent.placesunlock") || ((PersistableBundle) persistableBundle.get("google.trustagent.placesunlock")).getBoolean("custom_places_enabled", true);
                    if (!this.f92280f || !m77580a("google.trustagent.voiceunlock", persistableBundle)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    this.f92280f = z5;
                    if (!this.f92281g || !m77580a("google.trustagent.carunlock", persistableBundle)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    this.f92281g = z6;
                    if (persistableBundle.containsKey("google.trustagent.idletimeout")) {
                        int i = persistableBundle.getInt("google.trustagent.idletimeout", Integer.MAX_VALUE);
                        int i2 = this.f92283i;
                        if (i >= i2) {
                            i = i2;
                        }
                        this.f92283i = i;
                    }
                }
                Set set = this.f92282h;
                if (this.f92275a) {
                    for (PersistableBundle persistableBundle2 : list) {
                        int[] intArray = ((PersistableBundle) persistableBundle2.get("google.trustagent.bluetoothunlock")).getIntArray("disabled_major_classes");
                        if (intArray != null) {
                            for (int i3 : intArray) {
                                set.add(Integer.valueOf(i3));
                            }
                        }
                    }
                }
            } else {
                this.f92276b = false;
                this.f92275a = false;
                this.f92277c = false;
                this.f92278d = false;
                this.f92279e = false;
                this.f92280f = false;
                this.f92281g = false;
                return true;
            }
        }
        return z7;
    }

    /* renamed from: a */
    private static final boolean m77580a(String str, PersistableBundle persistableBundle) {
        return persistableBundle.containsKey(str) && ((PersistableBundle) persistableBundle.get(str)).getBoolean("enabled", false);
    }
}
