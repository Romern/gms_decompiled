package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: jnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnj {

    /* renamed from: a */
    public static final Logger f22876a = jsy.m17256a("RemoteDeviceRegistry");

    /* renamed from: f */
    private static jnj f22877f;

    /* renamed from: b */
    public final Map f22878b = new LinkedHashMap();

    /* renamed from: c */
    public final Object f22879c = new Object();

    /* renamed from: d */
    public final Set f22880d = new HashSet();

    /* renamed from: e */
    public String f22881e;

    /* renamed from: g */
    private final jta f22882g = jsz.m17257a();

    public jnj() {
        bqga.m112781a(snp.m35704b(10).mo25819b(jnf.f22870a), new jng(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static synchronized jnj m16961a() {
        jnj jnj;
        synchronized (jnj.class) {
            if (f22877f == null) {
                f22877f = new jnj();
            }
            jnj = f22877f;
        }
        return jnj;
    }

    /* renamed from: b */
    public final RemoteDevice mo13906b(String str) {
        synchronized (this.f22879c) {
            jni jni = (jni) this.f22878b.get(str);
            if (jni == null) {
                return null;
            }
            RemoteDevice remoteDevice = jni.f22872a;
            return remoteDevice;
        }
    }

    /* renamed from: c */
    public final int mo13909c() {
        int i;
        synchronized (this.f22879c) {
            i = 0;
            for (jni jni : this.f22878b.values()) {
                for (Integer num : jni.f22873b.values()) {
                    i |= num.intValue();
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final Set mo13902a(String str) {
        synchronized (this.f22879c) {
            jni jni = (jni) this.f22878b.get(str);
            if (jni != null) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : jni.f22873b.entrySet()) {
                    hashSet.add(new Role((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
                }
                return hashSet;
            }
            HashSet hashSet2 = new HashSet();
            return hashSet2;
        }
    }

    /* renamed from: b */
    public final List mo13907b() {
        ArrayList arrayList;
        synchronized (this.f22879c) {
            arrayList = new ArrayList(this.f22878b.size());
            for (String str : this.f22878b.keySet()) {
                arrayList.add(((jni) this.f22878b.get(str)).f22872a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final jnt mo13903a(String str, int i) {
        synchronized (this.f22879c) {
            jni jni = (jni) this.f22878b.get(str);
            if (jni == null) {
                return null;
            }
            jnt jnt = (jnt) jni.f22874c.get(i, null);
            return jnt;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return r1;
     */
    /* renamed from: b */
    public final boolean mo13908b(String str, int i) {
        synchronized (this.f22879c) {
            jni jni = (jni) this.f22878b.get(str);
            boolean z = false;
            if (jni == null) {
                return false;
            }
            jnt jnt = (jnt) jni.f22874c.get(i);
            if (jnt != null && jnt.mo13825e() == 3) {
                z = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo13904a(RemoteDevice remoteDevice, Role role) {
        int intValue;
        sdo.m34970a(Role.m6770a(role.f11147c));
        synchronized (this.f22879c) {
            String str = remoteDevice.f11138b;
            if (!this.f22878b.containsKey(str)) {
                this.f22878b.put(str, new jni(remoteDevice));
            }
            jni jni = (jni) this.f22878b.get(str);
            jni.f22872a = remoteDevice;
            Integer num = (Integer) jni.f22873b.get(role.f11146b);
            if (num == null) {
                num = 0;
            }
            intValue = role.f11147c ^ (num.intValue() & role.f11147c);
            jni.f22873b.put(role.f11146b, Integer.valueOf(num.intValue() | role.f11147c));
            f22876a.mo25412b("Registered device ID %s, entry=%s", remoteDevice.mo7784a(), jni);
        }
        if (intValue > 0) {
            new Role(role.f11146b, intValue);
            for (jnh jnh : this.f22880d) {
                jnh.mo13899a();
            }
            jta jta = this.f22882g;
            if (ccia.m129785c()) {
                if (Role.m6775e(intValue)) {
                    jta.f23166a.mo24383c("register_ble_central_background_device_count").mo24359a();
                }
                if (Role.m6774d(intValue)) {
                    jta.f23166a.mo24383c("register_ble_peripheral_background_device_count").mo24359a();
                }
                if (Role.m6773c(intValue)) {
                    jta.f23166a.mo24383c("register_ble_peripheral_foreground_device_count").mo24359a();
                }
                if (Role.m6776f(intValue)) {
                    jta.f23166a.mo24383c("register_gcm_initiator_device_count").mo24359a();
                }
                if (Role.m6777g(intValue)) {
                    jta.f23166a.mo24383c("register_gcm_responder_device_count").mo24359a();
                }
                jta.f23166a.mo24388e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        if (r7 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r13 = new com.google.android.gms.auth.proximity.Role(r0, r7);
        r0 = r11.f22880d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        if (r0.hasNext() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        ((p000.jnh) r0.next()).mo13900a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo13905a(String str, Role role) {
        sdo.m34970a(Role.m6770a(role.f11147c));
        String str2 = role.f11146b;
        synchronized (this.f22879c) {
            jni jni = (jni) this.f22878b.get(str);
            if (jni == null) {
                f22876a.mo25418e("Can't find entry for device ID %s", jkr.m16853a(str));
                return;
            }
            Integer num = (Integer) jni.f22873b.get(str2);
            if (num == null) {
                f22876a.mo25418e("No connection modes found for feature %s on device with ID %s", str2, jkr.m16853a(str));
                return;
            }
            int intValue = num.intValue() & role.f11147c;
            Integer valueOf = Integer.valueOf(num.intValue() - intValue);
            if (valueOf.intValue() == 0) {
                jni.f22873b.remove(str2);
                if (jni.f22873b.isEmpty()) {
                    this.f22878b.remove(str);
                }
            } else {
                jni.f22873b.put(str2, valueOf);
            }
            int i = 0;
            for (String str3 : jni.f22873b.keySet()) {
                i |= ((Integer) jni.f22873b.get(str3)).intValue();
            }
            for (int i2 = 0; i2 < jni.f22874c.size(); i2++) {
                int keyAt = jni.f22874c.keyAt(i2);
                if (!Role.m6771a(i, keyAt)) {
                    jnt jnt = (jnt) jni.f22874c.get(keyAt);
                    if (jnt.mo13825e() != 0) {
                        jnt.mo13827g();
                    }
                }
            }
            f22876a.mo25412b("Unregistered device with ID %s for role %s", jkr.m16853a(str), role);
        }
    }
}
