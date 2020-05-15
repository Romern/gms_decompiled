package p000;

import android.content.Context;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.ProximityAuthChimeraService;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: jml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jml extends jso implements jkg, aaai {

    /* renamed from: a */
    private final Context f22822a;

    /* renamed from: b */
    private final jnj f22823b = jnj.m16961a();

    /* renamed from: c */
    private final jkh f22824c = jkh.m16839a();

    public jml(Context context) {
        this.f22822a = context;
    }

    /* renamed from: a */
    public final List mo13878a(Role role) {
        ArrayList arrayList;
        byte[] bArr;
        jnj jnj = this.f22823b;
        synchronized (jnj.f22879c) {
            arrayList = new ArrayList(jnj.f22878b.size());
            for (String str : jnj.f22878b.keySet()) {
                jni jni = (jni) jnj.f22878b.get(str);
                if (jni.f22873b.containsKey(role.f11146b)) {
                    int a = role.mo7789a();
                    if (a == 0) {
                        a = 1;
                    }
                    jnt jnt = (jnt) jni.f22874c.get(a);
                    int i = 0;
                    if (jnt != null) {
                        i = jnt.mo13825e();
                    } else if (jni.f22875d.get(a, false)) {
                        i = 4;
                    }
                    if (jnt != null) {
                        bArr = jnt.mo13826f();
                    } else {
                        bArr = null;
                    }
                    jki jki = new jki();
                    jki.f22706a = jni.f22872a;
                    jki.f22708c = i;
                    jki.f22709d = bArr;
                    jki.f22707b.add(role);
                    RemoteDevice remoteDevice = jki.f22706a;
                    Set set = jki.f22707b;
                    arrayList.add(new ConnectionInfo(1, remoteDevice, (Role[]) set.toArray(new Role[((C1225nr) set).f26758b]), jki.f22708c, jki.f22709d));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo13879a() {
        this.f22824c.mo13830a(this);
    }

    /* renamed from: a */
    public final void mo13880a(RemoteDevice remoteDevice, Role role) {
        ProximityAuthChimeraService.f11135a.mo25412b("Registering %s for role %s", remoteDevice.toString(), role.toString());
        if (cchi.m129675g()) {
            jnp.m16984b().mo13915b(remoteDevice.f11138b, role);
        }
        this.f22823b.mo13904a(remoteDevice, role);
        jkf.m16838a(this.f22822a, this.f22823b);
    }

    /* renamed from: a */
    public final void mo13881a(WireMessageParams wireMessageParams) {
        RemoteDevice b = this.f22823b.mo13906b(wireMessageParams.f11150b);
        if (b == null) {
            ProximityAuthChimeraService.f11135a.mo25416d("Unable to send message (deviceId=%s): not registered", wireMessageParams.f11150b);
            return;
        }
        jnt a = this.f22823b.mo13903a(wireMessageParams.f11150b, 1);
        if (a == null) {
            a = this.f22823b.mo13903a(wireMessageParams.f11150b, 2);
        }
        if (a == null) {
            ProximityAuthChimeraService.f11135a.mo25416d("Unable to send message to %s (deviceId=%s): not connected", b.f11139c, wireMessageParams.f11150b);
            return;
        }
        a.mo13819a(wireMessageParams.f11151c, wireMessageParams.f11152d);
    }

    /* renamed from: a */
    public final void mo13882a(String str, Role role) {
        ProximityAuthChimeraService.f11135a.mo25412b("Unregistering device with ID %s for feature %s", jkr.m16853a(str), role.toString());
        this.f22823b.mo13905a(str, role);
        jkf.m16838a(this.f22822a, this.f22823b);
    }

    /* renamed from: a */
    public final void mo13883a(jsm jsm) {
        this.f22824c.mo13831a(this, jsm);
    }
}
