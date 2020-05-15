package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: jnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnp extends jsl implements jkg, jnh {

    /* renamed from: a */
    private static final Logger f22894a = jsy.m17256a("RoleDependencyManager");

    /* renamed from: b */
    private static jnp f22895b;

    /* renamed from: c */
    private final jnj f22896c;

    /* renamed from: d */
    private final Map f22897d = new HashMap();

    public jnp(jnj jnj, jkh jkh) {
        this.f22896c = jnj;
        jnj.f22880d.add(this);
        jkh.mo13831a(this, this);
    }

    /* renamed from: a */
    private final synchronized void m16982a(String str) {
        boolean z;
        jno jno = (jno) this.f22897d.get(str);
        if (jno != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        for (Map.Entry entry : jno.f22891a.entrySet()) {
            this.f22896c.mo13905a(str, new Role(((Role) entry.getKey()).f11146b, ((Integer) entry.getValue()).intValue()));
        }
        jno.f22891a.clear();
        jkf.m16838a(rpr.m34216b(), this.f22896c);
    }

    /* renamed from: b */
    public static synchronized jnp m16984b() {
        jnp jnp;
        synchronized (jnp.class) {
            if (f22895b == null) {
                f22895b = new jnp(jnj.m16961a(), jkh.m16839a());
            }
            jnp = f22895b;
        }
        return jnp;
    }

    /* renamed from: a */
    public final void mo13899a() {
    }

    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
    }

    /* renamed from: b */
    public final synchronized void mo13915b(String str, Role role) {
        int i;
        jno jno = (jno) this.f22897d.get(str);
        if (jno != null) {
            for (Map.Entry entry : jno.f22891a.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (((Role) entry.getKey()).f11146b.equals(role.f11146b) && (i = role.f11147c & intValue) > 0) {
                    entry.setValue(Integer.valueOf(i ^ intValue));
                }
            }
            f22894a.mo25412b("Unregistered device ID %s for child Role = %s of all parents.", jkr.m16853a(str), role);
        }
    }

    /* renamed from: a */
    private final boolean m16983a(RemoteDevice remoteDevice, Role role) {
        Iterator it = this.f22896c.mo13902a(remoteDevice.f11138b).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Role role2 = (Role) it.next();
            if (role2.f11146b.equals(role.f11146b)) {
                if ((role.f11147c & role2.f11147c) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo13914a(RemoteDevice remoteDevice, Role role, Role role2) {
        boolean z;
        sdo.m34970a(Role.m6770a(role.f11147c));
        int i = role2.f11147c;
        int i2 = role.f11147c;
        sdo.m34974b(Role.m6770a(i));
        if (((i - 1) & i) != 0) {
            z = false;
        } else {
            z = i != 0;
        }
        sdo.m34974b(z);
        sdo.m34974b(role2.f11146b.equals(role.f11146b));
        sdo.m34974b((i & i2) == 0);
        sdo.m34970a(m16983a(remoteDevice, role2));
        String str = remoteDevice.f11138b;
        if (!this.f22897d.containsKey(str)) {
            this.f22897d.put(str, new jno());
        }
        jno jno = (jno) this.f22897d.get(str);
        if (m16983a(remoteDevice, role)) {
            for (Map.Entry entry : jno.f22891a.entrySet()) {
                if (!((Role) entry.getKey()).f11146b.equals(role.f11146b) || (((Integer) entry.getValue()).intValue() & i2) <= 0) {
                }
            }
            f22894a.mo25412b("Attempted to register a Role [%s] already registered as a top-level Role as a child Role.", new Object[0]);
            return;
        }
        Integer num = (Integer) jno.f22891a.get(role2);
        if (num != null) {
            i2 |= num.intValue();
        }
        jno.f22891a.put(role2, Integer.valueOf(i2));
        this.f22896c.mo13904a(remoteDevice, role);
        f22894a.mo25412b("Registered device ID %s for child Role = %s, and parent Role = %s.", remoteDevice.mo7784a(), role, role2);
        jkf.m16838a(rpr.m34216b(), this.f22896c);
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        jno jno;
        if (i == 1 && (jno = (jno) this.f22897d.get(str)) != null) {
            if (i3 == 3) {
                jno.f22893c = true;
            } else if (i3 == 0) {
                jno.f22892b--;
                Logger Logger = f22894a;
                int i4 = jno.f22892b;
                StringBuilder sb = new StringBuilder(42);
                sb.append("Connection attempts remaining: ");
                sb.append(i4);
                Logger.mo25412b(sb.toString(), new Object[0]);
                if (jno.f22893c || jno.f22892b == 0) {
                    f22894a.mo25412b("Unregistering all child Roles because the connection has finished or run out of retry attempts.", new Object[0]);
                    m16982a(str);
                    this.f22897d.remove(str);
                    jsz.m17257a().mo14043a("role_reversal_result", jno.f22893c ^ true ? 1 : 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo13900a(String str, Role role) {
        jno jno = (jno) this.f22897d.get(str);
        if (jno != null) {
            String str2 = role.f11146b;
            Iterator it = jno.f22891a.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Role role2 = (Role) entry.getKey();
                if (str2.equals(role2.f11146b) && (role2.f11147c & role.f11147c) > 0) {
                    i |= ((Integer) entry.getValue()).intValue();
                    it.remove();
                }
            }
            for (Map.Entry entry2 : jno.f22891a.entrySet()) {
                if (str2.equals(((Role) entry2.getKey()).f11146b)) {
                    i ^= ((Integer) entry2.getValue()).intValue() & i;
                }
            }
            Role role3 = new Role(str2, i);
            if (role3.f11147c > 0) {
                this.f22896c.mo13905a(str, role3);
                f22894a.mo25412b("Unregistered device ID %s for child Role = %s, because parent Role = %s was unregistered.", jkr.m16853a(str), role3, role);
            }
        }
    }
}
