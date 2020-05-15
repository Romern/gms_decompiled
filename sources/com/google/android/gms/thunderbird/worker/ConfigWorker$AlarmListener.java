package com.google.android.gms.thunderbird.worker;

import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigWorker$AlarmListener extends spb {

    /* renamed from: b */
    final /* synthetic */ auiq f109088b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigWorker$AlarmListener(auiq auiq) {
        super(auiq.mo50572bN());
        this.f109088b = auiq;
    }

    /* renamed from: a */
    public final void mo25922a() {
        boolean z;
        if (this.f109088b.f91900f == 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        if (this.f109088b.mo50564d()) {
            if (auho.m77070a()) {
                String valueOf = String.valueOf(this.f109088b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append(valueOf);
                sb.append(" maximum tracking delta expired");
                Log.d("Thunderbird", sb.toString());
            }
            this.f109088b.mo50567g();
            return;
        }
        this.f109088b.mo50566f();
    }
}
