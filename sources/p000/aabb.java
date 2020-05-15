package p000;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: aabb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabb {
    /* renamed from: a */
    static String m21043a(Intent intent) {
        ComponentName component;
        if (intent == null) {
            return null;
        }
        String str = intent.getPackage();
        if (str == null && (component = intent.getComponent()) != null) {
            str = component.getPackageName();
        }
        boolean equals = "com.google.android.gms".equals(str);
        if (str == null) {
            return "Implicit";
        }
        return !equals ? "External" : "Internal";
    }

    /* renamed from: a */
    static String m21044a(String str, Intent intent, String str2) {
        String valueOf = String.valueOf(str);
        String str3 = str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
        if (!cdoz.f181455a.mo6606a().mo78095H()) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        int a = aabq.m21067a(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 12);
        sb.append(valueOf2);
        sb.append(":");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    public static zzp m21045a(String str, zzp zzp) {
        bxvd bxvd;
        if (str == null) {
            str = "unknown";
        }
        if (zzp != null) {
            bxvd = (bxvd) zzp.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) zzp);
        } else {
            bxvd = zzp.f56314g.mo74144da();
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        zzp zzp2 = (zzp) bxvd.f164949b;
        zzp2.f56321f = 1;
        zzp2.f56316a |= 16;
        String str2 = str.length() == 0 ? new String("calling_module:") : "calling_module:".concat(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        zzp zzp3 = (zzp) bxvd.f164949b;
        str2.getClass();
        zzp3.f56316a |= 1;
        zzp3.f56317b = str2;
        return (zzp) bxvd.mo74062i();
    }
}
