package p000;

import android.os.Bundle;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: atzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzf implements axou {

    /* renamed from: a */
    private final atze[] f91216a;

    /* renamed from: b */
    private boolean f91217b;

    /* renamed from: c */
    private final rjx f91218c;

    public atzf(rjx rjx, atze... atzeArr) {
        this.f91218c = rjx;
        this.f91216a = atzeArr;
    }

    /* renamed from: a */
    public final void mo50327a() {
        if (!this.f91217b) {
            this.f91217b = true;
            this.f91218c.mo24722a(this, auaa.f91306a);
        }
    }

    /* renamed from: b */
    public final void mo50328b() {
        if (this.f91217b) {
            this.f91217b = false;
            this.f91218c.mo24721a((axou) this);
        }
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        Bundle a = auai.m76640a(messageEventParcelable);
        String string = a.getString("type");
        if (string != null) {
            for (atze atze : this.f91216a) {
                atze.mo50326a(string, a);
            }
        }
    }
}
