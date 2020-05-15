package com.google.android.gms.fitness.service.wearable;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableSyncMessageChimeraService extends axpp {

    /* renamed from: a */
    private zwa f32436a;

    /* renamed from: h */
    private asfb f32437h;

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        if (cdzd.f182003a.mo6606a().mo78588l()) {
            String str = zwa.m46601b(messageEventParcelable)[0];
            this.f32437h.mo49113a(str);
            try {
                this.f32436a.mo7590a(messageEventParcelable);
            } finally {
                this.f32437h.mo49122c(str);
            }
        } else {
            this.f32436a.mo7590a(messageEventParcelable);
        }
    }

    public final void onCreate() {
        super.onCreate();
        yzs a = yzq.m45107a(this);
        this.f32436a = new zwa(getApplicationContext(), a.mo30879e(), axoz.m82854b(a.mo30893l().f54853a), a.mo30886h(), a.mo30869a());
        this.f32437h = new asfb(this, 1, "WearableSyncMessageChimeraService", null, "com.google.android.gms");
    }
}
