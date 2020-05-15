package com.google.android.gms.ads.internal.omid;

import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.C0634i;
import com.google.android.gms.ads.omid.C0871a;

/* renamed from: com.google.android.gms.ads.internal.omid.a */
public final /* synthetic */ class C0516a implements C0634i {

    /* renamed from: a */
    public static final C0634i f8533a = new C0516a();

    private C0516a() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, android.os.IBinder], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final Object mo6568a(Object r3) {
        if (r3 == 0) {
            return null;
        }
        IInterface queryLocalInterface = r3.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof C0871a) {
            return (C0871a) queryLocalInterface;
        }
        return new C0871a(r3);
    }
}
