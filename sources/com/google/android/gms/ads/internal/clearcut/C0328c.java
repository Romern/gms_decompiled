package com.google.android.gms.ads.internal.clearcut;

import android.os.IInterface;
import com.google.android.gms.ads.clearcut.C0231a;
import com.google.android.gms.ads.internal.util.client.C0634i;

/* renamed from: com.google.android.gms.ads.internal.clearcut.c */
final /* synthetic */ class C0328c implements C0634i {

    /* renamed from: a */
    static final C0634i f8094a = new C0328c();

    private C0328c() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, android.os.IBinder], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final Object mo6568a(Object r3) {
        if (r3 == 0) {
            return null;
        }
        IInterface queryLocalInterface = r3.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof C0231a) {
            return (C0231a) queryLocalInterface;
        }
        return new C0231a(r3);
    }
}
