package com.google.android.gms.ads.play;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.play.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0874c extends aeaa {

    /* renamed from: a */
    public final C0648g f9416a;

    /* renamed from: b */
    public final Context f9417b;

    public C0874c(Context context, C0648g gVar) {
        super("admob");
        this.f9416a = gVar;
        this.f9417b = context;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bnj bnj;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.contentfilters.IContentFiltersService");
            bnj = queryLocalInterface instanceof bnj ? (bnj) queryLocalInterface : new bnj(iBinder);
        } else {
            bnj = null;
        }
        C0645d.f8973a.execute(new C0873b(this, bnj));
    }
}
