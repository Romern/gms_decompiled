package com.google.android.gms.ads.internal.state;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.C0649g;
import com.google.android.gms.ads.internal.util.C0652j;
import java.util.HashSet;

/* renamed from: com.google.android.gms.ads.internal.state.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0600g {

    /* renamed from: a */
    final C0598e f8907a = new C0598e();

    /* renamed from: b */
    private final C0649g f8908b;

    public C0600g(C0649g gVar) {
        new HashSet();
        new HashSet();
        this.f8908b = gVar;
        new C0599f();
    }

    /* renamed from: a */
    public final void mo6787a(boolean z) {
        long j;
        C0598e eVar;
        int i;
        long a = C0387d.m5368f().mo20505a();
        if (!z) {
            C0649g gVar = this.f8908b;
            C0652j jVar = (C0652j) gVar;
            jVar.mo6839a();
            synchronized (jVar.f8984a) {
                if (((C0652j) gVar).f8996m != a) {
                    ((C0652j) gVar).f8996m = a;
                    SharedPreferences.Editor editor = ((C0652j) gVar).f8989f;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", a);
                        ((C0652j) gVar).f8989f.apply();
                    }
                    new Bundle().putLong("app_last_background_time_ms", a);
                    ((C0652j) gVar).mo6840b();
                }
            }
            C0649g gVar2 = this.f8908b;
            int i2 = this.f8907a.f8906a;
            C0652j jVar2 = (C0652j) gVar2;
            jVar2.mo6839a();
            synchronized (jVar2.f8984a) {
                if (((C0652j) gVar2).f8998o != i2) {
                    ((C0652j) gVar2).f8998o = i2;
                    SharedPreferences.Editor editor2 = ((C0652j) gVar2).f8989f;
                    if (editor2 != null) {
                        editor2.putInt("request_in_session_count", i2);
                        ((C0652j) gVar2).f8989f.apply();
                    }
                    new Bundle().putInt("request_in_session_count", i2);
                    ((C0652j) gVar2).mo6840b();
                    return;
                }
                return;
            }
        }
        C0649g gVar3 = this.f8908b;
        C0652j jVar3 = (C0652j) gVar3;
        jVar3.mo6839a();
        synchronized (jVar3.f8984a) {
            j = ((C0652j) gVar3).f8996m;
        }
        if (a - j <= ((Long) C0371o.f8191E.mo6604a()).longValue()) {
            eVar = this.f8907a;
            C0649g gVar4 = this.f8908b;
            C0652j jVar4 = (C0652j) gVar4;
            jVar4.mo6839a();
            synchronized (jVar4.f8984a) {
                i = ((C0652j) gVar4).f8998o;
            }
        } else {
            eVar = this.f8907a;
            i = -1;
        }
        eVar.f8906a = i;
    }
}
